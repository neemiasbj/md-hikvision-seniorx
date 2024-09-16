package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

/**
 * PersonValidationResponse
 */

public class PersonValidationResponse {
  /**
   * Gets or Sets accessType
   */
  @JsonAdapter(AccessTypeEnum.Adapter.class)
  public enum AccessTypeEnum {
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
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessTypeEnum fromValue(String text) {
      for (AccessTypeEnum b : AccessTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("accessType")
  private AccessTypeEnum accessType = null;

  @SerializedName("verifyBiometry")
  private Boolean verifyBiometry = false;

  @SerializedName("currentOwnerLocation")
  private Long currentOwnerLocation = null;

  @SerializedName("personCheckLevel")
  private Boolean personCheckLevel = false;

  /**
   * Tipo da credencial (titular ou provisória)
   */
  @JsonAdapter(CredentialTypeEnum.Adapter.class)
  public enum CredentialTypeEnum {
    HOLDER("HOLDER"),
    
    PROVISORY("PROVISORY");

    private String value;

    CredentialTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CredentialTypeEnum fromValue(String text) {
      for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CredentialTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CredentialTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CredentialTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CredentialTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("credentialType")
  private CredentialTypeEnum credentialType = null;

  @SerializedName("personId")
  private Long personId = null;

  public PersonValidationResponse accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @ApiModelProperty(value = "")
  public AccessTypeEnum getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }

  public PersonValidationResponse verifyBiometry(Boolean verifyBiometry) {
    this.verifyBiometry = verifyBiometry;
    return this;
  }

   /**
   * Informa se verifica biometria
   * @return verifyBiometry
  **/
  @ApiModelProperty(value = "Informa se verifica biometria")
  public Boolean isVerifyBiometry() {
    return verifyBiometry;
  }

  public void setVerifyBiometry(Boolean verifyBiometry) {
    this.verifyBiometry = verifyBiometry;
  }

  public PersonValidationResponse currentOwnerLocation(Long currentOwnerLocation) {
    this.currentOwnerLocation = currentOwnerLocation;
    return this;
  }

   /**
   * Identificador da localização atual da pessoa
   * @return currentOwnerLocation
  **/
  @ApiModelProperty(value = "Identificador da localização atual da pessoa")
  public Long getCurrentOwnerLocation() {
    return currentOwnerLocation;
  }

  public void setCurrentOwnerLocation(Long currentOwnerLocation) {
    this.currentOwnerLocation = currentOwnerLocation;
  }

  public PersonValidationResponse personCheckLevel(Boolean personCheckLevel) {
    this.personCheckLevel = personCheckLevel;
    return this;
  }

   /**
   * Informa se a pessoa controla nível
   * @return personCheckLevel
  **/
  @ApiModelProperty(value = "Informa se a pessoa controla nível")
  public Boolean isPersonCheckLevel() {
    return personCheckLevel;
  }

  public void setPersonCheckLevel(Boolean personCheckLevel) {
    this.personCheckLevel = personCheckLevel;
  }

  public PersonValidationResponse credentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Tipo da credencial (titular ou provisória)
   * @return credentialType
  **/
  @ApiModelProperty(value = "Tipo da credencial (titular ou provisória)")
  public CredentialTypeEnum getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
  }

  public PersonValidationResponse personId(Long personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Identificador da pessoa
   * @return personId
  **/
  @ApiModelProperty(value = "Identificador da pessoa")
  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonValidationResponse personValidationResponse = (PersonValidationResponse) o;
    return Objects.equals(this.accessType, personValidationResponse.accessType) &&
        Objects.equals(this.verifyBiometry, personValidationResponse.verifyBiometry) &&
        Objects.equals(this.currentOwnerLocation, personValidationResponse.currentOwnerLocation) &&
        Objects.equals(this.personCheckLevel, personValidationResponse.personCheckLevel) &&
        Objects.equals(this.credentialType, personValidationResponse.credentialType) &&
        Objects.equals(this.personId, personValidationResponse.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, verifyBiometry, currentOwnerLocation, personCheckLevel, credentialType, personId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonValidationResponse {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    verifyBiometry: ").append(toIndentedString(verifyBiometry)).append("\n");
    sb.append("    currentOwnerLocation: ").append(toIndentedString(currentOwnerLocation)).append("\n");
    sb.append("    personCheckLevel: ").append(toIndentedString(personCheckLevel)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
