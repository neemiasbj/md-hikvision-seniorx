
package br.com.hikvision.services;

import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.google.gson.Gson;

import br.com.hikvision.minmoe.enums.MinMoeCheckChannelType;
import br.com.hikvision.minmoe.enums.RemoteCheckCfgPassmode;
import br.com.hikvision.minmoe.enums.RemoteCheckCfgUserType;
import br.com.hikvision.minmoe.models.AcsCfgRequest;
import br.com.hikvision.minmoe.models.DateTime;
import br.com.hikvision.minmoe.models.DeleteUsers;
import br.com.hikvision.minmoe.models.DeviceInfo;
<<<<<<< HEAD
import br.com.hikvision.minmoe.models.ExcludePhotoRequest;
import br.com.hikvision.minmoe.models.ExcludeUserCard;
import br.com.hikvision.minmoe.models.ExcludeUserFingerPrint;
=======
import br.com.hikvision.minmoe.models.ExcludeUserCard;
import br.com.hikvision.minmoe.models.ExcludeUserFingerPrint;
import br.com.hikvision.minmoe.models.ExcludeUserPhoto;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
import br.com.hikvision.minmoe.models.HttpHostNotification;
import br.com.hikvision.minmoe.models.HttpHostNotificationList;
import br.com.hikvision.minmoe.models.IncludeUser;
import br.com.hikvision.minmoe.models.IncludeUserCard;
<<<<<<< HEAD
import br.com.hikvision.minmoe.models.IncludeUserFaceRequest;
=======
import br.com.hikvision.minmoe.models.IncludeUserFace;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
import br.com.hikvision.minmoe.models.IncludeUserFingerPrint;
import br.com.hikvision.minmoe.models.NamespaceStrippingReader;
import br.com.hikvision.minmoe.models.RemoteCheckConfig;
import br.com.hikvision.minmoe.models.RemoteCheckEventResponse;
import br.com.hikvision.minmoe.models.RemoteControlDoor;
import br.com.hikvision.minmoe.models.RequestExecutionResponseJson;
import br.com.hikvision.minmoe.models.RequestExecutionResponseXml;
<<<<<<< HEAD
import br.com.hikvision.minmoe.models.SearchPhotoRequest;
import br.com.hikvision.minmoe.models.SearchPhotoResponse;
=======
import br.com.hikvision.minmoe.models.SearchPhoto;
import br.com.hikvision.minmoe.models.SearchPhotoResponse;
import br.com.hikvision.minmoe.models.SearchPhotoResponse.Match;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
import br.com.hikvision.minmoe.utils.HikbisionDigestAuthRestUtil;
import br.com.seniorx.models.ExtensibleProperty;
import br.com.seniorx.models.ManagerDevice;
import br.com.thidi.middleware.resource.CLogger;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

public class HikvisionMinMoeService {
	HikbisionDigestAuthRestUtil digestAuthRestTemplate;
	ObjectMapper objectMapper = new ObjectMapper();
	Gson gson = new Gson();

	private ManagerDevice device;
	private String deviceUri;
	private static final String DEVICE_INFO_PATH = "/ISAPI/System/deviceInfo";
	private static final String SET_HOST_PATH = "/ISAPI/Event/notification/httpHosts";
	private static final String SET_REMOTE_CHECK_PATH = "/ISAPI/AccessControl/AcsCfg?format=json";
	private static final String SET_REMOTE_CHECK_CFG_PATH = "/ISAPI/AccessControl/remoteCheckCfg?format=json";
	private static final String SET_DATE_TIME_PATH = "/ISAPI/System/time";
	private static final String ACCESS_CONTROL_PATH = "/ISAPI/AccessControl/remoteCheck?format=json";
	private static final String INCLUDE_USER_PATH = "/ISAPI/AccessControl/UserInfo/SetUp?format=json";
	private static final String INCLUDE_FACE_PATH = "/ISAPI/Intelligent/FDLib/FaceDataRecord?format=json";
	private static final String INCLUDE_CARD_PATH = "/ISAPI/AccessControl/CardInfo/SetUp?format=json";
	private static final String INCLUDE_FINGERPRINT_PATH = "/ISAPI/AccessControl/FingerPrint/SetUp?format=json";
	private static final String EXCLUDE_USERS_PATH = "/ISAPI/AccessControl/UserInfo/Delete?format=json";
	private static final String EXCLUDE_FACE_PATH = "/ISAPI/Intelligent/FDLib/FDSearch/Delete?format=json&FDID=1&faceLibType=blackFD";
	private static final String EXCLUDE_CARD_PATH = "/ISAPI/AccessControl/CardInfo/Delete?format=json";
	private static final String EXCLUDE_FINGERPRINT_PATH = "/ISAPI/AccessControl/FingerPrint/Delete?format=json";
	private static final String SEARCH_FACE_PATH = "/ISAPI/Intelligent/FDLib/FDSearch?format=json";
	private static final String REMOTE_CONTROL_DOOR_PATH = "/ISAPI/AccessControl/RemoteControl/door/65535";

	public HikvisionMinMoeService(ManagerDevice device) {
		this.device = device;
		this.deviceUri = buildDeviceUri();
<<<<<<< HEAD
		this.digestAuthRestTemplate = new HikbisionDigestAuthRestUtil(device.getUsername(), device.getPassword());
		this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
	}

	private String buildDeviceUri() {
		String uri = String.format("http://%s%s", new Object[] { this.device.getNetworkIdentification(),
				(this.device.getNetworkPort().intValue() == 80) ? "" : (":" + this.device.getNetworkPort()) });
		CLogger.logHikvisionDebug("MINMOE", "Device uri: " + uri);
=======
		digestAuthRestTemplate = new HikbisionDigestAuthRestUtil(device.getUsername(), device.getPassword());
		objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
	}

	private String buildDeviceUri() {
		String uri = String.format("http://%s%s", device.getNetworkIdentification(),
				(device.getNetworkPort() == 80 ? "" : ":" + device.getNetworkPort()));
		CLogger.logHikivisionDebug("MINMOE", "Device uri: " + uri);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		return uri;
	}

	public static <T> String toXml(T objectOrList, Class<T> clazz) throws JAXBException {
		if (objectOrList instanceof List) {
			JAXBContext jAXBContext = JAXBContext.newInstance(new Class[] { ListWrapper.class, clazz });
			ListWrapper<T> wrapper = new ListWrapper<>((List<T>) objectOrList);
			return marshalToXml(wrapper, jAXBContext);
		}
		JAXBContext context = JAXBContext.newInstance(new Class[] { clazz });
		return marshalToXml(objectOrList, context);
	}

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
			return this.items;
		}

		public void setItems(List<T> items) {
			this.items = items;
		}
	}

	private static <T> String marshalToXml(T object, JAXBContext context) throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);

		StringWriter writer = new StringWriter();
		marshaller.marshal(object, writer);
		return writer.toString();
	}

	public DeviceInfo getDeviceInfo() throws Exception {
<<<<<<< HEAD

		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/System/deviceInfo", HttpMethod.GET, null);
		if (response == null) {
			return null;
		}
		DeviceInfo deviceInfo = deserializeXmlResponse((String) response.getBody(), DeviceInfo.class);
=======
		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + DEVICE_INFO_PATH,
				HttpMethod.GET, null);
		if (response == null)
			return null;

		DeviceInfo deviceInfo = deserializeXmlResponse(response.getBody(), DeviceInfo.class);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		return deviceInfo;
	}

	public boolean configureDevice(ManagerDevice device) throws Exception {
<<<<<<< HEAD
		if (!setHost(device)) {
			return false;
		}
		if (!enableRemoteCheck()) {
			return false;
		}
		RemoteCheckConfig.RemoteCheckCfg cfg = new RemoteCheckConfig.RemoteCheckCfg(
				RemoteCheckCfgUserType.NORMAL_VISITO_UNKNOW, RemoteCheckCfgPassmode.PASS, 5);
		RemoteCheckConfig rmChkCnf = new RemoteCheckConfig();
		rmChkCnf.setRemoteCheckCfg(cfg);

		String remoteCheckVersion = "";

		for (ExtensibleProperty prop : device.getExtensibleConfiguration().getExtensiblePropertyList()) {
			if (prop.getKey().equals("remoteCheckVersion"))
				remoteCheckVersion = prop.getKey();
		}
		if (remoteCheckVersion.equals("")) {
			CLogger.logHikvisionInfo("configureDevice",
					"MINMOE Propriedade extensível remoteCheckVersion não encontrada!!!");
			return false;
		}

		if (remoteCheckVersion.equals("2") && !setRemoteCheckConfig(rmChkCnf, remoteCheckVersion)) {
			return false;
		}
		return true;
	}

	public boolean setHost(ManagerDevice device) throws Exception {
		if (device.getExtensibleConfiguration() == null) {
			CLogger.logHikvisionInfo("setHost", "Propriedade esxtensível esperada MINMOE não encontrada!!!");
			return false;
		}
=======
		if (!setHost(device))
			return false;

		if (!enableRemoteCheck())
			return false;

		RemoteCheckConfig.RemoteCheckCfg cfg = new RemoteCheckConfig.RemoteCheckCfg(
				RemoteCheckCfgUserType.NORMAL_VISITO_UNKNOW, RemoteCheckCfgPassmode.PASS, 5);
		RemoteCheckConfig rmChkCnf = new RemoteCheckConfig();
		rmChkCnf.setRemoteCheckCfg(cfg);

		if (!setRemoteCheckConfig(rmChkCnf))
			return false;

		return true;
	}

	public boolean setHost(ManagerDevice device) throws Exception {
		if (!device.getExtensibleConfiguration().getName().equals("MINMOE")) {
			CLogger.logHikivisionInfo("setHost", "Propriedade esxtensível esperada MINMOE não encontrada!!!");
			return false;
		}

		HttpHostNotification notification = new HttpHostNotification();
		notification.setId("1");

		for (ExtensibleProperty prop : device.getExtensibleConfiguration().getExtensiblePropertyList()) {
			if (prop.getKey().equals("uri"))
				notification.setUrl(prop.getValue());
			else if (prop.getKey().equals("protocolType"))
				notification.setProtocolType(prop.getValue());
			else if (prop.getKey().equals("parameterFormatType"))
				notification.setParameterFormatType(prop.getValue());
			else if (prop.getKey().equals("addressingFormatType"))
				notification.setAddressingFormatType(prop.getValue());
			else if (prop.getKey().equals("ipAddress"))
				notification.setIpAddress(prop.getValue());
			else if (prop.getKey().equals("portNo"))
				notification.setPortNo(Integer.valueOf(prop.getValue()));
			else if (prop.getKey().equals("httpAuthenticationMethod"))
				notification.setHttpAuthenticationMethod(prop.getValue());
		}

		List<HttpHostNotification> notifications = new ArrayList<>();
		notifications.add(notification);

		HttpHostNotificationList notificationList = new HttpHostNotificationList();
		notificationList.setVersion("2.0");
		notificationList.setHttpHostNotification(notifications);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_XML);

		HttpEntity<String> entity = new HttpEntity<String>(toXml(notificationList, HttpHostNotificationList.class),
				headers);

		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + SET_HOST_PATH,
				HttpMethod.PUT, entity);

		RequestExecutionResponseXml responseXml = fromXml(response.getBody(), RequestExecutionResponseXml.class);

		if (responseXml.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("setHost", objectMapper.writeValueAsString(responseXml));
			return false;
		}

	}

	public boolean enableRemoteCheck() throws Exception {
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

		HttpHostNotification notification = new HttpHostNotification();
		notification.setId("1");

		for (ExtensibleProperty prop : device.getExtensibleConfiguration().getExtensiblePropertyList()) {
			if (prop.getKey().equals("uri")) {
				notification.setUrl(prop.getValue());
				continue;
			}
			if (prop.getKey().equals("protocolType")) {
				notification.setProtocolType(prop.getValue());
				continue;
			}
			if (prop.getKey().equals("parameterFormatType")) {
				notification.setParameterFormatType(prop.getValue());
				continue;
			}
			if (prop.getKey().equals("addressingFormatType")) {
				notification.setAddressingFormatType(prop.getValue());
				continue;
			}
			if (prop.getKey().equals("ipAddress")) {
				notification.setIpAddress(prop.getValue());
				continue;
			}
			if (prop.getKey().equals("portNo")) {
				notification.setPortNo(Integer.valueOf(prop.getValue()).intValue());
				continue;
			}
			if (prop.getKey().equals("httpAuthenticationMethod")) {
				notification.setHttpAuthenticationMethod(prop.getValue());
			}
		}
		List<HttpHostNotification> notifications = new ArrayList<>();
		notifications.add(notification);

		HttpHostNotificationList notificationList = new HttpHostNotificationList();
		notificationList.setVersion("2.0");
		notificationList.setHttpHostNotification(notifications);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_XML);

		HttpEntity<String> entity = new HttpEntity(toXml(notificationList, HttpHostNotificationList.class),
				(MultiValueMap) headers);

		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/Event/notification/httpHosts", HttpMethod.PUT, entity);

		RequestExecutionResponseXml responseXml = fromXml((String) response.getBody(),
				RequestExecutionResponseXml.class);

		if (responseXml.getStatusCode() == 1) {
			return true;
		}
		CLogger.logHikvisionInfo("setHost", this.objectMapper.writeValueAsString(responseXml));
		return false;
	}

	public boolean enableRemoteCheck() throws Exception {
		DeviceInfo deviceInfo = getDeviceInfo();

		AcsCfgRequest request = new AcsCfgRequest();
		AcsCfgRequest.AcsCfg acsCfg = new AcsCfgRequest.AcsCfg();
		acsCfg.setRemoteCheckDoorEnabled(true);

<<<<<<< HEAD
		if (deviceInfo.getModel().contains("DS-K1T671")) {
			acsCfg.setCheckChannelType(MinMoeCheckChannelType.PRIVATE_SDK.getVersion());
		} else {
			acsCfg.setCheckChannelType(MinMoeCheckChannelType.ISAPI_LISTEN.getVersion());
		}
=======
		if (deviceInfo.getModel().contains("DS-K1T671"))
			acsCfg.setCheckChannelType(MinMoeCheckChannelType.PRIVATE_SDK.getVersion());
		else
			acsCfg.setCheckChannelType(MinMoeCheckChannelType.ISAPI_LISTEN.getVersion());

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		request.setAcsCfg(acsCfg);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

<<<<<<< HEAD
		HttpEntity<AcsCfgRequest> entity = new HttpEntity(request, (MultiValueMap) headers);
		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/AcsCfg?format=json", HttpMethod.PUT, entity);

		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
		}
		CLogger.logHikvisionInfo("setRemoteCheckConfig", this.objectMapper.writeValueAsString(includeResponse));
		return false;
	}

	public boolean setRemoteCheckConfig(RemoteCheckConfig cfg, String remoteCheckVersion) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(cfg), (MultiValueMap) headers);
		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/remoteCheckCfg?format=json", HttpMethod.PUT,
				entity);

		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
		}
		CLogger.logHikvisionInfo("setRemoteCheckConfig", this.objectMapper.writeValueAsString(includeResponse));
		return false;
	}

	public boolean setRemoteCheck(AcsCfgRequest request) throws Exception {
		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(request));
		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/AcsCfg?format=json", HttpMethod.PUT, entity);
		CLogger.logHikvisionDebug("setRemoteCheck response", (String) response.getBody());
=======
		HttpEntity<AcsCfgRequest> entity = new HttpEntity<>(request, headers);
		ResponseEntity<String> response = digestAuthRestTemplate
				.executeWithDigestAuth(deviceUri + SET_REMOTE_CHECK_PATH, HttpMethod.PUT, entity);

		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("setRemoteCheckConfig", objectMapper.writeValueAsString(includeResponse));
			return false;
		}
	}

	public boolean setRemoteCheckConfig(RemoteCheckConfig cfg) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(objectMapper.writeValueAsString(cfg), headers);
		ResponseEntity<String> response = digestAuthRestTemplate
				.executeWithDigestAuth(deviceUri + SET_REMOTE_CHECK_CFG_PATH, HttpMethod.PUT, entity);

		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("setRemoteCheckConfig", objectMapper.writeValueAsString(includeResponse));
			return false;
		}
	}

	public boolean setRemoteCheck(AcsCfgRequest request) throws Exception {
		HttpEntity<String> entity = new HttpEntity<String>(objectMapper.writeValueAsString(request));
		ResponseEntity<String> response = digestAuthRestTemplate
				.executeWithDigestAuth(deviceUri + SET_REMOTE_CHECK_PATH, HttpMethod.PUT, entity);
		CLogger.logHikivisionDebug("setRemoteCheck response", response.getBody());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

		return true;
	}

	public boolean includeUser(IncludeUser user) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

<<<<<<< HEAD
		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(user), (MultiValueMap) headers);
		this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/UserInfo/SetUp?format=json", HttpMethod.PUT,
				entity);
		return true;
	}

	public boolean includeUserPhoto(IncludeUserFaceRequest faceDataRequest, String photoUrl) throws Exception {
=======
		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(user), headers);
		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + INCLUDE_USER_PATH, HttpMethod.PUT, entity);
		return true;
	}

	public boolean includeUserPhoto(IncludeUserFace faceDataRequest, String photoUrl) throws Exception {
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		URL url = new URL(photoUrl);
		InputStream imageInputStream = url.openStream();

		byte[] imageBytes = IOUtils.toByteArray(imageInputStream);

<<<<<<< HEAD
		LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();

		ByteArrayResource byteArrayResource = new ByteArrayResource(imageBytes) {
=======
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<String, Object>();

		Resource imageResource = new ByteArrayResource(imageBytes) {
			@Override
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			public String getFilename() {
				return "image.jpg";
			}
		};

<<<<<<< HEAD
		linkedMultiValueMap.add("FaceDataRecord", this.gson.toJson(faceDataRequest));
		linkedMultiValueMap.add("FaceImage", byteArrayResource);
=======
		body.add("FaceDataRecord", gson.toJson(faceDataRequest));
		body.add("FaceImage", imageResource);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

<<<<<<< HEAD
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity(linkedMultiValueMap,
				(MultiValueMap) headers);
		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/Intelligent/FDLib/FaceDataRecord?format=json", HttpMethod.POST,
				requestEntity);

		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
		}
		CLogger.logHikvisionInfo("includeFace", this.objectMapper.writeValueAsString(includeResponse));
		return false;
=======
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + INCLUDE_FACE_PATH,
				HttpMethod.POST, requestEntity);

		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("includeFace", objectMapper.writeValueAsString(includeResponse));
			return false;
		}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	public boolean includeUserCard(IncludeUserCard request) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

<<<<<<< HEAD
		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(request),
				(MultiValueMap) headers);
		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/CardInfo/SetUp?format=json", HttpMethod.PUT,
				entity);
		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
		}
		CLogger.logHikvisionInfo("includeUserCard", this.objectMapper.writeValueAsString(includeResponse));
		return false;
=======
		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(request), headers);
		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + INCLUDE_CARD_PATH,
				HttpMethod.PUT, entity);
		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("excludePhoto", objectMapper.writeValueAsString(includeResponse));
			return false;
		}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	public boolean includeUserFingerPrint(List<IncludeUserFingerPrint> fpList, HikvisionMinMoeService minmoeService)
			throws Exception {
<<<<<<< HEAD
=======

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		for (IncludeUserFingerPrint fp : fpList) {
<<<<<<< HEAD
			HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(fp),
					(MultiValueMap) headers);
			this.digestAuthRestTemplate.executeWithDigestAuth(
					String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/FingerPrint/SetUp?format=json",
					HttpMethod.POST, entity);
=======
			HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(fp), headers);
			digestAuthRestTemplate.executeWithDigestAuth(deviceUri + INCLUDE_FINGERPRINT_PATH, HttpMethod.POST, entity);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}

		return true;
	}

	public boolean excludeUserFingerPrint(ExcludeUserFingerPrint request, HikvisionMinMoeService minmoeService)
			throws Exception {
<<<<<<< HEAD
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(request),
				(MultiValueMap) headers);
		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/FingerPrint/Delete?format=json", HttpMethod.PUT,
				entity);

		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
		}
		CLogger.logHikvisionInfo("excludeUserFingerPrint", this.objectMapper.writeValueAsString(includeResponse));
		return false;
	}

	public boolean searchUserPhoto(SearchPhotoRequest searchPhoto) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(searchPhoto),
				(MultiValueMap) headers);

		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/Intelligent/FDLib/FDSearch?format=json", HttpMethod.POST,
				entity);

		String jsonResponse = (String) response.getBody();
		SearchPhotoResponse responseData = (SearchPhotoResponse) this.objectMapper.readValue(jsonResponse,
				SearchPhotoResponse.class);

		if (responseData.getMatchList() != null)
			for (SearchPhotoResponse.Match match : responseData.getMatchList()) {
				if (match.getFPID().equals(searchPhoto.getFPID()))
					return true;
			}
		CLogger.logHikvisionDebug("searchPhoto", "OK");
		return false;
	}

	public boolean excludeUserPhoto(ExcludePhotoRequest faceDataRequest) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(faceDataRequest),
				(MultiValueMap) headers);

		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri)
						+ "/ISAPI/Intelligent/FDLib/FDSearch/Delete?format=json&FDID=1&faceLibType=blackFD",
				HttpMethod.PUT, entity);

		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
=======

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(request), headers);
		ResponseEntity<String> response = digestAuthRestTemplate
				.executeWithDigestAuth(deviceUri + EXCLUDE_FINGERPRINT_PATH, HttpMethod.PUT, entity);

		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("excludePhoto", objectMapper.writeValueAsString(includeResponse));
			return false;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
		CLogger.logHikvisionInfo("excludeUserPhoto", this.objectMapper.writeValueAsString(includeResponse));
		return false;
	}

<<<<<<< HEAD
	public boolean excludeCard(ExcludeUserCard request) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(request),
				(MultiValueMap) headers);

		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/CardInfo/Delete?format=json", HttpMethod.PUT,
				entity);

		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
=======
	public boolean searchUserPhoto(SearchPhoto searchPhoto) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(searchPhoto), headers);

		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + SEARCH_FACE_PATH,
				HttpMethod.POST, entity);

		String jsonResponse = response.getBody();
		SearchPhotoResponse responseData = objectMapper.readValue(jsonResponse, SearchPhotoResponse.class);

		if (responseData.getMatchList() != null)
			for (Match match : responseData.getMatchList())
				if (match.getFPID().equals(searchPhoto.getFPID()))
					return true;

		CLogger.logHikivisionDebug("searchPhoto", "OK");
		return false;
	}

	public boolean excludeUserPhoto(ExcludeUserPhoto faceDataRequest) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(faceDataRequest), headers);

		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + EXCLUDE_FACE_PATH,
				HttpMethod.PUT, entity);

		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("excludePhoto", objectMapper.writeValueAsString(includeResponse));
			return false;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
		CLogger.logHikvisionInfo("excludePhoto", this.objectMapper.writeValueAsString(includeResponse));
		return false;
	}

<<<<<<< HEAD
	public boolean excludeAllUsers() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		DeleteUsers.UserInfoDelCondDetails userInfoDelCondDetails = new DeleteUsers.UserInfoDelCondDetails();
		DeleteUsers userInfoDelCond = new DeleteUsers(userInfoDelCondDetails);

		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(userInfoDelCond),
				(MultiValueMap) headers);

		ResponseEntity<String> response = this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/UserInfo/Delete?format=json", HttpMethod.PUT,
				entity);
		String jsonResponse = (String) response.getBody();
		RequestExecutionResponseJson includeResponse = (RequestExecutionResponseJson) this.objectMapper
				.readValue(jsonResponse, RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1) {
			return true;
=======
	public boolean excludeCard(ExcludeUserCard request) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(request), headers);

		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + EXCLUDE_CARD_PATH,
				HttpMethod.PUT, entity);

		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("excludePhoto", objectMapper.writeValueAsString(includeResponse));
			return false;
		}
	}

	public boolean excludeAllUsers() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		DeleteUsers.UserInfoDelCondDetails userInfoDelCondDetails = new DeleteUsers.UserInfoDelCondDetails();
		DeleteUsers userInfoDelCond = new DeleteUsers(userInfoDelCondDetails);

		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(userInfoDelCond), headers);

		ResponseEntity<String> response = digestAuthRestTemplate.executeWithDigestAuth(deviceUri + EXCLUDE_USERS_PATH,
				HttpMethod.PUT, entity);
		String jsonResponse = response.getBody();
		RequestExecutionResponseJson includeResponse = objectMapper.readValue(jsonResponse,
				RequestExecutionResponseJson.class);

		if (includeResponse.getStatusCode() == 1)
			return true;
		else {
			CLogger.logHikivisionInfo("excludePhoto", objectMapper.writeValueAsString(includeResponse));
			return false;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
		CLogger.logHikvisionInfo("excludePhoto", this.objectMapper.writeValueAsString(includeResponse));
		return false;
	}

	public boolean setDateTime(DateTime datetime) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		HttpEntity<String> entity = new HttpEntity(convertObjectToXml(datetime), (MultiValueMap) headers);

		this.digestAuthRestTemplate.executeWithDigestAuth(String.valueOf(this.deviceUri) + "/ISAPI/System/time",
				HttpMethod.PUT, entity);

		CLogger.logHikvisionDebug("setDateTime", "OK");
		return true;
	}

	public boolean keepDoorOpen() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "alwaysOpen");

		HttpEntity<String> entity = new HttpEntity(convertObjectToXml(remoteDoorControl), (MultiValueMap) headers);

		this.digestAuthRestTemplate.executeWithDigestAuth(REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikvisionDebug("keepDoorClosed", "OK");
		return true;
	}

	public boolean keepDoorClosed() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "alwaysClose");

		HttpEntity<String> entity = new HttpEntity(convertObjectToXml(remoteDoorControl), (MultiValueMap) headers);

		this.digestAuthRestTemplate.executeWithDigestAuth(REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikvisionDebug("keepDoorClosed", "OK");
		return true;
	}

	public boolean closeDoor() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "close");

		HttpEntity<String> entity = new HttpEntity(convertObjectToXml(remoteDoorControl), (MultiValueMap) headers);

		this.digestAuthRestTemplate.executeWithDigestAuth(REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikvisionDebug("closeDoor", "OK");
		return true;
	}

	public boolean openDoor() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "open");

		HttpEntity<String> entity = new HttpEntity(convertObjectToXml(remoteDoorControl), (MultiValueMap) headers);

		this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/RemoteControl/door/65535", HttpMethod.PUT,
				entity);

		CLogger.logHikvisionDebug("openDoor", "OK");
		return true;
	}

<<<<<<< HEAD
=======
	public boolean setDateTime(DateTime datetime) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		HttpEntity<String> entity = new HttpEntity<>(convertObjectToXml(datetime), headers);

		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + SET_DATE_TIME_PATH, HttpMethod.PUT, entity);

		CLogger.logHikivisionDebug("setDateTime", "OK");
		return true;
	}

	public boolean keepDoorOpen() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "alwaysOpen");

		HttpEntity<String> entity = new HttpEntity<>(convertObjectToXml(remoteDoorControl), headers);

		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikivisionDebug("keepDoorClosed", "OK");
		return true;
	}

	public boolean keepDoorClosed() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "alwaysClose");

		HttpEntity<String> entity = new HttpEntity<>(convertObjectToXml(remoteDoorControl), headers);

		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikivisionDebug("keepDoorClosed", "OK");
		return true;
	}

	public boolean closeDoor() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "close");

		HttpEntity<String> entity = new HttpEntity<>(convertObjectToXml(remoteDoorControl), headers);

		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikivisionDebug("closeDoor", "OK");
		return true;
	}

	public boolean openDoor() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		RemoteControlDoor remoteDoorControl = new RemoteControlDoor("2.0", "open");

		HttpEntity<String> entity = new HttpEntity<>(convertObjectToXml(remoteDoorControl), headers);

		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + REMOTE_CONTROL_DOOR_PATH, HttpMethod.PUT, entity);

		CLogger.logHikivisionDebug("openDoor", "OK");
		return true;
	}

	@SuppressWarnings("unchecked")
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	private <T> T deserializeXmlResponse(String xmlResponse, Class<T> responseType) throws JAXBException {
		if (xmlResponse != null) {
			JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] { responseType });
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			return (T) unmarshaller.unmarshal(new StringReader(xmlResponse));
		}
		return null;
	}

	public static <T> String convertObjectToXml(T object) throws JAXBException {
<<<<<<< HEAD
		JAXBContext context = JAXBContext.newInstance(new Class[] { object.getClass() });
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
=======
		JAXBContext context = JAXBContext.newInstance(object.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

		StringWriter writer = new StringWriter();
		marshaller.marshal(object, writer);
		return writer.toString();
	}

	public static <T> T fromXml(String xml, Class<T> clazz) throws JAXBException, XMLStreamException {
<<<<<<< HEAD
		JAXBContext context = JAXBContext.newInstance(new Class[] { clazz });
=======
		JAXBContext context = JAXBContext.newInstance(clazz);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		Unmarshaller unmarshaller = context.createUnmarshaller();

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xml));

<<<<<<< HEAD
		NamespaceStrippingReader namespaceStrippingReader = new NamespaceStrippingReader(reader);

		return (T) unmarshaller.unmarshal((XMLStreamReader) namespaceStrippingReader);
=======
		XMLStreamReader noNamespaceReader = new NamespaceStrippingReader(reader);

		return (T) unmarshaller.unmarshal(noNamespaceReader);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	public static String minutesToUtcString(int minutes) {
		Duration duration = Duration.ofMinutes(minutes);

		long hours = Math.abs(duration.toHours());
<<<<<<< HEAD
		long mins = Math.abs(duration.toMinutes() % 60L);
		long secs = Math.abs(duration.getSeconds() % 60L);

		return String.format("CST%s%d:%02d:%02d", new Object[] { (minutes < 0) ? "+" : "-", Long.valueOf(hours),
				Long.valueOf(mins), Long.valueOf(secs) });
=======
		long mins = Math.abs(duration.toMinutes() % 60);
		long secs = Math.abs(duration.getSeconds() % 60);

		return String.format("CST%s%d:%02d:%02d", minutes < 0 ? "-" : "+", hours, mins, secs);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	public boolean sendAccessResponse(RemoteCheckEventResponse response) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
<<<<<<< HEAD
		HttpEntity<String> entity = new HttpEntity(this.objectMapper.writeValueAsString(response),
				(MultiValueMap) headers);

		this.digestAuthRestTemplate.executeWithDigestAuth(
				String.valueOf(this.deviceUri) + "/ISAPI/AccessControl/remoteCheck?format=json", HttpMethod.PUT,
				entity);

		CLogger.logHikvisionDebug("sendAccessResponse", "OK");
		return true;
	}
}
=======
		HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(response), headers);

		digestAuthRestTemplate.executeWithDigestAuth(deviceUri + ACCESS_CONTROL_PATH, HttpMethod.PUT, entity);

		CLogger.logHikivisionDebug("sendAccessResponse", "OK");
		return true;
	}

}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
