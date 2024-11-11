 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PersonTemplates
 {
   @SerializedName("personId")
   private Long personId = null;
   
   @SerializedName("cardList")
   private List<CardAndTechnology> cardList = null;
   
   @SerializedName("technologies")
   private List<BiometricTechnologyTemplatesList> technologies = null;
   
   public PersonTemplates personId(Long personId) {
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
   
   public PersonTemplates cardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
     return this;
   }
   
   public PersonTemplates addCardListItem(CardAndTechnology cardListItem) {
     if (this.cardList == null) {
       this.cardList = new ArrayList<>();
     }
     this.cardList.add(cardListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de cartões")
   public List<CardAndTechnology> getCardList() {
     return this.cardList;
   }
   
   public void setCardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
   }
   
   public PersonTemplates technologies(List<BiometricTechnologyTemplatesList> technologies) {
     this.technologies = technologies;
     return this;
   }
   
   public PersonTemplates addTechnologiesItem(BiometricTechnologyTemplatesList technologiesItem) {
     if (this.technologies == null) {
       this.technologies = new ArrayList<>();
     }
     this.technologies.add(technologiesItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public List<BiometricTechnologyTemplatesList> getTechnologies() {
     return this.technologies;
   }
   
   public void setTechnologies(List<BiometricTechnologyTemplatesList> technologies) {
     this.technologies = technologies;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PersonTemplates personTemplates = (PersonTemplates)o;
     return (Objects.equals(this.personId, personTemplates.personId) && 
       Objects.equals(this.cardList, personTemplates.cardList) && 
       Objects.equals(this.technologies, personTemplates.technologies));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.personId, this.cardList, this.technologies });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonTemplates {\n");
     
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    cardList: ").append(toIndentedString(this.cardList)).append("\n");
     sb.append("    technologies: ").append(toIndentedString(this.technologies)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\PersonTemplates.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */