package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CardTechnologyEnum.Adapter.class)
public enum CardTechnologyEnum {
	BARCODE_CARD("BARCODE_CARD"),

	RFID_CARD("RFID_CARD"),

	SMART_CARD("SMART_CARD"),

	QRCODE("QRCODE");

	private String value;

	CardTechnologyEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CardTechnologyEnum fromValue(String text) {
		for (CardTechnologyEnum b : CardTechnologyEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final CardTechnologyEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CardTechnologyEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CardTechnologyEnum.fromValue(String.valueOf(value));
		}
	}
}
