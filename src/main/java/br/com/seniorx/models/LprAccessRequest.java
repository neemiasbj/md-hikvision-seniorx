 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class LprAccessRequest
 {
   @SerializedName("readerId")
   private Long readerId = null;
   
   @SerializedName("licensePlate")
   private String licensePlate = null;
   
   @SerializedName("generateNotification")
   private Boolean generateNotification = Boolean.valueOf(false);
   
   public LprAccessRequest readerId(Long readerId) {
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
   
   public LprAccessRequest licensePlate(String licensePlate) {
     this.licensePlate = licensePlate;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Placa do veículo")
   public String getLicensePlate() {
     return this.licensePlate;
   }
   
   public void setLicensePlate(String licensePlate) {
     this.licensePlate = licensePlate;
   }
   
   public LprAccessRequest generateNotification(Boolean generateNotification) {
     this.generateNotification = generateNotification;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Gera notificação")
   public Boolean isGenerateNotification() {
     return this.generateNotification;
   }
   
   public void setGenerateNotification(Boolean generateNotification) {
     this.generateNotification = generateNotification;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     LprAccessRequest lprAccessRequest = (LprAccessRequest)o;
     return (Objects.equals(this.readerId, lprAccessRequest.readerId) && 
       Objects.equals(this.licensePlate, lprAccessRequest.licensePlate) && 
       Objects.equals(this.generateNotification, lprAccessRequest.generateNotification));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.readerId, this.licensePlate, this.generateNotification });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class LprAccessRequest {\n");
     
     sb.append("    readerId: ").append(toIndentedString(this.readerId)).append("\n");
     sb.append("    licensePlate: ").append(toIndentedString(this.licensePlate)).append("\n");
     sb.append("    generateNotification: ").append(toIndentedString(this.generateNotification)).append("\n");
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


