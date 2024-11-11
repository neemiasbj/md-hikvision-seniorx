 package br.com.seniorx.services;
 
 import br.com.thidi.middleware.resource.CLogger;
 import br.com.thidi.middleware.services.MiddlewareSeniorHandler;
 import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;
 import com.fasterxml.jackson.databind.JsonNode;
 import com.fasterxml.jackson.databind.ObjectMapper;
 import jakarta.websocket.ClientEndpoint;
 import jakarta.websocket.CloseReason;
 import jakarta.websocket.ContainerProvider;
 import jakarta.websocket.OnClose;
 import jakarta.websocket.OnError;
 import jakarta.websocket.OnMessage;
 import jakarta.websocket.OnOpen;
 import jakarta.websocket.Session;
 import jakarta.websocket.WebSocketContainer;
 import java.io.IOException;
 import java.net.URI;
 import java.util.concurrent.Executors;
 import java.util.concurrent.ScheduledExecutorService;
 import java.util.concurrent.TimeUnit;
 
 
 
 
 @ClientEndpoint
 public class SeniorWebSocketClient
 {
   private Session session;
   private static final int RECONNECT_INTERVAL = Integer.valueOf(MiddlewareUtilPropertiesImpl.getValor("senior.websocket.reconnect.interval.seconds")).intValue();
   
   private URI endpointURI;
   private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
   
   public SeniorWebSocketClient(URI endpointURI) {
     this.endpointURI = endpointURI;
     connect();
   }
   
   private void connect() {
     try {
       WebSocketContainer container = ContainerProvider.getWebSocketContainer();
       this.session = container.connectToServer(this, this.endpointURI);
       CLogger.logSeniorDebug("Websocket", "Connected to WebSocket server at " + this.endpointURI);
     } catch (Exception e) {
       CLogger.loggerError("Senior", "WebSocket onConnect: ", e);
       scheduleReconnect();
       e.printStackTrace();
     } 
   }
   
   @OnOpen
   public void onOpen(Session session) {
     this.session = session;
     CLogger.logSeniorInfo("Websocket", "Connection opened.");
     System.out.println("Websocket, Connection opened.");
   }
   
   @OnMessage
   public void onMessage(String message) {
     System.out.println("Websocket MESSAGE: " + message);
     CLogger.logSeniorDebug("Websocket", "MESSAGE: " + message);
     ObjectMapper objectMapper = new ObjectMapper();
     
     try {
       JsonNode jsonNode = objectMapper.readTree(message);
       MiddlewareSeniorHandler.HandleWebSocketMessage(Long.valueOf(jsonNode.get("deviceId").asLong()));
     } catch (Exception e) {
       CLogger.logSeniorError("ON MESSAGE", e.getMessage());
       e.printStackTrace();
     } 
   }
   
   @OnClose
   public void onClose(Session session, CloseReason reason) {
     CLogger.logSeniorDebug("Websocket", "WebSocket connection closed: " + reason.getReasonPhrase());
     
     System.out.println("Websocket\", \"WebSocket connection closed: \" + )" + reason.getReasonPhrase());
     scheduleReconnect();
   }
   
   @OnError
   public void onError(Session session, Throwable throwable) {
     CLogger.loggerError("Senior", "WebSocket onError: ", throwable);
     scheduleReconnect();
   }
   
   private void scheduleReconnect() {
     this.scheduler.schedule(this::connect, RECONNECT_INTERVAL, TimeUnit.SECONDS);
   }
   
   public void close() throws IOException {
     if (this.session != null) {
       this.session.close();
     }
     this.scheduler.shutdown();
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\services\SeniorWebSocketClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */