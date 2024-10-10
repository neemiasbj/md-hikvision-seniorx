package br.com.hikvision.minmoe.utils;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.thidi.middleware.configurations.RestTemplateConfig;
import br.com.thidi.middleware.resource.CLogger;

public class HikbisionDigestAuthRestUtil {

	private final RestTemplate restTemplate = RestTemplateConfig.getRestTemplate();
	ObjectMapper objectMapper = new ObjectMapper();
	private final String username;
	private final String password;

	public HikbisionDigestAuthRestUtil(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public <T> ResponseEntity<String> executeWithDigestAuth(String url, HttpMethod method, HttpEntity<T> entity)
			throws Exception {
		try {
			ResponseEntity<String> initialResponse = restTemplate.exchange(url, method, entity, String.class);
			if (initialResponse.getStatusCode().is2xxSuccessful()) {
				return initialResponse;
			} else
				throw new Exception(initialResponse.toString());
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode().value() == 401) {
				String wwwAuthenticateHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");

				if (wwwAuthenticateHeader != null) {
					try {
						DigestParams digestParams = parseDigestParams(wwwAuthenticateHeader);
						String digestAuthHeader = calculateDigestAuthHeader(digestParams, url, method.name());

						HttpHeaders newHeaders = new HttpHeaders();
						if (entity == null) {
							newHeaders.set("Authorization", digestAuthHeader);
							HttpEntity<T> updatedEntity = new HttpEntity<>(null, newHeaders);
							CLogger.logHikivisionDebug("Execute auth request",
									"\n\nEntity: " + updatedEntity.toString());
//							System.out.println(("Execute auth request" + "\n\nEntity: " + updatedEntity.toString()));
							return restTemplate.exchange(url, method, updatedEntity, String.class);
						} else {
							HttpHeaders existingHeaders = entity.getHeaders();

							if (existingHeaders == null || existingHeaders.isEmpty())
								newHeaders.set("Authorization", digestAuthHeader);
							else {
								newHeaders.putAll(existingHeaders);
								newHeaders.set("Authorization", digestAuthHeader);
							}

							HttpEntity<T> updatedEntity = new HttpEntity<>(entity.getBody(), newHeaders);

//							System.out.println(("Execute auth request" + "\n\nEntity: " + updatedEntity.toString()));

							return restTemplate.exchange(url, method, updatedEntity, String.class);
						}
					} catch (Exception e1) {
						throw e1;
					}
				}
			} else {
				CLogger.logHikivisionError("Execute initial request", ("Error during request: " + e.getMessage()));
			}
		} catch (Exception ex) {
			throw ex;
		}

		return null;
	}

	private DigestParams parseDigestParams(String wwwAuthenticateHeader) {
		DigestParams params = new DigestParams();

		Pattern pattern = Pattern.compile("(\\w+)=\"([^\"]+)\"");
		Matcher matcher = pattern.matcher(wwwAuthenticateHeader);

		while (matcher.find()) {
			String key = matcher.group(1);
			String value = matcher.group(2);

			switch (key) {
			case "realm":
				params.realm = value;
				break;
			case "nonce":
				params.nonce = value;
				break;
			case "qop":
				params.qop = value;
				break;
			case "opaque":
				params.opaque = value;
				break;
			}
		}
		return params;
	}

	private String calculateDigestAuthHeader(DigestParams params, String uri, String method) {
		String nc = "00000001";
		String cnonce = generateCnonce();

		String response = calculateDigest(username, params.realm, password, method, uri, params.nonce, nc, cnonce,
				params.qop);

		return String.format(
				"Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", qop=%s, nc=%s, cnonce=\"%s\", response=\"%s\", opaque=\"%s\"",
				username, params.realm, params.nonce, uri, params.qop, nc, cnonce, response, params.opaque);
	}

	private String calculateDigest(String username, String realm, String password, String method, String uri,
			String nonce, String nc, String cnonce, String qop) {
		String A1 = username + ":" + realm + ":" + password;
		String ha1 = DigestUtils.md5Hex(A1);

		String A2 = method + ":" + uri;
		String ha2 = DigestUtils.md5Hex(A2);

		return DigestUtils.md5Hex(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);
	}

	private String generateCnonce() {
		return UUID.randomUUID().toString();
	}

	private static class DigestParams {
		String realm;
		String nonce;
		String qop;
		String opaque;
	}
}
