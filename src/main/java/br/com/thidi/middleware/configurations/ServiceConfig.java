 package br.com.thidi.middleware.configurations;
 
 import br.com.seniorx.services.SeniorWebSocketService;
 import br.com.thidi.middleware.services.SeniorMiddlewareHandlerService;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 
 
 @Configuration
 public class ServiceConfig
 {
   @Bean
   public SeniorMiddlewareHandlerService seniorHandlerService() {
     return new SeniorMiddlewareHandlerService();
   }
   
   @Bean
   public SeniorWebSocketService seniorWebSocketService() {
     return new SeniorWebSocketService();
   }
 }


