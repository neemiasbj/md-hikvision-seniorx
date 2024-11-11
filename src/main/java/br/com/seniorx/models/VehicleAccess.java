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
 @Schema(description = "Veículo de Acesso") public class VehicleAccess { @SerializedName("deviceId") private Long deviceId; @SerializedName("date") private OffsetDateTime date; @SerializedName("timezoneOffset") private Integer timezoneOffset; @SerializedName("status") private StatusEnum status; @SerializedName("accessType") private AccessTypeEnum accessType; @SerializedName("accessDirection") private AccessDirectionEnum accessDirection; @SerializedName("vehicleCredentialFormat") private VehicleCredentialFormatEnum vehicleCredentialFormat; @SerializedName("licensePlate") private String licensePlate; @SerializedName("vehicleCardId") private Long vehicleCardId; @SerializedName("PersonCredentialFormat") private PersonCredentialFormatEnum personCredentialFormat; @SerializedName("personCardId") private Long personCardId; @SerializedName("personId")
   private Long personId; @JsonAdapter(StatusEnum.Adapter.class)
   public enum StatusEnum { ONLINE("ONLINE"),
     OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b;
       int i;
       StatusEnum[] arrayOfStatusEnum;
       for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) {
         StatusEnum statusEnum = arrayOfStatusEnum[b];
         if (String.valueOf(statusEnum.value).equals(text))
           return statusEnum; 
         b++;
       } 
       return null; } public static class Adapter extends TypeAdapter<StatusEnum> { public void write(JsonWriter jsonWriter, VehicleAccess.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public VehicleAccess.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
         return VehicleAccess.StatusEnum.fromValue(String.valueOf(value)); } } } public VehicleAccess() { this.deviceId = null;
 
     
     this.date = null;
 
     
     this.timezoneOffset = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.accessType = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.accessDirection = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.vehicleCredentialFormat = null;
 
     
     this.licensePlate = null;
 
     
     this.vehicleCardId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.personCredentialFormat = null;
 
     
     this.personCardId = null;
 
     
     this.personId = null; }
   @JsonAdapter(AccessTypeEnum.Adapter.class) public enum AccessTypeEnum {
     VALID("ACCESS_VALID"), DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"), DENIED_SITUATION("ACCESS_DENIED_SITUATION"), DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"), DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"), DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"), DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"), DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"), DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"), VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"), DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"), DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"), DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"), DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"), DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"), DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"), DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"), DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"), COERCION("ACCESS_COERCION"), DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"), DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"), DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"), DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"), DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"), DESISTENCE("ACCESS_DESISTENCE"), VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"), VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"), VALID_FRAUD("ACCESS_VALID_FRAUD"), VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"), DENIED("ACCESS_DENIED"), DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"), DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"), DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"), DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"), DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"), DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"), DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"), DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"), DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"), DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"), DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"), DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE"); private String value; AccessTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static AccessTypeEnum fromValue(String text) { byte b; int i; AccessTypeEnum[] arrayOfAccessTypeEnum; for (i = (arrayOfAccessTypeEnum = values()).length, b = 0; b < i; ) { AccessTypeEnum accessTypeEnum = arrayOfAccessTypeEnum[b]; if (String.valueOf(accessTypeEnum.value).equals(text)) return accessTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<AccessTypeEnum> {
       public void write(JsonWriter jsonWriter, VehicleAccess.AccessTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public VehicleAccess.AccessTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return VehicleAccess.AccessTypeEnum.fromValue(String.valueOf(value)); } } } public VehicleAccess deviceId(Long deviceId) { this.deviceId = deviceId;
     return this; } @JsonAdapter(AccessDirectionEnum.Adapter.class) public enum AccessDirectionEnum {
     UNKNOWN("UNKNOWN"), ENTRANCE("ENTRANCE"), EXIT("EXIT"); private String value; AccessDirectionEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static AccessDirectionEnum fromValue(String text) { byte b; int i; AccessDirectionEnum[] arrayOfAccessDirectionEnum; for (i = (arrayOfAccessDirectionEnum = values()).length, b = 0; b < i; ) { AccessDirectionEnum accessDirectionEnum = arrayOfAccessDirectionEnum[b]; if (String.valueOf(accessDirectionEnum.value).equals(text)) return accessDirectionEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<AccessDirectionEnum> {
       public void write(JsonWriter jsonWriter, VehicleAccess.AccessDirectionEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public VehicleAccess.AccessDirectionEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return VehicleAccess.AccessDirectionEnum.fromValue(String.valueOf(value)); } } } @JsonAdapter(VehicleCredentialFormatEnum.Adapter.class) public enum VehicleCredentialFormatEnum {
     CARD("CARD"), LICENSE_PLATE("LICENSE_PLATE"); private String value; VehicleCredentialFormatEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static VehicleCredentialFormatEnum fromValue(String text) { byte b; int i; VehicleCredentialFormatEnum[] arrayOfVehicleCredentialFormatEnum; for (i = (arrayOfVehicleCredentialFormatEnum = values()).length, b = 0; b < i; ) { VehicleCredentialFormatEnum vehicleCredentialFormatEnum = arrayOfVehicleCredentialFormatEnum[b]; if (String.valueOf(vehicleCredentialFormatEnum.value).equals(text)) return vehicleCredentialFormatEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<VehicleCredentialFormatEnum> {
       public void write(JsonWriter jsonWriter, VehicleAccess.VehicleCredentialFormatEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public VehicleAccess.VehicleCredentialFormatEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return VehicleAccess.VehicleCredentialFormatEnum.fromValue(String.valueOf(value)); } } } @JsonAdapter(PersonCredentialFormatEnum.Adapter.class) public enum PersonCredentialFormatEnum {
     CARD("CARD"), PERSON_ID("PERSON_ID"); private String value; PersonCredentialFormatEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); }
     public static PersonCredentialFormatEnum fromValue(String text) { byte b; int i; PersonCredentialFormatEnum[] arrayOfPersonCredentialFormatEnum; for (i = (arrayOfPersonCredentialFormatEnum = values()).length, b = 0; b < i; ) { PersonCredentialFormatEnum personCredentialFormatEnum = arrayOfPersonCredentialFormatEnum[b]; if (String.valueOf(personCredentialFormatEnum.value).equals(text)) return personCredentialFormatEnum;  b++; }  return null; }
     public static class Adapter extends TypeAdapter<PersonCredentialFormatEnum> {
       public void write(JsonWriter jsonWriter, VehicleAccess.PersonCredentialFormatEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public VehicleAccess.PersonCredentialFormatEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return VehicleAccess.PersonCredentialFormatEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Identificador do dispositivo") public Long getDeviceId() { return this.deviceId; }
 
   
   public void setDeviceId(Long deviceId) {
     this.deviceId = deviceId;
   }
   
   public VehicleAccess date(OffsetDateTime date) {
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
   
   public VehicleAccess timezoneOffset(Integer timezoneOffset) {
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
   
   public VehicleAccess status(StatusEnum status) {
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
   
   public VehicleAccess accessType(AccessTypeEnum accessType) {
     this.accessType = accessType;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public AccessTypeEnum getAccessType() {
     return this.accessType;
   }
   
   public void setAccessType(AccessTypeEnum accessType) {
     this.accessType = accessType;
   }
   
   public VehicleAccess accessDirection(AccessDirectionEnum accessDirection) {
     this.accessDirection = accessDirection;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public AccessDirectionEnum getAccessDirection() {
     return this.accessDirection;
   }
   
   public void setAccessDirection(AccessDirectionEnum accessDirection) {
     this.accessDirection = accessDirection;
   }
   
   public VehicleAccess vehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
     this.vehicleCredentialFormat = vehicleCredentialFormat;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public VehicleCredentialFormatEnum getVehicleCredentialFormat() {
     return this.vehicleCredentialFormat;
   }
   
   public void setVehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
     this.vehicleCredentialFormat = vehicleCredentialFormat;
   }
   
   public VehicleAccess licensePlate(String licensePlate) {
     this.licensePlate = licensePlate;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Placa do veículo")
   public String getLicensePlate() {
     return this.licensePlate;
   }
   
   public void setLicensePlate(String licensePlate) {
     this.licensePlate = licensePlate;
   }
   
   public VehicleAccess vehicleCardId(Long vehicleCardId) {
     this.vehicleCardId = vehicleCardId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador físico do crachá do veículo")
   public Long getVehicleCardId() {
     return this.vehicleCardId;
   }
   
   public void setVehicleCardId(Long vehicleCardId) {
     this.vehicleCardId = vehicleCardId;
   }
   
   public VehicleAccess personCredentialFormat(PersonCredentialFormatEnum personCredentialFormat) {
     this.personCredentialFormat = personCredentialFormat;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public PersonCredentialFormatEnum getPersonCredentialFormat() {
     return this.personCredentialFormat;
   }
   
   public void setPersonCredentialFormat(PersonCredentialFormatEnum personCredentialFormat) {
     this.personCredentialFormat = personCredentialFormat;
   }
   
   public VehicleAccess personCardId(Long personCardId) {
     this.personCardId = personCardId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador do crachá de pessoa")
   public Long getPersonCardId() {
     return this.personCardId;
   }
   
   public void setPersonCardId(Long personCardId) {
     this.personCardId = personCardId;
   }
   
   public VehicleAccess personId(Long personId) {
     this.personId = personId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador de pessoa")
   public Long getPersonId() {
     return this.personId;
   }
   
   public void setPersonId(Long personId) {
     this.personId = personId;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     VehicleAccess vehicleAccess = (VehicleAccess)o;
     return (Objects.equals(this.deviceId, vehicleAccess.deviceId) && Objects.equals(this.date, vehicleAccess.date) && 
       Objects.equals(this.timezoneOffset, vehicleAccess.timezoneOffset) && 
       Objects.equals(this.status, vehicleAccess.status) && 
       Objects.equals(this.accessType, vehicleAccess.accessType) && 
       Objects.equals(this.accessDirection, vehicleAccess.accessDirection) && 
       Objects.equals(this.vehicleCredentialFormat, vehicleAccess.vehicleCredentialFormat) && 
       Objects.equals(this.licensePlate, vehicleAccess.licensePlate) && 
       Objects.equals(this.vehicleCardId, vehicleAccess.vehicleCardId) && 
       Objects.equals(this.personCredentialFormat, vehicleAccess.personCredentialFormat) && 
       Objects.equals(this.personCardId, vehicleAccess.personCardId) && 
       Objects.equals(this.personId, vehicleAccess.personId));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.accessType, this.accessDirection, 
           this.vehicleCredentialFormat, this.licensePlate, this.vehicleCardId, this.personCredentialFormat, this.personCardId, this.personId });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class VehicleAccess {\n");
     
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
     sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
     sb.append("    accessDirection: ").append(toIndentedString(this.accessDirection)).append("\n");
     sb.append("    vehicleCredentialFormat: ").append(toIndentedString(this.vehicleCredentialFormat)).append("\n");
     sb.append("    licensePlate: ").append(toIndentedString(this.licensePlate)).append("\n");
     sb.append("    vehicleCardId: ").append(toIndentedString(this.vehicleCardId)).append("\n");
     sb.append("    personCredentialFormat: ").append(toIndentedString(this.personCredentialFormat)).append("\n");
     sb.append("    personCardId: ").append(toIndentedString(this.personCardId)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\VehicleAccess.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */