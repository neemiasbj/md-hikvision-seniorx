 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class CardFormatList
 {
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
 
 
 
 
   
   @Schema(description = "")
   public Long getId() {
     return this.id;
   }
   
   public void setId(Long id) {
     this.id = id;
   }
   
   public CardFormatList numOfBitsOnCard(Integer numOfBitsOnCard) {
     this.numOfBitsOnCard = numOfBitsOnCard;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa a quantidade de bits do cartão, que pode variar segundo o seu fabricante e modelo")
   public Integer getNumOfBitsOnCard() {
     return this.numOfBitsOnCard;
   }
   
   public void setNumOfBitsOnCard(Integer numOfBitsOnCard) {
     this.numOfBitsOnCard = numOfBitsOnCard;
   }
   
   public CardFormatList numOfBitsFromStartForEvenParity(Integer numOfBitsFromStartForEvenParity) {
     this.numOfBitsFromStartForEvenParity = numOfBitsFromStartForEvenParity;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa a quantidade de bits de paridade par que será considerada a partir do início dos bits")
   public Integer getNumOfBitsFromStartForEvenParity() {
     return this.numOfBitsFromStartForEvenParity;
   }
   
   public void setNumOfBitsFromStartForEvenParity(Integer numOfBitsFromStartForEvenParity) {
     this.numOfBitsFromStartForEvenParity = numOfBitsFromStartForEvenParity;
   }
   
   public CardFormatList numOfBitsToEndForOddParity(Integer numOfBitsToEndForOddParity) {
     this.numOfBitsToEndForOddParity = numOfBitsToEndForOddParity;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa a quantidade de bits de paridade ímpar que será considerada a partir do final dos bits")
   public Integer getNumOfBitsToEndForOddParity() {
     return this.numOfBitsToEndForOddParity;
   }
   
   public void setNumOfBitsToEndForOddParity(Integer numOfBitsToEndForOddParity) {
     this.numOfBitsToEndForOddParity = numOfBitsToEndForOddParity;
   }
   
   public CardFormatList numOfBitsIFacilityCode(Integer numOfBitsIFacilityCode) {
     this.numOfBitsIFacilityCode = numOfBitsIFacilityCode;
     return this;
   }
 
 
 
 
   
   @Schema(description = "informa a quantidade de bits do código de acesso, que pode variar segundo o fabricante e modelo do cartão")
   public Integer getNumOfBitsIFacilityCode() {
     return this.numOfBitsIFacilityCode;
   }
   
   public void setNumOfBitsIFacilityCode(Integer numOfBitsIFacilityCode) {
     this.numOfBitsIFacilityCode = numOfBitsIFacilityCode;
   }
   
   public CardFormatList indexFromFirstBitToFirstFacilityCodeBit(Integer indexFromFirstBitToFirstFacilityCodeBit) {
     this.indexFromFirstBitToFirstFacilityCodeBit = indexFromFirstBitToFirstFacilityCodeBit;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa o bit de início do código de acesso")
   public Integer getIndexFromFirstBitToFirstFacilityCodeBit() {
     return this.indexFromFirstBitToFirstFacilityCodeBit;
   }
   
   public void setIndexFromFirstBitToFirstFacilityCodeBit(Integer indexFromFirstBitToFirstFacilityCodeBit) {
     this.indexFromFirstBitToFirstFacilityCodeBit = indexFromFirstBitToFirstFacilityCodeBit;
   }
   
   public CardFormatList numOfBitsInCardNumber(Integer numOfBitsInCardNumber) {
     this.numOfBitsInCardNumber = numOfBitsInCardNumber;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa a quantidade de bits do número de cartão, lembrando que a contagem inicia a partir do bit de início do número de cartão")
   public Integer getNumOfBitsInCardNumber() {
     return this.numOfBitsInCardNumber;
   }
   
   public void setNumOfBitsInCardNumber(Integer numOfBitsInCardNumber) {
     this.numOfBitsInCardNumber = numOfBitsInCardNumber;
   }
   
   public CardFormatList indexFromFirstBitToFirstCardNumberBit(Integer indexFromFirstBitToFirstCardNumberBit) {
     this.indexFromFirstBitToFirstCardNumberBit = indexFromFirstBitToFirstCardNumberBit;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa o bit de início do número de cartão que indica a posição de início da leitura do número do cartão")
   public Integer getIndexFromFirstBitToFirstCardNumberBit() {
     return this.indexFromFirstBitToFirstCardNumberBit;
   }
   
   public void setIndexFromFirstBitToFirstCardNumberBit(Integer indexFromFirstBitToFirstCardNumberBit) {
     this.indexFromFirstBitToFirstCardNumberBit = indexFromFirstBitToFirstCardNumberBit;
   }
   
   public CardFormatList facilityCode(Long facilityCode) {
     this.facilityCode = facilityCode;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa o código de acesso do formato")
   public Long getFacilityCode() {
     return this.facilityCode;
   }
   
   public void setFacilityCode(Long facilityCode) {
     this.facilityCode = facilityCode;
   }
   
   public CardFormatList cardNumberOffset(Long cardNumberOffset) {
     this.cardNumberOffset = cardNumberOffset;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa a quantidade de deslocamento dos bits a serem deslocados no momento da validação de dados")
   public Long getCardNumberOffset() {
     return this.cardNumberOffset;
   }
   
   public void setCardNumberOffset(Long cardNumberOffset) {
     this.cardNumberOffset = cardNumberOffset;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CardFormatList cardFormatList = (CardFormatList)o;
     return (Objects.equals(this.id, cardFormatList.id) && 
       Objects.equals(this.numOfBitsOnCard, cardFormatList.numOfBitsOnCard) && 
       Objects.equals(this.numOfBitsFromStartForEvenParity, cardFormatList.numOfBitsFromStartForEvenParity) && 
       Objects.equals(this.numOfBitsToEndForOddParity, cardFormatList.numOfBitsToEndForOddParity) && 
       Objects.equals(this.numOfBitsIFacilityCode, cardFormatList.numOfBitsIFacilityCode) && 
       Objects.equals(this.indexFromFirstBitToFirstFacilityCodeBit, cardFormatList.indexFromFirstBitToFirstFacilityCodeBit) && 
       Objects.equals(this.numOfBitsInCardNumber, cardFormatList.numOfBitsInCardNumber) && 
       Objects.equals(this.indexFromFirstBitToFirstCardNumberBit, cardFormatList.indexFromFirstBitToFirstCardNumberBit) && 
       Objects.equals(this.facilityCode, cardFormatList.facilityCode) && 
       Objects.equals(this.cardNumberOffset, cardFormatList.cardNumberOffset));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.numOfBitsOnCard, this.numOfBitsFromStartForEvenParity, this.numOfBitsToEndForOddParity, this.numOfBitsIFacilityCode, this.indexFromFirstBitToFirstFacilityCodeBit, this.numOfBitsInCardNumber, this.indexFromFirstBitToFirstCardNumberBit, this.facilityCode, this.cardNumberOffset });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CardFormatList {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    numOfBitsOnCard: ").append(toIndentedString(this.numOfBitsOnCard)).append("\n");
     sb.append("    numOfBitsFromStartForEvenParity: ").append(toIndentedString(this.numOfBitsFromStartForEvenParity)).append("\n");
     sb.append("    numOfBitsToEndForOddParity: ").append(toIndentedString(this.numOfBitsToEndForOddParity)).append("\n");
     sb.append("    numOfBitsIFacilityCode: ").append(toIndentedString(this.numOfBitsIFacilityCode)).append("\n");
     sb.append("    indexFromFirstBitToFirstFacilityCodeBit: ").append(toIndentedString(this.indexFromFirstBitToFirstFacilityCodeBit)).append("\n");
     sb.append("    numOfBitsInCardNumber: ").append(toIndentedString(this.numOfBitsInCardNumber)).append("\n");
     sb.append("    indexFromFirstBitToFirstCardNumberBit: ").append(toIndentedString(this.indexFromFirstBitToFirstCardNumberBit)).append("\n");
     sb.append("    facilityCode: ").append(toIndentedString(this.facilityCode)).append("\n");
     sb.append("    cardNumberOffset: ").append(toIndentedString(this.cardNumberOffset)).append("\n");
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


