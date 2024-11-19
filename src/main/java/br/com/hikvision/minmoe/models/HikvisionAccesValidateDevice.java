 package br.com.hikvision.minmoe.models;
 
 public class HikvisionAccesValidateDevice {
   private String deviceName;
   
   public HikvisionAccesValidateDevice(String deviceName) {
     this.deviceName = deviceName;
   }
   private String onlineLastAccess; private String offlineLastAccess;
   public String getDeviceName() {
     return this.deviceName;
   }
   
   public String getOnlineLastAccess() {
     return this.onlineLastAccess;
   }
   
   public void setOnlineLastAccess(String onlineLastAccess) {
     this.onlineLastAccess = onlineLastAccess;
   }
   
   public String getOfflineLastAccess() {
     return this.offlineLastAccess;
   }
   
   public void setOfflineLastAccess(String offlineLastAccess) {
     this.offlineLastAccess = offlineLastAccess;
   }
 
   
   public String toString() {
     return "EmployeeCardDevice [deviceName=" + this.deviceName + ", onlineLastAccess=" + this.onlineLastAccess + 
       ", offlineLastAccess=" + this.offlineLastAccess + "]";
   }
 }


