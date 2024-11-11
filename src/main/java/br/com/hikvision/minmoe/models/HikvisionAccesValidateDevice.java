/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ public class HikvisionAccesValidateDevice {
/*    */   private String deviceName;
/*    */   
/*    */   public HikvisionAccesValidateDevice(String deviceName) {
/*  7 */     this.deviceName = deviceName;
/*    */   }
/*    */   private String onlineLastAccess; private String offlineLastAccess;
/*    */   public String getDeviceName() {
/* 11 */     return this.deviceName;
/*    */   }
/*    */   
/*    */   public String getOnlineLastAccess() {
/* 15 */     return this.onlineLastAccess;
/*    */   }
/*    */   
/*    */   public void setOnlineLastAccess(String onlineLastAccess) {
/* 19 */     this.onlineLastAccess = onlineLastAccess;
/*    */   }
/*    */   
/*    */   public String getOfflineLastAccess() {
/* 23 */     return this.offlineLastAccess;
/*    */   }
/*    */   
/*    */   public void setOfflineLastAccess(String offlineLastAccess) {
/* 27 */     this.offlineLastAccess = offlineLastAccess;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     return "EmployeeCardDevice [deviceName=" + this.deviceName + ", onlineLastAccess=" + this.onlineLastAccess + 
/* 33 */       ", offlineLastAccess=" + this.offlineLastAccess + "]";
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\HikvisionAccesValidateDevice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */