 package br.com.seniorx.models;
 import java.io.IOException;
import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
<<<<<<< HEAD
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 public class UpdatePersonREPPendency { @SerializedName("pendencyId") private Long pendencyId; @SerializedName("managerDeviceId") private Long managerDeviceId; @SerializedName("operationId") private OperationIdEnum operationId; @SerializedName("cardNumber") private Long cardNumber; @SerializedName("cardTechnology") private CardTechnologyEnum cardTechnology; @SerializedName("personId") private Long personId; @SerializedName("personName") private String personName; @SerializedName("pis") private Long pis; @SerializedName("cpf") private Long cpf; @SerializedName("biometricStatus") private BiometricStatusEnum biometricStatus; @SerializedName("verifyBiometrics") private VerifyBiometricsEnum verifyBiometrics; @SerializedName("biometry") private List<Biometry> biometry; @JsonAdapter(OperationIdEnum.Adapter.class)
   public enum OperationIdEnum { INCLUDE_CARD("INCLUDE_CARD"),
     EXCLUDE_CARD("EXCLUDE_CARD"),
     EXCLUDE_PERSON("EXCLUDE_PERSON"); private String value; OperationIdEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static OperationIdEnum fromValue(String text) { byte b;
       int i;
       OperationIdEnum[] arrayOfOperationIdEnum;
       for (i = (arrayOfOperationIdEnum = values()).length, b = 0; b < i; ) {
         OperationIdEnum operationIdEnum = arrayOfOperationIdEnum[b];
         if (String.valueOf(operationIdEnum.value).equals(text))
           return operationIdEnum; 
         b++;
       } 
       return null; } public static class Adapter extends TypeAdapter<OperationIdEnum> { public void write(JsonWriter jsonWriter, UpdatePersonREPPendency.OperationIdEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public UpdatePersonREPPendency.OperationIdEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
         return UpdatePersonREPPendency.OperationIdEnum.fromValue(String.valueOf(value)); } } } public UpdatePersonREPPendency() { this.pendencyId = null;
 
     
     this.managerDeviceId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.operationId = null;
 
     
     this.cardNumber = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.cardTechnology = null;
 
     
     this.personId = null;
 
     
     this.personName = null;
 
     
     this.pis = null;
 
     
     this.cpf = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.biometricStatus = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.verifyBiometrics = null;
 
     
     this.biometry = null; }
   @JsonAdapter(CardTechnologyEnum.Adapter.class) public enum CardTechnologyEnum {
     BARCODE_CARD("BARCODE_CARD"), RFID_CARD("RFID_CARD"), SMART_CARD("SMART_CARD"), QRCODE("QRCODE"); private String value; CardTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CardTechnologyEnum fromValue(String text) { byte b; int i; CardTechnologyEnum[] arrayOfCardTechnologyEnum; for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i; ) { CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b]; if (String.valueOf(cardTechnologyEnum.value).equals(text)) return cardTechnologyEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
       public void write(JsonWriter jsonWriter, UpdatePersonREPPendency.CardTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public UpdatePersonREPPendency.CardTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return UpdatePersonREPPendency.CardTechnologyEnum.fromValue(String.valueOf(value)); } } } public UpdatePersonREPPendency pendencyId(Long pendencyId) { this.pendencyId = pendencyId;
     return this; } @JsonAdapter(BiometricStatusEnum.Adapter.class) public enum BiometricStatusEnum {
     NOT_CHANGE("NOT_CHANGE"), CHANGE("CHANGE"), EXCLUDE("EXCLUDE"); private String value; BiometricStatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static BiometricStatusEnum fromValue(String text) { byte b; int i; BiometricStatusEnum[] arrayOfBiometricStatusEnum; for (i = (arrayOfBiometricStatusEnum = values()).length, b = 0; b < i; ) { BiometricStatusEnum biometricStatusEnum = arrayOfBiometricStatusEnum[b]; if (String.valueOf(biometricStatusEnum.value).equals(text)) return biometricStatusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<BiometricStatusEnum> {
       public void write(JsonWriter jsonWriter, UpdatePersonREPPendency.BiometricStatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public UpdatePersonREPPendency.BiometricStatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return UpdatePersonREPPendency.BiometricStatusEnum.fromValue(String.valueOf(value)); } } } @JsonAdapter(VerifyBiometricsEnum.Adapter.class) public enum VerifyBiometricsEnum {
     NOT_VALID_BIOMETRY("NOT_VALID_BIOMETRY"), VALID_CARD_AND_BIOMETRY("VALID_CARD_AND_BIOMETRY"), ONLY_VALID_BIOMETRY("ONLY_VALID_BIOMETRY"); private String value; VerifyBiometricsEnum(String value) { this.value = value; } public String getValue() { return this.value; }
     public String toString() { return String.valueOf(this.value); }
     public static VerifyBiometricsEnum fromValue(String text) { byte b; int i; VerifyBiometricsEnum[] arrayOfVerifyBiometricsEnum; for (i = (arrayOfVerifyBiometricsEnum = values()).length, b = 0; b < i; ) { VerifyBiometricsEnum verifyBiometricsEnum = arrayOfVerifyBiometricsEnum[b]; if (String.valueOf(verifyBiometricsEnum.value).equals(text)) return verifyBiometricsEnum;  b++; }  return null; }
     public static class Adapter extends TypeAdapter<VerifyBiometricsEnum> {
       public void write(JsonWriter jsonWriter, UpdatePersonREPPendency.VerifyBiometricsEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public UpdatePersonREPPendency.VerifyBiometricsEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return UpdatePersonREPPendency.VerifyBiometricsEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Identificador da pendência") public Long getPendencyId() { return this.pendencyId; }
 
   
   public void setPendencyId(Long pendencyId) {
     this.pendencyId = pendencyId;
   }
   
   public UpdatePersonREPPendency managerDeviceId(Long managerDeviceId) {
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
   
   public UpdatePersonREPPendency operationId(OperationIdEnum operationId) {
     this.operationId = operationId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tipo da operação")
   public OperationIdEnum getOperationId() {
     return this.operationId;
   }
   
   public void setOperationId(OperationIdEnum operationId) {
     this.operationId = operationId;
   }
   
   public UpdatePersonREPPendency cardNumber(Long cardNumber) {
     this.cardNumber = cardNumber;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Número do cartão")
   public Long getCardNumber() {
     return this.cardNumber;
   }
   
   public void setCardNumber(Long cardNumber) {
     this.cardNumber = cardNumber;
   }
   
   public UpdatePersonREPPendency cardTechnology(CardTechnologyEnum cardTechnology) {
     this.cardTechnology = cardTechnology;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public CardTechnologyEnum getCardTechnology() {
     return this.cardTechnology;
   }
   
   public void setCardTechnology(CardTechnologyEnum cardTechnology) {
     this.cardTechnology = cardTechnology;
   }
   
   public UpdatePersonREPPendency personId(Long personId) {
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
   
   public UpdatePersonREPPendency personName(String personName) {
     this.personName = personName;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nome da pessoa")
   public String getPersonName() {
     return this.personName;
   }
   
   public void setPersonName(String personName) {
     this.personName = personName;
   }
   
   public UpdatePersonREPPendency pis(Long pis) {
     this.pis = pis;
     return this;
   }
 
 
 
 
   
   @Schema(description = "PIS")
   public Long getPis() {
     return this.pis;
   }
   
   public void setPis(Long pis) {
     this.pis = pis;
   }
   
   public UpdatePersonREPPendency cpf(Long cpf) {
     this.cpf = cpf;
     return this;
   }
 
 
 
 
   
   @Schema(description = "CPF")
   public Long getCpf() {
     return this.cpf;
   }
   
   public void setCpf(Long cpf) {
     this.cpf = cpf;
   }
   
   public UpdatePersonREPPendency biometricStatus(BiometricStatusEnum biometricStatus) {
     this.biometricStatus = biometricStatus;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Status da biometria")
   public BiometricStatusEnum getBiometricStatus() {
     return this.biometricStatus;
   }
   
   public void setBiometricStatus(BiometricStatusEnum biometricStatus) {
     this.biometricStatus = biometricStatus;
   }
   
   public UpdatePersonREPPendency verifyBiometrics(VerifyBiometricsEnum verifyBiometrics) {
     this.verifyBiometrics = verifyBiometrics;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Validação da biometria")
   public VerifyBiometricsEnum getVerifyBiometrics() {
     return this.verifyBiometrics;
   }
   
   public void setVerifyBiometrics(VerifyBiometricsEnum verifyBiometrics) {
     this.verifyBiometrics = verifyBiometrics;
   }
   
   public UpdatePersonREPPendency biometry(List<Biometry> biometry) {
     this.biometry = biometry;
     return this;
   }
   
   public UpdatePersonREPPendency addBiometryItem(Biometry biometryItem) {
     if (this.biometry == null) {
       this.biometry = new ArrayList<>();
     }
     this.biometry.add(biometryItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public List<Biometry> getBiometry() {
     return this.biometry;
   }
   
   public void setBiometry(List<Biometry> biometry) {
     this.biometry = biometry;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     UpdatePersonREPPendency updatePersonREPPendency = (UpdatePersonREPPendency)o;
     return (Objects.equals(this.pendencyId, updatePersonREPPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, updatePersonREPPendency.managerDeviceId) && 
       Objects.equals(this.operationId, updatePersonREPPendency.operationId) && 
       Objects.equals(this.cardNumber, updatePersonREPPendency.cardNumber) && 
       Objects.equals(this.cardTechnology, updatePersonREPPendency.cardTechnology) && 
       Objects.equals(this.personId, updatePersonREPPendency.personId) && 
       Objects.equals(this.personName, updatePersonREPPendency.personName) && 
       Objects.equals(this.pis, updatePersonREPPendency.pis) && 
       Objects.equals(this.cpf, updatePersonREPPendency.cpf) && 
       Objects.equals(this.biometricStatus, updatePersonREPPendency.biometricStatus) && 
       Objects.equals(this.verifyBiometrics, updatePersonREPPendency.verifyBiometrics) && 
       Objects.equals(this.biometry, updatePersonREPPendency.biometry));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.operationId, this.cardNumber, this.cardTechnology, this.personId, this.personName, this.pis, this.cpf, this.biometricStatus, this.verifyBiometrics, this.biometry });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class UpdatePersonREPPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    operationId: ").append(toIndentedString(this.operationId)).append("\n");
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    personName: ").append(toIndentedString(this.personName)).append("\n");
     sb.append("    pis: ").append(toIndentedString(this.pis)).append("\n");
     sb.append("    cpf: ").append(toIndentedString(this.cpf)).append("\n");
     sb.append("    biometricStatus: ").append(toIndentedString(this.biometricStatus)).append("\n");
     sb.append("    verifyBiometrics: ").append(toIndentedString(this.verifyBiometrics)).append("\n");
     sb.append("    biometry: ").append(toIndentedString(this.biometry)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\UpdatePersonREPPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UpdatePersonREPPendency
 */

public class UpdatePersonREPPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  /**
   * Tipo da operação
   */
  @JsonAdapter(OperationIdEnum.Adapter.class)
  public enum OperationIdEnum {
    INCLUDE_CARD("INCLUDE_CARD"),
    
    EXCLUDE_CARD("EXCLUDE_CARD"),
    
    EXCLUDE_PERSON("EXCLUDE_PERSON");

    private String value;

    OperationIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationIdEnum fromValue(String text) {
      for (OperationIdEnum b : OperationIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationIdEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationIdEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("operationId")
  private OperationIdEnum operationId = null;

  @SerializedName("cardNumber")
  private Long cardNumber = null;

  /**
   * Gets or Sets cardTechnology
   */
  @JsonAdapter(CardTechnologyEnum.Adapter.class)
  public enum CardTechnologyEnum {
    BARCODE_CARD("BARCODE_CARD"),
    
    RFID_CARD("RFID_CARD"),
    
    SMART_CARD("SMART_CARD"),
    
    QRCODE("QRCODE");

    private String value;

    CardTechnologyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardTechnologyEnum fromValue(String text) {
      for (CardTechnologyEnum b : CardTechnologyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardTechnologyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardTechnologyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardTechnologyEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("cardTechnology")
  private CardTechnologyEnum cardTechnology = null;

  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("personName")
  private String personName = null;

  @SerializedName("pis")
  private Long pis = null;

  @SerializedName("cpf")
  private Long cpf = null;

  /**
   * Status da biometria
   */
  @JsonAdapter(BiometricStatusEnum.Adapter.class)
  public enum BiometricStatusEnum {
    NOT_CHANGE("NOT_CHANGE"),
    
    CHANGE("CHANGE"),
    
    EXCLUDE("EXCLUDE");

    private String value;

    BiometricStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BiometricStatusEnum fromValue(String text) {
      for (BiometricStatusEnum b : BiometricStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BiometricStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BiometricStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BiometricStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BiometricStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("biometricStatus")
  private BiometricStatusEnum biometricStatus = null;

  /**
   * Validação da biometria
   */
  @JsonAdapter(VerifyBiometricsEnum.Adapter.class)
  public enum VerifyBiometricsEnum {
    NOT_VALID_BIOMETRY("NOT_VALID_BIOMETRY"),
    
    VALID_CARD_AND_BIOMETRY("VALID_CARD_AND_BIOMETRY"),
    
    ONLY_VALID_BIOMETRY("ONLY_VALID_BIOMETRY");

    private String value;

    VerifyBiometricsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerifyBiometricsEnum fromValue(String text) {
      for (VerifyBiometricsEnum b : VerifyBiometricsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerifyBiometricsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerifyBiometricsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerifyBiometricsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerifyBiometricsEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("verifyBiometrics")
  private VerifyBiometricsEnum verifyBiometrics = null;

  @SerializedName("biometry")
  private List<Biometry> biometry = null;

  public UpdatePersonREPPendency pendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
    return this;
  }

   /**
   * Identificador da pendência
   * @return pendencyId
  **/
  @Schema(description  = "Identificador da pendência")
  public Long getPendencyId() {
    return pendencyId;
  }

  public void setPendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
  }

  public UpdatePersonREPPendency managerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
    return this;
  }

   /**
   * Identificador do dispositivo gerenciador
   * @return managerDeviceId
  **/
  @Schema(description  = "Identificador do dispositivo gerenciador")
  public Long getManagerDeviceId() {
    return managerDeviceId;
  }

  public void setManagerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
  }

  public UpdatePersonREPPendency operationId(OperationIdEnum operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Tipo da operação
   * @return operationId
  **/
  @Schema(description  = "Tipo da operação")
  public OperationIdEnum getOperationId() {
    return operationId;
  }

  public void setOperationId(OperationIdEnum operationId) {
    this.operationId = operationId;
  }

  public UpdatePersonREPPendency cardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Número do cartão
   * @return cardNumber
  **/
  @Schema(description  = "Número do cartão")
  public Long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
  }

  public UpdatePersonREPPendency cardTechnology(CardTechnologyEnum cardTechnology) {
    this.cardTechnology = cardTechnology;
    return this;
  }

   /**
   * Get cardTechnology
   * @return cardTechnology
  **/
  @Schema(description  = "")
  public CardTechnologyEnum getCardTechnology() {
    return cardTechnology;
  }

  public void setCardTechnology(CardTechnologyEnum cardTechnology) {
    this.cardTechnology = cardTechnology;
  }

  public UpdatePersonREPPendency personId(Long personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Identificador da pessoa
   * @return personId
  **/
  @Schema(description  = "Identificador da pessoa")
  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public UpdatePersonREPPendency personName(String personName) {
    this.personName = personName;
    return this;
  }

   /**
   * Nome da pessoa
   * @return personName
  **/
  @Schema(description  = "Nome da pessoa")
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public UpdatePersonREPPendency pis(Long pis) {
    this.pis = pis;
    return this;
  }

   /**
   * PIS
   * @return pis
  **/
  @Schema(description  = "PIS")
  public Long getPis() {
    return pis;
  }

  public void setPis(Long pis) {
    this.pis = pis;
  }

  public UpdatePersonREPPendency cpf(Long cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * CPF
   * @return cpf
  **/
  @Schema(description  = "CPF")
  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  public UpdatePersonREPPendency biometricStatus(BiometricStatusEnum biometricStatus) {
    this.biometricStatus = biometricStatus;
    return this;
  }

   /**
   * Status da biometria
   * @return biometricStatus
  **/
  @Schema(description  = "Status da biometria")
  public BiometricStatusEnum getBiometricStatus() {
    return biometricStatus;
  }

  public void setBiometricStatus(BiometricStatusEnum biometricStatus) {
    this.biometricStatus = biometricStatus;
  }

  public UpdatePersonREPPendency verifyBiometrics(VerifyBiometricsEnum verifyBiometrics) {
    this.verifyBiometrics = verifyBiometrics;
    return this;
  }

   /**
   * Validação da biometria
   * @return verifyBiometrics
  **/
  @Schema(description  = "Validação da biometria")
  public VerifyBiometricsEnum getVerifyBiometrics() {
    return verifyBiometrics;
  }

  public void setVerifyBiometrics(VerifyBiometricsEnum verifyBiometrics) {
    this.verifyBiometrics = verifyBiometrics;
  }

  public UpdatePersonREPPendency biometry(List<Biometry> biometry) {
    this.biometry = biometry;
    return this;
  }

  public UpdatePersonREPPendency addBiometryItem(Biometry biometryItem) {
    if (this.biometry == null) {
      this.biometry = new ArrayList<Biometry>();
    }
    this.biometry.add(biometryItem);
    return this;
  }

   /**
   * Get biometry
   * @return biometry
  **/
  @Schema(description  = "")
  public List<Biometry> getBiometry() {
    return biometry;
  }

  public void setBiometry(List<Biometry> biometry) {
    this.biometry = biometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePersonREPPendency updatePersonREPPendency = (UpdatePersonREPPendency) o;
    return Objects.equals(this.pendencyId, updatePersonREPPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, updatePersonREPPendency.managerDeviceId) &&
        Objects.equals(this.operationId, updatePersonREPPendency.operationId) &&
        Objects.equals(this.cardNumber, updatePersonREPPendency.cardNumber) &&
        Objects.equals(this.cardTechnology, updatePersonREPPendency.cardTechnology) &&
        Objects.equals(this.personId, updatePersonREPPendency.personId) &&
        Objects.equals(this.personName, updatePersonREPPendency.personName) &&
        Objects.equals(this.pis, updatePersonREPPendency.pis) &&
        Objects.equals(this.cpf, updatePersonREPPendency.cpf) &&
        Objects.equals(this.biometricStatus, updatePersonREPPendency.biometricStatus) &&
        Objects.equals(this.verifyBiometrics, updatePersonREPPendency.verifyBiometrics) &&
        Objects.equals(this.biometry, updatePersonREPPendency.biometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, operationId, cardNumber, cardTechnology, personId, personName, pis, cpf, biometricStatus, verifyBiometrics, biometry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePersonREPPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardTechnology: ").append(toIndentedString(cardTechnology)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    pis: ").append(toIndentedString(pis)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    biometricStatus: ").append(toIndentedString(biometricStatus)).append("\n");
    sb.append("    verifyBiometrics: ").append(toIndentedString(verifyBiometrics)).append("\n");
    sb.append("    biometry: ").append(toIndentedString(biometry)).append("\n");
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

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
