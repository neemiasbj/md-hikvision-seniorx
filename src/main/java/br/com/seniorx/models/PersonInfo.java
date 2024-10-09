package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PersonInfo
 */

public class PersonInfo {
  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("personName")
  private String personName = null;

  @SerializedName("photoUrl")
  private String photoUrl = null;

  @SerializedName("cards")
  private List<CardInformation> cards = null;

  public PersonInfo personId(Long personId) {
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

  public PersonInfo personName(String personName) {
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

  public PersonInfo photoUrl(String photoUrl) {
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

  public PersonInfo cards(List<CardInformation> cards) {
    this.cards = cards;
    return this;
  }

  public PersonInfo addCardsItem(CardInformation cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<CardInformation>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * Informação do cartão
   * @return cards
  **/
  @Schema(description  = "Informação do cartão")
  public List<CardInformation> getCards() {
    return cards;
  }

  public void setCards(List<CardInformation> cards) {
    this.cards = cards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonInfo personInfo = (PersonInfo) o;
    return Objects.equals(this.personId, personInfo.personId) &&
        Objects.equals(this.personName, personInfo.personName) &&
        Objects.equals(this.photoUrl, personInfo.photoUrl) &&
        Objects.equals(this.cards, personInfo.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, personName, photoUrl, cards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonInfo {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

