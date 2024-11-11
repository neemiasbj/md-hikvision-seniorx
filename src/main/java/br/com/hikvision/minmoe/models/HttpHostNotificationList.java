/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import jakarta.xml.bind.annotation.XmlElement;
/*    */ import jakarta.xml.bind.annotation.XmlRootElement;
/*    */ import jakarta.xml.bind.annotation.XmlType;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ @XmlRootElement(name = "HttpHostNotificationList")
/*    */ @XmlType(propOrder = {"version", "httpHostNotification"})
/*    */ public class HttpHostNotificationList
/*    */ {
/*    */   private String version;
/*    */   private List<HttpHostNotification> httpHostNotification;
/*    */   
/*    */   @XmlElement
/*    */   public String getVersion() {
/* 18 */     return this.version;
/*    */   }
/*    */   
/*    */   public void setVersion(String version) {
/* 22 */     this.version = version;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "HttpHostNotification")
/*    */   public List<HttpHostNotification> getHttpHostNotification() {
/* 27 */     return this.httpHostNotification;
/*    */   }
/*    */   
/*    */   public void setHttpHostNotification(List<HttpHostNotification> httpHostNotification) {
/* 31 */     this.httpHostNotification = httpHostNotification;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\HttpHostNotificationList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */