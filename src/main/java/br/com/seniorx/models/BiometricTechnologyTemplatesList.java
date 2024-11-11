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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class BiometricTechnologyTemplatesList
 {
   @SerializedName("manufacturer")
   private ManufacturerEnum manufacturer;
   @SerializedName("biometrySecurityLevel")
   private Integer biometrySecurityLevel;
   @SerializedName("templates")
   private List<String> templates;
   
   public BiometricTechnologyTemplatesList() {
     this.manufacturer = null;
 
     
     this.biometrySecurityLevel = null;
 
     
     this.templates = null;
   }
   
   public BiometricTechnologyTemplatesList manufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer;
     return this; }
 
 
 
 
 
 
   
   @Schema(description = "")
   public ManufacturerEnum getManufacturer() {
     return this.manufacturer;
   }
   @JsonAdapter(ManufacturerEnum.Adapter.class) public enum ManufacturerEnum {
     NONE("NONE"), FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"), FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"), FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"), FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"), FINGERPRINT_CAMA("FINGERPRINT_CAMA"), FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"), HANDKEY_IR("HANDKEY_IR"), FACIAL("FACIAL"), FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"), FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"), FACIAL_VISICA("FACIAL_VISICA"), FINGERPRINT_DIXI("FINGERPRINT_DIXI"), FACIAL_DIXI("FACIAL_DIXI"), FACIAL_HENRY("FACIAL_HENRY"); private String value; ManufacturerEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ManufacturerEnum fromValue(String text) { byte b; int i; ManufacturerEnum[] arrayOfManufacturerEnum; for (i = (arrayOfManufacturerEnum = values()).length, b = 0; b < i; ) { ManufacturerEnum manufacturerEnum = arrayOfManufacturerEnum[b]; if (String.valueOf(manufacturerEnum.value).equals(text)) return manufacturerEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<ManufacturerEnum> {
       public void write(JsonWriter jsonWriter, BiometricTechnologyTemplatesList.ManufacturerEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public BiometricTechnologyTemplatesList.ManufacturerEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return BiometricTechnologyTemplatesList.ManufacturerEnum.fromValue(String.valueOf(value)); } } } public void setManufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer; }
 
   
   public BiometricTechnologyTemplatesList biometrySecurityLevel(Integer biometrySecurityLevel) {
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
   
   public BiometricTechnologyTemplatesList templates(List<String> templates) {
     this.templates = templates;
     return this;
   }
   
   public BiometricTechnologyTemplatesList addTemplatesItem(String templatesItem) {
     if (this.templates == null) {
       this.templates = new ArrayList<>();
     }
     this.templates.add(templatesItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Codificado em base64")
   public List<String> getTemplates() {
     return this.templates;
   }
   
   public void setTemplates(List<String> templates) {
     this.templates = templates;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     BiometricTechnologyTemplatesList biometricTechnologyTemplatesList = (BiometricTechnologyTemplatesList)o;
     return (Objects.equals(this.manufacturer, biometricTechnologyTemplatesList.manufacturer) && 
       Objects.equals(this.biometrySecurityLevel, biometricTechnologyTemplatesList.biometrySecurityLevel) && 
       Objects.equals(this.templates, biometricTechnologyTemplatesList.templates));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.manufacturer, this.biometrySecurityLevel, this.templates });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class BiometricTechnologyTemplatesList {\n");
     
     sb.append("    manufacturer: ").append(toIndentedString(this.manufacturer)).append("\n");
     sb.append("    biometrySecurityLevel: ").append(toIndentedString(this.biometrySecurityLevel)).append("\n");
     sb.append("    templates: ").append(toIndentedString(this.templates)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\BiometricTechnologyTemplatesList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */