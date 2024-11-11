/*     */ package br.com.seniorx.models;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;

/*     */ 
/*     */ import com.google.gson.TypeAdapter;
/*     */ import com.google.gson.annotations.JsonAdapter;
/*     */ import com.google.gson.annotations.SerializedName;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonWriter;

/*     */ import io.swagger.v3.oas.annotations.media.Schema;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AccessBiometry
/*     */ {
/*     */   @SerializedName("manufacturer")
/*     */   private ManufacturerEnum manufacturer;
/*     */   @SerializedName("biometrySecurityLevel")
/*     */   private Integer biometrySecurityLevel;
/*     */   @SerializedName("templateList")
/*     */   private List<String> templateList;
/*     */   @SerializedName("personId")
/*     */   private Long personId;
/*     */   @SerializedName("cardList")
/*     */   private List<CardAndTechnology> cardList;
/*     */   
/*     */   public AccessBiometry() {
/*  91 */     this.manufacturer = null;
/*     */ 
/*     */     
/*  94 */     this.biometrySecurityLevel = null;
/*     */ 
/*     */     
/*  97 */     this.templateList = null;
/*     */ 
/*     */     
/* 100 */     this.personId = null;
/*     */ 
/*     */     
/* 103 */     this.cardList = null;
/*     */   }
/*     */   
/* 106 */   public AccessBiometry manufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer;
/* 107 */     return this; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ManufacturerEnum getManufacturer() {
/* 116 */     return this.manufacturer;
/*     */   }
/*     */   @JsonAdapter(ManufacturerEnum.Adapter.class) public enum ManufacturerEnum {
/*     */     NONE("NONE"), FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"), FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"), FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"), FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"), FINGERPRINT_CAMA("FINGERPRINT_CAMA"), FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"), HANDKEY_IR("HANDKEY_IR"), FACIAL("FACIAL"), FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"), FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"), FACIAL_VISICA("FACIAL_VISICA"), FINGERPRINT_DIXI("FINGERPRINT_DIXI"), FACIAL_DIXI("FACIAL_DIXI"), FACIAL_HENRY("FACIAL_HENRY"); private String value; ManufacturerEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ManufacturerEnum fromValue(String text) { byte b; int i; ManufacturerEnum[] arrayOfManufacturerEnum; for (i = (arrayOfManufacturerEnum = values()).length, b = 0; b < i; ) { ManufacturerEnum manufacturerEnum = arrayOfManufacturerEnum[b]; if (String.valueOf(manufacturerEnum.value).equals(text)) return manufacturerEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<ManufacturerEnum> {
/* 120 */       public void write(JsonWriter jsonWriter, AccessBiometry.ManufacturerEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public AccessBiometry.ManufacturerEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return AccessBiometry.ManufacturerEnum.fromValue(String.valueOf(value)); } } } public void setManufacturer(ManufacturerEnum manufacturer) { this.manufacturer = manufacturer; }
/*     */ 
/*     */   
/*     */   public AccessBiometry biometrySecurityLevel(Integer biometrySecurityLevel) {
/* 124 */     this.biometrySecurityLevel = biometrySecurityLevel;
/* 125 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Nível de segurança biométrica")
/*     */   public Integer getBiometrySecurityLevel() {
/* 135 */     return this.biometrySecurityLevel;
/*     */   }
/*     */   
/*     */   public void setBiometrySecurityLevel(Integer biometrySecurityLevel) {
/* 139 */     this.biometrySecurityLevel = biometrySecurityLevel;
/*     */   }
/*     */   
/*     */   public AccessBiometry templateList(List<String> templateList) {
/* 143 */     this.templateList = templateList;
/* 144 */     return this;
/*     */   }
/*     */   
/*     */   public AccessBiometry addTemplateListItem(String templateListItem) {
/* 148 */     if (this.templateList == null) {
/* 149 */       this.templateList = new ArrayList<>();
/*     */     }
/* 151 */     this.templateList.add(templateListItem);
/* 152 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Caracteres codificados em base64")
/*     */   public List<String> getTemplateList() {
/* 162 */     return this.templateList;
/*     */   }
/*     */   
/*     */   public void setTemplateList(List<String> templateList) {
/* 166 */     this.templateList = templateList;
/*     */   }
/*     */   
/*     */   public AccessBiometry personId(Long personId) {
/* 170 */     this.personId = personId;
/* 171 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador da pessoa")
/*     */   public Long getPersonId() {
/* 181 */     return this.personId;
/*     */   }
/*     */   
/*     */   public void setPersonId(Long personId) {
/* 185 */     this.personId = personId;
/*     */   }
/*     */   
/*     */   public AccessBiometry cardList(List<CardAndTechnology> cardList) {
/* 189 */     this.cardList = cardList;
/* 190 */     return this;
/*     */   }
/*     */   
/*     */   public AccessBiometry addCardListItem(CardAndTechnology cardListItem) {
/* 194 */     if (this.cardList == null) {
/* 195 */       this.cardList = new ArrayList<>();
/*     */     }
/* 197 */     this.cardList.add(cardListItem);
/* 198 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Lista de cartões")
/*     */   public List<CardAndTechnology> getCardList() {
/* 208 */     return this.cardList;
/*     */   }
/*     */   
/*     */   public void setCardList(List<CardAndTechnology> cardList) {
/* 212 */     this.cardList = cardList;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 217 */     if (this == o) {
/* 218 */       return true;
/*     */     }
/* 220 */     if (o == null || getClass() != o.getClass()) {
/* 221 */       return false;
/*     */     }
/* 223 */     AccessBiometry accessBiometry = (AccessBiometry)o;
/* 224 */     return (Objects.equals(this.manufacturer, accessBiometry.manufacturer) && 
/* 225 */       Objects.equals(this.biometrySecurityLevel, accessBiometry.biometrySecurityLevel) && 
/* 226 */       Objects.equals(this.templateList, accessBiometry.templateList) && 
/* 227 */       Objects.equals(this.personId, accessBiometry.personId) && 
/* 228 */       Objects.equals(this.cardList, accessBiometry.cardList));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 233 */     return Objects.hash(new Object[] { this.manufacturer, this.biometrySecurityLevel, this.templateList, this.personId, this.cardList });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 238 */     StringBuilder sb = new StringBuilder();
/* 239 */     sb.append("class AccessBiometry {\n");
/*     */     
/* 241 */     sb.append("    manufacturer: ").append(toIndentedString(this.manufacturer)).append("\n");
/* 242 */     sb.append("    biometrySecurityLevel: ").append(toIndentedString(this.biometrySecurityLevel)).append("\n");
/* 243 */     sb.append("    templateList: ").append(toIndentedString(this.templateList)).append("\n");
/* 244 */     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
/* 245 */     sb.append("    cardList: ").append(toIndentedString(this.cardList)).append("\n");
/* 246 */     sb.append("}");
/* 247 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 255 */     if (o == null) {
/* 256 */       return "null";
/*     */     }
/* 258 */     return o.toString().replace("\n", "\n    ");
/*     */   }
/*     */ }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AccessBiometry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
