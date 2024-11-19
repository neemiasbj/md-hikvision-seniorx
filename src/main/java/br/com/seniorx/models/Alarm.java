 package br.com.seniorx.models;
 import java.io.IOException;
 import java.time.OffsetDateTime;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 public class Alarm { @SerializedName("deviceId") private Long deviceId; @SerializedName("date") private OffsetDateTime date; @SerializedName("timezoneOffset") private Integer timezoneOffset; @SerializedName("status") private StatusEnum status; @SerializedName("inputState") private InputStateEnum inputState; @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum { ONLINE("ONLINE"), OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum;
       for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) {
         StatusEnum statusEnum = arrayOfStatusEnum[b];
         if (String.valueOf(statusEnum.value).equals(text))
           return statusEnum; 
         b++;
       } 
       return null; } public static class Adapter extends TypeAdapter<StatusEnum> { public void write(JsonWriter jsonWriter, Alarm.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Alarm.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
         return Alarm.StatusEnum.fromValue(String.valueOf(value)); } } } public Alarm() { this.deviceId = null;
 
     
     this.date = null;
 
     
     this.timezoneOffset = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.inputState = null; }
   
   public Alarm deviceId(Long deviceId) {
     this.deviceId = deviceId;
     return this; } @JsonAdapter(InputStateEnum.Adapter.class) public enum InputStateEnum {
     INACTIVE("INACTIVE"), ACTIVE("ACTIVE"); private String value; InputStateEnum(String value) { this.value = value; }
     public String getValue() { return this.value; }
     public String toString() { return String.valueOf(this.value); }
     public static InputStateEnum fromValue(String text) { byte b; int i; InputStateEnum[] arrayOfInputStateEnum; for (i = (arrayOfInputStateEnum = values()).length, b = 0; b < i; ) { InputStateEnum inputStateEnum = arrayOfInputStateEnum[b]; if (String.valueOf(inputStateEnum.value).equals(text))
           return inputStateEnum;  b++; }
        return null; }
     public static class Adapter extends TypeAdapter<InputStateEnum> {
       public void write(JsonWriter jsonWriter, Alarm.InputStateEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public Alarm.InputStateEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Alarm.InputStateEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Identificador do dispositivo") public Long getDeviceId() { return this.deviceId; }
 
   
   public void setDeviceId(Long deviceId) {
     this.deviceId = deviceId;
   }
   
   public Alarm date(OffsetDateTime date) {
     this.date = date;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Data da notificação em UTC")
   public OffsetDateTime getDate() {
     return this.date;
   }
   
   public void setDate(OffsetDateTime date) {
     this.date = date;
   }
   
   public Alarm timezoneOffset(Integer timezoneOffset) {
     this.timezoneOffset = timezoneOffset;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Offset em minutos")
   public Integer getTimezoneOffset() {
     return this.timezoneOffset;
   }
   
   public void setTimezoneOffset(Integer timezoneOffset) {
     this.timezoneOffset = timezoneOffset;
   }
   
   public Alarm status(StatusEnum status) {
     this.status = status;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public StatusEnum getStatus() {
     return this.status;
   }
   
   public void setStatus(StatusEnum status) {
     this.status = status;
   }
   
   public Alarm inputState(InputStateEnum inputState) {
     this.inputState = inputState;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public InputStateEnum getInputState() {
     return this.inputState;
   }
   
   public void setInputState(InputStateEnum inputState) {
     this.inputState = inputState;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Alarm alarm = (Alarm)o;
     return (Objects.equals(this.deviceId, alarm.deviceId) && Objects.equals(this.date, alarm.date) && 
       Objects.equals(this.timezoneOffset, alarm.timezoneOffset) && 
       Objects.equals(this.status, alarm.status) && Objects.equals(this.inputState, alarm.inputState));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.inputState });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Alarm {\n");
     
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
     sb.append("    inputState: ").append(toIndentedString(this.inputState)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }


