package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(ManufacturerEnum.Adapter.class)
public enum ManufacturerEnum {
	NONE("NONE"),

	FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"),

	FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"),

	FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"),

	FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"),

	FINGERPRINT_CAMA("FINGERPRINT_CAMA"),

	FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"),

	HANDKEY_IR("HANDKEY_IR"),

	FACIAL("FACIAL"),

	FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"),

	FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"),

	FACIAL_VISICA("FACIAL_VISICA"),

	FINGERPRINT_DIXI("FINGERPRINT_DIXI"),

	FACIAL_DIXI("FACIAL_DIXI");

	private String value;

	ManufacturerEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static ManufacturerEnum fromValue(String text) {
		for (ManufacturerEnum b : ManufacturerEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<ManufacturerEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final ManufacturerEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public ManufacturerEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return ManufacturerEnum.fromValue(String.valueOf(value));
		}
	}
}
