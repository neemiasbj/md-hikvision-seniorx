package br.com.seniorx.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IncludeCardPendency
 */

public class IncludeCardPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

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

  @SerializedName("readerIdList")
  private List<Integer> readerIdList = null;

  /**
   * Gets or Sets ownerType
   */
  @JsonAdapter(OwnerTypeEnum.Adapter.class)
  public enum OwnerTypeEnum {
    PERSON("PERSON"),
    
    VEHICLE("VEHICLE");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerTypeEnum fromValue(String text) {
      for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OwnerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("ownerType")
  private OwnerTypeEnum ownerType = null;

  @SerializedName("ownerId")
  private Long ownerId = null;

  public IncludeCardPendency pendencyId(Long pendencyId) {
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

  public IncludeCardPendency managerDeviceId(Long managerDeviceId) {
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

  public IncludeCardPendency cardNumber(Long cardNumber) {
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

  public IncludeCardPendency cardTechnology(CardTechnologyEnum cardTechnology) {
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

  public IncludeCardPendency readerIdList(List<Integer> readerIdList) {
    this.readerIdList = readerIdList;
    return this;
  }

  public IncludeCardPendency addReaderIdListItem(Integer readerIdListItem) {
    if (this.readerIdList == null) {
      this.readerIdList = new ArrayList<Integer>();
    }
    this.readerIdList.add(readerIdListItem);
    return this;
  }

   /**
   * Lista das leitoras onde o cartão possui permissão
   * @return readerIdList
  **/
  @Schema(description  = "Lista das leitoras onde o cartão possui permissão")
  public List<Integer> getReaderIdList() {
    return readerIdList;
  }

  public void setReaderIdList(List<Integer> readerIdList) {
    this.readerIdList = readerIdList;
  }

  public IncludeCardPendency ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * Get ownerType
   * @return ownerType
  **/
  @Schema(description  = "")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  public IncludeCardPendency ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Identificador do proprietário da credencial (pessoa ou veículo)
   * @return ownerId
  **/
  @Schema(description  = "Identificador do proprietário da credencial (pessoa ou veículo)")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludeCardPendency includeCardPendency = (IncludeCardPendency) o;
    return Objects.equals(this.pendencyId, includeCardPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, includeCardPendency.managerDeviceId) &&
        Objects.equals(this.cardNumber, includeCardPendency.cardNumber) &&
        Objects.equals(this.cardTechnology, includeCardPendency.cardTechnology) &&
        Objects.equals(this.readerIdList, includeCardPendency.readerIdList) &&
        Objects.equals(this.ownerType, includeCardPendency.ownerType) &&
        Objects.equals(this.ownerId, includeCardPendency.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, cardNumber, cardTechnology, readerIdList, ownerType, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludeCardPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardTechnology: ").append(toIndentedString(cardTechnology)).append("\n");
    sb.append("    readerIdList: ").append(toIndentedString(readerIdList)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

