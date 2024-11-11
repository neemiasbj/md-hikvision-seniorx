/*    */ package br.com.hikvision.minmoe.enums;
/*    */ 
/*    */ public enum MinMoeCheckChannelType
/*    */ {
/*  5 */   PRIVATE_SDK("PrivateSDK"), ISAPI_LISTEN("ISAPIListen");
/*    */   
/*    */   private final String version;
/*    */   
/*    */   MinMoeCheckChannelType(String version) {
/* 10 */     this.version = version;
/*    */   }
/*    */   
/*    */   public String getVersion() {
/* 14 */     return this.version;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\enums\MinMoeCheckChannelType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */