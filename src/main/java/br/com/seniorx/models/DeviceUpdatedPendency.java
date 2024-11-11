 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class DeviceUpdatedPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
 
 
 
 
   
   @SerializedName("operation")
   private OperationUpdateDeviceEnum operation = null;
   
   public DeviceUpdatedPendency pendencyId(Long pendencyId) {
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
   
   public DeviceUpdatedPendency managerDeviceId(Long managerDeviceId) {
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
   
   public DeviceUpdatedPendency operation(OperationUpdateDeviceEnum operation) {
     this.operation = operation;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Status do dispositivo")
   public OperationUpdateDeviceEnum getOperation() {
     return this.operation;
   }
   
   public void setOperation(OperationUpdateDeviceEnum operation) {
     this.operation = operation;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DeviceUpdatedPendency deviceUpdatedPendency = (DeviceUpdatedPendency)o;
     return (Objects.equals(this.pendencyId, deviceUpdatedPendency.pendencyId) && Objects.equals(this.managerDeviceId, deviceUpdatedPendency.managerDeviceId) && Objects.equals(this.operation, deviceUpdatedPendency.operation));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.operation });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DeviceUpdatedPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    operation: ").append(toIndentedString(this.operation)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DeviceUpdatedPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */