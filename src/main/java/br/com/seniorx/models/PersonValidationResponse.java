
package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PersonValidationResponse
 */

public class PersonValidationResponse {
	/**
	 * Gets or Sets accessType
	 */

	@SerializedName("accessType")
	private AccessTypeEnum accessType = null;

	@SerializedName("verifyBiometry")
	private Boolean verifyBiometry = false;

	@SerializedName("currentOwnerLocation")
	private Long currentOwnerLocation = null;

	@SerializedName("personCheckLevel")
	private Boolean personCheckLevel = false;

	/**
	 * Tipo da credencial (titular ou provisória)
	 */
	@JsonAdapter(CredentialTypeEnum.Adapter.class)
	public enum CredentialTypeEnum {
		HOLDER("HOLDER"),

		PROVISORY("PROVISORY");

		private String value;

		CredentialTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static CredentialTypeEnum fromValue(String text) {
			for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<CredentialTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final CredentialTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public CredentialTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return CredentialTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("credentialType")
	private CredentialTypeEnum credentialType = null;

	@SerializedName("personId")
	private Long personId = null;

	public PersonValidationResponse accessType(AccessTypeEnum accessType) {
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

	public PersonValidationResponse verifyBiometry(Boolean verifyBiometry) {
		this.verifyBiometry = verifyBiometry;
		return this;
	}

	/**
	 * Informa se verifica biometria
	 * 
	 * @return verifyBiometry
	 **/
	@Schema(description = "Informa se verifica biometria")
	public Boolean isVerifyBiometry() {
		return verifyBiometry;
	}

	public void setVerifyBiometry(Boolean verifyBiometry) {
		this.verifyBiometry = verifyBiometry;
	}

	public PersonValidationResponse currentOwnerLocation(Long currentOwnerLocation) {
		this.currentOwnerLocation = currentOwnerLocation;
		return this;
	}

	/**
	 * Identificador da localização atual da pessoa
	 * 
	 * @return currentOwnerLocation
	 **/
	@Schema(description = "Identificador da localização atual da pessoa")
	public Long getCurrentOwnerLocation() {
		return currentOwnerLocation;
	}

	public void setCurrentOwnerLocation(Long currentOwnerLocation) {
		this.currentOwnerLocation = currentOwnerLocation;
	}

	public PersonValidationResponse personCheckLevel(Boolean personCheckLevel) {
		this.personCheckLevel = personCheckLevel;
		return this;
	}

	/**
	 * Informa se a pessoa controla nível
	 * 
	 * @return personCheckLevel
	 **/
	@Schema(description = "Informa se a pessoa controla nível")
	public Boolean isPersonCheckLevel() {
		return personCheckLevel;
	}

	public void setPersonCheckLevel(Boolean personCheckLevel) {
		this.personCheckLevel = personCheckLevel;
	}

	public PersonValidationResponse credentialType(CredentialTypeEnum credentialType) {
		this.credentialType = credentialType;
		return this;
	}

	/**
	 * Tipo da credencial (titular ou provisória)
	 * 
	 * @return credentialType
	 **/
	@Schema(description = "Tipo da credencial (titular ou provisória)")
	public CredentialTypeEnum getCredentialType() {
		return credentialType;
	}

	public void setCredentialType(CredentialTypeEnum credentialType) {
		this.credentialType = credentialType;
	}

	public PersonValidationResponse personId(Long personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Identificador da pessoa
	 * 
	 * @return personId
	 **/
	@Schema(description = "Identificador da pessoa")
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonValidationResponse personValidationResponse = (PersonValidationResponse) o;
		return Objects.equals(this.accessType, personValidationResponse.accessType) && Objects.equals(this.verifyBiometry, personValidationResponse.verifyBiometry) && Objects.equals(this.currentOwnerLocation, personValidationResponse.currentOwnerLocation)
				&& Objects.equals(this.personCheckLevel, personValidationResponse.personCheckLevel) && Objects.equals(this.credentialType, personValidationResponse.credentialType) && Objects.equals(this.personId, personValidationResponse.personId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessType, verifyBiometry, currentOwnerLocation, personCheckLevel, credentialType, personId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonValidationResponse {\n");

		sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
		sb.append("    verifyBiometry: ").append(toIndentedString(verifyBiometry)).append("\n");
		sb.append("    currentOwnerLocation: ").append(toIndentedString(currentOwnerLocation)).append("\n");
		sb.append("    personCheckLevel: ").append(toIndentedString(personCheckLevel)).append("\n");
		sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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
