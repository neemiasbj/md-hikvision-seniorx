package br.com.seniorx.services;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import br.com.thidi.middleware.utils.UtilPropertiesImpl;
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
	private static final int RECONNECT_INTERVAL = Integer.valueOf(UtilPropertiesImpl.getValor("senior.websocket.reconnect.interval.seconds"));

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
			System.out.println("Connected to WebSocket server at " + endpointURI);
		} catch (Exception e) {
			System.err.println("Failed to connect. Retrying in 5 seconds..." + e.getLocalizedMessage());
			scheduleReconnect();
		}
	}

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		System.out.println("WebSocket connection opened.");
	}

	@OnMessage
	public void onMessage(String message) {
		System.out.println("Received message: " + message);
	}

	@OnClose
	public void onClose(Session session, CloseReason reason) {
		System.out.println("WebSocket connection closed: " + reason.getReasonPhrase());
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
