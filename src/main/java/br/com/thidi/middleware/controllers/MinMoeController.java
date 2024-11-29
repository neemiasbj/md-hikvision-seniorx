
package br.com.thidi.middleware.controllers;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.hikvision.minmoe.models.EventRequest;
import br.com.hikvision.minmoe.models.HikvisionAccessValidatePerson;
import br.com.hikvision.minmoe.models.RemoteCheckEventResponse;
import br.com.hikvision.services.HikvisionAccessManagerService;
import br.com.hikvision.services.HikvisionMinMoeService;
import br.com.seniorx.SeniorStaticData;
import br.com.seniorx.models.Access;
import br.com.seniorx.models.AccessMessage;
import br.com.seniorx.models.AccessRequest;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.ExtensibleProperty;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.PersonValidationResponse;
import br.com.seniorx.models.ReaderDevice;
import br.com.seniorx.services.SeniorService;
import br.com.thidi.middleware.resource.CLogger;

@RestController
@RequestMapping({ "/api/hikvision/minmoe/webhook" })
public class MinMoeController {
	ObjectMapper objectMapper = new ObjectMapper();
	SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	SimpleDateFormat inputFormatLog = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
	SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	int i1 = 0;

	@PostMapping(consumes = { "multipart/form-data" })
	public ResponseEntity<String> receiveAndValidateJson(@RequestParam("event_log") String requestBody) {
		try {
			EventRequest req = (EventRequest) this.objectMapper.readValue(requestBody, EventRequest.class);
			Thread sendResponse = new Thread(() -> {
				try {

					CLogger.logHikvisionDebug("MINMOE CONTROLLER: REQUEST::: ", requestBody);

					ManagerDevice device = SeniorStaticData.getDeviceByNetworkIdentification(req.getIpAddress());

					if (device == null) {
						CLogger.logHikvisionDebug("MINMOE CONTROLLER",
								"Equipamento não encontado para o ip: " + req.getIpAddress());

						return;
					}

					HikvisionMinMoeService minmoeService = new HikvisionMinMoeService(device);
					SeniorService seniorService = new SeniorService();

					seniorService.setDevice(device);

					if (req.getAccessControllerEvent().getCardNo() == null
							&& req.getAccessControllerEvent().getEmployeeNoString() == null) {
						RemoteCheckEventResponse minmoeResponse = new RemoteCheckEventResponse(
								req.getAccessControllerEvent().getSerialNo(), "failed", "Pessoa não encontrada");

						minmoeService.sendAccessResponse(minmoeResponse);

						return;
					}

					AreaControlList areaControl = SeniorStaticData
							.getAreaControlId(seniorService.getDevice().getAreaId());

					if (areaControl == null) {
						CLogger.logHikvisionDebug("MINMOE CONTROLLER",
								"Área não encontada para o id: " + device.getAreaId());
						return;
					}

					if (req.getAccessControllerEvent().getCardNo() == null
							&& req.getAccessControllerEvent().getEmployeeNoString() == null) {
						CLogger.logHikvisionDebug("MinMoe Controller",
								"MinMoe tipo de registro não tratado para: " + requestBody);

						return;
					}

					HikvisionAccessValidatePerson person = new HikvisionAccessValidatePerson(
							req.getAccessControllerEvent().getCardNo() != null
									? req.getAccessControllerEvent().getCardNo()
									: req.getAccessControllerEvent().getEmployeeNoString(),
							req.getDateTime().substring(0, 19), req.getAccessControllerEvent().getSubEventType(),
							req.getAccessControllerEvent().getCardReaderNo());

					if (req.getAccessControllerEvent().isRemoteCheck())
						HikvisionAccessManagerService.updatePersonLastOnlineAccess(req.getIpAddress(), person);
					else {
						if (!HikvisionAccessManagerService.checkIsValidAccess(req.getIpAddress(), person))
							return;
					}

					if (req.getAccessControllerEvent().getSubEventType() == 39
							|| ((req.getAccessControllerEvent().getSubEventType() == 9
									|| req.getAccessControllerEvent().getSubEventType() == 76)
									&& req.getAccessControllerEvent().getEmployeeNoString() == null)) {
						RemoteCheckEventResponse minmoeResponse = new RemoteCheckEventResponse(
								req.getAccessControllerEvent().getSerialNo(), "failed", "Pessoa não encontrada");

						minmoeService.sendAccessResponse(minmoeResponse);

						return;
					}

					if (req.getAccessControllerEvent().getSubEventType() == 1
							|| req.getAccessControllerEvent().getSubEventType() == 9
							|| req.getAccessControllerEvent().getSubEventType() == 38
							|| req.getAccessControllerEvent().getSubEventType() == 75) {
						ReaderDevice reqReader = null;

						Long personId = Long.valueOf(0L);

						Long cardId = Long.valueOf(0L);

						Date reqDateTime = this.inputFormat.parse(req.getDateTime().substring(0, 19));

						String seniorDateTime = this.outputFormat.format(reqDateTime);

						if (req.getAccessControllerEvent().getSubEventType() == 75
								|| req.getAccessControllerEvent().getSubEventType() == 38) {
							personId = Long.valueOf(req.getAccessControllerEvent().getEmployeeNoString());
						} else if (req.getAccessControllerEvent().getSubEventType() == 1
								|| req.getAccessControllerEvent().getSubEventType() == 9) {
							cardId = Long.valueOf(req.getAccessControllerEvent().getCardNo());
						}

						for (ReaderDevice reader : device.getReader()) {
							if ((req.getAccessControllerEvent().getSubEventType() == 9
									|| req.getAccessControllerEvent().getSubEventType() == 1)
									&& reader.getReaderTechnology() == ReaderDevice.ReaderTechnologyEnum.SMART_CARD) {
								for (ExtensibleProperty extConf : reader.getExtensibleConfiguration()
										.getExtensiblePropertyList()) {
									if (extConf.getKey().equals("cardReaderNo") && req.getAccessControllerEvent()
											.getCardReaderNo().toString().equals(extConf.getValue())) {
										reqReader = reader;
									}
								}

								continue;
							}

							if (req.getAccessControllerEvent().getSubEventType() == 75 && reader
									.getBiometricManufacturer() == ReaderDevice.BiometricManufacturerEnum.FACIAL) {
								for (ExtensibleProperty extConf : reader.getExtensibleConfiguration()
										.getExtensiblePropertyList()) {
									if (extConf.getKey().equals("cardReaderNo") && req.getAccessControllerEvent()
											.getCardReaderNo().toString().equals(extConf.getValue())) {
										reqReader = reader;
									}
								}

								continue;
							}

							if (req.getAccessControllerEvent().getSubEventType() == 38 && reader
									.getBiometricManufacturer() == ReaderDevice.BiometricManufacturerEnum.FINGERPRINT_SAGEM) {
								for (ExtensibleProperty extConf : reader.getExtensibleConfiguration()
										.getExtensiblePropertyList()) {
									if (extConf.getKey().equals("cardReaderNo") && req.getAccessControllerEvent()
											.getCardReaderNo().toString().equals(extConf.getValue())) {
										reqReader = reader;
									}
								}
							}
						}

						AccessRequest seniorAccessRquest = new AccessRequest();

						if (cardId.longValue() != 0L) {
							seniorAccessRquest.setCardId(cardId);
						} else {
							seniorAccessRquest.setPersonId(personId);
						}

						seniorAccessRquest.setReaderId(reqReader.getId());

						seniorAccessRquest.setRequestDateTime(seniorDateTime);

						CLogger.logSeniorInfo("Senior Access Request: ", seniorAccessRquest.toString());

						PersonValidationResponse seniorResponse = SeniorService
								.validateOnlineAccess(seniorAccessRquest);

						CLogger.logSeniorDebug("Senior Access Response: ", seniorResponse.toString());

						String status = (seniorResponse
								.getAccessType() == PersonValidationResponse.AccessTypeEnum.ACCESS_VALID) ? "success"
										: "failed";

						String info = "";

						for (AccessMessage message : device.getAccessMessage()) {
							if (seniorResponse.getAccessType().getValue() == message.getAccessType().getValue()) {
								info = message.getMessage();
							}
						}

						RemoteCheckEventResponse minmoeResponse = new RemoteCheckEventResponse(
								req.getAccessControllerEvent().getSerialNo(), status, info);

						minmoeService.sendAccessResponse(minmoeResponse);

						Date accessDate = this.inputFormat.parse(req.getDateTime());

						Calendar calendar = Calendar.getInstance();

						calendar.setTime(accessDate);

						calendar.add(12, -areaControl.getGmt().intValue());

						Access seniorAccess = new Access();

						seniorAccess.setAccessDirection(reqReader.getReaderDirection().getValue().equals("BOTH")
								? Access.AccessDirectionEnum.UNKNOWN
								: Access.AccessDirectionEnum.valueOf(reqReader.getReaderDirection().getValue()));

						seniorAccess.setAccessType(
								Access.AccessTypeEnum.valueOf(seniorResponse.getAccessType().getValue()));
						seniorAccess.setCardId(Long.valueOf(0L));
						seniorAccess.setDate(this.outputFormat.format(calendar.getTime()));
						seniorAccess.setDeviceId(reqReader.getId());
						seniorAccess.setStatus(req.getAccessControllerEvent().isRemoteCheck() ? Access.StatusEnum.ONLINE
								: Access.StatusEnum.OFFLINE);
						seniorAccess.setTimezoneOffset(areaControl.getGmt());
						seniorAccess.setCreditRange(Integer.valueOf(0));
						if (cardId.longValue() != 0L) {
							seniorAccess.setCardId(cardId);
						} else {
							seniorAccess.setPersonId(personId);
						}
						List<Access> personAccesses = new ArrayList<>();
						personAccesses.add(seniorAccess);
						SeniorService.notifyPersonAccess(personAccesses);
					}
				} catch (Exception e) {
					e.printStackTrace();
					CLogger.logHikvisionError("MINMOE CONTROLLER", "ERROR", e);
				}
			});
			sendResponse.setName("HIKVISION ACCESS VALIDATION: " + req.getIpAddress());
			sendResponse.start();

			HttpHeaders headers = new HttpHeaders();
			headers.set("Connection", "close");
			return new ResponseEntity((MultiValueMap) headers, (HttpStatusCode) HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			CLogger.logHikvisionError("MINMOE CONTROLLER", "ERROR", e);
			return new ResponseEntity(e.getMessage(), (HttpStatusCode) HttpStatus.BAD_REQUEST);
		}
	}
}
