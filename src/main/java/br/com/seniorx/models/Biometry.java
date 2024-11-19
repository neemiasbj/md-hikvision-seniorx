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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class Biometry
 {
   @SerializedName("manufacturer")
   private ManufacturerEnum manufacturer;
   @SerializedName("biometrySecurityLevel")
   private Integer biometrySecurityLevel;
   @SerializedName("templateList")
   private List<String> templateList;
   
   public Biometry() {
     this.manufacturer = null;
 
     
     this.biometrySecurityLevel = null;
 
     
     this.templateList = null;
   }
   
   public Biometry manufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer;
     return this; }
 
 
 
 
 
 
   
   @Schema(description = "")
   public ManufacturerEnum getManufacturer() {
     return this.manufacturer;
   }
   @JsonAdapter(ManufacturerEnum.Adapter.class) public enum ManufacturerEnum {
     NONE("NONE"), FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"), FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"), FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"), FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"), FINGERPRINT_CAMA("FINGERPRINT_CAMA"), FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"), HANDKEY_IR("HANDKEY_IR"), FACIAL("FACIAL"), FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"), FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"), FACIAL_VISICA("FACIAL_VISICA"), FINGERPRINT_DIXI("FINGERPRINT_DIXI"), FACIAL_DIXI("FACIAL_DIXI"), FACIAL_HENRY("FACIAL_HENRY"); private String value; ManufacturerEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ManufacturerEnum fromValue(String text) { byte b; int i; ManufacturerEnum[] arrayOfManufacturerEnum; for (i = (arrayOfManufacturerEnum = values()).length, b = 0; b < i; ) { ManufacturerEnum manufacturerEnum = arrayOfManufacturerEnum[b]; if (String.valueOf(manufacturerEnum.value).equals(text)) return manufacturerEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<ManufacturerEnum> {
       public void write(JsonWriter jsonWriter, Biometry.ManufacturerEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Biometry.ManufacturerEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Biometry.ManufacturerEnum.fromValue(String.valueOf(value)); } } } public void setManufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer; }
 
   
   public Biometry biometrySecurityLevel(Integer biometrySecurityLevel) {
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
   
   public Biometry templateList(List<String> templateList) {
     this.templateList = templateList;
     return this;
   }
   
   public Biometry addTemplateListItem(String templateListItem) {
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
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Biometry biometry = (Biometry)o;
     return (Objects.equals(this.manufacturer, biometry.manufacturer) && 
       Objects.equals(this.biometrySecurityLevel, biometry.biometrySecurityLevel) && 
       Objects.equals(this.templateList, biometry.templateList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.manufacturer, this.biometrySecurityLevel, this.templateList });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Biometry {\n");
     
     sb.append("    manufacturer: ").append(toIndentedString(this.manufacturer)).append("\n");
     sb.append("    biometrySecurityLevel: ").append(toIndentedString(this.biometrySecurityLevel)).append("\n");
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


