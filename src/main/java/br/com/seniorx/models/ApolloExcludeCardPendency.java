 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 public class ApolloExcludeCardPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("card")
   private Long card = null;
   
   @SerializedName("personId")
   private Long personId = null;
   
   public ApolloExcludeCardPendency pendencyId(Long pendencyId) {
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
   
   public ApolloExcludeCardPendency managerDeviceId(Long managerDeviceId) {
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
   
   public ApolloExcludeCardPendency card(Long card) {
     this.card = card;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Número do cartão")
   public Long getCard() {
     return this.card;
   }
   
   public void setCard(Long card) {
     this.card = card;
   }
   
   public ApolloExcludeCardPendency personId(Long personId) {
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
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ApolloExcludeCardPendency apolloExcludeCardPendency = (ApolloExcludeCardPendency)o;
     return (Objects.equals(this.pendencyId, apolloExcludeCardPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, apolloExcludeCardPendency.managerDeviceId) && 
       Objects.equals(this.card, apolloExcludeCardPendency.card) && 
       Objects.equals(this.personId, apolloExcludeCardPendency.personId));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.card, this.personId });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ApolloExcludeCardPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    card: ").append(toIndentedString(this.card)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ApolloExcludeCardPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */