package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DeviceUpdatedPendency
 */

public class DeviceUpdatedPendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

	/**
	 * Status do dispositivo
	 */

	@SerializedName("operation")
	private OperationUpdateDeviceEnum operation = null;

	public DeviceUpdatedPendency pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		return this;
	}

	/**
	 * Identificador da pendência
	 * 
	 * @return pendencyId
	 **/
	@Schema(description  = "Identificador da pendência")
	public Long getPendencyId() {
		return pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public DeviceUpdatedPendency managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo gerenciador
	 * 
	 * @return managerDeviceId
	 **/
	@Schema(description  = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}

	public DeviceUpdatedPendency operation(OperationUpdateDeviceEnum operation) {
		this.operation = operation;
		return this;
	}

	/**
	 * Status do dispositivo
	 * 
	 * @return operation
	 **/
	@Schema(description  = "Status do dispositivo")
	public OperationUpdateDeviceEnum getOperation() {
		return operation;
	}

	public void setOperation(OperationUpdateDeviceEnum operation) {
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
		DeviceUpdatedPendency deviceUpdatedPendency = (DeviceUpdatedPendency) o;
		return Objects.equals(this.pendencyId, deviceUpdatedPendency.pendencyId) && Objects.equals(this.managerDeviceId, deviceUpdatedPendency.managerDeviceId) && Objects.equals(this.operation, deviceUpdatedPendency.operation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, managerDeviceId, operation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceUpdatedPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
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
