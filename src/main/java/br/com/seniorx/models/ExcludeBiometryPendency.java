package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExcludeBiometryPendency
 */

public class ExcludeBiometryPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("cardList")
  private List<CardAndTechnology> cardList = null;

  public ExcludeBiometryPendency pendencyId(Long pendencyId) {
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

  public ExcludeBiometryPendency managerDeviceId(Long managerDeviceId) {
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

  public ExcludeBiometryPendency personId(Long personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Identificador da pessoa
   * @return personId
  **/
  @Schema(description  = "Identificador da pessoa")
  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public ExcludeBiometryPendency cardList(List<CardAndTechnology> cardList) {
    this.cardList = cardList;
    return this;
  }

  public ExcludeBiometryPendency addCardListItem(CardAndTechnology cardListItem) {
    if (this.cardList == null) {
      this.cardList = new ArrayList<CardAndTechnology>();
    }
    this.cardList.add(cardListItem);
    return this;
  }

   /**
   * Lista de cartões
   * @return cardList
  **/
  @Schema(description  = "Lista de cartões")
  public List<CardAndTechnology> getCardList() {
    return cardList;
  }

  public void setCardList(List<CardAndTechnology> cardList) {
    this.cardList = cardList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludeBiometryPendency excludeBiometryPendency = (ExcludeBiometryPendency) o;
    return Objects.equals(this.pendencyId, excludeBiometryPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, excludeBiometryPendency.managerDeviceId) &&
        Objects.equals(this.personId, excludeBiometryPendency.personId) &&
        Objects.equals(this.cardList, excludeBiometryPendency.cardList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, personId, cardList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludeBiometryPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
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

