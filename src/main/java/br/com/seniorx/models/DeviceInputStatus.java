package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceInputStatus
 */

public class DeviceInputStatus {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("status")
  private List<InputStatusField> status = null;

  public DeviceInputStatus pendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
    return this;
  }

   /**
   * Identificador da pendência
   * @return pendencyId
  **/
  @ApiModelProperty(value = "Identificador da pendência")
  public Long getPendencyId() {
    return pendencyId;
  }

  public void setPendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
  }

  public DeviceInputStatus managerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
    return this;
  }

   /**
   * Identificador do dispositivo gerenciador
   * @return managerDeviceId
  **/
  @ApiModelProperty(value = "Identificador do dispositivo gerenciador")
  public Long getManagerDeviceId() {
    return managerDeviceId;
  }

  public void setManagerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
  }

  public DeviceInputStatus status(List<InputStatusField> status) {
    this.status = status;
    return this;
  }

  public DeviceInputStatus addStatusItem(InputStatusField statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<InputStatusField>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Status da entrada
   * @return status
  **/
  @ApiModelProperty(value = "Status da entrada")
  public List<InputStatusField> getStatus() {
    return status;
  }

  public void setStatus(List<InputStatusField> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInputStatus deviceInputStatus = (DeviceInputStatus) o;
    return Objects.equals(this.pendencyId, deviceInputStatus.pendencyId) &&
        Objects.equals(this.managerDeviceId, deviceInputStatus.managerDeviceId) &&
        Objects.equals(this.status, deviceInputStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInputStatus {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

