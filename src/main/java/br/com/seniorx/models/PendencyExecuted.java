 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PendencyExecuted
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   public PendencyExecuted pendencyId(Long pendencyId) {
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
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PendencyExecuted pendencyExecuted = (PendencyExecuted)o;
     return Objects.equals(this.pendencyId, pendencyExecuted.pendencyId);
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PendencyExecuted {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
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
 * PendencyExecuted
 */

public class PendencyExecuted {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  public PendencyExecuted pendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
    return this;
  }

   /**
   * Identificador da pendência
   * @return pendencyId
  **/
  @Schema(description  = "Identificador da pendência")
  public Long getPendencyId() {
    return pendencyId;
  }

  public void setPendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\PendencyExecuted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */