package br.com.seniorx.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

public class AccessBiometry {
	/**
	 * Gets or Sets manufacturer
	 */
	@JsonAdapter(ManufacturerEnum.Adapter.class)
	public enum ManufacturerEnum {
		NONE("NONE"),

		FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"),

		FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"),

		FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"),

		FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"),

		FINGERPRINT_CAMA("FINGERPRINT_CAMA"),

		FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"),

		HANDKEY_IR("HANDKEY_IR"),

		FACIAL("FACIAL"),

		FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"),

		FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"),

		FACIAL_VISICA("FACIAL_VISICA"),

		FINGERPRINT_DIXI("FINGERPRINT_DIXI"),

		FACIAL_DIXI("FACIAL_DIXI"),

		FACIAL_HENRY("FACIAL_HENRY");

		private String value;

		ManufacturerEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ManufacturerEnum fromValue(String text) {
			for (ManufacturerEnum b : ManufacturerEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<ManufacturerEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ManufacturerEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ManufacturerEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ManufacturerEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("manufacturer")
	private ManufacturerEnum manufacturer = null;

	@SerializedName("biometrySecurityLevel")
	private Integer biometrySecurityLevel = null;

	@SerializedName("templateList")
	private List<String> templateList = null;

	@SerializedName("personId")
	private Long personId = null;

	@SerializedName("cardList")
	private List<CardAndTechnology> cardList = null;

	public AccessBiometry manufacturer(ManufacturerEnum manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * Get manufacturer
	 * 
	 * @return manufacturer
	 **/
	public ManufacturerEnum getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(ManufacturerEnum manufacturer) {
		this.manufacturer = manufacturer;
	}

	public AccessBiometry biometrySecurityLevel(Integer biometrySecurityLevel) {
		this.biometrySecurityLevel = biometrySecurityLevel;
		return this;
	}

	/**
	 * Nível de segurança biométrica
	 * 
	 * @return biometrySecurityLevel
	 **/
	@Schema(description  = "Nível de segurança biométrica")
	public Integer getBiometrySecurityLevel() {
		return biometrySecurityLevel;
	}

	public void setBiometrySecurityLevel(Integer biometrySecurityLevel) {
		this.biometrySecurityLevel = biometrySecurityLevel;
	}

	public AccessBiometry templateList(List<String> templateList) {
		this.templateList = templateList;
		return this;
	}

	public AccessBiometry addTemplateListItem(String templateListItem) {
		if (this.templateList == null) {
			this.templateList = new ArrayList<String>();
		}
		this.templateList.add(templateListItem);
		return this;
	}

	/**
	 * Caracteres codificados em base64
	 * 
	 * @return templateList
	 **/
	@Schema(description  = "Caracteres codificados em base64")
	public List<String> getTemplateList() {
		return templateList;
	}

	public void setTemplateList(List<String> templateList) {
		this.templateList = templateList;
	}

	public AccessBiometry personId(Long personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Identificador da pessoa
	 * 
	 * @return personId
	 **/
	@Schema(description  = "Identificador da pessoa")
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public AccessBiometry cardList(List<CardAndTechnology> cardList) {
		this.cardList = cardList;
		return this;
	}

	public AccessBiometry addCardListItem(CardAndTechnology cardListItem) {
		if (this.cardList == null) {
			this.cardList = new ArrayList<CardAndTechnology>();
		}
		this.cardList.add(cardListItem);
		return this;
	}

	/**
	 * Lista de cartões
	 * 
	 * @return cardList
	 **/
	@Schema(description  = "Lista de cartões")
	public List<CardAndTechnology> getCardList() {
		return cardList;
	}

	public void setCardList(List<CardAndTechnology> cardList) {
		this.cardList = cardList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessBiometry accessBiometry = (AccessBiometry) o;
		return Objects.equals(this.manufacturer, accessBiometry.manufacturer)
				&& Objects.equals(this.biometrySecurityLevel, accessBiometry.biometrySecurityLevel)
				&& Objects.equals(this.templateList, accessBiometry.templateList)
				&& Objects.equals(this.personId, accessBiometry.personId)
				&& Objects.equals(this.cardList, accessBiometry.cardList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturer, biometrySecurityLevel, templateList, personId, cardList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessBiometry {\n");

		sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
		sb.append("    biometrySecurityLevel: ").append(toIndentedString(biometrySecurityLevel)).append("\n");
		sb.append("    templateList: ").append(toIndentedString(templateList)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
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
