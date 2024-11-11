
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
	private Long pendencyId;
	@SerializedName("managerDeviceId")
	private Long managerDeviceId;
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
			public void write(JsonWriter jsonWriter, ApolloIncludeCardPendency.CardTechnologyEnum enumeration)
					throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public ApolloIncludeCardPendency.CardTechnologyEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				 return ApolloIncludeCardPendency.CardTechnologyEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public ApolloIncludeCardPendency() {
		this.pendencyId = null;
		
		
		 this.managerDeviceId = null;
		
		
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

	
	 public ApolloIncludeCardPendency pendencyId(Long pendencyId) {
		 this.pendencyId = pendencyId;
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
			 public void write(JsonWriter jsonWriter, ApolloIncludeCardPendency.OwnerTypeEnum enumeration)
					throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			 public ApolloIncludeCardPendency.OwnerTypeEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ApolloIncludeCardPendency.OwnerTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	 @Schema(description = "Identificador da pendência")
	public Long getPendencyId() {
		return this.pendencyId;
	}

	
	
	 public void setPendencyId(Long pendencyId) {
		 this.pendencyId = pendencyId;
		 }

	
	 public ApolloIncludeCardPendency managerDeviceId(Long managerDeviceId) {
		 this.managerDeviceId = managerDeviceId;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Identificador do dispositivo gerenciador")
	 public Long getManagerDeviceId() {
		 return this.managerDeviceId;
		 }

	
	 public void setManagerDeviceId(Long managerDeviceId) {
		 this.managerDeviceId = managerDeviceId;
		 }

	
	 public ApolloIncludeCardPendency cardNumber(Long cardNumber) {
		 this.cardNumber = cardNumber;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Número físico do cartão")
	 public Long getCardNumber() {
		 return this.cardNumber;
		 }

	
	 public void setCardNumber(Long cardNumber) {
		 this.cardNumber = cardNumber;
		 }

	
	 public ApolloIncludeCardPendency cardTechnology(CardTechnologyEnum cardTechnology) {
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

	
	 public ApolloIncludeCardPendency startValidity(OffsetDateTime startValidity) {
		 this.startValidity = startValidity;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Data de início da validade")
	 public OffsetDateTime getStartValidity() {
		 return this.startValidity;
		 }

	
	 public void setStartValidity(OffsetDateTime startValidity) {
		 this.startValidity = startValidity;
		 }

	
	 public ApolloIncludeCardPendency finishValidity(OffsetDateTime finishValidity) {
		 this.finishValidity = finishValidity;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Data final da validade")
	 public OffsetDateTime getFinishValidity() {
		 return this.finishValidity;
		 }

	
	 public void setFinishValidity(OffsetDateTime finishValidity) {
		 this.finishValidity = finishValidity;
		 }

	
	 public ApolloIncludeCardPendency checkAntiPassback(Boolean checkAntiPassback) {
		 this.checkAntiPassback = checkAntiPassback;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Valida anti-dupla")
	 public Boolean isCheckAntiPassback() {
		 return this.checkAntiPassback;
		 }

	
	 public void setCheckAntiPassback(Boolean checkAntiPassback) {
		 this.checkAntiPassback = checkAntiPassback;
		 }

	
	 public ApolloIncludeCardPendency ownerType(OwnerTypeEnum ownerType) {
		 this.ownerType = ownerType;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "")
	 public OwnerTypeEnum getOwnerType() {
		 return this.ownerType;
		 }

	
	 public void setOwnerType(OwnerTypeEnum ownerType) {
		 this.ownerType = ownerType;
		 }

	
	 public ApolloIncludeCardPendency ownerId(Long ownerId) {
		 this.ownerId = ownerId;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Identificador do proprietário da credencial (pessoa ou veículo)")
	 public Long getOwnerId() {
		 return this.ownerId;
		 }

	
	 public void setOwnerId(Long ownerId) {
		/* 323 */ this.ownerId = ownerId;
		/*     */ }

	/*     */
	/*     */ public ApolloIncludeCardPendency areaId(Long areaId) {
		/* 327 */ this.areaId = areaId;
		/* 328 */ return this;
		/*     */ }

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */ @Schema(description = "Identificador da área")
	/*     */ public Long getAreaId() {
		/* 338 */ return this.areaId;
		/*     */ }

	/*     */
	/*     */ public void setAreaId(Long areaId) {
		/* 342 */ this.areaId = areaId;
		/*     */ }

	/*     */
	/*     */ public ApolloIncludeCardPendency isVisitor(Boolean isVisitor) {
		/* 346 */ this.isVisitor = isVisitor;
		/* 347 */ return this;
		/*     */ }

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */ @Schema(description = "Informa se é um visitante")
	/*     */ public Boolean isIsVisitor() {
		/* 357 */ return this.isVisitor;
		/*     */ }

	/*     */
	/*     */ public void setIsVisitor(Boolean isVisitor) {
		/* 361 */ this.isVisitor = isVisitor;
		/*     */ }

	/*     */
	/*     */ public ApolloIncludeCardPendency isEscort(Boolean isEscort) {
		/* 365 */ this.isEscort = isEscort;
		/* 366 */ return this;
		/*     */ }

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */ @Schema(description = "Informa se é um autorizador")
	/*     */ public Boolean isIsEscort() {
		/* 376 */ return this.isEscort;
		/*     */ }

	/*     */
	/*     */ public void setIsEscort(Boolean isEscort) {
		/* 380 */ this.isEscort = isEscort;
		/*     */ }

	/*     */
	/*     */ public ApolloIncludeCardPendency accessLevel(List<Long> accessLevel) {
		/* 384 */ this.accessLevel = accessLevel;
		/* 385 */ return this;
		/*     */ }

	/*     */
	/*     */ public ApolloIncludeCardPendency addAccessLevelItem(Long accessLevelItem) {
		/* 389 */ if (this.accessLevel == null) {
			/* 390 */ this.accessLevel = new ArrayList<>();
			/*     */ }
		/* 392 */ this.accessLevel.add(accessLevelItem);
		/* 393 */ return this;
		/*     */ }

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */ @Schema(description = "Níveis de acesso")
	/*     */ public List<Long> getAccessLevel() {
		/* 403 */ return this.accessLevel;
		/*     */ }

	/*     */
	/*     */ public void setAccessLevel(List<Long> accessLevel) {
		/* 407 */ this.accessLevel = accessLevel;
		/*     */ }

	/*     */
	/*     */
	/*     */ public boolean equals(Object o) {
		/* 412 */ if (this == o) {
			/* 413 */ return true;
			/*     */ }
		/* 415 */ if (o == null || getClass() != o.getClass()) {
			/* 416 */ return false;
			/*     */ }
		/* 418 */ ApolloIncludeCardPendency apolloIncludeCardPendency = (ApolloIncludeCardPendency) o;
		/* 419 */ return (Objects.equals(this.pendencyId, apolloIncludeCardPendency.pendencyId) &&
		/* 420 */ Objects.equals(this.managerDeviceId, apolloIncludeCardPendency.managerDeviceId) &&
		/* 421 */ Objects.equals(this.cardNumber, apolloIncludeCardPendency.cardNumber) &&
		/* 422 */ Objects.equals(this.cardTechnology, apolloIncludeCardPendency.cardTechnology) &&
		/* 423 */ Objects.equals(this.startValidity, apolloIncludeCardPendency.startValidity) &&
		/* 424 */ Objects.equals(this.finishValidity, apolloIncludeCardPendency.finishValidity) &&
		/* 425 */ Objects.equals(this.checkAntiPassback, apolloIncludeCardPendency.checkAntiPassback) &&
		/* 426 */ Objects.equals(this.ownerType, apolloIncludeCardPendency.ownerType) &&
		/* 427 */ Objects.equals(this.ownerId, apolloIncludeCardPendency.ownerId) &&
		/* 428 */ Objects.equals(this.areaId, apolloIncludeCardPendency.areaId) &&
		/* 429 */ Objects.equals(this.isVisitor, apolloIncludeCardPendency.isVisitor) &&
		/* 430 */ Objects.equals(this.isEscort, apolloIncludeCardPendency.isEscort) &&
		/* 431 */ Objects.equals(this.accessLevel, apolloIncludeCardPendency.accessLevel));
		/*     */ }

	/*     */
	/*     */
	/*     */ public int hashCode() {
		/* 436 */ return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.cardNumber,
				this.cardTechnology, this.startValidity, this.finishValidity, /* 437 */ this.checkAntiPassback,
				this.ownerType, this.ownerId, this.areaId, this.isVisitor, this.isEscort, this.accessLevel });
		/*     */ }

	/*     */
	/*     */
	/*     */ public String toString() {
		/* 442 */ StringBuilder sb = new StringBuilder();
		/* 443 */ sb.append("class ApolloIncludeCardPendency {\n");
		/*     */
		/* 445 */ sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
		/* 446 */ sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
		/* 447 */ sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
		/* 448 */ sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
		/* 449 */ sb.append("    startValidity: ").append(toIndentedString(this.startValidity)).append("\n");
		/* 450 */ sb.append("    finishValidity: ").append(toIndentedString(this.finishValidity)).append("\n");
		/* 451 */ sb.append("    checkAntiPassback: ").append(toIndentedString(this.checkAntiPassback)).append("\n");
		/* 452 */ sb.append("    ownerType: ").append(toIndentedString(this.ownerType)).append("\n");
		/* 453 */ sb.append("    ownerId: ").append(toIndentedString(this.ownerId)).append("\n");
		/* 454 */ sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
		/* 455 */ sb.append("    isVisitor: ").append(toIndentedString(this.isVisitor)).append("\n");
		/* 456 */ sb.append("    isEscort: ").append(toIndentedString(this.isEscort)).append("\n");
		/* 457 */ sb.append("    accessLevel: ").append(toIndentedString(this.accessLevel)).append("\n");
		/* 458 */ sb.append("}");
		/* 459 */ return sb.toString();
		/*     */ }

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */ private String toIndentedString(Object o) {
		/* 467 */ if (o == null) {
			/* 468 */ return "null";
			/*     */ }
		/* 470 */ return o.toString().replace("\n", "\n    ");
		/*     */ }
}

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\
 * models\ApolloIncludeCardPendency.class Java compiler version: 17 (61.0)
 * JD-Core Version: 1.1.3
 */