
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
 * DeviceDisplayMessagePendency
 */

public class DeviceDisplayMessagePendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

	@SerializedName("message")
	private String message = null;

	@SerializedName("duration")
	private Long duration = null;

	/**
	 * Gets or Sets mode
	 */
	@JsonAdapter(ModeEnum.Adapter.class)
	public enum ModeEnum {
		ENQUEUE("ENQUEUE"),

		OVERRIDE("OVERRIDE");

		private String value;

		ModeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ModeEnum fromValue(String text) {
			for (ModeEnum b : ModeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<ModeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ModeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ModeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("mode")
	private ModeEnum mode = null;

	public DeviceDisplayMessagePendency pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		return this;
	}

	/**
	 * Identificador da pendência
	 * 
	 * @return pendencyId
	 **/
	@Schema(description = "Identificador da pendência")
	public Long getPendencyId() {
		return pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public DeviceDisplayMessagePendency managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo gerenciador
	 * 
	 * @return managerDeviceId
	 **/
	@Schema(description = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}

	public DeviceDisplayMessagePendency message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Mensagem
	 * 
	 * @return message
	 **/
	@Schema(description = "Mensagem")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DeviceDisplayMessagePendency duration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Duração do tempo de exibição da mensagem (precisão de milissegundos)
	 * 
	 * @return duration
	 **/
	@Schema(description = "Duração do tempo de exibição da mensagem (precisão de milissegundos)")
	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public DeviceDisplayMessagePendency mode(ModeEnum mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * Get mode
	 * 
	 * @return mode
	 **/
	@Schema(description = "")
	public ModeEnum getMode() {
		return mode;
	}

	public void setMode(ModeEnum mode) {
		this.mode = mode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceDisplayMessagePendency deviceDisplayMessagePendency = (DeviceDisplayMessagePendency) o;
		return Objects.equals(this.pendencyId, deviceDisplayMessagePendency.pendencyId) && Objects.equals(this.managerDeviceId, deviceDisplayMessagePendency.managerDeviceId) && Objects.equals(this.message, deviceDisplayMessagePendency.message)
				&& Objects.equals(this.duration, deviceDisplayMessagePendency.duration) && Objects.equals(this.mode, deviceDisplayMessagePendency.mode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, managerDeviceId, message, duration, mode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceDisplayMessagePendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
		sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
