 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class Timezone
 {
   @SerializedName("start")
   private String start = null;
   
   @SerializedName("end")
   private String end = null;
   
   @SerializedName("monday")
   private Boolean monday = Boolean.valueOf(false);
   
   @SerializedName("tuesday")
   private Boolean tuesday = Boolean.valueOf(false);
   
   @SerializedName("wednesday")
   private Boolean wednesday = Boolean.valueOf(false);
   
   @SerializedName("thursday")
   private Boolean thursday = Boolean.valueOf(false);
   
   @SerializedName("friday")
   private Boolean friday = Boolean.valueOf(false);
   
   @SerializedName("saturday")
   private Boolean saturday = Boolean.valueOf(false);
   
   @SerializedName("sunday")
   private Boolean sunday = Boolean.valueOf(false);
   
   @SerializedName("holiday")
   private Boolean holiday = Boolean.valueOf(false);
   
   public Timezone start(String start) {
     this.start = start;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getStart() {
     return this.start;
   }
   
   public void setStart(String start) {
     this.start = start;
   }
   
   public Timezone end(String end) {
     this.end = end;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getEnd() {
     return this.end;
   }
   
   public void setEnd(String end) {
     this.end = end;
   }
   
   public Timezone monday(Boolean monday) {
     this.monday = monday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isMonday() {
     return this.monday;
   }
   
   public void setMonday(Boolean monday) {
     this.monday = monday;
   }
   
   public Timezone tuesday(Boolean tuesday) {
     this.tuesday = tuesday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isTuesday() {
     return this.tuesday;
   }
   
   public void setTuesday(Boolean tuesday) {
     this.tuesday = tuesday;
   }
   
   public Timezone wednesday(Boolean wednesday) {
     this.wednesday = wednesday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isWednesday() {
     return this.wednesday;
   }
   
   public void setWednesday(Boolean wednesday) {
     this.wednesday = wednesday;
   }
   
   public Timezone thursday(Boolean thursday) {
     this.thursday = thursday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isThursday() {
     return this.thursday;
   }
   
   public void setThursday(Boolean thursday) {
     this.thursday = thursday;
   }
   
   public Timezone friday(Boolean friday) {
     this.friday = friday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isFriday() {
     return this.friday;
   }
   
   public void setFriday(Boolean friday) {
     this.friday = friday;
   }
   
   public Timezone saturday(Boolean saturday) {
     this.saturday = saturday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isSaturday() {
     return this.saturday;
   }
   
   public void setSaturday(Boolean saturday) {
     this.saturday = saturday;
   }
   
   public Timezone sunday(Boolean sunday) {
     this.sunday = sunday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isSunday() {
     return this.sunday;
   }
   
   public void setSunday(Boolean sunday) {
     this.sunday = sunday;
   }
   
   public Timezone holiday(Boolean holiday) {
     this.holiday = holiday;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isHoliday() {
     return this.holiday;
   }
   
   public void setHoliday(Boolean holiday) {
     this.holiday = holiday;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Timezone timezone = (Timezone)o;
     return (Objects.equals(this.start, timezone.start) && 
       Objects.equals(this.end, timezone.end) && 
       Objects.equals(this.monday, timezone.monday) && 
       Objects.equals(this.tuesday, timezone.tuesday) && 
       Objects.equals(this.wednesday, timezone.wednesday) && 
       Objects.equals(this.thursday, timezone.thursday) && 
       Objects.equals(this.friday, timezone.friday) && 
       Objects.equals(this.saturday, timezone.saturday) && 
       Objects.equals(this.sunday, timezone.sunday) && 
       Objects.equals(this.holiday, timezone.holiday));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.start, this.end, this.monday, this.tuesday, this.wednesday, this.thursday, this.friday, this.saturday, this.sunday, this.holiday });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Timezone {\n");
     
     sb.append("    start: ").append(toIndentedString(this.start)).append("\n");
     sb.append("    end: ").append(toIndentedString(this.end)).append("\n");
     sb.append("    monday: ").append(toIndentedString(this.monday)).append("\n");
     sb.append("    tuesday: ").append(toIndentedString(this.tuesday)).append("\n");
     sb.append("    wednesday: ").append(toIndentedString(this.wednesday)).append("\n");
     sb.append("    thursday: ").append(toIndentedString(this.thursday)).append("\n");
     sb.append("    friday: ").append(toIndentedString(this.friday)).append("\n");
     sb.append("    saturday: ").append(toIndentedString(this.saturday)).append("\n");
     sb.append("    sunday: ").append(toIndentedString(this.sunday)).append("\n");
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


