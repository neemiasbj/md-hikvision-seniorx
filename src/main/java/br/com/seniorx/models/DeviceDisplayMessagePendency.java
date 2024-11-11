 package br.com.seniorx.models;
import java.io.IOException;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 
 import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class DeviceDisplayMessagePendency {
   @SerializedName("pendencyId")
   private Long pendencyId;
   @SerializedName("managerDeviceId")
   private Long managerDeviceId;
   @SerializedName("message")
   private String message;
   @SerializedName("duration")
   private Long duration;
   @SerializedName("mode")
   private ModeEnum mode;
   
   public DeviceDisplayMessagePendency() { this.pendencyId = null;
 
     
     this.managerDeviceId = null;
 
     
     this.message = null;
 
     
     this.duration = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.mode = null; }
 
   
   public DeviceDisplayMessagePendency pendencyId(Long pendencyId) { this.pendencyId = pendencyId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador da pendência")
   public Long getPendencyId() {
     return this.pendencyId;
   }
   @JsonAdapter(ModeEnum.Adapter.class) public enum ModeEnum {
     ENQUEUE("ENQUEUE"), OVERRIDE("OVERRIDE"); private String value; ModeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ModeEnum fromValue(String text) { byte b; int i; ModeEnum[] arrayOfModeEnum; for (i = (arrayOfModeEnum = values()).length, b = 0; b < i; ) { ModeEnum modeEnum = arrayOfModeEnum[b]; if (String.valueOf(modeEnum.value).equals(text)) return modeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<ModeEnum> {
       public void write(JsonWriter jsonWriter, DeviceDisplayMessagePendency.ModeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public DeviceDisplayMessagePendency.ModeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return DeviceDisplayMessagePendency.ModeEnum.fromValue(String.valueOf(value)); } } } public void setPendencyId(Long pendencyId) { this.pendencyId = pendencyId; }
 
   
   public DeviceDisplayMessagePendency managerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo gerenciador")
   public Long getManagerDeviceId() {
     return this.managerDeviceId;
   }
   
   public void setManagerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
   }
   
   public DeviceDisplayMessagePendency message(String message) {
     this.message = message;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Mensagem")
   public String getMessage() {
     return this.message;
   }
   
   public void setMessage(String message) {
     this.message = message;
   }
   
   public DeviceDisplayMessagePendency duration(Long duration) {
     this.duration = duration;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Duração do tempo de exibição da mensagem (precisão de milissegundos)")
   public Long getDuration() {
     return this.duration;
   }
   
   public void setDuration(Long duration) {
     this.duration = duration;
   }
   
   public DeviceDisplayMessagePendency mode(ModeEnum mode) {
     this.mode = mode;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public ModeEnum getMode() {
     return this.mode;
   }
   
   public void setMode(ModeEnum mode) {
     this.mode = mode;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DeviceDisplayMessagePendency deviceDisplayMessagePendency = (DeviceDisplayMessagePendency)o;
     return (Objects.equals(this.pendencyId, deviceDisplayMessagePendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, deviceDisplayMessagePendency.managerDeviceId) && 
       Objects.equals(this.message, deviceDisplayMessagePendency.message) && 
       Objects.equals(this.duration, deviceDisplayMessagePendency.duration) && 
       Objects.equals(this.mode, deviceDisplayMessagePendency.mode));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.message, this.duration, this.mode });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DeviceDisplayMessagePendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    message: ").append(toIndentedString(this.message)).append("\n");
     sb.append("    duration: ").append(toIndentedString(this.duration)).append("\n");
     sb.append("    mode: ").append(toIndentedString(this.mode)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DeviceDisplayMessagePendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */