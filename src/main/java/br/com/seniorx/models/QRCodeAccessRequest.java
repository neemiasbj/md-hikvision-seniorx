 package br.com.seniorx.models;
 import java.time.OffsetDateTime;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class QRCodeAccessRequest
 {
   @SerializedName("readerId")
   private Long readerId = null;
   
   @SerializedName("qrcode")
   private String qrcode = null;
   
   @SerializedName("requestDateTime")
   private OffsetDateTime requestDateTime = null;
   
   public QRCodeAccessRequest readerId(Long readerId) {
     this.readerId = readerId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public Long getReaderId() {
     return this.readerId;
   }
   
   public void setReaderId(Long readerId) {
     this.readerId = readerId;
   }
   
   public QRCodeAccessRequest qrcode(String qrcode) {
     this.qrcode = qrcode;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getQrcode() {
     return this.qrcode;
   }
   
   public void setQrcode(String qrcode) {
     this.qrcode = qrcode;
   }
   
   public QRCodeAccessRequest requestDateTime(OffsetDateTime requestDateTime) {
     this.requestDateTime = requestDateTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
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
     QRCodeAccessRequest qrCodeAccessRequest = (QRCodeAccessRequest)o;
     return (Objects.equals(this.readerId, qrCodeAccessRequest.readerId) && 
       Objects.equals(this.qrcode, qrCodeAccessRequest.qrcode) && 
       Objects.equals(this.requestDateTime, qrCodeAccessRequest.requestDateTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.readerId, this.qrcode, this.requestDateTime });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class QRCodeAccessRequest {\n");
     
     sb.append("    readerId: ").append(toIndentedString(this.readerId)).append("\n");
     sb.append("    qrcode: ").append(toIndentedString(this.qrcode)).append("\n");
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
import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * QRCodeAccessRequest
 */

public class QRCodeAccessRequest {
  @SerializedName("readerId")
  private Long readerId = null;

  @SerializedName("qrcode")
  private String qrcode = null;

  @SerializedName("requestDateTime")
  private OffsetDateTime requestDateTime = null;

  public QRCodeAccessRequest readerId(Long readerId) {
    this.readerId = readerId;
    return this;
  }

   /**
   * Get readerId
   * @return readerId
  **/
  @Schema(description  = "")
  public Long getReaderId() {
    return readerId;
  }

  public void setReaderId(Long readerId) {
    this.readerId = readerId;
  }

  public QRCodeAccessRequest qrcode(String qrcode) {
    this.qrcode = qrcode;
    return this;
  }

   /**
   * Get qrcode
   * @return qrcode
  **/
  @Schema(description  = "")
  public String getQrcode() {
    return qrcode;
  }

  public void setQrcode(String qrcode) {
    this.qrcode = qrcode;
  }

  public QRCodeAccessRequest requestDateTime(OffsetDateTime requestDateTime) {
    this.requestDateTime = requestDateTime;
    return this;
  }

   /**
   * Get requestDateTime
   * @return requestDateTime
  **/
  @Schema(description  = "")
  public OffsetDateTime getRequestDateTime() {
    return requestDateTime;
  }

  public void setRequestDateTime(OffsetDateTime requestDateTime) {
    this.requestDateTime = requestDateTime;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\QRCodeAccessRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */