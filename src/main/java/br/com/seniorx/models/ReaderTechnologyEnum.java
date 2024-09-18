package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(ReaderTechnologyEnum.Adapter.class)
public enum ReaderTechnologyEnum {
	UNKNOWN("UNKNOWN"),

	BIOMETRY("BIOMETRY"),

	KEYBOARD("KEYBOARD"),

	LPR("LPR"),

	BARCODE_CARD("BARCODE_CARD"),

	RFID_CARD("RFID_CARD"),

	SMART_CARD("SMART_CARD"),

	QRCODE("QRCODE");

	private String value;

	ReaderTechnologyEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static ReaderTechnologyEnum fromValue(String text) {
		for (ReaderTechnologyEnum b : ReaderTechnologyEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<ReaderTechnologyEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final ReaderTechnologyEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public ReaderTechnologyEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return ReaderTechnologyEnum.fromValue(String.valueOf(value));
		}
	}
}
