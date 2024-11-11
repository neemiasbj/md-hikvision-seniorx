<<<<<<< HEAD
/*    */ package br.com.seniorx;
/*    */ 
/*    */ import br.com.seniorx.models.ManagerDevice;
/*    */ import br.com.thidi.middleware.resource.CLogger;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class ManagerDeviceList
/*    */ {
/* 11 */   private static List<ManagerDevice> managerDeviceList = new ArrayList<>();
/*    */   
/*    */   public static List<ManagerDevice> getManagerDeviceList() {
/* 14 */     return managerDeviceList;
/*    */   }
/*    */   
/*    */   public static void setManagerDeviceList(List<ManagerDevice> managerDeviceList) {
/* 18 */     ManagerDeviceList.managerDeviceList = managerDeviceList;
/*    */   }
/*    */   
/*    */   public static void upsertManagerDevice(ManagerDevice receivedDevice) {
/* 22 */     Integer devicePosition = null;
/* 23 */     for (int i = 0; i < managerDeviceList.size(); i++) {
/* 24 */       ManagerDevice existingDevice = managerDeviceList.get(i);
/* 25 */       if (existingDevice.getId().equals(receivedDevice.getId())) {
/* 26 */         devicePosition = Integer.valueOf(i);
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 31 */     if (devicePosition != null) {
/* 32 */       managerDeviceList.set(devicePosition.intValue(), receivedDevice);
/* 33 */       CLogger.logSeniorDebug("ManagerDeviceList", "ManagerDevice with id " + receivedDevice.getId() + " updated");
/*    */     } else {
/* 35 */       managerDeviceList.add(receivedDevice);
/* 36 */       CLogger.logSeniorDebug("ManagerDeviceList", "ManagerDevice with id " + receivedDevice.getId() + " added");
/*    */     } 
/*    */   }
/*    */   
/*    */   public static ManagerDevice getDeviceByNetworkIdentification(String networkIdentification) {
/* 41 */     for (ManagerDevice device : managerDeviceList) {
/* 42 */       if (device.getNetworkIdentification().equals(networkIdentification))
/* 43 */         return device; 
/* 44 */     }  return null;
/*    */   }
/*    */   
/*    */   public static ManagerDevice getDeviceByNetworkId(Long deviceId) {
/* 48 */     for (ManagerDevice device : managerDeviceList) {
/* 49 */       if (device.getId().equals(deviceId))
/* 50 */         return device; 
/* 51 */     }  return null;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\ManagerDeviceList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx;

import java.util.ArrayList;
import java.util.List;

import br.com.seniorx.models.ManagerDevice;

public class ManagerDeviceList {

	private static List<ManagerDevice> managerDeviceList = new ArrayList<ManagerDevice>();

	public static List<ManagerDevice> getManagerDeviceList() {
		return managerDeviceList;
	}

	public static void setManagerDeviceList(List<ManagerDevice> managerDeviceList) {
		ManagerDeviceList.managerDeviceList = managerDeviceList;
	}

	public static ManagerDevice getDeviceByNetworkIdentification(String networkIdentification) {
		for (ManagerDevice device : managerDeviceList)
			if (device.getNetworkIdentification().equals(networkIdentification))
				return device;
		return null;
	}

	public static ManagerDevice getDeviceByNetworkId(Long deviceId) {
		for (ManagerDevice device : managerDeviceList)
			if (device.getId().equals(deviceId))
				return device;
		return null;
	}

}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
