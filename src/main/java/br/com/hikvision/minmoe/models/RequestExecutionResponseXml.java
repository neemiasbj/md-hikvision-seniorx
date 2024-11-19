 package br.com.hikvision.minmoe.models;
 
 import jakarta.xml.bind.annotation.XmlElement;
 import jakarta.xml.bind.annotation.XmlRootElement;
 
 @XmlRootElement(name = "ResponseStatus")
 public class RequestExecutionResponseXml
 {
   private String requestURL;
   private int statusCode;
   private String statusString;
   private String subStatusCode;
   
   @XmlElement(name = "requestURL")
   public String getRequestURL() {
     return this.requestURL;
   }
   
   public void setRequestURL(String requestURL) {
     this.requestURL = requestURL;
   }
   
   @XmlElement(name = "statusCode")
   public int getStatusCode() {
     return this.statusCode;
   }
   
   public void setStatusCode(int statusCode) {
     this.statusCode = statusCode;
   }
   
   @XmlElement(name = "statusString")
   public String getStatusString() {
     return this.statusString;
   }
   
   public void setStatusString(String statusString) {
     this.statusString = statusString;
   }
   
   @XmlElement(name = "subStatusCode")
   public String getSubStatusCode() {
     return this.subStatusCode;
   }
   
   public void setSubStatusCode(String subStatusCode) {
     this.subStatusCode = subStatusCode;
   }
 }


