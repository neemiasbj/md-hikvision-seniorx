 package br.com.seniorx.models;
import java.io.IOException;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 
 import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class OutputDevice {
   @SerializedName("id")
   private Long id;
   @SerializedName("areaId")
   private Long areaId;
   @SerializedName("address")
   private Integer address;
   @SerializedName("defaultState")
   private DefaultStateEnum defaultState;
   @SerializedName("extensibleConfiguration")
   private ExtensibleConfiguration extensibleConfiguration;
   
   public OutputDevice() { this.id = null;
 
     
     this.areaId = null;
 
     
     this.address = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.defaultState = null;
 
     
     this.extensibleConfiguration = null; }
 
   
   public OutputDevice id(Long id) { this.id = id;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getId() {
     return this.id;
   }
   @JsonAdapter(DefaultStateEnum.Adapter.class) public enum DefaultStateEnum {
     INACTIVE("INACTIVE"), ACTIVE("ACTIVE"); private String value; DefaultStateEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static DefaultStateEnum fromValue(String text) { byte b; int i; DefaultStateEnum[] arrayOfDefaultStateEnum; for (i = (arrayOfDefaultStateEnum = values()).length, b = 0; b < i; ) { DefaultStateEnum defaultStateEnum = arrayOfDefaultStateEnum[b]; if (String.valueOf(defaultStateEnum.value).equals(text)) return defaultStateEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<DefaultStateEnum> {
       public void write(JsonWriter jsonWriter, OutputDevice.DefaultStateEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public OutputDevice.DefaultStateEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return OutputDevice.DefaultStateEnum.fromValue(String.valueOf(value)); } } } public void setId(Long id) { this.id = id; }
 
   
   public OutputDevice areaId(Long areaId) {
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
   
   public OutputDevice address(Integer address) {
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
   
   public OutputDevice defaultState(DefaultStateEnum defaultState) {
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
   
   public OutputDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
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
     OutputDevice outputDevice = (OutputDevice)o;
     return (Objects.equals(this.id, outputDevice.id) && 
       Objects.equals(this.areaId, outputDevice.areaId) && 
       Objects.equals(this.address, outputDevice.address) && 
       Objects.equals(this.defaultState, outputDevice.defaultState) && 
       Objects.equals(this.extensibleConfiguration, outputDevice.extensibleConfiguration));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.areaId, this.address, this.defaultState, this.extensibleConfiguration });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class OutputDevice {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
     sb.append("    address: ").append(toIndentedString(this.address)).append("\n");
     sb.append("    defaultState: ").append(toIndentedString(this.defaultState)).append("\n");
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\OutputDevice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */