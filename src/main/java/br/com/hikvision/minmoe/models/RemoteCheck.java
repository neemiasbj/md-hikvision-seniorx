/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ public class RemoteCheck
/*    */ {
/*    */   private String statusCode;
/*    */   
/*    */   public String getStatusCode() {
/*  8 */     return this.statusCode;
/*    */   }
/*    */   private String statusString; private String subStatusCode;
/*    */   public void setStatusCode(String statusCode) {
/* 12 */     this.statusCode = statusCode;
/*    */   }
/*    */   
/*    */   public String getStatusString() {
/* 16 */     return this.statusString;
/*    */   }
/*    */   
/*    */   public void setStatusString(String statusString) {
/* 20 */     this.statusString = statusString;
/*    */   }
/*    */   
/*    */   public String getSubStatusCode() {
/* 24 */     return this.subStatusCode;
/*    */   }
/*    */   
/*    */   public void setSubStatusCode(String subStatusCode) {
/* 28 */     this.subStatusCode = subStatusCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 33 */     return "RemoteCheck [statusCode=" + this.statusCode + ", statusString=" + this.statusString + ", subStatusCode=" + this.subStatusCode + "]";
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\RemoteCheck.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */