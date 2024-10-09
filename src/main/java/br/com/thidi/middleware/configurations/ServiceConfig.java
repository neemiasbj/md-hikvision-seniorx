package br.com.thidi.middleware.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.seniorx.services.SeniorWebSocketService;
import br.com.thidi.middleware.services.MiddlewareSeniorHandler;

@Configuration
public class ServiceConfig {

	@Bean
	public MiddlewareSeniorHandler seniorHandlerService() {
		return new MiddlewareSeniorHandler();
	}

	@Bean
	public SeniorWebSocketService seniorWebSocketService() {
		return new SeniorWebSocketService();
	}
}
