 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class DriverDateTime
 {
   @SerializedName("dateTime")
   private String dateTime = null;
   
   public DriverDateTime dateTime(String dateTime) {
     this.dateTime = dateTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getDateTime() {
     return this.dateTime;
   }
   
   public void setDateTime(String dateTime) {
     this.dateTime = dateTime;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DriverDateTime driverDateTime = (DriverDateTime)o;
     return Objects.equals(this.dateTime, driverDateTime.dateTime);
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.dateTime });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DriverDateTime {\n");
     
     sb.append("    dateTime: ").append(toIndentedString(this.dateTime)).append("\n");
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
 * DriverDateTime
 */

public class DriverDateTime {
  @SerializedName("dateTime")
  private String dateTime = null;

  public DriverDateTime dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @Schema(description  = "")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DriverDateTime.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */