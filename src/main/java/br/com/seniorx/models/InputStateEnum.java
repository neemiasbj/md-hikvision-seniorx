package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(InputStateEnum.Adapter.class)
public enum InputStateEnum {
	INACTIVE("INACTIVE"),

	ACTIVE("ACTIVE");

	private String value;

	InputStateEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static InputStateEnum fromValue(String text) {
		for (InputStateEnum b : InputStateEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<InputStateEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final InputStateEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public InputStateEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return InputStateEnum.fromValue(String.valueOf(value));
		}
	}
}
