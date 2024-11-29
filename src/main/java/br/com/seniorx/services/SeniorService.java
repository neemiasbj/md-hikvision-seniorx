package br.com.seniorx.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.seniorx.SeniorStaticData;
import br.com.seniorx.models.Access;
import br.com.seniorx.models.AccessBiometry;
import br.com.seniorx.models.AccessRequest;
import br.com.seniorx.models.AllPendency;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.CardList;
import br.com.seniorx.models.DeviceStatus;
import br.com.seniorx.models.Event;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.PendencyExecuted;
import br.com.seniorx.models.PendencyUpdated;
import br.com.seniorx.models.PersonInfo;
import br.com.seniorx.models.PersonPhotoTemplates;
import br.com.seniorx.models.PersonTemplates;
import br.com.seniorx.models.PersonValidationResponse;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.resource.Utils;
import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;

public class SeniorService {
	private ManagerDevice device = null;
	private static ObjectMapper objectMapper = new ObjectMapper();

	private static String seniorPartnerKey = MiddlewareUtilPropertiesImpl.getValor("senior.partner_key");
	private static String seniorDriverKey = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");
	private static String seniorEndpoint = MiddlewareUtilPropertiesImpl.getValor("senior.api.sdk.uri");

	private static String uriDevice = String.format("%s/device", new Object[] { seniorEndpoint });
	private static String uriDevices = String.format("%s/device/", new Object[] { seniorEndpoint });
	private static String uriAreaControl = String.format("%s/datamart/areacontrol", new Object[] { seniorEndpoint });
	private static String uriNotifyDeviceEvent = String.format("%s/notify/device/event",
			new Object[] { seniorEndpoint });
	private static String uriPendencies = String.format("%s/pendency", seniorEndpoint);
//	private static String uriPendenciesDevice = String.format("%s/pendency/device", new Object[] { seniorEndpoint });
	private static String uriPendencyUpdate = String.format("%s/pendency/update", new Object[] { seniorEndpoint });
	private static String uriPendencySuccess = String.format("%s/pendency/success", new Object[] { seniorEndpoint });
	private static String uriDeviceAllowedPhotos = String.format("%s/device/access/${id}/photo",
			new Object[] { seniorEndpoint });
	private static String uriDeviceAllowedCards = String.format("%s/device/access/${id}/card",
			new Object[] { seniorEndpoint });
	private static String uriDeviceAllowedBiometries = String.format("%s/device/access/${id}/biometry",
			new Object[] { seniorEndpoint });
	private static String uriDeviceStatus = String.format("%s/device/status", new Object[] { seniorEndpoint });
	private static String uriAccessRequest = String.format("%s/device/accessrequest", new Object[] { seniorEndpoint });
//	private static String uriDriveDateTime = String.format("%s/driver/datetime", new Object[] { seniorEndpoint });
//	private static String uriDeviceBiometry = String.format("%s/device/biometry", new Object[] { seniorEndpoint });
	private static String uriDatamartPersonCardAndPhotoInfo = String.format("%s/datamart/person/info",
			new Object[] { seniorEndpoint });
	private static String uriDatamartPersonFingerPrintInfo = String.format(
			"%s/datamart/biometry?managerDeviceId=${managerDeviceId}&personId=${personId}",
			new Object[] { seniorEndpoint });
	private static String uriNotifyPersonAccess = String.format("%s/notify/person/access",
			new Object[] { seniorEndpoint });

	private static final RestTemplate restTemplate = getRestTemplate();
	private static final HttpHeaders httpHeaderSenior = getHeaders();

	public ManagerDevice getDevice() {
		return this.device;
	}

	public void setDevice(ManagerDevice device) {
		this.device = device;
	}

	private static RestTemplate getRestTemplate() {
		Integer timeWaitingRestTemplate = Integer
				.valueOf(MiddlewareUtilPropertiesImpl.getValor("senior.api.sdk.timeout"));
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(timeWaitingRestTemplate.intValue());

		return new RestTemplate((ClientHttpRequestFactory) clientHttpRequestFactory);
	}

	private static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("partner_key", seniorPartnerKey);
		headers.add("driver_key", seniorDriverKey);
		return headers;
	}

	public static List<ManagerDevice> getDevices() {
		try {
			HttpHeaders header = httpHeaderSenior;
			header.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<ManagerDevice>> response = restTemplate.exchange(uriDevices, HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<ManagerDevice>>() {
					}, new Object[0]);

			List<ManagerDevice> devices = (List<ManagerDevice>) response.getBody();
			if (devices == null || devices.isEmpty()) {
				CLogger.logSeniorError("Senior", "No devices found on Senior!");
				return null;
			}

			return devices;
		} catch (Exception e) {
			CLogger.logSeniorError("Status Event All Device", "Data sent to the platform. Error Equipment List", e);
			return null;
		}
	}

	public static void updateAreaControls() {
		try {
			HttpHeaders header = httpHeaderSenior;
			header.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<AreaControlList>> response = restTemplate.exchange(uriAreaControl, HttpMethod.GET,
					entity, new ParameterizedTypeReference<List<AreaControlList>>() {
					}, new Object[0]);

			List<AreaControlList> areasControl = (List<AreaControlList>) response.getBody();
			if (areasControl == null || areasControl.isEmpty()) {

				SeniorStaticData.setAreaControlList(new ArrayList<AreaControlList>());
				CLogger.logSeniorError("Senior", "No Area Controls found on Senior!");
				return;
			}
			SeniorStaticData.setAreaControlList(areasControl);

		} catch (Exception e) {
			CLogger.logSeniorError("Status Event All Device", "Data sent to the platform. Error Equipment List", e);
		}
	}

	public static ManagerDevice getDevice(Long deviceId) {
		try {
			HttpHeaders header = httpHeaderSenior;
			header.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<ManagerDevice> response = restTemplate.exchange(String.valueOf(uriDevice) + "/" + deviceId,
					HttpMethod.GET, entity, new ParameterizedTypeReference<ManagerDevice>() {
					}, new Object[0]);

			return (ManagerDevice) response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("SENIOR SERVICE", "getDevice", e);
			return null;
		}
	}

	public static AllPendency getPendencies() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<AllPendency> response = restTemplate.exchange(String.valueOf(uriPendencies), HttpMethod.GET,
					entity, AllPendency.class, new Object[0]);

			AllPendency allPendencies = (AllPendency) response.getBody();
			return allPendencies;
		} catch (Exception e) {
			CLogger.logSeniorError("getPendencies", "pendencies", e);
			return null;
		}
	}

//	public AllPendency getDevicePendencies(Long deviceId) {
//		try {
//			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
//			ResponseEntity<AllPendency> response = restTemplate.exchange(
//					String.valueOf(uriPendenciesDevice) + "/" + deviceId, HttpMethod.GET, entity, AllPendency.class,
//					new Object[0]);
//
//			AllPendency allPendencies = (AllPendency) response.getBody();
//			return allPendencies;
//		} catch (Exception e) {
//			CLogger.logSeniorError("getDevicePendencies", "getDevice", e);
//			return null;
//		}
//	}
//
//	public AreaControlList getAreaById(Long areaId) {
//		try {
//			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
//			ResponseEntity<List<AreaControlList>> response = restTemplate.exchange(uriAreaControl, HttpMethod.GET,
//					entity, new ParameterizedTypeReference<List<AreaControlList>>() {
//					}, new Object[0]);
//
//			List<AreaControlList> areasControl = (List<AreaControlList>) response.getBody();
//			if (areasControl == null || areasControl.isEmpty()) {
//				CLogger.logSeniorError("Senior", "No area control found for " + areaId);
//				return null;
//			}
//
//			for (AreaControlList areaControl : areasControl) {
//				if (Objects.equals(areaControl.getId(), areaId))
//					return areaControl;
//			}
//			return null;
//		} catch (Exception e) {
//			CLogger.logSeniorError("getAreaById: " + areaId, "ERROR", e);
//			return null;
//		}
//	}

	public void sendEventList(List<Event> events) {
		try {
			CLogger.logSeniorDebug("sendEventList", Utils.listToJson(events));
			HttpEntity<List<Event>> entity = new HttpEntity<List<Event>>(events, httpHeaderSenior);
			restTemplate.postForObject(uriNotifyDeviceEvent, entity, String.class, new Object[0]);
			CLogger.logSeniorDebug("sendEventList", "SUCCESS");
		} catch (Exception e) {
			CLogger.logSeniorError("sendEventList", "ERROR", e);
		}
	}

	public void updatePendenciesExecuted(List<PendencyExecuted> pendenciesList) {
		try {
			HttpEntity<List<PendencyExecuted>> entity = new HttpEntity<List<PendencyExecuted>>(pendenciesList,
					httpHeaderSenior);
			ResponseEntity<String> responseEntity = restTemplate.exchange(uriPendencySuccess, HttpMethod.POST, entity,
					String.class, new Object[0]);
			CLogger.logSeniorDebug("updatePendenciesExecuted", "OK: " + (String) responseEntity.getBody());
		} catch (Exception e) {
			CLogger.logSeniorError("updatePendenciesExecuted", "ERROR", e);
		}
	}

	public void updatePendenciesStatus(List<PendencyUpdated> pendenciesList) {
		try {
			HttpEntity<List<PendencyUpdated>> entity = new HttpEntity<List<PendencyUpdated>>(pendenciesList,
					httpHeaderSenior);
			ResponseEntity<String> responseEntity = restTemplate.exchange(uriPendencyUpdate, HttpMethod.POST, entity,
					String.class, new Object[0]);
			CLogger.logSeniorDebug("UPDATE PENDENCY", "OK: " + (String) responseEntity.getBody());
		} catch (Exception e) {
			CLogger.logSeniorError("updatePendenciesStatus", "ERROR", e);
		}
	}

	public List<PersonPhotoTemplates> getDeviceAllowedFacialList() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			String url = uriDeviceAllowedPhotos.replace("${id}", this.device.getId().toString());
			ResponseEntity<List<PersonPhotoTemplates>> response = restTemplate.exchange(url, HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<PersonPhotoTemplates>>() {
					}, new Object[0]);

			return (List<PersonPhotoTemplates>) response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getDeviceAllowedFacialList", "ERROR", e);
			return new ArrayList<>();
		}
	}

	public List<CardList> getDeviceAllowedCardList() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<CardList>> response = restTemplate.exchange(
					uriDeviceAllowedCards.replace("${id}", this.device.getId().toString()), HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<CardList>>() {
					}, new Object[0]);

			return (List<CardList>) response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getDeviceAllowedCardList", "ERROR", e);
			return new ArrayList<>();
		}
	}

	public List<AccessBiometry> getDeviceAllowedFingerPrint() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<AccessBiometry>> response = restTemplate.exchange(
					uriDeviceAllowedBiometries.replace("${id}", this.device.getId().toString()), HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<AccessBiometry>>() {
					}, new Object[0]);

			return (List<AccessBiometry>) response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getDeviceAllowedCardList", "ERROR", e);
			return new ArrayList<>();
		}
	}

	public static PersonValidationResponse validateOnlineAccess(AccessRequest accessRequest) {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(objectMapper.writeValueAsString(accessRequest),
					httpHeaderSenior);
			ResponseEntity<PersonValidationResponse> response = restTemplate.exchange(uriAccessRequest, HttpMethod.POST,
					entity, PersonValidationResponse.class, new Object[0]);

			CLogger.logSeniorDebug("validateOnlineAccess", ((PersonValidationResponse) response.getBody()).toString());
			return (PersonValidationResponse) response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("validateOnlineAccess", "ERROR", e);
			return null;
		}
	}

	public static void notifyPersonAccess(List<Access> access) {
		try {
			CLogger.logSeniorInfo("Sending notifyPersonAccess", access.toString());
			HttpEntity<String> entity = new HttpEntity<String>(objectMapper.writeValueAsString(access),
					httpHeaderSenior);
			restTemplate.exchange(uriNotifyPersonAccess, HttpMethod.POST, entity,
					new ParameterizedTypeReference<List<Access>>() {
					}, new Object[0]);

			CLogger.logSeniorInfo("Sent notifyPersonAccess", access.toString());
		} catch (Exception e) {
			CLogger.logSeniorError("notifyPersonAccess", "ERROR", e);
		}
	}

	public static PersonInfo getPersonCardAndPhotoInfo(Long managerDeviceId, Long personId, Long cardNumber) {
		try {
			String url = String.valueOf(uriDatamartPersonCardAndPhotoInfo) + "?managerDeviceId=" + managerDeviceId
					+ String.format((personId != null) ? "&personId=%s" : "&cardNumber=%s",
							new Object[] { (personId != null) ? personId.toString() : cardNumber.toString() });
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<PersonInfo> personInfo = restTemplate.exchange(url, HttpMethod.GET, entity, PersonInfo.class,
					new Object[0]);
			return (PersonInfo) personInfo.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getPersonCardInfo", "ERROR: \n" + String
					.format("Manager Device Id: %s , Person Id: %s", new Object[] { managerDeviceId, personId }), e);
			return null;
		}
	}

	public static PersonTemplates getPersonBiometries(Long managerDeviceId, Long personId) {
		try {
			String url = uriDatamartPersonFingerPrintInfo.replaceFirst("${managerDeviceId}", managerDeviceId.toString())
					.replace("${personId}", personId.toString());
			ResponseEntity<PersonTemplates> personInfo = restTemplate.exchange(url, HttpMethod.GET, null,
					PersonTemplates.class, new Object[0]);
			return (PersonTemplates) personInfo.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getPersonBiometries", "ERROR: \n" + String
					.format("Manager Device Id: %s , Person Id: %s", new Object[] { managerDeviceId, personId }), e);
			return null;
		}
	}

	public void sendDeviceStatus(DeviceStatus deviceStatus) {
		try {
			HttpEntity<DeviceStatus> entity = new HttpEntity<DeviceStatus>(deviceStatus, httpHeaderSenior);
			restTemplate.exchange(uriDeviceStatus, HttpMethod.POST, entity, String.class);
		} catch (Exception e) {
			CLogger.logSeniorError("sendDeviceStatus",
					"ERROR: \n" + String.format("Manager Device Id: %s , Pendency Id: %s",
							deviceStatus.getManagerDeviceId(), deviceStatus.getPendencyId()),
					e);
		}

	}
}
