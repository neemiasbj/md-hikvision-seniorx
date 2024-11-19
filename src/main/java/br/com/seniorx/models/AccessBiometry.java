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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class AccessBiometry
 {
   @SerializedName("manufacturer")
   private ManufacturerEnum manufacturer;
   @SerializedName("biometrySecurityLevel")
   private Integer biometrySecurityLevel;
   @SerializedName("templateList")
   private List<String> templateList;
   @SerializedName("personId")
   private Long personId;
   @SerializedName("cardList")
   private List<CardAndTechnology> cardList;
   
   public AccessBiometry() {
     this.manufacturer = null;
 
     
     this.biometrySecurityLevel = null;
 
     
     this.templateList = null;
 
     
     this.personId = null;
 
     
     this.cardList = null;
   }
   
   public AccessBiometry manufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer;
     return this; }
 
 
 
 
 
 
   
   public ManufacturerEnum getManufacturer() {
     return this.manufacturer;
   }
   @JsonAdapter(ManufacturerEnum.Adapter.class) public enum ManufacturerEnum {
     NONE("NONE"), FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"), FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"), FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"), FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"), FINGERPRINT_CAMA("FINGERPRINT_CAMA"), FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"), HANDKEY_IR("HANDKEY_IR"), FACIAL("FACIAL"), FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"), FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"), FACIAL_VISICA("FACIAL_VISICA"), FINGERPRINT_DIXI("FINGERPRINT_DIXI"), FACIAL_DIXI("FACIAL_DIXI"), FACIAL_HENRY("FACIAL_HENRY"); private String value; ManufacturerEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ManufacturerEnum fromValue(String text) { byte b; int i; ManufacturerEnum[] arrayOfManufacturerEnum; for (i = (arrayOfManufacturerEnum = values()).length, b = 0; b < i; ) { ManufacturerEnum manufacturerEnum = arrayOfManufacturerEnum[b]; if (String.valueOf(manufacturerEnum.value).equals(text)) return manufacturerEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<ManufacturerEnum> {
       public void write(JsonWriter jsonWriter, AccessBiometry.ManufacturerEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public AccessBiometry.ManufacturerEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return AccessBiometry.ManufacturerEnum.fromValue(String.valueOf(value)); } } } public void setManufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer; }
 
   
   public AccessBiometry biometrySecurityLevel(Integer biometrySecurityLevel) {
     this.biometrySecurityLevel = biometrySecurityLevel;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Nível de segurança biométrica")
   public Integer getBiometrySecurityLevel() {
     return this.biometrySecurityLevel;
   }
   
   public void setBiometrySecurityLevel(Integer biometrySecurityLevel) {
     this.biometrySecurityLevel = biometrySecurityLevel;
   }
   
   public AccessBiometry templateList(List<String> templateList) {
     this.templateList = templateList;
     return this;
   }
   
   public AccessBiometry addTemplateListItem(String templateListItem) {
     if (this.templateList == null) {
       this.templateList = new ArrayList<>();
     }
     this.templateList.add(templateListItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Caracteres codificados em base64")
   public List<String> getTemplateList() {
     return this.templateList;
   }
   
   public void setTemplateList(List<String> templateList) {
     this.templateList = templateList;
   }
   
   public AccessBiometry personId(Long personId) {
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
   
   public AccessBiometry cardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
     return this;
   }
   
   public AccessBiometry addCardListItem(CardAndTechnology cardListItem) {
     if (this.cardList == null) {
       this.cardList = new ArrayList<>();
     }
     this.cardList.add(cardListItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Lista de cartões")
   public List<CardAndTechnology> getCardList() {
     return this.cardList;
   }
   
   public void setCardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     AccessBiometry accessBiometry = (AccessBiometry)o;
     return (Objects.equals(this.manufacturer, accessBiometry.manufacturer) && 
       Objects.equals(this.biometrySecurityLevel, accessBiometry.biometrySecurityLevel) && 
       Objects.equals(this.templateList, accessBiometry.templateList) && 
       Objects.equals(this.personId, accessBiometry.personId) && 
       Objects.equals(this.cardList, accessBiometry.cardList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.manufacturer, this.biometrySecurityLevel, this.templateList, this.personId, this.cardList });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class AccessBiometry {\n");
     
     sb.append("    manufacturer: ").append(toIndentedString(this.manufacturer)).append("\n");
     sb.append("    biometrySecurityLevel: ").append(toIndentedString(this.biometrySecurityLevel)).append("\n");
     sb.append("    templateList: ").append(toIndentedString(this.templateList)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    cardList: ").append(toIndentedString(this.cardList)).append("\n");
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


