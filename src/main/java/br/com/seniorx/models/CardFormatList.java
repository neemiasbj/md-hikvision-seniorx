package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CardFormatList
 */

public class CardFormatList {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("numOfBitsOnCard")
  private Integer numOfBitsOnCard = null;

  @SerializedName("numOfBitsFromStartForEvenParity")
  private Integer numOfBitsFromStartForEvenParity = null;

  @SerializedName("numOfBitsToEndForOddParity")
  private Integer numOfBitsToEndForOddParity = null;

  @SerializedName("numOfBitsIFacilityCode")
  private Integer numOfBitsIFacilityCode = null;

  @SerializedName("indexFromFirstBitToFirstFacilityCodeBit")
  private Integer indexFromFirstBitToFirstFacilityCodeBit = null;

  @SerializedName("numOfBitsInCardNumber")
  private Integer numOfBitsInCardNumber = null;

  @SerializedName("indexFromFirstBitToFirstCardNumberBit")
  private Integer indexFromFirstBitToFirstCardNumberBit = null;

  @SerializedName("facilityCode")
  private Long facilityCode = null;

  @SerializedName("cardNumberOffset")
  private Long cardNumberOffset = null;

  public CardFormatList id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description  = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CardFormatList numOfBitsOnCard(Integer numOfBitsOnCard) {
    this.numOfBitsOnCard = numOfBitsOnCard;
    return this;
  }

   /**
   * Informa a quantidade de bits do cartão, que pode variar segundo o seu fabricante e modelo
   * @return numOfBitsOnCard
  **/
  @Schema(description  = "Informa a quantidade de bits do cartão, que pode variar segundo o seu fabricante e modelo")
  public Integer getNumOfBitsOnCard() {
    return numOfBitsOnCard;
  }

  public void setNumOfBitsOnCard(Integer numOfBitsOnCard) {
    this.numOfBitsOnCard = numOfBitsOnCard;
  }

  public CardFormatList numOfBitsFromStartForEvenParity(Integer numOfBitsFromStartForEvenParity) {
    this.numOfBitsFromStartForEvenParity = numOfBitsFromStartForEvenParity;
    return this;
  }

   /**
   * Informa a quantidade de bits de paridade par que será considerada a partir do início dos bits
   * @return numOfBitsFromStartForEvenParity
  **/
  @Schema(description  = "Informa a quantidade de bits de paridade par que será considerada a partir do início dos bits")
  public Integer getNumOfBitsFromStartForEvenParity() {
    return numOfBitsFromStartForEvenParity;
  }

  public void setNumOfBitsFromStartForEvenParity(Integer numOfBitsFromStartForEvenParity) {
    this.numOfBitsFromStartForEvenParity = numOfBitsFromStartForEvenParity;
  }

  public CardFormatList numOfBitsToEndForOddParity(Integer numOfBitsToEndForOddParity) {
    this.numOfBitsToEndForOddParity = numOfBitsToEndForOddParity;
    return this;
  }

   /**
   * Informa a quantidade de bits de paridade ímpar que será considerada a partir do final dos bits
   * @return numOfBitsToEndForOddParity
  **/
  @Schema(description  = "Informa a quantidade de bits de paridade ímpar que será considerada a partir do final dos bits")
  public Integer getNumOfBitsToEndForOddParity() {
    return numOfBitsToEndForOddParity;
  }

  public void setNumOfBitsToEndForOddParity(Integer numOfBitsToEndForOddParity) {
    this.numOfBitsToEndForOddParity = numOfBitsToEndForOddParity;
  }

  public CardFormatList numOfBitsIFacilityCode(Integer numOfBitsIFacilityCode) {
    this.numOfBitsIFacilityCode = numOfBitsIFacilityCode;
    return this;
  }

   /**
   * informa a quantidade de bits do código de acesso, que pode variar segundo o fabricante e modelo do cartão
   * @return numOfBitsIFacilityCode
  **/
  @Schema(description  = "informa a quantidade de bits do código de acesso, que pode variar segundo o fabricante e modelo do cartão")
  public Integer getNumOfBitsIFacilityCode() {
    return numOfBitsIFacilityCode;
  }

  public void setNumOfBitsIFacilityCode(Integer numOfBitsIFacilityCode) {
    this.numOfBitsIFacilityCode = numOfBitsIFacilityCode;
  }

  public CardFormatList indexFromFirstBitToFirstFacilityCodeBit(Integer indexFromFirstBitToFirstFacilityCodeBit) {
    this.indexFromFirstBitToFirstFacilityCodeBit = indexFromFirstBitToFirstFacilityCodeBit;
    return this;
  }

   /**
   * Informa o bit de início do código de acesso
   * @return indexFromFirstBitToFirstFacilityCodeBit
  **/
  @Schema(description  = "Informa o bit de início do código de acesso")
  public Integer getIndexFromFirstBitToFirstFacilityCodeBit() {
    return indexFromFirstBitToFirstFacilityCodeBit;
  }

  public void setIndexFromFirstBitToFirstFacilityCodeBit(Integer indexFromFirstBitToFirstFacilityCodeBit) {
    this.indexFromFirstBitToFirstFacilityCodeBit = indexFromFirstBitToFirstFacilityCodeBit;
  }

  public CardFormatList numOfBitsInCardNumber(Integer numOfBitsInCardNumber) {
    this.numOfBitsInCardNumber = numOfBitsInCardNumber;
    return this;
  }

   /**
   * Informa a quantidade de bits do número de cartão, lembrando que a contagem inicia a partir do bit de início do número de cartão
   * @return numOfBitsInCardNumber
  **/
  @Schema(description  = "Informa a quantidade de bits do número de cartão, lembrando que a contagem inicia a partir do bit de início do número de cartão")
  public Integer getNumOfBitsInCardNumber() {
    return numOfBitsInCardNumber;
  }

  public void setNumOfBitsInCardNumber(Integer numOfBitsInCardNumber) {
    this.numOfBitsInCardNumber = numOfBitsInCardNumber;
  }

  public CardFormatList indexFromFirstBitToFirstCardNumberBit(Integer indexFromFirstBitToFirstCardNumberBit) {
    this.indexFromFirstBitToFirstCardNumberBit = indexFromFirstBitToFirstCardNumberBit;
    return this;
  }

   /**
   * Informa o bit de início do número de cartão que indica a posição de início da leitura do número do cartão
   * @return indexFromFirstBitToFirstCardNumberBit
  **/
  @Schema(description  = "Informa o bit de início do número de cartão que indica a posição de início da leitura do número do cartão")
  public Integer getIndexFromFirstBitToFirstCardNumberBit() {
    return indexFromFirstBitToFirstCardNumberBit;
  }

  public void setIndexFromFirstBitToFirstCardNumberBit(Integer indexFromFirstBitToFirstCardNumberBit) {
    this.indexFromFirstBitToFirstCardNumberBit = indexFromFirstBitToFirstCardNumberBit;
  }

  public CardFormatList facilityCode(Long facilityCode) {
    this.facilityCode = facilityCode;
    return this;
  }

   /**
   * Informa o código de acesso do formato
   * @return facilityCode
  **/
  @Schema(description  = "Informa o código de acesso do formato")
  public Long getFacilityCode() {
    return facilityCode;
  }

  public void setFacilityCode(Long facilityCode) {
    this.facilityCode = facilityCode;
  }

  public CardFormatList cardNumberOffset(Long cardNumberOffset) {
    this.cardNumberOffset = cardNumberOffset;
    return this;
  }

   /**
   * Informa a quantidade de deslocamento dos bits a serem deslocados no momento da validação de dados
   * @return cardNumberOffset
  **/
  @Schema(description  = "Informa a quantidade de deslocamento dos bits a serem deslocados no momento da validação de dados")
  public Long getCardNumberOffset() {
    return cardNumberOffset;
  }

  public void setCardNumberOffset(Long cardNumberOffset) {
    this.cardNumberOffset = cardNumberOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardFormatList cardFormatList = (CardFormatList) o;
    return Objects.equals(this.id, cardFormatList.id) &&
        Objects.equals(this.numOfBitsOnCard, cardFormatList.numOfBitsOnCard) &&
        Objects.equals(this.numOfBitsFromStartForEvenParity, cardFormatList.numOfBitsFromStartForEvenParity) &&
        Objects.equals(this.numOfBitsToEndForOddParity, cardFormatList.numOfBitsToEndForOddParity) &&
        Objects.equals(this.numOfBitsIFacilityCode, cardFormatList.numOfBitsIFacilityCode) &&
        Objects.equals(this.indexFromFirstBitToFirstFacilityCodeBit, cardFormatList.indexFromFirstBitToFirstFacilityCodeBit) &&
        Objects.equals(this.numOfBitsInCardNumber, cardFormatList.numOfBitsInCardNumber) &&
        Objects.equals(this.indexFromFirstBitToFirstCardNumberBit, cardFormatList.indexFromFirstBitToFirstCardNumberBit) &&
        Objects.equals(this.facilityCode, cardFormatList.facilityCode) &&
        Objects.equals(this.cardNumberOffset, cardFormatList.cardNumberOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numOfBitsOnCard, numOfBitsFromStartForEvenParity, numOfBitsToEndForOddParity, numOfBitsIFacilityCode, indexFromFirstBitToFirstFacilityCodeBit, numOfBitsInCardNumber, indexFromFirstBitToFirstCardNumberBit, facilityCode, cardNumberOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFormatList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numOfBitsOnCard: ").append(toIndentedString(numOfBitsOnCard)).append("\n");
    sb.append("    numOfBitsFromStartForEvenParity: ").append(toIndentedString(numOfBitsFromStartForEvenParity)).append("\n");
    sb.append("    numOfBitsToEndForOddParity: ").append(toIndentedString(numOfBitsToEndForOddParity)).append("\n");
    sb.append("    numOfBitsIFacilityCode: ").append(toIndentedString(numOfBitsIFacilityCode)).append("\n");
    sb.append("    indexFromFirstBitToFirstFacilityCodeBit: ").append(toIndentedString(indexFromFirstBitToFirstFacilityCodeBit)).append("\n");
    sb.append("    numOfBitsInCardNumber: ").append(toIndentedString(numOfBitsInCardNumber)).append("\n");
    sb.append("    indexFromFirstBitToFirstCardNumberBit: ").append(toIndentedString(indexFromFirstBitToFirstCardNumberBit)).append("\n");
    sb.append("    facilityCode: ").append(toIndentedString(facilityCode)).append("\n");
    sb.append("    cardNumberOffset: ").append(toIndentedString(cardNumberOffset)).append("\n");
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

