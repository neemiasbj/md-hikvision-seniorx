
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LprAccessRequest
 */

public class LprAccessRequest {
	@SerializedName("readerId")
	private Long readerId = null;

	@SerializedName("licensePlate")
	private String licensePlate = null;

	@SerializedName("generateNotification")
	private Boolean generateNotification = false;

	public LprAccessRequest readerId(Long readerId) {
		this.readerId = readerId;
		return this;
	}

	/**
	 * Identificador da leitora
	 * 
	 * @return readerId
	 **/
	@Schema(description = "Identificador da leitora")
	public Long getReaderId() {
		return readerId;
	}

	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}

	public LprAccessRequest licensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
		return this;
	}

	/**
	 * Placa do veículo
	 * 
	 * @return licensePlate
	 **/
	@Schema(description = "Placa do veículo")
	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public LprAccessRequest generateNotification(Boolean generateNotification) {
		this.generateNotification = generateNotification;
		return this;
	}

	/**
	 * Gera notificação
	 * 
	 * @return generateNotification
	 **/
	@Schema(description = "Gera notificação")
	public Boolean isGenerateNotification() {
		return generateNotification;
	}

	public void setGenerateNotification(Boolean generateNotification) {
		this.generateNotification = generateNotification;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LprAccessRequest lprAccessRequest = (LprAccessRequest) o;
		return Objects.equals(this.readerId, lprAccessRequest.readerId) && Objects.equals(this.licensePlate, lprAccessRequest.licensePlate) && Objects.equals(this.generateNotification, lprAccessRequest.generateNotification);
	}

	@Override
	public int hashCode() {
		return Objects.hash(readerId, licensePlate, generateNotification);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LprAccessRequest {\n");

		sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
		sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
		sb.append("    generateNotification: ").append(toIndentedString(generateNotification)).append("\n");
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
