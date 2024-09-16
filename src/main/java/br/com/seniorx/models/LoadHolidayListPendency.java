package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * LoadHolidayListPendency
 */

public class LoadHolidayListPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("holidayListId")
  private Long holidayListId = null;

  public LoadHolidayListPendency pendencyId(Long pendencyId) {
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

  public LoadHolidayListPendency managerDeviceId(Long managerDeviceId) {
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

  public LoadHolidayListPendency holidayListId(Long holidayListId) {
    this.holidayListId = holidayListId;
    return this;
  }

   /**
   * Identificador da lista de feriados
   * @return holidayListId
  **/
  @ApiModelProperty(value = "Identificador da lista de feriados")
  public Long getHolidayListId() {
    return holidayListId;
  }

  public void setHolidayListId(Long holidayListId) {
    this.holidayListId = holidayListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadHolidayListPendency loadHolidayListPendency = (LoadHolidayListPendency) o;
    return Objects.equals(this.pendencyId, loadHolidayListPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, loadHolidayListPendency.managerDeviceId) &&
        Objects.equals(this.holidayListId, loadHolidayListPendency.holidayListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, holidayListId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadHolidayListPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    holidayListId: ").append(toIndentedString(holidayListId)).append("\n");
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

