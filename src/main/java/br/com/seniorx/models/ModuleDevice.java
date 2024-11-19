 package br.com.seniorx.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

 
 
 public class ModuleDevice {
   @SerializedName("id")
   private Long id;
   @SerializedName("areaId")
   private Long areaId;
   @SerializedName("deviceType")
   private DeviceTypeEnum deviceType;
   @SerializedName("address")
   private Integer address;
   @SerializedName("portNumber")
   private Integer portNumber;
   @SerializedName("reader")
   private List<ReaderDevice> reader;
   @SerializedName("output")
   private List<OutputDevice> output;
   @SerializedName("intput")
   private List<InputDevice> intput;
   
   public ModuleDevice() { this.id = null;
 
     
     this.areaId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.deviceType = null;
 
     
     this.address = null;
 
     
     this.portNumber = null;
 
     
     this.reader = null;
 
     
     this.output = null;
 
     
     this.intput = null; }
 
   
   public ModuleDevice id(Long id) { this.id = id;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getId() {
     return this.id;
   }
   @JsonAdapter(DeviceTypeEnum.Adapter.class) public enum DeviceTypeEnum {
     AAN_32("AAN_32"), AAN_100("AAN_100"), AIO_168("AIO_168"), AIM_2SL("AIM_2SL"), AIM_4SL("AIM_4SL"), AP_610("AP_610"), AP_620("AP_620"), AP_625("AP_625"), AP_500("AP_500"), AP_510("AP_510"), AP_520("AP_520"), AIM_1SL("AIM_1SL"), AIM_4("AIM_4"), AMS_130("AMS_130"), AMS_102("AMS_102"); private String value; DeviceTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static DeviceTypeEnum fromValue(String text) { byte b; int i; DeviceTypeEnum[] arrayOfDeviceTypeEnum; for (i = (arrayOfDeviceTypeEnum = values()).length, b = 0; b < i; ) { DeviceTypeEnum deviceTypeEnum = arrayOfDeviceTypeEnum[b]; if (String.valueOf(deviceTypeEnum.value).equals(text)) return deviceTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
       public void write(JsonWriter jsonWriter, ModuleDevice.DeviceTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ModuleDevice.DeviceTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ModuleDevice.DeviceTypeEnum.fromValue(String.valueOf(value)); } } } public void setId(Long id) { this.id = id; }
 
   
   public ModuleDevice areaId(Long areaId) {
     this.areaId = areaId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da área")
   public Long getAreaId() {
     return this.areaId;
   }
   
   public void setAreaId(Long areaId) {
     this.areaId = areaId;
   }
   
   public ModuleDevice deviceType(DeviceTypeEnum deviceType) {
     this.deviceType = deviceType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public DeviceTypeEnum getDeviceType() {
     return this.deviceType;
   }
   
   public void setDeviceType(DeviceTypeEnum deviceType) {
     this.deviceType = deviceType;
   }
   
   public ModuleDevice address(Integer address) {
     this.address = address;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Endereço")
   public Integer getAddress() {
     return this.address;
   }
   
   public void setAddress(Integer address) {
     this.address = address;
   }
   
   public ModuleDevice portNumber(Integer portNumber) {
     this.portNumber = portNumber;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Número da porta")
   public Integer getPortNumber() {
     return this.portNumber;
   }
   
   public void setPortNumber(Integer portNumber) {
     this.portNumber = portNumber;
   }
   
   public ModuleDevice reader(List<ReaderDevice> reader) {
     this.reader = reader;
     return this;
   }
   
   public ModuleDevice addReaderItem(ReaderDevice readerItem) {
     if (this.reader == null) {
       this.reader = new ArrayList<>();
     }
     this.reader.add(readerItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Leitora")
   public List<ReaderDevice> getReader() {
     return this.reader;
   }
   
   public void setReader(List<ReaderDevice> reader) {
     this.reader = reader;
   }
   
   public ModuleDevice output(List<OutputDevice> output) {
     this.output = output;
     return this;
   }
   
   public ModuleDevice addOutputItem(OutputDevice outputItem) {
     if (this.output == null) {
       this.output = new ArrayList<>();
     }
     this.output.add(outputItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Dispositivo de saída")
   public List<OutputDevice> getOutput() {
     return this.output;
   }
   
   public void setOutput(List<OutputDevice> output) {
     this.output = output;
   }
   
   public ModuleDevice intput(List<InputDevice> intput) {
     this.intput = intput;
     return this;
   }
   
   public ModuleDevice addIntputItem(InputDevice intputItem) {
     if (this.intput == null) {
       this.intput = new ArrayList<>();
     }
     this.intput.add(intputItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Dispositivo de entrada")
   public List<InputDevice> getIntput() {
     return this.intput;
   }
   
   public void setIntput(List<InputDevice> intput) {
     this.intput = intput;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ModuleDevice moduleDevice = (ModuleDevice)o;
     return (Objects.equals(this.id, moduleDevice.id) && 
       Objects.equals(this.areaId, moduleDevice.areaId) && 
       Objects.equals(this.deviceType, moduleDevice.deviceType) && 
       Objects.equals(this.address, moduleDevice.address) && 
       Objects.equals(this.portNumber, moduleDevice.portNumber) && 
       Objects.equals(this.reader, moduleDevice.reader) && 
       Objects.equals(this.output, moduleDevice.output) && 
       Objects.equals(this.intput, moduleDevice.intput));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.areaId, this.deviceType, this.address, this.portNumber, this.reader, this.output, this.intput });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ModuleDevice {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
     sb.append("    deviceType: ").append(toIndentedString(this.deviceType)).append("\n");
     sb.append("    address: ").append(toIndentedString(this.address)).append("\n");
     sb.append("    portNumber: ").append(toIndentedString(this.portNumber)).append("\n");
     sb.append("    reader: ").append(toIndentedString(this.reader)).append("\n");
     sb.append("    output: ").append(toIndentedString(this.output)).append("\n");
     sb.append("    intput: ").append(toIndentedString(this.intput)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 }


