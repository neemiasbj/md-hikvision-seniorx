 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PersonPhotoTemplates
 {
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
 
 
 
 
   
   @Schema(description = "Identificador da pessoa")
   public Long getPersonId() {
     return this.personId;
   }
   
   public void setPersonId(Long personId) {
     this.personId = personId;
   }
   
   public PersonPhotoTemplates name(String name) {
     this.name = name;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nome")
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = name;
   }
   
   public PersonPhotoTemplates photoURL(String photoURL) {
     this.photoURL = photoURL;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Url da foto")
   public String getPhotoURL() {
     return this.photoURL;
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
       this.cardList = new ArrayList<>();
     }
     this.cardList.add(cardListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de cartões")
   public List<CardInformation> getCardList() {
     return this.cardList;
   }
   
   public void setCardList(List<CardInformation> cardList) {
     this.cardList = cardList;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PersonPhotoTemplates personPhotoTemplates = (PersonPhotoTemplates)o;
     return (Objects.equals(this.personId, personPhotoTemplates.personId) && 
       Objects.equals(this.name, personPhotoTemplates.name) && 
       Objects.equals(this.photoURL, personPhotoTemplates.photoURL) && 
       Objects.equals(this.cardList, personPhotoTemplates.cardList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.personId, this.name, this.photoURL, this.cardList });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonPhotoTemplates {\n");
     
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
     sb.append("    photoURL: ").append(toIndentedString(this.photoURL)).append("\n");
     sb.append("    cardList: ").append(toIndentedString(this.cardList)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\PersonPhotoTemplates.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */