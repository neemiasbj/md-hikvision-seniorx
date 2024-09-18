
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Biometry
 */

public class Biometry {
	/**
	 * Gets or Sets manufacturer
	 */

	@SerializedName("manufacturer")
	private ManufacturerEnum manufacturer = null;

	@SerializedName("biometrySecurityLevel")
	private Integer biometrySecurityLevel = null;

	@SerializedName("templateList")
	private List<String> templateList = null;

	public Biometry manufacturer(ManufacturerEnum manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * Get manufacturer
	 * 
	 * @return manufacturer
	 **/
	@Schema(description = "")
	public ManufacturerEnum getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(ManufacturerEnum manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Biometry biometrySecurityLevel(Integer biometrySecurityLevel) {
		this.biometrySecurityLevel = biometrySecurityLevel;
		return this;
	}

	/**
	 * Nível de segurança biométrica
	 * 
	 * @return biometrySecurityLevel
	 **/
	@Schema(description = "Nível de segurança biométrica")
	public Integer getBiometrySecurityLevel() {
		return biometrySecurityLevel;
	}

	public void setBiometrySecurityLevel(Integer biometrySecurityLevel) {
		this.biometrySecurityLevel = biometrySecurityLevel;
	}

	public Biometry templateList(List<String> templateList) {
		this.templateList = templateList;
		return this;
	}

	public Biometry addTemplateListItem(String templateListItem) {
		if (this.templateList == null) {
			this.templateList = new ArrayList<String>();
		}
		this.templateList.add(templateListItem);
		return this;
	}

	/**
	 * Caracteres codificados em base64
	 * 
	 * @return templateList
	 **/
	@Schema(description = "Caracteres codificados em base64")
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
		Biometry biometry = (Biometry) o;
		return Objects.equals(this.manufacturer, biometry.manufacturer) && Objects.equals(this.biometrySecurityLevel, biometry.biometrySecurityLevel) && Objects.equals(this.templateList, biometry.templateList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturer, biometrySecurityLevel, templateList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Biometry {\n");

		sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
		sb.append("    biometrySecurityLevel: ").append(toIndentedString(biometrySecurityLevel)).append("\n");
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
