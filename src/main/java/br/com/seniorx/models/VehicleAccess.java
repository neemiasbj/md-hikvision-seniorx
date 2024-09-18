
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
 * Veículo de Acesso
 */
@Schema(description = "Veículo de Acesso")
public class VehicleAccess {
	@SerializedName("deviceId")
	private Long deviceId = null;

	@SerializedName("date")
	private OffsetDateTime date = null;

	@SerializedName("timezoneOffset")
	private Integer timezoneOffset = null;

	/**
	 * Gets or Sets status
	 */

	@SerializedName("status")
	private OnOffStatusEnum status = null;

	/**
	 * Gets or Sets accessType
	 */
	@SerializedName("accessType")
	private AccessTypeEnum accessType = null;

	/**
	 * Gets or Sets accessDirection
	 */
	@SerializedName("accessDirection")
	private AccessDirectionEnum accessDirection = null;

	/**
	 * Gets or Sets vehicleCredentialFormat
	 */
	@JsonAdapter(VehicleCredentialFormatEnum.Adapter.class)
	public enum VehicleCredentialFormatEnum {
		CARD("CARD"),

		LICENSE_PLATE("LICENSE_PLATE");

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

	@SerializedName("licensePlate")
	private String licensePlate = null;

	@SerializedName("vehicleCardId")
	private Long vehicleCardId = null;

	/**
	 * Gets or Sets personCredentialFormat
	 */
	@JsonAdapter(PersonCredentialFormatEnum.Adapter.class)
	public enum PersonCredentialFormatEnum {
		CARD("CARD"),

		PERSON_ID("PERSON_ID");

		private String value;

		PersonCredentialFormatEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static PersonCredentialFormatEnum fromValue(String text) {
			for (PersonCredentialFormatEnum b : PersonCredentialFormatEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<PersonCredentialFormatEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final PersonCredentialFormatEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public PersonCredentialFormatEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return PersonCredentialFormatEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("PersonCredentialFormat")
	private PersonCredentialFormatEnum personCredentialFormat = null;

	@SerializedName("personCardId")
	private Long personCardId = null;

	@SerializedName("personId")
	private Long personId = null;

	public VehicleAccess deviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo
	 * 
	 * @return deviceId
	 **/
	@Schema(description = "Identificador do dispositivo")
	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public VehicleAccess date(OffsetDateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Data da notificação em UTC
	 * 
	 * @return date
	 **/
	@Schema(description = "Data da notificação em UTC")
	public OffsetDateTime getDate() {
		return date;
	}

	public void setDate(OffsetDateTime date) {
		this.date = date;
	}

	public VehicleAccess timezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		return this;
	}

	/**
	 * Offset em minutos
	 * 
	 * @return timezoneOffset
	 **/
	@Schema(description = "Offset em minutos")
	public Integer getTimezoneOffset() {
		return timezoneOffset;
	}

	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	public VehicleAccess status(OnOffStatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@Schema(description = "")
	public OnOffStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OnOffStatusEnum status) {
		this.status = status;
	}

	public VehicleAccess accessType(AccessTypeEnum accessType) {
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
		return getAccessType();
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

	public VehicleAccess accessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
		return this;
	}

	/**
	 * Get accessDirection
	 * 
	 * @return accessDirection
	 **/
	@Schema(description = "")
	public AccessDirectionEnum getAccessDirection() {
		return accessDirection;
	}

	public void setAccessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
	}

	public VehicleAccess vehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
		this.vehicleCredentialFormat = vehicleCredentialFormat;
		return this;
	}

	/**
	 * Get vehicleCredentialFormat
	 * 
	 * @return vehicleCredentialFormat
	 **/
	@Schema(description = "")
	public VehicleCredentialFormatEnum getVehicleCredentialFormat() {
		return vehicleCredentialFormat;
	}

	public void setVehicleCredentialFormat(VehicleCredentialFormatEnum vehicleCredentialFormat) {
		this.vehicleCredentialFormat = vehicleCredentialFormat;
	}

	public VehicleAccess licensePlate(String licensePlate) {
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

	public VehicleAccess vehicleCardId(Long vehicleCardId) {
		this.vehicleCardId = vehicleCardId;
		return this;
	}

	/**
	 * Identificador físico do crachá do veículo
	 * 
	 * @return vehicleCardId
	 **/
	@Schema(description = "Identificador físico do crachá do veículo")
	public Long getVehicleCardId() {
		return vehicleCardId;
	}

	public void setVehicleCardId(Long vehicleCardId) {
		this.vehicleCardId = vehicleCardId;
	}

	public VehicleAccess personCredentialFormat(PersonCredentialFormatEnum personCredentialFormat) {
		this.personCredentialFormat = personCredentialFormat;
		return this;
	}

	/**
	 * Get personCredentialFormat
	 * 
	 * @return personCredentialFormat
	 **/
	@Schema(description = "")
	public PersonCredentialFormatEnum getPersonCredentialFormat() {
		return personCredentialFormat;
	}

	public void setPersonCredentialFormat(PersonCredentialFormatEnum personCredentialFormat) {
		this.personCredentialFormat = personCredentialFormat;
	}

	public VehicleAccess personCardId(Long personCardId) {
		this.personCardId = personCardId;
		return this;
	}

	/**
	 * Identificador do crachá de pessoa
	 * 
	 * @return personCardId
	 **/
	@Schema(description = "Identificador do crachá de pessoa")
	public Long getPersonCardId() {
		return personCardId;
	}

	public void setPersonCardId(Long personCardId) {
		this.personCardId = personCardId;
	}

	public VehicleAccess personId(Long personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Identificador de pessoa
	 * 
	 * @return personId
	 **/
	@Schema(description = "Identificador de pessoa")
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
		VehicleAccess vehicleAccess = (VehicleAccess) o;
		return Objects.equals(this.deviceId, vehicleAccess.deviceId) && Objects.equals(this.date, vehicleAccess.date) && Objects.equals(this.timezoneOffset, vehicleAccess.timezoneOffset) && Objects.equals(this.status, vehicleAccess.status) && Objects.equals(this.accessType, vehicleAccess.accessType)
				&& Objects.equals(this.accessDirection, vehicleAccess.accessDirection) && Objects.equals(this.vehicleCredentialFormat, vehicleAccess.vehicleCredentialFormat) && Objects.equals(this.licensePlate, vehicleAccess.licensePlate)
				&& Objects.equals(this.vehicleCardId, vehicleAccess.vehicleCardId) && Objects.equals(this.personCredentialFormat, vehicleAccess.personCredentialFormat) && Objects.equals(this.personCardId, vehicleAccess.personCardId) && Objects.equals(this.personId, vehicleAccess.personId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceId, date, timezoneOffset, status, accessType, accessDirection, vehicleCredentialFormat, licensePlate, vehicleCardId, personCredentialFormat, personCardId, personId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VehicleAccess {\n");

		sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
		sb.append("    accessDirection: ").append(toIndentedString(accessDirection)).append("\n");
		sb.append("    vehicleCredentialFormat: ").append(toIndentedString(vehicleCredentialFormat)).append("\n");
		sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
		sb.append("    vehicleCardId: ").append(toIndentedString(vehicleCardId)).append("\n");
		sb.append("    personCredentialFormat: ").append(toIndentedString(personCredentialFormat)).append("\n");
		sb.append("    personCardId: ").append(toIndentedString(personCardId)).append("\n");
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
