
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
		 this.ownerId = ownerId;
		 }

	
	 public ApolloIncludeCardPendency areaId(Long areaId) {
		 this.areaId = areaId;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Identificador da área")
	 public Long getAreaId() {
		 return this.areaId;
		 }

	
	 public void setAreaId(Long areaId) {
		 this.areaId = areaId;
		 }

	
	 public ApolloIncludeCardPendency isVisitor(Boolean isVisitor) {
		 this.isVisitor = isVisitor;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Informa se é um visitante")
	 public Boolean isIsVisitor() {
		 return this.isVisitor;
		 }

	
	 public void setIsVisitor(Boolean isVisitor) {
		 this.isVisitor = isVisitor;
		 }

	
	 public ApolloIncludeCardPendency isEscort(Boolean isEscort) {
		 this.isEscort = isEscort;
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Informa se é um autorizador")
	 public Boolean isIsEscort() {
		 return this.isEscort;
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
			 this.accessLevel = new ArrayList<>();
			 }
		 this.accessLevel.add(accessLevelItem);
		 return this;
		 }

	
	
	
	
	
	
	 @Schema(description = "Níveis de acesso")
	 public List<Long> getAccessLevel() {
		 return this.accessLevel;
		 }

	
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
		 ApolloIncludeCardPendency apolloIncludeCardPendency = (ApolloIncludeCardPendency) o;
		 return (Objects.equals(this.pendencyId, apolloIncludeCardPendency.pendencyId) &&
		 Objects.equals(this.managerDeviceId, apolloIncludeCardPendency.managerDeviceId) &&
		 Objects.equals(this.cardNumber, apolloIncludeCardPendency.cardNumber) &&
		 Objects.equals(this.cardTechnology, apolloIncludeCardPendency.cardTechnology) &&
		 Objects.equals(this.startValidity, apolloIncludeCardPendency.startValidity) &&
		 Objects.equals(this.finishValidity, apolloIncludeCardPendency.finishValidity) &&
		 Objects.equals(this.checkAntiPassback, apolloIncludeCardPendency.checkAntiPassback) &&
		 Objects.equals(this.ownerType, apolloIncludeCardPendency.ownerType) &&
		 Objects.equals(this.ownerId, apolloIncludeCardPendency.ownerId) &&
		 Objects.equals(this.areaId, apolloIncludeCardPendency.areaId) &&
		 Objects.equals(this.isVisitor, apolloIncludeCardPendency.isVisitor) &&
		 Objects.equals(this.isEscort, apolloIncludeCardPendency.isEscort) &&
		 Objects.equals(this.accessLevel, apolloIncludeCardPendency.accessLevel));
		 }

	
	
	 public int hashCode() {
		 return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.cardNumber,
				this.cardTechnology, this.startValidity, this.finishValidity,  this.checkAntiPassback,
				this.ownerType, this.ownerId, this.areaId, this.isVisitor, this.isEscort, this.accessLevel });
		 }

	
	
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("class ApolloIncludeCardPendency {\n");
		
		 sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
		 sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
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

