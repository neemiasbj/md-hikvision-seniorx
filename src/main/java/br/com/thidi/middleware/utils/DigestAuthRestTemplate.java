package br.com.thidi.middleware.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.thidi.middleware.resource.CLogger;

public class DigestAuthRestTemplate {

	private final RestTemplate restTemplate = new RestTemplate();
	private final String username;
	private final String password;

	public DigestAuthRestTemplate(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public <T> ResponseEntity<String> executeWithDigestAuth(String url, HttpMethod method, HttpEntity<T> entity) {
		try {
			ResponseEntity<String> initialResponse = restTemplate.exchange(url, method, entity, String.class);
			if (initialResponse.getStatusCode().is2xxSuccessful()) {
				return initialResponse;
			} else
				throw new Exception(initialResponse.getBody().toString());
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode().value() == 401) {
				String wwwAuthenticateHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");

				if (wwwAuthenticateHeader != null) {
					DigestParams digestParams = parseDigestParams(wwwAuthenticateHeader);
					String digestAuthHeader = calculateDigestAuthHeader(digestParams, url, method.name());

					HttpHeaders newHeaders = new HttpHeaders();
					if (entity == null) {
						newHeaders.set("Authorization", digestAuthHeader);
						HttpEntity<T> updatedEntity = new HttpEntity<>(null, newHeaders);
						CLogger.logHikivisionDebug("Execute auth request", "\n\nEntity: " + updatedEntity.toString());
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
						
						System.out.println(("Execute auth request"+ "\n\nEntity: " + updatedEntity.toString()));
						

						return restTemplate.exchange(url, method, updatedEntity, String.class);
					}
				}
			} else {
				CLogger.logHikivisionError("Execute initial request", ("Error during request: " + e.getMessage()));
			}
		} catch (Exception ex) {
			CLogger.logHikivisionError("Execute initial request", ex.getMessage());
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
		String cnonce = DigestAuthUtils.generateCnonce();

		String response = DigestAuthUtils.calculateDigest(username, params.realm, password, method, uri, params.nonce, nc, cnonce, params.qop);

		return String.format("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", qop=%s, nc=%s, cnonce=\"%s\", response=\"%s\", opaque=\"%s\"", username, params.realm, params.nonce, uri, params.qop, nc, cnonce, response, params.opaque);
	}

	private static class DigestParams {
		String realm;
		String nonce;
		String qop;
		String opaque;
	}
}
