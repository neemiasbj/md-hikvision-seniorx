package br.com.thidi.middleware.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.seniorx.services.SeniorHandlerService;
import br.com.seniorx.services.SeniorWebSocketService;

@Configuration
public class ServiceConfig {

	@Bean
	public SeniorHandlerService seniorHandlerService() {
		return new SeniorHandlerService();
	}

	@Bean
	public SeniorWebSocketService seniorWebSocketService() {
		return new SeniorWebSocketService();
	}
}
