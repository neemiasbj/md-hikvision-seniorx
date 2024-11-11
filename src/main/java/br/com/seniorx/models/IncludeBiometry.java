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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class IncludeBiometry
 {
   @SerializedName("origin")
   private OriginEnum origin;
   @SerializedName("originId")
   private Long originId;
   @SerializedName("manufacturer")
   private ManufacturerEnum manufacturer;
   @SerializedName("templateList")
   private List<String> templateList;
   
   public IncludeBiometry() {
     this.origin = null;
 
     
     this.originId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.manufacturer = null;
 
     
     this.templateList = null;
   } @JsonAdapter(OriginEnum.Adapter.class) public enum OriginEnum {
     PERSON("PERSON"), CARD("CARD"), PIS("PIS"), CPF("CPF"); private String value; OriginEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static OriginEnum fromValue(String text) { byte b; int i; OriginEnum[] arrayOfOriginEnum; for (i = (arrayOfOriginEnum = values()).length, b = 0; b < i; ) { OriginEnum originEnum = arrayOfOriginEnum[b]; if (String.valueOf(originEnum.value).equals(text)) return originEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<OriginEnum> {
       public void write(JsonWriter jsonWriter, IncludeBiometry.OriginEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public IncludeBiometry.OriginEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return IncludeBiometry.OriginEnum.fromValue(String.valueOf(value)); } } } public IncludeBiometry origin(OriginEnum origin) { this.origin = origin;
     return this; }
 
 
 
 
 
   
   @Schema(description = "")
   public OriginEnum getOrigin() {
     return this.origin;
   }
   @JsonAdapter(ManufacturerEnum.Adapter.class) public enum ManufacturerEnum {
     NONE("NONE"), FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"), FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"), FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"), FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"), FINGERPRINT_CAMA("FINGERPRINT_CAMA"), FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"), HANDKEY_IR("HANDKEY_IR"), FACIAL("FACIAL"), FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"), FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"), FACIAL_VISICA("FACIAL_VISICA"), FINGERPRINT_DIXI("FINGERPRINT_DIXI"), FACIAL_DIXI("FACIAL_DIXI"), FACIAL_HENRY("FACIAL_HENRY"); private String value; ManufacturerEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ManufacturerEnum fromValue(String text) { byte b; int i; ManufacturerEnum[] arrayOfManufacturerEnum; for (i = (arrayOfManufacturerEnum = values()).length, b = 0; b < i; ) { ManufacturerEnum manufacturerEnum = arrayOfManufacturerEnum[b]; if (String.valueOf(manufacturerEnum.value).equals(text)) return manufacturerEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<ManufacturerEnum> {
       public void write(JsonWriter jsonWriter, IncludeBiometry.ManufacturerEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public IncludeBiometry.ManufacturerEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return IncludeBiometry.ManufacturerEnum.fromValue(String.valueOf(value)); } } } public void setOrigin(OriginEnum origin) { this.origin = origin; }
 
   
   public IncludeBiometry originId(Long originId) {
     this.originId = originId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da origem do cadastro biométrico")
   public Long getOriginId() {
     return this.originId;
   }
   
   public void setOriginId(Long originId) {
     this.originId = originId;
   }
   
   public IncludeBiometry manufacturer(ManufacturerEnum manufacturer) {
     this.manufacturer = manufacturer;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public ManufacturerEnum getManufacturer() {
     return this.manufacturer;
   }
   
   public void setManufacturer(ManufacturerEnum manufacturer) {
     this.manufacturer = manufacturer;
   }
   
   public IncludeBiometry templateList(List<String> templateList) {
     this.templateList = templateList;
     return this;
   }
   
   public IncludeBiometry addTemplateListItem(String templateListItem) {
     if (this.templateList == null) {
       this.templateList = new ArrayList<>();
     }
     this.templateList.add(templateListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Codificado em base64")
   public List<String> getTemplateList() {
     return this.templateList;
   }
   
   public void setTemplateList(List<String> templateList) {
     this.templateList = templateList;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     IncludeBiometry includeBiometry = (IncludeBiometry)o;
     return (Objects.equals(this.origin, includeBiometry.origin) && 
       Objects.equals(this.originId, includeBiometry.originId) && 
       Objects.equals(this.manufacturer, includeBiometry.manufacturer) && 
       Objects.equals(this.templateList, includeBiometry.templateList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.origin, this.originId, this.manufacturer, this.templateList });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class IncludeBiometry {\n");
     
     sb.append("    origin: ").append(toIndentedString(this.origin)).append("\n");
     sb.append("    originId: ").append(toIndentedString(this.originId)).append("\n");
     sb.append("    manufacturer: ").append(toIndentedString(this.manufacturer)).append("\n");
     sb.append("    templateList: ").append(toIndentedString(this.templateList)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\IncludeBiometry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */