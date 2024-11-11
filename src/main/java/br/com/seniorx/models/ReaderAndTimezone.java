package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

public class ReaderAndTimezone {
	@SerializedName("readerId")
	private Long readerId = null;

	@SerializedName("timezoneId")
	private Long timezoneId = null;

	public ReaderAndTimezone readerId(Long readerId) {
		this.readerId = readerId;
		return this;
	}

	@Schema(description = "Identificador da leitora")
	public Long getReaderId() {
		return this.readerId;
	}

	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}

	public ReaderAndTimezone timezoneId(Long timezoneId) {
		this.timezoneId = timezoneId;
		return this;
	}

	@Schema(description = "Identificador do fuso horário")
	public Long getTimezoneId() {
		return this.timezoneId;
	}

	public void setTimezoneId(Long timezoneId) {
		this.timezoneId = timezoneId;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReaderAndTimezone readerAndTimezone = (ReaderAndTimezone) o;
		return (Objects.equals(this.readerId, readerAndTimezone.readerId)
				&& Objects.equals(this.timezoneId, readerAndTimezone.timezoneId));
	}

	public int hashCode() {
		return Objects.hash(new Object[] { this.readerId, this.timezoneId });
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReaderAndTimezone {\n");

		sb.append("    readerId: ").append(toIndentedString(this.readerId)).append("\n");
		sb.append("    timezoneId: ").append(toIndentedString(this.timezoneId)).append("\n");
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

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\
 * models\ReaderAndTimezone.class Java compiler version: 17 (61.0) JD-Core
 * Version: 1.1.3
 */