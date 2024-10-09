package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UnsetDeviceEmergencyPendency
 */

public class UnsetDeviceEmergencyPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("deviceId")
  private Long deviceId = null;

  public UnsetDeviceEmergencyPendency pendencyId(Long pendencyId) {
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

  public UnsetDeviceEmergencyPendency managerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
    return this;
  }

   /**
   * Identificador do dispositivo gerenciador
   * @return managerDeviceId
  **/
  @Schema(description  = "Identificador do dispositivo gerenciador")
  public Long getManagerDeviceId() {
    return managerDeviceId;
  }

  public void setManagerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
  }

  public UnsetDeviceEmergencyPendency deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Identificador do dispositivo
   * @return deviceId
  **/
  @Schema(description  = "Identificador do dispositivo")
  public Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsetDeviceEmergencyPendency unsetDeviceEmergencyPendency = (UnsetDeviceEmergencyPendency) o;
    return Objects.equals(this.pendencyId, unsetDeviceEmergencyPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, unsetDeviceEmergencyPendency.managerDeviceId) &&
        Objects.equals(this.deviceId, unsetDeviceEmergencyPendency.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, deviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsetDeviceEmergencyPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

