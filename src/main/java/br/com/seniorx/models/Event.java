 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
 
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
 
 public class Event {
   @SerializedName("deviceId")
   private Long deviceId;
   @SerializedName("date")
   private String date;
   @SerializedName("timezoneOffset")
   private Integer timezoneOffset;
   @SerializedName("status")
   private StatusEnum status;
   @SerializedName("eventType")
   private EventTypeEnum eventType;
   
   public Event() { this.deviceId = null;
 
     
     this.date = null;
 
     
     this.timezoneOffset = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
 this.eventType = null;
}

@JsonAdapter(StatusEnum.Adapter.class)
public enum StatusEnum {
     ONLINE("ONLINE"), OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum; for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) { StatusEnum statusEnum = arrayOfStatusEnum[b]; if (String.valueOf(statusEnum.value).equals(text)) return statusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<StatusEnum> {
       public void write(JsonWriter jsonWriter, Event.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Event.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Event.StatusEnum.fromValue(String.valueOf(value)); } } }
   public Event deviceId(Long deviceId) { this.deviceId = deviceId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getDeviceId() {
     return this.deviceId;
   }
   @JsonAdapter(EventTypeEnum.Adapter.class) public enum EventTypeEnum {
     DEVICE_STARTED("DEVICE_STARTED"), DEVICE_ONLINE("DEVICE_ONLINE"), DEVICE_OFFLINE("DEVICE_OFFLINE"), ISSUANCE_OF_TIME_AND_ATTENDANCE_REPORT("ISSUANCE_OF_TIME_AND_ATTENDANCE_REPORT"), STARTED_USING_USB_FISCAL_PORT("STARTED_USING_USB_FISCAL_PORT"), PAPER_REEL_REPLACED("PAPER_REEL_REPLACED"), LACK_OF_PAPER("LACK_OF_PAPER"), LOW_MEMORY("LOW_MEMORY"), NO_MEMORY("NO_MEMORY"), BATTERY_REPLACED("BATTERY_REPLACED"), STARTED_USING_BATTERY("STARTED_USING_BATTERY"), STARTED_USING_ENERGY("STARTED_USING_ENERGY"), DEVICE_LOCKED("DEVICE_LOCKED"), DEVICE_UNLOCKED("DEVICE_UNLOCKED"), TAMPER("TAMPER"), DOOR_HELD_OPEN("DOOR_HELD_OPEN"), DOOR_FORCED_OPEN("DOOR_FORCED_OPEN"); private String value; EventTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static EventTypeEnum fromValue(String text) { byte b; int i; EventTypeEnum[] arrayOfEventTypeEnum; for (i = (arrayOfEventTypeEnum = values()).length, b = 0; b < i; ) { EventTypeEnum eventTypeEnum = arrayOfEventTypeEnum[b]; if (String.valueOf(eventTypeEnum.value).equals(text)) return eventTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<EventTypeEnum> {
       public void write(JsonWriter jsonWriter, Event.EventTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Event.EventTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Event.EventTypeEnum.fromValue(String.valueOf(value)); } } } public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }
 
   
   public Event date(String date) {
     this.date = date;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Data da notificação em UTC")
   public String getDate() {
     return this.date;
   }
   
   public void setDate(String date) {
     this.date = date;
   }
   
   public Event timezoneOffset(Integer timezoneOffset) {
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
   
   public Event status(StatusEnum status) {
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
   
   public Event eventType(EventTypeEnum eventType) {
     this.eventType = eventType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public EventTypeEnum getEventType() {
     return this.eventType;
   }
   
   public void setEventType(EventTypeEnum eventType) {
     this.eventType = eventType;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Event event = (Event)o;
     return (Objects.equals(this.deviceId, event.deviceId) && 
       Objects.equals(this.date, event.date) && 
       Objects.equals(this.timezoneOffset, event.timezoneOffset) && 
       Objects.equals(this.status, event.status) && 
       Objects.equals(this.eventType, event.eventType));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.eventType });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Event {\n");
     
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
     sb.append("    eventType: ").append(toIndentedString(this.eventType)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\Event.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */