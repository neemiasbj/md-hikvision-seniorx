package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

public class CardAndTechnology {
	@SerializedName("cardNumber")
	private Long cardNumber = null;

	/**
	 * Gets or Sets cardTechnology
	 */
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

	@SerializedName("cardTechnology")
	private CardTechnologyEnum cardTechnology = null;

	public CardAndTechnology cardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	/**
	 * Número do cartão
	 * 
	 * @return cardNumber
	 **/
	@Schema(description  = "Número do cartão")
	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CardAndTechnology cardTechnology(CardTechnologyEnum cardTechnology) {
		this.cardTechnology = cardTechnology;
		return this;
	}

	/**
	 * Get cardTechnology
	 * 
	 * @return cardTechnology
	 **/
	@Schema(description  = "")
	public CardTechnologyEnum getCardTechnology() {
		return cardTechnology;
	}

	public void setCardTechnology(CardTechnologyEnum cardTechnology) {
		this.cardTechnology = cardTechnology;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CardAndTechnology cardAndTechnology = (CardAndTechnology) o;
		return Objects.equals(this.cardNumber, cardAndTechnology.cardNumber)
				&& Objects.equals(this.cardTechnology, cardAndTechnology.cardTechnology);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, cardTechnology);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardAndTechnology {\n");

		sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
		sb.append("    cardTechnology: ").append(toIndentedString(cardTechnology)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
