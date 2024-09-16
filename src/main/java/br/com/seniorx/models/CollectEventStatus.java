package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CollectEventStatus
 */

public class CollectEventStatus {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("accessEventCount")
  private Long accessEventCount = null;

  @SerializedName("alarmEventCount")
  private Long alarmEventCount = null;

  public CollectEventStatus pendencyId(Long pendencyId) {
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

  public CollectEventStatus managerDeviceId(Long managerDeviceId) {
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

  public CollectEventStatus accessEventCount(Long accessEventCount) {
    this.accessEventCount = accessEventCount;
    return this;
  }

   /**
   * Get accessEventCount
   * @return accessEventCount
  **/
  @ApiModelProperty(value = "")
  public Long getAccessEventCount() {
    return accessEventCount;
  }

  public void setAccessEventCount(Long accessEventCount) {
    this.accessEventCount = accessEventCount;
  }

  public CollectEventStatus alarmEventCount(Long alarmEventCount) {
    this.alarmEventCount = alarmEventCount;
    return this;
  }

   /**
   * Get alarmEventCount
   * @return alarmEventCount
  **/
  @ApiModelProperty(value = "")
  public Long getAlarmEventCount() {
    return alarmEventCount;
  }

  public void setAlarmEventCount(Long alarmEventCount) {
    this.alarmEventCount = alarmEventCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectEventStatus collectEventStatus = (CollectEventStatus) o;
    return Objects.equals(this.pendencyId, collectEventStatus.pendencyId) &&
        Objects.equals(this.managerDeviceId, collectEventStatus.managerDeviceId) &&
        Objects.equals(this.accessEventCount, collectEventStatus.accessEventCount) &&
        Objects.equals(this.alarmEventCount, collectEventStatus.alarmEventCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, accessEventCount, alarmEventCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectEventStatus {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    accessEventCount: ").append(toIndentedString(accessEventCount)).append("\n");
    sb.append("    alarmEventCount: ").append(toIndentedString(alarmEventCount)).append("\n");
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

