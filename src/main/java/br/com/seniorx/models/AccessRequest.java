 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 public class AccessRequest
 {
   @SerializedName("readerId")
   private Long readerId = null;
   
   @SerializedName("cardId")
   private Long cardId = null;
   
   @SerializedName("personId")
   private Long personId = null;
   
   @SerializedName("requestDateTime")
   private String requestDateTime = null;
   
   public AccessRequest readerId(Long readerId) {
     this.readerId = readerId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador da leitora")
   public Long getReaderId() {
     return this.readerId;
   }
   
   public void setReaderId(Long readerId) {
     this.readerId = readerId;
   }
   
   public AccessRequest cardId(Long cardId) {
     this.cardId = cardId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador do cartão")
   public Long getCardId() {
     return this.cardId;
   }
   
   public void setCardId(Long cardId) {
     this.cardId = cardId;
   }
   
   public AccessRequest personId(Long personId) {
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
   
   public AccessRequest requestDateTime(String requestDateTime) {
     this.requestDateTime = requestDateTime;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Data e hora da requisição de acesso")
   public String getRequestDateTime() {
     return this.requestDateTime;
   }
   
   public void setRequestDateTime(String requestDateTime) {
     this.requestDateTime = requestDateTime;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     AccessRequest accessRequest = (AccessRequest)o;
     return (Objects.equals(this.readerId, accessRequest.readerId) && 
       Objects.equals(this.cardId, accessRequest.cardId) && 
       Objects.equals(this.personId, accessRequest.personId) && 
       Objects.equals(this.requestDateTime, accessRequest.requestDateTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.readerId, this.cardId, this.personId, this.requestDateTime });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class AccessRequest {\n");
     
     sb.append("    readerId: ").append(toIndentedString(this.readerId)).append("\n");
     sb.append("    cardId: ").append(toIndentedString(this.cardId)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    requestDateTime: ").append(toIndentedString(this.requestDateTime)).append("\n");
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


