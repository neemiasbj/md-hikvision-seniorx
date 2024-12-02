package br.com.seniorx.models;

import br.com.seniorx.models.Event.StatusEnum;

public class ManagerDeviceStatus extends ManagerDevice {

	private StatusEnum deviceStatus = StatusEnum.OFFLINE;

	public StatusEnum getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(StatusEnum deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

}
