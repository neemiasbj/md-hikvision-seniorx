package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PersonAreaUpdatedPendency
 */

public class PersonAreaUpdatedPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("cardNumber")
  private Long cardNumber = null;

  @SerializedName("areaControl")
  private Long areaControl = null;

  public PersonAreaUpdatedPendency pendencyId(Long pendencyId) {
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

  public PersonAreaUpdatedPendency managerDeviceId(Long managerDeviceId) {
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

  public PersonAreaUpdatedPendency personId(Long personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Identificador da pessoa
   * @return personId
  **/
  @ApiModelProperty(value = "Identificador da pessoa")
  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public PersonAreaUpdatedPendency cardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Número do cartão
   * @return cardNumber
  **/
  @ApiModelProperty(value = "Número do cartão")
  public Long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
  }

  public PersonAreaUpdatedPendency areaControl(Long areaControl) {
    this.areaControl = areaControl;
    return this;
  }

   /**
   * Identificador da área controlada
   * @return areaControl
  **/
  @ApiModelProperty(value = "Identificador da área controlada")
  public Long getAreaControl() {
    return areaControl;
  }

  public void setAreaControl(Long areaControl) {
    this.areaControl = areaControl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonAreaUpdatedPendency personAreaUpdatedPendency = (PersonAreaUpdatedPendency) o;
    return Objects.equals(this.pendencyId, personAreaUpdatedPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, personAreaUpdatedPendency.managerDeviceId) &&
        Objects.equals(this.personId, personAreaUpdatedPendency.personId) &&
        Objects.equals(this.cardNumber, personAreaUpdatedPendency.cardNumber) &&
        Objects.equals(this.areaControl, personAreaUpdatedPendency.areaControl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, personId, cardNumber, areaControl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAreaUpdatedPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    areaControl: ").append(toIndentedString(areaControl)).append("\n");
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

