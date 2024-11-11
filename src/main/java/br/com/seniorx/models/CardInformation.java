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
 
 @Schema(description = "Informação do cartão")
 public class CardInformation {
   @SerializedName("cardNumber")
   private Long cardNumber;
   @SerializedName("cardTechnology")
   private CardTechnologyEnum cardTechnology;
   @SerializedName("startDate")
   private String startDate;
   @SerializedName("expirationDate")
   private String expirationDate;
   
   public CardInformation() { this.cardNumber = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.cardTechnology = null;
 
     
     this.startDate = null;
 
     
     this.expirationDate = null; }
 
   
   public CardInformation cardNumber(Long cardNumber) { this.cardNumber = cardNumber;
     return this; }
 
 
 
 
 
 
   
   @Schema(description = "Número do cartão")
   public Long getCardNumber() {
     return this.cardNumber;
   }
   @JsonAdapter(CardTechnologyEnum.Adapter.class) public enum CardTechnologyEnum {
     BARCODE_CARD("BARCODE_CARD"), RFID_CARD("RFID_CARD"), SMART_CARD("SMART_CARD"), QRCODE("QRCODE"); private String value; CardTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CardTechnologyEnum fromValue(String text) { byte b; int i; CardTechnologyEnum[] arrayOfCardTechnologyEnum; for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i; ) { CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b]; if (String.valueOf(cardTechnologyEnum.value).equals(text)) return cardTechnologyEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
       public void write(JsonWriter jsonWriter, CardInformation.CardTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public CardInformation.CardTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return CardInformation.CardTechnologyEnum.fromValue(String.valueOf(value)); } } } public void setCardNumber(Long cardNumber) { this.cardNumber = cardNumber; }
 
   
   public CardInformation cardTechnology(CardTechnologyEnum cardTechnology) {
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
   
   public CardInformation startDate(String startDate) {
     this.startDate = startDate;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Data inicial")
   public String getStartDate() {
     return this.startDate;
   }
   
   public void setStartDate(String startDate) {
     this.startDate = startDate;
   }
   
   public CardInformation expirationDate(String expirationDate) {
     this.expirationDate = expirationDate;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Data de expiração")
   public String getExpirationDate() {
     return this.expirationDate;
   }
   
   public void setExpirationDate(String expirationDate) {
     this.expirationDate = expirationDate;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CardInformation cardInformation = (CardInformation)o;
     return (Objects.equals(this.cardNumber, cardInformation.cardNumber) && 
       Objects.equals(this.cardTechnology, cardInformation.cardTechnology) && 
       Objects.equals(this.startDate, cardInformation.startDate) && 
       Objects.equals(this.expirationDate, cardInformation.expirationDate));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.cardNumber, this.cardTechnology, this.startDate, this.expirationDate });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CardInformation {\n");
     
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
     sb.append("    startDate: ").append(toIndentedString(this.startDate)).append("\n");
     sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
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

/**
 * Informação do cartão
 */
@Schema(description = "Informação do cartão")

public class CardInformation {
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

	@SerializedName("startDate")
	private String startDate = null;

	@SerializedName("expirationDate")
	private String expirationDate = null;

	public CardInformation cardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	/**
	 * Número do cartão
	 * 
	 * @return cardNumber
	 **/
	@Schema(description = "Número do cartão")
	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CardInformation cardTechnology(CardTechnologyEnum cardTechnology) {
		this.cardTechnology = cardTechnology;
		return this;
	}

	/**
	 * Get cardTechnology
	 * 
	 * @return cardTechnology
	 **/
	@Schema(description = "")
	public CardTechnologyEnum getCardTechnology() {
		return cardTechnology;
	}

	public void setCardTechnology(CardTechnologyEnum cardTechnology) {
		this.cardTechnology = cardTechnology;
	}

	public CardInformation startDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Data inicial
	 * 
	 * @return startDate
	 **/
	@Schema(description = "Data inicial")
	public String getStartDate() {
		return startDate;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

<<<<<<< HEAD
/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\CardInformation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
	public CardInformation expirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	/**
	 * Data de expiração
	 * 
	 * @return expirationDate
	 **/
	@Schema(description = "Data de expiração")
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CardInformation cardInformation = (CardInformation) o;
		return Objects.equals(this.cardNumber, cardInformation.cardNumber)
				&& Objects.equals(this.cardTechnology, cardInformation.cardTechnology)
				&& Objects.equals(this.startDate, cardInformation.startDate)
				&& Objects.equals(this.expirationDate, cardInformation.expirationDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, cardTechnology, startDate, expirationDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardInformation {\n");

		sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
		sb.append("    cardTechnology: ").append(toIndentedString(cardTechnology)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
