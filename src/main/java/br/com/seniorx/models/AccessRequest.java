/*     */ package br.com.seniorx.models;
/*     */ import java.util.Objects;

/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;

/*     */ import io.swagger.v3.oas.annotations.media.Schema;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AccessRequest
/*     */ {
/*     */   @SerializedName("readerId")
/*  12 */   private Long readerId = null;
/*     */   
/*     */   @SerializedName("cardId")
/*  15 */   private Long cardId = null;
/*     */   
/*     */   @SerializedName("personId")
/*  18 */   private Long personId = null;
/*     */   
/*     */   @SerializedName("requestDateTime")
/*  21 */   private String requestDateTime = null;
/*     */   
/*     */   public AccessRequest readerId(Long readerId) {
/*  24 */     this.readerId = readerId;
/*  25 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador da leitora")
/*     */   public Long getReaderId() {
/*  35 */     return this.readerId;
/*     */   }
/*     */   
/*     */   public void setReaderId(Long readerId) {
/*  39 */     this.readerId = readerId;
/*     */   }
/*     */   
/*     */   public AccessRequest cardId(Long cardId) {
/*  43 */     this.cardId = cardId;
/*  44 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador do cartão")
/*     */   public Long getCardId() {
/*  54 */     return this.cardId;
/*     */   }
/*     */   
/*     */   public void setCardId(Long cardId) {
/*  58 */     this.cardId = cardId;
/*     */   }
/*     */   
/*     */   public AccessRequest personId(Long personId) {
/*  62 */     this.personId = personId;
/*  63 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador da pessoa")
/*     */   public Long getPersonId() {
/*  73 */     return this.personId;
/*     */   }
/*     */   
/*     */   public void setPersonId(Long personId) {
/*  77 */     this.personId = personId;
/*     */   }
/*     */   
/*     */   public AccessRequest requestDateTime(String requestDateTime) {
/*  81 */     this.requestDateTime = requestDateTime;
/*  82 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Data e hora da requisição de acesso")
/*     */   public String getRequestDateTime() {
/*  92 */     return this.requestDateTime;
/*     */   }
/*     */   
/*     */   public void setRequestDateTime(String requestDateTime) {
/*  96 */     this.requestDateTime = requestDateTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 101 */     if (this == o) {
/* 102 */       return true;
/*     */     }
/* 104 */     if (o == null || getClass() != o.getClass()) {
/* 105 */       return false;
/*     */     }
/* 107 */     AccessRequest accessRequest = (AccessRequest)o;
/* 108 */     return (Objects.equals(this.readerId, accessRequest.readerId) && 
/* 109 */       Objects.equals(this.cardId, accessRequest.cardId) && 
/* 110 */       Objects.equals(this.personId, accessRequest.personId) && 
/* 111 */       Objects.equals(this.requestDateTime, accessRequest.requestDateTime));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 116 */     return Objects.hash(new Object[] { this.readerId, this.cardId, this.personId, this.requestDateTime });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 121 */     StringBuilder sb = new StringBuilder();
/* 122 */     sb.append("class AccessRequest {\n");
/*     */     
/* 124 */     sb.append("    readerId: ").append(toIndentedString(this.readerId)).append("\n");
/* 125 */     sb.append("    cardId: ").append(toIndentedString(this.cardId)).append("\n");
/* 126 */     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
/* 127 */     sb.append("    requestDateTime: ").append(toIndentedString(this.requestDateTime)).append("\n");
/* 128 */     sb.append("}");
/* 129 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 137 */     if (o == null) {
/* 138 */       return "null";
/*     */     }
/* 140 */     return o.toString().replace("\n", "\n    ");
/*     */   }
/*     */ }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AccessRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import io.swagger.v3.oas.annotations.media.Schema;

public class AccessRequest {
	@SerializedName("readerId")
	private Long readerId = null;

	@SerializedName("cardId")
	private Long cardId = null;

	@SerializedName("personId")
	private Long personId = null;

	@SerializedName("requestDateTime")
	private String requestDateTime = null;

	public AccessRequest readerId(Long readerId) {
		this.readerId = readerId;
		return this;
	}

	/**
	 * Identificador da leitora
	 * 
	 * @return readerId
	 **/
	@Schema(description = "Identificador da leitora")
	public Long getReaderId() {
		return readerId;
	}

	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}

	public AccessRequest cardId(Long cardId) {
		this.cardId = cardId;
		return this;
	}

	/**
	 * Identificador do cartão
	 * 
	 * @return cardId
	 **/
	@Schema(description = "Identificador do cartão")
	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public AccessRequest personId(Long personId) {
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

	public AccessRequest requestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
		return this;
	}

	/**
	 * Data e hora da requisição de acesso
	 * 
	 * @return requestDateTime
	 **/
	@Schema(description = "Data e hora da requisição de acesso")
	public String getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessRequest accessRequest = (AccessRequest) o;
		return Objects.equals(this.readerId, accessRequest.readerId)
				&& Objects.equals(this.cardId, accessRequest.cardId)
				&& Objects.equals(this.personId, accessRequest.personId)
				&& Objects.equals(this.requestDateTime, accessRequest.requestDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(readerId, cardId, personId, requestDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessRequest {\n");

		sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
		sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    requestDateTime: ").append(toIndentedString(requestDateTime)).append("\n");
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
