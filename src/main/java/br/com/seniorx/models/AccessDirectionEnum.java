package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(AccessDirectionEnum.Adapter.class)
public enum AccessDirectionEnum {
	UNKNOWN("UNKNOWN"),

	ENTRANCE("ENTRANCE"),

	BOTH("BOTH"),

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
