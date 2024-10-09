package br.com.seniorx.models;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

public class ApolloIncludeCardPendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

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

	@SerializedName("startValidity")
	private OffsetDateTime startValidity = null;

	@SerializedName("finishValidity")
	private OffsetDateTime finishValidity = null;

	@SerializedName("checkAntiPassback")
	private Boolean checkAntiPassback = false;

	/**
	 * Gets or Sets ownerType
	 */
	@JsonAdapter(OwnerTypeEnum.Adapter.class)
	public enum OwnerTypeEnum {
		PERSON("PERSON"),

		VEHICLE("VEHICLE");

		private String value;

		OwnerTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static OwnerTypeEnum fromValue(String text) {
			for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final OwnerTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public OwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return OwnerTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

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

	public ApolloIncludeCardPendency pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		return this;
	}

	/**
	 * Identificador da pendência
	 * 
	 * @return pendencyId
	 **/
	@Schema(description  = "Identificador da pendência")
	public Long getPendencyId() {
		return pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public ApolloIncludeCardPendency managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo gerenciador
	 * 
	 * @return managerDeviceId
	 **/
	@Schema(description  = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}

	public ApolloIncludeCardPendency cardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	/**
	 * Número físico do cartão
	 * 
	 * @return cardNumber
	 **/
	@Schema(description  = "Número físico do cartão")
	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public ApolloIncludeCardPendency cardTechnology(CardTechnologyEnum cardTechnology) {
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

	public ApolloIncludeCardPendency startValidity(OffsetDateTime startValidity) {
		this.startValidity = startValidity;
		return this;
	}

	/**
	 * Data de início da validade
	 * 
	 * @return startValidity
	 **/
	@Schema(description  = "Data de início da validade")
	public OffsetDateTime getStartValidity() {
		return startValidity;
	}

	public void setStartValidity(OffsetDateTime startValidity) {
		this.startValidity = startValidity;
	}

	public ApolloIncludeCardPendency finishValidity(OffsetDateTime finishValidity) {
		this.finishValidity = finishValidity;
		return this;
	}

	/**
	 * Data final da validade
	 * 
	 * @return finishValidity
	 **/
	@Schema(description  = "Data final da validade")
	public OffsetDateTime getFinishValidity() {
		return finishValidity;
	}

	public void setFinishValidity(OffsetDateTime finishValidity) {
		this.finishValidity = finishValidity;
	}

	public ApolloIncludeCardPendency checkAntiPassback(Boolean checkAntiPassback) {
		this.checkAntiPassback = checkAntiPassback;
		return this;
	}

	/**
	 * Valida anti-dupla
	 * 
	 * @return checkAntiPassback
	 **/
	@Schema(description  = "Valida anti-dupla")
	public Boolean isCheckAntiPassback() {
		return checkAntiPassback;
	}

	public void setCheckAntiPassback(Boolean checkAntiPassback) {
		this.checkAntiPassback = checkAntiPassback;
	}

	public ApolloIncludeCardPendency ownerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
		return this;
	}

	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@Schema(description  = "")
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	public ApolloIncludeCardPendency ownerId(Long ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * Identificador do proprietário da credencial (pessoa ou veículo)
	 * 
	 * @return ownerId
	 **/
	@Schema(description  = "Identificador do proprietário da credencial (pessoa ou veículo)")
	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public ApolloIncludeCardPendency areaId(Long areaId) {
		this.areaId = areaId;
		return this;
	}

	/**
	 * Identificador da área
	 * 
	 * @return areaId
	 **/
	@Schema(description  = "Identificador da área")
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public ApolloIncludeCardPendency isVisitor(Boolean isVisitor) {
		this.isVisitor = isVisitor;
		return this;
	}

	/**
	 * Informa se é um visitante
	 * 
	 * @return isVisitor
	 **/
	@Schema(description  = "Informa se é um visitante")
	public Boolean isIsVisitor() {
		return isVisitor;
	}

	public void setIsVisitor(Boolean isVisitor) {
		this.isVisitor = isVisitor;
	}

	public ApolloIncludeCardPendency isEscort(Boolean isEscort) {
		this.isEscort = isEscort;
		return this;
	}

	/**
	 * Informa se é um autorizador
	 * 
	 * @return isEscort
	 **/
	@Schema(description  = "Informa se é um autorizador")
	public Boolean isIsEscort() {
		return isEscort;
	}

	public void setIsEscort(Boolean isEscort) {
		this.isEscort = isEscort;
	}

	public ApolloIncludeCardPendency accessLevel(List<Long> accessLevel) {
		this.accessLevel = accessLevel;
		return this;
	}

	public ApolloIncludeCardPendency addAccessLevelItem(Long accessLevelItem) {
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
	@Schema(description  = "Níveis de acesso")
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
		ApolloIncludeCardPendency apolloIncludeCardPendency = (ApolloIncludeCardPendency) o;
		return Objects.equals(this.pendencyId, apolloIncludeCardPendency.pendencyId)
				&& Objects.equals(this.managerDeviceId, apolloIncludeCardPendency.managerDeviceId)
				&& Objects.equals(this.cardNumber, apolloIncludeCardPendency.cardNumber)
				&& Objects.equals(this.cardTechnology, apolloIncludeCardPendency.cardTechnology)
				&& Objects.equals(this.startValidity, apolloIncludeCardPendency.startValidity)
				&& Objects.equals(this.finishValidity, apolloIncludeCardPendency.finishValidity)
				&& Objects.equals(this.checkAntiPassback, apolloIncludeCardPendency.checkAntiPassback)
				&& Objects.equals(this.ownerType, apolloIncludeCardPendency.ownerType)
				&& Objects.equals(this.ownerId, apolloIncludeCardPendency.ownerId)
				&& Objects.equals(this.areaId, apolloIncludeCardPendency.areaId)
				&& Objects.equals(this.isVisitor, apolloIncludeCardPendency.isVisitor)
				&& Objects.equals(this.isEscort, apolloIncludeCardPendency.isEscort)
				&& Objects.equals(this.accessLevel, apolloIncludeCardPendency.accessLevel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, managerDeviceId, cardNumber, cardTechnology, startValidity, finishValidity,
				checkAntiPassback, ownerType, ownerId, areaId, isVisitor, isEscort, accessLevel);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApolloIncludeCardPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
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
