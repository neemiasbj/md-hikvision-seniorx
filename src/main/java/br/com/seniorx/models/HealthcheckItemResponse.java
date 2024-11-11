 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class HealthcheckItemResponse
 {
   @SerializedName("name")
   private String name;
   @SerializedName("status")
   private StatusEnum status;
   
   public HealthcheckItemResponse() {
     this.name = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
   }
   
   public HealthcheckItemResponse name(String name) { this.name = name;
     return this; }
 
 
 
 
 
   
   @Schema(description = "")
   public String getName() {
     return this.name;
   }
   @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum {
     UP("UP"), DOWN("DOWN"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum; for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) { StatusEnum statusEnum = arrayOfStatusEnum[b]; if (String.valueOf(statusEnum.value).equals(text)) return statusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<StatusEnum> {
       public void write(JsonWriter jsonWriter, HealthcheckItemResponse.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public HealthcheckItemResponse.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return HealthcheckItemResponse.StatusEnum.fromValue(String.valueOf(value)); } } } public void setName(String name) { this.name = name; }
 
   
   public HealthcheckItemResponse status(StatusEnum status) {
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
     HealthcheckItemResponse healthcheckItemResponse = (HealthcheckItemResponse)o;
     return (Objects.equals(this.name, healthcheckItemResponse.name) && 
       Objects.equals(this.status, healthcheckItemResponse.status));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.name, this.status });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class HealthcheckItemResponse {\n");
     
     sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\HealthcheckItemResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */