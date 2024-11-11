 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class DatamartUpdatedPendency {
   @SerializedName("pendencyId")
   private Long pendencyId;
   @SerializedName("driverId")
   private Long driverId;
   @SerializedName("datamartObjectType")
   private DatamartObjectTypeEnum datamartObjectType;
   
   public DatamartUpdatedPendency() { this.pendencyId = null;
 
     
     this.driverId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.datamartObjectType = null; }
 
   
   public DatamartUpdatedPendency pendencyId(Long pendencyId) { this.pendencyId = pendencyId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador da pendência")
   public Long getPendencyId() {
     return this.pendencyId;
   }
   @JsonAdapter(DatamartObjectTypeEnum.Adapter.class) public enum DatamartObjectTypeEnum {
     HOLIDAY("HOLIDAY"), TIMEZONE("TIMEZONE"), ACCESS_LEVEL("ACCESS_LEVEL"), AREA_CONTROLLED("AREA_CONTROLLED"), CARD_FORMAT("CARD_FORMAT"); private String value; DatamartObjectTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static DatamartObjectTypeEnum fromValue(String text) { byte b; int i; DatamartObjectTypeEnum[] arrayOfDatamartObjectTypeEnum; for (i = (arrayOfDatamartObjectTypeEnum = values()).length, b = 0; b < i; ) { DatamartObjectTypeEnum datamartObjectTypeEnum = arrayOfDatamartObjectTypeEnum[b]; if (String.valueOf(datamartObjectTypeEnum.value).equals(text)) return datamartObjectTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<DatamartObjectTypeEnum> {
       public void write(JsonWriter jsonWriter, DatamartUpdatedPendency.DatamartObjectTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public DatamartUpdatedPendency.DatamartObjectTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return DatamartUpdatedPendency.DatamartObjectTypeEnum.fromValue(String.valueOf(value)); } } } public void setPendencyId(Long pendencyId) { this.pendencyId = pendencyId; }
 
   
   public DatamartUpdatedPendency driverId(Long driverId) {
     this.driverId = driverId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do driver")
   public Long getDriverId() {
     return this.driverId;
   }
   
   public void setDriverId(Long driverId) {
     this.driverId = driverId;
   }
   
   public DatamartUpdatedPendency datamartObjectType(DatamartObjectTypeEnum datamartObjectType) {
     this.datamartObjectType = datamartObjectType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public DatamartObjectTypeEnum getDatamartObjectType() {
     return this.datamartObjectType;
   }
   
   public void setDatamartObjectType(DatamartObjectTypeEnum datamartObjectType) {
     this.datamartObjectType = datamartObjectType;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DatamartUpdatedPendency datamartUpdatedPendency = (DatamartUpdatedPendency)o;
     return (Objects.equals(this.pendencyId, datamartUpdatedPendency.pendencyId) && 
       Objects.equals(this.driverId, datamartUpdatedPendency.driverId) && 
       Objects.equals(this.datamartObjectType, datamartUpdatedPendency.datamartObjectType));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.driverId, this.datamartObjectType });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DatamartUpdatedPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    driverId: ").append(toIndentedString(this.driverId)).append("\n");
     sb.append("    datamartObjectType: ").append(toIndentedString(this.datamartObjectType)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DatamartUpdatedPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */