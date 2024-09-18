
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LprValidationResponse
 */

public class LprValidationResponse {
	/**
	 * Gets or Sets accessType
	 */

	@SerializedName("accessType")
	private AccessTypeEnum accessType = null;

	public LprValidationResponse accessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
		return this;
	}

	/**
	 * Get accessType
	 * 
	 * @return accessType
	 **/
	@Schema(description = "")
	public AccessTypeEnum getAccessType() {
		return accessType;
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LprValidationResponse lprValidationResponse = (LprValidationResponse) o;
		return Objects.equals(this.accessType, lprValidationResponse.accessType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LprValidationResponse {\n");

		sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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
