package br.com.seniorx.services;

import java.net.URI;
import java.net.URISyntaxException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.thidi.middleware.utils.UtilPropertiesImpl;
import jakarta.websocket.ClientEndpoint;

@Service
@ClientEndpoint
public class SeniorWebSocketService extends Thread {

	private static String websocketUri = UtilPropertiesImpl.getValor("senior.websocket.uri");

	private SeniorWebSocketClient webSocketClient;

	@Override
	@PostConstruct
	public void run() {
		try {
			URI uri = new URI(websocketUri);
			this.webSocketClient = new SeniorWebSocketClient(uri);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

//	public void stop() {
//		try {
//			if (webSocketClient != null) {
//				webSocketClient.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
