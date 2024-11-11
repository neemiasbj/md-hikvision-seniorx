 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class HealthcheckResponse
 {
   @SerializedName("status")
   private StatusEnum status;
   @SerializedName("checks")
   private List<HealthcheckItemResponse> checks;
   
   public HealthcheckResponse() {
     this.status = null;
 
     
     this.checks = null;
   }
   
   public HealthcheckResponse status(StatusEnum status) { this.status = status;
     return this; }
 
 
 
 
 
   
   @Schema(description = "")
   public StatusEnum getStatus() {
     return this.status;
   }
   @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum {
     UP("UP"), DOWN("DOWN"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum; for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) { StatusEnum statusEnum = arrayOfStatusEnum[b]; if (String.valueOf(statusEnum.value).equals(text)) return statusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<StatusEnum> {
       public void write(JsonWriter jsonWriter, HealthcheckResponse.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public HealthcheckResponse.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return HealthcheckResponse.StatusEnum.fromValue(String.valueOf(value)); } } } public void setStatus(StatusEnum status) { this.status = status; }
 
   
   public HealthcheckResponse checks(List<HealthcheckItemResponse> checks) {
     this.checks = checks;
     return this;
   }
   
   public HealthcheckResponse addChecksItem(HealthcheckItemResponse checksItem) {
     if (this.checks == null) {
       this.checks = new ArrayList<>();
     }
     this.checks.add(checksItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public List<HealthcheckItemResponse> getChecks() {
     return this.checks;
   }
   
   public void setChecks(List<HealthcheckItemResponse> checks) {
     this.checks = checks;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     HealthcheckResponse healthcheckResponse = (HealthcheckResponse)o;
     return (Objects.equals(this.status, healthcheckResponse.status) && 
       Objects.equals(this.checks, healthcheckResponse.checks));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.status, this.checks });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class HealthcheckResponse {\n");
     
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
     sb.append("    checks: ").append(toIndentedString(this.checks)).append("\n");
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * HealthcheckResponse
 */

public class HealthcheckResponse {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UP("UP"),
    
    DOWN("DOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("checks")
  private List<HealthcheckItemResponse> checks = null;

  public HealthcheckResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description  = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public HealthcheckResponse checks(List<HealthcheckItemResponse> checks) {
    this.checks = checks;
    return this;
  }

  public HealthcheckResponse addChecksItem(HealthcheckItemResponse checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<HealthcheckItemResponse>();
    }
    this.checks.add(checksItem);
    return this;
  }

   /**
   * Get checks
   * @return checks
  **/
  @Schema(description  = "")
  public List<HealthcheckItemResponse> getChecks() {
    return checks;
  }

  public void setChecks(List<HealthcheckItemResponse> checks) {
    this.checks = checks;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\HealthcheckResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */