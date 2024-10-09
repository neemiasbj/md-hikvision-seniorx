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
 * OutputDevice
 */

public class OutputDevice {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("areaId")
  private Long areaId = null;

  @SerializedName("address")
  private Integer address = null;

  /**
   * Gets or Sets defaultState
   */
  @JsonAdapter(DefaultStateEnum.Adapter.class)
  public enum DefaultStateEnum {
    INACTIVE("INACTIVE"),
    
    ACTIVE("ACTIVE");

    private String value;

    DefaultStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultStateEnum fromValue(String text) {
      for (DefaultStateEnum b : DefaultStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DefaultStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DefaultStateEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("defaultState")
  private DefaultStateEnum defaultState = null;

  @SerializedName("extensibleConfiguration")
  private ExtensibleConfiguration extensibleConfiguration = null;

  public OutputDevice id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador do dispositivo
   * @return id
  **/
  @Schema(description  = "Identificador do dispositivo")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OutputDevice areaId(Long areaId) {
    this.areaId = areaId;
    return this;
  }

   /**
   * Identificador da área
   * @return areaId
  **/
  @Schema(description  = "Identificador da área")
  public Long getAreaId() {
    return areaId;
  }

  public void setAreaId(Long areaId) {
    this.areaId = areaId;
  }

  public OutputDevice address(Integer address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @Schema(description  = "Endereço")
  public Integer getAddress() {
    return address;
  }

  public void setAddress(Integer address) {
    this.address = address;
  }

  public OutputDevice defaultState(DefaultStateEnum defaultState) {
    this.defaultState = defaultState;
    return this;
  }

   /**
   * Get defaultState
   * @return defaultState
  **/
  @Schema(description  = "")
  public DefaultStateEnum getDefaultState() {
    return defaultState;
  }

  public void setDefaultState(DefaultStateEnum defaultState) {
    this.defaultState = defaultState;
  }

  public OutputDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
    return this;
  }

   /**
   * Get extensibleConfiguration
   * @return extensibleConfiguration
  **/
  @Schema(description  = "")
  public ExtensibleConfiguration getExtensibleConfiguration() {
    return extensibleConfiguration;
  }

  public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputDevice outputDevice = (OutputDevice) o;
    return Objects.equals(this.id, outputDevice.id) &&
        Objects.equals(this.areaId, outputDevice.areaId) &&
        Objects.equals(this.address, outputDevice.address) &&
        Objects.equals(this.defaultState, outputDevice.defaultState) &&
        Objects.equals(this.extensibleConfiguration, outputDevice.extensibleConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, areaId, address, defaultState, extensibleConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputDevice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    defaultState: ").append(toIndentedString(defaultState)).append("\n");
    sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
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

