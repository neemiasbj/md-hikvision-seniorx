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
 * PortConfiguration
 */

public class PortConfiguration {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("portNumber")
  private Integer portNumber = null;

  /**
   * Gets or Sets communicationMode
   */
  @JsonAdapter(CommunicationModeEnum.Adapter.class)
  public enum CommunicationModeEnum {
    FULL_DUPLEX("FULL_DUPLEX"),
    
    HALF_DUPLEX("HALF_DUPLEX");

    private String value;

    CommunicationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommunicationModeEnum fromValue(String text) {
      for (CommunicationModeEnum b : CommunicationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommunicationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommunicationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommunicationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommunicationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("communicationMode")
  private CommunicationModeEnum communicationMode = null;

  @SerializedName("txdDriverSettleDelay")
  private Integer txdDriverSettleDelay = null;

  @SerializedName("receiveDataValidDelay")
  private Integer receiveDataValidDelay = null;

  @SerializedName("interCharacterTimeout")
  private Integer interCharacterTimeout = null;

  @SerializedName("controllerReplyTimeout")
  private Integer controllerReplyTimeout = null;

  @SerializedName("pollTime")
  private Integer pollTime = null;

  @SerializedName("offlineDevicePollTime")
  private Integer offlineDevicePollTime = null;

  public PortConfiguration id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description  = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PortConfiguration portNumber(Integer portNumber) {
    this.portNumber = portNumber;
    return this;
  }

   /**
   * Número da Porta
   * @return portNumber
  **/
  @Schema(description  = "Número da Porta")
  public Integer getPortNumber() {
    return portNumber;
  }

  public void setPortNumber(Integer portNumber) {
    this.portNumber = portNumber;
  }

  public PortConfiguration communicationMode(CommunicationModeEnum communicationMode) {
    this.communicationMode = communicationMode;
    return this;
  }

   /**
   * Get communicationMode
   * @return communicationMode
  **/
  @Schema(description  = "")
  public CommunicationModeEnum getCommunicationMode() {
    return communicationMode;
  }

  public void setCommunicationMode(CommunicationModeEnum communicationMode) {
    this.communicationMode = communicationMode;
  }

  public PortConfiguration txdDriverSettleDelay(Integer txdDriverSettleDelay) {
    this.txdDriverSettleDelay = txdDriverSettleDelay;
    return this;
  }

   /**
   * Delay do driver txd
   * @return txdDriverSettleDelay
  **/
  @Schema(description  = "Delay do driver txd")
  public Integer getTxdDriverSettleDelay() {
    return txdDriverSettleDelay;
  }

  public void setTxdDriverSettleDelay(Integer txdDriverSettleDelay) {
    this.txdDriverSettleDelay = txdDriverSettleDelay;
  }

  public PortConfiguration receiveDataValidDelay(Integer receiveDataValidDelay) {
    this.receiveDataValidDelay = receiveDataValidDelay;
    return this;
  }

   /**
   * Delay do driver rxd
   * @return receiveDataValidDelay
  **/
  @Schema(description  = "Delay do driver rxd")
  public Integer getReceiveDataValidDelay() {
    return receiveDataValidDelay;
  }

  public void setReceiveDataValidDelay(Integer receiveDataValidDelay) {
    this.receiveDataValidDelay = receiveDataValidDelay;
  }

  public PortConfiguration interCharacterTimeout(Integer interCharacterTimeout) {
    this.interCharacterTimeout = interCharacterTimeout;
    return this;
  }

   /**
   * Timeout recebimento
   * @return interCharacterTimeout
  **/
  @Schema(description  = "Timeout recebimento")
  public Integer getInterCharacterTimeout() {
    return interCharacterTimeout;
  }

  public void setInterCharacterTimeout(Integer interCharacterTimeout) {
    this.interCharacterTimeout = interCharacterTimeout;
  }

  public PortConfiguration controllerReplyTimeout(Integer controllerReplyTimeout) {
    this.controllerReplyTimeout = controllerReplyTimeout;
    return this;
  }

   /**
   * Timeout reposta
   * @return controllerReplyTimeout
  **/
  @Schema(description  = "Timeout reposta")
  public Integer getControllerReplyTimeout() {
    return controllerReplyTimeout;
  }

  public void setControllerReplyTimeout(Integer controllerReplyTimeout) {
    this.controllerReplyTimeout = controllerReplyTimeout;
  }

  public PortConfiguration pollTime(Integer pollTime) {
    this.pollTime = pollTime;
    return this;
  }

   /**
   * Timeout eventos
   * @return pollTime
  **/
  @Schema(description  = "Timeout eventos")
  public Integer getPollTime() {
    return pollTime;
  }

  public void setPollTime(Integer pollTime) {
    this.pollTime = pollTime;
  }

  public PortConfiguration offlineDevicePollTime(Integer offlineDevicePollTime) {
    this.offlineDevicePollTime = offlineDevicePollTime;
    return this;
  }

   /**
   * Timeout eventos offline
   * @return offlineDevicePollTime
  **/
  @Schema(description  = "Timeout eventos offline")
  public Integer getOfflineDevicePollTime() {
    return offlineDevicePollTime;
  }

  public void setOfflineDevicePollTime(Integer offlineDevicePollTime) {
    this.offlineDevicePollTime = offlineDevicePollTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortConfiguration portConfiguration = (PortConfiguration) o;
    return Objects.equals(this.id, portConfiguration.id) &&
        Objects.equals(this.portNumber, portConfiguration.portNumber) &&
        Objects.equals(this.communicationMode, portConfiguration.communicationMode) &&
        Objects.equals(this.txdDriverSettleDelay, portConfiguration.txdDriverSettleDelay) &&
        Objects.equals(this.receiveDataValidDelay, portConfiguration.receiveDataValidDelay) &&
        Objects.equals(this.interCharacterTimeout, portConfiguration.interCharacterTimeout) &&
        Objects.equals(this.controllerReplyTimeout, portConfiguration.controllerReplyTimeout) &&
        Objects.equals(this.pollTime, portConfiguration.pollTime) &&
        Objects.equals(this.offlineDevicePollTime, portConfiguration.offlineDevicePollTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, portNumber, communicationMode, txdDriverSettleDelay, receiveDataValidDelay, interCharacterTimeout, controllerReplyTimeout, pollTime, offlineDevicePollTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
    sb.append("    communicationMode: ").append(toIndentedString(communicationMode)).append("\n");
    sb.append("    txdDriverSettleDelay: ").append(toIndentedString(txdDriverSettleDelay)).append("\n");
    sb.append("    receiveDataValidDelay: ").append(toIndentedString(receiveDataValidDelay)).append("\n");
    sb.append("    interCharacterTimeout: ").append(toIndentedString(interCharacterTimeout)).append("\n");
    sb.append("    controllerReplyTimeout: ").append(toIndentedString(controllerReplyTimeout)).append("\n");
    sb.append("    pollTime: ").append(toIndentedString(pollTime)).append("\n");
    sb.append("    offlineDevicePollTime: ").append(toIndentedString(offlineDevicePollTime)).append("\n");
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

