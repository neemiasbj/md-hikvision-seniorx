
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DriverManufacturer
 */

public class DriverManufacturer {
	@SerializedName("manufacturerName")
	private String manufacturerName = null;

	public DriverManufacturer manufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
		return this;
	}

	/**
	 * Nome do fabricante do driver atualizado
	 * 
	 * @return manufacturerName
	 **/
	@Schema(description = "Nome do fabricante do driver atualizado")
	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DriverManufacturer driverManufacturer = (DriverManufacturer) o;
		return Objects.equals(this.manufacturerName, driverManufacturer.manufacturerName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturerName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DriverManufacturer {\n");

		sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
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
