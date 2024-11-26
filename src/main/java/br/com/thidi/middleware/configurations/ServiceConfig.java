 package br.com.thidi.middleware.configurations;
 
 import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.hikvision.services.HikvisionAccessManagerService;
import br.com.seniorx.services.SeniorWebSocketService;
import br.com.thidi.middleware.services.SeniorMiddlewareHandlerService;
 
 
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
   
   @Bean
   public HikvisionAccessManagerService hikvisionAccessManagerService() {
     return new HikvisionAccessManagerService();
   }
 }


