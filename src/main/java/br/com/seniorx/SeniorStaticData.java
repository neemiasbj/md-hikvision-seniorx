package br.com.seniorx;

import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.ManagerDevice;
import br.com.thidi.middleware.resource.CLogger;
import java.util.ArrayList;
import java.util.List;

public class SeniorStaticData {
	private static List<ManagerDevice> managerDeviceList = new ArrayList<ManagerDevice>();
	private static List<AreaControlList> areaControlList = new ArrayList<AreaControlList>();

	public static List<ManagerDevice> getManagerDeviceList() {
		return managerDeviceList;
	}

	public static void setManagerDeviceList(List<ManagerDevice> managerDeviceList) {
		SeniorStaticData.managerDeviceList = managerDeviceList;
	}

	public static void upsertManagerDevice(ManagerDevice receivedDevice) {
		Integer devicePosition = null;
		for (int i = 0; i < managerDeviceList.size(); i++) {
			ManagerDevice existingDevice = managerDeviceList.get(i);
			if (existingDevice.getId().equals(receivedDevice.getId())) {
				devicePosition = Integer.valueOf(i);

				break;
			}
		}
		if (devicePosition != null) {
			managerDeviceList.set(devicePosition.intValue(), receivedDevice);
			CLogger.logSeniorDebug("ManagerDeviceList", "ManagerDevice with id " + receivedDevice.getId() + " updated");
		} else {
			managerDeviceList.add(receivedDevice);
			CLogger.logSeniorDebug("ManagerDeviceList", "ManagerDevice with id " + receivedDevice.getId() + " added");
		}
	}

	public static ManagerDevice getDeviceByNetworkIdentification(String networkIdentification) {
		for (ManagerDevice device : managerDeviceList) {
			if (device.getNetworkIdentification().equals(networkIdentification))
				return device;
		}
		return null;
	}

	public static ManagerDevice getDeviceByNetworkId(Long deviceId) {
		for (ManagerDevice device : managerDeviceList) {
			if (device.getId().equals(deviceId))
				return device;
		}
		return null;
	}

	public static List<AreaControlList> getAreaControlList() {
		return areaControlList;
	}

	public static void setAreaControlList(List<AreaControlList> areaList) {
		SeniorStaticData.areaControlList = areaList;
	}

	public static void upsertManagerDevice(AreaControlList receivedAreaControl) {
		for (int i = 0; i < managerDeviceList.size(); i++) {
			if (areaControlList.get(i).getId().equals(receivedAreaControl.getId())) {
				areaControlList.set(i, receivedAreaControl);
				CLogger.logSeniorDebug("AreaControlList",
						"AreaControl with id " + receivedAreaControl.getId() + " updated");
				return;
			}
		}
		areaControlList.add(receivedAreaControl);
		CLogger.logSeniorDebug("AreaControlList", "AreaControl with id " + receivedAreaControl.getId() + " added");
	}

	public static AreaControlList getAreaControlId(Long areaControlId) {
		for (AreaControlList areaControl : areaControlList)
			if (areaControl.getId().equals(areaControlId))
				return areaControl;
		return null;
	}

}
