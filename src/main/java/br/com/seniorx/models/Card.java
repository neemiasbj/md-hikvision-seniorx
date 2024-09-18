
package br.com.seniorx.models;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Card
 */

public class Card {
	@SerializedName("cardNumber")
	private Long cardNumber = null;

	/**
	 * Gets or Sets cardTechnology
	 */

	@SerializedName("cardTechnology")
	private CardTechnologyEnum cardTechnology = null;

	@SerializedName("startValidity")
	private OffsetDateTime startValidity = null;

	@SerializedName("finishValidity")
	private OffsetDateTime finishValidity = null;

	@SerializedName("checkAntiPassback")
	private Boolean checkAntiPassback = false;

	/**
	 * Gets or Sets ownerType
	 */

	@SerializedName("ownerType")
	private OwnerTypeEnum ownerType = null;

	@SerializedName("ownerId")
	private Long ownerId = null;

	@SerializedName("areaId")
	private Long areaId = null;

	@SerializedName("isVisitor")
	private Boolean isVisitor = false;

	@SerializedName("isEscort")
	private Boolean isEscort = false;

	@SerializedName("accessLevel")
	private List<Long> accessLevel = null;

	public Card cardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	/**
	 * Número físico do cartão
	 * 
	 * @return cardNumber
	 **/
	@Schema(description = "Número físico do cartão")
	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Card cardTechnology(CardTechnologyEnum cardTechnology) {
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

	public Card startValidity(OffsetDateTime startValidity) {
		this.startValidity = startValidity;
		return this;
	}

	/**
	 * Data de início da validade
	 * 
	 * @return startValidity
	 **/
	@Schema(description = "Data de início da validade")
	public OffsetDateTime getStartValidity() {
		return startValidity;
	}

	public void setStartValidity(OffsetDateTime startValidity) {
		this.startValidity = startValidity;
	}

	public Card finishValidity(OffsetDateTime finishValidity) {
		this.finishValidity = finishValidity;
		return this;
	}

	/**
	 * Data final da validade
	 * 
	 * @return finishValidity
	 **/
	@Schema(description = "Data final da validade")
	public OffsetDateTime getFinishValidity() {
		return finishValidity;
	}

	public void setFinishValidity(OffsetDateTime finishValidity) {
		this.finishValidity = finishValidity;
	}

	public Card checkAntiPassback(Boolean checkAntiPassback) {
		this.checkAntiPassback = checkAntiPassback;
		return this;
	}

	/**
	 * Valida anti-dupla
	 * 
	 * @return checkAntiPassback
	 **/
	@Schema(description = "Valida anti-dupla")
	public Boolean isCheckAntiPassback() {
		return checkAntiPassback;
	}

	public void setCheckAntiPassback(Boolean checkAntiPassback) {
		this.checkAntiPassback = checkAntiPassback;
	}

	public Card ownerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
		return this;
	}

	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@Schema(description = "")
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	public Card ownerId(Long ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * Identificador do proprietário da credencial (pessoa ou veículo)
	 * 
	 * @return ownerId
	 **/
	@Schema(description = "Identificador do proprietário da credencial (pessoa ou veículo)")
	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Card areaId(Long areaId) {
		this.areaId = areaId;
		return this;
	}

	/**
	 * Identificador da área
	 * 
	 * @return areaId
	 **/
	@Schema(description = "Identificador da área")
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Card isVisitor(Boolean isVisitor) {
		this.isVisitor = isVisitor;
		return this;
	}

	/**
	 * Informa se é um visitante
	 * 
	 * @return isVisitor
	 **/
	@Schema(description = "Informa se é um visitante")
	public Boolean isIsVisitor() {
		return isVisitor;
	}

	public void setIsVisitor(Boolean isVisitor) {
		this.isVisitor = isVisitor;
	}

	public Card isEscort(Boolean isEscort) {
		this.isEscort = isEscort;
		return this;
	}

	/**
	 * Informa se é um autorizador
	 * 
	 * @return isEscort
	 **/
	@Schema(description = "Informa se é um autorizador")
	public Boolean isIsEscort() {
		return isEscort;
	}

	public void setIsEscort(Boolean isEscort) {
		this.isEscort = isEscort;
	}

	public Card accessLevel(List<Long> accessLevel) {
		this.accessLevel = accessLevel;
		return this;
	}

	public Card addAccessLevelItem(Long accessLevelItem) {
		if (this.accessLevel == null) {
			this.accessLevel = new ArrayList<Long>();
		}
		this.accessLevel.add(accessLevelItem);
		return this;
	}

	/**
	 * Níveis de acesso
	 * 
	 * @return accessLevel
	 **/
	@Schema(description = "Níveis de acesso")
	public List<Long> getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(List<Long> accessLevel) {
		this.accessLevel = accessLevel;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Card card = (Card) o;
		return Objects.equals(this.cardNumber, card.cardNumber) && Objects.equals(this.cardTechnology, card.cardTechnology) && Objects.equals(this.startValidity, card.startValidity) && Objects.equals(this.finishValidity, card.finishValidity)
				&& Objects.equals(this.checkAntiPassback, card.checkAntiPassback) && Objects.equals(this.ownerType, card.ownerType) && Objects.equals(this.ownerId, card.ownerId) && Objects.equals(this.areaId, card.areaId) && Objects.equals(this.isVisitor, card.isVisitor)
				&& Objects.equals(this.isEscort, card.isEscort) && Objects.equals(this.accessLevel, card.accessLevel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, cardTechnology, startValidity, finishValidity, checkAntiPassback, ownerType, ownerId, areaId, isVisitor, isEscort, accessLevel);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Card {\n");

		sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
		sb.append("    cardTechnology: ").append(toIndentedString(cardTechnology)).append("\n");
		sb.append("    startValidity: ").append(toIndentedString(startValidity)).append("\n");
		sb.append("    finishValidity: ").append(toIndentedString(finishValidity)).append("\n");
		sb.append("    checkAntiPassback: ").append(toIndentedString(checkAntiPassback)).append("\n");
		sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
		sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
		sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
		sb.append("    isVisitor: ").append(toIndentedString(isVisitor)).append("\n");
		sb.append("    isEscort: ").append(toIndentedString(isEscort)).append("\n");
		sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
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
