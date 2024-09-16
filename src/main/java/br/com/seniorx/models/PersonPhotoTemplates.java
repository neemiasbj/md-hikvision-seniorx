package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PersonPhotoTemplates
 */

public class PersonPhotoTemplates {
  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("photoURL")
  private String photoURL = null;

  @SerializedName("cardList")
  private List<CardInformation> cardList = null;

  public PersonPhotoTemplates personId(Long personId) {
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

  public PersonPhotoTemplates name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome
   * @return name
  **/
  @ApiModelProperty(value = "Nome")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonPhotoTemplates photoURL(String photoURL) {
    this.photoURL = photoURL;
    return this;
  }

   /**
   * Url da foto
   * @return photoURL
  **/
  @ApiModelProperty(value = "Url da foto")
  public String getPhotoURL() {
    return photoURL;
  }

  public void setPhotoURL(String photoURL) {
    this.photoURL = photoURL;
  }

  public PersonPhotoTemplates cardList(List<CardInformation> cardList) {
    this.cardList = cardList;
    return this;
  }

  public PersonPhotoTemplates addCardListItem(CardInformation cardListItem) {
    if (this.cardList == null) {
      this.cardList = new ArrayList<CardInformation>();
    }
    this.cardList.add(cardListItem);
    return this;
  }

   /**
   * Lista de cartões
   * @return cardList
  **/
  @ApiModelProperty(value = "Lista de cartões")
  public List<CardInformation> getCardList() {
    return cardList;
  }

  public void setCardList(List<CardInformation> cardList) {
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
    PersonPhotoTemplates personPhotoTemplates = (PersonPhotoTemplates) o;
    return Objects.equals(this.personId, personPhotoTemplates.personId) &&
        Objects.equals(this.name, personPhotoTemplates.name) &&
        Objects.equals(this.photoURL, personPhotoTemplates.photoURL) &&
        Objects.equals(this.cardList, personPhotoTemplates.cardList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, name, photoURL, cardList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPhotoTemplates {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoURL: ").append(toIndentedString(photoURL)).append("\n");
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

