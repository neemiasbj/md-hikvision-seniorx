package br.com.thidi.middleware.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.hikvision.minmoe.models.EmployeeCard;
import br.com.hikvision.minmoe.models.EventRequest;
import br.com.hikvision.minmoe.models.RemoteCheckEventResponse;
import br.com.hikvision.services.HikvisionEmployeeCardManager;
import br.com.hikvision.services.HikvisionMinMoeService;
import br.com.seniorx.ManagerDeviceList;
import br.com.seniorx.models.Access;
import br.com.seniorx.models.Access.AccessDirectionEnum;
import br.com.seniorx.models.Access.StatusEnum;
import br.com.seniorx.models.AccessMessage;
import br.com.seniorx.models.AccessRequest;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.ExtensibleProperty;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.PersonValidationResponse;
import br.com.seniorx.models.PersonValidationResponse.AccessTypeEnum;
import br.com.seniorx.models.ReaderDevice;
import br.com.seniorx.models.ReaderDevice.BiometricManufacturerEnum;
import br.com.seniorx.models.ReaderDevice.ReaderTechnologyEnum;
import br.com.seniorx.services.SeniorApiService;
import br.com.thidi.middleware.resource.CLogger;

@RestController
@RequestMapping("/api/hikvision/minmoe/webhook")
public class MinMoeController {

	ObjectMapper objectMapper = new ObjectMapper();
	SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

	@PostMapping(consumes = "multipart/form-data")
	public ResponseEntity<RemoteCheckEventResponse> receiveAndValidateJson(
			@RequestParam("event_log") String requestBody) {
		try {
			System.out.println("\n\n\n\n");
			EventRequest req = objectMapper.readValue(requestBody, EventRequest.class);
			CLogger.logHikivisionDebug("MINMOE REQUEST::: ", req.toString());
			System.out.println("MINMOE REQUEST::: " + requestBody);

			EmployeeCard empCard = new EmployeeCard(req.getAccessControllerEvent().getEmployeeNoString(),
					req.getAccessControllerEvent().getCardNo(),
					LocalDateTime.parse(req.getDateTime().substring(0, 19), formatter));

			if (req.getAccessControllerEvent().getCardNo() == null
					&& req.getAccessControllerEvent().getEmployeeNoString() == null) {
				CLogger.logHikivisionDebug("MinMoe Controller",
						"MinMoe tipo de registro não tratado para: " + requestBody);
				return ResponseEntity.ok(null);
			} else {
				if (empCard.getCardId() != null
						&& HikvisionEmployeeCardManager.hasRegisterByCardIdUnderFiveSeconds(empCard)) {
					CLogger.logHikivisionInfo("MinMoe Controller",
							"Registro já encontrado nos últimos 5 segundos para cardNo: " + empCard.toString());
					return ResponseEntity.ok(null);
				} else if (empCard.getEmployeeId() != null && empCard.getCardId() == null
						&& HikvisionEmployeeCardManager.hasRegisterByEmployeeIdUnderFiveSeconds(empCard)) {
					CLogger.logHikivisionInfo("MinMoe Controller",
							"Registro já encontrado nos últimos 5 segundos para employeeNo: " + empCard.toString());
					return ResponseEntity.ok(null);
				}
			}

			ManagerDevice device = ManagerDeviceList.getDeviceByNetworkIdentification(req.getIpAddress());
			SeniorApiService seniorService = new SeniorApiService();
			seniorService.setDevice(device);
			AreaControlList area = seniorService.getAreaById(device.getAreaId());

			if (device != null && area != null) {
				HikvisionMinMoeService minmoeService = new HikvisionMinMoeService(device);

				if (req.getAccessControllerEvent().getSubEventType() == 39
						|| ((req.getAccessControllerEvent().getSubEventType() == 9
								|| req.getAccessControllerEvent().getSubEventType() == 76)
								&& req.getAccessControllerEvent().getEmployeeNoString() == null)) {
					RemoteCheckEventResponse minmoeResponse = new RemoteCheckEventResponse(
							req.getAccessControllerEvent().getSerialNo(), "failed", "Pessoa não encontrada");
					minmoeService.sendAccessResponse(minmoeResponse);
					return ResponseEntity.ok(null);
				}

				if (req.getAccessControllerEvent().getSubEventType() == 1
						|| req.getAccessControllerEvent().getSubEventType() == 9
						|| req.getAccessControllerEvent().getSubEventType() == 38
						|| req.getAccessControllerEvent().getSubEventType() == 75) {
					Thread sendResponse = new Thread(() -> {
						try {
							ReaderDevice reqReader = null;
							Long personId = (long) 0;
							Long cardId = (long) 0;
							Date reqDateTime = inputFormat.parse(req.getDateTime().substring(0, 19));
							String seniorDateTime = outputFormat.format(reqDateTime);

							if (req.getAccessControllerEvent().getSubEventType() == 75
									|| req.getAccessControllerEvent().getSubEventType() == 38)
								personId = Long.valueOf(req.getAccessControllerEvent().getEmployeeNoString());
							else if (req.getAccessControllerEvent().getSubEventType() == 1
									|| req.getAccessControllerEvent().getSubEventType() == 9)
								cardId = Long.valueOf(req.getAccessControllerEvent().getCardNo());

							for (ReaderDevice reader : device.getReader()) {
								if ((req.getAccessControllerEvent().getSubEventType() == 9
										|| req.getAccessControllerEvent().getSubEventType() == 1)
										&& reader.getReaderTechnology() == ReaderTechnologyEnum.SMART_CARD) {
									for (ExtensibleProperty extConf : reader.getExtensibleConfiguration()
											.getExtensiblePropertyList()) {
										if (extConf.getKey().equals("cardReaderNo") && req.getAccessControllerEvent()
												.getCardReaderNo().toString().equals(extConf.getValue())) {
											reqReader = reader;
										}
									}
								} else if (req.getAccessControllerEvent().getSubEventType() == 75
										&& reader.getBiometricManufacturer() == BiometricManufacturerEnum.FACIAL)
									for (ExtensibleProperty extConf : reader.getExtensibleConfiguration()
											.getExtensiblePropertyList()) {
										if (extConf.getKey().equals("cardReaderNo") && req.getAccessControllerEvent()
												.getCardReaderNo().toString().equals(extConf.getValue())) {
											reqReader = reader;
										}
									}
								else if (req.getAccessControllerEvent().getSubEventType() == 38 && reader
										.getBiometricManufacturer() == BiometricManufacturerEnum.FINGERPRINT_SAGEM)
									for (ExtensibleProperty extConf : reader.getExtensibleConfiguration()
											.getExtensiblePropertyList()) {
										if (extConf.getKey().equals("cardReaderNo") && req.getAccessControllerEvent()
												.getCardReaderNo().toString().equals(extConf.getValue())) {
											reqReader = reader;
										}
									}
							}

							AccessRequest seniorAccessRquest = new AccessRequest();
							if (cardId != 0)
								seniorAccessRquest.setCardId(cardId);
							else
								seniorAccessRquest.setPersonId(personId);
							seniorAccessRquest.setReaderId(reqReader.getId());
							seniorAccessRquest.setRequestDateTime(seniorDateTime);
//							CLogger.logSeniorInfo("Senior Access Request: ", seniorAccessRquest.toString());

							PersonValidationResponse seniorResponse = SeniorApiService
									.validateOnlineAccess(seniorAccessRquest);

							CLogger.logSeniorDebug("Senior Access Response: ", seniorResponse.toString());

							String status = seniorResponse.getAccessType() == AccessTypeEnum.ACCESS_VALID ? "success"
									: "failed";
							String info = "";

							for (AccessMessage message : device.getAccessMessage()) {
								if (seniorResponse.getAccessType().getValue() == message.getAccessType().getValue())
									info = message.getMessage();
							}

							RemoteCheckEventResponse minmoeResponse = new RemoteCheckEventResponse(
									req.getAccessControllerEvent().getSerialNo(), status, info);
							minmoeService.sendAccessResponse(minmoeResponse);

							Date accessDate = inputFormat.parse(req.getDateTime());
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(accessDate);
							calendar.add(Calendar.MINUTE, -area.getGmt());

							Access seniorAccess = new Access();
							seniorAccess.setAccessDirection(
									AccessDirectionEnum.valueOf(reqReader.getReaderDirection().getValue()));
							seniorAccess.setAccessType(br.com.seniorx.models.Access.AccessTypeEnum
									.valueOf(seniorResponse.getAccessType().getValue()));
							seniorAccess.setCardId((long) 0);
							seniorAccess.setDate(outputFormat.format(calendar.getTime()));
							seniorAccess.setDeviceId(reqReader.getId());
							seniorAccess.setStatus(
									req.getAccessControllerEvent().isRemoteCheck() == false ? StatusEnum.OFFLINE
											: StatusEnum.ONLINE);
							seniorAccess.setTimezoneOffset(area.getGmt());
							seniorAccess.setCreditRange(0);
							if (cardId != 0)
								seniorAccess.setCardId(cardId);
							else
								seniorAccess.setPersonId(personId);

							List<Access> personAccesses = new ArrayList<Access>();
							personAccesses.add(seniorAccess);

							SeniorApiService.notifyPersonAccess(personAccesses);
						} catch (Exception e) {
							e.printStackTrace();
						}
					});
					sendResponse.start();
				}
			}
			return ResponseEntity.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(null);
		}
	}

}
