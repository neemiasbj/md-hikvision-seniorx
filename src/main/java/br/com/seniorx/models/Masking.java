package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Masking
 */

public class Masking {
  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("finishTime")
  private String finishTime = null;

  @SerializedName("normalDay")
  private Boolean normalDay = false;

  @SerializedName("saturday")
  private Boolean saturday = false;

  @SerializedName("sunday")
  private Boolean sunday = false;

  @SerializedName("holiday")
  private Boolean holiday = false;

  public Masking startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description  = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Masking finishTime(String finishTime) {
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Get finishTime
   * @return finishTime
  **/
  @Schema(description  = "")
  public String getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }

  public Masking normalDay(Boolean normalDay) {
    this.normalDay = normalDay;
    return this;
  }

   /**
   * Get normalDay
   * @return normalDay
  **/
  @Schema(description  = "")
  public Boolean isNormalDay() {
    return normalDay;
  }

  public void setNormalDay(Boolean normalDay) {
    this.normalDay = normalDay;
  }

  public Masking saturday(Boolean saturday) {
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

  public Masking sunday(Boolean sunday) {
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

  public Masking holiday(Boolean holiday) {
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
    Masking masking = (Masking) o;
    return Objects.equals(this.startTime, masking.startTime) &&
        Objects.equals(this.finishTime, masking.finishTime) &&
        Objects.equals(this.normalDay, masking.normalDay) &&
        Objects.equals(this.saturday, masking.saturday) &&
        Objects.equals(this.sunday, masking.sunday) &&
        Objects.equals(this.holiday, masking.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, finishTime, normalDay, saturday, sunday, holiday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Masking {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    normalDay: ").append(toIndentedString(normalDay)).append("\n");
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

