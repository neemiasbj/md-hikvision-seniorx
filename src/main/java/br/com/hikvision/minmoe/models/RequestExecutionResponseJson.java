<<<<<<< HEAD
/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JsonIgnoreProperties(ignoreUnknown = true)
/*    */ public class RequestExecutionResponseJson
/*    */ {
/*    */   @JsonProperty("statusCode")
/*    */   private int statusCode;
/*    */   @JsonProperty("statusString")
/*    */   private String statusString;
/*    */   @JsonProperty("subStatusCode")
/*    */   private String subStatusCode;
/*    */   @JsonProperty("errorCode")
/*    */   private long errorCode;
/*    */   @JsonProperty("errorMsg")
/*    */   private String errorMsg;
/*    */   
/*    */   public int getStatusCode() {
/* 27 */     return this.statusCode;
/*    */   }
/*    */   
/*    */   public void setStatusCode(int statusCode) {
/* 31 */     this.statusCode = statusCode;
/*    */   }
/*    */   
/*    */   public String getStatusString() {
/* 35 */     return this.statusString;
/*    */   }
/*    */   
/*    */   public void setStatusString(String statusString) {
/* 39 */     this.statusString = statusString;
/*    */   }
/*    */   
/*    */   public String getSubStatusCode() {
/* 43 */     return this.subStatusCode;
/*    */   }
/*    */   
/*    */   public void setSubStatusCode(String subStatusCode) {
/* 47 */     this.subStatusCode = subStatusCode;
/*    */   }
/*    */   
/*    */   public long getErrorCode() {
/* 51 */     return this.errorCode;
/*    */   }
/*    */   
/*    */   public void setErrorCode(long errorCode) {
/* 55 */     this.errorCode = errorCode;
/*    */   }
/*    */   
/*    */   public String getErrorMsg() {
/* 59 */     return this.errorMsg;
/*    */   }
/*    */   
/*    */   public void setErrorMsg(String errorMsg) {
/* 63 */     this.errorMsg = errorMsg;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\RequestExecutionResponseJson.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestExecutionResponseJson {

	@JsonProperty("statusCode")
	private int statusCode;

	@JsonProperty("statusString")
	private String statusString;

	@JsonProperty("subStatusCode")
	private String subStatusCode;

	@JsonProperty("errorCode")
	private long errorCode;

	@JsonProperty("errorMsg")
	private String errorMsg;

	// Getters and setters

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusString() {
		return statusString;
	}

	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	public String getSubStatusCode() {
		return subStatusCode;
	}

	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
