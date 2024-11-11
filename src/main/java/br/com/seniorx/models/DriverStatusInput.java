 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class DriverStatusInput
 {
   @SerializedName("driverIds")
   private List<Long> driverIds = null;
   
   public DriverStatusInput driverIds(List<Long> driverIds) {
     this.driverIds = driverIds;
     return this;
   }
   
   public DriverStatusInput addDriverIdsItem(Long driverIdsItem) {
     if (this.driverIds == null) {
       this.driverIds = new ArrayList<>();
     }
     this.driverIds.add(driverIdsItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public List<Long> getDriverIds() {
     return this.driverIds;
   }
   
   public void setDriverIds(List<Long> driverIds) {
     this.driverIds = driverIds;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DriverStatusInput driverStatusInput = (DriverStatusInput)o;
     return Objects.equals(this.driverIds, driverStatusInput.driverIds);
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.driverIds });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DriverStatusInput {\n");
     
     sb.append("    driverIds: ").append(toIndentedString(this.driverIds)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DriverStatusInput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */