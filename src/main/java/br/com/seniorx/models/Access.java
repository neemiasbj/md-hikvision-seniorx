
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Access
 */

public class Access {
	@SerializedName("deviceId")
	private Long deviceId = null;

	@SerializedName("date")
	private String date = null;

	@SerializedName("timezoneOffset")
	private Integer timezoneOffset = null;

	/**
	 * Gets or Sets status
	 */

	@SerializedName("status")
	private OnOffStatusEnum status = null;

	/**
	 * Gets or Sets accessType
	 */

	@SerializedName("accessType")
	private AccessTypeEnum accessType = null;

	/**
	 * Gets or Sets accessDirection
	 */

	@SerializedName("accessDirection")
	private AccessDirectionEnum accessDirection = null;

	@SerializedName("cardId")
	private Long cardId = null;

	@SerializedName("personId")
	private Long personId = null;

	@SerializedName("creditRange")
	private Integer creditRange = null;

	public Access deviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo
	 * 
	 * @return deviceId
	 **/
	@Schema(description = "Identificador do dispositivo")
	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Access date(String date) {
		this.date = date;
		return this;
	}

	/**
	 * Data da notificação em UTC
	 * 
	 * @return date
	 **/
	@Schema(description = "Data da notificação em UTC")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Access timezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		return this;
	}

	/**
	 * Offset em minutos
	 * 
	 * @return timezoneOffset
	 **/
	@Schema(description = "Offset em minutos")
	public Integer getTimezoneOffset() {
		return timezoneOffset;
	}

	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	public Access status(OnOffStatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@Schema(description = "")
	public OnOffStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OnOffStatusEnum status) {
		this.status = status;
	}

	public Access accessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
		return this;
	}

	/**
	 * Get accessType
	 * 
	 * @return accessType
	 **/
	@Schema(description = "")
	public AccessTypeEnum getAccessType() {
		return accessType;
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

	public Access accessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
		return this;
	}

	/**
	 * Get accessDirection
	 * 
	 * @return accessDirection
	 **/
	@Schema(description = "")
	public AccessDirectionEnum getAccessDirection() {
		return accessDirection;
	}

	public void setAccessDirection(AccessDirectionEnum accessDirection) {
		this.accessDirection = accessDirection;
	}

	public Access cardId(Long cardId) {
		this.cardId = cardId;
		return this;
	}

	/**
	 * Número do cartão
	 * 
	 * @return cardId
	 **/
	@Schema(description = "Número do cartão")
	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public Access personId(Long personId) {
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

	public Access creditRange(Integer creditRange) {
		this.creditRange = creditRange;
		return this;
	}

	/**
	 * Get creditRange
	 * 
	 * @return creditRange
	 **/
	@Schema(description = "")
	public Integer getCreditRange() {
		return creditRange;
	}

	public void setCreditRange(Integer creditRange) {
		this.creditRange = creditRange;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Access access = (Access) o;
		return Objects.equals(this.deviceId, access.deviceId) && Objects.equals(this.date, access.date)
				&& Objects.equals(this.timezoneOffset, access.timezoneOffset)
				&& Objects.equals(this.status, access.status) && Objects.equals(this.accessType, access.accessType)
				&& Objects.equals(this.accessDirection, access.accessDirection)
				&& Objects.equals(this.cardId, access.cardId) && Objects.equals(this.personId, access.personId)
				&& Objects.equals(this.creditRange, access.creditRange);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceId, date, timezoneOffset, status, accessType, accessDirection, cardId, personId,
				creditRange);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Access {\n");

		sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
		sb.append("    accessDirection: ").append(toIndentedString(accessDirection)).append("\n");
		sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    creditRange: ").append(toIndentedString(creditRange)).append("\n");
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
