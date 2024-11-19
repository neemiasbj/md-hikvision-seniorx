 package br.com.hikvision.minmoe.models;
 
 import jakarta.xml.bind.annotation.XmlElement;
 import jakarta.xml.bind.annotation.XmlRootElement;
 import jakarta.xml.bind.annotation.XmlType;
 
 @XmlRootElement(name = "HttpHostNotification")
 @XmlType(propOrder = {"id", "url", "protocolType", "parameterFormatType", "addressingFormatType", "ipAddress", "portNo", "httpAuthenticationMethod"})
 public class HttpHostNotification
 {
   private String id;
   private String url;
   private String protocolType;
   private String parameterFormatType;
   private String addressingFormatType;
   private String ipAddress;
   private int portNo;
   private String httpAuthenticationMethod;
   
   @XmlElement
   public String getId() {
     return this.id;
   }
   
   public void setId(String id) {
     this.id = id;
   }
   
   @XmlElement
   public String getUrl() {
     return this.url;
   }
   
   public void setUrl(String url) {
     this.url = url;
   }
   
   @XmlElement
   public String getProtocolType() {
     return this.protocolType;
   }
   
   public void setProtocolType(String protocolType) {
     this.protocolType = protocolType;
   }
   
   @XmlElement
   public String getParameterFormatType() {
     return this.parameterFormatType;
   }
   
   public void setParameterFormatType(String parameterFormatType) {
     this.parameterFormatType = parameterFormatType;
   }
   
   @XmlElement
   public String getAddressingFormatType() {
     return this.addressingFormatType;
   }
   
   public void setAddressingFormatType(String addressingFormatType) {
     this.addressingFormatType = addressingFormatType;
   }
   
   @XmlElement
   public String getIpAddress() {
     return this.ipAddress;
   }
   
   public void setIpAddress(String ipAddress) {
     this.ipAddress = ipAddress;
   }
   
   @XmlElement
   public int getPortNo() {
     return this.portNo;
   }
   
   public void setPortNo(int portNo) {
     this.portNo = portNo;
   }
   
   @XmlElement
   public String getHttpAuthenticationMethod() {
     return this.httpAuthenticationMethod;
   }
   
   public void setHttpAuthenticationMethod(String httpAuthenticationMethod) {
     this.httpAuthenticationMethod = httpAuthenticationMethod;
   }
 }


