
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

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
	 * 
	 * @return pendencyId
	 **/
	@Schema(description = "Identificador da pendência")
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
	 * 
	 * @return managerDeviceId
	 **/
	@Schema(description = "Identificador do dispositivo gerenciador")
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
	 * 
	 * @return documentType
	 **/
	@Schema(description = "")
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
	 * 
	 * @return document
	 **/
	@Schema(description = "Documento")
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
	 * 
	 * @return companyName
	 **/
	@Schema(description = "Razão social")
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
	 * 
	 * @return address
	 **/
	@Schema(description = "Endereço")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ManufacturerUpdatedPendency manufacturerUpdatedPendency = (ManufacturerUpdatedPendency) o;
		return Objects.equals(this.pendencyId, manufacturerUpdatedPendency.pendencyId) && Objects.equals(this.managerDeviceId, manufacturerUpdatedPendency.managerDeviceId) && Objects.equals(this.documentType, manufacturerUpdatedPendency.documentType)
				&& Objects.equals(this.document, manufacturerUpdatedPendency.document) && Objects.equals(this.companyName, manufacturerUpdatedPendency.companyName) && Objects.equals(this.address, manufacturerUpdatedPendency.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, managerDeviceId, documentType, document, companyName, address);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ManufacturerUpdatedPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
		sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
		sb.append("    document: ").append(toIndentedString(document)).append("\n");
		sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
