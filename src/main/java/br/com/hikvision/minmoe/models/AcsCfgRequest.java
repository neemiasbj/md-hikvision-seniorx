/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ public class AcsCfgRequest
/*    */ {
/*    */   @JsonProperty("AcsCfg")
/*    */   private AcsCfg acsCfg;
/*    */   
/*    */   public AcsCfg getAcsCfg() {
/* 11 */     return this.acsCfg;
/*    */   }
/*    */   
/*    */   public void setAcsCfg(AcsCfg acsCfg) {
/* 15 */     this.acsCfg = acsCfg;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class AcsCfg
/*    */   {
/*    */     @JsonProperty("remoteCheckDoorEnabled")
/*    */     private boolean remoteCheckDoorEnabled;
/*    */     @JsonProperty("checkChannelType")
/*    */     private String checkChannelType;
/*    */     
/*    */     public boolean isRemoteCheckDoorEnabled() {
/* 27 */       return this.remoteCheckDoorEnabled;
/*    */     }
/*    */     
/*    */     public void setRemoteCheckDoorEnabled(boolean remoteCheckDoorEnabled) {
/* 31 */       this.remoteCheckDoorEnabled = remoteCheckDoorEnabled;
/*    */     }
/*    */     
/*    */     public String getCheckChannelType() {
/* 35 */       return this.checkChannelType;
/*    */     }
/*    */     
/*    */     public void setCheckChannelType(String checkChannelType) {
/* 39 */       this.checkChannelType = checkChannelType;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\AcsCfgRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
