 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 public class ActiveDeviceOutputPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("deviceId")
   private Long deviceId = null;
   
   @SerializedName("activationTime")
   private Long activationTime = null;
   
   public ActiveDeviceOutputPendency pendencyId(Long pendencyId) {
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
   
   public ActiveDeviceOutputPendency managerDeviceId(Long managerDeviceId) {
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
   
   public ActiveDeviceOutputPendency deviceId(Long deviceId) {
     this.deviceId = deviceId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getDeviceId() {
     return this.deviceId;
   }
   
   public void setDeviceId(Long deviceId) {
     this.deviceId = deviceId;
   }
   
   public ActiveDeviceOutputPendency activationTime(Long activationTime) {
     this.activationTime = activationTime;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Tempo de ativação em milissegundos")
   public Long getActivationTime() {
     return this.activationTime;
   }
   
   public void setActivationTime(Long activationTime) {
     this.activationTime = activationTime;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ActiveDeviceOutputPendency activeDeviceOutputPendency = (ActiveDeviceOutputPendency)o;
     return (Objects.equals(this.pendencyId, activeDeviceOutputPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, activeDeviceOutputPendency.managerDeviceId) && 
       Objects.equals(this.deviceId, activeDeviceOutputPendency.deviceId) && 
       Objects.equals(this.activationTime, activeDeviceOutputPendency.activationTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.deviceId, this.activationTime });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ActiveDeviceOutputPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    activationTime: ").append(toIndentedString(this.activationTime)).append("\n");
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


