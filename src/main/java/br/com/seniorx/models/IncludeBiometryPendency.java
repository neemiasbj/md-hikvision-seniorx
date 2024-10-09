package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IncludeBiometryPendency
 */

public class IncludeBiometryPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("cardList")
  private List<CardAndTechnology> cardList = null;

  @SerializedName("biometry")
  private Biometry biometry = null;

  public IncludeBiometryPendency pendencyId(Long pendencyId) {
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

  public IncludeBiometryPendency managerDeviceId(Long managerDeviceId) {
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

  public IncludeBiometryPendency personId(Long personId) {
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

  public IncludeBiometryPendency cardList(List<CardAndTechnology> cardList) {
    this.cardList = cardList;
    return this;
  }

  public IncludeBiometryPendency addCardListItem(CardAndTechnology cardListItem) {
    if (this.cardList == null) {
      this.cardList = new ArrayList<CardAndTechnology>();
    }
    this.cardList.add(cardListItem);
    return this;
  }

   /**
   * Lista de credenciais
   * @return cardList
  **/
  @Schema(description  = "Lista de credenciais")
  public List<CardAndTechnology> getCardList() {
    return cardList;
  }

  public void setCardList(List<CardAndTechnology> cardList) {
    this.cardList = cardList;
  }

  public IncludeBiometryPendency biometry(Biometry biometry) {
    this.biometry = biometry;
    return this;
  }

   /**
   * Get biometry
   * @return biometry
  **/
  @Schema(description  = "")
  public Biometry getBiometry() {
    return biometry;
  }

  public void setBiometry(Biometry biometry) {
    this.biometry = biometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludeBiometryPendency includeBiometryPendency = (IncludeBiometryPendency) o;
    return Objects.equals(this.pendencyId, includeBiometryPendency.pendencyId) &&
        Objects.equals(this.managerDeviceId, includeBiometryPendency.managerDeviceId) &&
        Objects.equals(this.personId, includeBiometryPendency.personId) &&
        Objects.equals(this.cardList, includeBiometryPendency.cardList) &&
        Objects.equals(this.biometry, includeBiometryPendency.biometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendencyId, managerDeviceId, personId, cardList, biometry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludeBiometryPendency {\n");
    
    sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
    sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
    sb.append("    biometry: ").append(toIndentedString(biometry)).append("\n");
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

