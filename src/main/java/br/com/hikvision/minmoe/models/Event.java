package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {

	@JsonProperty("ipAddress")
	private String ipAddress;

	@JsonProperty("portNo")
	private int portNo;

	@JsonProperty("protocol")
	private String protocol;

	@JsonProperty("macAddress")
	private String macAddress;

	@JsonProperty("channelID")
	private int channelId;

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

	@JsonProperty("AccessControllerEvent")
	private AccessControllerEvent accessControllerEvent;

	// Getters and setters for all fields

	public static class AccessControllerEvent {

		@JsonProperty("deviceName")
		private String deviceName;

		@JsonProperty("majorEventType")
		private int majorEventType;

		@JsonProperty("subEventType")
		private int subEventType;

		@JsonProperty("name")
		private String name;

		@JsonProperty("cardReaderKind")
		private int cardReaderKind;

		@JsonProperty("cardReaderNo")
		private int cardReaderNo;

		@JsonProperty("verifyNo")
		private int verifyNo;

		@JsonProperty("employeeNoString")
		private String employeeNoString;

		@JsonProperty("serialNo")
		private int serialNo;

		@JsonProperty("userType")
		private String userType;

		@JsonProperty("remoteCheck")
		private boolean remoteCheck;

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

		public int getCardReaderNo() {
			return cardReaderNo;
		}

		public void setCardReaderNo(int cardReaderNo) {
			this.cardReaderNo = cardReaderNo;
		}

		public int getVerifyNo() {
			return verifyNo;
		}

		public void setVerifyNo(int verifyNo) {
			this.verifyNo = verifyNo;
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

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public boolean isRemoteCheck() {
			return remoteCheck;
		}

		public void setRemoteCheck(boolean remoteCheck) {
			this.remoteCheck = remoteCheck;
		}

	}

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

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
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
}
