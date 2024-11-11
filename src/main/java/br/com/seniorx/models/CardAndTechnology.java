 package br.com.seniorx.models;
 import java.io.IOException;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class CardAndTechnology {
   @SerializedName("cardNumber")
   private Long cardNumber;
   @SerializedName("cardTechnology")
   private CardTechnologyEnum cardTechnology;
   
   public CardAndTechnology() { this.cardNumber = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.cardTechnology = null; }
 
   
   public CardAndTechnology cardNumber(Long cardNumber) { this.cardNumber = cardNumber;
     return this; }
 
 
 
 
 
 
   
   @Schema(description = "Número do cartão")
   public Long getCardNumber() {
     return this.cardNumber;
   }
   @JsonAdapter(CardTechnologyEnum.Adapter.class) public enum CardTechnologyEnum {
     BARCODE_CARD("BARCODE_CARD"), RFID_CARD("RFID_CARD"), SMART_CARD("SMART_CARD"), QRCODE("QRCODE"); private String value; CardTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CardTechnologyEnum fromValue(String text) { byte b; int i; CardTechnologyEnum[] arrayOfCardTechnologyEnum; for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i; ) { CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b]; if (String.valueOf(cardTechnologyEnum.value).equals(text)) return cardTechnologyEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
       public void write(JsonWriter jsonWriter, CardAndTechnology.CardTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public CardAndTechnology.CardTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return CardAndTechnology.CardTechnologyEnum.fromValue(String.valueOf(value)); } } } public void setCardNumber(Long cardNumber) { this.cardNumber = cardNumber; }
 
   
   public CardAndTechnology cardTechnology(CardTechnologyEnum cardTechnology) {
     this.cardTechnology = cardTechnology;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public CardTechnologyEnum getCardTechnology() {
     return this.cardTechnology;
   }
   
   public void setCardTechnology(CardTechnologyEnum cardTechnology) {
     this.cardTechnology = cardTechnology;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CardAndTechnology cardAndTechnology = (CardAndTechnology)o;
     return (Objects.equals(this.cardNumber, cardAndTechnology.cardNumber) && 
       Objects.equals(this.cardTechnology, cardAndTechnology.cardTechnology));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.cardNumber, this.cardTechnology });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CardAndTechnology {\n");
     
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 }
=======
import io.swagger.v3.oas.annotations.media.Schema;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


<<<<<<< HEAD
/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\CardAndTechnology.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
