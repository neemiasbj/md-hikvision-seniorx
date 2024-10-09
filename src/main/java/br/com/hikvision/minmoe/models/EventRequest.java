package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventRequest {

	@JsonProperty("ipAddress")
	private String ipAddress;

	@JsonProperty("portNo")
	private int portNo;

	@JsonProperty("protocol")
	private String protocol;

	@JsonProperty("macAddress")
	private String macAddress;

	@JsonProperty("channelID")
	private int channelID;

	@JsonProperty("dateTime")
	private String dateTime;

	@JsonProperty("activePostCount")
	private int activePostCount;

	@JsonProperty("eventType")
	private String eventType;

	@JsonProperty("eventState")
	private String eventState;

	@JsonProperty("eventDescription")
	private String eventDescription;

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty("AccessControllerEvent")
	private AccessControllerEvent accessControllerEvent;

	// Getters and Setters

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getPortNo() {
		return portNo;
	}

	public void setPortNo(int portNo) {
		this.portNo = portNo;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public int getChannelID() {
		return channelID;
	}

	public void setChannelID(int channelID) {
		this.channelID = channelID;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getActivePostCount() {
		return activePostCount;
	}

	public void setActivePostCount(int activePostCount) {
		this.activePostCount = activePostCount;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventState() {
		return eventState;
	}

	public void setEventState(String eventState) {
		this.eventState = eventState;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public AccessControllerEvent getAccessControllerEvent() {
		return accessControllerEvent;
	}

	public void setAccessControllerEvent(AccessControllerEvent accessControllerEvent) {
		this.accessControllerEvent = accessControllerEvent;
	}

	public static class AccessControllerEvent {

		@JsonProperty("deviceName")
		private String deviceName;

		@JsonProperty("majorEventType")
		private int majorEventType;

		@JsonProperty("subEventType")
		private int subEventType;

		@JsonProperty("cardNo")
		private String cardNo;

		@JsonProperty("cardType")
		private String cardType;

		@JsonProperty("name")
		private String name;

		@JsonProperty("cardReaderKind")
		private int cardReaderKind;

		@JsonProperty("cardReaderNo")
		private int cardReaderNo;

		@JsonProperty("employeeNoString")
		private String employeeNoString;

		@JsonProperty("serialNo")
		private int serialNo;

		@JsonProperty("remoteCheck")
		private boolean remoteCheck;

		@JsonProperty("userType")
		private String userType;

		@JsonProperty("currentVerifyMode")
		private String currentVerifyMode;

		@JsonProperty("attendanceStatus")
		private String attendanceStatus;

		@JsonProperty("label")
		private String label;

		@JsonProperty("statusValue")
		private int statusValue;

		@JsonProperty("mask")
		private String mask;

		@JsonProperty("purePwdVerifyEnable")
		private boolean purePwdVerifyEnable;

		@JsonProperty("unlockRoomNo")
		private String unlockRoomNo;

		// Getters and Setters

		public String getDeviceName() {
			return deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public int getMajorEventType() {
			return majorEventType;
		}

		public void setMajorEventType(int majorEventType) {
			this.majorEventType = majorEventType;
		}

		public int getSubEventType() {
			return subEventType;
		}

		public void setSubEventType(int subEventType) {
			this.subEventType = subEventType;
		}

		public String getCardNo() {
			return cardNo;
		}

		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCardReaderKind() {
			return cardReaderKind;
		}

		public void setCardReaderKind(int cardReaderKind) {
			this.cardReaderKind = cardReaderKind;
		}

		public Integer getCardReaderNo() {
			return cardReaderNo;
		}

		public void setCardReaderNo(int cardReaderNo) {
			this.cardReaderNo = cardReaderNo;
		}

		public String getEmployeeNoString() {
			return employeeNoString;
		}

		public void setEmployeeNoString(String employeeNoString) {
			this.employeeNoString = employeeNoString;
		}

		public int getSerialNo() {
			return serialNo;
		}

		public void setSerialNo(int serialNo) {
			this.serialNo = serialNo;
		}

		public boolean isRemoteCheck() {
			return remoteCheck;
		}

		public void setRemoteCheck(boolean remoteCheck) {
			this.remoteCheck = remoteCheck;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getCurrentVerifyMode() {
			return currentVerifyMode;
		}

		public void setCurrentVerifyMode(String currentVerifyMode) {
			this.currentVerifyMode = currentVerifyMode;
		}

		public String getAttendanceStatus() {
			return attendanceStatus;
		}

		public void setAttendanceStatus(String attendanceStatus) {
			this.attendanceStatus = attendanceStatus;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public int getStatusValue() {
			return statusValue;
		}

		public void setStatusValue(int statusValue) {
			this.statusValue = statusValue;
		}

		public String getMask() {
			return mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}

		public boolean isPurePwdVerifyEnable() {
			return purePwdVerifyEnable;
		}

		public void setPurePwdVerifyEnable(boolean purePwdVerifyEnable) {
			this.purePwdVerifyEnable = purePwdVerifyEnable;
		}

		public String getUnlockRoomNo() {
			return unlockRoomNo;
		}

		public void setUnlockRoomNo(String unlockRoomNo) {
			this.unlockRoomNo = unlockRoomNo;
		}

		@Override
		public String toString() {
			return "AccessControllerEvent [deviceName=" + deviceName + ", majorEventType=" + majorEventType
					+ ", subEventType=" + subEventType + ", cardNo=" + cardNo + ", cardType=" + cardType + ", name="
					+ name + ", cardReaderKind=" + cardReaderKind + ", cardReaderNo=" + cardReaderNo
					+ ", employeeNoString=" + employeeNoString + ", serialNo=" + serialNo + ", remoteCheck="
					+ remoteCheck + ", userType=" + userType + ", currentVerifyMode=" + currentVerifyMode
					+ ", attendanceStatus=" + attendanceStatus + ", label=" + label + ", statusValue=" + statusValue
					+ ", mask=" + mask + ", purePwdVerifyEnable=" + purePwdVerifyEnable + ", unlockRoomNo="
					+ unlockRoomNo + "]";
		}
	}

	@Override
	public String toString() {
		return "EventRequest [ipAddress=" + ipAddress + ", portNo=" + portNo + ", protocol=" + protocol
				+ ", macAddress=" + macAddress + ", channelID=" + channelID + ", dateTime=" + dateTime
				+ ", activePostCount=" + activePostCount + ", channelID=" + channelID + ", eventType=" + eventType
				+ ", eventState=" + eventState + ", eventDescription=" + eventDescription + ", accessControllerEvent="
				+ accessControllerEvent != null ? accessControllerEvent.toString() : null + "]";
	}

}
