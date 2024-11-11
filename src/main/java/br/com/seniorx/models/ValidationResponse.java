 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class ValidationResponse
 {
   @SerializedName("accessType")
   private AccessTypeEnum accessType;
   @SerializedName("verifyBiometry")
   private Boolean verifyBiometry;
   @SerializedName("currentOwnerLocation")
   private Long currentOwnerLocation;
   @SerializedName("personCheckLevel")
   private Boolean personCheckLevel;
   @SerializedName("credentialType")
   private CredentialTypeEnum credentialType;
   
   @JsonAdapter(AccessTypeEnum.Adapter.class)
   public enum AccessTypeEnum
   {
     VALID("ACCESS_VALID"),
     DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),
     DENIED_SITUATION("ACCESS_DENIED_SITUATION"),
     DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),
     DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"),
     DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),
     DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"),
     DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),
     DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"),
     VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),
     DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"),
     DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),
     DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),
     DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"),
     DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),
     DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),
     DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),
     DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"),
     COERCION("ACCESS_COERCION"),
     DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"),
     DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),
     DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"),
     DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),
     DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"),
     DESISTENCE("ACCESS_DESISTENCE"),
     VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"),
     VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"),
     VALID_FRAUD("ACCESS_VALID_FRAUD"),
     VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"),
     DENIED("ACCESS_DENIED"),
     DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"),
     DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"),
     DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"),
     DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"),
     DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"),
     DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"),
     DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"),
     DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"),
     DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"),
     DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"),
     DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"),
     DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE");
     private String value;
     
     AccessTypeEnum(String value) {
       this.value = value;
     }
     
     public String getValue() {
       return this.value;
     }
     
     public String toString() {
       return String.valueOf(this.value);
     }
     
     public static AccessTypeEnum fromValue(String text) {
       byte b;
       int i;
       AccessTypeEnum[] arrayOfAccessTypeEnum;
       for (i = (arrayOfAccessTypeEnum = values()).length, b = 0; b < i; ) {
         AccessTypeEnum accessTypeEnum = arrayOfAccessTypeEnum[b];
         if (String.valueOf(accessTypeEnum.value).equals(text))
           return accessTypeEnum; 
         b++;
       } 
       return null;
     }
     
     public static class Adapter
       extends TypeAdapter<AccessTypeEnum>
     {
       public void write(JsonWriter jsonWriter, ValidationResponse.AccessTypeEnum enumeration) throws IOException {
         jsonWriter.value(enumeration.getValue());
       }
       
       public ValidationResponse.AccessTypeEnum read(JsonReader jsonReader) throws IOException {
         String value = jsonReader.nextString();
         return ValidationResponse.AccessTypeEnum.fromValue(String.valueOf(value));
       }
     }
   }
   
   public ValidationResponse() {
     this.accessType = null;
 
     
     this.verifyBiometry = Boolean.valueOf(false);
 
     
     this.currentOwnerLocation = null;
 
     
     this.personCheckLevel = Boolean.valueOf(false);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.credentialType = null;
   }
   public ValidationResponse accessType(AccessTypeEnum accessType) {
     this.accessType = accessType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public AccessTypeEnum getAccessType() {
     return this.accessType;
   }
   @JsonAdapter(CredentialTypeEnum.Adapter.class) public enum CredentialTypeEnum {
     HOLDER("HOLDER"), PROVISORY("PROVISORY"); private String value; CredentialTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CredentialTypeEnum fromValue(String text) { byte b; int i; CredentialTypeEnum[] arrayOfCredentialTypeEnum; for (i = (arrayOfCredentialTypeEnum = values()).length, b = 0; b < i; ) { CredentialTypeEnum credentialTypeEnum = arrayOfCredentialTypeEnum[b]; if (String.valueOf(credentialTypeEnum.value).equals(text)) return credentialTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<CredentialTypeEnum> {
       public void write(JsonWriter jsonWriter, ValidationResponse.CredentialTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ValidationResponse.CredentialTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ValidationResponse.CredentialTypeEnum.fromValue(String.valueOf(value)); } } } public void setAccessType(AccessTypeEnum accessType) { this.accessType = accessType; }
 
   
   public ValidationResponse verifyBiometry(Boolean verifyBiometry) {
     this.verifyBiometry = verifyBiometry;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa se verifica biometria")
   public Boolean isVerifyBiometry() {
     return this.verifyBiometry;
   }
   
   public void setVerifyBiometry(Boolean verifyBiometry) {
     this.verifyBiometry = verifyBiometry;
   }
   
   public ValidationResponse currentOwnerLocation(Long currentOwnerLocation) {
     this.currentOwnerLocation = currentOwnerLocation;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da localização atual da pessoa")
   public Long getCurrentOwnerLocation() {
     return this.currentOwnerLocation;
   }
   
   public void setCurrentOwnerLocation(Long currentOwnerLocation) {
     this.currentOwnerLocation = currentOwnerLocation;
   }
   
   public ValidationResponse personCheckLevel(Boolean personCheckLevel) {
     this.personCheckLevel = personCheckLevel;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa se a pessoa controla nível")
   public Boolean isPersonCheckLevel() {
     return this.personCheckLevel;
   }
   
   public void setPersonCheckLevel(Boolean personCheckLevel) {
     this.personCheckLevel = personCheckLevel;
   }
   
   public ValidationResponse credentialType(CredentialTypeEnum credentialType) {
     this.credentialType = credentialType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tipo da credencial (titular ou provisória)")
   public CredentialTypeEnum getCredentialType() {
     return this.credentialType;
   }
   
   public void setCredentialType(CredentialTypeEnum credentialType) {
     this.credentialType = credentialType;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ValidationResponse validationResponse = (ValidationResponse)o;
     return (Objects.equals(this.accessType, validationResponse.accessType) && 
       Objects.equals(this.verifyBiometry, validationResponse.verifyBiometry) && 
       Objects.equals(this.currentOwnerLocation, validationResponse.currentOwnerLocation) && 
       Objects.equals(this.personCheckLevel, validationResponse.personCheckLevel) && 
       Objects.equals(this.credentialType, validationResponse.credentialType));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.accessType, this.verifyBiometry, this.currentOwnerLocation, this.personCheckLevel, this.credentialType });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ValidationResponse {\n");
     
     sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
     sb.append("    verifyBiometry: ").append(toIndentedString(this.verifyBiometry)).append("\n");
     sb.append("    currentOwnerLocation: ").append(toIndentedString(this.currentOwnerLocation)).append("\n");
     sb.append("    personCheckLevel: ").append(toIndentedString(this.personCheckLevel)).append("\n");
     sb.append("    credentialType: ").append(toIndentedString(this.credentialType)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ValidationResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */