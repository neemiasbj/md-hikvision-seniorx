/*    */ package br.com.hikvision.services;
/*    */ 
/*    */ import br.com.hikvision.minmoe.models.HikvisionAccesValidateDevice;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class HikvisionEmployeeCardManager
/*    */ {
/*  8 */   private static ArrayList<HikvisionAccesValidateDevice> devices = new ArrayList<>();
/*    */   
/*    */   private static HikvisionAccesValidateDevice getDeviceByName(String deviceName) {
/* 11 */     for (HikvisionAccesValidateDevice device : devices) {
/* 12 */       if (device.getDeviceName().equals(deviceName))
/* 13 */         return device; 
/* 14 */     }  return null;
/*    */   }
/*    */   
/*    */   public static void updateDeviceLastOnlineAccess(String deviceName, String dateTime) {
/* 18 */     HikvisionAccesValidateDevice device = getDeviceByName(deviceName);
/* 19 */     if (device == null)
/* 20 */       device = addDevice(deviceName); 
/* 21 */     device.setOnlineLastAccess(dateTime);
/*    */   }
/*    */   
/*    */   public static boolean isNewerOfflineAccess(String deviceName, String dateTime) {
/* 25 */     HikvisionAccesValidateDevice device = getDeviceByName(deviceName);
/* 26 */     if (device == null) {
/* 27 */       device = addDevice(deviceName);
/*    */     }
/* 29 */     if (device.getOfflineLastAccess() != null && dateTime.compareTo(device.getOfflineLastAccess()) == 0) {
/* 30 */       return false;
/*    */     }
/* 32 */     device.setOnlineLastAccess(dateTime);
/* 33 */     device.setOfflineLastAccess(dateTime);
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   private static HikvisionAccesValidateDevice addDevice(String deviceName) {
/* 38 */     HikvisionAccesValidateDevice device = new HikvisionAccesValidateDevice(deviceName);
/* 39 */     devices.add(device);
/* 40 */     return device;
/*    */   }
/*    */ }
