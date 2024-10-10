package br.com.hikvision.minmoe.models;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCardDevice {
	private String deviceName;
	private List<EmployeeCard> employeeCards;

	public EmployeeCardDevice(String deviceName) {
		this.deviceName = deviceName;
		this.employeeCards = new ArrayList<>();
	}

	public String getDeviceName() {
		return deviceName;
	}

	public List<EmployeeCard> getEmployeeCards() {
		return employeeCards;
	}

	@Override
	public String toString() {
		return "EmployeeCardDevice [deviceName=" + deviceName + ", employeeCards=" + employeeCards + "]";
	}

}
