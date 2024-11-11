<<<<<<< HEAD
 package br.com.seniorx.utils;
 
 import br.com.thidi.middleware.configurations.RestTemplateConfig;
 import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;
 import java.util.Map;
 import org.springframework.http.HttpEntity;
 import org.springframework.http.HttpHeaders;
 import org.springframework.http.HttpMethod;
 import org.springframework.http.ResponseEntity;
 import org.springframework.util.MultiValueMap;
 import org.springframework.web.client.RestTemplate;
 
 public class UtilRestRequest {
   private final RestTemplate restTemplate = RestTemplateConfig.getRestTemplate();
   private static String seniorPartnerKey = MiddlewareUtilPropertiesImpl.getValor("senior.partner_key");
   private static String seniorDriverKey = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");
 
 
   
   public <T> ResponseEntity<String> executeWithDigestAuth(String url, HttpMethod method, HttpEntity<T> entity) throws Exception {
     try {
       HttpHeaders existingHeaders = entity.getHeaders();
       HttpHeaders updatedHeaders = new HttpHeaders();
       
       if (existingHeaders == null || existingHeaders.isEmpty()) {
         updatedHeaders.add("partner_key", seniorPartnerKey);
         updatedHeaders.add("driver_key", seniorDriverKey);
       } else {
         updatedHeaders.putAll((Map)existingHeaders);
       } 
       HttpEntity<T> updatedEntity = new HttpEntity(entity.getBody(), (MultiValueMap)updatedHeaders);
       return this.restTemplate.exchange(url, method, updatedEntity, String.class, new Object[0]);
     } catch (Exception ex) {
       throw ex;
     } 
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\senior\\utils\UtilRestRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.thidi.middleware.configurations.RestTemplateConfig;
import br.com.thidi.middleware.utils.MiddlewareUtilPropertiesImpl;

public class UtilRestRequest {

	private final RestTemplate restTemplate = RestTemplateConfig.getRestTemplate();
	private static String seniorPartnerKey = MiddlewareUtilPropertiesImpl.getValor("senior.partner_key");
	private static String seniorDriverKey = MiddlewareUtilPropertiesImpl.getValor("senior.driver_key");

	public <T> ResponseEntity<String> executeWithDigestAuth(String url, HttpMethod method, HttpEntity<T> entity)
			throws Exception {

		try {
			HttpHeaders existingHeaders = entity.getHeaders();
			HttpHeaders updatedHeaders = new HttpHeaders();

			if (existingHeaders == null || existingHeaders.isEmpty()) {
				updatedHeaders.add("partner_key", seniorPartnerKey);
				updatedHeaders.add("driver_key", seniorDriverKey);
			} else
				updatedHeaders.putAll(existingHeaders);

			HttpEntity<T> updatedEntity = new HttpEntity<>(entity.getBody(), updatedHeaders);
			return restTemplate.exchange(url, method, updatedEntity, String.class);
		} catch (Exception ex) {
			throw ex;
		}
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
