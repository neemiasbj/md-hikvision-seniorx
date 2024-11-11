/*     */ package br.com.seniorx.models;
/*     */ import java.io.IOException;
/*     */ import java.time.OffsetDateTime;
/*     */ import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
/*     */ import com.google.gson.annotations.SerializedName;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonWriter;

/*     */ import io.swagger.v3.oas.annotations.media.Schema;
/*     */ public class Alarm { @SerializedName("deviceId") private Long deviceId; @SerializedName("date") private OffsetDateTime date; @SerializedName("timezoneOffset") private Integer timezoneOffset; @SerializedName("status") private StatusEnum status; @SerializedName("inputState") private InputStateEnum inputState; @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum { ONLINE("ONLINE"), OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum;
/*     */       for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) {
/*     */         StatusEnum statusEnum = arrayOfStatusEnum[b];
/*     */         if (String.valueOf(statusEnum.value).equals(text))
/*     */           return statusEnum; 
/*     */         b++;
/*     */       } 
/*     */       return null; } public static class Adapter extends TypeAdapter<StatusEnum> { public void write(JsonWriter jsonWriter, Alarm.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Alarm.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
/*  17 */         return Alarm.StatusEnum.fromValue(String.valueOf(value)); } } } public Alarm() { this.deviceId = null;
/*     */ 
/*     */     
/*  20 */     this.date = null;
/*     */ 
/*     */     
/*  23 */     this.timezoneOffset = null;
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
/*  73 */     this.status = null;
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
/* 123 */     this.inputState = null; }
/*     */   
/*     */   public Alarm deviceId(Long deviceId) {
/* 126 */     this.deviceId = deviceId;
/* 127 */     return this; } @JsonAdapter(InputStateEnum.Adapter.class) public enum InputStateEnum {
/*     */     INACTIVE("INACTIVE"), ACTIVE("ACTIVE"); private String value; InputStateEnum(String value) { this.value = value; }
/*     */     public String getValue() { return this.value; }
/*     */     public String toString() { return String.valueOf(this.value); }
/*     */     public static InputStateEnum fromValue(String text) { byte b; int i; InputStateEnum[] arrayOfInputStateEnum; for (i = (arrayOfInputStateEnum = values()).length, b = 0; b < i; ) { InputStateEnum inputStateEnum = arrayOfInputStateEnum[b]; if (String.valueOf(inputStateEnum.value).equals(text))
/*     */           return inputStateEnum;  b++; }
/*     */        return null; }
/*     */     public static class Adapter extends TypeAdapter<InputStateEnum> {
/*     */       public void write(JsonWriter jsonWriter, Alarm.InputStateEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
/*     */       public Alarm.InputStateEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Alarm.InputStateEnum.fromValue(String.valueOf(value)); } } }
/* 137 */   @Schema(description = "Identificador do dispositivo") public Long getDeviceId() { return this.deviceId; }
/*     */ 
/*     */   
/*     */   public void setDeviceId(Long deviceId) {
/* 141 */     this.deviceId = deviceId;
/*     */   }
/*     */   
/*     */   public Alarm date(OffsetDateTime date) {
/* 145 */     this.date = date;
/* 146 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Data da notificação em UTC")
/*     */   public OffsetDateTime getDate() {
/* 156 */     return this.date;
/*     */   }
/*     */   
/*     */   public void setDate(OffsetDateTime date) {
/* 160 */     this.date = date;
/*     */   }
/*     */   
/*     */   public Alarm timezoneOffset(Integer timezoneOffset) {
/* 164 */     this.timezoneOffset = timezoneOffset;
/* 165 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Offset em minutos")
/*     */   public Integer getTimezoneOffset() {
/* 175 */     return this.timezoneOffset;
/*     */   }
/*     */   
/*     */   public void setTimezoneOffset(Integer timezoneOffset) {
/* 179 */     this.timezoneOffset = timezoneOffset;
/*     */   }
/*     */   
/*     */   public Alarm status(StatusEnum status) {
/* 183 */     this.status = status;
/* 184 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public StatusEnum getStatus() {
/* 194 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(StatusEnum status) {
/* 198 */     this.status = status;
/*     */   }
/*     */   
/*     */   public Alarm inputState(InputStateEnum inputState) {
/* 202 */     this.inputState = inputState;
/* 203 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public InputStateEnum getInputState() {
/* 213 */     return this.inputState;
/*     */   }
/*     */   
/*     */   public void setInputState(InputStateEnum inputState) {
/* 217 */     this.inputState = inputState;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 222 */     if (this == o) {
/* 223 */       return true;
/*     */     }
/* 225 */     if (o == null || getClass() != o.getClass()) {
/* 226 */       return false;
/*     */     }
/* 228 */     Alarm alarm = (Alarm)o;
/* 229 */     return (Objects.equals(this.deviceId, alarm.deviceId) && Objects.equals(this.date, alarm.date) && 
/* 230 */       Objects.equals(this.timezoneOffset, alarm.timezoneOffset) && 
/* 231 */       Objects.equals(this.status, alarm.status) && Objects.equals(this.inputState, alarm.inputState));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 236 */     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.inputState });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 241 */     StringBuilder sb = new StringBuilder();
/* 242 */     sb.append("class Alarm {\n");
/*     */     
/* 244 */     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
/* 245 */     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
/* 246 */     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
/* 247 */     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
/* 248 */     sb.append("    inputState: ").append(toIndentedString(this.inputState)).append("\n");
/* 249 */     sb.append("}");
/* 250 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 258 */     if (o == null) {
/* 259 */       return "null";
/*     */     }
/* 261 */     return o.toString().replace("\n", "\n    ");
/*     */   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\Alarm.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */