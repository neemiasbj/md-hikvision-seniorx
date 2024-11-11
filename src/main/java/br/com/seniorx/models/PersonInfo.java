 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PersonInfo
 {
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
 
 
 
 
   
   @Schema(description = "Identificador da pessoa")
   public Long getPersonId() {
     return this.personId;
   }
   
   public void setPersonId(Long personId) {
     this.personId = personId;
   }
   
   public PersonInfo personName(String personName) {
     this.personName = personName;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nome da pessoa")
   public String getPersonName() {
     return this.personName;
   }
   
   public void setPersonName(String personName) {
     this.personName = personName;
   }
   
   public PersonInfo photoUrl(String photoUrl) {
     this.photoUrl = photoUrl;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Url da foto")
   public String getPhotoUrl() {
     return this.photoUrl;
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
       this.cards = new ArrayList<>();
     }
     this.cards.add(cardsItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informação do cartão")
   public List<CardInformation> getCards() {
     return this.cards;
   }
   
   public void setCards(List<CardInformation> cards) {
     this.cards = cards;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PersonInfo personInfo = (PersonInfo)o;
     return (Objects.equals(this.personId, personInfo.personId) && 
       Objects.equals(this.personName, personInfo.personName) && 
       Objects.equals(this.photoUrl, personInfo.photoUrl) && 
       Objects.equals(this.cards, personInfo.cards));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.personId, this.personName, this.photoUrl, this.cards });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonInfo {\n");
     
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    personName: ").append(toIndentedString(this.personName)).append("\n");
     sb.append("    photoUrl: ").append(toIndentedString(this.photoUrl)).append("\n");
     sb.append("    cards: ").append(toIndentedString(this.cards)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 }
=======
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\PersonInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */