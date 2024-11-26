 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 import com.fasterxml.jackson.annotation.JsonProperty;
 
 
 
 
 
 
 
 
 
 
 
 
 
 @JsonIgnoreProperties(ignoreUnknown = true)
 public class EventRequest
 {
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
   
   public String getIpAddress() {
     return this.ipAddress;
   }
   
   public void setIpAddress(String ipAddress) {
     this.ipAddress = ipAddress;
   }
   
   public int getPortNo() {
     return this.portNo;
   }
   
   public void setPortNo(int portNo) {
     this.portNo = portNo;
   }
   
   public String getProtocol() {
     return this.protocol;
   }
   
   public void setProtocol(String protocol) {
     this.protocol = protocol;
   }
   
   public String getMacAddress() {
     return this.macAddress;
   }
   
   public void setMacAddress(String macAddress) {
     this.macAddress = macAddress;
   }
   
   public int getChannelID() {
     return this.channelID;
   }
   
   public void setChannelID(int channelID) {
     this.channelID = channelID;
   }
   
   public String getDateTime() {
     return this.dateTime;
   }
   
   public void setDateTime(String dateTime) {
     this.dateTime = dateTime;
   }
   
   public int getActivePostCount() {
     return this.activePostCount;
   }
   
   public void setActivePostCount(int activePostCount) {
     this.activePostCount = activePostCount;
   }
   
   public String getEventType() {
     return this.eventType;
   }
   
   public void setEventType(String eventType) {
     this.eventType = eventType;
   }
   
   public String getEventState() {
     return this.eventState;
   }
   
   public void setEventState(String eventState) {
     this.eventState = eventState;
   }
   
   public String getEventDescription() {
     return this.eventDescription;
   }
   
   public void setEventDescription(String eventDescription) {
     this.eventDescription = eventDescription;
   }
   
   public AccessControllerEvent getAccessControllerEvent() {
     return this.accessControllerEvent;
   }
   
   public void setAccessControllerEvent(AccessControllerEvent accessControllerEvent) {
     this.accessControllerEvent = accessControllerEvent;
   }
 
   
   public static class AccessControllerEvent
   {
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
 
     
     public String getDeviceName() {
       return this.deviceName;
     }
     
     public void setDeviceName(String deviceName) {
       this.deviceName = deviceName;
     }
     
     public int getMajorEventType() {
       return this.majorEventType;
     }
     
     public void setMajorEventType(int majorEventType) {
       this.majorEventType = majorEventType;
     }
     
     public int getSubEventType() {
       return this.subEventType;
     }
     
     public void setSubEventType(int subEventType) {
       this.subEventType = subEventType;
     }
     
     public String getCardNo() {
       return this.cardNo;
     }
     
     public void setCardNo(String cardNo) {
       this.cardNo = cardNo;
     }
     
     public String getCardType() {
       return this.cardType;
     }
     
     public void setCardType(String cardType) {
       this.cardType = cardType;
     }
     
     public String getName() {
       return this.name;
     }
     
     public void setName(String name) {
       this.name = name;
     }
     
     public int getCardReaderKind() {
       return this.cardReaderKind;
     }
     
     public void setCardReaderKind(int cardReaderKind) {
       this.cardReaderKind = cardReaderKind;
     }
     
     public Integer getCardReaderNo() {
       return Integer.valueOf(this.cardReaderNo);
     }
     
     public void setCardReaderNo(int cardReaderNo) {
       this.cardReaderNo = cardReaderNo;
     }
     
     public String getEmployeeNoString() {
       return this.employeeNoString;
     }
     
     public void setEmployeeNoString(String employeeNoString) {
       this.employeeNoString = employeeNoString;
     }
     
     public int getSerialNo() {
       return this.serialNo;
     }
     
     public void setSerialNo(int serialNo) {
       this.serialNo = serialNo;
     }
     
     public Boolean isRemoteCheck() {
       return this.remoteCheck;
     }
     
     public void setRemoteCheck(boolean remoteCheck) {
       this.remoteCheck = remoteCheck;
     }
     
     public String getUserType() {
       return this.userType;
     }
     
     public void setUserType(String userType) {
       this.userType = userType;
     }
     
     public String getCurrentVerifyMode() {
       return this.currentVerifyMode;
     }
     
     public void setCurrentVerifyMode(String currentVerifyMode) {
       this.currentVerifyMode = currentVerifyMode;
     }
     
     public String getAttendanceStatus() {
       return this.attendanceStatus;
     }
     
     public void setAttendanceStatus(String attendanceStatus) {
       this.attendanceStatus = attendanceStatus;
     }
     
     public String getLabel() {
       return this.label;
     }
     
     public void setLabel(String label) {
       this.label = label;
     }
     
     public int getStatusValue() {
       return this.statusValue;
     }
     
     public void setStatusValue(int statusValue) {
       this.statusValue = statusValue;
     }
     
     public String getMask() {
       return this.mask;
     }
     
     public void setMask(String mask) {
       this.mask = mask;
     }
     
     public boolean isPurePwdVerifyEnable() {
       return this.purePwdVerifyEnable;
     }
     
     public void setPurePwdVerifyEnable(boolean purePwdVerifyEnable) {
       this.purePwdVerifyEnable = purePwdVerifyEnable;
     }
     
     public String getUnlockRoomNo() {
       return this.unlockRoomNo;
     }
     
     public void setUnlockRoomNo(String unlockRoomNo) {
       this.unlockRoomNo = unlockRoomNo;
     }
 
     
     public String toString() {
       return "AccessControllerEvent [deviceName=" + this.deviceName + ", majorEventType=" + this.majorEventType + 
         ", subEventType=" + this.subEventType + ", cardNo=" + this.cardNo + ", cardType=" + this.cardType + ", name=" + 
         this.name + ", cardReaderKind=" + this.cardReaderKind + ", cardReaderNo=" + this.cardReaderNo + 
         ", employeeNoString=" + this.employeeNoString + ", serialNo=" + this.serialNo + ", remoteCheck=" + 
         this.remoteCheck + ", userType=" + this.userType + ", currentVerifyMode=" + this.currentVerifyMode + 
         ", attendanceStatus=" + this.attendanceStatus + ", label=" + this.label + ", statusValue=" + this.statusValue + 
         ", mask=" + this.mask + ", purePwdVerifyEnable=" + this.purePwdVerifyEnable + ", unlockRoomNo=" + 
         this.unlockRoomNo + "]";
     }
   }
 
   
   public String toString() {
     return ("EventRequest [ipAddress=" + this.ipAddress + ", portNo=" + this.portNo + ", protocol=" + this.protocol + 
       ", macAddress=" + this.macAddress + ", channelID=" + this.channelID + ", dateTime=" + this.dateTime + 
       ", activePostCount=" + this.activePostCount + ", channelID=" + this.channelID + ", eventType=" + this.eventType + 
       ", eventState=" + this.eventState + ", eventDescription=" + this.eventDescription + ", accessControllerEvent=" + 
       this.accessControllerEvent != null) ? this.accessControllerEvent.toString() : (null + "]");
   }
 }


