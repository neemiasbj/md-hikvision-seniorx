 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class CollectEventStatus
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("accessEventCount")
   private Long accessEventCount = null;
   
   @SerializedName("alarmEventCount")
   private Long alarmEventCount = null;
   
   public CollectEventStatus pendencyId(Long pendencyId) {
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
   
   public CollectEventStatus managerDeviceId(Long managerDeviceId) {
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
   
   public CollectEventStatus accessEventCount(Long accessEventCount) {
     this.accessEventCount = accessEventCount;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Long getAccessEventCount() {
     return this.accessEventCount;
   }
   
   public void setAccessEventCount(Long accessEventCount) {
     this.accessEventCount = accessEventCount;
   }
   
   public CollectEventStatus alarmEventCount(Long alarmEventCount) {
     this.alarmEventCount = alarmEventCount;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Long getAlarmEventCount() {
     return this.alarmEventCount;
   }
   
   public void setAlarmEventCount(Long alarmEventCount) {
     this.alarmEventCount = alarmEventCount;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CollectEventStatus collectEventStatus = (CollectEventStatus)o;
     return (Objects.equals(this.pendencyId, collectEventStatus.pendencyId) && 
       Objects.equals(this.managerDeviceId, collectEventStatus.managerDeviceId) && 
       Objects.equals(this.accessEventCount, collectEventStatus.accessEventCount) && 
       Objects.equals(this.alarmEventCount, collectEventStatus.alarmEventCount));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.accessEventCount, this.alarmEventCount });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CollectEventStatus {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    accessEventCount: ").append(toIndentedString(this.accessEventCount)).append("\n");
     sb.append("    alarmEventCount: ").append(toIndentedString(this.alarmEventCount)).append("\n");
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


