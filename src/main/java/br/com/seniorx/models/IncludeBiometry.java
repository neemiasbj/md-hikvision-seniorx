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

import io.swagger.annotations.ApiModelProperty;

/**
 * IncludeBiometry
 */

public class IncludeBiometry {
  /**
   * Gets or Sets origin
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    PERSON("PERSON"),
    
    CARD("CARD"),
    
    PIS("PIS"),
    
    CPF("CPF");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String text) {
      for (OriginEnum b : OriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OriginEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("origin")
  private OriginEnum origin = null;

  @SerializedName("originId")
  private Long originId = null;

  /**
   * Gets or Sets manufacturer
   */
  @JsonAdapter(ManufacturerEnum.Adapter.class)
  public enum ManufacturerEnum {
    NONE("NONE"),
    
    FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"),
    
    FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"),
    
    FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"),
    
    FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"),
    
    FINGERPRINT_CAMA("FINGERPRINT_CAMA"),
    
    FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"),
    
    HANDKEY_IR("HANDKEY_IR"),
    
    FACIAL("FACIAL"),
    
    FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"),
    
    FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"),
    
    FACIAL_VISICA("FACIAL_VISICA"),
    
    FINGERPRINT_DIXI("FINGERPRINT_DIXI"),
    
    FACIAL_DIXI("FACIAL_DIXI"),
    
    FACIAL_HENRY("FACIAL_HENRY");

    private String value;

    ManufacturerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ManufacturerEnum fromValue(String text) {
      for (ManufacturerEnum b : ManufacturerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ManufacturerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ManufacturerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ManufacturerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ManufacturerEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("manufacturer")
  private ManufacturerEnum manufacturer = null;

  @SerializedName("templateList")
  private List<String> templateList = null;

  public IncludeBiometry origin(OriginEnum origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public OriginEnum getOrigin() {
    return origin;
  }

  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }

  public IncludeBiometry originId(Long originId) {
    this.originId = originId;
    return this;
  }

   /**
   * Identificador da origem do cadastro biométrico
   * @return originId
  **/
  @ApiModelProperty(value = "Identificador da origem do cadastro biométrico")
  public Long getOriginId() {
    return originId;
  }

  public void setOriginId(Long originId) {
    this.originId = originId;
  }

  public IncludeBiometry manufacturer(ManufacturerEnum manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @ApiModelProperty(value = "")
  public ManufacturerEnum getManufacturer() {
    return manufacturer;
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
      this.templateList = new ArrayList<String>();
    }
    this.templateList.add(templateListItem);
    return this;
  }

   /**
   * Codificado em base64
   * @return templateList
  **/
  @ApiModelProperty(value = "Codificado em base64")
  public List<String> getTemplateList() {
    return templateList;
  }

  public void setTemplateList(List<String> templateList) {
    this.templateList = templateList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludeBiometry includeBiometry = (IncludeBiometry) o;
    return Objects.equals(this.origin, includeBiometry.origin) &&
        Objects.equals(this.originId, includeBiometry.originId) &&
        Objects.equals(this.manufacturer, includeBiometry.manufacturer) &&
        Objects.equals(this.templateList, includeBiometry.templateList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, originId, manufacturer, templateList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludeBiometry {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    templateList: ").append(toIndentedString(templateList)).append("\n");
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

