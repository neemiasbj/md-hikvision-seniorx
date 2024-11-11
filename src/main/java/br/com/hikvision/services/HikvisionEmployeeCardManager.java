<<<<<<< HEAD
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\services\HikvisionEmployeeCardManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.hikvision.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.hikvision.minmoe.models.EmployeeCard;
import br.com.hikvision.minmoe.models.EmployeeCardDevice;
import br.com.thidi.middleware.resource.CLogger;

//@Service
public class HikvisionEmployeeCardManager {
	private static ArrayList<EmployeeCardDevice> devices = new ArrayList<>();;
	private static ArrayList<EmployeeCard> employeeCards = new ArrayList<>();

//	@Autowired
	public HikvisionEmployeeCardManager() {
		startCleanerTask();
	}

	public void addDevice(String deviceName) {
		if (getDeviceByName(deviceName) == null) {
			devices.add(new EmployeeCardDevice(deviceName));
			System.out.println("Device added: " + deviceName);
		} else {
			System.out.println("Device already exists: " + deviceName);
		}
	}

	private static EmployeeCardDevice getDeviceByName(String deviceName) {
		for (EmployeeCardDevice device : devices) {
			System.out.println(device.toString());
			if (device.getDeviceName().equals(deviceName)) {
				return device;
			}
		}
		return null;
	}

	public static void addEmployeeCardToDevice(String deviceName, EmployeeCard emplCard) {
		EmployeeCardDevice device = getDeviceByName(deviceName);
		if (device != null) {
			device.getEmployeeCards().add(emplCard);
			System.out.println("Added card to device " + deviceName + ": " + emplCard.toString());
		} else {
			System.out.println("Device not found: " + deviceName);
		}
	}

	public static boolean hasRegisterByCardIdUnderFiveSeconds(String deviceName, EmployeeCard employeeCard) {
		CLogger.logHikivisionDebug("hasRegisterByCardIdUnderFiveSeconds", displayEmployeeCards());
		EmployeeCardDevice device = getDeviceByName(deviceName);

		if (device != null) {
			LocalDateTime now = LocalDateTime.now();
			Iterator<EmployeeCard> iterator = device.getEmployeeCards().iterator();

			while (iterator.hasNext()) {
				EmployeeCard card = iterator.next();
				Duration duration = Duration.between(card.getDateTime(), now);

				if (card.getCardId() != null && card.getCardId().equals(employeeCard.getCardId())) {
					if (duration.getSeconds() > 5) {
						iterator.remove();
						addEmployeeCardToDevice(deviceName, employeeCard);
						return false;
					} else
						return true;
				}
			}
			addEmployeeCardToDevice(deviceName, employeeCard);
			return false;
		} else {
			EmployeeCardDevice newDevice = new EmployeeCardDevice(deviceName);
			newDevice.getEmployeeCards().add(employeeCard);
			devices.add(newDevice);
			return false;
		}
	}

	public static boolean hasRegisterByEmployeeIdUnderFiveSeconds(String deviceName, EmployeeCard employeeCard) {
		LocalDateTime now = LocalDateTime.now();
		Iterator<EmployeeCard> iterator = employeeCards.iterator();

		EmployeeCardDevice device = getDeviceByName(deviceName);

		if (device != null) {
			while (iterator.hasNext()) {
				EmployeeCard card = iterator.next();
				Duration duration = Duration.between(card.getDateTime(), now);

				if (card.getEmployeeId() != null && card.getEmployeeId().equals(employeeCard.getEmployeeId())) {
					if (duration.getSeconds() > 5) {
						iterator.remove();
						addEmployeeCardToDevice(deviceName, employeeCard);
						return false;
					} else
						return true;
				}
			}
			addEmployeeCardToDevice(deviceName, employeeCard);
			return false;
		} else {
			EmployeeCardDevice newDevice = new EmployeeCardDevice(deviceName);
			newDevice.getEmployeeCards().add(employeeCard);
			devices.add(newDevice);
			return false;
		}
	}

	private static void cleanOldCards() {
		CLogger.logHikivisionDebug("HikivisionEmployeeCardManager", "Cleaning old cards");

		for (EmployeeCardDevice device : devices) {
			LocalDateTime now = LocalDateTime.now();
			Iterator<EmployeeCard> iterator = device.getEmployeeCards().iterator();

			while (iterator.hasNext()) {
				EmployeeCard card = iterator.next();
				Duration duration = Duration.between(card.getDateTime(), now);
				if (duration.getSeconds() > 5)
					iterator.remove();
			}
		}
		CLogger.logHikivisionDebug("HikivisionEmployeeCardManager", "Old cards cleaned");
	}

	public static void startCleanerTask() {
		Runnable cleanerTask = () -> {
			while (true) {
				try {
					Thread.sleep(30000);
					cleanOldCards();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread cleanerThread = new Thread(cleanerTask);
		cleanerThread.setDaemon(true);
		cleanerThread.start();
	}

	public static String displayEmployeeCards() {
		if (employeeCards.isEmpty()) {
			return "No Employee Cards in the list.";
		} else {
			List<String> list = new ArrayList<String>();
			for (EmployeeCard card : employeeCards)
				list.add(card.toString());
			return list.toString();
		}
	}

}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
