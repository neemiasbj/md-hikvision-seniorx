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

/**
 * InputDevice
 */

public class InputDevice {
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

  @SerializedName("activationDelay")
  private Integer activationDelay = null;

  @SerializedName("masking")
  private List<Masking> masking = null;

  @SerializedName("activations")
  private List<InputActivation> activations = null;

  @SerializedName("extensibleConfiguration")
  private ExtensibleConfiguration extensibleConfiguration = null;

  public InputDevice id(Long id) {
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

  public InputDevice areaId(Long areaId) {
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

  public InputDevice address(Integer address) {
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

  public InputDevice defaultState(DefaultStateEnum defaultState) {
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

  public InputDevice activationDelay(Integer activationDelay) {
    this.activationDelay = activationDelay;
    return this;
  }

   /**
   * Atraso de ativação
   * @return activationDelay
  **/
  @Schema(description  = "Atraso de ativação")
  public Integer getActivationDelay() {
    return activationDelay;
  }

  public void setActivationDelay(Integer activationDelay) {
    this.activationDelay = activationDelay;
  }

  public InputDevice masking(List<Masking> masking) {
    this.masking = masking;
    return this;
  }

  public InputDevice addMaskingItem(Masking maskingItem) {
    if (this.masking == null) {
      this.masking = new ArrayList<Masking>();
    }
    this.masking.add(maskingItem);
    return this;
  }

   /**
   * Máscaras
   * @return masking
  **/
  @Schema(description  = "Máscaras")
  public List<Masking> getMasking() {
    return masking;
  }

  public void setMasking(List<Masking> masking) {
    this.masking = masking;
  }

  public InputDevice activations(List<InputActivation> activations) {
    this.activations = activations;
    return this;
  }

  public InputDevice addActivationsItem(InputActivation activationsItem) {
    if (this.activations == null) {
      this.activations = new ArrayList<InputActivation>();
    }
    this.activations.add(activationsItem);
    return this;
  }

   /**
   * Entradas ativas
   * @return activations
  **/
  @Schema(description  = "Entradas ativas")
  public List<InputActivation> getActivations() {
    return activations;
  }

  public void setActivations(List<InputActivation> activations) {
    this.activations = activations;
  }

  public InputDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
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
    InputDevice inputDevice = (InputDevice) o;
    return Objects.equals(this.id, inputDevice.id) &&
        Objects.equals(this.areaId, inputDevice.areaId) &&
        Objects.equals(this.address, inputDevice.address) &&
        Objects.equals(this.defaultState, inputDevice.defaultState) &&
        Objects.equals(this.activationDelay, inputDevice.activationDelay) &&
        Objects.equals(this.masking, inputDevice.masking) &&
        Objects.equals(this.activations, inputDevice.activations) &&
        Objects.equals(this.extensibleConfiguration, inputDevice.extensibleConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, areaId, address, defaultState, activationDelay, masking, activations, extensibleConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDevice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    defaultState: ").append(toIndentedString(defaultState)).append("\n");
    sb.append("    activationDelay: ").append(toIndentedString(activationDelay)).append("\n");
    sb.append("    masking: ").append(toIndentedString(masking)).append("\n");
    sb.append("    activations: ").append(toIndentedString(activations)).append("\n");
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

