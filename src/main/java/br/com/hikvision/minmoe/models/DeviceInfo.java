/*     */ package br.com.hikvision.minmoe.models;
/*     */ 
/*     */ import jakarta.xml.bind.annotation.XmlElement;
/*     */ import jakarta.xml.bind.annotation.XmlRootElement;
/*     */ import jakarta.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlRootElement(name = "DeviceInfo", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */ @XmlType(propOrder = {"deviceName", "deviceID", "model", "serialNumber", "macAddress", "firmwareVersion", "firmwareReleasedDate", "encoderVersion", "encoderReleasedDate", "deviceType", "telecontrolID", "supportBeep", "localZoneNum", "alarmOutNum", "electroLockNum", "RS485Num", "manufacturer", "OEMCode", "marketType"})
/*     */ public class DeviceInfo
/*     */ {
/*     */   private String deviceName;
/*     */   private int deviceID;
/*     */   private String model;
/*     */   private String serialNumber;
/*     */   private String macAddress;
/*     */   private String firmwareVersion;
/*     */   private String firmwareReleasedDate;
/*     */   private String encoderVersion;
/*     */   private String encoderReleasedDate;
/*     */   private String deviceType;
/*     */   private int telecontrolID;
/*     */   private boolean supportBeep;
/*     */   private int localZoneNum;
/*     */   private int alarmOutNum;
/*     */   private int electroLockNum;
/*     */   private int RS485Num;
/*     */   private String manufacturer;
/*     */   private int OEMCode;
/*     */   private int marketType;
/*     */   
/*     */   @XmlElement(name = "deviceName", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getDeviceName() {
/*  36 */     return this.deviceName;
/*     */   }
/*     */   
/*     */   public void setDeviceName(String deviceName) {
/*  40 */     this.deviceName = deviceName;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "deviceID", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getDeviceID() {
/*  45 */     return this.deviceID;
/*     */   }
/*     */   
/*     */   public void setDeviceID(int deviceID) {
/*  49 */     this.deviceID = deviceID;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "model", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getModel() {
/*  54 */     return this.model;
/*     */   }
/*     */   
/*     */   public void setModel(String model) {
/*  58 */     this.model = model;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "serialNumber", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getSerialNumber() {
/*  63 */     return this.serialNumber;
/*     */   }
/*     */   
/*     */   public void setSerialNumber(String serialNumber) {
/*  67 */     this.serialNumber = serialNumber;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "macAddress", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getMacAddress() {
/*  72 */     return this.macAddress;
/*     */   }
/*     */   
/*     */   public void setMacAddress(String macAddress) {
/*  76 */     this.macAddress = macAddress;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "firmwareVersion", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getFirmwareVersion() {
/*  81 */     return this.firmwareVersion;
/*     */   }
/*     */   
/*     */   public void setFirmwareVersion(String firmwareVersion) {
/*  85 */     this.firmwareVersion = firmwareVersion;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "firmwareReleasedDate", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getFirmwareReleasedDate() {
/*  90 */     return this.firmwareReleasedDate;
/*     */   }
/*     */   
/*     */   public void setFirmwareReleasedDate(String firmwareReleasedDate) {
/*  94 */     this.firmwareReleasedDate = firmwareReleasedDate;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "encoderVersion", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getEncoderVersion() {
/*  99 */     return this.encoderVersion;
/*     */   }
/*     */   
/*     */   public void setEncoderVersion(String encoderVersion) {
/* 103 */     this.encoderVersion = encoderVersion;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "encoderReleasedDate", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getEncoderReleasedDate() {
/* 108 */     return this.encoderReleasedDate;
/*     */   }
/*     */   
/*     */   public void setEncoderReleasedDate(String encoderReleasedDate) {
/* 112 */     this.encoderReleasedDate = encoderReleasedDate;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "deviceType", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getDeviceType() {
/* 117 */     return this.deviceType;
/*     */   }
/*     */   
/*     */   public void setDeviceType(String deviceType) {
/* 121 */     this.deviceType = deviceType;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "telecontrolID", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getTelecontrolID() {
/* 126 */     return this.telecontrolID;
/*     */   }
/*     */   
/*     */   public void setTelecontrolID(int telecontrolID) {
/* 130 */     this.telecontrolID = telecontrolID;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "supportBeep", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public boolean isSupportBeep() {
/* 135 */     return this.supportBeep;
/*     */   }
/*     */   
/*     */   public void setSupportBeep(boolean supportBeep) {
/* 139 */     this.supportBeep = supportBeep;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "localZoneNum", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getLocalZoneNum() {
/* 144 */     return this.localZoneNum;
/*     */   }
/*     */   
/*     */   public void setLocalZoneNum(int localZoneNum) {
/* 148 */     this.localZoneNum = localZoneNum;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "alarmOutNum", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getAlarmOutNum() {
/* 153 */     return this.alarmOutNum;
/*     */   }
/*     */   
/*     */   public void setAlarmOutNum(int alarmOutNum) {
/* 157 */     this.alarmOutNum = alarmOutNum;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "electroLockNum", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getElectroLockNum() {
/* 162 */     return this.electroLockNum;
/*     */   }
/*     */   
/*     */   public void setElectroLockNum(int electroLockNum) {
/* 166 */     this.electroLockNum = electroLockNum;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "RS485Num", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getRS485Num() {
/* 171 */     return this.RS485Num;
/*     */   }
/*     */   
/*     */   public void setRS485Num(int RS485Num) {
/* 175 */     this.RS485Num = RS485Num;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "manufacturer", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public String getManufacturer() {
/* 180 */     return this.manufacturer;
/*     */   }
/*     */   
/*     */   public void setManufacturer(String manufacturer) {
/* 184 */     this.manufacturer = manufacturer;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "OEMCode", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getOEMCode() {
/* 189 */     return this.OEMCode;
/*     */   }
/*     */   
/*     */   public void setOEMCode(int OEMCode) {
/* 193 */     this.OEMCode = OEMCode;
/*     */   }
/*     */   
/*     */   @XmlElement(name = "marketType", namespace = "http://www.isapi.org/ver20/XMLSchema")
/*     */   public int getMarketType() {
/* 198 */     return this.marketType;
/*     */   }
/*     */   
/*     */   public void setMarketType(int marketType) {
/* 202 */     this.marketType = marketType;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 207 */     return "DeviceInfo [deviceName=" + this.deviceName + ", deviceID=" + this.deviceID + ", model=" + this.model + ", serialNumber=" + this.serialNumber + ", macAddress=" + this.macAddress + ", firmwareVersion=" + this.firmwareVersion + ", firmwareReleasedDate=" + 
/* 208 */       this.firmwareReleasedDate + ", encoderVersion=" + this.encoderVersion + ", encoderReleasedDate=" + this.encoderReleasedDate + ", deviceType=" + this.deviceType + ", telecontrolID=" + this.telecontrolID + ", supportBeep=" + this.supportBeep + ", localZoneNum=" + 
/* 209 */       this.localZoneNum + ", alarmOutNum=" + this.alarmOutNum + ", electroLockNum=" + this.electroLockNum + ", RS485Num=" + this.RS485Num + ", manufacturer=" + this.manufacturer + ", OEMCode=" + this.OEMCode + ", marketType=" + this.marketType + "]";
/*     */   }
/*     */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\DeviceInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */