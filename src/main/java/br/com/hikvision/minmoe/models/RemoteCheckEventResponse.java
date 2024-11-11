<<<<<<< HEAD
/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ public class RemoteCheckEventResponse
/*    */ {
/*    */   @JsonProperty("RemoteCheck")
/*    */   private RemoteCheck remoteCheck;
/*    */   
/*    */   public RemoteCheckEventResponse(int serialNo, String checkResult, String info) {
/* 11 */     this.remoteCheck = new RemoteCheck(serialNo, checkResult, info);
/*    */   }
/*    */ 
/*    */   
/*    */   public RemoteCheckEventResponse() {}
/*    */   
/*    */   public RemoteCheck getRemoteCheck() {
/* 18 */     return this.remoteCheck;
/*    */   }
/*    */   
/*    */   public void setRemoteCheck(RemoteCheck remoteCheck) {
/* 22 */     this.remoteCheck = remoteCheck;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class RemoteCheck
/*    */   {
/*    */     @JsonProperty("serialNo")
/*    */     private int serialNo;
/*    */     @JsonProperty("checkResult")
/*    */     private String checkResult;
/*    */     @JsonProperty("info")
/*    */     private String info;
/*    */     
/*    */     public RemoteCheck(int serialNo, String checkResult, String info) {
/* 36 */       this.serialNo = serialNo;
/* 37 */       this.checkResult = checkResult;
/* 38 */       this.info = info;
/*    */     }
/*    */ 
/*    */     
/*    */     public int getSerialNo() {
/* 43 */       return this.serialNo;
/*    */     }
/*    */     
/*    */     public void setSerialNo(int serialNo) {
/* 47 */       this.serialNo = serialNo;
/*    */     }
/*    */     
/*    */     public String getCheckResult() {
/* 51 */       return this.checkResult;
/*    */     }
/*    */     
/*    */     public void setCheckResult(String checkResult) {
/* 55 */       this.checkResult = checkResult;
/*    */     }
/*    */     
/*    */     public String getInfo() {
/* 59 */       return this.info;
/*    */     }
/*    */     
/*    */     public void setInfo(String info) {
/* 63 */       this.info = info;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\RemoteCheckEventResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RemoteCheckEventResponse {

	@JsonProperty("RemoteCheck")
	private RemoteCheck remoteCheck;

	public RemoteCheckEventResponse(int serialNo, String checkResult, String info) {
		this.remoteCheck = new RemoteCheck(serialNo, checkResult, info);
	}

	public RemoteCheckEventResponse() {
	}

	public RemoteCheck getRemoteCheck() {
		return remoteCheck;
	}

	public void setRemoteCheck(RemoteCheck remoteCheck) {
		this.remoteCheck = remoteCheck;
	}

	public static class RemoteCheck {
		@JsonProperty("serialNo")
		private int serialNo;

		@JsonProperty("checkResult")
		private String checkResult;

		@JsonProperty("info")
		private String info;

		public RemoteCheck(int serialNo, String checkResult, String info) {
			this.serialNo = serialNo;
			this.checkResult = checkResult;
			this.info = info;
		}

		// Getters e Setters
		public int getSerialNo() {
			return serialNo;
		}

		public void setSerialNo(int serialNo) {
			this.serialNo = serialNo;
		}

		public String getCheckResult() {
			return checkResult;
		}

		public void setCheckResult(String checkResult) {
			this.checkResult = checkResult;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
