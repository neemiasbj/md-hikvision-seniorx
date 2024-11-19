 package br.com.seniorx.models;
 import java.time.OffsetDateTime;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class CollectEventPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("initialDate")
   private OffsetDateTime initialDate = null;
   
   @SerializedName("finalDate")
   private OffsetDateTime finalDate = null;
   
   @SerializedName("initialNSR")
   private Long initialNSR = null;
   
   @SerializedName("finalNSR")
   private Long finalNSR = null;
   
   public CollectEventPendency pendencyId(Long pendencyId) {
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
   
   public CollectEventPendency managerDeviceId(Long managerDeviceId) {
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
   
   public CollectEventPendency initialDate(OffsetDateTime initialDate) {
     this.initialDate = initialDate;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Data inicial")
   public OffsetDateTime getInitialDate() {
     return this.initialDate;
   }
   
   public void setInitialDate(OffsetDateTime initialDate) {
     this.initialDate = initialDate;
   }
   
   public CollectEventPendency finalDate(OffsetDateTime finalDate) {
     this.finalDate = finalDate;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Data final")
   public OffsetDateTime getFinalDate() {
     return this.finalDate;
   }
   
   public void setFinalDate(OffsetDateTime finalDate) {
     this.finalDate = finalDate;
   }
   
   public CollectEventPendency initialNSR(Long initialNSR) {
     this.initialNSR = initialNSR;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Valor inicial do NSR")
   public Long getInitialNSR() {
     return this.initialNSR;
   }
   
   public void setInitialNSR(Long initialNSR) {
     this.initialNSR = initialNSR;
   }
   
   public CollectEventPendency finalNSR(Long finalNSR) {
     this.finalNSR = finalNSR;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Valor final do NSR")
   public Long getFinalNSR() {
     return this.finalNSR;
   }
   
   public void setFinalNSR(Long finalNSR) {
     this.finalNSR = finalNSR;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CollectEventPendency collectEventPendency = (CollectEventPendency)o;
     return (Objects.equals(this.pendencyId, collectEventPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, collectEventPendency.managerDeviceId) && 
       Objects.equals(this.initialDate, collectEventPendency.initialDate) && 
       Objects.equals(this.finalDate, collectEventPendency.finalDate) && 
       Objects.equals(this.initialNSR, collectEventPendency.initialNSR) && 
       Objects.equals(this.finalNSR, collectEventPendency.finalNSR));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.initialDate, this.finalDate, this.initialNSR, this.finalNSR });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CollectEventPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    initialDate: ").append(toIndentedString(this.initialDate)).append("\n");
     sb.append("    finalDate: ").append(toIndentedString(this.finalDate)).append("\n");
     sb.append("    initialNSR: ").append(toIndentedString(this.initialNSR)).append("\n");
     sb.append("    finalNSR: ").append(toIndentedString(this.finalNSR)).append("\n");
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


