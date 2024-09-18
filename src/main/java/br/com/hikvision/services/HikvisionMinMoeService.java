package br.com.hikvision.services;

import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import br.com.hikvision.minmoe.enums.MinMoeCheckChannelType;
import br.com.hikvision.minmoe.models.AcsConfigRequest;
import br.com.hikvision.minmoe.models.DeviceInfo;
import br.com.hikvision.minmoe.models.ExcludePhotoRequest;
import br.com.hikvision.minmoe.models.HttpHostNotification;
import br.com.hikvision.minmoe.models.HttpHostNotificationList;
import br.com.hikvision.minmoe.models.IncludeFaceRequest;
import br.com.hikvision.minmoe.models.SearchPhotoRequest;
import br.com.hikvision.minmoe.models.SearchPhotoResponse;
import br.com.hikvision.minmoe.models.SearchPhotoResponse.Match;
import br.com.hikvision.minmoe.models.User;
import br.com.seniorx.models.ManagerDevice;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.utils.DigestAuthRestTemplate;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

public class HikvisionMinMoeService {
	DigestAuthRestTemplate digestAuthRestTemplate;
	Gson gson = new Gson();

	private ManagerDevice device;
	private String deviceUri;
	private static final String DEVICE_INFO_PATH = "/ISAPI/System/deviceInfo";
	private static final String SET_HOST_PATH = "/ISAPI/Event/notification/httpHosts";
	private static final String SET_REMOTE_CHECK_PATH = "/ISAPI/AccessControl/AcsCfg?format=json";
	private static final String INCLUDE_USER_PATH = "/ISAPI/AccessControl/UserInfo/SetUp?format=json";
	private static final String INCLUDE_FACE_PATH = "/ISAPI/Intelligent/FDLib/FaceDataRecord?format=json";
	private static final String EXCLUDE_FACE_PATH = "/ISAPI/Intelligent/FDLib/FDSearch/Delete?format=json&FDID=1&faceLibType=blackFD";
	private static final String CHECK_FACE_PATH = "/ISAPI/Intelligent/FDLib/FDSearch?format=json";

	public HikvisionMinMoeService(ManagerDevice device) {
		this.device = device;
		this.deviceUri = buildDeviceUri();
		digestAuthRestTemplate = new DigestAuthRestTemplate(device.getUsername(), device.getPassword());
	}

	private String buildDeviceUri() {
		String uri = String.format("http://%s%s", device.getNetworkIdentification(), (device.getNetworkPort() == 80 ? "" : ":" + device.getNetworkPort()));
		CLogger.logHikivisionDebug("MINMOE", "Device uri: " + uri);
		return uri;
	}

	public static <T> String toXml(T objectOrList, Class<T> clazz) throws JAXBException {
		JAXBContext context;

		if (objectOrList instanceof List<?>) {
			context = JAXBContext.newInstance(ListWrapper.class, clazz);
			ListWrapper<T> wrapper = new ListWrapper<>((List<T>) objectOrList);
			return marshalToXml(wrapper, context);
		} else {
			context = JAXBContext.newInstance(clazz);
			return marshalToXml(objectOrList, context);
		}
	}

	// Wrapper class for List
	@XmlRootElement(name = "list")
	public static class ListWrapper<T> {
		private List<T> items;

		public ListWrapper() {
		}

		public ListWrapper(List<T> items) {
			this.items = items;
		}

		@XmlElement(name = "item")
		public List<T> getItems() {
			return items;
		}

		public void setItems(List<T> items) {
			this.items = items;
		}
	}

	private static <T> String marshalToXml(T object, JAXBContext context) throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		StringWriter writer = new StringWriter();
		marshaller.marshal(object, writer);
		return writer.toString();
	}

	public DeviceInfo getDeviceInfo() {
		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + DEVICE_INFO_PATH, HttpMethod.GET, null);
		if (response == null)
			return null;

		try {
			DeviceInfo deviceInfo = deserializeXmlResponse(response.getBody(), DeviceInfo.class);
			return deviceInfo;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean configureDevice(ManagerDevice device) {

		try {
			if (!setHost())
				return false;

			if (!enableRemoteCheck())
				return false;

			return true;
		} catch (Exception e) {
			CLogger.logHikivisionError("SET HOST URL", e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public boolean setHost() {
		try {

			HttpHostNotification notification = new HttpHostNotification();
			notification.setId("1");
			notification.setUrl("/api/device/minmoe/webhook");
			notification.setProtocolType("HTTP");
			notification.setParameterFormatType("JSON");
			notification.setAddressingFormatType("ipaddress");
			notification.setIpAddress("http://177.81.228.104/");
			notification.setPortNo(55975);
			notification.setHttpAuthenticationMethod("none");

			List<HttpHostNotification> notifications = new ArrayList<>();
			notifications.add(notification);

			HttpHostNotificationList notificationList = new HttpHostNotificationList();
			notificationList.setVersion("2.0");
			notificationList.setHttpHostNotification(notifications);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.TEXT_XML);

			HttpEntity<String> entity = new HttpEntity<String>(toXml(notificationList, HttpHostNotificationList.class), headers);

			digestAuthRestTemplate.executeWithDigestAuth(deviceUri + SET_HOST_PATH, HttpMethod.PUT, entity);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			CLogger.logHikivisionError("setHost", e.getMessage());
			return false;
		}
	}

	public boolean enableRemoteCheck() {

		DeviceInfo deviceInfo = getDeviceInfo();

		if (deviceInfo.getModel().contains("DS-K1T61")) {
			setRemoteCheck(true, MinMoeCheckChannelType.PRIVATE_SDK);
		} else // (deviceInfo.getModel().contains("DS-K1T341") ||
				// deviceInfo.getModel().contains("DS-K1T671") ||
				// deviceInfo.getModel().contains("DS-K1T672"))
		{
			setRemoteCheck(true, MinMoeCheckChannelType.ISAPI_LISTEN);
		}

		return true;
	}

	public boolean setRemoteCheck(boolean active, MinMoeCheckChannelType checkChannelType) {
		try {

			AcsConfigRequest.AcsCfg acsCfg = new AcsConfigRequest.AcsCfg();
			acsCfg.setRemoteCheckDoorEnabled(true);
			acsCfg.setCheckChannelType(checkChannelType.getVersion());

			AcsConfigRequest request = new AcsConfigRequest();
			request.setAcsCfg(acsCfg);

			HttpEntity<String> entity = new HttpEntity<String>(gson.toJson(request));
			ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + SET_REMOTE_CHECK_PATH, HttpMethod.PUT, entity);
			System.out.println("setRemoteCheck response: " + response.getBody());

			return true;

		} catch (Exception e) {
			CLogger.logHikivisionError("setRemoteCheck", e.getMessage());
			return false;
			// TODO: handle exception
		}
	}

	public boolean includeUser(User user) {
		try {// Setup headers
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			// Create the HTTP entity
			HttpEntity<User> entity = new HttpEntity<>(user, headers);
			ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + INCLUDE_USER_PATH, HttpMethod.PUT, entity);
			return true;
		} catch (Exception e) {
			CLogger.logHikivisionError("addUsers", e.getMessage());
			return false;
		}
	}

	public boolean includePhoto(IncludeFaceRequest faceDataRequest, String photoUrl) {
		try {
			URL url = new URL(photoUrl);
			InputStream imageInputStream = url.openStream();

			byte[] imageBytes = IOUtils.toByteArray(imageInputStream);

			MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();

			body.add("FaceDataRecord", gson.toJson(faceDataRequest));

			Resource imageResource = new ByteArrayResource(imageBytes) {
				@Override
				public String getFilename() {
					return "image.jpg";
				}
			};
			body.add("FaceImage", imageResource);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.MULTIPART_FORM_DATA);

			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
			digestAuthRestTemplate.executeWithDigestAuth(deviceUri + INCLUDE_FACE_PATH, HttpMethod.POST, requestEntity);

			CLogger.logHikivisionDebug("includeFace", "OK");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			CLogger.logHikivisionError("includeFace", e.getMessage());
			return false;
		}
	}

	public boolean searchPhoto(SearchPhotoRequest searchPhoto) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<SearchPhotoRequest> entity = new HttpEntity<>(searchPhoto, headers);

			ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + CHECK_FACE_PATH, HttpMethod.POST, entity);

			String jsonResponse = response.getBody();
			ObjectMapper objectMapper = new ObjectMapper();
			SearchPhotoResponse responseData = objectMapper.readValue(jsonResponse, SearchPhotoResponse.class);

			if (responseData.getMatchList() != null)
				for (Match match : responseData.getMatchList())
					if (match.getFPID().equals(searchPhoto.getFPID()))
						return true;

			CLogger.logHikivisionDebug("searchPhoto", "OK");
			return false;
		} catch (Exception e) {
			CLogger.logHikivisionError("searchPhoto", e.getMessage());
			return false;
		}
	}

	public boolean excludePhoto(ExcludePhotoRequest faceDataRequest) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<ExcludePhotoRequest> entity = new HttpEntity<>(faceDataRequest, headers);

			digestAuthRestTemplate.executeWithDigestAuth(deviceUri + EXCLUDE_FACE_PATH, HttpMethod.PUT, entity);

			CLogger.logHikivisionDebug("excludePhoto", "OK");
			return true;
		} catch (Exception e) {
			CLogger.logHikivisionError("excludePhoto", e.getMessage());
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	private <T> T deserializeXmlResponse(String xmlResponse, Class<T> responseType) throws JAXBException {
		if (xmlResponse != null) {
			JAXBContext jaxbContext = JAXBContext.newInstance(responseType);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			return (T) unmarshaller.unmarshal(new StringReader(xmlResponse));
		}
		return null;
	}

}
