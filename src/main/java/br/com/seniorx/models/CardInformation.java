 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 @Schema(description = "Informação do cartão")
 public class CardInformation {
   @SerializedName("cardNumber")
   private Long cardNumber;
   @SerializedName("cardTechnology")
   private CardTechnologyEnum cardTechnology;
   @SerializedName("startDate")
   private String startDate;
   @SerializedName("expirationDate")
   private String expirationDate;
   
   public CardInformation() { this.cardNumber = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.cardTechnology = null;
 
     
     this.startDate = null;
 
     
     this.expirationDate = null; }
 
   
   public CardInformation cardNumber(Long cardNumber) { this.cardNumber = cardNumber;
     return this; }
 
 
 
 
 
 
   
   @Schema(description = "Número do cartão")
   public Long getCardNumber() {
     return this.cardNumber;
   }
   @JsonAdapter(CardTechnologyEnum.Adapter.class) public enum CardTechnologyEnum {
     BARCODE_CARD("BARCODE_CARD"), RFID_CARD("RFID_CARD"), SMART_CARD("SMART_CARD"), QRCODE("QRCODE"); private String value; CardTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CardTechnologyEnum fromValue(String text) { byte b; int i; CardTechnologyEnum[] arrayOfCardTechnologyEnum; for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i; ) { CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b]; if (String.valueOf(cardTechnologyEnum.value).equals(text)) return cardTechnologyEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
       public void write(JsonWriter jsonWriter, CardInformation.CardTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public CardInformation.CardTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return CardInformation.CardTechnologyEnum.fromValue(String.valueOf(value)); } } } public void setCardNumber(Long cardNumber) { this.cardNumber = cardNumber; }
 
   
   public CardInformation cardTechnology(CardTechnologyEnum cardTechnology) {
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
   
   public CardInformation startDate(String startDate) {
     this.startDate = startDate;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Data inicial")
   public String getStartDate() {
     return this.startDate;
   }
   
   public void setStartDate(String startDate) {
     this.startDate = startDate;
   }
   
   public CardInformation expirationDate(String expirationDate) {
     this.expirationDate = expirationDate;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Data de expiração")
   public String getExpirationDate() {
     return this.expirationDate;
   }
   
   public void setExpirationDate(String expirationDate) {
     this.expirationDate = expirationDate;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CardInformation cardInformation = (CardInformation)o;
     return (Objects.equals(this.cardNumber, cardInformation.cardNumber) && 
       Objects.equals(this.cardTechnology, cardInformation.cardTechnology) && 
       Objects.equals(this.startDate, cardInformation.startDate) && 
       Objects.equals(this.expirationDate, cardInformation.expirationDate));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.cardNumber, this.cardTechnology, this.startDate, this.expirationDate });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CardInformation {\n");
     
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
     sb.append("    startDate: ").append(toIndentedString(this.startDate)).append("\n");
     sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\CardInformation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */