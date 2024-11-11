 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 
 public class IncludePhotoPendency
   extends AbstractPendency
 {
   @SerializedName("personId")
   private Long personId = null;
   
   @SerializedName("personName")
   private String personName = null;
   
   @SerializedName("photoUrl")
   private String photoUrl = null;
   
   @SerializedName("cardList")
   private List<CardInformation> cardList = null;
   
   public IncludePhotoPendency personId(Long personId) {
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
   
   public IncludePhotoPendency personName(String personName) {
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
   
   public IncludePhotoPendency photoUrl(String photoUrl) {
     this.photoUrl = photoUrl;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "URL da foto")
   public String getPhotoUrl() {
     return this.photoUrl;
   }
   
   public void setPhotoUrl(String photoUrl) {
     this.photoUrl = photoUrl;
   }
   
   public IncludePhotoPendency cardList(List<CardInformation> cardList) {
     this.cardList = cardList;
     return this;
   }
   
   public IncludePhotoPendency addCardListItem(CardInformation cardListItem) {
     if (this.cardList == null) {
       this.cardList = new ArrayList<>();
     }
     this.cardList.add(cardListItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
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
     IncludePhotoPendency includePhotoPendency = (IncludePhotoPendency)o;
     return (Objects.equals(getPendencyId(), includePhotoPendency
         .getPendencyId()) && Objects.equals(getManagerDeviceId(), includePhotoPendency.getManagerDeviceId()) && Objects.equals(this.personId, includePhotoPendency.personId) && 
       Objects.equals(this.personName, includePhotoPendency.personName) && Objects.equals(this.photoUrl, includePhotoPendency.photoUrl) && Objects.equals(this.cardList, includePhotoPendency.cardList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { getPendencyId(), getManagerDeviceId(), this.personId, this.personName, this.photoUrl, this.cardList });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class IncludePhotoPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(getPendencyId())).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(getManagerDeviceId())).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    personName: ").append(toIndentedString(this.personName)).append("\n");
     sb.append("    photoUrl: ").append(toIndentedString(this.photoUrl)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\IncludePhotoPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */