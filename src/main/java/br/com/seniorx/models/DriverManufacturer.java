 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class DriverManufacturer
 {
   @SerializedName("manufacturerName")
   private String manufacturerName = null;
   
   public DriverManufacturer manufacturerName(String manufacturerName) {
     this.manufacturerName = manufacturerName;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nome do fabricante do driver atualizado")
   public String getManufacturerName() {
     return this.manufacturerName;
   }
   
   public void setManufacturerName(String manufacturerName) {
     this.manufacturerName = manufacturerName;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DriverManufacturer driverManufacturer = (DriverManufacturer)o;
     return Objects.equals(this.manufacturerName, driverManufacturer.manufacturerName);
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.manufacturerName });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DriverManufacturer {\n");
     
     sb.append("    manufacturerName: ").append(toIndentedString(this.manufacturerName)).append("\n");
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
 * DriverManufacturer
 */

public class DriverManufacturer {
  @SerializedName("manufacturerName")
  private String manufacturerName = null;

  public DriverManufacturer manufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
    return this;
  }

   /**
   * Nome do fabricante do driver atualizado
   * @return manufacturerName
  **/
  @Schema(description  = "Nome do fabricante do driver atualizado")
  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DriverManufacturer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */