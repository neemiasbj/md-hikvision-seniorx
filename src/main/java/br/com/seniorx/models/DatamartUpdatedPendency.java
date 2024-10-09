package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DatamartUpdatedPendency
 */

public class DatamartUpdatedPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("driverId")
  private Long driverId = null;

  /**
   * Gets or Sets datamartObjectType
   */
  @JsonAdapter(DatamartObjectTypeEnum.Adapter.class)
  public enum DatamartObjectTypeEnum {
    HOLIDAY("HOLIDAY"),
    
    TIMEZONE("TIMEZONE"),
    
    ACCESS_LEVEL("ACCESS_LEVEL"),
    
    AREA_CONTROLLED("AREA_CONTROLLED"),
    
    CARD_FORMAT("CARD_FORMAT");

    private String value;

    DatamartObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DatamartObjectTypeEnum fromValue(String text) {
      for (DatamartObjectTypeEnum b : DatamartObjectTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DatamartObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DatamartObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DatamartObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DatamartObjectTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("datamartObjectType")
  private DatamartObjectTypeEnum datamartObjectType = null;

  public DatamartUpdatedPendency pendencyId(Long pendencyId) {
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

  public DatamartUpdatedPendency driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * Identificador do driver
   * @return driverId
  **/
  @Schema(description  = "Identificador do driver")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DatamartUpdatedPendency datamartObjectType(DatamartObjectTypeEnum datamartObjectType) {
    this.datamartObjectType = datamartObjectType;
    return this;
  }

   /**
   * Get datamartObjectType
   * @return datamartObjectType
  **/
  @Schema(description  = "")
  public DatamartObjectTypeEnum getDatamartObjectType() {
    return datamartObjectType;
  }

  public void setDatamartObjectType(DatamartObjectTypeEnum datamartObjectType) {
    this.datamartObjectType = datamartObjectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatamartUpdatedPendency datamartUpdatedPendency = (DatamartUpdatedPendency) o;
    return Objects.equals(this.pendencyId, datamartUpdatedPendency.pendencyId) &&
        Objects.equals(this.driverId, datamartUpdatedPendency.driverId) &&
        Objects.equals(this.datamartObjectType, datamartUpdatedPendency.datamartObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, driverId, datamartObjectType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatamartUpdatedPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    datamartObjectType: ").append(toIndentedString(datamartObjectType)).append("\n");
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

