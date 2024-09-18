
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DriverStatusInput
 */

public class DriverStatusInput {
	@SerializedName("driverIds")
	private List<Long> driverIds = null;

	public DriverStatusInput driverIds(List<Long> driverIds) {
		this.driverIds = driverIds;
		return this;
	}

	public DriverStatusInput addDriverIdsItem(Long driverIdsItem) {
		if (this.driverIds == null) {
			this.driverIds = new ArrayList<Long>();
		}
		this.driverIds.add(driverIdsItem);
		return this;
	}

	/**
	 * Get driverIds
	 * 
	 * @return driverIds
	 **/
	@Schema(description = "")
	public List<Long> getDriverIds() {
		return driverIds;
	}

	public void setDriverIds(List<Long> driverIds) {
		this.driverIds = driverIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DriverStatusInput driverStatusInput = (DriverStatusInput) o;
		return Objects.equals(this.driverIds, driverStatusInput.driverIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(driverIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DriverStatusInput {\n");

		sb.append("    driverIds: ").append(toIndentedString(driverIds)).append("\n");
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
