package br.com.thidi.middleware.components;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.seniorx.services.SeniorHandlerService;

@Service
public class ServicesStarterComponent {

	private final SeniorHandlerService seniorHandlerService = new SeniorHandlerService();

	@PostConstruct
	public void init() {
		seniorHandlerService.start();
	}
}
