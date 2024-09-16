package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * HolidayList
 */

public class HolidayList {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("holiday")
  private List<String> holiday = null;

  public HolidayList id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
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
      this.holiday = new ArrayList<String>();
    }
    this.holiday.add(holidayItem);
    return this;
  }

   /**
   * Get holiday
   * @return holiday
  **/
  @ApiModelProperty(value = "")
  public List<String> getHoliday() {
    return holiday;
  }

  public void setHoliday(List<String> holiday) {
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
    HolidayList holidayList = (HolidayList) o;
    return Objects.equals(this.id, holidayList.id) &&
        Objects.equals(this.holiday, holidayList.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, holiday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolidayList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

