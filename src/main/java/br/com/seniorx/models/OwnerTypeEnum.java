package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(OwnerTypeEnum.Adapter.class)
public enum OwnerTypeEnum {
	PERSON("PERSON"),

	VEHICLE("VEHICLE");

	private String value;

	OwnerTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OwnerTypeEnum fromValue(String text) {
		for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final OwnerTypeEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public OwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return OwnerTypeEnum.fromValue(String.valueOf(value));
		}
	}
}
