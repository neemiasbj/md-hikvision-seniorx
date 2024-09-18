package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(OperationIdEnum.Adapter.class)
public enum OperationIdEnum {
	INCLUDE_CARD("INCLUDE_CARD"),

	EXCLUDE_CARD("EXCLUDE_CARD"),

	EXCLUDE_PERSON("EXCLUDE_PERSON");

	private String value;

	OperationIdEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OperationIdEnum fromValue(String text) {
		for (OperationIdEnum b : OperationIdEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<OperationIdEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final OperationIdEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public OperationIdEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return OperationIdEnum.fromValue(String.valueOf(value));
		}
	}
}
