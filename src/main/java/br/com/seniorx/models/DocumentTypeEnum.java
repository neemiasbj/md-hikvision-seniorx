package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(DocumentTypeEnum.Adapter.class)
public enum DocumentTypeEnum {
	CNPJ("CNPJ"),

	CEI("CEI"),

	CPF("CPF");

	private String value;

	DocumentTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static DocumentTypeEnum fromValue(String text) {
		for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return DocumentTypeEnum.fromValue(String.valueOf(value));
		}
	}
}
