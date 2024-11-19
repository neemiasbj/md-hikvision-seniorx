 package br.com.hikvision.minmoe.models;
 
 import jakarta.xml.bind.annotation.XmlElement;
 import jakarta.xml.bind.annotation.XmlRootElement;
 import jakarta.xml.bind.annotation.XmlType;
 import java.util.List;
 
 
 @XmlRootElement(name = "HttpHostNotificationList")
 @XmlType(propOrder = {"version", "httpHostNotification"})
 public class HttpHostNotificationList
 {
   private String version;
   private List<HttpHostNotification> httpHostNotification;
   
   @XmlElement
   public String getVersion() {
     return this.version;
   }
   
   public void setVersion(String version) {
     this.version = version;
   }
   
   @XmlElement(name = "HttpHostNotification")
   public List<HttpHostNotification> getHttpHostNotification() {
     return this.httpHostNotification;
   }
   
   public void setHttpHostNotification(List<HttpHostNotification> httpHostNotification) {
     this.httpHostNotification = httpHostNotification;
   }
 }


