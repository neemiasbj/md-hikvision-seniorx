 package br.com.seniorx.services;
 
 import br.com.seniorx.models.Access;
 import br.com.seniorx.models.AccessBiometry;
 import br.com.seniorx.models.AccessRequest;
 import br.com.seniorx.models.AllPendency;
 import br.com.seniorx.models.AreaControlList;
 import br.com.seniorx.models.CardList;
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
 import com.fasterxml.jackson.databind.ObjectMapper;
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
 import org.springframework.util.MultiValueMap;
 import org.springframework.web.client.RestTemplate;
 
 
 public class SeniorApiService
 {
   private ManagerDevice device = null;
   private static ObjectMapper objectMapper = new ObjectMapper();
   
   private static String seniorPartnerKey = MiddlewareUtilPropertiesImpl.getValor("senior.partner_key");
   private static String seniorDriverKey = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");
   private static String seniorEndpoint = MiddlewareUtilPropertiesImpl.getValor("senior.api.sdk.uri");
   
   private static String uriDevice = String.format("%s/device", new Object[] { seniorEndpoint });
   private static String uriDevices = String.format("%s/device/", new Object[] { seniorEndpoint });
   private static String uriAreaControl = String.format("%s/datamart/areacontrol", new Object[] { seniorEndpoint });
   private static String uriNotifyDeviceEvent = String.format("%s/notify/device/event", new Object[] { seniorEndpoint });
   private static String uriDevicePendencies = String.format("%s/pendency/device", new Object[] { seniorEndpoint });
   private static String uriPendencyUpdate = String.format("%s/pendency/update", new Object[] { seniorEndpoint });
   private static String uriPendencySuccess = String.format("%s/pendency/success", new Object[] { seniorEndpoint });
   private static String uriDeviceAllowedPhotos = String.format("%s/device/access/${id}/photo", new Object[] { seniorEndpoint });
   private static String uriDeviceAllowedCards = String.format("%s/device/access/${id}/card", new Object[] { seniorEndpoint });
   private static String uriDeviceAllowedBiometries = String.format("%s/device/access/${id}/biometry", new Object[] { seniorEndpoint });
   private static String uriDeviceStatus = String.format("%s/device/status", new Object[] { seniorEndpoint });
   private static String uriAccessRequest = String.format("%s/device/accessrequest", new Object[] { seniorEndpoint });
   private static String uriDriveDateTime = String.format("%s/driver/datetime", new Object[] { seniorEndpoint });
   private static String uriDeviceBiometry = String.format("%s/device/biometry", new Object[] { seniorEndpoint });
   private static String uriDatamartPersonCardAndPhotoInfo = String.format("%s/datamart/person/info", new Object[] { seniorEndpoint });
   
   private static String uriDatamartPersonFingerPrintInfo = String.format("%s/datamart/biometry?managerDeviceId=${managerDeviceId}&personId=${personId}", new Object[] { seniorEndpoint });
   private static String uriDataMartAreaControl = String.format("%s/datamart/areacontrol", new Object[] { seniorEndpoint });
   private static String uriNotifyPersonAccess = String.format("%s/notify/person/access", new Object[] { seniorEndpoint });
   
   private static final RestTemplate restTemplate = getRestTemplate();
   private static final HttpHeaders httpHeaderSenior = getHeaders();
   
   public ManagerDevice getDevice() {
     return this.device;
   }
   
   public void setDevice(ManagerDevice device) {
     this.device = device;
   }
   
   private static RestTemplate getRestTemplate() {
     Integer timeWaitingRestTemplate = 
       Integer.valueOf(MiddlewareUtilPropertiesImpl.getValor("senior.api.sdk.timeout"));
     HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
     clientHttpRequestFactory.setConnectTimeout(timeWaitingRestTemplate.intValue());
     
     return new RestTemplate((ClientHttpRequestFactory)clientHttpRequestFactory);
   }
   
   private static HttpHeaders getHeaders() {
     HttpHeaders headers = new HttpHeaders();
     headers.add("partner_key", seniorPartnerKey);
     headers.add("driver_key", seniorDriverKey);
     return headers;
   }
   
   private boolean checkDevice(String method) {
     if (this.device == null) {
       CLogger.logSeniorDebug("SENIOR SERVICE", "Device must not be null to use " + method);
       return false;
     } 
     return true;
   }
   
   public static List<ManagerDevice> getDevices() {
     try {
       HttpHeaders header = httpHeaderSenior;
       header.setContentType(MediaType.APPLICATION_JSON);
       
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<List<ManagerDevice>> response = restTemplate.exchange(uriDevices, HttpMethod.GET, entity, 
           new ParameterizedTypeReference<List<ManagerDevice>>() {  }, new Object[0]);
 
       
       List<ManagerDevice> devices = (List<ManagerDevice>)response.getBody();
       if (devices == null || devices.isEmpty()) {
         CLogger.logSeniorError("Senior", "No devices found on Senior!");
         return null;
       } 
 
       
       return devices;
     }
     catch (Exception e) {
       CLogger.logSeniorError("Status Event All Device", "Data sent to the platform. Error Equipment List", e);
       return null;
     } 
   }
 
   
   public static ManagerDevice getDevice(Long deviceId) {
     try {
       HttpHeaders header = httpHeaderSenior;
       header.setContentType(MediaType.APPLICATION_JSON);
       
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<ManagerDevice> response = restTemplate.exchange(String.valueOf(uriDevice) + "/" + deviceId, HttpMethod.GET, 
           entity, new ParameterizedTypeReference<ManagerDevice>() {  }, new Object[0]);
 
       
       return (ManagerDevice)response.getBody();
     }
     catch (Exception e) {
       CLogger.logSeniorError("SENIOR SERVICE", "getDevice", e);
       return null;
     } 
   }
   
   public AllPendency getDevicePendencies(Long deviceId) {
     if (!checkDevice("getDevicePendencies")) {
       return null;
     }
     try {
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<AllPendency> response = restTemplate.exchange(String.valueOf(uriDevicePendencies) + "/" + deviceId, 
           HttpMethod.GET, entity, AllPendency.class, new Object[0]);
       
       AllPendency allPendencies = (AllPendency)response.getBody();
       return allPendencies;
     } catch (Exception e) {
       CLogger.logSeniorError("getDevicePendencies", "getDevice", e);
       return null;
     } 
   }
   
   public AreaControlList getAreaById(Long areaId) {
     try {
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<List<AreaControlList>> response = restTemplate.exchange(uriAreaControl, HttpMethod.GET, 
           entity, new ParameterizedTypeReference<List<AreaControlList>>() {  }, new Object[0]);
 
       
       List<AreaControlList> areasControl = (List<AreaControlList>)response.getBody();
       if (areasControl == null || areasControl.isEmpty()) {
         CLogger.logSeniorError("Senior", "No area control found for " + areaId);
         return null;
       } 
       
       for (AreaControlList areaControl : areasControl) {
         if (areaControl.getId() == areaId)
           return areaControl; 
       }  return null;
     } catch (Exception e) {
       CLogger.logSeniorError("getAreaById: " + areaId, "ERROR", e);
       return null;
     } 
   }
   
   public void sendEventList(List<Event> events) {
     try {
       CLogger.logSeniorDebug("sendEventList", Utils.listToJson(events));
       
       HttpEntity<List<Event>> entity = new HttpEntity(events, (MultiValueMap)httpHeaderSenior);
       restTemplate.postForObject(uriNotifyDeviceEvent, entity, String.class, new Object[0]);
       CLogger.logSeniorDebug("sendEventList", "SUCCESS");
     }
     catch (Exception e) {
       CLogger.logSeniorError("sendEventList", "ERROR", e);
     } 
   }
   
   public void updatePendenciesExecuted(List<PendencyExecuted> pendenciesList) {
     try {
       HttpEntity<List<PendencyExecuted>> entity = new HttpEntity(pendenciesList, 
           (MultiValueMap)httpHeaderSenior);
       ResponseEntity responseEntity = restTemplate.exchange(uriPendencySuccess, HttpMethod.POST, entity, String.class, new Object[0]);
       CLogger.logSeniorDebug("updatePendenciesExecuted", "OK: " + (String)responseEntity.getBody());
     } catch (Exception e) {
       CLogger.logSeniorError("updatePendenciesExecuted", "ERROR", e);
     } 
   }
   
   public void updatePendenciesStatus(List<PendencyUpdated> pendenciesList) {
     try {
       HttpEntity<List<PendencyUpdated>> entity = new HttpEntity(pendenciesList, 
           (MultiValueMap)httpHeaderSenior);
       ResponseEntity responseEntity = restTemplate.exchange(uriPendencyUpdate, HttpMethod.POST, entity, String.class, new Object[0]);
       CLogger.logSeniorDebug("UPDATE PENDENCY", "OK: " + (String)responseEntity.getBody());
     } catch (Exception e) {
       CLogger.logSeniorError("updatePendenciesStatus", "ERROR", e);
     } 
   }
 
   
   public List<PersonPhotoTemplates> getDeviceAllowedFacialList() {
     try {
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       String url = uriDeviceAllowedPhotos.replace("${id}", this.device.getId().toString());
       ResponseEntity<List<PersonPhotoTemplates>> response = restTemplate.exchange(url, HttpMethod.GET, entity, 
           new ParameterizedTypeReference<List<PersonPhotoTemplates>>() {  }, new Object[0]);
       
       return (List<PersonPhotoTemplates>)response.getBody();
     } catch (Exception e) {
       CLogger.logSeniorError("getDeviceAllowedFacialList", "ERROR", e);
       return new ArrayList<>();
     } 
   }
   
   public List<CardList> getDeviceAllowedCardList() {
     try {
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<List<CardList>> response = restTemplate.exchange(
           uriDeviceAllowedCards.replace("${id}", this.device.getId().toString()), HttpMethod.GET, entity, 
           new ParameterizedTypeReference<List<CardList>>() {  }, new Object[0]);
       
       return (List<CardList>)response.getBody();
     } catch (Exception e) {
       CLogger.logSeniorError("getDeviceAllowedCardList", "ERROR", e);
       return new ArrayList<>();
     } 
   }
   
   public List<AccessBiometry> getDeviceAllowedFingerPrint() {
     try {
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<List<AccessBiometry>> response = restTemplate.exchange(
           uriDeviceAllowedBiometries.replace("${id}", this.device.getId().toString()), HttpMethod.GET, entity, 
           new ParameterizedTypeReference<List<AccessBiometry>>() {  }, new Object[0]);
       
       return (List<AccessBiometry>)response.getBody();
     } catch (Exception e) {
       CLogger.logSeniorError("getDeviceAllowedCardList", "ERROR", e);
       return new ArrayList<>();
     } 
   }
   
   public static PersonValidationResponse validateOnlineAccess(AccessRequest accessRequest) {
     try {
       HttpEntity<String> entity = new HttpEntity(objectMapper.writeValueAsString(accessRequest), 
           (MultiValueMap)httpHeaderSenior);
       ResponseEntity<PersonValidationResponse> response = restTemplate.exchange(uriAccessRequest, HttpMethod.POST, 
           entity, PersonValidationResponse.class, new Object[0]);
       
       CLogger.logSeniorDebug("validateOnlineAccess", ((PersonValidationResponse)response.getBody()).toString());
       return (PersonValidationResponse)response.getBody();
     } catch (Exception e) {
       CLogger.logSeniorError("validateOnlineAccess", "ERROR", e);
       return null;
     } 
   }
   
   public static void notifyPersonAccess(List<Access> access) {
     try {
       CLogger.logSeniorInfo("Sending notifyPersonAccess", access.toString());
       HttpEntity<String> entity = new HttpEntity(objectMapper.writeValueAsString(access), 
           (MultiValueMap)httpHeaderSenior);
       restTemplate.exchange(uriNotifyPersonAccess, HttpMethod.POST, entity, 
           new ParameterizedTypeReference<List<Access>>() {  }, new Object[0]);
       
       CLogger.logSeniorInfo("Sent notifyPersonAccess", access.toString());
     } catch (Exception e) {
       CLogger.logSeniorError("notifyPersonAccess", "ERROR", e);
     } 
   }
   
   public static PersonInfo getPersonCardAndPhotoInfo(Long managerDeviceId, Long personId, Long cardNumber) {
     try {
       String url = String.valueOf(uriDatamartPersonCardAndPhotoInfo) + "?managerDeviceId=5" + 
         String.format((personId != null) ? "&personId=%s" : "&cardNumber=%s", new Object[] {
             (personId != null) ? personId.toString() : cardNumber.toString() });
       HttpEntity<String> entity = new HttpEntity((MultiValueMap)httpHeaderSenior);
       ResponseEntity<PersonInfo> personInfo = restTemplate.exchange(url, HttpMethod.GET, entity, 
           PersonInfo.class, new Object[0]);
       return (PersonInfo)personInfo.getBody();
     } catch (Exception e) {
       CLogger.logSeniorError("getPersonCardInfo", "ERROR: \n" + 
           String.format("Manager Device Id: $s , Person Id: %s", new Object[] { managerDeviceId, personId }), e);
       return null;
     } 
   }
   
   public static PersonTemplates getPersonBiometries(Long managerDeviceId, Long personId) {
     try {
       String url = uriDatamartPersonFingerPrintInfo.replaceFirst("${managerDeviceId}", managerDeviceId.toString())
         .replace("${personId}", personId.toString());
       ResponseEntity<PersonTemplates> personInfo = restTemplate.exchange(url, HttpMethod.GET, null, 
           PersonTemplates.class, new Object[0]);
       return (PersonTemplates)personInfo.getBody();
     } catch (Exception e) {
       CLogger.logSeniorError("getPersonCardInfo", "ERROR: \n" + 
           String.format("Manager Device Id: $s , Person Id: %s", new Object[] { managerDeviceId, personId }), e);
       return null;
     } 
   }
 }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\services\SeniorApiService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
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

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.seniorx.models.Access;
import br.com.seniorx.models.AccessBiometry;
import br.com.seniorx.models.AccessRequest;
import br.com.seniorx.models.AllPendency;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.CardList;
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

public class SeniorApiService {

	private ManagerDevice device = null;
	private static ObjectMapper objectMapper = new ObjectMapper();

	private static String seniorPartnerKey = MiddlewareUtilPropertiesImpl.getValor("senior.partner_key");
	private static String seniorDriverKey = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");
	private static String seniorEndpoint = MiddlewareUtilPropertiesImpl.getValor("senior.api.sdk.uri");

	private static String uriDevice = String.format("%s/device", seniorEndpoint);
	private static String uriDevices = String.format("%s/device/", seniorEndpoint);
	private static String uriAreaControl = String.format("%s/datamart/areacontrol", seniorEndpoint);
	private static String uriNotifyDeviceEvent = String.format("%s/notify/device/event", seniorEndpoint);
	private static String uriDevicePendencies = String.format("%s/pendency/device", seniorEndpoint);
	private static String uriPendencyUpdate = String.format("%s/pendency/update", seniorEndpoint);
	private static String uriPendencySuccess = String.format("%s/pendency/success", seniorEndpoint);
	private static String uriDeviceAllowedPhotos = String.format("%s/device/access/${id}/photo", seniorEndpoint);
	private static String uriDeviceAllowedCards = String.format("%s/device/access/${id}/card", seniorEndpoint);
	private static String uriDeviceAllowedBiometries = String.format("%s/device/access/${id}/biometry", seniorEndpoint);
	private static String uriDeviceStatus = String.format("%s/device/status", seniorEndpoint);
	private static String uriAccessRequest = String.format("%s/device/accessrequest", seniorEndpoint);
	private static String uriDriveDateTime = String.format("%s/driver/datetime", seniorEndpoint);
	private static String uriDeviceBiometry = String.format("%s/device/biometry", seniorEndpoint);
	private static String uriDatamartPersonCardAndPhotoInfo = String.format("%s/datamart/person/info", seniorEndpoint);
	private static String uriDatamartPersonFingerPrintInfo = String
			.format("%s/datamart/biometry?managerDeviceId=${managerDeviceId}&personId=${personId}", seniorEndpoint);
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
		Integer timeWaitingRestTemplate = Integer
				.valueOf(MiddlewareUtilPropertiesImpl.getValor("senior.api.sdk.timeout"));
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
			ResponseEntity<List<ManagerDevice>> response = restTemplate.exchange(uriDevices, HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<ManagerDevice>>() {
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
			ResponseEntity<ManagerDevice> response = restTemplate.exchange(uriDevice + "/" + deviceId, HttpMethod.GET,
					entity, new ParameterizedTypeReference<ManagerDevice>() {
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
			ResponseEntity<AllPendency> response = restTemplate.exchange(uriDevicePendencies + "/" + deviceId,
					HttpMethod.GET, entity, AllPendency.class);

			AllPendency allPendencies = response.getBody();
			return allPendencies;
		} catch (Exception e) {
			CLogger.logSeniorError("getDevicePendencies", "getDevice", e);
			return null;
		}
	}

	public AreaControlList getAreaById(Long areaId) {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<AreaControlList>> response = restTemplate.exchange(uriAreaControl, HttpMethod.GET,
					entity, new ParameterizedTypeReference<List<AreaControlList>>() {
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
			CLogger.logSeniorError("getAreaById: " + areaId, "ERROR", e);
			return null;
		}
	}

	public void sendEventList(List<Event> events) {
		try {
			CLogger.logSeniorDebug("sendEventList", Utils.listToJson(events));

			HttpEntity<List<Event>> entity = new HttpEntity<>(events, httpHeaderSenior);
			restTemplate.postForObject(uriNotifyDeviceEvent, entity, String.class);
			CLogger.logSeniorDebug("sendEventList", "SUCCESS");

		} catch (Exception e) {
			CLogger.logSeniorError("sendEventList", "ERROR", e);
		}
	}

	public void updatePendenciesExecuted(List<PendencyExecuted> pendenciesList) {
		try {
			HttpEntity<List<PendencyExecuted>> entity = new HttpEntity<List<PendencyExecuted>>(pendenciesList,
					httpHeaderSenior);
			HttpEntity<String> res = restTemplate.exchange(uriPendencySuccess, HttpMethod.POST, entity, String.class);
			CLogger.logSeniorDebug("updatePendenciesExecuted", "OK: " + res.getBody());
		} catch (Exception e) {
			CLogger.logSeniorError("updatePendenciesExecuted", "ERROR", e);
		}
	}

	public void updatePendenciesStatus(List<PendencyUpdated> pendenciesList) {
		try {
			HttpEntity<List<PendencyUpdated>> entity = new HttpEntity<List<PendencyUpdated>>(pendenciesList,
					httpHeaderSenior);
			HttpEntity<String> ls = restTemplate.exchange(uriPendencyUpdate, HttpMethod.POST, entity, String.class);
			CLogger.logSeniorDebug("UPDATE PENDENCY", "OK: " + ls.getBody());
		} catch (Exception e) {
			CLogger.logSeniorError("updatePendenciesStatus", "ERROR", e);
		}

	}

	public List<PersonPhotoTemplates> getDeviceAllowedFacialList() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			String url = uriDeviceAllowedPhotos.replace("${id}", device.getId().toString());
			ResponseEntity<List<PersonPhotoTemplates>> response = restTemplate.exchange(url, HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<PersonPhotoTemplates>>() {
					});
			return response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getDeviceAllowedFacialList", "ERROR", e);
			return new ArrayList<PersonPhotoTemplates>();
		}
	}

	public List<CardList> getDeviceAllowedCardList() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<CardList>> response = restTemplate.exchange(
					uriDeviceAllowedCards.replace("${id}", device.getId().toString()), HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<CardList>>() {
					});
			return response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getDeviceAllowedCardList", "ERROR", e);
			return new ArrayList<CardList>();
		}
	}

	public List<AccessBiometry> getDeviceAllowedFingerPrint() {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<List<AccessBiometry>> response = restTemplate.exchange(
					uriDeviceAllowedBiometries.replace("${id}", device.getId().toString()), HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<AccessBiometry>>() {
					});
			return response.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getDeviceAllowedCardList", "ERROR", e);
			return new ArrayList<AccessBiometry>();
		}
	}

	public static PersonValidationResponse validateOnlineAccess(AccessRequest accessRequest) {
		try {
			HttpEntity<String> entity = new HttpEntity<String>(objectMapper.writeValueAsString(accessRequest),
					httpHeaderSenior);
			ResponseEntity<PersonValidationResponse> response = restTemplate.exchange(uriAccessRequest, HttpMethod.POST,
					entity, PersonValidationResponse.class);

			CLogger.logSeniorDebug("validateOnlineAccess", response.getBody().toString());
			return response.getBody();
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
					});
			CLogger.logSeniorInfo("Sent notifyPersonAccess", access.toString());
		} catch (Exception e) {
			CLogger.logSeniorError("notifyPersonAccess", "ERROR", e);
		}
	}

	public static PersonInfo getPersonCardAndPhotoInfo(Long managerDeviceId, Long personId, Long cardNumber) {
		try {
			String url = uriDatamartPersonCardAndPhotoInfo + "?managerDeviceId=5"
					+ String.format(personId != null ? "&personId=%s" : "&cardNumber=%s",
							personId != null ? personId.toString() : cardNumber.toString());
			HttpEntity<String> entity = new HttpEntity<String>(httpHeaderSenior);
			ResponseEntity<PersonInfo> personInfo = restTemplate.exchange(url, HttpMethod.GET, entity,
					PersonInfo.class);
			return personInfo.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getPersonCardInfo", "ERROR: " + "\n"
					+ String.format("Manager Device Id: $s , Person Id: %s", managerDeviceId, personId), e);
			return null;
		}
	}

	public static PersonTemplates getPersonBiometries(Long managerDeviceId, Long personId) {
		try {
			String url = uriDatamartPersonFingerPrintInfo.replaceFirst("${managerDeviceId}", managerDeviceId.toString())
					.replace("${personId}", personId.toString());
			ResponseEntity<PersonTemplates> personInfo = restTemplate.exchange(url, HttpMethod.GET, null,
					PersonTemplates.class);
			return personInfo.getBody();
		} catch (Exception e) {
			CLogger.logSeniorError("getPersonCardInfo", "ERROR: " + "\n"
					+ String.format("Manager Device Id: $s , Person Id: %s", managerDeviceId, personId), e);
			return null;
		}
	}

}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
