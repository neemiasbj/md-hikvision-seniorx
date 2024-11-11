<<<<<<< HEAD
/*    */ package br.com.seniorx.enums;
/*    */ 
/*    */ public enum PendencyUpdateStatus {
/*  4 */   DEVICE_NOT_FOUND(343, "Dispositivo não encontrado"), DEVICE_OFFLINE(344, "Dispositivo offline"),
/*  5 */   PENDING_NOT_IMPLEMENTED(345, "Pendência não implementada"),
/*  6 */   PENDING_EXECUTED_WITH_UNKNOWN_ERROR(346, "Pendência executada com erro desconhecido");
/*    */   
/*    */   private final int code;
/*    */   private final String description;
/*    */   
/*    */   PendencyUpdateStatus(int code, String description) {
/* 12 */     this.code = code;
/* 13 */     this.description = description;
/*    */   }
/*    */   
/*    */   public int getCode() {
/* 17 */     return this.code;
/*    */   }
/*    */   
/*    */   public String getDescription() {
/* 21 */     return this.description;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 26 */     return String.valueOf(this.code) + " - " + this.description;
/*    */   } public static PendencyUpdateStatus fromCode(int code) {
/*    */     byte b;
/*    */     int i;
/*    */     PendencyUpdateStatus[] arrayOfPendencyUpdateStatus;
/* 31 */     for (i = (arrayOfPendencyUpdateStatus = values()).length, b = 0; b < i; ) { PendencyUpdateStatus errorCode = arrayOfPendencyUpdateStatus[b];
/* 32 */       if (errorCode.getCode() == code)
/* 33 */         return errorCode; 
/*    */       b++; }
/*    */     
/* 36 */     throw new IllegalArgumentException("Código de erro desconhecido: " + code);
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\enums\PendencyUpdateStatus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.enums;

public enum PendencyUpdateStatus {
	DEVICE_NOT_FOUND(343, "Dispositivo não encontrado"), DEVICE_OFFLINE(344, "Dispositivo offline"),
	PENDING_NOT_IMPLEMENTED(345, "Pendência não implementada"),
	PENDING_EXECUTED_WITH_UNKNOWN_ERROR(346, "Pendência executada com erro desconhecido");

	private final int code;
	private final String description;

	PendencyUpdateStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return code + " - " + description;
	}

	// Método para buscar o enum pelo código
	public static PendencyUpdateStatus fromCode(int code) {
		for (PendencyUpdateStatus errorCode : PendencyUpdateStatus.values()) {
			if (errorCode.getCode() == code) {
				return errorCode;
			}
		}
		throw new IllegalArgumentException("Código de erro desconhecido: " + code);
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
