 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class InputActivation
 {
   @SerializedName("outputId")
   private Long outputId = null;
   
   @SerializedName("activationTime")
   private Integer activationTime = null;
   
   public InputActivation outputId(Long outputId) {
     this.outputId = outputId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Long getOutputId() {
     return this.outputId;
   }
   
   public void setOutputId(Long outputId) {
     this.outputId = outputId;
   }
   
   public InputActivation activationTime(Integer activationTime) {
     this.activationTime = activationTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Quantidade em milissegundos de tempo em que a ativação será executada (zero é para sempre)")
   public Integer getActivationTime() {
     return this.activationTime;
   }
   
   public void setActivationTime(Integer activationTime) {
     this.activationTime = activationTime;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     InputActivation inputActivation = (InputActivation)o;
     return (Objects.equals(this.outputId, inputActivation.outputId) && 
       Objects.equals(this.activationTime, inputActivation.activationTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.outputId, this.activationTime });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class InputActivation {\n");
     
     sb.append("    outputId: ").append(toIndentedString(this.outputId)).append("\n");
     sb.append("    activationTime: ").append(toIndentedString(this.activationTime)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\InputActivation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */