package br.com.hikvision.services;

import java.io.StringWriter;
import java.net.URI;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.hikvision.models.minmoe.HttpHostNotification;
import br.com.hikvision.models.minmoe.HttpHostNotificationList;
import br.com.seniorx.models.ManagerDevice;
import br.com.thidi.middleware.resource.CLogger;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class HikvisionMinMoeService {
	private static final RestTemplate restTemplate = new RestTemplate();

	private ManagerDevice device;
	private String deviceUri;
	private static final String DEVICE_INFO_PATH = "/ISAPI/System/deviceInfo";
	private static final String SET_HOST_PATH = "/AccessControl/AcsCfg?format=json";

	public HikvisionMinMoeService(ManagerDevice device) {
		this.device = device;
		this.deviceUri = buildDeviceUri();
	}

	private String buildDeviceUri() {
		String uri = String.format("http://%s%s", device.getNetworkIdentification(), (device.getNetworkPort() == 80 ? "" : ":" + device.getNetworkPort()));
		CLogger.logHikivisionDebug("MINMON", "Device uri: " + uri);
		return uri;
	}

	private HttpHeaders prepareAuthHeaders(HttpHeaders headers, String authResponse, String uri, HttpMethod method) {
		String realm = extractHeaderValue(authResponse, "realm");
		String nonce = extractHeaderValue(authResponse, "nonce");
		String qop = "auth";
		String nc = "00000001";
		String cnonce = UUID.randomUUID().toString();

		String a1 = device.getUsername() + ":" + realm + ":" + device.getPassword();
		String a2 = method.name() + ":" + uri;

		String ha1 = DigestUtils.md5Hex(a1);
		String ha2 = DigestUtils.md5Hex(a2);

		String responseDigest = DigestUtils.md5Hex(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);

		String authorizationHeader = String.format("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", qop=%s, nc=%s, cnonce=\"%s\", response=\"%s\", opaque=\"\"", device.getUsername(), realm, nonce, uri, qop, nc, cnonce,
				responseDigest);

		headers.set("Authorization", authorizationHeader);
		return headers;
	}

	private static String extractHeaderValue(String header, String key) {
		int startIndex = header.indexOf(key + "=\"") + key.length() + 2;
		int endIndex = header.indexOf("\"", startIndex);
		return header.substring(startIndex, endIndex);
	}

	private boolean executeRequest(String path, HttpHeaders headers, HttpMethod method, String body) {
		HttpEntity<String> entity = new HttpEntity<>(body, headers);

		try {
			restTemplate.exchange(URI.create(deviceUri + path), method, entity, String.class);
			CLogger.logHikivisionDebug("REQUEST", "Request sent successfully");
			return true;
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				return handleUnauthorized(e, headers, path, method, body);
			} else {
				CLogger.logHikivisionError("REQUEST", e.getMessage());
				return false;
			}
		} catch (Exception e) {
			CLogger.logHikivisionError("REQUEST", e.getMessage());
			return false;
		}
	}

	private boolean handleUnauthorized(HttpClientErrorException e, HttpHeaders headers, String path, HttpMethod method, String body) {
		String authHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");
		if (authHeader != null && authHeader.contains("Digest")) {
			headers = prepareAuthHeaders(new HttpHeaders(), authHeader, path, method);
			HttpEntity<String> entity = new HttpEntity<>(body, headers);

			try {
				restTemplate.exchange(URI.create(deviceUri + path), method, entity, String.class);
				return true;
			} catch (Exception ex) {
				CLogger.logHikivisionError("REQUEST", ex.getMessage());
				return false;
			}
		} else {
			CLogger.logHikivisionError("REQUEST", "Response doesn't contain Digest authentication");
			return false;
		}
	}

	public static <T> String toXml(T object, Class<T> clazz) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		StringWriter xmlWriter = new StringWriter();
		marshaller.marshal(object, xmlWriter);
		return xmlWriter.toString();
	}

	public boolean getDeviceInfo() {
		HttpHeaders headers = new HttpHeaders();
		return executeRequest(DEVICE_INFO_PATH, headers, HttpMethod.GET, null);
	}

	public boolean configureDevice(ManagerDevice device) {
		HttpHostNotification notification = new HttpHostNotification();
		notification.setId("1");
		notification.setUrl("/api/device/minmon/webhook");
		notification.setProtocolType("HTTP");
		notification.setParameterFormatType("JSON");
		notification.setAddressingFormatType("ipaddress");
		notification.setIpAddress("186.193.224.18");
		notification.setPortNo(55975);
		notification.setHttpAuthenticationMethod("none");

		HttpHostNotificationList notificationList = new HttpHostNotificationList();
		notificationList.setHttpHostNotification(notification);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_XML);
		try {
			executeRequest(SET_HOST_PATH, headers, HttpMethod.PUT, toXml(notificationList, HttpHostNotificationList.class));
			return true;
		} catch (JAXBException e) {
			CLogger.logHikivisionError("SET HOST URL", e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
}
