<<<<<<< HEAD
/*     */ package br.com.seniorx.models;
/*     */ import java.io.IOException;
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
/*     */ public class AccessMessage
/*     */ {
/*     */   @SerializedName("accessType")
/*     */   private AccessTypeEnum accessType;
/*     */   @SerializedName("message")
/*     */   private String message;
/*     */   
/*     */   public AccessMessage() {
/* 144 */     this.accessType = null;
/*     */ 
/*     */     
/* 147 */     this.message = null;
/*     */   }
/*     */   
/* 150 */   public AccessMessage accessType(AccessTypeEnum accessType) { this.accessType = accessType;
/* 151 */     return this; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public AccessTypeEnum getAccessType() {
/* 161 */     return this.accessType;
/*     */   }
/*     */   @JsonAdapter(AccessTypeEnum.Adapter.class) public enum AccessTypeEnum {
/*     */     ACCESS_VALID("ACCESS_VALID"), ACCESS_DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"), ACCESS_DENIED_SITUATION("ACCESS_DENIED_SITUATION"), ACCESS_DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"), ACCESS_DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"), ACCESS_DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"), ACCESS_DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"), ACCESS_DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"), ACCESS_DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"), ACCESS_VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"), ACCESS_DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"), ACCESS_DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"), ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"), ACCESS_DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"), ACCESS_DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"), ACCESS_DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"), ACCESS_DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"), ACCESS_DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"), ACCESS_COERCION("ACCESS_COERCION"), ACCESS_DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"), ACCESS_DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"), ACCESS_DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"), ACCESS_DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"), ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"), ACCESS_DESISTENCE("ACCESS_DESISTENCE"), ACCESS_VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"), ACCESS_VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"), ACCESS_VALID_FRAUD("ACCESS_VALID_FRAUD"), ACCESS_VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"), ACCESS_DENIED("ACCESS_DENIED"), ACCESS_DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"), ACCESS_DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"), ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"), ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"), ACCESS_DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"), ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"), ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"), ACCESS_DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"), ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"), ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"), ACCESS_DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"), ACCESS_DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE"); private String value; AccessTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static AccessTypeEnum fromValue(String text) { byte b; int i; AccessTypeEnum[] arrayOfAccessTypeEnum; for (i = (arrayOfAccessTypeEnum = values()).length, b = 0; b < i; ) { AccessTypeEnum accessTypeEnum = arrayOfAccessTypeEnum[b]; if (String.valueOf(accessTypeEnum.value).equals(text)) return accessTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<AccessTypeEnum> {
/* 165 */       public void write(JsonWriter jsonWriter, AccessMessage.AccessTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public AccessMessage.AccessTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return AccessMessage.AccessTypeEnum.fromValue(String.valueOf(value)); } } } public void setAccessType(AccessTypeEnum accessType) { this.accessType = accessType; }
/*     */ 
/*     */   
/*     */   public AccessMessage message(String message) {
/* 169 */     this.message = message;
/* 170 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public String getMessage() {
/* 180 */     return this.message;
/*     */   }
/*     */   
/*     */   public void setMessage(String message) {
/* 184 */     this.message = message;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 189 */     if (this == o) {
/* 190 */       return true;
/*     */     }
/* 192 */     if (o == null || getClass() != o.getClass()) {
/* 193 */       return false;
/*     */     }
/* 195 */     AccessMessage accessMessage = (AccessMessage)o;
/* 196 */     return (Objects.equals(this.accessType, accessMessage.accessType) && Objects.equals(this.message, accessMessage.message));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 201 */     return Objects.hash(new Object[] { this.accessType, this.message });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 206 */     StringBuilder sb = new StringBuilder();
/* 207 */     sb.append("class AccessMessage {\n");
/*     */     
/* 209 */     sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
/* 210 */     sb.append("    message: ").append(toIndentedString(this.message)).append("\n");
/* 211 */     sb.append("}");
/* 212 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 220 */     if (o == null) {
/* 221 */       return "null";
/*     */     }
/* 223 */     return o.toString().replace("\n", "\n    ");
/*     */   }
/*     */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AccessMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

public class AccessMessage {

	/**
	 * Gets or Sets accessType
	 */
	@JsonAdapter(AccessTypeEnum.Adapter.class)
	public enum AccessTypeEnum {
		ACCESS_VALID("ACCESS_VALID"),

		ACCESS_DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),

		ACCESS_DENIED_SITUATION("ACCESS_DENIED_SITUATION"),

		ACCESS_DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),

		ACCESS_DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"),

		ACCESS_DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),

		ACCESS_DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"),

		ACCESS_DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),

		ACCESS_DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"),

		ACCESS_VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),

		ACCESS_DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"),

		ACCESS_DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),

		ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),

		ACCESS_DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"),

		ACCESS_DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),

		ACCESS_DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),

		ACCESS_DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),

		ACCESS_DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"),

		ACCESS_COERCION("ACCESS_COERCION"),

		ACCESS_DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"),

		ACCESS_DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),

		ACCESS_DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"),

		ACCESS_DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),

		ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"),

		ACCESS_DESISTENCE("ACCESS_DESISTENCE"),

		ACCESS_VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"),

		ACCESS_VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"),

		ACCESS_VALID_FRAUD("ACCESS_VALID_FRAUD"),

		ACCESS_VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"),

		ACCESS_DENIED("ACCESS_DENIED"),

		ACCESS_DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"),

		ACCESS_DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"),

		ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"),

		ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"),

		ACCESS_DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"),

		ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"),

		ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"),

		ACCESS_DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"),

		ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"),

		ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"),

		ACCESS_DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"),

		ACCESS_DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE");

		private String value;

		AccessTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AccessTypeEnum fromValue(String text) {
			for (AccessTypeEnum b : AccessTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AccessTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final AccessTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public AccessTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return AccessTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("accessType")
	private AccessTypeEnum accessType = null;

	@SerializedName("message")
	private String message = null;

	public AccessMessage accessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
		return this;
	}

	/**
	 * Get accessType
	 * 
	 * @return accessType
	 **/
	@Schema(description  = "")
	public AccessTypeEnum getAccessType() {
		return accessType;
	}

	public void setAccessType(AccessTypeEnum accessType) {
		this.accessType = accessType;
	}

	public AccessMessage message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@Schema(description  = "")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessMessage accessMessage = (AccessMessage) o;
		return Objects.equals(this.accessType, accessMessage.accessType) && Objects.equals(this.message, accessMessage.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessType, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessMessage {\n");

		sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
