package br.com.seniorx.models;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

public class BluetoothAccessNotification {
	@SerializedName("deviceId")
	private Long deviceId = null;

	@SerializedName("date")
	private OffsetDateTime date = null;

	@SerializedName("timezoneOffset")
	private Integer timezoneOffset = null;

	/**
	 * Gets or Sets status
	 */
	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum {
		ONLINE("ONLINE"),

		OFFLINE("OFFLINE");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<StatusEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public StatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("status")
	private StatusEnum status = null;

	/**
	 * Gets or Sets accessType
	 */
	@JsonAdapter(AccessTypeEnum.Adapter.class)
	public enum AccessTypeEnum {
		VALID("ACCESS_VALID"),

		DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),

		DENIED_SITUATION("ACCESS_DENIED_SITUATION"),

		DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),

		DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"),

		DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),

		DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"),

		DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),

		DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"),

		VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),

		DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"),

		DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),

		DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),

		DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"),

		DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),

		DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),

		DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),

		DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"),

		COERCION("ACCESS_COERCION"),

		DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"),

		DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),

		DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"),

		DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),

		DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"),

		DESISTENCE("ACCESS_DESISTENCE"),

		VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"),

		VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"),

		VALID_FRAUD("ACCESS_VALID_FRAUD"),

		VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"),

		DENIED("ACCESS_DENIED"),

		DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"),

		DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"),

		DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"),

		DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"),

		DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"),

		DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"),

		DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"),

		DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"),

		DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"),

		DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"),

		DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"),

		DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE");

		private String value;

		AccessTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AccessTypeEnum fromValue(String text) {
			for (AccessTypeEnum b : AccessTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AccessTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final AccessTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public AccessTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return AccessTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("accessType")
	private AccessTypeEnum accessType = null;

	/**
	 * Gets or Sets accessDirection
	 */
	@JsonAdapter(AccessDirectionEnum.Adapter.class)
	public enum AccessDirectionEnum {
		UNKNOWN("UNKNOWN"),

		ENTRANCE("ENTRANCE"),

		EXIT("EXIT");

		private String value;

		AccessDirectionEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AccessDirectionEnum fromValue(String text) {
			for (AccessDirectionEnum b : AccessDirectionEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AccessDirectionEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final AccessDirectionEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public AccessDirectionEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return AccessDirectionEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("accessDirection")
	private AccessDirectionEnum accessDirection = null;

	@SerializedName("credentialId")
	private Long credentialId = null;

	public BluetoothAccessNotification deviceId(Long deviceId) {
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

	public BluetoothAccessNotification date(OffsetDateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Data da notificação em UTC
	 * 
	 * @return date
	 **/
	@ApiModelProperty(value = "Data da notificação em UTC")
	public OffsetDateTime getDate() {
		return date;
	}

	public void setDate(OffsetDateTime date) {
		this.date = date;
	}

	public BluetoothAccessNotification timezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		return this;
	}

	/**
	 * Offset em minutos
	 * 
	 * @return timezoneOffset
	 **/
	@ApiModelProperty(value = "Offset em minutos")
	public Integer getTimezoneOffset() {
		return timezoneOffset;
	}

	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	public BluetoothAccessNotification status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public BluetoothAccessNotification accessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
		return this;
	}

	/**
	 * Get accessType
	 * 
	 * @return accessType
	 **/
	@ApiModelProperty(value = "")
	public AccessTypeEnum getAccessType() {
		return accessType;
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

	public BluetoothAccessNotification accessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
		return this;
	}

	/**
	 * Get accessDirection
	 * 
	 * @return accessDirection
	 **/
	@ApiModelProperty(value = "")
	public AccessDirectionEnum getAccessDirection() {
		return accessDirection;
	}

	public void setAccessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
	}

	public BluetoothAccessNotification credentialId(Long credentialId) {
		this.credentialId = credentialId;
		return this;
	}

	/**
	 * Identificador da credencial
	 * 
	 * @return credentialId
	 **/
	@ApiModelProperty(value = "Identificador da credencial")
	public Long getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(Long credentialId) {
		this.credentialId = credentialId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BluetoothAccessNotification bluetoothAccessNotification = (BluetoothAccessNotification) o;
		return Objects.equals(this.deviceId, bluetoothAccessNotification.deviceId)
				&& Objects.equals(this.date, bluetoothAccessNotification.date)
				&& Objects.equals(this.timezoneOffset, bluetoothAccessNotification.timezoneOffset)
				&& Objects.equals(this.status, bluetoothAccessNotification.status)
				&& Objects.equals(this.accessType, bluetoothAccessNotification.accessType)
				&& Objects.equals(this.accessDirection, bluetoothAccessNotification.accessDirection)
				&& Objects.equals(this.credentialId, bluetoothAccessNotification.credentialId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceId, date, timezoneOffset, status, accessType, accessDirection, credentialId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BluetoothAccessNotification {\n");

		sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
		sb.append("    accessDirection: ").append(toIndentedString(accessDirection)).append("\n");
		sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
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