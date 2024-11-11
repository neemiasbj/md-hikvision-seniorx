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
 public class IncludeCardPendency { @SerializedName("pendencyId") private Long pendencyId; @SerializedName("managerDeviceId") private Long managerDeviceId; @SerializedName("cardNumber") private Long cardNumber; @SerializedName("cardTechnology") private CardTechnologyEnum cardTechnology; @SerializedName("readerIdList") private List<Integer> readerIdList; @SerializedName("ownerType") private OwnerTypeEnum ownerType; @SerializedName("ownerId") private Long ownerId; @JsonAdapter(CardTechnologyEnum.Adapter.class) public enum CardTechnologyEnum { BARCODE_CARD("BARCODE_CARD"),
     RFID_CARD("RFID_CARD"),
     SMART_CARD("SMART_CARD"),
     QRCODE("QRCODE"); private String value; CardTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CardTechnologyEnum fromValue(String text) { byte b;
       int i;
       CardTechnologyEnum[] arrayOfCardTechnologyEnum;
       for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i; ) {
         CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b];
         if (String.valueOf(cardTechnologyEnum.value).equals(text))
           return cardTechnologyEnum; 
         b++;
       } 
       return null; } public static class Adapter extends TypeAdapter<CardTechnologyEnum> { public void write(JsonWriter jsonWriter, IncludeCardPendency.CardTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public IncludeCardPendency.CardTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
         return IncludeCardPendency.CardTechnologyEnum.fromValue(String.valueOf(value)); } } } public IncludeCardPendency() { this.pendencyId = null;
 
     
     this.managerDeviceId = null;
 
     
     this.cardNumber = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.cardTechnology = null;
 
     
     this.readerIdList = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.ownerType = null;
 
     
     this.ownerId = null; }
   
   public IncludeCardPendency pendencyId(Long pendencyId) {
     this.pendencyId = pendencyId;
     return this; } @JsonAdapter(OwnerTypeEnum.Adapter.class) public enum OwnerTypeEnum {
     PERSON("PERSON"), VEHICLE("VEHICLE"); private String value; OwnerTypeEnum(String value) { this.value = value; }
     public String getValue() { return this.value; }
     public String toString() { return String.valueOf(this.value); }
     public static OwnerTypeEnum fromValue(String text) { byte b; int i; OwnerTypeEnum[] arrayOfOwnerTypeEnum; for (i = (arrayOfOwnerTypeEnum = values()).length, b = 0; b < i; ) { OwnerTypeEnum ownerTypeEnum = arrayOfOwnerTypeEnum[b]; if (String.valueOf(ownerTypeEnum.value).equals(text))
           return ownerTypeEnum;  b++; }  return null; }
     public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
       public void write(JsonWriter jsonWriter, IncludeCardPendency.OwnerTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public IncludeCardPendency.OwnerTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return IncludeCardPendency.OwnerTypeEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Identificador da pendência") public Long getPendencyId() { return this.pendencyId; }
 
   
   public void setPendencyId(Long pendencyId) {
     this.pendencyId = pendencyId;
   }
   
   public IncludeCardPendency managerDeviceId(Long managerDeviceId) {
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
   
   public IncludeCardPendency cardNumber(Long cardNumber) {
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
   
   public IncludeCardPendency cardTechnology(CardTechnologyEnum cardTechnology) {
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
   
   public IncludeCardPendency readerIdList(List<Integer> readerIdList) {
     this.readerIdList = readerIdList;
     return this;
   }
   
   public IncludeCardPendency addReaderIdListItem(Integer readerIdListItem) {
     if (this.readerIdList == null) {
       this.readerIdList = new ArrayList<>();
     }
     this.readerIdList.add(readerIdListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista das leitoras onde o cartão possui permissão")
   public List<Integer> getReaderIdList() {
     return this.readerIdList;
   }
   
   public void setReaderIdList(List<Integer> readerIdList) {
     this.readerIdList = readerIdList;
   }
   
   public IncludeCardPendency ownerType(OwnerTypeEnum ownerType) {
     this.ownerType = ownerType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public OwnerTypeEnum getOwnerType() {
     return this.ownerType;
   }
   
   public void setOwnerType(OwnerTypeEnum ownerType) {
     this.ownerType = ownerType;
   }
   
   public IncludeCardPendency ownerId(Long ownerId) {
     this.ownerId = ownerId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do proprietário da credencial (pessoa ou veículo)")
   public Long getOwnerId() {
     return this.ownerId;
   }
   
   public void setOwnerId(Long ownerId) {
     this.ownerId = ownerId;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     IncludeCardPendency includeCardPendency = (IncludeCardPendency)o;
     return (Objects.equals(this.pendencyId, includeCardPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, includeCardPendency.managerDeviceId) && 
       Objects.equals(this.cardNumber, includeCardPendency.cardNumber) && 
       Objects.equals(this.cardTechnology, includeCardPendency.cardTechnology) && 
       Objects.equals(this.readerIdList, includeCardPendency.readerIdList) && 
       Objects.equals(this.ownerType, includeCardPendency.ownerType) && 
       Objects.equals(this.ownerId, includeCardPendency.ownerId));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.cardNumber, this.cardTechnology, this.readerIdList, this.ownerType, this.ownerId });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class IncludeCardPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
     sb.append("    readerIdList: ").append(toIndentedString(this.readerIdList)).append("\n");
     sb.append("    ownerType: ").append(toIndentedString(this.ownerType)).append("\n");
     sb.append("    ownerId: ").append(toIndentedString(this.ownerId)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\IncludeCardPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */