import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.hikvision.minmoe.models.RemoteCheckEventResponse;
import br.com.seniorx.models.PersonInfo;
import br.com.thidi.middleware.resource.CLogger;

public class RequestTest {
	private static RestTemplate restTemplate = new RestTemplate();
	private static String USERNAME = "admin";
	private static String PASSWORD = "Abc123!@";
	private static String DEVICE_URL = "http://192.168.0.80";
	private static String ACCESS_RESPONSE_URI = "/ISAPI/AccessControl/remoteCheck?format=json";
	private static String PERSON_INFO = "https://sam-api.senior.com.br/sdk/v1/datamart/person/info";

	private static String SENIOR_PARTNER_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MjIsIm1hbnVmYWN0dXJlciI6IkhJS1ZJU0lPTiJ9.hkNnTcOgx4urNmoVJYrUTfucutOp7THwTlUg0xeG1X0";
	private static String SENIOR_DRIVER_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJkcml2ZXJJZCI6MiwidGVuYW50IjoicmRtc3MtZGV2Y29tYnIifQ.yKhqd8l6Bopch2AsC4vEsnK9nzTe3qFc9Zwji5I9agw";

	private static HttpHeaders headers = new HttpHeaders();

	public static void main(String[] args) {
		GetSeniorPersonInfo();
	}

	private static HttpHeaders getSeniorHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("partner_key", SENIOR_PARTNER_KEY);
		headers.add("driver_key", SENIOR_DRIVER_KEY);

		return headers;
	}

	private static void GetSeniorPersonInfo() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("managerDeviceId", "5");
		params.put("personId", "4");

		HttpEntity<String> entity = new HttpEntity<String>(getSeniorHeaders());
		ResponseEntity<PersonInfo> personInfo = restTemplate.exchange(
				PERSON_INFO + String.format("?managerDeviceId=5&cardNumber=123"), HttpMethod.GET, entity,
				PersonInfo.class);
		System.out.println(personInfo.getBody());
	}

	private static String extractHeaderValue(String header, String key) {
		int startIndex = header.indexOf(key + "=\"") + key.length() + 2;
		int endIndex = header.indexOf("\"", startIndex);
		return header.substring(startIndex, endIndex);
	}

	private static void updateHeaders(String authHeader) {
		String realm = extractHeaderValue(authHeader, "realm");
		String nonce = extractHeaderValue(authHeader, "nonce");

		String method = "PUT";
		String uri = "/ISAPI/AccessControl/remoteCheck?format=json";
		String qop = "auth";
		String nc = "00000001";
		String cnonce = UUID.randomUUID().toString();

		String a1 = USERNAME + ":" + realm + ":" + PASSWORD;
		String a2 = method + ":" + uri;

		String ha1 = DigestUtils.md5Hex(a1);
		String ha2 = DigestUtils.md5Hex(a2);

		String responseDigest = DigestUtils.md5Hex(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);

		String authorizationHeader = "Digest username=\"" + USERNAME + "\", realm=\"" + realm + "\", nonce=\"" + nonce
				+ "\", uri=\"" + uri + "\", qop=" + qop + ", nc=" + nc + ", cnonce=\"" + cnonce + "\", response=\""
				+ responseDigest + "\", opaque=\"\"";

		headers = new HttpHeaders();
		headers.set("Authorization", authorizationHeader);

	}

	public static void remoteCheck() {

		try {
			HttpHeaders currentHeaders = headers;
			currentHeaders.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<>(
					"{\r\n    \"RemoteCheck\": {\r\n        \"serialNo\": 25,\r\n        \"checkResult\": \"success\"\r\n    }\r\n}",
					currentHeaders);
			ResponseEntity<String> response = restTemplate.exchange(URI.create(DEVICE_URL), HttpMethod.PUT, entity,
					String.class);

			System.out.println("Request success:" + response.getHeaders().toString());

		} catch (HttpClientErrorException e) {
			System.out.println("RESPONSE HEADERS: " + e.getResponseHeaders().toString());
			if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				String authHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");
				if (authHeader != null && authHeader.contains("Digest")) {
					updateHeaders(authHeader);
					remoteCheck();
				}
			} else
				System.out.println("Request error  : " + e.getMessage());
		}
	}

	public static void getDeviceInfo() {
		try {
			HttpHeaders currentHeaders = headers;
			HttpEntity<String> entity = new HttpEntity<>(currentHeaders);
			restTemplate.exchange(URI.create(DEVICE_URL), HttpMethod.GET, entity, String.class);

			CLogger.logHikivisionDebug("CHECK STATUS", "SENT");

		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				System.out.println("UNAUTHORIZED");
				System.out.println(e.getResponseHeaders());
				String authHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");
				if (authHeader != null && authHeader.contains("Digest")) {
					updateHeaders(authHeader);
					getDeviceInfo();
				} else {
					CLogger.logHikivisionError("CHECK STATUS", "Response don't contain WWW-Authenticate");

				}
			} else {
				CLogger.logHikivisionError("CHECK STATUS", e.getMessage());

			}

		} catch (Exception e) {
			CLogger.logHikivisionError("CHECK STATUS", e.getMessage());

		}
	}

	public static void testHeaders() {

		updateHeaders(
				"Digest qop=\"auth\", realm=\"DS-8B8CCC80\", nonce=\"YTVhZGFhZTViNTQ2ZmY5YzJhMTYxZTU2ZjMyMTg5ZWM=\", stale=\"false\", opaque=\"\", domain=\"::\"");

		System.out.println(headers.getFirst("Authorization").toString());

	}

	public static void accessResponse() {
		try {
			RemoteCheckEventResponse body = new RemoteCheckEventResponse(162, "success", "Liberadoooooo");
			HttpHeaders currentHeaders = headers;
			currentHeaders.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<RemoteCheckEventResponse> entity = new HttpEntity<>(body, currentHeaders);
			ResponseEntity<String> response = restTemplate.exchange(URI.create(DEVICE_URL + ACCESS_RESPONSE_URI),
					HttpMethod.PUT, entity, String.class);

			System.out.println("Request success:" + response.getHeaders().toString());

		} catch (HttpClientErrorException e) {
			System.out.println("RESPONSE HEADERS: " + e.getResponseHeaders().toString());
			if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				String authHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");
				if (authHeader != null && authHeader.contains("Digest")) {
					updateHeaders(authHeader);
					remoteCheck();
				}
			} else
				System.out.println("Request error  : " + e.getMessage());
		}
	}

}
