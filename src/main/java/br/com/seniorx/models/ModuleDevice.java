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
 * ModuleDevice
 */

public class ModuleDevice {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("areaId")
  private Long areaId = null;

  /**
   * Gets or Sets deviceType
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    AAN_32("AAN_32"),
    
    AAN_100("AAN_100"),
    
    AIO_168("AIO_168"),
    
    AIM_2SL("AIM_2SL"),
    
    AIM_4SL("AIM_4SL"),
    
    AP_610("AP_610"),
    
    AP_620("AP_620"),
    
    AP_625("AP_625"),
    
    AP_500("AP_500"),
    
    AP_510("AP_510"),
    
    AP_520("AP_520"),
    
    AIM_1SL("AIM_1SL"),
    
    AIM_4("AIM_4"),
    
    AMS_130("AMS_130"),
    
    AMS_102("AMS_102");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeviceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("deviceType")
  private DeviceTypeEnum deviceType = null;

  @SerializedName("address")
  private Integer address = null;

  @SerializedName("portNumber")
  private Integer portNumber = null;

  @SerializedName("reader")
  private List<ReaderDevice> reader = null;

  @SerializedName("output")
  private List<OutputDevice> output = null;

  @SerializedName("intput")
  private List<InputDevice> intput = null;

  public ModuleDevice id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador do dispositivo
   * @return id
  **/
  @ApiModelProperty(value = "Identificador do dispositivo")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ModuleDevice areaId(Long areaId) {
    this.areaId = areaId;
    return this;
  }

   /**
   * Identificador da área
   * @return areaId
  **/
  @ApiModelProperty(value = "Identificador da área")
  public Long getAreaId() {
    return areaId;
  }

  public void setAreaId(Long areaId) {
    this.areaId = areaId;
  }

  public ModuleDevice deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @ApiModelProperty(value = "")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public ModuleDevice address(Integer address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @ApiModelProperty(value = "Endereço")
  public Integer getAddress() {
    return address;
  }

  public void setAddress(Integer address) {
    this.address = address;
  }

  public ModuleDevice portNumber(Integer portNumber) {
    this.portNumber = portNumber;
    return this;
  }

   /**
   * Número da porta
   * @return portNumber
  **/
  @ApiModelProperty(value = "Número da porta")
  public Integer getPortNumber() {
    return portNumber;
  }

  public void setPortNumber(Integer portNumber) {
    this.portNumber = portNumber;
  }

  public ModuleDevice reader(List<ReaderDevice> reader) {
    this.reader = reader;
    return this;
  }

  public ModuleDevice addReaderItem(ReaderDevice readerItem) {
    if (this.reader == null) {
      this.reader = new ArrayList<ReaderDevice>();
    }
    this.reader.add(readerItem);
    return this;
  }

   /**
   * Leitora
   * @return reader
  **/
  @ApiModelProperty(value = "Leitora")
  public List<ReaderDevice> getReader() {
    return reader;
  }

  public void setReader(List<ReaderDevice> reader) {
    this.reader = reader;
  }

  public ModuleDevice output(List<OutputDevice> output) {
    this.output = output;
    return this;
  }

  public ModuleDevice addOutputItem(OutputDevice outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<OutputDevice>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * Dispositivo de saída
   * @return output
  **/
  @ApiModelProperty(value = "Dispositivo de saída")
  public List<OutputDevice> getOutput() {
    return output;
  }

  public void setOutput(List<OutputDevice> output) {
    this.output = output;
  }

  public ModuleDevice intput(List<InputDevice> intput) {
    this.intput = intput;
    return this;
  }

  public ModuleDevice addIntputItem(InputDevice intputItem) {
    if (this.intput == null) {
      this.intput = new ArrayList<InputDevice>();
    }
    this.intput.add(intputItem);
    return this;
  }

   /**
   * Dispositivo de entrada
   * @return intput
  **/
  @ApiModelProperty(value = "Dispositivo de entrada")
  public List<InputDevice> getIntput() {
    return intput;
  }

  public void setIntput(List<InputDevice> intput) {
    this.intput = intput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleDevice moduleDevice = (ModuleDevice) o;
    return Objects.equals(this.id, moduleDevice.id) &&
        Objects.equals(this.areaId, moduleDevice.areaId) &&
        Objects.equals(this.deviceType, moduleDevice.deviceType) &&
        Objects.equals(this.address, moduleDevice.address) &&
        Objects.equals(this.portNumber, moduleDevice.portNumber) &&
        Objects.equals(this.reader, moduleDevice.reader) &&
        Objects.equals(this.output, moduleDevice.output) &&
        Objects.equals(this.intput, moduleDevice.intput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, areaId, deviceType, address, portNumber, reader, output, intput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleDevice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
    sb.append("    reader: ").append(toIndentedString(reader)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    intput: ").append(toIndentedString(intput)).append("\n");
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

