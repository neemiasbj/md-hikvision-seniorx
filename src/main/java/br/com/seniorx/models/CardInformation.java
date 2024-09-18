
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

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

	@SerializedName("cardTechnology")
	private ReaderTechnologyEnum cardTechnology = null;

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

	public CardInformation cardTechnology(ReaderTechnologyEnum cardTechnology) {
		this.cardTechnology = cardTechnology;
		return this;
	}

	/**
	 * Get cardTechnology
	 * 
	 * @return cardTechnology
	 **/
	@Schema(description = "")
	public ReaderTechnologyEnum getCardTechnology() {
		return cardTechnology;
	}

	public void setCardTechnology(ReaderTechnologyEnum cardTechnology) {
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

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

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
		return Objects.equals(this.cardNumber, cardInformation.cardNumber) && Objects.equals(this.cardTechnology, cardInformation.cardTechnology) && Objects.equals(this.startDate, cardInformation.startDate) && Objects.equals(this.expirationDate, cardInformation.expirationDate);
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
