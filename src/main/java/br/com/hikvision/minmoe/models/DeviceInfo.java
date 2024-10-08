package br.com.hikvision.minmoe.models;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DeviceInfo", namespace = "http://www.isapi.org/ver20/XMLSchema")
@XmlType(propOrder = { "deviceName", "deviceID", "model", "serialNumber", "macAddress", "firmwareVersion", "firmwareReleasedDate", "encoderVersion", "encoderReleasedDate", "deviceType", "telecontrolID", "supportBeep", "localZoneNum", "alarmOutNum",
		"electroLockNum", "RS485Num", "manufacturer", "OEMCode", "marketType" })
public class DeviceInfo {

	private String deviceName;
	private int deviceID;
	private String model;
	private String serialNumber;
	private String macAddress;
	private String firmwareVersion;
	private String firmwareReleasedDate;
	private String encoderVersion;
	private String encoderReleasedDate;
	private String deviceType;
	private int telecontrolID;
	private boolean supportBeep;
	private int localZoneNum;
	private int alarmOutNum;
	private int electroLockNum;
	private int RS485Num;
	private String manufacturer;
	private int OEMCode;
	private int marketType;

	// Getters and Setters

	@XmlElement(name = "deviceName", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@XmlElement(name = "deviceID", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(int deviceID) {
		this.deviceID = deviceID;
	}

	@XmlElement(name = "model", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@XmlElement(name = "serialNumber", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@XmlElement(name = "macAddress", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	@XmlElement(name = "firmwareVersion", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	@XmlElement(name = "firmwareReleasedDate", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getFirmwareReleasedDate() {
		return firmwareReleasedDate;
	}

	public void setFirmwareReleasedDate(String firmwareReleasedDate) {
		this.firmwareReleasedDate = firmwareReleasedDate;
	}

	@XmlElement(name = "encoderVersion", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getEncoderVersion() {
		return encoderVersion;
	}

	public void setEncoderVersion(String encoderVersion) {
		this.encoderVersion = encoderVersion;
	}

	@XmlElement(name = "encoderReleasedDate", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getEncoderReleasedDate() {
		return encoderReleasedDate;
	}

	public void setEncoderReleasedDate(String encoderReleasedDate) {
		this.encoderReleasedDate = encoderReleasedDate;
	}

	@XmlElement(name = "deviceType", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	@XmlElement(name = "telecontrolID", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getTelecontrolID() {
		return telecontrolID;
	}

	public void setTelecontrolID(int telecontrolID) {
		this.telecontrolID = telecontrolID;
	}

	@XmlElement(name = "supportBeep", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public boolean isSupportBeep() {
		return supportBeep;
	}

	public void setSupportBeep(boolean supportBeep) {
		this.supportBeep = supportBeep;
	}

	@XmlElement(name = "localZoneNum", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getLocalZoneNum() {
		return localZoneNum;
	}

	public void setLocalZoneNum(int localZoneNum) {
		this.localZoneNum = localZoneNum;
	}

	@XmlElement(name = "alarmOutNum", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getAlarmOutNum() {
		return alarmOutNum;
	}

	public void setAlarmOutNum(int alarmOutNum) {
		this.alarmOutNum = alarmOutNum;
	}

	@XmlElement(name = "electroLockNum", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getElectroLockNum() {
		return electroLockNum;
	}

	public void setElectroLockNum(int electroLockNum) {
		this.electroLockNum = electroLockNum;
	}

	@XmlElement(name = "RS485Num", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getRS485Num() {
		return RS485Num;
	}

	public void setRS485Num(int RS485Num) {
		this.RS485Num = RS485Num;
	}

	@XmlElement(name = "manufacturer", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@XmlElement(name = "OEMCode", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getOEMCode() {
		return OEMCode;
	}

	public void setOEMCode(int OEMCode) {
		this.OEMCode = OEMCode;
	}

	@XmlElement(name = "marketType", namespace = "http://www.isapi.org/ver20/XMLSchema")
	public int getMarketType() {
		return marketType;
	}

	public void setMarketType(int marketType) {
		this.marketType = marketType;
	}

	@Override
	public String toString() {
		return "DeviceInfo [deviceName=" + deviceName + ", deviceID=" + deviceID + ", model=" + model + ", serialNumber=" + serialNumber + ", macAddress=" + macAddress + ", firmwareVersion=" + firmwareVersion + ", firmwareReleasedDate="
				+ firmwareReleasedDate + ", encoderVersion=" + encoderVersion + ", encoderReleasedDate=" + encoderReleasedDate + ", deviceType=" + deviceType + ", telecontrolID=" + telecontrolID + ", supportBeep=" + supportBeep + ", localZoneNum="
				+ localZoneNum + ", alarmOutNum=" + alarmOutNum + ", electroLockNum=" + electroLockNum + ", RS485Num=" + RS485Num + ", manufacturer=" + manufacturer + ", OEMCode=" + OEMCode + ", marketType=" + marketType + "]";
	}

}
