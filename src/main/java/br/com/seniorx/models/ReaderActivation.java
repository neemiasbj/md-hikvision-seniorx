
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ReaderActivation
 */

public class ReaderActivation {
	@SerializedName("actionEventType")
	private Integer actionEventType = null;

	@SerializedName("outputId")
	private Long outputId = null;

	@SerializedName("activationTime")
	private Integer activationTime = null;

	public ReaderActivation actionEventType(Integer actionEventType) {
		this.actionEventType = actionEventType;
		return this;
	}

	/**
	 * 0&#x3D;Acesso Permitido, 1&#x3D;Acesso Negado
	 * 
	 * @return actionEventType
	 **/
	@Schema(description = "0=Acesso Permitido, 1=Acesso Negado")
	public Integer getActionEventType() {
		return actionEventType;
	}

	public void setActionEventType(Integer actionEventType) {
		this.actionEventType = actionEventType;
	}

	public ReaderActivation outputId(Long outputId) {
		this.outputId = outputId;
		return this;
	}

	/**
	 * Get outputId
	 * 
	 * @return outputId
	 **/
	@Schema(description = "")
	public Long getOutputId() {
		return outputId;
	}

	public void setOutputId(Long outputId) {
		this.outputId = outputId;
	}

	public ReaderActivation activationTime(Integer activationTime) {
		this.activationTime = activationTime;
		return this;
	}

	/**
	 * Quantidade em milissegundos de tempo em que a ativação será executada (zero é
	 * para sempre)
	 * 
	 * @return activationTime
	 **/
	@Schema(description = "Quantidade em milissegundos de tempo em que a ativação será executada (zero é para sempre)")
	public Integer getActivationTime() {
		return activationTime;
	}

	public void setActivationTime(Integer activationTime) {
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
		ReaderActivation readerActivation = (ReaderActivation) o;
		return Objects.equals(this.actionEventType, readerActivation.actionEventType) && Objects.equals(this.outputId, readerActivation.outputId) && Objects.equals(this.activationTime, readerActivation.activationTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(actionEventType, outputId, activationTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReaderActivation {\n");

		sb.append("    actionEventType: ").append(toIndentedString(actionEventType)).append("\n");
		sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
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
