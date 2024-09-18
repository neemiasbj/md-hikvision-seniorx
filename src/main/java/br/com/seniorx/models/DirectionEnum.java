package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(DirectionEnum.Adapter.class)
public enum DirectionEnum {
	ENTRANCE("ENTRANCE"),

	EXIT("EXIT"),

	BOTH("BOTH");

	private String value;

	DirectionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static DirectionEnum fromValue(String text) {
		for (DirectionEnum b : DirectionEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<DirectionEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public DirectionEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return DirectionEnum.fromValue(String.valueOf(value));
		}
	}
}
