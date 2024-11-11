/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import jakarta.xml.bind.annotation.XmlElement;
/*    */ import jakarta.xml.bind.annotation.XmlRootElement;
/*    */ 
/*    */ @XmlRootElement(name = "ResponseStatus")
/*    */ public class RequestExecutionResponseXml
/*    */ {
/*    */   private String requestURL;
/*    */   private int statusCode;
/*    */   private String statusString;
/*    */   private String subStatusCode;
/*    */   
/*    */   @XmlElement(name = "requestURL")
/*    */   public String getRequestURL() {
/* 16 */     return this.requestURL;
/*    */   }
/*    */   
/*    */   public void setRequestURL(String requestURL) {
/* 20 */     this.requestURL = requestURL;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "statusCode")
/*    */   public int getStatusCode() {
/* 25 */     return this.statusCode;
/*    */   }
/*    */   
/*    */   public void setStatusCode(int statusCode) {
/* 29 */     this.statusCode = statusCode;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "statusString")
/*    */   public String getStatusString() {
/* 34 */     return this.statusString;
/*    */   }
/*    */   
/*    */   public void setStatusString(String statusString) {
/* 38 */     this.statusString = statusString;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "subStatusCode")
/*    */   public String getSubStatusCode() {
/* 43 */     return this.subStatusCode;
/*    */   }
/*    */   
/*    */   public void setSubStatusCode(String subStatusCode) {
/* 47 */     this.subStatusCode = subStatusCode;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\RequestExecutionResponseXml.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */