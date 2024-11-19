 package br.com.hikvision.services;
 
 import br.com.hikvision.minmoe.models.HikvisionAccesValidateDevice;
 import java.util.ArrayList;
 
 public class HikvisionAccessManagerService
 {
   private static ArrayList<HikvisionAccesValidateDevice> devices = new ArrayList<>();
   
   private static HikvisionAccesValidateDevice getDeviceByName(String deviceName) {
     for (HikvisionAccesValidateDevice device : devices) {
       if (device.getDeviceName().equals(deviceName))
         return device; 
     }  return null;
   }
   
   public static void updateDeviceLastOnlineAccess(String deviceName, String dateTime) {
     HikvisionAccesValidateDevice device = getDeviceByName(deviceName);
     if (device == null)
       device = addDevice(deviceName); 
     device.setOnlineLastAccess(dateTime);
   }
   
   public static boolean isNewerOfflineAccess(String deviceName, String dateTime) {
     HikvisionAccesValidateDevice device = getDeviceByName(deviceName);
     if (device == null) {
       device = addDevice(deviceName);
     }
     if (device.getOfflineLastAccess() != null && dateTime.compareTo(device.getOfflineLastAccess()) == 0) {
       return false;
     }
     device.setOnlineLastAccess(dateTime);
     device.setOfflineLastAccess(dateTime);
     return true;
   }
   
   private static HikvisionAccesValidateDevice addDevice(String deviceName) {
     HikvisionAccesValidateDevice device = new HikvisionAccesValidateDevice(deviceName);
     devices.add(device);
     return device;
   }
 }
