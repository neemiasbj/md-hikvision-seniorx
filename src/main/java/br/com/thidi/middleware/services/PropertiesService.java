 package br.com.thidi.middleware.services;
 
 import org.springframework.beans.factory.annotation.Value;
 
 public class PropertiesService
 {
   @Value("${pom.version}")
   private String pomVersion;
   
   public String getPomVersion() {
     return this.pomVersion;
   }
   
   public void setPomVersion(String pomVersion) {
     this.pomVersion = pomVersion;
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\services\PropertiesService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */