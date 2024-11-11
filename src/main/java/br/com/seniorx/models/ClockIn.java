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
 
 public class ClockIn {
   @SerializedName("deviceId")
   private Long deviceId;
   @SerializedName("date")
   private OffsetDateTime date;
   @SerializedName("timezoneOffset")
   private Integer timezoneOffset;
   @SerializedName("status")
   private StatusEnum status;
   @SerializedName("nsr")
   private Long nsr;
   @SerializedName("pis")
   private Long pis;
   @SerializedName("cpf")
   private Long cpf;
   
   public ClockIn() { this.deviceId = null;
 
     
     this.date = null;
 
     
     this.timezoneOffset = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
 
     
     this.nsr = null;
 
     
     this.pis = null;
 
     
     this.cpf = null; }
 
   
   public ClockIn deviceId(Long deviceId) { this.deviceId = deviceId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getDeviceId() {
     return this.deviceId;
   }
   @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum {
     ONLINE("ONLINE"), OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum; for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) { StatusEnum statusEnum = arrayOfStatusEnum[b]; if (String.valueOf(statusEnum.value).equals(text)) return statusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<StatusEnum> {
       public void write(JsonWriter jsonWriter, ClockIn.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ClockIn.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ClockIn.StatusEnum.fromValue(String.valueOf(value)); } } } public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }
 
   
   public ClockIn date(OffsetDateTime date) {
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
   
   public ClockIn timezoneOffset(Integer timezoneOffset) {
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
   
   public ClockIn status(StatusEnum status) {
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
   
   public ClockIn nsr(Long nsr) {
     this.nsr = nsr;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Número sequencial de registro")
   public Long getNsr() {
     return this.nsr;
   }
   
   public void setNsr(Long nsr) {
     this.nsr = nsr;
   }
   
   public ClockIn pis(Long pis) {
     this.pis = pis;
     return this;
   }
 
 
 
 
   
   @Schema(description = "PIS da pessoa")
   public Long getPis() {
     return this.pis;
   }
   
   public void setPis(Long pis) {
     this.pis = pis;
   }
   
   public ClockIn cpf(Long cpf) {
     this.cpf = cpf;
     return this;
   }
 
 
 
 
   
   @Schema(description = "CPF da pessoa")
   public Long getCpf() {
     return this.cpf;
   }
   
   public void setCpf(Long cpf) {
     this.cpf = cpf;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ClockIn clockIn = (ClockIn)o;
     return (Objects.equals(this.deviceId, clockIn.deviceId) && 
       Objects.equals(this.date, clockIn.date) && 
       Objects.equals(this.timezoneOffset, clockIn.timezoneOffset) && 
       Objects.equals(this.status, clockIn.status) && 
       Objects.equals(this.nsr, clockIn.nsr) && 
       Objects.equals(this.pis, clockIn.pis) && 
       Objects.equals(this.cpf, clockIn.cpf));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.nsr, this.pis, this.cpf });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ClockIn {\n");
     
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
     sb.append("    nsr: ").append(toIndentedString(this.nsr)).append("\n");
     sb.append("    pis: ").append(toIndentedString(this.pis)).append("\n");
     sb.append("    cpf: ").append(toIndentedString(this.cpf)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ClockIn.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */