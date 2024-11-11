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

<<<<<<< HEAD
 
 
 public class InputDevice {
   @SerializedName("id")
   private Long id;
   @SerializedName("areaId")
   private Long areaId;
   @SerializedName("address")
   private Integer address;
   @SerializedName("defaultState")
   private DefaultStateEnum defaultState;
   @SerializedName("activationDelay")
   private Integer activationDelay;
   @SerializedName("masking")
   private List<Masking> masking;
   @SerializedName("activations")
   private List<InputActivation> activations;
   @SerializedName("extensibleConfiguration")
   private ExtensibleConfiguration extensibleConfiguration;
   
   public InputDevice() { this.id = null;
 
     
     this.areaId = null;
 
     
     this.address = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.defaultState = null;
 
     
     this.activationDelay = null;
 
     
     this.masking = null;
 
     
     this.activations = null;
 
     
     this.extensibleConfiguration = null; }
 
   
   public InputDevice id(Long id) { this.id = id;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getId() {
     return this.id;
   }
   @JsonAdapter(DefaultStateEnum.Adapter.class) public enum DefaultStateEnum {
     INACTIVE("INACTIVE"), ACTIVE("ACTIVE"); private String value; DefaultStateEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static DefaultStateEnum fromValue(String text) { byte b; int i; DefaultStateEnum[] arrayOfDefaultStateEnum; for (i = (arrayOfDefaultStateEnum = values()).length, b = 0; b < i; ) { DefaultStateEnum defaultStateEnum = arrayOfDefaultStateEnum[b]; if (String.valueOf(defaultStateEnum.value).equals(text)) return defaultStateEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<DefaultStateEnum> {
       public void write(JsonWriter jsonWriter, InputDevice.DefaultStateEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public InputDevice.DefaultStateEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return InputDevice.DefaultStateEnum.fromValue(String.valueOf(value)); } } } public void setId(Long id) { this.id = id; }
 
   
   public InputDevice areaId(Long areaId) {
     this.areaId = areaId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da área")
   public Long getAreaId() {
     return this.areaId;
   }
   
   public void setAreaId(Long areaId) {
     this.areaId = areaId;
   }
   
   public InputDevice address(Integer address) {
     this.address = address;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Endereço")
   public Integer getAddress() {
     return this.address;
   }
   
   public void setAddress(Integer address) {
     this.address = address;
   }
   
   public InputDevice defaultState(DefaultStateEnum defaultState) {
     this.defaultState = defaultState;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public DefaultStateEnum getDefaultState() {
     return this.defaultState;
   }
   
   public void setDefaultState(DefaultStateEnum defaultState) {
     this.defaultState = defaultState;
   }
   
   public InputDevice activationDelay(Integer activationDelay) {
     this.activationDelay = activationDelay;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Atraso de ativação")
   public Integer getActivationDelay() {
     return this.activationDelay;
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
       this.masking = new ArrayList<>();
     }
     this.masking.add(maskingItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Máscaras")
   public List<Masking> getMasking() {
     return this.masking;
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
       this.activations = new ArrayList<>();
     }
     this.activations.add(activationsItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Entradas ativas")
   public List<InputActivation> getActivations() {
     return this.activations;
   }
   
   public void setActivations(List<InputActivation> activations) {
     this.activations = activations;
   }
   
   public InputDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
     this.extensibleConfiguration = extensibleConfiguration;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public ExtensibleConfiguration getExtensibleConfiguration() {
     return this.extensibleConfiguration;
   }
   
   public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
     this.extensibleConfiguration = extensibleConfiguration;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     InputDevice inputDevice = (InputDevice)o;
     return (Objects.equals(this.id, inputDevice.id) && 
       Objects.equals(this.areaId, inputDevice.areaId) && 
       Objects.equals(this.address, inputDevice.address) && 
       Objects.equals(this.defaultState, inputDevice.defaultState) && 
       Objects.equals(this.activationDelay, inputDevice.activationDelay) && 
       Objects.equals(this.masking, inputDevice.masking) && 
       Objects.equals(this.activations, inputDevice.activations) && 
       Objects.equals(this.extensibleConfiguration, inputDevice.extensibleConfiguration));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.areaId, this.address, this.defaultState, this.activationDelay, this.masking, this.activations, this.extensibleConfiguration });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class InputDevice {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
     sb.append("    address: ").append(toIndentedString(this.address)).append("\n");
     sb.append("    defaultState: ").append(toIndentedString(this.defaultState)).append("\n");
     sb.append("    activationDelay: ").append(toIndentedString(this.activationDelay)).append("\n");
     sb.append("    masking: ").append(toIndentedString(this.masking)).append("\n");
     sb.append("    activations: ").append(toIndentedString(this.activations)).append("\n");
     sb.append("    extensibleConfiguration: ").append(toIndentedString(this.extensibleConfiguration)).append("\n");
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
=======
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\InputDevice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */