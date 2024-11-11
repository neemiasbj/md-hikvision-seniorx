/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import jakarta.xml.bind.annotation.XmlElement;
/*    */ import jakarta.xml.bind.annotation.XmlRootElement;
/*    */ import jakarta.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlRootElement(name = "HttpHostNotification")
/*    */ @XmlType(propOrder = {"id", "url", "protocolType", "parameterFormatType", "addressingFormatType", "ipAddress", "portNo", "httpAuthenticationMethod"})
/*    */ public class HttpHostNotification
/*    */ {
/*    */   private String id;
/*    */   private String url;
/*    */   private String protocolType;
/*    */   private String parameterFormatType;
/*    */   private String addressingFormatType;
/*    */   private String ipAddress;
/*    */   private int portNo;
/*    */   private String httpAuthenticationMethod;
/*    */   
/*    */   @XmlElement
/*    */   public String getId() {
/* 22 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(String id) {
/* 26 */     this.id = id;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public String getUrl() {
/* 31 */     return this.url;
/*    */   }
/*    */   
/*    */   public void setUrl(String url) {
/* 35 */     this.url = url;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public String getProtocolType() {
/* 40 */     return this.protocolType;
/*    */   }
/*    */   
/*    */   public void setProtocolType(String protocolType) {
/* 44 */     this.protocolType = protocolType;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public String getParameterFormatType() {
/* 49 */     return this.parameterFormatType;
/*    */   }
/*    */   
/*    */   public void setParameterFormatType(String parameterFormatType) {
/* 53 */     this.parameterFormatType = parameterFormatType;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public String getAddressingFormatType() {
/* 58 */     return this.addressingFormatType;
/*    */   }
/*    */   
/*    */   public void setAddressingFormatType(String addressingFormatType) {
/* 62 */     this.addressingFormatType = addressingFormatType;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public String getIpAddress() {
/* 67 */     return this.ipAddress;
/*    */   }
/*    */   
/*    */   public void setIpAddress(String ipAddress) {
/* 71 */     this.ipAddress = ipAddress;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public int getPortNo() {
/* 76 */     return this.portNo;
/*    */   }
/*    */   
/*    */   public void setPortNo(int portNo) {
/* 80 */     this.portNo = portNo;
/*    */   }
/*    */   
/*    */   @XmlElement
/*    */   public String getHttpAuthenticationMethod() {
/* 85 */     return this.httpAuthenticationMethod;
/*    */   }
/*    */   
/*    */   public void setHttpAuthenticationMethod(String httpAuthenticationMethod) {
/* 89 */     this.httpAuthenticationMethod = httpAuthenticationMethod;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\HttpHostNotification.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */