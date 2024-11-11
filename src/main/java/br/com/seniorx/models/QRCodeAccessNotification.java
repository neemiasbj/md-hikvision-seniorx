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
<<<<<<< HEAD
=======

/**
 * QRCodeAccessNotification
 */
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

public class QRCodeAccessNotification {
	@SerializedName("deviceId")
	private Long deviceId;
	@SerializedName("date")
	private OffsetDateTime date;
	@SerializedName("timezoneOffset")
	private Integer timezoneOffset;
	@SerializedName("status")
	private StatusEnum status;
	@SerializedName("accessType")
	private AccessTypeEnum accessType;
	@SerializedName("accessDirection")
	private AccessDirectionEnum accessDirection;
	@SerializedName("qrcode")
	private String qrcode;

	public QRCodeAccessNotification() {
		this.deviceId = null;

		this.date = null;

		this.timezoneOffset = null;

		this.status = null;

		this.accessType = null;

		this.accessDirection = null;

		this.qrcode = null;
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
			public void write(JsonWriter jsonWriter, QRCodeAccessNotification.StatusEnum enumeration)
					throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public QRCodeAccessNotification.StatusEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return QRCodeAccessNotification.StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public QRCodeAccessNotification deviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	@JsonAdapter(AccessTypeEnum.Adapter.class)
	public enum AccessTypeEnum {
		VALID("ACCESS_VALID"), DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),
		DENIED_SITUATION("ACCESS_DENIED_SITUATION"), DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),
		DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"), DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),
		DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"), DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),
		DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"), VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),
		DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"), DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),
		DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),
		DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"), DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),
		DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),
		DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),
		DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"), COERCION("ACCESS_COERCION"),
		DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"), DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),
		DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"), DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),
		DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"), DESISTENCE("ACCESS_DESISTENCE"),
		VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"), VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"),
		VALID_FRAUD("ACCESS_VALID_FRAUD"), VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"), DENIED("ACCESS_DENIED"),
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
			public void write(JsonWriter jsonWriter, QRCodeAccessNotification.AccessTypeEnum enumeration)
					throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public QRCodeAccessNotification.AccessTypeEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return QRCodeAccessNotification.AccessTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@Schema(description = "Identificador do dispositivo")
	public Long getDeviceId() {
		return this.deviceId;
	}

	@JsonAdapter(AccessDirectionEnum.Adapter.class)
	public enum AccessDirectionEnum {
		UNKNOWN("UNKNOWN"), ENTRANCE("ENTRANCE"), EXIT("EXIT");

		private String value;

		AccessDirectionEnum(String value) {
			this.value = value;
		}

<<<<<<< HEAD
		public String getValue() {
			return this.value;
		}
=======
   /**
   * Identificador do dispositivo
   * @return deviceId
  **/
  @Schema(description  = "Identificador do dispositivo")
  public Long getDeviceId() {
    return deviceId;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

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

<<<<<<< HEAD
		public static class Adapter extends TypeAdapter<AccessDirectionEnum> {
			public void write(JsonWriter jsonWriter, QRCodeAccessNotification.AccessDirectionEnum enumeration)
					throws IOException {
				jsonWriter.value(enumeration.getValue());
			}
=======
   /**
   * Data da notificação em UTC
   * @return date
  **/
  @Schema(description  = "Data da notificação em UTC")
  public OffsetDateTime getDate() {
    return date;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

			public QRCodeAccessNotification.AccessDirectionEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return QRCodeAccessNotification.AccessDirectionEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

<<<<<<< HEAD
	public QRCodeAccessNotification date(OffsetDateTime date) {
		this.date = date;
		return this;
	}
=======
   /**
   * Offset em minutos
   * @return timezoneOffset
  **/
  @Schema(description  = "Offset em minutos")
  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	@Schema(description = "Data da notificação em UTC")
	public OffsetDateTime getDate() {
		return this.date;
	}

	public void setDate(OffsetDateTime date) {
		this.date = date;
	}

<<<<<<< HEAD
	public QRCodeAccessNotification timezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		return this;
	}
=======
   /**
   * Get status
   * @return status
  **/
  @Schema(description  = "")
  public StatusEnum getStatus() {
    return status;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	@Schema(description = "Offset em minutos")
	public Integer getTimezoneOffset() {
		return this.timezoneOffset;
	}

	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

<<<<<<< HEAD
	public QRCodeAccessNotification status(StatusEnum status) {
		this.status = status;
		return this;
	}
=======
   /**
   * Get accessType
   * @return accessType
  **/
  @Schema(description  = "")
  public AccessTypeEnum getAccessType() {
    return accessType;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	@Schema(description = "")
	public StatusEnum getStatus() {
		return this.status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

<<<<<<< HEAD
	public QRCodeAccessNotification accessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
		return this;
	}
=======
   /**
   * Get accessDirection
   * @return accessDirection
  **/
  @Schema(description  = "")
  public AccessDirectionEnum getAccessDirection() {
    return accessDirection;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	@Schema(description = "")
	public AccessTypeEnum getAccessType() {
		return this.accessType;
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

<<<<<<< HEAD
	public QRCodeAccessNotification accessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
		return this;
	}
=======
   /**
   * Get qrcode
   * @return qrcode
  **/
  @Schema(description  = "")
  public String getQrcode() {
    return qrcode;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	@Schema(description = "")
	public AccessDirectionEnum getAccessDirection() {
		return this.accessDirection;
	}

	public void setAccessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
	}

	public QRCodeAccessNotification qrcode(String qrcode) {
		this.qrcode = qrcode;
		return this;
	}

	@Schema(description = "")
	public String getQrcode() {
		return this.qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QRCodeAccessNotification qrCodeAccessNotification = (QRCodeAccessNotification) o;
		return (Objects.equals(this.deviceId, qrCodeAccessNotification.deviceId)
				&& Objects.equals(this.date, qrCodeAccessNotification.date)
				&& Objects.equals(this.timezoneOffset, qrCodeAccessNotification.timezoneOffset)
				&& Objects.equals(this.status, qrCodeAccessNotification.status)
				&& Objects.equals(this.accessType, qrCodeAccessNotification.accessType)
				&& Objects.equals(this.accessDirection, qrCodeAccessNotification.accessDirection)
				&& Objects.equals(this.qrcode, qrCodeAccessNotification.qrcode));
	}

	public int hashCode() {
		return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.accessType,
				this.accessDirection, this.qrcode });
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QRCodeAccessNotification {\n");

		sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
		sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
		sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
		sb.append("    accessDirection: ").append(toIndentedString(this.accessDirection)).append("\n");
		sb.append("    qrcode: ").append(toIndentedString(this.qrcode)).append("\n");
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
