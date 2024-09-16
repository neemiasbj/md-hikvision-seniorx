package br.com.seniorx.models;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CollectEventPendency
 */

public class CollectEventPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("initialDate")
  private OffsetDateTime initialDate = null;

  @SerializedName("finalDate")
  private OffsetDateTime finalDate = null;

  @SerializedName("initialNSR")
  private Long initialNSR = null;

  @SerializedName("finalNSR")
  private Long finalNSR = null;

  public CollectEventPendency pendencyId(Long pendencyId) {
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

  public CollectEventPendency managerDeviceId(Long managerDeviceId) {
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

  public CollectEventPendency initialDate(OffsetDateTime initialDate) {
    this.initialDate = initialDate;
    return this;
  }

   /**
   * Data inicial
   * @return initialDate
  **/
  @ApiModelProperty(value = "Data inicial")
  public OffsetDateTime getInitialDate() {
    return initialDate;
  }

  public void setInitialDate(OffsetDateTime initialDate) {
    this.initialDate = initialDate;
  }

  public CollectEventPendency finalDate(OffsetDateTime finalDate) {
    this.finalDate = finalDate;
    return this;
  }

   /**
   * Data final
   * @return finalDate
  **/
  @ApiModelProperty(value = "Data final")
  public OffsetDateTime getFinalDate() {
    return finalDate;
  }

  public void setFinalDate(OffsetDateTime finalDate) {
    this.finalDate = finalDate;
  }

  public CollectEventPendency initialNSR(Long initialNSR) {
    this.initialNSR = initialNSR;
    return this;
  }

   /**
   * Valor inicial do NSR
   * @return initialNSR
  **/
  @ApiModelProperty(value = "Valor inicial do NSR")
  public Long getInitialNSR() {
    return initialNSR;
  }

  public void setInitialNSR(Long initialNSR) {
    this.initialNSR = initialNSR;
  }

  public CollectEventPendency finalNSR(Long finalNSR) {
    this.finalNSR = finalNSR;
    return this;
  }

   /**
   * Valor final do NSR
   * @return finalNSR
  **/
  @ApiModelProperty(value = "Valor final do NSR")
  public Long getFinalNSR() {
    return finalNSR;
  }

  public void setFinalNSR(Long finalNSR) {
    this.finalNSR = finalNSR;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectEventPendency collectEventPendency = (CollectEventPendency) o;
    return Objects.equals(this.pendencyId, collectEventPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, collectEventPendency.managerDeviceId) &&
        Objects.equals(this.initialDate, collectEventPendency.initialDate) &&
        Objects.equals(this.finalDate, collectEventPendency.finalDate) &&
        Objects.equals(this.initialNSR, collectEventPendency.initialNSR) &&
        Objects.equals(this.finalNSR, collectEventPendency.finalNSR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, initialDate, finalDate, initialNSR, finalNSR);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectEventPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
    sb.append("    finalDate: ").append(toIndentedString(finalDate)).append("\n");
    sb.append("    initialNSR: ").append(toIndentedString(initialNSR)).append("\n");
    sb.append("    finalNSR: ").append(toIndentedString(finalNSR)).append("\n");
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

