package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class ActiveDeviceOutputPendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

	@SerializedName("deviceId")
	private Long deviceId = null;

	@SerializedName("activationTime")
	private Long activationTime = null;

	public ActiveDeviceOutputPendency pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		return this;
	}

	/**
	 * Identificador da pendência
	 * 
	 * @return pendencyId
	 **/
	@ApiModelProperty(value = "Identificador da pendência")
	public Long getPendencyId() {
		return pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public ActiveDeviceOutputPendency managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo gerenciador
	 * 
	 * @return managerDeviceId
	 **/
	@ApiModelProperty(value = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}

	public ActiveDeviceOutputPendency deviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo
	 * 
	 * @return deviceId
	 **/
	@ApiModelProperty(value = "Identificador do dispositivo")
	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public ActiveDeviceOutputPendency activationTime(Long activationTime) {
		this.activationTime = activationTime;
		return this;
	}

	/**
	 * Tempo de ativação em milissegundos
	 * 
	 * @return activationTime
	 **/
	@ApiModelProperty(value = "Tempo de ativação em milissegundos")
	public Long getActivationTime() {
		return activationTime;
	}

	public void setActivationTime(Long activationTime) {
		this.activationTime = activationTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ActiveDeviceOutputPendency activeDeviceOutputPendency = (ActiveDeviceOutputPendency) o;
		return Objects.equals(this.pendencyId, activeDeviceOutputPendency.pendencyId)
				&& Objects.equals(this.managerDeviceId, activeDeviceOutputPendency.managerDeviceId)
				&& Objects.equals(this.deviceId, activeDeviceOutputPendency.deviceId)
				&& Objects.equals(this.activationTime, activeDeviceOutputPendency.activationTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, managerDeviceId, deviceId, activationTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ActiveDeviceOutputPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
		sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
		sb.append("    activationTime: ").append(toIndentedString(activationTime)).append("\n");
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
