 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class InputStatusField
 {
   @SerializedName("inputDeviceId")
   private Long inputDeviceId;
   @SerializedName("status")
   private StatusEnum status;
   
   public InputStatusField() {
     this.inputDeviceId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
   }
   
   public InputStatusField inputDeviceId(Long inputDeviceId) { this.inputDeviceId = inputDeviceId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getInputDeviceId() {
     return this.inputDeviceId;
   }
   @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum {
     DEACTIVATE("DEACTIVATE"), ACTIVATE("ACTIVATE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum; for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) { StatusEnum statusEnum = arrayOfStatusEnum[b]; if (String.valueOf(statusEnum.value).equals(text)) return statusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<StatusEnum> {
       public void write(JsonWriter jsonWriter, InputStatusField.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public InputStatusField.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return InputStatusField.StatusEnum.fromValue(String.valueOf(value)); } } } public void setInputDeviceId(Long inputDeviceId) { this.inputDeviceId = inputDeviceId; }
 
   
   public InputStatusField status(StatusEnum status) {
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
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     InputStatusField inputStatusField = (InputStatusField)o;
     return (Objects.equals(this.inputDeviceId, inputStatusField.inputDeviceId) && 
       Objects.equals(this.status, inputStatusField.status));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.inputDeviceId, this.status });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class InputStatusField {\n");
     
     sb.append("    inputDeviceId: ").append(toIndentedString(this.inputDeviceId)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
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


