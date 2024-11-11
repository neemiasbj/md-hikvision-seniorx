 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class ExtensibleProperty
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("key")
   private String key = null;
   
   @SerializedName("value")
   private String value = null;
   
   public ExtensibleProperty id(Long id) {
     this.id = id;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Long getId() {
     return this.id;
   }
   
   public void setId(Long id) {
     this.id = id;
   }
   
   public ExtensibleProperty key(String key) {
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
   
   public ExtensibleProperty value(String value) {
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
     ExtensibleProperty extensibleProperty = (ExtensibleProperty)o;
     return (Objects.equals(this.id, extensibleProperty.id) && 
       Objects.equals(this.key, extensibleProperty.key) && 
       Objects.equals(this.value, extensibleProperty.value));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.key, this.value });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ExtensibleProperty {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
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
=======
import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExtensibleProperty
 */

public class ExtensibleProperty {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public ExtensibleProperty id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description  = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ExtensibleProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description  = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ExtensibleProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description  = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ExtensibleProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */