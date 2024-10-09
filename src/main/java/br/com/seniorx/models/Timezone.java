package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Timezone
 */

public class Timezone {
  @SerializedName("start")
  private String start = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("monday")
  private Boolean monday = false;

  @SerializedName("tuesday")
  private Boolean tuesday = false;

  @SerializedName("wednesday")
  private Boolean wednesday = false;

  @SerializedName("thursday")
  private Boolean thursday = false;

  @SerializedName("friday")
  private Boolean friday = false;

  @SerializedName("saturday")
  private Boolean saturday = false;

  @SerializedName("sunday")
  private Boolean sunday = false;

  @SerializedName("holiday")
  private Boolean holiday = false;

  public Timezone start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description  = "")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public Timezone end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description  = "")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public Timezone monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @Schema(description  = "")
  public Boolean isMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public Timezone tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @Schema(description  = "")
  public Boolean isTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public Timezone wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @Schema(description  = "")
  public Boolean isWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public Timezone thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @Schema(description  = "")
  public Boolean isThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public Timezone friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @Schema(description  = "")
  public Boolean isFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public Timezone saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @Schema(description  = "")
  public Boolean isSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public Timezone sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @Schema(description  = "")
  public Boolean isSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public Timezone holiday(Boolean holiday) {
    this.holiday = holiday;
    return this;
  }

   /**
   * Get holiday
   * @return holiday
  **/
  @Schema(description  = "")
  public Boolean isHoliday() {
    return holiday;
  }

  public void setHoliday(Boolean holiday) {
    this.holiday = holiday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timezone timezone = (Timezone) o;
    return Objects.equals(this.start, timezone.start) &&
        Objects.equals(this.end, timezone.end) &&
        Objects.equals(this.monday, timezone.monday) &&
        Objects.equals(this.tuesday, timezone.tuesday) &&
        Objects.equals(this.wednesday, timezone.wednesday) &&
        Objects.equals(this.thursday, timezone.thursday) &&
        Objects.equals(this.friday, timezone.friday) &&
        Objects.equals(this.saturday, timezone.saturday) &&
        Objects.equals(this.sunday, timezone.sunday) &&
        Objects.equals(this.holiday, timezone.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, monday, tuesday, wednesday, thursday, friday, saturday, sunday, holiday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timezone {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

