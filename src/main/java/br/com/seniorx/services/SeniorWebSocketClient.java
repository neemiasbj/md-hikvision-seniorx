package br.com.seniorx.services;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.services.MiddlewareSeniorHandler;
import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;
import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.CloseReason;
import jakarta.websocket.ContainerProvider;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.WebSocketContainer;

@ClientEndpoint
public class SeniorWebSocketClient {

	private Session session;
	private static final int RECONNECT_INTERVAL = Integer
			.valueOf(MiddlewareUtilPropertiesImpl.getValor("senior.websocket.reconnect.interval.seconds"));

	private URI endpointURI;
	private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	public SeniorWebSocketClient(URI endpointURI) {
		this.endpointURI = endpointURI;
		connect();
	}

	private void connect() {
		try {
			WebSocketContainer container = ContainerProvider.getWebSocketContainer();
			this.session = container.connectToServer(this, endpointURI);
			CLogger.logSeniorDebug("Websocket", "Connected to WebSocket server at " + endpointURI);
		} catch (Exception e) {
			System.err.println("Failed to connect. Retrying in 5 seconds..." + e.getLocalizedMessage());
			scheduleReconnect();
		}
	}

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		CLogger.logSeniorDebug("Websocket", "Connection opened.");
	}

	@OnMessage
	public void onMessage(String message) {
		CLogger.logSeniorDebug("Websocket", "MESSAGE: " + message);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		try {
			jsonNode = objectMapper.readTree(message);
			MiddlewareSeniorHandler.HandleWebSocketMessage(jsonNode.get("deviceId").asLong());
		} catch (Exception e) {
			CLogger.logSeniorError("ON MESSAGE", e.getMessage());
		}
	}

	@OnClose
	public void onClose(Session session, CloseReason reason) {
		CLogger.logSeniorDebug("Websocket", "WebSocket connection closed: " + reason.getReasonPhrase());
		scheduleReconnect();
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		System.err.println("WebSocket error: " + throwable.getMessage());
		scheduleReconnect();
	}

	private void scheduleReconnect() {
		scheduler.schedule(this::connect, RECONNECT_INTERVAL, TimeUnit.SECONDS);
	}

	public void close() throws IOException {
		if (session != null) {
			session.close();
		}
		scheduler.shutdown();
	}

}
