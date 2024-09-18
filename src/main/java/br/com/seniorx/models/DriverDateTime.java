
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DriverDateTime
 */

public class DriverDateTime {
	@SerializedName("dateTime")
	private String dateTime = null;

	public DriverDateTime dateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	/**
	 * Get dateTime
	 * 
	 * @return dateTime
	 **/
	@Schema(description = "")
	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DriverDateTime driverDateTime = (DriverDateTime) o;
		return Objects.equals(this.dateTime, driverDateTime.dateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DriverDateTime {\n");

		sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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
