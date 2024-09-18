
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BiometricTechnologyTemplatesList
 */

public class BiometricTechnologyTemplatesList {
	/**
	 * Gets or Sets manufacturer
	 */

	@SerializedName("manufacturer")
	private ManufacturerEnum manufacturer = null;

	@SerializedName("biometrySecurityLevel")
	private Integer biometrySecurityLevel = null;

	@SerializedName("templates")
	private List<String> templates = null;

	public BiometricTechnologyTemplatesList manufacturer(ManufacturerEnum manufacturer) {
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

	public BiometricTechnologyTemplatesList biometrySecurityLevel(Integer biometrySecurityLevel) {
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

	public BiometricTechnologyTemplatesList templates(List<String> templates) {
		this.templates = templates;
		return this;
	}

	public BiometricTechnologyTemplatesList addTemplatesItem(String templatesItem) {
		if (this.templates == null) {
			this.templates = new ArrayList<String>();
		}
		this.templates.add(templatesItem);
		return this;
	}

	/**
	 * Codificado em base64
	 * 
	 * @return templates
	 **/
	@Schema(description = "Codificado em base64")
	public List<String> getTemplates() {
		return templates;
	}

	public void setTemplates(List<String> templates) {
		this.templates = templates;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BiometricTechnologyTemplatesList biometricTechnologyTemplatesList = (BiometricTechnologyTemplatesList) o;
		return Objects.equals(this.manufacturer, biometricTechnologyTemplatesList.manufacturer) && Objects.equals(this.biometrySecurityLevel, biometricTechnologyTemplatesList.biometrySecurityLevel) && Objects.equals(this.templates, biometricTechnologyTemplatesList.templates);
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturer, biometrySecurityLevel, templates);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BiometricTechnologyTemplatesList {\n");

		sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
		sb.append("    biometrySecurityLevel: ").append(toIndentedString(biometrySecurityLevel)).append("\n");
		sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
