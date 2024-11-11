/*     */ package br.com.hikvision.minmoe.models;
/*     */ 
/*     */ import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonIgnoreProperties(ignoreUnknown = true)
/*     */ public class EventRequest
/*     */ {
/*     */   @JsonProperty("ipAddress")
/*     */   private String ipAddress;
/*     */   @JsonProperty("portNo")
/*     */   private int portNo;
/*     */   @JsonProperty("protocol")
/*     */   private String protocol;
/*     */   @JsonProperty("macAddress")
/*     */   private String macAddress;
/*     */   @JsonProperty("channelID")
/*     */   private int channelID;
/*     */   @JsonProperty("dateTime")
/*     */   private String dateTime;
/*     */   @JsonProperty("activePostCount")
/*     */   private int activePostCount;
/*     */   @JsonProperty("eventType")
/*     */   private String eventType;
/*     */   @JsonProperty("eventState")
/*     */   private String eventState;
/*     */   @JsonProperty("eventDescription")
/*     */   private String eventDescription;
/*     */   @JsonIgnoreProperties(ignoreUnknown = true)
/*     */   @JsonProperty("AccessControllerEvent")
/*     */   private AccessControllerEvent accessControllerEvent;
/*     */   
/*     */   public String getIpAddress() {
/*  46 */     return this.ipAddress;
/*     */   }
/*     */   
/*     */   public void setIpAddress(String ipAddress) {
/*  50 */     this.ipAddress = ipAddress;
/*     */   }
/*     */   
/*     */   public int getPortNo() {
/*  54 */     return this.portNo;
/*     */   }
/*     */   
/*     */   public void setPortNo(int portNo) {
/*  58 */     this.portNo = portNo;
/*     */   }
/*     */   
/*     */   public String getProtocol() {
/*  62 */     return this.protocol;
/*     */   }
/*     */   
/*     */   public void setProtocol(String protocol) {
/*  66 */     this.protocol = protocol;
/*     */   }
/*     */   
/*     */   public String getMacAddress() {
/*  70 */     return this.macAddress;
/*     */   }
/*     */   
/*     */   public void setMacAddress(String macAddress) {
/*  74 */     this.macAddress = macAddress;
/*     */   }
/*     */   
/*     */   public int getChannelID() {
/*  78 */     return this.channelID;
/*     */   }
/*     */   
/*     */   public void setChannelID(int channelID) {
/*  82 */     this.channelID = channelID;
/*     */   }
/*     */   
/*     */   public String getDateTime() {
/*  86 */     return this.dateTime;
/*     */   }
/*     */   
/*     */   public void setDateTime(String dateTime) {
/*  90 */     this.dateTime = dateTime;
/*     */   }
/*     */   
/*     */   public int getActivePostCount() {
/*  94 */     return this.activePostCount;
/*     */   }
/*     */   
/*     */   public void setActivePostCount(int activePostCount) {
/*  98 */     this.activePostCount = activePostCount;
/*     */   }
/*     */   
/*     */   public String getEventType() {
/* 102 */     return this.eventType;
/*     */   }
/*     */   
/*     */   public void setEventType(String eventType) {
/* 106 */     this.eventType = eventType;
/*     */   }
/*     */   
/*     */   public String getEventState() {
/* 110 */     return this.eventState;
/*     */   }
/*     */   
/*     */   public void setEventState(String eventState) {
/* 114 */     this.eventState = eventState;
/*     */   }
/*     */   
/*     */   public String getEventDescription() {
/* 118 */     return this.eventDescription;
/*     */   }
/*     */   
/*     */   public void setEventDescription(String eventDescription) {
/* 122 */     this.eventDescription = eventDescription;
/*     */   }
/*     */   
/*     */   public AccessControllerEvent getAccessControllerEvent() {
/* 126 */     return this.accessControllerEvent;
/*     */   }
/*     */   
/*     */   public void setAccessControllerEvent(AccessControllerEvent accessControllerEvent) {
/* 130 */     this.accessControllerEvent = accessControllerEvent;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AccessControllerEvent
/*     */   {
/*     */     @JsonProperty("deviceName")
/*     */     private String deviceName;
/*     */     
/*     */     @JsonProperty("majorEventType")
/*     */     private int majorEventType;
/*     */     
/*     */     @JsonProperty("subEventType")
/*     */     private int subEventType;
/*     */     
/*     */     @JsonProperty("cardNo")
/*     */     private String cardNo;
/*     */     
/*     */     @JsonProperty("cardType")
/*     */     private String cardType;
/*     */     
/*     */     @JsonProperty("name")
/*     */     private String name;
/*     */     
/*     */     @JsonProperty("cardReaderKind")
/*     */     private int cardReaderKind;
/*     */     
/*     */     @JsonProperty("cardReaderNo")
/*     */     private int cardReaderNo;
/*     */     
/*     */     @JsonProperty("employeeNoString")
/*     */     private String employeeNoString;
/*     */     
/*     */     @JsonProperty("serialNo")
/*     */     private int serialNo;
/*     */     
/*     */     @JsonProperty("remoteCheck")
/*     */     private boolean remoteCheck;
/*     */     
/*     */     @JsonProperty("userType")
/*     */     private String userType;
/*     */     
/*     */     @JsonProperty("currentVerifyMode")
/*     */     private String currentVerifyMode;
/*     */     
/*     */     @JsonProperty("attendanceStatus")
/*     */     private String attendanceStatus;
/*     */     
/*     */     @JsonProperty("label")
/*     */     private String label;
/*     */     
/*     */     @JsonProperty("statusValue")
/*     */     private int statusValue;
/*     */     
/*     */     @JsonProperty("mask")
/*     */     private String mask;
/*     */     
/*     */     @JsonProperty("purePwdVerifyEnable")
/*     */     private boolean purePwdVerifyEnable;
/*     */     
/*     */     @JsonProperty("unlockRoomNo")
/*     */     private String unlockRoomNo;
/*     */ 
/*     */     
/*     */     public String getDeviceName() {
/* 195 */       return this.deviceName;
/*     */     }
/*     */     
/*     */     public void setDeviceName(String deviceName) {
/* 199 */       this.deviceName = deviceName;
/*     */     }
/*     */     
/*     */     public int getMajorEventType() {
/* 203 */       return this.majorEventType;
/*     */     }
/*     */     
/*     */     public void setMajorEventType(int majorEventType) {
/* 207 */       this.majorEventType = majorEventType;
/*     */     }
/*     */     
/*     */     public int getSubEventType() {
/* 211 */       return this.subEventType;
/*     */     }
/*     */     
/*     */     public void setSubEventType(int subEventType) {
/* 215 */       this.subEventType = subEventType;
/*     */     }
/*     */     
/*     */     public String getCardNo() {
/* 219 */       return this.cardNo;
/*     */     }
/*     */     
/*     */     public void setCardNo(String cardNo) {
/* 223 */       this.cardNo = cardNo;
/*     */     }
/*     */     
/*     */     public String getCardType() {
/* 227 */       return this.cardType;
/*     */     }
/*     */     
/*     */     public void setCardType(String cardType) {
/* 231 */       this.cardType = cardType;
/*     */     }
/*     */     
/*     */     public String getName() {
/* 235 */       return this.name;
/*     */     }
/*     */     
/*     */     public void setName(String name) {
/* 239 */       this.name = name;
/*     */     }
/*     */     
/*     */     public int getCardReaderKind() {
/* 243 */       return this.cardReaderKind;
/*     */     }
/*     */     
/*     */     public void setCardReaderKind(int cardReaderKind) {
/* 247 */       this.cardReaderKind = cardReaderKind;
/*     */     }
/*     */     
/*     */     public Integer getCardReaderNo() {
/* 251 */       return Integer.valueOf(this.cardReaderNo);
/*     */     }
/*     */     
/*     */     public void setCardReaderNo(int cardReaderNo) {
/* 255 */       this.cardReaderNo = cardReaderNo;
/*     */     }
/*     */     
/*     */     public String getEmployeeNoString() {
/* 259 */       return this.employeeNoString;
/*     */     }
/*     */     
/*     */     public void setEmployeeNoString(String employeeNoString) {
/* 263 */       this.employeeNoString = employeeNoString;
/*     */     }
/*     */     
/*     */     public int getSerialNo() {
/* 267 */       return this.serialNo;
/*     */     }
/*     */     
/*     */     public void setSerialNo(int serialNo) {
/* 271 */       this.serialNo = serialNo;
/*     */     }
/*     */     
/*     */     public boolean isRemoteCheck() {
/* 275 */       return this.remoteCheck;
/*     */     }
/*     */     
/*     */     public void setRemoteCheck(boolean remoteCheck) {
/* 279 */       this.remoteCheck = remoteCheck;
/*     */     }
/*     */     
/*     */     public String getUserType() {
/* 283 */       return this.userType;
/*     */     }
/*     */     
/*     */     public void setUserType(String userType) {
/* 287 */       this.userType = userType;
/*     */     }
/*     */     
/*     */     public String getCurrentVerifyMode() {
/* 291 */       return this.currentVerifyMode;
/*     */     }
/*     */     
/*     */     public void setCurrentVerifyMode(String currentVerifyMode) {
/* 295 */       this.currentVerifyMode = currentVerifyMode;
/*     */     }
/*     */     
/*     */     public String getAttendanceStatus() {
/* 299 */       return this.attendanceStatus;
/*     */     }
/*     */     
/*     */     public void setAttendanceStatus(String attendanceStatus) {
/* 303 */       this.attendanceStatus = attendanceStatus;
/*     */     }
/*     */     
/*     */     public String getLabel() {
/* 307 */       return this.label;
/*     */     }
/*     */     
/*     */     public void setLabel(String label) {
/* 311 */       this.label = label;
/*     */     }
/*     */     
/*     */     public int getStatusValue() {
/* 315 */       return this.statusValue;
/*     */     }
/*     */     
/*     */     public void setStatusValue(int statusValue) {
/* 319 */       this.statusValue = statusValue;
/*     */     }
/*     */     
/*     */     public String getMask() {
/* 323 */       return this.mask;
/*     */     }
/*     */     
/*     */     public void setMask(String mask) {
/* 327 */       this.mask = mask;
/*     */     }
/*     */     
/*     */     public boolean isPurePwdVerifyEnable() {
/* 331 */       return this.purePwdVerifyEnable;
/*     */     }
/*     */     
/*     */     public void setPurePwdVerifyEnable(boolean purePwdVerifyEnable) {
/* 335 */       this.purePwdVerifyEnable = purePwdVerifyEnable;
/*     */     }
/*     */     
/*     */     public String getUnlockRoomNo() {
/* 339 */       return this.unlockRoomNo;
/*     */     }
/*     */     
/*     */     public void setUnlockRoomNo(String unlockRoomNo) {
/* 343 */       this.unlockRoomNo = unlockRoomNo;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 348 */       return "AccessControllerEvent [deviceName=" + this.deviceName + ", majorEventType=" + this.majorEventType + 
/* 349 */         ", subEventType=" + this.subEventType + ", cardNo=" + this.cardNo + ", cardType=" + this.cardType + ", name=" + 
/* 350 */         this.name + ", cardReaderKind=" + this.cardReaderKind + ", cardReaderNo=" + this.cardReaderNo + 
/* 351 */         ", employeeNoString=" + this.employeeNoString + ", serialNo=" + this.serialNo + ", remoteCheck=" + 
/* 352 */         this.remoteCheck + ", userType=" + this.userType + ", currentVerifyMode=" + this.currentVerifyMode + 
/* 353 */         ", attendanceStatus=" + this.attendanceStatus + ", label=" + this.label + ", statusValue=" + this.statusValue + 
/* 354 */         ", mask=" + this.mask + ", purePwdVerifyEnable=" + this.purePwdVerifyEnable + ", unlockRoomNo=" + 
/* 355 */         this.unlockRoomNo + "]";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 361 */     return ("EventRequest [ipAddress=" + this.ipAddress + ", portNo=" + this.portNo + ", protocol=" + this.protocol + 
/* 362 */       ", macAddress=" + this.macAddress + ", channelID=" + this.channelID + ", dateTime=" + this.dateTime + 
/* 363 */       ", activePostCount=" + this.activePostCount + ", channelID=" + this.channelID + ", eventType=" + this.eventType + 
/* 364 */       ", eventState=" + this.eventState + ", eventDescription=" + this.eventDescription + ", accessControllerEvent=" + 
/* 365 */       this.accessControllerEvent != null) ? this.accessControllerEvent.toString() : (null + "]");
/*     */   }
/*     */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\EventRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */