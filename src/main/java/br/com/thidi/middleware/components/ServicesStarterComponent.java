package br.com.thidi.middleware.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.seniorx.services.SeniorHandlerService;

@Service
public class ServicesStarterComponent {

	@Autowired
	private SeniorHandlerService seniorHandlerService;

//	@PostConstruct
//	public void init() {
//		seniorHandlerService.start();
//	}
}
