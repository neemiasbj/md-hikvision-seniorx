
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PendencyUpdated
 */

public class PendencyUpdated {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("errorCode")
	private Integer errorCode = null;

	/**
	 * Gets or Sets operation
	 */

	@SerializedName("operation")
	private OperationEnum operation = null;

	public PendencyUpdated pendencyId(Long pendencyId) {
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

	public PendencyUpdated errorCode(Integer errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	/**
	 * Código de erro
	 * 
	 * @return errorCode
	 **/
	@Schema(description = "Código de erro")
	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public PendencyUpdated operation(OperationEnum operation) {
		this.operation = operation;
		return this;
	}

	/**
	 * Get operation
	 * 
	 * @return operation
	 **/
	@Schema(description = "")
	public OperationEnum getOperation() {
		return operation;
	}

	public void setOperation(OperationEnum operation) {
		this.operation = operation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PendencyUpdated pendencyUpdated = (PendencyUpdated) o;
		return Objects.equals(this.pendencyId, pendencyUpdated.pendencyId) && Objects.equals(this.errorCode, pendencyUpdated.errorCode) && Objects.equals(this.operation, pendencyUpdated.operation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, errorCode, operation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PendencyUpdated {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
		sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
