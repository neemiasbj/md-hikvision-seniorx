package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PersonPhoto
 */

public class PersonPhoto {
  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("personName")
  private String personName = null;

  @SerializedName("photoUrl")
  private String photoUrl = null;

  @SerializedName("card")
  private CardInformation card = null;

  public PersonPhoto personId(Long personId) {
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

  public PersonPhoto personName(String personName) {
    this.personName = personName;
    return this;
  }

   /**
   * Nome da pessoa
   * @return personName
  **/
  @Schema(description  = "Nome da pessoa")
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public PersonPhoto photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

   /**
   * Url da foto
   * @return photoUrl
  **/
  @Schema(description  = "Url da foto")
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public PersonPhoto card(CardInformation card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @Schema(description  = "")
  public CardInformation getCard() {
    return card;
  }

  public void setCard(CardInformation card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonPhoto personPhoto = (PersonPhoto) o;
    return Objects.equals(this.personId, personPhoto.personId) &&
        Objects.equals(this.personName, personPhoto.personName) &&
        Objects.equals(this.photoUrl, personPhoto.photoUrl) &&
        Objects.equals(this.card, personPhoto.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, personName, photoUrl, card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPhoto {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

