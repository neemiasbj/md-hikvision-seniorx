package br.com.thidi.middleware.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import br.com.thidi.middleware.utils.MiddlewarePropertiesUtilImpl;

@Configuration
public class RestTemplateConfig {
	private static Integer TIMEOUT = Integer.valueOf(
			(MiddlewarePropertiesUtilImpl.getValor("senior.websocket.reconnect.interval.seconds") == null) ? "5"
					: MiddlewarePropertiesUtilImpl.getValor("senior.websocket.reconnect.interval.seconds"))
			* 1000;

	@Bean
	public static RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		return restTemplate;

	}

	private ClientHttpRequestFactory clientHttpRequestFactory() {
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(TIMEOUT.intValue());
		factory.setReadTimeout(TIMEOUT.intValue());
		return (ClientHttpRequestFactory) factory;
	}
}
