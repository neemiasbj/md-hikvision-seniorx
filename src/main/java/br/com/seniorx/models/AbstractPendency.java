/*    */ package br.com.seniorx.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;

/*    */ import io.swagger.v3.oas.annotations.media.Schema;
/*    */ 
/*    */ public abstract class AbstractPendency
/*    */ {
/*    */   @SerializedName("pendencyId")
/*  9 */   private Long pendencyId = null;
/*    */   
/*    */   @SerializedName("managerDeviceId")
/* 12 */   private Long managerDeviceId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Schema(description = "Identificador da pendência")
/*    */   public Long getPendencyId() {
/* 21 */     return this.pendencyId;
/*    */   }
/*    */   
/*    */   public void setPendencyId(Long pendencyId) {
/* 25 */     this.pendencyId = pendencyId;
/*    */   }
/*    */   
/*    */   public Object managerDeviceId(Long managerDeviceId) {
/* 29 */     this.managerDeviceId = managerDeviceId;
/* 30 */     return this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Schema(description = "Identificador do dispositivo gerenciador")
/*    */   public Long getManagerDeviceId() {
/* 40 */     return this.managerDeviceId;
/*    */   }
/*    */   
/*    */   public void setManagerDeviceId(Long managerDeviceId) {
/* 44 */     this.managerDeviceId = managerDeviceId;
/*    */   }
/*    */ }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AbstractPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import io.swagger.v3.oas.annotations.media.Schema;

public abstract class AbstractPendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

	/**
	 * Identificador da pendência
	 * 
	 * @return pendencyId
	 **/
	@Schema(description = "Identificador da pendência")
	public Long getPendencyId() {
		return pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public Object managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo gerenciador
	 * 
	 * @return managerDeviceId
	 **/
	@Schema(description = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
