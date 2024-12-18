 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class Masking
 {
   @SerializedName("startTime")
   private String startTime = null;
   
   @SerializedName("finishTime")
   private String finishTime = null;
   
   @SerializedName("normalDay")
   private Boolean normalDay = Boolean.valueOf(false);
   
   @SerializedName("saturday")
   private Boolean saturday = Boolean.valueOf(false);
   
   @SerializedName("sunday")
   private Boolean sunday = Boolean.valueOf(false);
   
   @SerializedName("holiday")
   private Boolean holiday = Boolean.valueOf(false);
   
   public Masking startTime(String startTime) {
     this.startTime = startTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getStartTime() {
     return this.startTime;
   }
   
   public void setStartTime(String startTime) {
     this.startTime = startTime;
   }
   
   public Masking finishTime(String finishTime) {
     this.finishTime = finishTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getFinishTime() {
     return this.finishTime;
   }
   
   public void setFinishTime(String finishTime) {
     this.finishTime = finishTime;
   }
   
   public Masking normalDay(Boolean normalDay) {
     this.normalDay = normalDay;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Boolean isNormalDay() {
     return this.normalDay;
   }
   
   public void setNormalDay(Boolean normalDay) {
     this.normalDay = normalDay;
   }
   
   public Masking saturday(Boolean saturday) {
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
   
   public Masking sunday(Boolean sunday) {
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
   
   public Masking holiday(Boolean holiday) {
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
     Masking masking = (Masking)o;
     return (Objects.equals(this.startTime, masking.startTime) && 
       Objects.equals(this.finishTime, masking.finishTime) && 
       Objects.equals(this.normalDay, masking.normalDay) && 
       Objects.equals(this.saturday, masking.saturday) && 
       Objects.equals(this.sunday, masking.sunday) && 
       Objects.equals(this.holiday, masking.holiday));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.startTime, this.finishTime, this.normalDay, this.saturday, this.sunday, this.holiday });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Masking {\n");
     
     sb.append("    startTime: ").append(toIndentedString(this.startTime)).append("\n");
     sb.append("    finishTime: ").append(toIndentedString(this.finishTime)).append("\n");
     sb.append("    normalDay: ").append(toIndentedString(this.normalDay)).append("\n");
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
=======
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\Masking.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */