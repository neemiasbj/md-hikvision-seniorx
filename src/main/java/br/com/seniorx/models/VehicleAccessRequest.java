 package br.com.seniorx.models;
import java.io.IOException;
import java.time.OffsetDateTime;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 
 import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class VehicleAccessRequest {
   @SerializedName("readerId")
   private Long readerId;
   @SerializedName("vehicleCredentialFormat")
   private VehicleCredentialFormatEnum vehicleCredentialFormat;
   @SerializedName("vehicleCredential")
   private String vehicleCredential;
   @SerializedName("authorizerPersonCardNumber")
   private Long authorizerPersonCardNumber;
   @SerializedName("authorizerPersonId")
   private Long authorizerPersonId;
   @SerializedName("requestDateTime")
   private OffsetDateTime requestDateTime;
   
   public VehicleAccessRequest() { this.readerId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.vehicleCredentialFormat = null;
 
     
     this.vehicleCredential = null;
 
     
     this.authorizerPersonCardNumber = null;
 
     
     this.authorizerPersonId = null;
 
     
     this.requestDateTime = null; }
 
   
   public VehicleAccessRequest readerId(Long readerId) { this.readerId = readerId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador da leitora")
   public Long getReaderId() {
     return this.readerId;
   }
   @JsonAdapter(VehicleCredentialFormatEnum.Adapter.class) public enum VehicleCredentialFormatEnum {
     LICENSE_PLATE("LICENSE_PLATE"), CARD("CARD"); private String value; VehicleCredentialFormatEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static VehicleCredentialFormatEnum fromValue(String text) { byte b; int i; VehicleCredentialFormatEnum[] arrayOfVehicleCredentialFormatEnum; for (i = (arrayOfVehicleCredentialFormatEnum = values()).length, b = 0; b < i; ) { VehicleCredentialFormatEnum vehicleCredentialFormatEnum = arrayOfVehicleCredentialFormatEnum[b]; if (String.valueOf(vehicleCredentialFormatEnum.value).equals(text)) return vehicleCredentialFormatEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<VehicleCredentialFormatEnum> {
       public void write(JsonWriter jsonWriter, VehicleAccessRequest.VehicleCredentialFormatEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public VehicleAccessRequest.VehicleCredentialFormatEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return VehicleAccessRequest.VehicleCredentialFormatEnum.fromValue(String.valueOf(value)); } } } public void setReaderId(Long readerId) { this.readerId = readerId; }
 
   
   public VehicleAccessRequest vehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
     this.vehicleCredentialFormat = vehicleCredentialFormat;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Formato da credencial do veículo")
   public VehicleCredentialFormatEnum getVehicleCredentialFormat() {
     return this.vehicleCredentialFormat;
   }
   
   public void setVehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
     this.vehicleCredentialFormat = vehicleCredentialFormat;
   }
   
   public VehicleAccessRequest vehicleCredential(String vehicleCredential) {
     this.vehicleCredential = vehicleCredential;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Credencial do veículo")
   public String getVehicleCredential() {
     return this.vehicleCredential;
   }
   
   public void setVehicleCredential(String vehicleCredential) {
     this.vehicleCredential = vehicleCredential;
   }
   
   public VehicleAccessRequest authorizerPersonCardNumber(Long authorizerPersonCardNumber) {
     this.authorizerPersonCardNumber = authorizerPersonCardNumber;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Número do cartão da pessoa autorizadora")
   public Long getAuthorizerPersonCardNumber() {
     return this.authorizerPersonCardNumber;
   }
   
   public void setAuthorizerPersonCardNumber(Long authorizerPersonCardNumber) {
     this.authorizerPersonCardNumber = authorizerPersonCardNumber;
   }
   
   public VehicleAccessRequest authorizerPersonId(Long authorizerPersonId) {
     this.authorizerPersonId = authorizerPersonId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da pessoa autorizadora")
   public Long getAuthorizerPersonId() {
     return this.authorizerPersonId;
   }
   
   public void setAuthorizerPersonId(Long authorizerPersonId) {
     this.authorizerPersonId = authorizerPersonId;
   }
   
   public VehicleAccessRequest requestDateTime(OffsetDateTime requestDateTime) {
     this.requestDateTime = requestDateTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Data e hora da requisição")
   public OffsetDateTime getRequestDateTime() {
     return this.requestDateTime;
   }
   
   public void setRequestDateTime(OffsetDateTime requestDateTime) {
     this.requestDateTime = requestDateTime;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     VehicleAccessRequest vehicleAccessRequest = (VehicleAccessRequest)o;
     return (Objects.equals(this.readerId, vehicleAccessRequest.readerId) && 
       Objects.equals(this.vehicleCredentialFormat, vehicleAccessRequest.vehicleCredentialFormat) && 
       Objects.equals(this.vehicleCredential, vehicleAccessRequest.vehicleCredential) && 
       Objects.equals(this.authorizerPersonCardNumber, vehicleAccessRequest.authorizerPersonCardNumber) && 
       Objects.equals(this.authorizerPersonId, vehicleAccessRequest.authorizerPersonId) && 
       Objects.equals(this.requestDateTime, vehicleAccessRequest.requestDateTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.readerId, this.vehicleCredentialFormat, this.vehicleCredential, this.authorizerPersonCardNumber, this.authorizerPersonId, this.requestDateTime });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class VehicleAccessRequest {\n");
     
     sb.append("    readerId: ").append(toIndentedString(this.readerId)).append("\n");
     sb.append("    vehicleCredentialFormat: ").append(toIndentedString(this.vehicleCredentialFormat)).append("\n");
     sb.append("    vehicleCredential: ").append(toIndentedString(this.vehicleCredential)).append("\n");
     sb.append("    authorizerPersonCardNumber: ").append(toIndentedString(this.authorizerPersonCardNumber)).append("\n");
     sb.append("    authorizerPersonId: ").append(toIndentedString(this.authorizerPersonId)).append("\n");
     sb.append("    requestDateTime: ").append(toIndentedString(this.requestDateTime)).append("\n");
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
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * VehicleAccessRequest
 */

public class VehicleAccessRequest {
  @SerializedName("readerId")
  private Long readerId = null;

  /**
   * Formato da credencial do veículo
   */
  @JsonAdapter(VehicleCredentialFormatEnum.Adapter.class)
  public enum VehicleCredentialFormatEnum {
    LICENSE_PLATE("LICENSE_PLATE"),
    
    CARD("CARD");

    private String value;

    VehicleCredentialFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VehicleCredentialFormatEnum fromValue(String text) {
      for (VehicleCredentialFormatEnum b : VehicleCredentialFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VehicleCredentialFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VehicleCredentialFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VehicleCredentialFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VehicleCredentialFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("vehicleCredentialFormat")
  private VehicleCredentialFormatEnum vehicleCredentialFormat = null;

  @SerializedName("vehicleCredential")
  private String vehicleCredential = null;

  @SerializedName("authorizerPersonCardNumber")
  private Long authorizerPersonCardNumber = null;

  @SerializedName("authorizerPersonId")
  private Long authorizerPersonId = null;

  @SerializedName("requestDateTime")
  private OffsetDateTime requestDateTime = null;

  public VehicleAccessRequest readerId(Long readerId) {
    this.readerId = readerId;
    return this;
  }

   /**
   * Identificador da leitora
   * @return readerId
  **/
  @Schema(description  = "Identificador da leitora")
  public Long getReaderId() {
    return readerId;
  }

  public void setReaderId(Long readerId) {
    this.readerId = readerId;
  }

  public VehicleAccessRequest vehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
    this.vehicleCredentialFormat = vehicleCredentialFormat;
    return this;
  }

   /**
   * Formato da credencial do veículo
   * @return vehicleCredentialFormat
  **/
  @Schema(description  = "Formato da credencial do veículo")
  public VehicleCredentialFormatEnum getVehicleCredentialFormat() {
    return vehicleCredentialFormat;
  }

  public void setVehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
    this.vehicleCredentialFormat = vehicleCredentialFormat;
  }

  public VehicleAccessRequest vehicleCredential(String vehicleCredential) {
    this.vehicleCredential = vehicleCredential;
    return this;
  }

   /**
   * Credencial do veículo
   * @return vehicleCredential
  **/
  @Schema(description  = "Credencial do veículo")
  public String getVehicleCredential() {
    return vehicleCredential;
  }

  public void setVehicleCredential(String vehicleCredential) {
    this.vehicleCredential = vehicleCredential;
  }

  public VehicleAccessRequest authorizerPersonCardNumber(Long authorizerPersonCardNumber) {
    this.authorizerPersonCardNumber = authorizerPersonCardNumber;
    return this;
  }

   /**
   * Número do cartão da pessoa autorizadora
   * @return authorizerPersonCardNumber
  **/
  @Schema(description  = "Número do cartão da pessoa autorizadora")
  public Long getAuthorizerPersonCardNumber() {
    return authorizerPersonCardNumber;
  }

  public void setAuthorizerPersonCardNumber(Long authorizerPersonCardNumber) {
    this.authorizerPersonCardNumber = authorizerPersonCardNumber;
  }

  public VehicleAccessRequest authorizerPersonId(Long authorizerPersonId) {
    this.authorizerPersonId = authorizerPersonId;
    return this;
  }

   /**
   * Identificador da pessoa autorizadora
   * @return authorizerPersonId
  **/
  @Schema(description  = "Identificador da pessoa autorizadora")
  public Long getAuthorizerPersonId() {
    return authorizerPersonId;
  }

  public void setAuthorizerPersonId(Long authorizerPersonId) {
    this.authorizerPersonId = authorizerPersonId;
  }

  public VehicleAccessRequest requestDateTime(OffsetDateTime requestDateTime) {
    this.requestDateTime = requestDateTime;
    return this;
  }

   /**
   * Data e hora da requisição
   * @return requestDateTime
  **/
  @Schema(description  = "Data e hora da requisição")
  public OffsetDateTime getRequestDateTime() {
    return requestDateTime;
  }

  public void setRequestDateTime(OffsetDateTime requestDateTime) {
    this.requestDateTime = requestDateTime;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\VehicleAccessRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */