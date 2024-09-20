package br.com.thidi.middleware.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import br.com.thidi.middleware.utils.PropertiesUtilImpl;

@Configuration
public class RestTemplateConfig {
	private static Integer TIMEOUT = Integer.valueOf(PropertiesUtilImpl.getValor("rest.timeout") == null ? "5000" : PropertiesUtilImpl.getValor("rest.timeout"));

	@Bean
	public static RestTemplate restTemplate() {
		RestTemplate restTemplate = clientHttpRequestFactory();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate;
	}

	private static RestTemplate clientHttpRequestFactory() {
		RestTemplate factory = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		return factory;
	}

}
