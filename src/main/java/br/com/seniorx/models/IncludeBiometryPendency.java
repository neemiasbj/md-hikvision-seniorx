 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class IncludeBiometryPendency
 {
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
 
 
 
 
   
   @Schema(description = "Identificador da pendência")
   public Long getPendencyId() {
     return this.pendencyId;
   }
   
   public void setPendencyId(Long pendencyId) {
     this.pendencyId = pendencyId;
   }
   
   public IncludeBiometryPendency managerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo gerenciador")
   public Long getManagerDeviceId() {
     return this.managerDeviceId;
   }
   
   public void setManagerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
   }
   
   public IncludeBiometryPendency personId(Long personId) {
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
   
   public IncludeBiometryPendency cardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
     return this;
   }
   
   public IncludeBiometryPendency addCardListItem(CardAndTechnology cardListItem) {
     if (this.cardList == null) {
       this.cardList = new ArrayList<>();
     }
     this.cardList.add(cardListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de credenciais")
   public List<CardAndTechnology> getCardList() {
     return this.cardList;
   }
   
   public void setCardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
   }
   
   public IncludeBiometryPendency biometry(Biometry biometry) {
     this.biometry = biometry;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Biometry getBiometry() {
     return this.biometry;
   }
   
   public void setBiometry(Biometry biometry) {
     this.biometry = biometry;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     IncludeBiometryPendency includeBiometryPendency = (IncludeBiometryPendency)o;
     return (Objects.equals(this.pendencyId, includeBiometryPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, includeBiometryPendency.managerDeviceId) && 
       Objects.equals(this.personId, includeBiometryPendency.personId) && 
       Objects.equals(this.cardList, includeBiometryPendency.cardList) && 
       Objects.equals(this.biometry, includeBiometryPendency.biometry));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.personId, this.cardList, this.biometry });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class IncludeBiometryPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    cardList: ").append(toIndentedString(this.cardList)).append("\n");
     sb.append("    biometry: ").append(toIndentedString(this.biometry)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\IncludeBiometryPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */