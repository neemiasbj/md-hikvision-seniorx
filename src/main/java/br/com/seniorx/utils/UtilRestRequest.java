package br.com.seniorx.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.thidi.middleware.configurations.RestTemplateConfig;
import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;

public class UtilRestRequest {

	private final RestTemplate restTemplate = RestTemplateConfig.getRestTemplate();
	private static String seniorPartnerKey = MiddlewareUtilPropertiesImpl.getValor("senior.partner_key");
	private static String seniorDriverKey = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");

	public <T> ResponseEntity<String> executeWithDigestAuth(String url, HttpMethod method, HttpEntity<T> entity)
			throws Exception {

		try {
			HttpHeaders existingHeaders = entity.getHeaders();
			HttpHeaders updatedHeaders = new HttpHeaders();

			if (existingHeaders == null || existingHeaders.isEmpty()) {
				updatedHeaders.add("partner_key", seniorPartnerKey);
				updatedHeaders.add("driver_key", seniorDriverKey);
			} else
				updatedHeaders.putAll(existingHeaders);

			HttpEntity<T> updatedEntity = new HttpEntity<>(entity.getBody(), updatedHeaders);
			return restTemplate.exchange(url, method, updatedEntity, String.class);
		} catch (Exception ex) {
			throw ex;
		}
	}
}
