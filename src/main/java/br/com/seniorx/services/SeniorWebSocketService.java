package br.com.seniorx.services;

import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;
import jakarta.websocket.ClientEndpoint;
import java.net.URI;
import java.net.URISyntaxException;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
@ClientEndpoint
public class SeniorWebSocketService extends Thread {
	private static String SENIOR_WEBSOCKET_URI = MiddlewareUtilPropertiesImpl.getValor("senior.websocket.uri");
	private static String SENIOR_DRIVER_KEY = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");

	private SeniorWebSocketClient webSocketClient;

	@PostConstruct
	public void run() {
		try {
			URI uri = new URI(String.format("%s?driver_key=%s", SENIOR_WEBSOCKET_URI, SENIOR_DRIVER_KEY));
			CLogger.logSeniorInfo("SOCKET", "Socket URL: " + uri.toString());
			this.webSocketClient = new SeniorWebSocketClient(uri);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\
 * services\SeniorWebSocketService.class Java compiler version: 17 (61.0)
 * JD-Core Version: 1.1.3
 */