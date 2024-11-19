 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class StatusField
 {
   @SerializedName("key")
   private String key = null;
   
   @SerializedName("value")
   private String value = null;
   
   public StatusField key(String key) {
     this.key = key;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getKey() {
     return this.key;
   }
   
   public void setKey(String key) {
     this.key = key;
   }
   
   public StatusField value(String value) {
     this.value = value;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getValue() {
     return this.value;
   }
   
   public void setValue(String value) {
     this.value = value;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     StatusField statusField = (StatusField)o;
     return (Objects.equals(this.key, statusField.key) && 
       Objects.equals(this.value, statusField.value));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.key, this.value });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class StatusField {\n");
     
     sb.append("    key: ").append(toIndentedString(this.key)).append("\n");
     sb.append("    value: ").append(toIndentedString(this.value)).append("\n");
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


