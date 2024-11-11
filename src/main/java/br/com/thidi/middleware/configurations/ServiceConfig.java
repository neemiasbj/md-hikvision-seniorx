<<<<<<< HEAD
 package br.com.thidi.middleware.configurations;
 
 import br.com.seniorx.services.SeniorWebSocketService;
 import br.com.thidi.middleware.services.MiddlewareSeniorHandler;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 
 
 @Configuration
 public class ServiceConfig
 {
   @Bean
   public MiddlewareSeniorHandler seniorHandlerService() {
     return new MiddlewareSeniorHandler();
   }
   
   @Bean
   public SeniorWebSocketService seniorWebSocketService() {
     return new SeniorWebSocketService();
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\configurations\ServiceConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.thidi.middleware.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.seniorx.services.SeniorWebSocketService;
import br.com.thidi.middleware.services.MiddlewareSeniorHandler;

@Configuration
public class ServiceConfig {

	@Bean
	public MiddlewareSeniorHandler seniorHandlerService() {
		return new MiddlewareSeniorHandler();
	}

	@Bean
	public SeniorWebSocketService seniorWebSocketService() {
		return new SeniorWebSocketService();
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
