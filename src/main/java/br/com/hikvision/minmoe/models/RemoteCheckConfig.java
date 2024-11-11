/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import br.com.hikvision.minmoe.enums.RemoteCheckCfgPassmode;
/*    */ import br.com.hikvision.minmoe.enums.RemoteCheckCfgUserType;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ 
/*    */ public class RemoteCheckConfig
/*    */ {
/*    */   @JsonProperty("remoteCheckCfg")
/*    */   private RemoteCheckCfg remoteCheckCfg;
/*    */   
/*    */   public RemoteCheckCfg getRemoteCheckCfg() {
/* 14 */     return this.remoteCheckCfg;
/*    */   }
/*    */   
/*    */   public void setRemoteCheckCfg(RemoteCheckCfg remoteCheckCfg) {
/* 18 */     this.remoteCheckCfg = remoteCheckCfg;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class RemoteCheckCfg
/*    */   {
/*    */     @JsonProperty("userType")
/*    */     private String userType;
/*    */     
/*    */     @JsonProperty("passmode")
/*    */     private String passMode;
/*    */     @JsonProperty("time")
/*    */     private int time;
/*    */     
/*    */     public RemoteCheckCfg(RemoteCheckCfgUserType userType, RemoteCheckCfgPassmode passMode, int time) {
/* 33 */       this.userType = userType.getValue();
/* 34 */       this.passMode = passMode.getValue();
/* 35 */       this.time = time;
/*    */     }
/*    */     
/*    */     public String getUserType() {
/* 39 */       return this.userType;
/*    */     }
/*    */     
/*    */     public void setUserType(String userType) {
/* 43 */       this.userType = userType;
/*    */     }
/*    */     
/*    */     public String getPassMode() {
/* 47 */       return this.passMode;
/*    */     }
/*    */     
/*    */     public void setPassMode(String passMode) {
/* 51 */       this.passMode = passMode;
/*    */     }
/*    */     
/*    */     public int getTime() {
/* 55 */       return this.time;
/*    */     }
/*    */     
/*    */     public void setTime(int time) {
/* 59 */       this.time = time;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\RemoteCheckConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */