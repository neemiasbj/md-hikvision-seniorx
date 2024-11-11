 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class PersonValidationResponse
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
   @SerializedName("personId")
   private Long personId;
   
   @JsonAdapter(AccessTypeEnum.Adapter.class)
   public enum AccessTypeEnum
   {
     ACCESS_VALID("ACCESS_VALID"),
     ACCESS_DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),
     ACCESS_DENIED_SITUATION("ACCESS_DENIED_SITUATION"),
     ACCESS_DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),
     ACCESS_DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"),
     ACCESS_DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),
     ACCESS_DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"),
     ACCESS_DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),
     ACCESS_DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"),
     ACCESS_VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),
     ACCESS_DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"),
     ACCESS_DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),
     ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),
     ACCESS_DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"),
     ACCESS_DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),
     ACCESS_DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),
     ACCESS_DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),
     ACCESS_DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"),
     ACCESS_COERCION("ACCESS_COERCION"),
     ACCESS_DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"),
     ACCESS_DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),
     ACCESS_DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"),
     ACCESS_DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),
     ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"),
     ACCESS_DESISTENCE("ACCESS_DESISTENCE"),
     ACCESS_VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"),
     ACCESS_VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"),
     ACCESS_VALID_FRAUD("ACCESS_VALID_FRAUD"),
     ACCESS_VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"),
     ACCESS_DENIED("ACCESS_DENIED"),
     ACCESS_DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"),
     ACCESS_DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"),
     ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"),
     ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"),
     ACCESS_DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"),
     ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"),
     ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"),
     ACCESS_DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"),
     ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"),
     ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"),
     ACCESS_DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"),
     ACCESS_DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE");
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
       public void write(JsonWriter jsonWriter, PersonValidationResponse.AccessTypeEnum enumeration) throws IOException {
         jsonWriter.value(enumeration.getValue());
       }
       
       public PersonValidationResponse.AccessTypeEnum read(JsonReader jsonReader) throws IOException {
         String value = jsonReader.nextString();
         return PersonValidationResponse.AccessTypeEnum.fromValue(String.valueOf(value));
       }
     }
   }
   
   public PersonValidationResponse() {
     this.accessType = null;
 
     
     this.verifyBiometry = Boolean.valueOf(false);
 
     
     this.currentOwnerLocation = null;
 
     
     this.personCheckLevel = Boolean.valueOf(false);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.credentialType = null;
 
     
     this.personId = null;
   }
   public PersonValidationResponse accessType(AccessTypeEnum accessType) {
     this.accessType = accessType;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public AccessTypeEnum getAccessType() {
     return this.accessType;
   }
   @JsonAdapter(CredentialTypeEnum.Adapter.class) public enum CredentialTypeEnum {
     HOLDER("HOLDER"), PROVISORY("PROVISORY"); private String value; CredentialTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CredentialTypeEnum fromValue(String text) { byte b; int i; CredentialTypeEnum[] arrayOfCredentialTypeEnum; for (i = (arrayOfCredentialTypeEnum = values()).length, b = 0; b < i; ) { CredentialTypeEnum credentialTypeEnum = arrayOfCredentialTypeEnum[b]; if (String.valueOf(credentialTypeEnum.value).equals(text)) return credentialTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<CredentialTypeEnum> {
       public void write(JsonWriter jsonWriter, PersonValidationResponse.CredentialTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public PersonValidationResponse.CredentialTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return PersonValidationResponse.CredentialTypeEnum.fromValue(String.valueOf(value)); } } } public void setAccessType(AccessTypeEnum accessType) { this.accessType = accessType; }
 
   
   public PersonValidationResponse verifyBiometry(Boolean verifyBiometry) {
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
   
   public PersonValidationResponse currentOwnerLocation(Long currentOwnerLocation) {
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
   
   public PersonValidationResponse personCheckLevel(Boolean personCheckLevel) {
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
   
   public PersonValidationResponse credentialType(CredentialTypeEnum credentialType) {
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
   
   public PersonValidationResponse personId(Long personId) {
     this.personId = personId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador da pessoa")
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
     PersonValidationResponse personValidationResponse = (PersonValidationResponse)o;
     return (Objects.equals(this.accessType, personValidationResponse.accessType) && 
       Objects.equals(this.verifyBiometry, personValidationResponse.verifyBiometry) && 
       Objects.equals(this.currentOwnerLocation, personValidationResponse.currentOwnerLocation) && 
       Objects.equals(this.personCheckLevel, personValidationResponse.personCheckLevel) && 
       Objects.equals(this.credentialType, personValidationResponse.credentialType) && 
       Objects.equals(this.personId, personValidationResponse.personId));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.accessType, this.verifyBiometry, this.currentOwnerLocation, this.personCheckLevel, this.credentialType, 
           this.personId });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonValidationResponse {\n");
     
     sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
     sb.append("    verifyBiometry: ").append(toIndentedString(this.verifyBiometry)).append("\n");
     sb.append("    currentOwnerLocation: ").append(toIndentedString(this.currentOwnerLocation)).append("\n");
     sb.append("    personCheckLevel: ").append(toIndentedString(this.personCheckLevel)).append("\n");
     sb.append("    credentialType: ").append(toIndentedString(this.credentialType)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\PersonValidationResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */