
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

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
=======
import io.swagger.v3.oas.annotations.media.Schema;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

 public class Card {
	@SerializedName("cardNumber")
	private Long cardNumber;
	@SerializedName("cardTechnology")
	private CardTechnologyEnum cardTechnology;
	@SerializedName("startValidity")
	private OffsetDateTime startValidity;
	@SerializedName("finishValidity")
	private OffsetDateTime finishValidity;
	@SerializedName("checkAntiPassback")
	private Boolean checkAntiPassback;
	@SerializedName("ownerType")
	private OwnerTypeEnum ownerType;
	@SerializedName("ownerId")
	private Long ownerId;
	@SerializedName("areaId")
	private Long areaId;
	@SerializedName("isVisitor")
	private Boolean isVisitor;
	@SerializedName("isEscort")
	private Boolean isEscort;
	@SerializedName("accessLevel")
	private List<Long> accessLevel;

	@JsonAdapter(CardTechnologyEnum.Adapter.class)
	public enum CardTechnologyEnum {
		BARCODE_CARD("BARCODE_CARD"), RFID_CARD("RFID_CARD"), SMART_CARD("SMART_CARD"), QRCODE("QRCODE");

		private String value;

		CardTechnologyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}

		public String toString() {
			return String.valueOf(this.value);
		}

		public static CardTechnologyEnum fromValue(String text) {
			byte b;
			 int i;
			 CardTechnologyEnum[] arrayOfCardTechnologyEnum;
			 for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i;) {
				 CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b];
				 if (String.valueOf(cardTechnologyEnum.value).equals(text))
					 return cardTechnologyEnum;
				 b++;
				 }
			 return null;
		}

		public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
			public void write(JsonWriter jsonWriter, Card.CardTechnologyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public Card.CardTechnologyEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				 return Card.CardTechnologyEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public Card() {
		this.cardNumber = null;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 this.cardTechnology = null;
		
		
		 this.startValidity = null;
		
		
		 this.finishValidity = null;
		
		
		 this.checkAntiPassback = Boolean.valueOf(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 this.ownerType = null;
		
		
		 this.ownerId = null;
		
		
		 this.areaId = null;
		
		
		 this.isVisitor = Boolean.valueOf(false);
		
		
		 this.isEscort = Boolean.valueOf(false);
		
		
		 this.accessLevel = null;
	}

	
	 public Card cardNumber(Long cardNumber) {
		 this.cardNumber = cardNumber;
		 return this;
	}

	@JsonAdapter(OwnerTypeEnum.Adapter.class)
	public enum OwnerTypeEnum {
		 PERSON("PERSON"), VEHICLE("VEHICLE");

		private String value;

		OwnerTypeEnum(String value) {
			this.value = value;
		}

		 public String getValue() {
			return this.value;
		}

		 public String toString() {
			return String.valueOf(this.value);
		}

		 public static OwnerTypeEnum fromValue(String text) {
			byte b;
			int i;
			OwnerTypeEnum[] arrayOfOwnerTypeEnum;
			for (i = (arrayOfOwnerTypeEnum = values()).length, b = 0; b < i;) {
				OwnerTypeEnum ownerTypeEnum = arrayOfOwnerTypeEnum[b];
				if (String.valueOf(ownerTypeEnum.value).equals(text))
					 return ownerTypeEnum;
				b++;
			}
			 return null;
		}

		 public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
			 public void write(JsonWriter jsonWriter, Card.OwnerTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			 public Card.OwnerTypeEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return Card.OwnerTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

<<<<<<< HEAD
	 @Schema(description = "Número físico do cartão")
=======
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
	@Schema(description  = "Número físico do cartão")
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	public Long getCardNumber() {
		return this.cardNumber;
	}

	
	
	 public void setCardNumber(Long cardNumber) {
		 this.cardNumber = cardNumber;
		 }

	
	 public Card cardTechnology(CardTechnologyEnum cardTechnology) {
		 this.cardTechnology = cardTechnology;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "")
	 public CardTechnologyEnum getCardTechnology() {
		 return this.cardTechnology;
		 }
=======
	/**
	 * Get cardTechnology
	 * 
	 * @return cardTechnology
	 **/
	@Schema(description  = "")
	public CardTechnologyEnum getCardTechnology() {
		return cardTechnology;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setCardTechnology(CardTechnologyEnum cardTechnology) {
		 this.cardTechnology = cardTechnology;
		 }

	
	 public Card startValidity(OffsetDateTime startValidity) {
		 this.startValidity = startValidity;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Data de início da validade")
	 public OffsetDateTime getStartValidity() {
		 return this.startValidity;
		 }
=======
	/**
	 * Data de início da validade
	 * 
	 * @return startValidity
	 **/
	@Schema(description  = "Data de início da validade")
	public OffsetDateTime getStartValidity() {
		return startValidity;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setStartValidity(OffsetDateTime startValidity) {
		 this.startValidity = startValidity;
		 }

	
	 public Card finishValidity(OffsetDateTime finishValidity) {
		 this.finishValidity = finishValidity;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Data final da validade")
	 public OffsetDateTime getFinishValidity() {
		 return this.finishValidity;
		 }
=======
	/**
	 * Data final da validade
	 * 
	 * @return finishValidity
	 **/
	@Schema(description  = "Data final da validade")
	public OffsetDateTime getFinishValidity() {
		return finishValidity;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setFinishValidity(OffsetDateTime finishValidity) {
		 this.finishValidity = finishValidity;
		 }

	
	 public Card checkAntiPassback(Boolean checkAntiPassback) {
		 this.checkAntiPassback = checkAntiPassback;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Valida anti-dupla")
	 public Boolean isCheckAntiPassback() {
		 return this.checkAntiPassback;
		 }
=======
	/**
	 * Valida anti-dupla
	 * 
	 * @return checkAntiPassback
	 **/
	@Schema(description  = "Valida anti-dupla")
	public Boolean isCheckAntiPassback() {
		return checkAntiPassback;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setCheckAntiPassback(Boolean checkAntiPassback) {
		 this.checkAntiPassback = checkAntiPassback;
		 }

	
	 public Card ownerType(OwnerTypeEnum ownerType) {
		 this.ownerType = ownerType;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "")
	 public OwnerTypeEnum getOwnerType() {
		 return this.ownerType;
		 }
=======
	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@Schema(description  = "")
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setOwnerType(OwnerTypeEnum ownerType) {
		 this.ownerType = ownerType;
		 }

	
	 public Card ownerId(Long ownerId) {
		 this.ownerId = ownerId;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Identificador do proprietário da credencial (pessoa ou veículo)")
	 public Long getOwnerId() {
		 return this.ownerId;
		 }
=======
	/**
	 * Identificador do proprietário da credencial (pessoa ou veículo)
	 * 
	 * @return ownerId
	 **/
	@Schema(description  = "Identificador do proprietário da credencial (pessoa ou veículo)")
	public Long getOwnerId() {
		return ownerId;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setOwnerId(Long ownerId) {
		 this.ownerId = ownerId;
		 }

	
	 public Card areaId(Long areaId) {
		 this.areaId = areaId;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Identificador da área")
	 public Long getAreaId() {
		 return this.areaId;
		 }
=======
	/**
	 * Identificador da área
	 * 
	 * @return areaId
	 **/
	@Schema(description  = "Identificador da área")
	public Long getAreaId() {
		return areaId;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setAreaId(Long areaId) {
		 this.areaId = areaId;
		 }

	
	 public Card isVisitor(Boolean isVisitor) {
		 this.isVisitor = isVisitor;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Informa se é um visitante")
	 public Boolean isIsVisitor() {
		 return this.isVisitor;
		 }
=======
	/**
	 * Informa se é um visitante
	 * 
	 * @return isVisitor
	 **/
	@Schema(description  = "Informa se é um visitante")
	public Boolean isIsVisitor() {
		return isVisitor;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setIsVisitor(Boolean isVisitor) {
		 this.isVisitor = isVisitor;
		 }

	
	 public Card isEscort(Boolean isEscort) {
		 this.isEscort = isEscort;
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Informa se é um autorizador")
	 public Boolean isIsEscort() {
		 return this.isEscort;
		 }
=======
	/**
	 * Informa se é um autorizador
	 * 
	 * @return isEscort
	 **/
	@Schema(description  = "Informa se é um autorizador")
	public Boolean isIsEscort() {
		return isEscort;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setIsEscort(Boolean isEscort) {
		 this.isEscort = isEscort;
		 }

	
	 public Card accessLevel(List<Long> accessLevel) {
		 this.accessLevel = accessLevel;
		 return this;
		 }

	
	 public Card addAccessLevelItem(Long accessLevelItem) {
		 if (this.accessLevel == null) {
			 this.accessLevel = new ArrayList<>();
			 }
		 this.accessLevel.add(accessLevelItem);
		 return this;
		 }

<<<<<<< HEAD
	
	
	
	
	
	
	 @Schema(description = "Níveis de acesso")
	 public List<Long> getAccessLevel() {
		 return this.accessLevel;
		 }
=======
	/**
	 * Níveis de acesso
	 * 
	 * @return accessLevel
	 **/
	@Schema(description  = "Níveis de acesso")
	public List<Long> getAccessLevel() {
		return accessLevel;
	}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

	
	 public void setAccessLevel(List<Long> accessLevel) {
		 this.accessLevel = accessLevel;
		 }

	
	
	 public boolean equals(Object o) {
		 if (this == o) {
			 return true;
			 }
		 if (o == null || getClass() != o.getClass()) {
			 return false;
			 }
		 Card card = (Card) o;
		 return (Objects.equals(this.cardNumber, card.cardNumber) &&
		 Objects.equals(this.cardTechnology, card.cardTechnology) &&
		 Objects.equals(this.startValidity, card.startValidity) &&
		 Objects.equals(this.finishValidity, card.finishValidity) &&
		 Objects.equals(this.checkAntiPassback, card.checkAntiPassback) &&
		 Objects.equals(this.ownerType, card.ownerType) && Objects.equals(this.ownerId, card.ownerId) &&
		 Objects.equals(this.areaId, card.areaId) && Objects.equals(this.isVisitor, card.isVisitor) &&
		 Objects.equals(this.isEscort, card.isEscort) && Objects.equals(this.accessLevel, card.accessLevel));
		 }

	
	
	 public int hashCode() {
		 return Objects.hash(new Object[] { this.cardNumber, this.cardTechnology, this.startValidity,
				this.finishValidity, this.checkAntiPassback, this.ownerType,  this.ownerId, this.areaId,
				this.isVisitor, this.isEscort, this.accessLevel });
		 }

	
	
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("class Card {\n");
		
		 sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
		 sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
		 sb.append("    startValidity: ").append(toIndentedString(this.startValidity)).append("\n");
		 sb.append("    finishValidity: ").append(toIndentedString(this.finishValidity)).append("\n");
		 sb.append("    checkAntiPassback: ").append(toIndentedString(this.checkAntiPassback)).append("\n");
		 sb.append("    ownerType: ").append(toIndentedString(this.ownerType)).append("\n");
		 sb.append("    ownerId: ").append(toIndentedString(this.ownerId)).append("\n");
		 sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
		 sb.append("    isVisitor: ").append(toIndentedString(this.isVisitor)).append("\n");
		 sb.append("    isEscort: ").append(toIndentedString(this.isEscort)).append("\n");
		 sb.append("    accessLevel: ").append(toIndentedString(this.accessLevel)).append("\n");
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

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\
 * models\Card.class Java compiler version: 17 (61.0) JD-Core Version: 1.1.3
 */