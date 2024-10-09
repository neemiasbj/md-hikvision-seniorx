package br.com.seniorx.models;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

public class AccessRequest {
	@SerializedName("readerId")
	private Long readerId = null;

	@SerializedName("cardId")
	private Long cardId = null;

	@SerializedName("personId")
	private Long personId = null;

	@SerializedName("requestDateTime")
	private String requestDateTime = null;

	public AccessRequest readerId(Long readerId) {
		this.readerId = readerId;
		return this;
	}

	/**
	 * Identificador da leitora
	 * 
	 * @return readerId
	 **/
	@Schema(description = "Identificador da leitora")
	public Long getReaderId() {
		return readerId;
	}

	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}

	public AccessRequest cardId(Long cardId) {
		this.cardId = cardId;
		return this;
	}

	/**
	 * Identificador do cartão
	 * 
	 * @return cardId
	 **/
	@Schema(description = "Identificador do cartão")
	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public AccessRequest personId(Long personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Identificador da pessoa
	 * 
	 * @return personId
	 **/
	@Schema(description = "Identificador da pessoa")
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public AccessRequest requestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
		return this;
	}

	/**
	 * Data e hora da requisição de acesso
	 * 
	 * @return requestDateTime
	 **/
	@Schema(description = "Data e hora da requisição de acesso")
	public String getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessRequest accessRequest = (AccessRequest) o;
		return Objects.equals(this.readerId, accessRequest.readerId)
				&& Objects.equals(this.cardId, accessRequest.cardId)
				&& Objects.equals(this.personId, accessRequest.personId)
				&& Objects.equals(this.requestDateTime, accessRequest.requestDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(readerId, cardId, personId, requestDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessRequest {\n");

		sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
		sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    requestDateTime: ").append(toIndentedString(requestDateTime)).append("\n");
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
