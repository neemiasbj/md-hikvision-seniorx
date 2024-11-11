 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class TimezoneList
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("timezone")
   private List<Timezone> timezone = null;
   
   public TimezoneList id(Long id) {
     this.id = id;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Long getId() {
     return this.id;
   }
   
   public void setId(Long id) {
     this.id = id;
   }
   
   public TimezoneList timezone(List<Timezone> timezone) {
     this.timezone = timezone;
     return this;
   }
   
   public TimezoneList addTimezoneItem(Timezone timezoneItem) {
     if (this.timezone == null) {
       this.timezone = new ArrayList<>();
     }
     this.timezone.add(timezoneItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public List<Timezone> getTimezone() {
     return this.timezone;
   }
   
   public void setTimezone(List<Timezone> timezone) {
     this.timezone = timezone;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     TimezoneList timezoneList = (TimezoneList)o;
     return (Objects.equals(this.id, timezoneList.id) && 
       Objects.equals(this.timezone, timezoneList.timezone));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.timezone });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class TimezoneList {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    timezone: ").append(toIndentedString(this.timezone)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\TimezoneList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */