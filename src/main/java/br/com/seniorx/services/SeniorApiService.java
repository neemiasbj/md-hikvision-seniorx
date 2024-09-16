package br.com.seniorx.services;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

import br.com.seniorx.models.AllPendency;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.Event;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.PendencyExecuted;
import br.com.seniorx.models.PendencyUpdated;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.resource.Utils;
import br.com.thidi.middleware.utils.UtilPropertiesImpl;

public class SeniorApiService {

	private ManagerDevice device = null;
	private Gson gson = new GsonBuilder().registerTypeAdapter(OffsetDateTime.class, (JsonDeserializer<OffsetDateTime>) (json, type, context) -> OffsetDateTime.parse(json.getAsString())).create();;

	private static String seniorPartnerKey = UtilPropertiesImpl.getValor("senior.partner_key");
	private static String seniorDriverKey = UtilPropertiesImpl.getValor("senior.driver_key");
	private static String seniorEndpoint = UtilPropertiesImpl.getValor("senior.api.sdk.uri");

	private static String uriDevice = String.format("%s/device", seniorEndpoint);
	private static String uriDevices = String.format("%s/device/", seniorEndpoint);
	private static String uriAreaControl = String.format("%s/datamart/areacontrol", seniorEndpoint);
	private static String uriNotifyDeviceEvent = String.format("%s/notify/device/event", seniorEndpoint);
	private static String uriDevicePendencies = String.format("%s/pendency/device", seniorEndpoint);
	private static String uriResponsePendencyUpdate = String.format("%s/pendency/update", seniorEndpoint);
	private static String uriResponsePendencySuccess = String.format("%s/pendency/success", seniorEndpoint);
	private static String uriDeviceStatus = String.format("%s/device/status", seniorEndpoint);
	private static String uriAccessRequest = String.format("%s/device/accessrequest", seniorEndpoint);
	private static String uriClockIn = String.format("%s/notify/person/clockin", seniorEndpoint);
	private static String uriDriveDateTime = String.format("%s/driver/datetime", seniorEndpoint);
	private static String uriDeviceBiometry = String.format("%s/device/biometry", seniorEndpoint);
	private static String uriDatamartPersonInfo = String.format("%s/datamart/person/info", seniorEndpoint);
	private static String uriDataMartAreaControl = String.format("%s/datamart/areacontrol", seniorEndpoint);
	private static String uriResponseNotifyPersonAccess = String.format("%s/notify/person/access", seniorEndpoint);

	private static final RestTemplate restTemplate = getRestTemplate();
	private static final HttpHeaders httpHeaderSenior = getHeaders();

	public ManagerDevice getDevice() {
		return device;
	}

	public void setDevice(ManagerDevice device) {
		this.device = device;
	}

	private static RestTemplate getRestTemplate() {
		Integer timeWaitingRestTemplate = Integer.valueOf(UtilPropertiesImpl.getValor("senior.api.sdk.timeout"));
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(timeWaitingRestTemplate);

		return new RestTemplate(clientHttpRequestFactory);
	}

	public static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("partner_key", seniorPartnerKey);
		headers.add("driver_key", seniorDriverKey);
		return headers;
	}

//	public void sendAllDevice() {
////		Log.logSeniorInfo("Send All Device", "Searching for devices...");
//
//		HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
//
//		try {
//			if (urlDevice != null) {
//				List<ManagerDevice> managerDevice = restTemplate.exchange(urlDevice, HttpMethod.GET, entity, new ParameterizedTypeReference<List<ManagerDevice>>() {
//				}).getBody();
//				if (managerDevice != null && !managerDevice.isEmpty()) {
//					for (ManagerDevice seniorDevice : managerDevice) {
//						String deviceIdFromResponse = String.valueOf(seniorDevice.getId());
////						ManagerDevice device = new ManagerDevice();
////						device.setId(seniorDevice.getId());
////						device.setDeviceIpAddress(seniorDevice.getNetworkIdentification());
////						device.setDeviceArea(seniorDevice.getAreaId().toString());
////						mapManager.sendCachedDevices(deviceIdFromResponse, device);
//						CLogger.logSeniorInfo("Send All Device", "Device to cached data for ID:  " + Utils.padStart(seniorDevice.getId().toString(), 10, '0') + " * Network: " + seniorDevice.getNetworkIdentification());
//					}
//					if (checkKeepAlive == false) {
////						deviceKeepAlive.startProcess();
//						checkKeepAlive = true;
//					}
//				}
//			} else {
//				CLogger.logSeniorInfo("Send All Device", "urlDevice is null.");
//			}
//		} catch (Exception e) {
//			CLogger.logSeniorError("Send All Device", "Senior - Error when executing the mapping of registered equipment", e);
//		}
//
//	}

	private boolean checkDevice(String method) {
		if (device == null) {
			CLogger.logSeniorDebug("SENIOR SERVICE", "Device must not be null to use " + method);
			return false;
		}
		return true;
	}

	public static List<ManagerDevice> getDevices() {
		try {
			HttpHeaders header = httpHeaderSenior;
			header.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<ManagerDevice>> response = restTemplate.exchange(uriDevices, HttpMethod.GET, entity, new ParameterizedTypeReference<List<ManagerDevice>>() {
			});

			List<ManagerDevice> devices = response.getBody();
			if (devices == null || devices.isEmpty()) {
				CLogger.logSeniorError("Senior", "No devices found on Senior!");
				return null;
			}

			else
				return devices;

		} catch (Exception e) {
			CLogger.logSeniorError("Status Event All Device", "Data sent to the platform. Error Equipment List", e);
			return null;
		}
	}

	public static ManagerDevice getDevice(Long deviceId) {

		try {
			HttpHeaders header = httpHeaderSenior;
			header.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<ManagerDevice> response = restTemplate.exchange(uriDevice + "/" + deviceId, HttpMethod.GET, entity, new ParameterizedTypeReference<ManagerDevice>() {
			});

			return response.getBody();

		} catch (Exception e) {
			CLogger.logSeniorError("SENIOR SERVICE", "getDevice", e);
			return null;
		}
	}

	public AllPendency getDevicePendencies(Long deviceId) {
		if (!checkDevice("getDevicePendencies"))
			return null;

		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<String> response = restTemplate.exchange(uriDevicePendencies + "/" + deviceId, HttpMethod.GET, entity, String.class);
			AllPendency allPendencies = gson.fromJson(response.getBody(), AllPendency.class);
			return allPendencies;
		} catch (Exception e) {
			CLogger.logSeniorError("SENIOR SERVICE", "getDevice", e);
			return null;
		}
	}

	public AreaControlList getAreaById(Long areaId) {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<AreaControlList>> response = restTemplate.exchange(uriAreaControl, HttpMethod.GET, entity, new ParameterizedTypeReference<List<AreaControlList>>() {
			});

			List<AreaControlList> areasControl = response.getBody();
			if (areasControl == null || areasControl.isEmpty()) {
				CLogger.logSeniorError("Senior", "No area control found for " + areaId);
				return null;
			}

			for (AreaControlList areaControl : areasControl)
				if (areaControl.getId() == areaId)
					return areaControl;
			return null;
		} catch (Exception e) {
			CLogger.logSeniorError("GET AREA BY ID: " + areaId, "getDevice", e);
			return null;
		}
	}

//	public void handleDeviceDateTime(WebSocketModelResponse message) {
//		try {
//
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			Log.logSeniorInfo("Handle Device Date Time", message.toString());
//
//			HttpEntity<String> entityHeader = new HttpEntity<String>(httpHeaderSenior);
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			ManagerDevice managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			AllPendency allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//			DriverDateTime dateTimeBody = null;
//
//			if (managerDeviceBody != null) {
//				Log.logSeniorInfo("Handle Device Date Time",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<DevicePendency> devicePendencyDateTime = (allPendencyBody != null
//						&& allPendencyBody.getDeviceDateTime() != null) ? allPendencyBody.getDeviceDateTime()
//								: new ArrayList<>();
//
//				for (DevicePendency pendencyHandler : devicePendencyDateTime) {
//					if (MapManager.searchKey(pendencyHandler.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Device Date Time",
//								"Pending completed, awaiting device return!");
//
//					} else {
//
//						try {
//							dateTimeBody = restTemplate.exchange(UtilsUrlService.urlSeniorDriveDateTime, HttpMethod.GET,
//									entityHeader, DriverDateTime.class).getBody();
//
//							if (dateTimeBody != null) {
//								Log.logSeniorInfo("Handle Device Date Time",
//										"Date and time without GMT found: " + dateTimeBody.getDateTime());
//
//								List<AreaControlList> areaControlList = restTemplate
//										.exchange(UtilsUrlService.urlDataMartAreaControl, HttpMethod.GET, entityHeader,
//												new ParameterizedTypeReference<List<AreaControlList>>() {
//												})
//										.getBody();
//
//								if (areaControlList != null && !areaControlList.isEmpty()) {
//									AreaControlList areaControl = areaControlList.stream().filter(
//											listControl -> listControl.getId().equals(managerDeviceBody.getAreaId()))
//											.findFirst().orElse(null);
//
//									if (areaControl != null) {
////										ZoneOffset offsetGMT = ZoneOffset.ofHours(areaControl.getGmt() / 60);
////
////										OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeBody.getDateTime(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
////										OffsetDateTime offsetDateTimeGMT = offsetDateTime.withOffsetSameInstant(offsetGMT);
////										String formattedDateTime = offsetDateTimeGMT.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
//										String dateTimeAddGmt = Utils.addGmtToDateTime(dateTimeBody.getDateTime(),
//												areaControl.getGmt());
//										ConexDateTimeModel dateTimeModel = new ConexDateTimeModel();
//										dateTimeModel.setDateTime(dateTimeAddGmt);
//										Log.logSeniorInfo("Handle Device Date Time",
//												"Date and time with GMT: " + dateTimeAddGmt);
//										dateTimeModel.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//
//										HttpEntity<ConexDateTimeModel> requestEntity = new HttpEntity<>(dateTimeModel);
//										ApiDeviceGenericModel apiDeviceGenericModel = restTemplate.postForObject(
//												UtilsUrlService.urlConexDriveDateTime, requestEntity,
//												ApiDeviceGenericModel.class);
//
//										if (apiDeviceGenericModel.getError() == false) {
//											MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//													apiDeviceGenericModel.getPendencyId(),
//													pendencyHandler.getPendencyId());
//											Log.logSeniorInfo("Handle Device Date Time",
//													"Device Pendency id return: "
//															+ apiDeviceGenericModel.getPendencyId() + " and "
//															+ pendencyHandler.getPendencyId());
//										} else {
//											Log.logSeniorError("Handle Device Date Time",
//													"Error receiving Date Time return message!");
//											sendPendencyUpdate(pendencyHandler.getPendencyId(), 343,
//													OperationEnum.KEEP_PENDENCY);
//										}
//									} else {
//										Log.logSeniorError("Handle Device Date Time",
//												"AreaControl not found for manager device.");
//										sendPendencyUpdate(pendencyHandler.getPendencyId(), 343,
//												OperationEnum.KEEP_PENDENCY);
//									}
//								} else {
//									Log.logSeniorError("Handle Device Date Time",
//											"Received empty or null Area Control List!");
//									sendPendencyUpdate(pendencyHandler.getPendencyId(), 343,
//											OperationEnum.KEEP_PENDENCY);
//								}
//							} else {
//								Log.logSeniorError("Handle Device Date Time", "DriverDateTime body is null.");
//								sendPendencyUpdate(pendencyHandler.getPendencyId(), 343, OperationEnum.KEEP_PENDENCY);
//							}
//						} catch (DateTimeParseException e) {
//							Log.logSeniorError("Handle Device Date Time", "Error Date Time", e);
//							sendPendencyUpdate(pendencyHandler.getPendencyId(), 344, OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Device Date Time", "ManagerDevice body is null.");
//			}
//		} catch (Exception e) {
//			Log.logSeniorError("Handle Device Date Time", "Error Date Time", e);
//		}
//	}
//
//	// TODO OK - Function with built structure
//
	public void sendEventList(List<Event> events) {
		try {
			CLogger.logSeniorDebug("SENDING DEVICE EVENT", Utils.listToJson(events));

			HttpEntity<List<Event>> entity = new HttpEntity<>(events, httpHeaderSenior);
			restTemplate.postForObject(uriNotifyDeviceEvent, entity, String.class);
			CLogger.logSeniorDebug("SENDING DEVICE EVENT", "SUCCESS");

		} catch (Exception e) {
			CLogger.logSeniorError("SENDING DEVICE EVENT", "ERROR", e);
		}
	}

	public void updatePendenciesExecuted(List<PendencyExecuted> pendenciesList) {
		try {
			HttpEntity<List<PendencyExecuted>> entity = new HttpEntity<List<PendencyExecuted>>(pendenciesList, httpHeaderSenior);
			restTemplate.exchange(uriResponsePendencySuccess, HttpMethod.POST, entity, String.class);
			CLogger.logSeniorDebug("UPDATE EXECUTED", "OK: " + gson.toJson(pendenciesList));
		} catch (Exception e) {
			CLogger.logSeniorError("UPDATE EXECUTED", "ERROR", e);
		}
	}

	public void updatePendenciesStatus(List<PendencyUpdated> pendenciesList) {

		try {
			HttpEntity<List<PendencyUpdated>> entity = new HttpEntity<List<PendencyUpdated>>(pendenciesList, httpHeaderSenior);
			restTemplate.exchange(uriResponsePendencyUpdate, HttpMethod.POST, entity, String.class);
			CLogger.logSeniorDebug("UPDATE PENDENCY", "OK: " + gson.toJson(pendenciesList));
		} catch (Exception e) {
			CLogger.logSeniorError("UPDATE PENDENCY", "ERROR", e);
		}

	}
//
//	// TODO Function with built structure - Test with the equipment
//
//	public void handleDevice(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Device", "Message received at Device: " + message);
//
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			Log.logSeniorInfo("Handle Device", message.toString());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null) {
//				Log.logSeniorInfo("Handle Device",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<DeviceUpdatedPendency> devicePendencyList = new ArrayList<DeviceUpdatedPendency>();
//				for (DeviceUpdatedPendency pendency : allPendencyBody.getDevice()) {
//					Log.logSeniorInfo("Handle Device", "Pendency found: " + pendency);
//					devicePendencyList.add(pendency);
//				}
//
//				if (!devicePendencyList.isEmpty()) {
//					DeviceUpdatedPendency deviceConfigPendency = devicePendencyList.stream()
//							.filter(p -> p.getManagerDeviceId().equals(managerDeviceBody.getId())).findFirst()
//							.orElse(null);
//
//					if (deviceConfigPendency == null) {
//						Log.logSeniorInfo("Handle Device", "Device config pendency not found.");
//					} else if (MapManager.searchKey(deviceConfigPendency.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Device", "Pending completed, awaiting device return!");
//					} else {
//
//						if (deviceConfigPendency.getOperation() == OperationUpdateDeviceEnum.DEVICE_CONFIG) {
//							try {
//
//								if (managerDeviceBody.getRepConfiguration() != null) {
//
//									RepConfiguration repConfig = managerDeviceBody.getRepConfiguration();
//									ExtensibleConfiguration extensible = managerDeviceBody.getExtensibleConfiguration();
//									List<ExtensibleProperty> listPropertyExtensible = extensible
//											.getExtensiblePropertyList();
//									ExtensibleProperty filteProperty = listPropertyExtensible.stream()
//											.filter(property -> "CPF".equals(property.getKey())).findFirst()
//											.orElse(null);
//
//									ConexEmployeerModel employeerModel = new ConexEmployeerModel();
//									employeerModel.setName(repConfig.getCompanyName());
//									employeerModel.setAddress(repConfig.getAddress());
//									employeerModel.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//									employeerModel.setCei(repConfig.getCei() == null ? "" : repConfig.getCei());
//									employeerModel.setResponsibleCpf(
//											filteProperty.getValue() == null ? "" : filteProperty.getValue());
//									if (repConfig.getCnpj() == null) {
//										employeerModel.setDocType(DocTypeEnum.CPF);
//										employeerModel
//												.setDoc(repConfig.getCpf() == null ? "00000000" : repConfig.getCpf());
//									} else if (repConfig.getCnpj() != null) {
//										employeerModel.setDocType(DocTypeEnum.CNPJ);
//										employeerModel
//												.setDoc(repConfig.getCnpj() == null ? "00000000" : repConfig.getCnpj());
//									}
//
//									HttpEntity<ConexEmployeerModel> entityEmployeesList = new HttpEntity<>(
//											employeerModel);
//									try {
//
//										ApiDeviceGenericModel apiDeviceGeneric = restTemplate.postForObject(
//												UtilsUrlService.urlConexSetEmployeer, entityEmployeesList,
//												ApiDeviceGenericModel.class);
//
//										if (apiDeviceGeneric.getError() == false) {
//											MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//													apiDeviceGeneric.getPendencyId(),
//													deviceConfigPendency.getPendencyId());
//											Log.logSeniorInfo("Handle Device",
//													"Device Pendency id return: " + apiDeviceGeneric.getPendencyId()
//															+ " and " + deviceConfigPendency.getPendencyId());
//										} else {
//											Log.logSeniorInfo("Handle Device",
//													"Error pending response from the equipment.");
//											sendPendencyUpdate(deviceConfigPendency.getPendencyId(), 343,
//													OperationEnum.KEEP_PENDENCY);
//											Log.logSeniorError("Handle Device",
//													"Error identifying the type of load, Device:"
//															+ message.getDeviceId() + ", Pendency: "
//															+ message.getPendencyType());
//
//										}
//									} catch (Exception e) {
//										Log.logSeniorError("Handle Device", "Error in request for equipment.",
//												e);
//										sendPendencyUpdate(deviceConfigPendency.getPendencyId(), 344,
//												OperationEnum.KEEP_PENDENCY);
//									}
//
//								} else {
//									sendAllDevice();
//									ApiPendencyModel apiPendency = new ApiPendencyModel(managerDeviceBody.getId(),
//											deviceConfigPendency.getPendencyId(), null);
//									WebhookPendencyModel webhookPendency = new WebhookPendencyModel();
//									webhookPendency.setStatusPendency(ResponseStatusEnum.UP);
//									webhookPendency.setPendency(apiPendency);
//									WebhookService.addItemToQueue(webhookPendency);
//								}
//
//								sendPendencyUpdate(deviceConfigPendency.getPendencyId(), 343,
//										OperationEnum.REMOVE_PENDENCY);
//							} catch (Exception e) {
//								Log.logSeniorError("Handle Device",
//										"Error occurred during processing: " + e.getMessage());
//								sendPendencyUpdate(deviceConfigPendency.getPendencyId(), 345,
//										OperationEnum.KEEP_PENDENCY);
//							}
//						} else {
//
//							sendAllDevice();
//
//							ApiPendencyModel apiPendency = new ApiPendencyModel(managerDeviceBody.getId(),
//									deviceConfigPendency.getPendencyId(), null);
//							WebhookPendencyModel webhookPendency = new WebhookPendencyModel();
//							webhookPendency.setStatusPendency(ResponseStatusEnum.UP);
//							webhookPendency.setPendency(apiPendency);
//							WebhookService.addItemToQueue(webhookPendency);
//						}
//
//					}
//				} else {
//					Log.logSeniorError("Handle Device",
//							"Pending list is empty! Data received: " + devicePendencyList.toString());
//				}
//			}
//		} catch (Exception e) {
//			Log.logSeniorError("Handle Device", "Error Device", e);
//		}
//	}
//
//	// TODO Function with built structure - Test with the equipment
//
//	public void handleSetDeviceEmergency(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Device Set Emergency", "Message received at DeviceEmergency: " + message);
//
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			Log.logSeniorInfo("Handle Device Set Emergency", message.toString());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null && allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Device Set Emergency",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<SetDeviceEmergencyPendency> devicePendencySetEmergency = Optional
//						.ofNullable(allPendencyBody.getSetDeviceEmergency()).orElse(Collections.emptyList());
//
//				SetDeviceEmergencyPendency deviceEmergency = devicePendencySetEmergency.stream()
//						.filter(p -> p.getManagerDeviceId().equals(managerDeviceBody.getId())).findFirst().orElse(null);
//
//				if (deviceEmergency == null) {
//					Log.logSeniorInfo("Handle Device Set Emergency", "Device pendency emergency not found!");
//				} else if (MapManager.searchKey(deviceEmergency.getPendencyId()) != null) {
//					Log.logSeniorInfo("Handle Device Set Emergency",
//							"Pending completed, awaiting device return!");
//				} else {
//					ApiDeviceRequestModel deviceIP = new ApiDeviceRequestModel();
//					deviceIP.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//
//					HttpEntity<ApiDeviceRequestModel> conexSetEmergency = new HttpEntity<ApiDeviceRequestModel>(
//							deviceIP);
//
//					try {
//						Log.logSeniorInfo("Handle Device Set Emergency",
//								"Senior response: " + conexSetEmergency.getBody());
//						ApiDeviceGenericModel apiDeviceGeneric = restTemplate.postForObject(
//								UtilsUrlService.urlConexSetEmergency, conexSetEmergency, ApiDeviceGenericModel.class);
//						if (apiDeviceGeneric.getError() == false) {
//							MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//									apiDeviceGeneric.getPendencyId(), deviceEmergency.getPendencyId());
//							Log.logSeniorInfo("Handle Device Set Emergency", "Results: " + deviceEmergency);
//						} else {
//							Log.logSeniorError("Handle Device Set Emergency",
//									"Error receiving Set Emergency return message!");
//							sendPendencyUpdate(deviceEmergency.getPendencyId(), 343, OperationEnum.KEEP_PENDENCY);
//						}
//
//					} catch (Exception e) {
//						Log.logSeniorError("Handle Device Set Emergency", "Error in request for equipment", e);
//						sendPendencyUpdate(deviceEmergency.getPendencyId(), 344, OperationEnum.KEEP_PENDENCY);
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Device Set Emergency", "Pending list is empty! Data received: ");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Device Set Emergency", "Exception occurred", ex);
//		}
//	}
//
//	// TODO - Test with the equipment
//
//	public void handleUnsetDeviceEmergency(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Device Unset Emergency",
//				"Message received at UnsetDeviceEmergency: " + message);
//
//		String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//		;
//		String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//		Log.logSeniorInfo("Handle Device Unset Emergency", message.toString());
//		try {
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null && allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Device Unset Emergency",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<UnsetDeviceEmergencyPendency> unsetEmergencyDevicePendency = new ArrayList<UnsetDeviceEmergencyPendency>();
//				for (UnsetDeviceEmergencyPendency pendency : allPendencyBody.getUnsetDeviceEmergency()) {
//					Log.logSeniorInfo("Handle Device Unset Emergency", "Pendency found: " + pendency);
//					unsetEmergencyDevicePendency.add(pendency);
//				}
//
//				if (!unsetEmergencyDevicePendency.isEmpty()) {
//					UnsetDeviceEmergencyPendency deviceUnsetEmergency = unsetEmergencyDevicePendency.stream()
//							.filter(pendency -> pendency.getManagerDeviceId().equals(managerDeviceBody.getId()))
//							.findFirst().orElse(null);
//
//					if (deviceUnsetEmergency == null) {
//						Log.logSeniorInfo("Handle Device Unset Emergency", "Device unset emergency not found!");
//					} else if (MapManager.searchKey(deviceUnsetEmergency.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Device Unset Emergency",
//								"Pending completed, awaiting device return!"
//										+ MapManager.searchKey(deviceUnsetEmergency.getPendencyId()));
//					} else {
//						ApiDeviceRequestModel deviceIP = new ApiDeviceRequestModel();
//						deviceIP.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//
//						HttpEntity<ApiDeviceRequestModel> conexUnsetEmergency = new HttpEntity<ApiDeviceRequestModel>(
//								deviceIP);
//						try {
//							Log.logSeniorInfo("Handle Device Unset Emergency",
//									"Senior response: " + conexUnsetEmergency.getBody());
//							ApiDeviceGenericModel apiDeviceGeneric = restTemplate.postForObject(
//									UtilsUrlService.urlConexUnsetEmergency, conexUnsetEmergency,
//									ApiDeviceGenericModel.class);
//
//							if (apiDeviceGeneric.getError() == false) {
//								MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//										apiDeviceGeneric.getPendencyId(), deviceUnsetEmergency.getPendencyId());
//								Log.logSeniorInfo("Handle Device Unset Emergency",
//										"Results: " + apiDeviceGeneric);
//							} else {
//								Log.logSeniorInfo("Handle Device Unset Emergency",
//										"Error receiving Unset Emergency return message!");
//								sendPendencyUpdate(deviceUnsetEmergency.getPendencyId(), 343,
//										OperationEnum.KEEP_PENDENCY);
//							}
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Device Unset Emergency",
//									"Error in request for equipment", e);
//							sendPendencyUpdate(deviceUnsetEmergency.getPendencyId(), 344, OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				} else {
//					Log.logSeniorError("Handle Device Unset Emergency",
//							"Pending list is empty! Data received: " + unsetEmergencyDevicePendency.toString());
//				}
//			} else {
//				Log.logSeniorError("Handle Device Unset Emergency", "Failed to retrieve necessary data.");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Device Unset Emergency", "Exception occurred", ex);
//			// Tratar a exceção de forma apropriada
//		}
//
//	}
//
//	// TODO Function with built structure - Test with the equipment
//	public void handleAllowCardList(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Device Allow Card List", "Message AllowCardList: " + message);
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//			String urlSeniorAccessCard = UtilsUrlService.urlSeniorAccessCard(message.getDeviceId());
//			String urlSeniorRepCredential = UtilsUrlService.urlSeniorRepCredential(message.getDeviceId());
//
//			List<DevicePendency> devicePendencyAllowCardList = new ArrayList<DevicePendency>();
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null && allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Device Allow Card List",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<DevicePendency> loadAllowCard = allPendencyBody.getLoadAllowCardList();
//
//				if (!loadAllowCard.isEmpty()) {
//					for (DevicePendency pendency : loadAllowCard) {
//						if (pendency.getManagerDeviceId().equals(managerDeviceBody.getId())) {
//							Log.logSeniorInfo("Handle Device Allow Card List", "Pendency found: " + pendency);
//							devicePendencyAllowCardList.add(pendency);
//						}
//					}
//				} else {
//					Log.logSeniorInfo("Handle Device Allow Card List", "The issue could not be found.");
//				}
//			} else {
//				Log.logSeniorInfo("Handle Device Allow Card List", "Failed to retrieve necessary data.");
//			}
//
//			if (!devicePendencyAllowCardList.isEmpty()) {
//				for (DevicePendency pendencyAllowCardList : devicePendencyAllowCardList) {
//					if (MapManager.searchKey(pendencyAllowCardList.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Device Allow Card List",
//								"Pending completed, awaiting device return!"
//										+ MapManager.searchKey(pendencyAllowCardList.getPendencyId()));
//					} else {
//						try {
//							if (managerDeviceBody != null) {
//								if (managerDeviceBody.getRepConfiguration() == null) {
//									codeUtils.sendRequestCardList(managerDeviceBody, urlSeniorAccessCard,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexLoadListCard, pendencyAllowCardList.getPendencyId(),
//											ApiMessageTypeEnum.ALLOW_CARDS_LIST);
//								} else if (managerDeviceBody.getRepConfiguration() != null) {
//									codeUtils.sendRequestPersonREP(managerDeviceBody, urlSeniorRepCredential,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexLoadListPerson,
//											pendencyAllowCardList.getPendencyId(),
//											managerDeviceBody.getExtensibleConfiguration());
//								} else {
//									sendPendencyUpdate(pendencyAllowCardList.getPendencyId(), 343,
//											OperationEnum.KEEP_PENDENCY);
//									Log.logSeniorError("Handle Device Allow Card List",
//											"Error identifying the type of load, Device:" + message.getDeviceId()
//													+ ", Pendency: " + message.getPendencyType());
//								}
//							} else {
//								sendPendencyUpdate(pendencyAllowCardList.getPendencyId(), 344,
//										OperationEnum.KEEP_PENDENCY);
//								Log.logSeniorError("Handle Device Allow Card List",
//										"Error identifying the type of load, Device:" + message.getDeviceId()
//												+ ", Pendency: " + message.getPendencyType());
//							}
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Device Allow Card List",
//									"Error occurred during processing: " + e.getMessage());
//							sendPendencyUpdate(pendencyAllowCardList.getPendencyId(), 345, OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorInfo("Handle Device Allow Card List", "Pending not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Device Allow Card List", "Exception occurred", ex);
//		}
//	}
//
//	// TODO Function with built structure
//
//	public void handleRemoveAllowCardList(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Device Remove Allow Card List", "Message Remove Allow Card: " + message);
//
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null && allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Device Remove Allow Card List",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//				List<DevicePendency> devicePendencyRemoveAllowCardList = allPendencyBody.getRemoveAllowCardList();
//
//				if (!devicePendencyRemoveAllowCardList.isEmpty()) {
//					for (DevicePendency pendencyRemoveAllowCardList : devicePendencyRemoveAllowCardList) {
//						if (MapManager.searchKey(pendencyRemoveAllowCardList.getPendencyId()) != null) {
//							Log.logSeniorInfo("Handle Device Remove Allow Card List",
//									"Pending completed, awaiting device return!"
//											+ MapManager.searchKey(pendencyRemoveAllowCardList.getPendencyId()));
//						} else {
//							try {
//								HttpEntity<String> entityCardList = new HttpEntity<>(null);
//								ApiDeviceGenericModel apiDeviceGenericModel = null;
//								if (managerDeviceBody.getRepConfiguration() == null) {
//									apiDeviceGenericModel = restTemplate.postForObject(
//											UtilsUrlService.uriConexExcludeListCard, entityCardList,
//											ApiDeviceGenericModel.class);
//								} else {
//									apiDeviceGenericModel = restTemplate.postForObject(
//											UtilsUrlService.uriConexExcludeListEmployee, entityCardList,
//											ApiDeviceGenericModel.class);
//								}
//								if (apiDeviceGenericModel.getError() == false) {
//									MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//											apiDeviceGenericModel.getPendencyId(),
//											pendencyRemoveAllowCardList.getPendencyId());
//									Log.logSeniorInfo("Handle Device Remove Allow Card List",
//											"Device Pendency id return: " + apiDeviceGenericModel.getPendencyId()
//													+ " and " + pendencyRemoveAllowCardList.getPendencyId());
//								} else {
//									Log.logSeniorError("Handle Device Remove Allow Card List",
//											"Error pending response from the equipment.");
//									sendPendencyUpdate(pendencyRemoveAllowCardList.getPendencyId(), 343,
//											OperationEnum.KEEP_PENDENCY);
//								}
//
//							} catch (Exception e) {
//								Log.logSeniorError("Handle Device Remove Allow Card List",
//										"Error occurred during processing: " + e.getMessage());
//								sendPendencyUpdate(pendencyRemoveAllowCardList.getPendencyId(), 344,
//										OperationEnum.KEEP_PENDENCY);
//							}
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Device Remove Allow Card List",
//						"Failed to retrieve necessary data.");
//			}
//		} catch (Exception e) {
//			Log.logSeniorError("Handle Device Remove Allow Card List", "Error", e);
//		}
//	}
//
//	// TODO Function with built structure
//	public void handleIncludeCard(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Device Include Card", "Message Include Card: " + message);
//
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//			String urlSeniorAccessCard = UtilsUrlService.urlSeniorAccessCard(message.getDeviceId());
//			String urlSeniorRepCredential = UtilsUrlService.urlSeniorRepCredential(message.getDeviceId());
//
//			List<IncludeCardPendency> includeCardPendency = new ArrayList<IncludeCardPendency>();
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Device Include Card",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<IncludeCardPendency> includeCard = allPendencyBody.getIncludeCard();
//				if (!includeCard.isEmpty()) {
//					includeCardPendency.addAll(includeCard);
//				} else {
//					Log.logSeniorInfo("Handle Device Include Card", "The issue could not be found.");
//
//				}
//			} else {
//				Log.logSeniorInfo("Handle Device Include Card", "Failed to retrieve include card pendency.");
//			}
//
//			if (!includeCardPendency.isEmpty()) {
//				for (IncludeCardPendency pendencyIncludeCard : includeCardPendency) {
//
//					Log.logSeniorInfo("Handle Device Include Card",
//							"check pendency: " + MapManager.searchKey(pendencyIncludeCard.getPendencyId()));
//					if (MapManager.searchKey(pendencyIncludeCard.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Device Include Card",
//								"Pending completed, awaiting device return!");
//					} else {
//						try {
//							if (managerDeviceBody != null) {
//								if (managerDeviceBody.getRepConfiguration() == null) {
//									codeUtils.sendRequestCardList(managerDeviceBody, urlSeniorAccessCard,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexLoadListCard, pendencyIncludeCard.getPendencyId(),
//											ApiMessageTypeEnum.INCLUDE_CARD);
//								} else if (managerDeviceBody.getRepConfiguration() != null) {
//									codeUtils.sendRequestPersonREP(managerDeviceBody, urlSeniorRepCredential,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexLoadListPerson, pendencyIncludeCard.getPendencyId(),
//											managerDeviceBody.getExtensibleConfiguration());
//
//								} else {
//									sendPendencyUpdate(pendencyIncludeCard.getPendencyId(), 343,
//											OperationEnum.KEEP_PENDENCY);
//									Log.logSeniorError("Handle Device Include Card",
//											"Error identifying the type of load, Device:" + message.getDeviceId()
//													+ ", Pendency: " + message.getPendencyType());
//								}
//							} else {
//								sendPendencyUpdate(pendencyIncludeCard.getPendencyId(), 344,
//										OperationEnum.KEEP_PENDENCY);
//								Log.logSeniorError("Handle Device Include Card",
//										"Error identifying the type of load, Device:" + message.getDeviceId()
//												+ ", Pendency: " + message.getPendencyType());
//							}
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Device Include Card",
//									"Error occurred during processing: " + e.getMessage());
//							sendPendencyUpdate(pendencyIncludeCard.getPendencyId(), 345, OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Device Include Card", "Pending not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorInfo("Handle Device Include Card", "Exception occurred: " + ex.getMessage());
//		}
//	}
//
//	// TODO Function with built structure
//	public void handleExcludeCard(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Exclude Card", "Message Include Card: " + message);
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//			String urlSeniorAccessCard = UtilsUrlService.urlSeniorAccessCard(message.getDeviceId());
//			String urlSeniorRepCredential = UtilsUrlService.urlSeniorRepCredential(message.getDeviceId());
//
//			List<ExcludeCardPendency> excludeCardPendency = new ArrayList<ExcludeCardPendency>();
//
//			Log.logSeniorInfo("Handle Exclude Card", message.toString());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Exclude Card",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<ExcludeCardPendency> excludePendency = allPendencyBody.getExcludeCard();
//				if (!excludePendency.isEmpty()) {
//					excludeCardPendency.addAll(excludePendency);
//				} else {
//					Log.logSeniorInfo("Handle Exclude Card", "The issue could not be found.");
//				}
//			} else {
//				Log.logSeniorInfo("Handle Exclude Card", "Failed to retrieve include card pendency.");
//			}
//
//			if (!excludeCardPendency.isEmpty()) {
//				for (ExcludeCardPendency pendencyExcludeCard : excludeCardPendency) {
//					if (MapManager.searchKey(pendencyExcludeCard.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Device Exclude Card",
//								"Pending completed, awaiting device return!"
//										+ MapManager.searchKey(pendencyExcludeCard.getPendencyId()));
//					} else {
//						try {
//							if (managerDeviceBody != null) {
//								if (managerDeviceBody.getRepConfiguration() == null) {
//									codeUtils.sendRequestCardList(managerDeviceBody, urlSeniorAccessCard,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexDeleteListCard, pendencyExcludeCard.getPendencyId(),
//											ApiMessageTypeEnum.ALLOW_CARDS_LIST);
//								} else if (managerDeviceBody.getRepConfiguration() != null) {
//									codeUtils.sendRequestPersonREP(managerDeviceBody, urlSeniorRepCredential,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexDeleteListCard, pendencyExcludeCard.getPendencyId(),
//											managerDeviceBody.getExtensibleConfiguration());
//								} else {
//									sendPendencyUpdate(pendencyExcludeCard.getPendencyId(), 343,
//											OperationEnum.KEEP_PENDENCY);
//									Log.logSeniorError("Handle Exclude Card",
//											"Error identifying the type of load, Device:" + message.getDeviceId()
//													+ ", Pendency: " + message.getPendencyType());
//								}
//							} else {
//								sendPendencyUpdate(pendencyExcludeCard.getPendencyId(), 344,
//										OperationEnum.KEEP_PENDENCY);
//								Log.logSeniorError("Handle Exclude Card",
//										"Error identifying the type of load, Device:" + message.getDeviceId()
//												+ ", Pendency: " + message.getPendencyType());
//							}
//
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Exclude Card",
//									"Error occurred during processing: " + e.getMessage());
//							sendPendencyUpdate(pendencyExcludeCard.getPendencyId(), 345, OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Exclude Card", "Pending not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Exclude Card", "Exception occurred: " + ex);
//		}
//	}
//
//	// TODO Function with built structure
//
//	public void handleAllowBiometryList(WebSocketModelResponse message) {
//		try {
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			String urlSeniorAccessBiometry = UtilsUrlService.urlSeniorAccessBiometry(message.getDeviceId());
//
//			Log.logSeniorInfo("Handle Allow Biometry List", message.toString());
//
//			List<DevicePendency> devicePendencyAllowBiometryList = new ArrayList<DevicePendency>();
//
//			final HttpHeaders httpHeaderSenior2 = httpHeaderSenior;
//			if (httpHeaderSenior2 != null) {
//				HttpEntity<String> entityHeader = new HttpEntity<>(httpHeaderSenior2);
//				apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//				managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//				allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//				if (managerDeviceBody != null && allPendencyBody != null) {
//					Log.logSeniorInfo("Handle Allow Biometry List",
//							"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//					List<DevicePendency> listLoadAllowBiometrys = allPendencyBody.getLoadBiometryList();
//
//					if (!listLoadAllowBiometrys.isEmpty()) {
//						for (DevicePendency pendency : listLoadAllowBiometrys) {
//							Log.logSeniorInfo("Handle Allow Biometry List", "Pendency found: " + pendency);
//							devicePendencyAllowBiometryList.add(pendency);
//						}
//					} else {
//						Log.logSeniorInfo("Handle Allow Biometry List", "The issue could not be found.");
//					}
//				} else {
//					Log.logSeniorInfo("Handle Allow Biometry List", "Failed to retrieve necessary data.");
//				}
//
//				if (!devicePendencyAllowBiometryList.isEmpty()) {
//					for (DevicePendency pendencyAllowBiometry : devicePendencyAllowBiometryList) {
//						Log.logSeniorInfo("Handle Allow Biometry List",
//								"check pendency: " + MapManager.searchKey(pendencyAllowBiometry.getPendencyId()));
//						if (MapManager.searchKey(pendencyAllowBiometry.getPendencyId()) != null) {
//							Log.logSeniorInfo("Handle Allow Biometry List",
//									"Pending completed, awaiting device return!");
//						} else {
//							try {
//
//								List<AccessBiometry> biometryList = restTemplate
//										.exchange(urlSeniorAccessBiometry, HttpMethod.GET, entityHeader,
//												new ParameterizedTypeReference<List<AccessBiometry>>() {
//												})
//										.getBody();
//
//								if (biometryList != null && !biometryList.isEmpty()) {
//
//									List<ConexBiometryModel> listBiometryModel = new ArrayList<ConexBiometryModel>();
//									for (AccessBiometry accessBiometry : biometryList) {
//										for (CardAndTechnology card : accessBiometry.getCardList()) {
//
//											ConexBiometryModel biometryModel = new ConexBiometryModel();
//											biometryModel.setRegistry(card.getCardNumber().toString());
//											List<String> templateList = accessBiometry.getTemplateList();
//											List<String> decodedTemplates = new ArrayList<>();
//
//											for (String decode64 : templateList) {
//												String decodeString = Utils.decodeToBase64(decode64);
//												decodedTemplates.add(decodeString);
//											}
//											if (!decodedTemplates.isEmpty()) {
//
//												biometryModel.setMainBiometry(decodedTemplates.get(0));
//												if (decodedTemplates.size() > 1) {
//													biometryModel.setAlternativeBiometry(decodedTemplates.get(1));
//												} else {
//													biometryModel.setAlternativeBiometry(decodedTemplates.get(0));
//												}
//											}
//											listBiometryModel.add(biometryModel);
//										}
//
//										ExtensibleConfiguration extensible = managerDeviceBody
//												.getExtensibleConfiguration();
//										List<ExtensibleProperty> listPropertyExtensible = extensible
//												.getExtensiblePropertyList();
//										ExtensibleProperty filteProperty = listPropertyExtensible.stream()
//												.filter(property -> "CPF".equals(property.getKey())).findFirst()
//												.orElse(null);
//
//										ConexBiometryListModel conexBiometryListModel = new ConexBiometryListModel();
//										conexBiometryListModel
//												.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//										conexBiometryListModel.setResponsibleCpf(
//												filteProperty == null ? "" : filteProperty.getValue());
//										conexBiometryListModel.setBiometriesList(listBiometryModel);
//
//										// System.out.println(new Gson().toJson(conexBiometryListModel));
//
//										HttpEntity<ConexBiometryListModel> entityBiometryList = new HttpEntity<>(
//												conexBiometryListModel);
//										ApiDeviceGenericModel apiDeviceGenericModel = restTemplate.postForObject(
//												UtilsUrlService.uriConexLoadListBiometry, entityBiometryList,
//												ApiDeviceGenericModel.class);
//
//										if (apiDeviceGenericModel.getError() == false) {
//											MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//													apiDeviceGenericModel.getPendencyId(),
//													pendencyAllowBiometry.getPendencyId());
//											Log.logSeniorInfo("Handle Allow Biometry List",
//													"Device Pendency id return: "
//															+ apiDeviceGenericModel.getPendencyId() + " and "
//															+ pendencyAllowBiometry.getPendencyId());
//										} else {
//											Log.logSeniorError("Handle Allow Biometry List",
//													"Error pending response from the equipment.");
//											sendPendencyUpdate(pendencyAllowBiometry.getPendencyId(), 343,
//													OperationEnum.KEEP_PENDENCY);
//										}
//									}
//								} else {
//									Log.logSeniorError("Handle Allow Biometry List",
//											"Empty Biometrics or People list. ");
//									sendPendencyUpdate(pendencyAllowBiometry.getPendencyId(), 344,
//											OperationEnum.KEEP_PENDENCY);
//								}
//							} catch (Exception e) {
//								Log.logSeniorError("Handle Allow Biometry List",
//										"Error when handling Biometry List load model", e);
//								sendPendencyUpdate(pendencyAllowBiometry.getPendencyId(), 343,
//										OperationEnum.KEEP_PENDENCY);
//							}
//						}
//					}
//				} else {
//					Log.logSeniorError("Handle Allow Biometry List", "Pending not found!");
//				}
//			} else {
//				// TODO handle null value
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Allow Biometry List", "Exception occurred", ex);
//		}
//	}
//
//	// TODO Function with built structure
//
//	public void handleIncludeBiometry(WebSocketModelResponse message) {
//		try {
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			Log.logSeniorInfo("Handle Include Biometry", message.toString());
//
//			List<IncludeBiometryPendency> devicePendencyAllowBiometryList = new ArrayList<IncludeBiometryPendency>();
//			HttpEntity<String> entityResponse = new HttpEntity<>(httpHeaderSenior);
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null && allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Include Biometry",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<IncludeBiometryPendency> includeBiometrys = allPendencyBody.getIncludeBiometry();
//
//				if (!includeBiometrys.isEmpty()) {
//					for (IncludeBiometryPendency pendency : includeBiometrys) {
//						Log.logSeniorInfo("Handle Include Biometry", "Pendency found: " + pendency);
//						devicePendencyAllowBiometryList.add(pendency);
//					}
//				} else {
//					Log.logSeniorInfo("Handle Include Biometry", "The issue could not be found.");
//				}
//			} else {
//				Log.logSeniorInfo("Handle Include Biometry", "Failed to retrieve necessary data.");
//			}
//
//			if (!devicePendencyAllowBiometryList.isEmpty()) {
//				for (IncludeBiometryPendency pendencyIncludeBiometry : devicePendencyAllowBiometryList) {
//
//					Log.logSeniorInfo("Handle Include Biometry",
//							"check pendency: " + MapManager.searchKey(pendencyIncludeBiometry.getPendencyId()));
//					if (MapManager.searchKey(pendencyIncludeBiometry.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Include Biometry",
//								"Pending completed, awaiting device return!");
//					} else {
//						try {
//							String urlSeniorRepCredential = UtilsUrlService
//									.urlSeniorRepCredential(pendencyIncludeBiometry.getManagerDeviceId().toString());
//
//							List<PersonRep> listPersonRep = restTemplate.exchange(urlSeniorRepCredential,
//									HttpMethod.GET, entityResponse, new ParameterizedTypeReference<List<PersonRep>>() {
//									}).getBody();
//
//							if (listPersonRep != null) {
//								ExtensibleConfiguration extensible = managerDeviceBody.getExtensibleConfiguration();
//								List<ExtensibleProperty> listPropertyExtensible = extensible
//										.getExtensiblePropertyList();
//								ExtensibleProperty filteProperty = listPropertyExtensible.stream()
//										.filter(property -> "CPF".equals(property.getKey())).findFirst().orElse(null);
//
//								ConexBiometryIncludeModel biometryModel = new ConexBiometryIncludeModel();
//								Biometry encodedString = pendencyIncludeBiometry.getBiometry();
//								List<ConexBiometryModel> conexBiometryList = new ArrayList<ConexBiometryModel>();
//
//								ConexBiometryModel conexBiometry = new ConexBiometryModel();
//
//								for (CardAndTechnology card : pendencyIncludeBiometry.getCardList()) {
//
//									List<String> templateList = encodedString.getTemplateList();
//									List<String> decodedTemplates = new ArrayList<>();
//
//									for (String decode64 : templateList) {
//										String decodedBytes = Utils.decodeToBase64(decode64);
//										decodedTemplates.add(decodedBytes);
//									}
//									if (!decodedTemplates.isEmpty()) {
//
//										conexBiometry.setMainBiometry(decodedTemplates.get(0));
//										if (decodedTemplates.size() > 1) {
//											conexBiometry.setAlternativeBiometry(decodedTemplates.get(1));
//										} else {
//											conexBiometry.setAlternativeBiometry(null);
//										}
//									}
//									conexBiometry.setRegistry(card.getCardNumber().toString());
//									conexBiometryList.add(conexBiometry);
//
//								}
//								biometryModel.setBiometriesList(conexBiometryList);
//								biometryModel.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//								biometryModel.setResponsibleCpf(filteProperty == null ? "" : filteProperty.getValue());
//
//								System.out.println(new Gson().toJson(biometryModel));
//
//								Log.logSeniorInfo("Handle Include Biometry",
//										"Include Biometry: " + biometryModel);
//								HttpEntity<ConexBiometryIncludeModel> entityBiometryList = new HttpEntity<>(
//										biometryModel);
//								ApiDeviceGenericModel apiDeviceGenericModel = restTemplate
//										.exchange(UtilsUrlService.uriConexLoadListBiometry, HttpMethod.POST,
//												entityBiometryList, ApiDeviceGenericModel.class)
//										.getBody();
//
//								if (apiDeviceGenericModel.getError() == false) {
//									MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//											apiDeviceGenericModel.getPendencyId(),
//											pendencyIncludeBiometry.getPendencyId());
//									Log.logSeniorInfo("Handle Include Biometry",
//											"Device Pendency id return: " + apiDeviceGenericModel.getPendencyId()
//													+ " and " + pendencyIncludeBiometry.getPendencyId());
//								} else {
//									Log.logSeniorInfo("Handle Include Biometry",
//											"Error pending response from the equipment.");
//									sendPendencyUpdate(pendencyIncludeBiometry.getPendencyId(), 344,
//											OperationEnum.KEEP_PENDENCY);
//								}
//							}
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Include Biometry",
//									"Error when handling Biometry List load model", e);
//							sendPendencyUpdate(pendencyIncludeBiometry.getPendencyId(), 343,
//									OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Include Biometry", "Pending not found!");
//			}
//		} catch (
//
//		Exception ex) {
//			Log.logSeniorError("Handle Include Biometry", "Exception occurred", ex);
//		}
//	}
//
//	// TODO Function with built structure
//
//	public void handleRemoveBiometryList(WebSocketModelResponse message) {
//		try {
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			Log.logSeniorInfo("Handle Remove Biometry List", message.toString());
//
//			List<DevicePendency> devicePendencyRemoveBiometryList = new ArrayList<DevicePendency>();
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null && allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Remove Biometry List",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<DevicePendency> listRemoveAllowBiometrys = allPendencyBody.getRemoveBiometryList();
//
//				if (!listRemoveAllowBiometrys.isEmpty()) {
//					for (DevicePendency pendency : listRemoveAllowBiometrys) {
//						Log.logSeniorInfo("Handle Remove Biometry List", "Pendency found: " + pendency);
//						devicePendencyRemoveBiometryList.add(pendency);
//					}
//				} else {
//					Log.logSeniorInfo("Handle Remove Biometry List", "The issue could not be found.");
//				}
//			} else {
//				Log.logSeniorInfo("Handle Remove Biometry List", "Failed to retrieve necessary data.");
//			}
//
//			if (!devicePendencyRemoveBiometryList.isEmpty()) {
//				for (DevicePendency pendencyRemoveBiometry : devicePendencyRemoveBiometryList) {
//					if (MapManager.searchKey(pendencyRemoveBiometry.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Remove Biometry List",
//								"Pending completed, awaiting device return!"
//										+ MapManager.searchKey(pendencyRemoveBiometry.getPendencyId()));
//					} else {
//						try {
//							ExtensibleConfiguration extensible = managerDeviceBody.getExtensibleConfiguration();
//							List<ExtensibleProperty> listPropertyExtensible = extensible.getExtensiblePropertyList();
//							ExtensibleProperty filteProperty = listPropertyExtensible.stream()
//									.filter(property -> "CPF".equals(property.getKey())).findFirst().orElse(null);
//
//							ApiCPFDeviceRequestModel cpfDevice = new ApiCPFDeviceRequestModel();
//							cpfDevice.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//							cpfDevice.setResponsibleCpf(filteProperty.getValue());
//
//							HttpEntity<ApiCPFDeviceRequestModel> entityBiometryList = new HttpEntity<>(cpfDevice);
//							ApiDeviceGenericModel apiDeviceGenericModel = restTemplate.postForObject(
//									UtilsUrlService.uriConexExcludeListBiometry, entityBiometryList,
//									ApiDeviceGenericModel.class);
//
//							if (apiDeviceGenericModel.getError() == false) {
//								MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//										apiDeviceGenericModel.getPendencyId(), pendencyRemoveBiometry.getPendencyId());
//								Log.logSeniorInfo("Handle Remove Biometry List",
//										"Device Pendency id return: " + apiDeviceGenericModel.getPendencyId() + " and "
//												+ pendencyRemoveBiometry.getPendencyId());
//							} else {
//								Log.logSeniorError("Handle Remove Biometry List",
//										"Error in request for equipment");
//								sendPendencyUpdate(pendencyRemoveBiometry.getPendencyId(), 345,
//										OperationEnum.KEEP_PENDENCY);
//							}
//
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Remove Biometry List",
//									"Error when handling Biometry List load model", e);
//							sendPendencyUpdate(pendencyRemoveBiometry.getPendencyId(), 345,
//									OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Remove Biometry List", "Pending not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Remove Biometry List", "Exception occurred", ex);
//		}
//	}
//
//	// TODO Function with built structure
//	public void handleExcludeBiometry(WebSocketModelResponse message) {
//		try {
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//			String urlSeniorAccessCard = UtilsUrlService.urlSeniorAccessCard(message.getDeviceId());
//			String urlSeniorRepCredential = UtilsUrlService.urlSeniorRepCredential(message.getDeviceId());
//
//			List<ExcludeBiometryPendency> excludeBiometryPendency = new ArrayList<ExcludeBiometryPendency>();
//
//			Log.logSeniorInfo("Handle Exclude Biometry", message.toString());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Exclude Biometry",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<ExcludeBiometryPendency> excludeCard = allPendencyBody.getExcludeBiometry();
//				if (!excludeCard.isEmpty()) {
//					excludeBiometryPendency.addAll(excludeCard);
//				} else {
//					Log.logSeniorInfo("Handle Exclude Biometry", "The issue could not be found.");
//				}
//			} else {
//				Log.logSeniorInfo("Handle Exclude Biometry", "Failed to retrieve include card pendency.");
//			}
//
//			if (!excludeBiometryPendency.isEmpty()) {
//				for (ExcludeBiometryPendency pendencyExcludeBiometry : excludeBiometryPendency) {
//					if (MapManager.searchKey(pendencyExcludeBiometry.getPendencyId()) != null) {
//						Log.logSeniorInfo("Handle Exclude Biometry",
//								"Pending completed, awaiting device return!"
//										+ MapManager.searchKey(pendencyExcludeBiometry.getPendencyId()));
//					} else {
//						try {
//							if (managerDeviceBody != null) {
//								if (managerDeviceBody.getRepConfiguration() == null) {
//									codeUtils.sendRequestCardList(managerDeviceBody, urlSeniorAccessCard,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexDeleteListCard,
//											pendencyExcludeBiometry.getPendencyId(),
//											ApiMessageTypeEnum.EXCLUDE_BIOMETRY);
//								} else if (managerDeviceBody.getRepConfiguration() != null) {
//									codeUtils.sendRequestPersonREP(managerDeviceBody, urlSeniorRepCredential,
//											managerDeviceBody.getNetworkIdentification(),
//											UtilsUrlService.uriConexDeleteListCard,
//											pendencyExcludeBiometry.getPendencyId(), null);
//								} else {
//									sendPendencyUpdate(pendencyExcludeBiometry.getPendencyId(), 345,
//											OperationEnum.KEEP_PENDENCY);
//									Log.logSeniorError("Handle Exclude Biometry",
//											"Error identifying the type of load, Device:" + message.getDeviceId()
//													+ ", Pendency: " + message.getPendencyType());
//								}
//							} else {
//								sendPendencyUpdate(pendencyExcludeBiometry.getPendencyId(), 345,
//										OperationEnum.KEEP_PENDENCY);
//								Log.logSeniorError("Handle Exclude Biometry",
//										"Error identifying the type of load, Device:" + message.getDeviceId()
//												+ ", Pendency: " + message.getPendencyType());
//							}
//
//						} catch (Exception e) {
//							Log.logSeniorError("Handle Exclude Biometry",
//									"Error occurred during processing: " + e.getMessage());
//							sendPendencyUpdate(pendencyExcludeBiometry.getPendencyId(), 345,
//									OperationEnum.KEEP_PENDENCY);
//						}
//					}
//				}
//			} else {
//				Log.logSeniorError("Handle Exclude Biometry", "Pending not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Exclude Biometry", "Exception occurred: " + ex);
//		}
//	}
//
////	public void handlePerson(UpdatePersonREPPendency pendencyUpdatePerson) {
////		ManagerDevice managerDeviceBody = new ManagerDevice();
////		managerDeviceBody.setId(Long.valueOf(58));
////		managerDeviceBody.setNetworkIdentification("192.168.0.116");
////
////		if (pendencyUpdatePerson.getOperationId() == OperationIdEnum.INCLUDE_CARD) {
////			codeUtils.sendPersonCardREP(managerDeviceBody, pendencyUpdatePerson, managerDeviceBody.getNetworkIdentification(), UtilsUrlService.uriConexAddEmployeesList, pendencyUpdatePerson.getPendencyId(), managerDeviceBody.getExtensibleConfiguration());
////		} else if (pendencyUpdatePerson.getOperationId() == OperationIdEnum.EXCLUDE_CARD) {
////			codeUtils.sendExcludeByCardPersonREP(managerDeviceBody, pendencyUpdatePerson, managerDeviceBody.getNetworkIdentification(), UtilsUrlService.uriConexRemoveEmployees, pendencyUpdatePerson.getPendencyId(), managerDeviceBody.getExtensibleConfiguration());
////		} else if (pendencyUpdatePerson.getOperationId() == OperationIdEnum.EXCLUDE_PERSON) {
////			codeUtils.sendExcludeByCardPersonREP(managerDeviceBody, pendencyUpdatePerson, managerDeviceBody.getNetworkIdentification(), UtilsUrlService.uriConexRemoveEmployees, pendencyUpdatePerson.getPendencyId(), managerDeviceBody.getExtensibleConfiguration());
////		} else {
////			sendPendencyUpdate(pendencyUpdatePerson.getPendencyId(), 345, OperationEnum.KEEP_PENDENCY);
////		}
////
////	}
//
//	// TODO Function with built structure
//	public void handleUpdateRepPerson(WebSocketModelResponse message) {
//		try {
//			Log.logSeniorInfo("Handle Update Rep Person", "Message Update Person Card: " + message);
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			List<UpdatePersonREPPendency> updatePersonPendency = new ArrayList<UpdatePersonREPPendency>();
//
//			Log.logSeniorInfo("Handle Update Rep Person", message.toString());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (allPendencyBody != null) {
//				Log.logSeniorInfo("Handle Update Rep Person",
//						"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//				List<UpdatePersonREPPendency> updatePerson = allPendencyBody.getUpdatePersonREP();
//				if (!updatePerson.isEmpty()) {
//					updatePersonPendency.addAll(updatePerson);
//				} else {
//					Log.logSeniorInfo("Handle Update Rep Person", "The issue could not be found.");
//				}
//			} else {
//				Log.logSeniorInfo("Handle Update Rep Person", "Failed to retrieve include card pendency.");
//			}
//
//			if (!updatePersonPendency.isEmpty()) {
//				for (UpdatePersonREPPendency pendencyUpdatePerson : updatePersonPendency) {
//					if (MapManager.searchKey(pendencyUpdatePerson.getPendencyId()) == null) {
//						if (pendencyUpdatePerson.getOperationId() == OperationIdEnum.INCLUDE_CARD) {
//							codeUtils.sendPersonCardREP(managerDeviceBody, pendencyUpdatePerson,
//									managerDeviceBody.getNetworkIdentification(),
//									UtilsUrlService.uriConexAddEmployeesList, pendencyUpdatePerson.getPendencyId(),
//									managerDeviceBody.getExtensibleConfiguration());
//						} else if (pendencyUpdatePerson.getOperationId() == OperationIdEnum.EXCLUDE_CARD) {
//							codeUtils.sendExcludeByCardPersonREP(managerDeviceBody, pendencyUpdatePerson,
//									managerDeviceBody.getNetworkIdentification(),
//									UtilsUrlService.uriConexRemoveEmployees, pendencyUpdatePerson.getPendencyId(),
//									managerDeviceBody.getExtensibleConfiguration());
//						} else if (pendencyUpdatePerson.getOperationId() == OperationIdEnum.EXCLUDE_PERSON) {
//							codeUtils.sendExcludeByCardPersonREP(managerDeviceBody, pendencyUpdatePerson,
//									managerDeviceBody.getNetworkIdentification(),
//									UtilsUrlService.uriConexRemoveEmployees, pendencyUpdatePerson.getPendencyId(),
//									managerDeviceBody.getExtensibleConfiguration());
//						} else {
//							sendPendencyUpdate(pendencyUpdatePerson.getPendencyId(), 345, OperationEnum.KEEP_PENDENCY);
//							Log.logSeniorError("Handle Update Rep Person",
//									"Error identifying the type of load, Device:" + message.getDeviceId()
//											+ ", Pendency: " + message.getPendencyType());
//						}
//					} else {
//						Log.logSeniorError("Handle Update Rep Person",
//								"Pending completed, awaiting device return!"
//										+ MapManager.searchKey(pendencyUpdatePerson.getPendencyId()));
//					}
//				}
//
//			} else {
//				Log.logSeniorError("Handle Update Rep Person", "Pending not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Update Rep Person", "Exception occurred: " + ex);
//		}
//	}
//
//	// TODO Fazer
//
//	public void handleManufatureRep(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Manufature Rep", "Message received at UpdateFirmware: " + message);
//
//		try {
//			String uriDeviceId = UtilsUrlService.urlDeviceId(message.getDeviceId());
//			String urlSeniorPendency = UtilsUrlService.urlSeniorPendencyId(message.getDeviceId());
//
//			List<ManufacturerUpdatedPendency> updateManufacturerPendency = new ArrayList<ManufacturerUpdatedPendency>();
//
//			Log.logSeniorInfo("Handle Manufature Rep", message.toString());
//
//			apiManagerDeviceAllPendencyModel = CodeUtilsSenior.sendDevicePendency(uriDeviceId, urlSeniorPendency);
//			managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//			allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//
//			if (managerDeviceBody != null) {
//
//				if (allPendencyBody != null) {
//					Log.logSeniorInfo("Handle Manufature Rep",
//							"Device Address: " + managerDeviceBody.getNetworkIdentification());
//
//					List<ManufacturerUpdatedPendency> updateManufacturer = allPendencyBody.getManufacturerUpdated();
//					if (!updateManufacturer.isEmpty()) {
//						updateManufacturerPendency.addAll(updateManufacturer);
//					} else {
//						Log.logSeniorInfo("Handle Manufature Rep", "The issue could not be found.");
//					}
//				} else {
//					Log.logSeniorInfo("Handle Manufature Rep", "Failed to retrieve include card pendency.");
//				}
//
//				if (!updateManufacturerPendency.isEmpty()) {
//					for (ManufacturerUpdatedPendency pendencyManufaturePerson : updateManufacturerPendency) {
//						if (MapManager.searchKey(pendencyManufaturePerson.getPendencyId()) != null) {
//							Log.logSeniorInfo("Handle Manufature Rep",
//									"Pending completed, awaiting device return!"
//											+ MapManager.searchKey(pendencyManufaturePerson.getPendencyId()));
//						} else {
//							try {
//
//								RepConfiguration repConfig = managerDeviceBody.getRepConfiguration();
//								ExtensibleConfiguration extensible = managerDeviceBody.getExtensibleConfiguration();
//								List<ExtensibleProperty> listPropertyExtensible = extensible
//										.getExtensiblePropertyList();
//								ExtensibleProperty filteProperty = listPropertyExtensible.stream()
//										.filter(property -> "CPF".equals(property.getKey())).findFirst().orElse(null);
//
//								ConexEmployeerModel employeerModel = new ConexEmployeerModel();
//								employeerModel.setName(repConfig.getCompanyName());
//								employeerModel.setAddress(repConfig.getAddress());
//								employeerModel.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//								employeerModel.setCei(repConfig.getCei() == null ? "" : repConfig.getCei());
//								employeerModel.setResponsibleCpf(
//										filteProperty.getValue() == null ? "" : filteProperty.getValue());
//								if (repConfig.getCnpj() == null) {
//									employeerModel.setDocType(DocTypeEnum.CPF);
//									employeerModel.setDoc(repConfig.getCpf() == null ? "00000000" : repConfig.getCpf());
//								} else if (repConfig.getCnpj() != null) {
//									employeerModel.setDocType(DocTypeEnum.CNPJ);
//									employeerModel
//											.setDoc(repConfig.getCnpj() == null ? "00000000" : repConfig.getCnpj());
//								} else
//									Log.logSeniorError("Handle Manufature Rep",
//											"Error receiving company data for conex.");
//
//								HttpEntity<ConexEmployeerModel> entityEmployeesList = new HttpEntity<>(employeerModel);
//								try {
//
//									ApiDeviceGenericModel apiDeviceGeneric = restTemplate.postForObject(
//											UtilsUrlService.urlConexSetEmployeer, entityEmployeesList,
//											ApiDeviceGenericModel.class);
//									if (apiDeviceGeneric.getError() == false) {
//										MapManager.sendCachedAllPendency(managerDeviceBody.getId(),
//												apiDeviceGeneric.getPendencyId(),
//												pendencyManufaturePerson.getPendencyId());
//										Log.logSeniorInfo("Handle Manufature Rep",
//												"Device Pendency id return: " + apiDeviceGeneric.getPendencyId()
//														+ " and " + pendencyManufaturePerson.getPendencyId());
//									} else {
//										Log.logSeniorInfo("Handle Manufature Rep",
//												"Error pending response from the equipment.");
//										sendPendencyUpdate(pendencyManufaturePerson.getPendencyId(), 343,
//												OperationEnum.KEEP_PENDENCY);
//										Log.logSeniorError("Handle Manufature Rep",
//												"Error identifying the type of load, Device:" + message.getDeviceId()
//														+ ", Pendency: " + message.getPendencyType());
//
//									}
//								} catch (Exception e) {
//									Log.logSeniorError("Handle Manufature Rep",
//											"Error in request for equipment.", e);
//									sendPendencyUpdate(pendencyManufaturePerson.getPendencyId(), 344,
//											OperationEnum.KEEP_PENDENCY);
//								}
//
//							} catch (Exception e) {
//								Log.logSeniorError("Handle Manufature Rep",
//										"Error occurred during processing: " + e.getMessage());
//								sendPendencyUpdate(pendencyManufaturePerson.getPendencyId(), 345,
//										OperationEnum.KEEP_PENDENCY);
//							}
//						}
//					}
//				} else {
//					Log.logSeniorError("Handle Manufature Rep", "Pending not found!");
//				}
//			} else {
//				Log.logSeniorError("Handle Manufature Rep", "Device not found!");
//			}
//		} catch (Exception ex) {
//			Log.logSeniorError("Handle Manufature Rep", "Exception occurred: " + ex);
//		}
//
//	};
//
//	// TODO Method to update the pending issue
//
//	public static void sendPendencyUpdate(Long pendencyId, Integer errorCode, OperationEnum operation) {
//
//		try {
//			List<PendencyUpdated> listResponsePendency = new ArrayList<PendencyUpdated>();
//			PendencyUpdated setPendencyUpdate = new PendencyUpdated();
//			setPendencyUpdate.setPendencyId(pendencyId);
//			setPendencyUpdate.setErrorCode(errorCode);
//			setPendencyUpdate.setOperation(operation);
//
//			listResponsePendency.add(setPendencyUpdate);
//
//			HttpEntity<List<PendencyUpdated>> entity = new HttpEntity<List<PendencyUpdated>>(listResponsePendency,
//					UtilsHttpHeaderSenior.sendHttpSenior());
//
//			ResponseEntity<String> execute = restTemplate.exchange(UtilsUrlService.urlResponsePendencyUpdate,
//					HttpMethod.POST, entity, String.class);
//
//			HttpStatus statusCodeResponse = execute.getStatusCode();
//
//			Log.logSeniorInfo("Send Pendency Update", "Pendency update success: " + statusCodeResponse);
//
//		} catch (Exception e) {
//			Log.logSeniorError("Send Pendency Update", "Error updating pendency: " + e.getMessage());
//		}
//	}
//
//	// -------------------------------------------------------------------------
//	// TODO Develop
//	// -------------------------------------------------------------------------
//
//	// Function with built structure - Test
//	public void handleBlockDevice(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Block Device", "Message received at BlockDevice: " + message);
//
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// UtilsUrlService.urlSeniorPendency( // message.getDeviceId());
//		// String UtilsUrlService.urlConexBlockDevice = String.format("%s/.....",
//		// UtilsUrlService.urlConex.trim());
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// apiManagerDeviceAllPendencyModel =
//		// CodeUtilsSenior.sendDevicePendency(uriDeviceId,
//		// urlSeniorPendency);
//		// managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//		// allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// managerDeviceBody.getNetworkIdentification());
//		// List<BlockDevicePendency> blockDevicePendency = new ArrayList<>();
//		// for (BlockDevicePendency pendency : allPendencyBody.getBlockDevice()) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// blockDevicePendency.add(pendency);
//		// }
//		//
//		// if (!(blockDevicePendency.isEmpty())) {
//		//
//		// BlockDevicePendency deviceBlock =
//		// blockDevicePendency.stream().filter(pendency ->
//		// pendency.getManagerDeviceId().equals(managerDeviceBody.getId())).findFirst().orElse(null);
//		//
//		// ConexDeviceBlockModel emergencyDevice = new ConexDeviceBlockModel();
//		// emergencyDevice.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//		// emergencyDevice.setBlockType(BlockDeviceEnum.DEVICE_BLOCK);
//		//
//		// HttpEntity<ConexDeviceBlockModel> entityComandDeviceStatus = new
//		// HttpEntity<>(emergencyDevice, UtilsHttpHeaderSenior.sendHttpSenior());
//		//
//		// try {
//		// DeviceGenericModel deviceGenericModel =
//		// restTemplate.postForObject(UtilsUrlService.urlConexBlockDevice,
//		// entityComandDeviceStatus,
//		// DeviceGenericModel.class);
//		//
//		// if (deviceGenericModel != null) {
//		// MapManager.sendCachedAllPendency(deviceGenericModel.getPendecyId(),
//		// deviceBlock.getPendencyId());
//		// LoggerUtils.logSeniorInfo("Results: " + blockDevicePendency);
//		// } else {
//		// LoggerUtils.logSeniorInfo("Error receiving Date Time return message!");
//		// postPendencyUpdate(deviceBlock.getPendencyId(), 345,
//		// OperationEnum.KEEP_PENDENCY);
//		// }
//		//
//		// } catch (Exception e) {
//		// LoggerUtils.logSeniorInfo("Error in request for equipment: " +
//		// e.getMessage());
//		// postPendencyUpdate(deviceBlock.getPendencyId(), 345,
//		// OperationEnum.KEEP_PENDENCY);
//		// }
//		// } else {
//		// LoggerUtils.logSeniorInfo("Pending list is empty! Data received: " +
//		// blockDevicePendency.toString());
//		// }
//
//	};
//
//	// Function with built structure - Test
//	public void handleUnblockDevice(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Unblock Device", "Message received at UnblockDevice: " + message);
//		//
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// UtilsUrlService.urlSeniorPendency( // message.getDeviceId());
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// apiManagerDeviceAllPendencyModel =
//		// CodeUtilsSenior.sendDevicePendency(uriDeviceId,
//		// urlSeniorPendency);
//		// managerDeviceBody = apiManagerDeviceAllPendencyModel.getManagerDevice();
//		// allPendencyBody = apiManagerDeviceAllPendencyModel.getAllPendency();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// managerDeviceBody.getNetworkIdentification());
//		// List<UnblockDevicePendency> unblockDevicePendency = new ArrayList<>();
//		// for (UnblockDevicePendency pendency : allPendencyBody.getUnblockDevice()) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// unblockDevicePendency.add(pendency);
//		// }
//		//
//		// if (!(unblockDevicePendency.isEmpty())) {
//		//
//		// UnblockDevicePendency deviceUnblock =
//		// unblockDevicePendency.stream().filter(pendency ->
//		// pendency.getManagerDeviceId().equals(managerDeviceBody.getId())).findFirst().orElse(null);
//		//
//		// ConexDeviceBlockModel emergencyDevice = new ConexDeviceBlockModel();
//		// emergencyDevice.setDeviceIpAddress(managerDeviceBody.getNetworkIdentification());
//		// emergencyDevice.setBlockType(BlockDeviceEnum.DEVICE_BLOCK);
//		//
//		// HttpEntity<ConexDeviceBlockModel> entityComandDeviceStatus = new
//		// HttpEntity<>(emergencyDevice, UtilsHttpHeaderSenior.sendHttpSenior());
//		//
//		// try {
//		// DeviceGenericModel deviceGenericModel =
//		// restTemplate.postForObject(urlSeniorPendency, entityComandDeviceStatus,
//		// DeviceGenericModel.class);
//		//
//		// if (deviceGenericModel != null) {
//		//
//		// MapManager.sendCachedAllPendency(deviceGenericModel.getPendecyId(),
//		// deviceUnblock.getPendencyId());
//		// LoggerUtils.logSeniorInfo("Results: " + unblockDevicePendency);
//		// } else {
//		// LoggerUtils.logSeniorInfo("Error receiving Date Time return message!");
//		// postPendencyUpdate(deviceUnblock.getPendencyId(), 345,
//		// OperationEnum.KEEP_PENDENCY);
//		// }
//		//
//		// } catch (Exception e) {
//		// LoggerUtils.logSeniorInfo("Error in request for equipment: " +
//		// e.getMessage());
//		// postPendencyUpdate(deviceUnblock.getPendencyId(), 345,
//		// OperationEnum.KEEP_PENDENCY);
//		// }
//		// } else {
//		// LoggerUtils.logSeniorInfo("Pending list is empty! Data received: " +
//		// unblockDevicePendency.toString());
//		// }
//
//	};
//
//	//
//	public void handleUpdateFirmware(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Update Firmware", "Message received at UpdateFirmware: " + message);
//
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// String urlSeniorPendency = String.format("%s/pendency/device/%s" +
//		// message.getDeviceId();
//		// ManagerDevice device;
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// HttpEntity<String> entityHeander = new
//		// HttpEntity<>(httpHeaderSenior));
//		//
//		// ResponseEntity<ManagerDevice> managerDeviceBody =
//		// restTemplate.exchange(uriDeviceId, HttpMethod.GET,
//		// entityHeander, ManagerDevice.class);
//		//
//		// device = managerDeviceBody.getBody();
//		//
//		// ResponseEntity<AllPendency> allPendencyBody =
//		// restTemplate.exchange(urlSeniorPendency, HttpMethod.GET,
//		// entityHeander, AllPendency.class);
//		// AllPendency allPendency = allPendencyBody.getBody();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// device.getNetworkIdentification());
//		// List<DevicePendency> blockDevicePendency = new ArrayList<>();
//		// for (DevicePendency pendency : allPendency.getUpdateFirmware()) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// blockDevicePendency.add(pendency);
//		// }
//
//	};
//
//	//
//	public void handleDeviceInputStatus(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Device Input Status", "Message received at DeviceInputStatus: " + message);
//		//
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// String urlSeniorPendency = String.format("%s/pendency/device/%s" +
//		// message.getDeviceId();
//		// ManagerDevice device;
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// HttpEntity<String> entityHeander = new
//		// HttpEntity<>(httpHeaderSenior));
//		//
//		// ResponseEntity<ManagerDevice> managerDeviceBody =
//		// restTemplate.exchange(uriDeviceId, HttpMethod.GET,
//		// entityHeander, ManagerDevice.class);
//		//
//		// device = managerDeviceBody.getBody();
//		//
//		// ResponseEntity<AllPendency> allPendencyBody =
//		// restTemplate.exchange(urlSeniorPendency, HttpMethod.GET,
//		// entityHeander, AllPendency.class);
//		// AllPendency allPendency = allPendencyBody.getBody();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// device.getNetworkIdentification());
//		// List<DevicePendency> blockDevicePendency = new ArrayList<>();
//		// for (DevicePendency pendency : allPendency.getInputStatus()) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// blockDevicePendency.add(pendency);
//		// }
//
//	};
//
//	//
//	public void handleCredentialFacialList(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Credential Facial List",
//				"Message received at CredentialFacialList: " + message);
//
//	};
//
//	//
//	public void handleLoadHolidayList(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Load Holiday List", "Message received at LoadHolidayList: " + message);
//		//
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// UtilsUrlService.urlSeniorPendency( // message.getDeviceId());
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// List<LoadHolidayListPendency> listHolidayPendency = new ArrayList<>();
//		// HttpEntity<String> entityHeader = new
//		// HttpEntity<>(httpHeaderSenior));
//		// ManagerDevice managerDeviceBody = null;
//		//
//		// try {
//		// managerDeviceBody = restTemplate.exchange(uriDeviceId, HttpMethod.GET,
//		// entityHeader, ManagerDevice.class).getBody();
//		//
//		// AllPendency allPendencyBody = restTemplate.exchange(urlSeniorPendency,
//		// HttpMethod.GET, entityHeader, AllPendency.class).getBody();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// managerDeviceBody.getNetworkIdentification());
//		// List<LoadHolidayListPendency> listLoadAllowCard =
//		// allPendencyBody.getLoadHolidayList();
//		//
//		// if (!listLoadAllowCard.isEmpty()) {
//		//
//		// for (LoadHolidayListPendency pendency : listLoadAllowCard) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// listHolidayPendency.add(pendency);
//		// }
//		// } else {
//		// LoggerUtils.logSeniorInfo("The issue could not be found. ");
//		// }
//		//
//		// if (!(listHolidayPendency.isEmpty())) {
//		//
//		// for (LoadHolidayListPendency pendencyHandler : listHolidayPendency) {
//		//
//		// try {
//		//
//		// List<HolidayList> holidayListRequest = restTemplate.exchange(null,
//		// HttpMethod.GET, entityHeader, new
//		// ParameterizedTypeReference<List<HolidayList>>() {
//		// }).getBody();
//		// List<String> listHolidayString = new ArrayList<>();
//		//
//		// for (HolidayList listHoliday : holidayListRequest) {
//		// listHolidayString.addAll(listHoliday.getHoliday());
//		// }
//		//
//		// // mapa do Modelo para Conex
//		//
//		// HttpEntity<String> entityListBiometry = new HttpEntity<>(null);
//		// try {
//		// WebhookGenericModel apiDeviceGeneric = restTemplate.postForObject(null,
//		// entityListBiometry, WebhookGenericModel.class);
//		//
//		// MapManager.sendCachedAllPendency(apiDeviceGeneric.getPendencyId(),
//		// pendencyHandler.getPendencyId());
//		// LoggerUtils.logSeniorInfo("Device Pendency id return: " +
//		// apiDeviceGeneric.getPendencyId() + " and " +
//		// pendencyHandler.getPendencyId());
//		// } catch (Exception e) {
//		// LoggerUtils.logSeniorInfo("Error in request for equipment: " +
//		// e.getMessage());
//		// postPendencyUpdate(pendencyHandler.getPendencyId(), 345,
//		// OperationEnum.KEEP_PENDENCY);
//		// }
//		//
//		// } catch (Exception e) {
//		// LoggerUtils.logSeniorInfo("Error when handling Card List load model: " +
//		// e.getMessage());
//		// postPendencyUpdate(pendencyHandler.getPendencyId(), 345,
//		// OperationEnum.KEEP_PENDENCY);
//		// }
//		//
//		// }
//		// }
//		// } catch (Exception e) {
//		// LoggerUtils.logSeniorInfo("Error in request for senior Device/Pendency: " +
//		// e.getMessage());
//		//
//		// }
//
//	};
//
//	//
//	public void handleRemoveHolidayList(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Remove Holiday List", "Message received at RemoveHolidayList: " + message);
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// String urlSeniorPendency = String.format("%s/pendency/device/%s" +
//		// message.getDeviceId();
//		// ManagerDevice device;
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// HttpEntity<String> entityHeander = new
//		// HttpEntity<>(httpHeaderSenior));
//		//
//		// ResponseEntity<ManagerDevice> managerDeviceBody =
//		// restTemplate.exchange(uriDeviceId, HttpMethod.GET,
//		// entityHeander, ManagerDevice.class);
//		//
//		// device = managerDeviceBody.getBody();
//		//
//		// ResponseEntity<AllPendency> allPendencyBody =
//		// restTemplate.exchange(urlSeniorPendency, HttpMethod.GET,
//		// entityHeander, AllPendency.class);
//		// AllPendency allPendency = allPendencyBody.getBody();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// device.getNetworkIdentification());
//		// List<DevicePendency> blockDevicePendency = new ArrayList<>();
//		// for (DevicePendency pendency : allPendency.getRemoveHolidayList()) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// blockDevicePendency.add(pendency);
//		// }
//
//	};
//
//	//
//	public void handleCollectEvents(WebSocketModelResponse message) {
//		Log.logSeniorInfo("Handle Collect Events", "Message received at CollectEvents: " + message);
//
//		// UtilsUrlService.urlDeviceId( // message.getDeviceId());
//		// String urlSeniorPendency = String.format("%s/pendency/device/%s" +
//		// message.getDeviceId();
//		// ManagerDevice device;
//		//
//		// LoggerUtils.logSeniorInfo(message.toString());
//		//
//		// HttpEntity<String> entityHeander = new
//		// HttpEntity<>(httpHeaderSenior));
//		//
//		// ResponseEntity<ManagerDevice> managerDeviceBody =
//		// restTemplate.exchange(uriDeviceId, HttpMethod.GET,
//		// entityHeander, ManagerDevice.class);
//		//
//		// device = managerDeviceBody.getBody();
//		//
//		// ResponseEntity<AllPendency> allPendencyBody =
//		// restTemplate.exchange(urlSeniorPendency, HttpMethod.GET,
//		// entityHeander, AllPendency.class);
//		// AllPendency allPendency = allPendencyBody.getBody();
//		//
//		// LoggerUtils.logSeniorInfo("Device Address: " +
//		// device.getNetworkIdentification());
//		// List<CollectEventPendency> blockDevicePendency = new ArrayList<>();
//		// for (CollectEventPendency pendency : allPendency.getCollectEvent()) {
//		// LoggerUtils.logSeniorInfo("Pendency found: " + pendency);
//		// blockDevicePendency.add(pendency);
//		// }
//
//	};

}
