package br.com.thidi.middleware.components;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.seniorx.services.SeniorHandlerService;
import br.com.seniorx.services.SeniorWebSocketService;

@Service
public class ServicesStarterComponent {

	private final SeniorHandlerService seniorHandlerService = new SeniorHandlerService();
	private final SeniorWebSocketService seniorWebSocketService = new SeniorWebSocketService();

	@PostConstruct
	public void init() {
		seniorHandlerService.start();
		seniorWebSocketService.start();
		;
	}
}
