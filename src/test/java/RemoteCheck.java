import java.net.URI;
import java.util.UUID;

import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.thidi.middleware.resource.CLogger;

import org.apache.commons.codec.digest.DigestUtils;

public class RemoteCheck {
	private static RestTemplate restTemplate = new RestTemplate();
	private static String username = "admin";
	private static String password = "Abc123!@";
	private static String url = "http://177.81.228.104:9090/ISAPI/AccessControl/remoteCheck?format=json";

	private static HttpHeaders headers = new HttpHeaders();

	public static void main(String[] args) {
		testHeaders();
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

		String a1 = username + ":" + realm + ":" + password;
		String a2 = method + ":" + uri;

		String ha1 = DigestUtils.md5Hex(a1);
		String ha2 = DigestUtils.md5Hex(a2);

		String responseDigest = DigestUtils.md5Hex(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);

		String authorizationHeader = "Digest username=\"" + username + "\", realm=\"" + realm + "\", nonce=\"" + nonce + "\", uri=\"" + uri + "\", qop=" + qop + ", nc=" + nc + ", cnonce=\"" + cnonce + "\", response=\"" + responseDigest
				+ "\", opaque=\"\"";

		headers = new HttpHeaders();
		headers.set("Authorization", authorizationHeader);

	}

	public static void remoteCheck() {

		try {
			HttpHeaders currentHeaders = headers;
			currentHeaders.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<>("{\r\n    \"RemoteCheck\": {\r\n        \"serialNo\": 25,\r\n        \"checkResult\": \"success\"\r\n    }\r\n}", currentHeaders);
			ResponseEntity<String> response = restTemplate.exchange(URI.create(url), HttpMethod.PUT, entity, String.class);

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
			restTemplate.exchange(URI.create(url), HttpMethod.GET, entity, String.class);

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

		updateHeaders("Digest qop=\"auth\", realm=\"DS-8B8CCC80\", nonce=\"YTVhZGFhZTViNTQ2ZmY5YzJhMTYxZTU2ZjMyMTg5ZWM=\", stale=\"false\", opaque=\"\", domain=\"::\"");

		System.out.println(headers.getFirst("Authorization").toString());

	}

}
