
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IncludeBiometry
 */

public class IncludeBiometry {
	/**
	 * Gets or Sets origin
	 */

	@SerializedName("origin")
	private TypeOriginEnum origin = null;

	@SerializedName("originId")
	private Long originId = null;

	/**
	 * Gets or Sets manufacturer
	 */

	@SerializedName("manufacturer")
	private ManufacturerEnum manufacturerEnum = null;

	@SerializedName("templateList")
	private List<String> templateList = null;

	public IncludeBiometry origin(TypeOriginEnum origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get origin
	 * 
	 * @return origin
	 **/
	@Schema(description = "")
	public TypeOriginEnum getOrigin() {
		return origin;
	}

	public void setOrigin(TypeOriginEnum origin) {
		this.origin = origin;
	}

	public IncludeBiometry originId(Long originId) {
		this.originId = originId;
		return this;
	}

	/**
	 * Identificador da origem do cadastro biométrico
	 * 
	 * @return originId
	 **/
	@Schema(description = "Identificador da origem do cadastro biométrico")
	public Long getOriginId() {
		return originId;
	}

	public void setOriginId(Long originId) {
		this.originId = originId;
	}

	public IncludeBiometry manufacturerEnum(ManufacturerEnum manufacturerEnum) {
		this.manufacturerEnum = manufacturerEnum;
		return this;
	}

	/**
	 * Get manufacturer
	 * 
	 * @return manufacturer
	 **/
	@Schema(description = "")
	public ManufacturerEnum getManufacturer() {
		return manufacturerEnum;
	}

	public void setManufacturer(ManufacturerEnum manufacturerEnum) {
		this.manufacturerEnum = manufacturerEnum;
	}

	public IncludeBiometry templateList(List<String> templateList) {
		this.templateList = templateList;
		return this;
	}

	public IncludeBiometry addTemplateListItem(String templateListItem) {
		if (this.templateList == null) {
			this.templateList = new ArrayList<String>();
		}
		this.templateList.add(templateListItem);
		return this;
	}

	/**
	 * Codificado em base64
	 * 
	 * @return templateList
	 **/
	@Schema(description = "Codificado em base64")
	public List<String> getTemplateList() {
		return templateList;
	}

	public void setTemplateList(List<String> templateList) {
		this.templateList = templateList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IncludeBiometry includeBiometry = (IncludeBiometry) o;
		return Objects.equals(this.origin, includeBiometry.origin) && Objects.equals(this.originId, includeBiometry.originId) && Objects.equals(this.manufacturerEnum, includeBiometry.manufacturerEnum) && Objects.equals(this.templateList, includeBiometry.templateList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(origin, originId, manufacturerEnum, templateList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IncludeBiometry {\n");

		sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
		sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
		sb.append("    manufacturer: ").append(toIndentedString(manufacturerEnum)).append("\n");
		sb.append("    templateList: ").append(toIndentedString(templateList)).append("\n");
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
