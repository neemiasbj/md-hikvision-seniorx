/*     */ package br.com.seniorx.models;
/*     */ import java.util.Objects;

/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;

/*     */ import io.swagger.v3.oas.annotations.media.Schema;
/*     */ 
/*     */ 
/*     */ public class ActiveDeviceOutputPendency
/*     */ {
/*     */   @SerializedName("pendencyId")
/*  11 */   private Long pendencyId = null;
/*     */   
/*     */   @SerializedName("managerDeviceId")
/*  14 */   private Long managerDeviceId = null;
/*     */   
/*     */   @SerializedName("deviceId")
/*  17 */   private Long deviceId = null;
/*     */   
/*     */   @SerializedName("activationTime")
/*  20 */   private Long activationTime = null;
/*     */   
/*     */   public ActiveDeviceOutputPendency pendencyId(Long pendencyId) {
/*  23 */     this.pendencyId = pendencyId;
/*  24 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador da pendência")
/*     */   public Long getPendencyId() {
/*  34 */     return this.pendencyId;
/*     */   }
/*     */   
/*     */   public void setPendencyId(Long pendencyId) {
/*  38 */     this.pendencyId = pendencyId;
/*     */   }
/*     */   
/*     */   public ActiveDeviceOutputPendency managerDeviceId(Long managerDeviceId) {
/*  42 */     this.managerDeviceId = managerDeviceId;
/*  43 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador do dispositivo gerenciador")
/*     */   public Long getManagerDeviceId() {
/*  53 */     return this.managerDeviceId;
/*     */   }
/*     */   
/*     */   public void setManagerDeviceId(Long managerDeviceId) {
/*  57 */     this.managerDeviceId = managerDeviceId;
/*     */   }
/*     */   
/*     */   public ActiveDeviceOutputPendency deviceId(Long deviceId) {
/*  61 */     this.deviceId = deviceId;
/*  62 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Identificador do dispositivo")
/*     */   public Long getDeviceId() {
/*  72 */     return this.deviceId;
/*     */   }
/*     */   
/*     */   public void setDeviceId(Long deviceId) {
/*  76 */     this.deviceId = deviceId;
/*     */   }
/*     */   
/*     */   public ActiveDeviceOutputPendency activationTime(Long activationTime) {
/*  80 */     this.activationTime = activationTime;
/*  81 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "Tempo de ativação em milissegundos")
/*     */   public Long getActivationTime() {
/*  91 */     return this.activationTime;
/*     */   }
/*     */   
/*     */   public void setActivationTime(Long activationTime) {
/*  95 */     this.activationTime = activationTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 100 */     if (this == o) {
/* 101 */       return true;
/*     */     }
/* 103 */     if (o == null || getClass() != o.getClass()) {
/* 104 */       return false;
/*     */     }
/* 106 */     ActiveDeviceOutputPendency activeDeviceOutputPendency = (ActiveDeviceOutputPendency)o;
/* 107 */     return (Objects.equals(this.pendencyId, activeDeviceOutputPendency.pendencyId) && 
/* 108 */       Objects.equals(this.managerDeviceId, activeDeviceOutputPendency.managerDeviceId) && 
/* 109 */       Objects.equals(this.deviceId, activeDeviceOutputPendency.deviceId) && 
/* 110 */       Objects.equals(this.activationTime, activeDeviceOutputPendency.activationTime));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 115 */     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.deviceId, this.activationTime });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 120 */     StringBuilder sb = new StringBuilder();
/* 121 */     sb.append("class ActiveDeviceOutputPendency {\n");
/*     */     
/* 123 */     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
/* 124 */     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
/* 125 */     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
/* 126 */     sb.append("    activationTime: ").append(toIndentedString(this.activationTime)).append("\n");
/* 127 */     sb.append("}");
/* 128 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 136 */     if (o == null) {
/* 137 */       return "null";
/*     */     }
/* 139 */     return o.toString().replace("\n", "\n    ");
/*     */   }
/*     */ }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ActiveDeviceOutputPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import io.swagger.v3.oas.annotations.media.Schema;

public class ActiveDeviceOutputPendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

	@SerializedName("deviceId")
	private Long deviceId = null;

	@SerializedName("activationTime")
	private Long activationTime = null;

	public ActiveDeviceOutputPendency pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		return this;
	}

	/**
	 * Identificador da pendência
	 * 
	 * @return pendencyId
	 **/
	@Schema(description  = "Identificador da pendência")
	public Long getPendencyId() {
		return pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public ActiveDeviceOutputPendency managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo gerenciador
	 * 
	 * @return managerDeviceId
	 **/
	@Schema(description  = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}

	public ActiveDeviceOutputPendency deviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Identificador do dispositivo
	 * 
	 * @return deviceId
	 **/
	@Schema(description  = "Identificador do dispositivo")
	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public ActiveDeviceOutputPendency activationTime(Long activationTime) {
		this.activationTime = activationTime;
		return this;
	}

	/**
	 * Tempo de ativação em milissegundos
	 * 
	 * @return activationTime
	 **/
	@Schema(description  = "Tempo de ativação em milissegundos")
	public Long getActivationTime() {
		return activationTime;
	}

	public void setActivationTime(Long activationTime) {
		this.activationTime = activationTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ActiveDeviceOutputPendency activeDeviceOutputPendency = (ActiveDeviceOutputPendency) o;
		return Objects.equals(this.pendencyId, activeDeviceOutputPendency.pendencyId)
				&& Objects.equals(this.managerDeviceId, activeDeviceOutputPendency.managerDeviceId)
				&& Objects.equals(this.deviceId, activeDeviceOutputPendency.deviceId)
				&& Objects.equals(this.activationTime, activeDeviceOutputPendency.activationTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendencyId, managerDeviceId, deviceId, activationTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ActiveDeviceOutputPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(managerDeviceId)).append("\n");
		sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
		sb.append("    activationTime: ").append(toIndentedString(activationTime)).append("\n");
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
