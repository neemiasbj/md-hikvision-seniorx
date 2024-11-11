/*     */ package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

public class Access { @SerializedName("deviceId")
/*     */   private Long deviceId; @SerializedName("date")
/*     */   private String date; @SerializedName("timezoneOffset")
/*     */   private Integer timezoneOffset; @SerializedName("status")
/*     */   private StatusEnum status; @SerializedName("accessType")
/*     */   private AccessTypeEnum accessType;
/*     */   @SerializedName("accessDirection")
/*     */   private AccessDirectionEnum accessDirection;
/*     */   @SerializedName("cardId")
/*     */   private Long cardId;
/*     */   @SerializedName("personId")
/*     */   private Long personId;
/*     */   @SerializedName("creditRange")
/*     */   private Integer creditRange;
/*     */   
/*  16 */   public Access() { this.deviceId = null;
/*     */ 
/*     */     
/*  19 */     this.date = null;
/*     */ 
/*     */     
/*  22 */     this.timezoneOffset = null;
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
/*  72 */     this.status = null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 203 */     this.accessType = null;
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
/* 255 */     this.accessDirection = null;
/*     */ 
/*     */     
/* 258 */     this.cardId = null;
/*     */ 
/*     */     
/* 261 */     this.personId = null;
/*     */ 
/*     */     
/* 264 */     this.creditRange = null; } @JsonAdapter(StatusEnum.Adapter.class) public enum StatusEnum {
/*     */     ONLINE("ONLINE"), OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b; int i; StatusEnum[] arrayOfStatusEnum; for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) { StatusEnum statusEnum = arrayOfStatusEnum[b]; if (String.valueOf(statusEnum.value).equals(text)) return statusEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<StatusEnum> {
/*     */       public void write(JsonWriter jsonWriter, Access.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Access.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Access.StatusEnum.fromValue(String.valueOf(value)); } } }
/* 267 */   public Access deviceId(Long deviceId) { this.deviceId = deviceId;
/* 268 */     return this; }

/*     */ @JsonAdapter(AccessTypeEnum.Adapter.class)
public enum AccessTypeEnum {
/*     */     ACCESS_VALID("ACCESS_VALID"), ACCESS_DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"), ACCESS_DENIED_SITUATION("ACCESS_DENIED_SITUATION"), ACCESS_DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"), ACCESS_DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"), ACCESS_DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"), ACCESS_DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"), ACCESS_DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"), ACCESS_DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"), ACCESS_VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"), ACCESS_DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"), ACCESS_DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"), ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"), ACCESS_DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"), ACCESS_DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"), ACCESS_DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"), ACCESS_DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"), ACCESS_DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"), ACCESS_COERCION("ACCESS_COERCION"), ACCESS_DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"), ACCESS_DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"), ACCESS_DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"), ACCESS_DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"), ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"), ACCESS_DESISTENCE("ACCESS_DESISTENCE"), ACCESS_VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"), ACCESS_VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"), ACCESS_VALID_FRAUD("ACCESS_VALID_FRAUD"), ACCESS_VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"), ACCESS_DENIED("ACCESS_DENIED"), ACCESS_DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"), ACCESS_DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"), ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"), ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"), ACCESS_DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"), ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"), ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"), ACCESS_DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"), ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT"), ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS("ACCESS_DENIED_CONTROLS_IN_BETWEEN_WORKDAYS"), ACCESS_DENIED_WITHOUT_MASK("ACCESS_DENIED_WITHOUT_MASK"), ACCESS_DENIED_ABNORMAL_TEMPERATURE("ACCESS_DENIED_ABNORMAL_TEMPERATURE");
/*     */     private String value;
/*     */     AccessTypeEnum(String value) { this.value = value; }
/*     */     public String getValue() { return this.value; }
/*     */     public String toString() { return String.valueOf(this.value); }
/*     */     public static AccessTypeEnum fromValue(String text) { byte b; int i; AccessTypeEnum[] arrayOfAccessTypeEnum; for (i = (arrayOfAccessTypeEnum = values()).length, b = 0; b < i; ) { AccessTypeEnum accessTypeEnum = arrayOfAccessTypeEnum[b]; if (String.valueOf(accessTypeEnum.value).equals(text))
/*     */           return accessTypeEnum;  b++; }
/*     */        return null; } public static class Adapter extends TypeAdapter<AccessTypeEnum> {
/* 278 */       public void write(JsonWriter jsonWriter, Access.AccessTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Access.AccessTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Access.AccessTypeEnum.fromValue(String.valueOf(value)); } } } @Schema(description = "Identificador do dispositivo") public Long getDeviceId() { return this.deviceId; }
/*     */   @JsonAdapter(AccessDirectionEnum.Adapter.class) public enum AccessDirectionEnum {
/*     */     UNKNOWN("UNKNOWN"), ENTRANCE("ENTRANCE"), EXIT("EXIT");
/*     */     private String value; AccessDirectionEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static AccessDirectionEnum fromValue(String text) { byte b; int i; AccessDirectionEnum[] arrayOfAccessDirectionEnum; for (i = (arrayOfAccessDirectionEnum = values()).length, b = 0; b < i; ) { AccessDirectionEnum accessDirectionEnum = arrayOfAccessDirectionEnum[b]; if (String.valueOf(accessDirectionEnum.value).equals(text)) return accessDirectionEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<AccessDirectionEnum> {
/* 282 */       public void write(JsonWriter jsonWriter, Access.AccessDirectionEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Access.AccessDirectionEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Access.AccessDirectionEnum.fromValue(String.valueOf(value)); } } } public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }
/*     */ 
/*     */   
/*     */   public Access date(String date) {
/* 286 */     this.date = date;
/* 287 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Data da notificação em UTC")
/*     */   public String getDate() {
/* 297 */     return this.date;
/*     */   }
/*     */   
/*     */   public void setDate(String date) {
/* 301 */     this.date = date;
/*     */   }
/*     */   
/*     */   public Access timezoneOffset(Integer timezoneOffset) {
/* 305 */     this.timezoneOffset = timezoneOffset;
/* 306 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Offset em minutos")
/*     */   public Integer getTimezoneOffset() {
/* 316 */     return this.timezoneOffset;
/*     */   }
/*     */   
/*     */   public void setTimezoneOffset(Integer timezoneOffset) {
/* 320 */     this.timezoneOffset = timezoneOffset;
/*     */   }
/*     */   
/*     */   public Access status(StatusEnum status) {
/* 324 */     this.status = status;
/* 325 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public StatusEnum getStatus() {
/* 335 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(StatusEnum status) {
/* 339 */     this.status = status;
/*     */   }
/*     */   
/*     */   public Access accessType(AccessTypeEnum accessType) {
/* 343 */     this.accessType = accessType;
/* 344 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public AccessTypeEnum getAccessType() {
/* 354 */     return this.accessType;
/*     */   }
/*     */   
/*     */   public void setAccessType(AccessTypeEnum accessType) {
/* 358 */     this.accessType = accessType;
/*     */   }
/*     */   
/*     */   public Access accessDirection(AccessDirectionEnum accessDirection) {
/* 362 */     this.accessDirection = accessDirection;
/* 363 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public AccessDirectionEnum getAccessDirection() {
/* 373 */     return this.accessDirection;
/*     */   }
/*     */   
/*     */   public void setAccessDirection(AccessDirectionEnum accessDirection) {
/* 377 */     this.accessDirection = accessDirection;
/*     */   }
/*     */   
/*     */   public Access cardId(Long cardId) {
/* 381 */     this.cardId = cardId;
/* 382 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Número do cartão")
/*     */   public Long getCardId() {
/* 392 */     return this.cardId;
/*     */   }
/*     */   
/*     */   public void setCardId(Long cardId) {
/* 396 */     this.cardId = cardId;
/*     */   }
/*     */   
/*     */   public Access personId(Long personId) {
/* 400 */     this.personId = personId;
/* 401 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador da pessoa")
/*     */   public Long getPersonId() {
/* 411 */     return this.personId;
/*     */   }
/*     */   
/*     */   public void setPersonId(Long personId) {
/* 415 */     this.personId = personId;
/*     */   }
/*     */   
/*     */   public Access creditRange(Integer creditRange) {
/* 419 */     this.creditRange = creditRange;
/* 420 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public Integer getCreditRange() {
/* 430 */     return this.creditRange;
/*     */   }
/*     */   
/*     */   public void setCreditRange(Integer creditRange) {
/* 434 */     this.creditRange = creditRange;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 439 */     if (this == o) {
/* 440 */       return true;
/*     */     }
/* 442 */     if (o == null || getClass() != o.getClass()) {
/* 443 */       return false;
/*     */     }
/* 445 */     Access access = (Access)o;
/* 446 */     return (Objects.equals(this.deviceId, access.deviceId) && Objects.equals(this.date, access.date) && 
/* 447 */       Objects.equals(this.timezoneOffset, access.timezoneOffset) && 
/* 448 */       Objects.equals(this.status, access.status) && Objects.equals(this.accessType, access.accessType) && 
/* 449 */       Objects.equals(this.accessDirection, access.accessDirection) && 
/* 450 */       Objects.equals(this.cardId, access.cardId) && Objects.equals(this.personId, access.personId) && 
/* 451 */       Objects.equals(this.creditRange, access.creditRange));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 456 */     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.accessType, this.accessDirection, this.cardId, this.personId, 
/* 457 */           this.creditRange });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 462 */     StringBuilder sb = new StringBuilder();
/* 463 */     sb.append("class Access {\n");
/*     */     
/* 465 */     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
/* 466 */     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
/* 467 */     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
/* 468 */     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
/* 469 */     sb.append("    accessType: ").append(toIndentedString(this.accessType)).append("\n");
/* 470 */     sb.append("    accessDirection: ").append(toIndentedString(this.accessDirection)).append("\n");
/* 471 */     sb.append("    cardId: ").append(toIndentedString(this.cardId)).append("\n");
/* 472 */     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
/* 473 */     sb.append("    creditRange: ").append(toIndentedString(this.creditRange)).append("\n");
/* 474 */     sb.append("}");
/* 475 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 483 */     if (o == null) {
/* 484 */       return "null";
/*     */     }
/* 486 */     return o.toString().replace("\n", "\n    ");
/*     */   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\Access.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */