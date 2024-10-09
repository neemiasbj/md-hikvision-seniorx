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
