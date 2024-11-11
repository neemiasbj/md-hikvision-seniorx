 package br.com.thidi.middleware.configurations;
 
 import br.com.thidi.middleware.utils.MiddlewarePropertiesUtilImpl;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.http.client.ClientHttpRequestFactory;
 import org.springframework.http.client.SimpleClientHttpRequestFactory;
 import org.springframework.http.converter.FormHttpMessageConverter;
 import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
 import org.springframework.web.client.RestTemplate;
 
 @Configuration
 public class RestTemplateConfig
 {
   private static Integer TIMEOUT = Integer.valueOf(
       (MiddlewarePropertiesUtilImpl.getValor("rest.timeout") == null) ? "5000" : MiddlewarePropertiesUtilImpl.getValor("rest.timeout"));
   
   @Bean
   public static RestTemplate getRestTemplate() {
     RestTemplate restTemplate = new RestTemplate();
     restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
     restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
     return restTemplate;
   }
   
   private ClientHttpRequestFactory clientHttpRequestFactory() {
     SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
     factory.setConnectTimeout(TIMEOUT.intValue());
     factory.setReadTimeout(TIMEOUT.intValue());
     return (ClientHttpRequestFactory)factory;
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\configurations\RestTemplateConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */