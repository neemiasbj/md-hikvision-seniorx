
package br.com.seniorx.models;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * VehicleAccessRequest
 */

public class VehicleAccessRequest {
	@SerializedName("readerId")
	private Long readerId = null;

	/**
	 * Formato da credencial do veículo
	 */
	@JsonAdapter(VehicleCredentialFormatEnum.Adapter.class)
	public enum VehicleCredentialFormatEnum {
		LICENSE_PLATE("LICENSE_PLATE"),

		CARD("CARD");

		private String value;

		VehicleCredentialFormatEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static VehicleCredentialFormatEnum fromValue(String text) {
			for (VehicleCredentialFormatEnum b : VehicleCredentialFormatEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<VehicleCredentialFormatEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final VehicleCredentialFormatEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public VehicleCredentialFormatEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return VehicleCredentialFormatEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("vehicleCredentialFormat")
	private VehicleCredentialFormatEnum vehicleCredentialFormat = null;

	@SerializedName("vehicleCredential")
	private String vehicleCredential = null;

	@SerializedName("authorizerPersonCardNumber")
	private Long authorizerPersonCardNumber = null;

	@SerializedName("authorizerPersonId")
	private Long authorizerPersonId = null;

	@SerializedName("requestDateTime")
	private OffsetDateTime requestDateTime = null;

	public VehicleAccessRequest readerId(Long readerId) {
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

	public VehicleAccessRequest vehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
		this.vehicleCredentialFormat = vehicleCredentialFormat;
		return this;
	}

	/**
	 * Formato da credencial do veículo
	 * 
	 * @return vehicleCredentialFormat
	 **/
	@Schema(description = "Formato da credencial do veículo")
	public VehicleCredentialFormatEnum getVehicleCredentialFormat() {
		return vehicleCredentialFormat;
	}

	public void setVehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
		this.vehicleCredentialFormat = vehicleCredentialFormat;
	}

	public VehicleAccessRequest vehicleCredential(String vehicleCredential) {
		this.vehicleCredential = vehicleCredential;
		return this;
	}

	/**
	 * Credencial do veículo
	 * 
	 * @return vehicleCredential
	 **/
	@Schema(description = "Credencial do veículo")
	public String getVehicleCredential() {
		return vehicleCredential;
	}

	public void setVehicleCredential(String vehicleCredential) {
		this.vehicleCredential = vehicleCredential;
	}

	public VehicleAccessRequest authorizerPersonCardNumber(Long authorizerPersonCardNumber) {
		this.authorizerPersonCardNumber = authorizerPersonCardNumber;
		return this;
	}

	/**
	 * Número do cartão da pessoa autorizadora
	 * 
	 * @return authorizerPersonCardNumber
	 **/
	@Schema(description = "Número do cartão da pessoa autorizadora")
	public Long getAuthorizerPersonCardNumber() {
		return authorizerPersonCardNumber;
	}

	public void setAuthorizerPersonCardNumber(Long authorizerPersonCardNumber) {
		this.authorizerPersonCardNumber = authorizerPersonCardNumber;
	}

	public VehicleAccessRequest authorizerPersonId(Long authorizerPersonId) {
		this.authorizerPersonId = authorizerPersonId;
		return this;
	}

	/**
	 * Identificador da pessoa autorizadora
	 * 
	 * @return authorizerPersonId
	 **/
	@Schema(description = "Identificador da pessoa autorizadora")
	public Long getAuthorizerPersonId() {
		return authorizerPersonId;
	}

	public void setAuthorizerPersonId(Long authorizerPersonId) {
		this.authorizerPersonId = authorizerPersonId;
	}

	public VehicleAccessRequest requestDateTime(OffsetDateTime requestDateTime) {
		this.requestDateTime = requestDateTime;
		return this;
	}

	/**
	 * Data e hora da requisição
	 * 
	 * @return requestDateTime
	 **/
	@Schema(description = "Data e hora da requisição")
	public OffsetDateTime getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(OffsetDateTime requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VehicleAccessRequest vehicleAccessRequest = (VehicleAccessRequest) o;
		return Objects.equals(this.readerId, vehicleAccessRequest.readerId) && Objects.equals(this.vehicleCredentialFormat, vehicleAccessRequest.vehicleCredentialFormat) && Objects.equals(this.vehicleCredential, vehicleAccessRequest.vehicleCredential)
				&& Objects.equals(this.authorizerPersonCardNumber, vehicleAccessRequest.authorizerPersonCardNumber) && Objects.equals(this.authorizerPersonId, vehicleAccessRequest.authorizerPersonId) && Objects.equals(this.requestDateTime, vehicleAccessRequest.requestDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(readerId, vehicleCredentialFormat, vehicleCredential, authorizerPersonCardNumber, authorizerPersonId, requestDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VehicleAccessRequest {\n");

		sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
		sb.append("    vehicleCredentialFormat: ").append(toIndentedString(vehicleCredentialFormat)).append("\n");
		sb.append("    vehicleCredential: ").append(toIndentedString(vehicleCredential)).append("\n");
		sb.append("    authorizerPersonCardNumber: ").append(toIndentedString(authorizerPersonCardNumber)).append("\n");
		sb.append("    authorizerPersonId: ").append(toIndentedString(authorizerPersonId)).append("\n");
		sb.append("    requestDateTime: ").append(toIndentedString(requestDateTime)).append("\n");
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
