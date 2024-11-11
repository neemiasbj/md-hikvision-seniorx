 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class LoadHolidayListPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("holidayListId")
   private Long holidayListId = null;
   
   public LoadHolidayListPendency pendencyId(Long pendencyId) {
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
   
   public LoadHolidayListPendency managerDeviceId(Long managerDeviceId) {
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
   
   public LoadHolidayListPendency holidayListId(Long holidayListId) {
     this.holidayListId = holidayListId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da lista de feriados")
   public Long getHolidayListId() {
     return this.holidayListId;
   }
   
   public void setHolidayListId(Long holidayListId) {
     this.holidayListId = holidayListId;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     LoadHolidayListPendency loadHolidayListPendency = (LoadHolidayListPendency)o;
     return (Objects.equals(this.pendencyId, loadHolidayListPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, loadHolidayListPendency.managerDeviceId) && 
       Objects.equals(this.holidayListId, loadHolidayListPendency.holidayListId));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.holidayListId });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class LoadHolidayListPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    holidayListId: ").append(toIndentedString(this.holidayListId)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\LoadHolidayListPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */