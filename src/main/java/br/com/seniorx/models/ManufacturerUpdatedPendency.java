 package br.com.seniorx.models;
import java.io.IOException;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 
 import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
<<<<<<< HEAD
 
 public class ManufacturerUpdatedPendency {
   @SerializedName("pendencyId")
   private Long pendencyId;
   @SerializedName("managerDeviceId")
   private Long managerDeviceId;
   @SerializedName("documentType")
   private DocumentTypeEnum documentType;
   @SerializedName("document")
   private String document;
   @SerializedName("companyName")
   private String companyName;
   @SerializedName("address")
   private String address;
   
   public ManufacturerUpdatedPendency() { this.pendencyId = null;
 
     
     this.managerDeviceId = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.documentType = null;
 
     
     this.document = null;
 
     
     this.companyName = null;
 
     
     this.address = null; }
 
   
   public ManufacturerUpdatedPendency pendencyId(Long pendencyId) { this.pendencyId = pendencyId;
     return this; }
 
 
 
 
 
   
   @Schema(description = "Identificador da pendência")
   public Long getPendencyId() {
     return this.pendencyId;
   }
   @JsonAdapter(DocumentTypeEnum.Adapter.class) public enum DocumentTypeEnum {
     CNPJ("CNPJ"), CEI("CEI"), CPF("CPF"); private String value; DocumentTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static DocumentTypeEnum fromValue(String text) { byte b; int i; DocumentTypeEnum[] arrayOfDocumentTypeEnum; for (i = (arrayOfDocumentTypeEnum = values()).length, b = 0; b < i; ) { DocumentTypeEnum documentTypeEnum = arrayOfDocumentTypeEnum[b]; if (String.valueOf(documentTypeEnum.value).equals(text)) return documentTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
       public void write(JsonWriter jsonWriter, ManufacturerUpdatedPendency.DocumentTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ManufacturerUpdatedPendency.DocumentTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ManufacturerUpdatedPendency.DocumentTypeEnum.fromValue(String.valueOf(value)); } } } public void setPendencyId(Long pendencyId) { this.pendencyId = pendencyId; }
 
   
   public ManufacturerUpdatedPendency managerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo gerenciador")
   public Long getManagerDeviceId() {
     return this.managerDeviceId;
   }
   
   public void setManagerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
   }
   
   public ManufacturerUpdatedPendency documentType(DocumentTypeEnum documentType) {
     this.documentType = documentType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public DocumentTypeEnum getDocumentType() {
     return this.documentType;
   }
   
   public void setDocumentType(DocumentTypeEnum documentType) {
     this.documentType = documentType;
   }
   
   public ManufacturerUpdatedPendency document(String document) {
     this.document = document;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Documento")
   public String getDocument() {
     return this.document;
   }
   
   public void setDocument(String document) {
     this.document = document;
   }
   
   public ManufacturerUpdatedPendency companyName(String companyName) {
     this.companyName = companyName;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Razão social")
   public String getCompanyName() {
     return this.companyName;
   }
   
   public void setCompanyName(String companyName) {
     this.companyName = companyName;
   }
   
   public ManufacturerUpdatedPendency address(String address) {
     this.address = address;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Endereço")
   public String getAddress() {
     return this.address;
   }
   
   public void setAddress(String address) {
     this.address = address;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ManufacturerUpdatedPendency manufacturerUpdatedPendency = (ManufacturerUpdatedPendency)o;
     return (Objects.equals(this.pendencyId, manufacturerUpdatedPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, manufacturerUpdatedPendency.managerDeviceId) && 
       Objects.equals(this.documentType, manufacturerUpdatedPendency.documentType) && 
       Objects.equals(this.document, manufacturerUpdatedPendency.document) && 
       Objects.equals(this.companyName, manufacturerUpdatedPendency.companyName) && 
       Objects.equals(this.address, manufacturerUpdatedPendency.address));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.documentType, this.document, this.companyName, this.address });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ManufacturerUpdatedPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    documentType: ").append(toIndentedString(this.documentType)).append("\n");
     sb.append("    document: ").append(toIndentedString(this.document)).append("\n");
     sb.append("    companyName: ").append(toIndentedString(this.companyName)).append("\n");
     sb.append("    address: ").append(toIndentedString(this.address)).append("\n");
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

/**
 * ManufacturerUpdatedPendency
 */

public class ManufacturerUpdatedPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  /**
   * Gets or Sets documentType
   */
  @JsonAdapter(DocumentTypeEnum.Adapter.class)
  public enum DocumentTypeEnum {
    CNPJ("CNPJ"),
    
    CEI("CEI"),
    
    CPF("CPF");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String text) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DocumentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("documentType")
  private DocumentTypeEnum documentType = null;

  @SerializedName("document")
  private String document = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("address")
  private String address = null;

  public ManufacturerUpdatedPendency pendencyId(Long pendencyId) {
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

  public ManufacturerUpdatedPendency managerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
    return this;
  }

   /**
   * Identificador do dispositivo gerenciador
   * @return managerDeviceId
  **/
  @Schema(description  = "Identificador do dispositivo gerenciador")
  public Long getManagerDeviceId() {
    return managerDeviceId;
  }

  public void setManagerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
  }

  public ManufacturerUpdatedPendency documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @Schema(description  = "")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public ManufacturerUpdatedPendency document(String document) {
    this.document = document;
    return this;
  }

   /**
   * Documento
   * @return document
  **/
  @Schema(description  = "Documento")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public ManufacturerUpdatedPendency companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Razão social
   * @return companyName
  **/
  @Schema(description  = "Razão social")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ManufacturerUpdatedPendency address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @Schema(description  = "Endereço")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ManufacturerUpdatedPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */