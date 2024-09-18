package br.com.seniorx.services;

import java.time.OffsetDateTime;
import java.util.ArrayList;
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
import br.com.seniorx.models.PersonPhotoTemplates;
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
	private static String uriPendencyUpdate = String.format("%s/pendency/update", seniorEndpoint);
	private static String uriPendencySuccess = String.format("%s/pendency/success", seniorEndpoint);
	private static String uriDeviceAllowedPhotos = String.format("%s/device/access/${id}/photo", seniorEndpoint);
	private static String uriDeviceStatus = String.format("%s/device/status", seniorEndpoint);
	private static String uriAccessRequest = String.format("%s/device/accessrequest", seniorEndpoint);
	private static String uriClockIn = String.format("%s/notify/person/clockin", seniorEndpoint);
	private static String uriDriveDateTime = String.format("%s/driver/datetime", seniorEndpoint);
	private static String uriDeviceBiometry = String.format("%s/device/biometry", seniorEndpoint);
	private static String uriDatamartPersonInfo = String.format("%s/datamart/person/info", seniorEndpoint);
	private static String uriDataMartAreaControl = String.format("%s/datamart/areacontrol", seniorEndpoint);
	private static String uriNotifyPersonAccess = String.format("%s/notify/person/access", seniorEndpoint);

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

	private static HttpHeaders getHeaders() {
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
			ResponseEntity<AllPendency> response = restTemplate.exchange(uriDevicePendencies + "/" + deviceId, HttpMethod.GET, entity, AllPendency.class);
			System.out.println(response.getBody());

			AllPendency allPendencies = response.getBody();
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
			HttpEntity<String> res = restTemplate.exchange(uriPendencySuccess, HttpMethod.POST, entity, String.class);
			CLogger.logSeniorDebug("UPDATE EXECUTED", "OK: " + res.getBody());
		} catch (Exception e) {
			CLogger.logSeniorError("UPDATE EXECUTED", "ERROR", e);
		}
	}

	public void updatePendenciesStatus(List<PendencyUpdated> pendenciesList) {

		try {
			HttpEntity<List<PendencyUpdated>> entity = new HttpEntity<List<PendencyUpdated>>(pendenciesList, httpHeaderSenior);
			HttpEntity<String> ls = restTemplate.exchange(uriPendencyUpdate, HttpMethod.POST, entity, String.class);
			CLogger.logSeniorDebug("UPDATE PENDENCY", "OK: " + ls.getBody());
		} catch (Exception e) {
			CLogger.logSeniorError("UPDATE PENDENCY", "ERROR", e);
		}

	}

	public List<PersonPhotoTemplates> getCredentialFacialList() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<PersonPhotoTemplates>> response = restTemplate.exchange(uriDeviceAllowedPhotos.replace("${id}", device.getId().toString()), HttpMethod.GET, entity, new ParameterizedTypeReference<List<PersonPhotoTemplates>>() {
			});
			System.out.println(response.getBody());
			return response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getCredentialFacialList", "ERROR", e);
			return new ArrayList<PersonPhotoTemplates>();
		}
	}

}
