package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

public class Access {
	@SerializedName("deviceId")
	private Long deviceId;
	@SerializedName("date")
	private String date;
	@SerializedName("timezoneOffset")
	private Integer timezoneOffset;
	@SerializedName("status")
	private StatusEnum status;
	@SerializedName("accessType")
	private AccessTypeEnum accessType;
	@SerializedName("accessDirection")
	private AccessDirectionEnum accessDirection;
	@SerializedName("cardId")
	private Long cardId;
	@SerializedName("personId")
	private Long personId;
	@SerializedName("creditRange")
	private Integer creditRange;

	public Access() {
		this.deviceId = null;

		this.date = null;

		this.timezoneOffset = null;

		this.status = null;

		this.accessType = null;

		this.accessDirection = null;

		this.cardId = null;

		this.personId = null;

		this.creditRange = null;
	}

	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum {
		ONLINE("ONLINE"), OFFLINE("OFFLINE");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}

		public String toString() {
			return String.valueOf(this.value);
		}

		public static StatusEnum fromValue(String text) {
			byte b;
			int i;
			StatusEnum[] arrayOfStatusEnum;
			for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i;) {
				StatusEnum statusEnum = arrayOfStatusEnum[b];
				if (String.valueOf(statusEnum.value).equals(text))
					return statusEnum;
				b++;
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<StatusEnum> {
			public void write(JsonWriter jsonWriter, Access.StatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public Access.StatusEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return Access.StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public Access deviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	@JsonAdapter(AccessTypeEnum.Adapter.class)
	public enum AccessTypeEnum {
		ACCESS_VALID("ACCESS_VALID"), ACCESS_DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),
		ACCESS_DENIED_SITUATION("ACCESS_DENIED_SITUATION"), ACCESS_DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),
		ACCESS_DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"),
		ACCESS_DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),
		ACCESS_DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"), ACCESS_DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),
		ACCESS_DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"), ACCESS_VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),
		ACCESS_DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"),
		ACCESS_DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),
		ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),
		ACCESS_DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"),
		ACCESS_DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),
		ACCESS_DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),
		ACCESS_DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),
		ACCESS_DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"), ACCESS_COERCION("ACCESS_COERCION"),
		ACCESS_DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"),
		ACCESS_DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),
		ACCESS_DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"), ACCESS_DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),
		ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"),
		ACCESS_DESISTENCE("ACCESS_DESISTENCE"), ACCESS_VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"),
		ACCESS_VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"), ACCESS_VALID_FRAUD("ACCESS_VALID_FRAUD"),
		ACCESS_VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"), ACCESS_DENIED("ACCESS_DENIED"),
		ACCESS_DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"),
		ACCESS_DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"),
		ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"),
		ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"),
		ACCESS_DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"),
		ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"),
		ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"),
		ACCESS_DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"),
		ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"),
		ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"),
		ACCESS_DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"),
		ACCESS_DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE");

		private String value;

		AccessTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}

		public String toString() {
			return String.valueOf(this.value);
		}

		public static AccessTypeEnum fromValue(String text) {
			byte b;
			int i;
			AccessTypeEnum[] arrayOfAccessTypeEnum;
			for (i = (arrayOfAccessTypeEnum = values()).length, b = 0; b < i;) {
				AccessTypeEnum accessTypeEnum = arrayOfAccessTypeEnum[b];
				if (String.valueOf(accessTypeEnum.value).equals(text))
					return accessTypeEnum;
				b++;
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AccessTypeEnum> {
			public void write(JsonWriter jsonWriter, Access.AccessTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public Access.AccessTypeEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return Access.AccessTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@Schema(description = "Identificador do dispositivo")
	public Long getDeviceId() {
		return this.deviceId;
	}

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
			return this.value;
		}

		public String toString() {
			return String.valueOf(this.value);
		}

		public static AccessDirectionEnum fromValue(String text) {
			byte b;
			int i;
			AccessDirectionEnum[] arrayOfAccessDirectionEnum;
			for (i = (arrayOfAccessDirectionEnum = values()).length, b = 0; b < i;) {
				AccessDirectionEnum accessDirectionEnum = arrayOfAccessDirectionEnum[b];
				if (String.valueOf(accessDirectionEnum.value).equals(text))
					return accessDirectionEnum;
				b++;
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AccessDirectionEnum> {
			public void write(JsonWriter jsonWriter, Access.AccessDirectionEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public Access.AccessDirectionEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return Access.AccessDirectionEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Access date(String date) {
		this.date = date;
		return this;
	}

	@Schema(description = "Data da notificação em UTC")
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Access timezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		return this;
	}

	@Schema(description = "Offset em minutos")
	public Integer getTimezoneOffset() {
		return this.timezoneOffset;
	}

	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	public Access status(StatusEnum status) {
		this.status = status;
		return this;
	}

	@Schema(description = "")
	public StatusEnum getStatus() {
		return this.status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Access accessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
		return this;
	}

	@Schema(description = "")
	public AccessTypeEnum getAccessType() {
		return this.accessType;
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

	public Access accessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
		return this;
	}

	@Schema(description = "")
	public AccessDirectionEnum getAccessDirection() {
		return this.accessDirection;
	}

	public void setAccessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
	}

	public Access cardId(Long cardId) {
		this.cardId = cardId;
		return this;
	}

	@Schema(description = "Número do cartão")
	public Long getCardId() {
		return this.cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public Access personId(Long personId) {
		this.personId = personId;
		return this;
	}

	@Schema(description = "Identificador da pessoa")
	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Access creditRange(Integer creditRange) {
		this.creditRange = creditRange;
		return this;
	}

	@Schema(description = "")
	public Integer getCreditRange() {
		return this.creditRange;
	}

	public void setCreditRange(Integer creditRange) {
		this.creditRange = creditRange;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Access access = (Access) o;
		return (Objects.equals(this.deviceId, access.deviceId) && Objects.equals(this.date, access.date)
				&& Objects.equals(this.timezoneOffset, access.timezoneOffset)
				&& Objects.equals(this.status, access.status) && Objects.equals(this.accessType, access.accessType)
				&& Objects.equals(this.accessDirection, access.accessDirection)
				&& Objects.equals(this.cardId, access.cardId) && Objects.equals(this.personId, access.personId)
				&& Objects.equals(this.creditRange, access.creditRange));
	}

	public int hashCode() {
		return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.accessType,
				this.accessDirection, this.cardId, this.personId, this.creditRange });
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Access {\n");

		sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
		sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
		sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
		sb.append("    accessDirection: ").append(toIndentedString(this.accessDirection)).append("\n");
		sb.append("    cardId: ").append(toIndentedString(this.cardId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
		sb.append("    creditRange: ").append(toIndentedString(this.creditRange)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
