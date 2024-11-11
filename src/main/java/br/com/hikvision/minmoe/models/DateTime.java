/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import jakarta.xml.bind.annotation.XmlElement;
/*    */ import jakarta.xml.bind.annotation.XmlRootElement;
/*    */ 
/*    */ 
/*    */ @XmlRootElement(name = "Time")
/*    */ public class DateTime
/*    */ {
/*    */   private String timeMode;
/*    */   private String localTime;
/*    */   private String timeZone;
/*    */   
/*    */   public DateTime() {}
/*    */   
/*    */   public DateTime(String timeMode, String localTime, String timeZone) {
/* 17 */     this.timeMode = timeMode;
/* 18 */     this.localTime = localTime;
/* 19 */     this.timeZone = timeZone;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "timeMode")
/*    */   public String getTimeMode() {
/* 24 */     return this.timeMode;
/*    */   }
/*    */   
/*    */   public void setTimeMode(String timeMode) {
/* 28 */     this.timeMode = timeMode;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "localTime")
/*    */   public String getLocalTime() {
/* 33 */     return this.localTime;
/*    */   }
/*    */   
/*    */   public void setLocalTime(String localTime) {
/* 37 */     this.localTime = localTime;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "timeZone")
/*    */   public String getTimeZone() {
/* 42 */     return this.timeZone;
/*    */   }
/*    */   
/*    */   public void setTimeZone(String timeZone) {
/* 46 */     this.timeZone = timeZone;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\DateTime.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
