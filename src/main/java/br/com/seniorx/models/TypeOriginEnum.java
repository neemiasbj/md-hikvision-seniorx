package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(TypeOriginEnum.Adapter.class)
public enum TypeOriginEnum {
	PERSON("PERSON"),

	CARD("CARD"),

	PIS("PIS");

	private String value;

	TypeOriginEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static TypeOriginEnum fromValue(String text) {
		for (TypeOriginEnum b : TypeOriginEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<TypeOriginEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final TypeOriginEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public TypeOriginEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return TypeOriginEnum.fromValue(String.valueOf(value));
		}
	}
}
