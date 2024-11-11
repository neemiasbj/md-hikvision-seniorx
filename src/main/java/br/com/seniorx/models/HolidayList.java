 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class HolidayList
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("holiday")
   private List<String> holiday = null;
   
   public HolidayList id(Long id) {
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
   
   public HolidayList holiday(List<String> holiday) {
     this.holiday = holiday;
     return this;
   }
   
   public HolidayList addHolidayItem(String holidayItem) {
     if (this.holiday == null) {
       this.holiday = new ArrayList<>();
     }
     this.holiday.add(holidayItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public List<String> getHoliday() {
     return this.holiday;
   }
   
   public void setHoliday(List<String> holiday) {
     this.holiday = holiday;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     HolidayList holidayList = (HolidayList)o;
     return (Objects.equals(this.id, holidayList.id) && 
       Objects.equals(this.holiday, holidayList.holiday));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.holiday });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class HolidayList {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    holiday: ").append(toIndentedString(this.holiday)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\HolidayList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */