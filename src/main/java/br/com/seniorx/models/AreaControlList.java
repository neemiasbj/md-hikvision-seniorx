<<<<<<< HEAD
 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 public class AreaControlList
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("gmt")
   private Integer gmt = null;
   
   @SerializedName("useDaylightSaving")
   private Boolean useDaylightSaving = Boolean.valueOf(false);
   
   @SerializedName("startDaylightSaving")
   private String startDaylightSaving = null;
   
   @SerializedName("endDaylightSaving")
   private String endDaylightSaving = null;
   
   @SerializedName("daylightSavingOffset")
   private Integer daylightSavingOffset = null;
   
   @SerializedName("checkLevel")
   private Boolean checkLevel = Boolean.valueOf(false);
   
   @SerializedName("checkAntiPassback")
   private Boolean checkAntiPassback = Boolean.valueOf(false);
   
   @SerializedName("checkCapacity")
   private Boolean checkCapacity = Boolean.valueOf(false);
   
   @SerializedName("checkAccessCredit")
   private Boolean checkAccessCredit = Boolean.valueOf(false);
   
   @SerializedName("checkAccessLevel")
   private Boolean checkAccessLevel = Boolean.valueOf(false);
   
   @SerializedName("checkTimezoneLocation")
   private Boolean checkTimezoneLocation = Boolean.valueOf(false);
   
   @SerializedName("checkAccessLevelAuthorizer")
   private Boolean checkAccessLevelAuthorizer = Boolean.valueOf(false);
   
   @SerializedName("checkLocationAuthorizer")
   private Boolean checkLocationAuthorizer = Boolean.valueOf(false);
   
   @SerializedName("antiPassbackTime")
   private Long antiPassbackTime = null;
   
   public AreaControlList id(Long id) {
     this.id = id;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public Long getId() {
     return this.id;
   }
   
   public void setId(Long id) {
     this.id = id;
   }
   
   public AreaControlList gmt(Integer gmt) {
     this.gmt = gmt;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa a diferença em minutos do meridiano de Greenwich")
   public Integer getGmt() {
     return this.gmt;
   }
   
   public void setGmt(Integer gmt) {
     this.gmt = gmt;
   }
   
   public AreaControlList useDaylightSaving(Boolean useDaylightSaving) {
     this.useDaylightSaving = useDaylightSaving;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa se utiliza horário de verão")
   public Boolean isUseDaylightSaving() {
     return this.useDaylightSaving;
   }
   
   public void setUseDaylightSaving(Boolean useDaylightSaving) {
     this.useDaylightSaving = useDaylightSaving;
   }
   
   public AreaControlList startDaylightSaving(String startDaylightSaving) {
     this.startDaylightSaving = startDaylightSaving;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa a data início do horário de verão. (ISO 8601)")
   public String getStartDaylightSaving() {
     return this.startDaylightSaving;
   }
   
   public void setStartDaylightSaving(String startDaylightSaving) {
     this.startDaylightSaving = startDaylightSaving;
   }
   
   public AreaControlList endDaylightSaving(String endDaylightSaving) {
     this.endDaylightSaving = endDaylightSaving;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa data de término do horário de verão. (ISO 8601)")
   public String getEndDaylightSaving() {
     return this.endDaylightSaving;
   }
   
   public void setEndDaylightSaving(String endDaylightSaving) {
     this.endDaylightSaving = endDaylightSaving;
   }
   
   public AreaControlList daylightSavingOffset(Integer daylightSavingOffset) {
     this.daylightSavingOffset = daylightSavingOffset;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Quantidade em minutos que será somado ao gmt em horário de verão")
   public Integer getDaylightSavingOffset() {
     return this.daylightSavingOffset;
   }
   
   public void setDaylightSavingOffset(Integer daylightSavingOffset) {
     this.daylightSavingOffset = daylightSavingOffset;
   }
   
   public AreaControlList checkLevel(Boolean checkLevel) {
     this.checkLevel = checkLevel;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa se o local controla nível da pessoa")
   public Boolean isCheckLevel() {
     return this.checkLevel;
   }
   
   public void setCheckLevel(Boolean checkLevel) {
     this.checkLevel = checkLevel;
   }
   
   public AreaControlList checkAntiPassback(Boolean checkAntiPassback) {
     this.checkAntiPassback = checkAntiPassback;
     return this;
   }
 
 
 
 
 
 
   
   @Schema(description = "Informa se o local utiliza controle de anti-dupla, impedindo que o mesmo cartão realize acesso duas vezes seguidas na mesma direção")
   public Boolean isCheckAntiPassback() {
     return this.checkAntiPassback;
   }
   
   public void setCheckAntiPassback(Boolean checkAntiPassback) {
     this.checkAntiPassback = checkAntiPassback;
   }
   
   public AreaControlList checkCapacity(Boolean checkCapacity) {
     this.checkCapacity = checkCapacity;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa se o local controla lotação")
   public Boolean isCheckCapacity() {
     return this.checkCapacity;
   }
   
   public void setCheckCapacity(Boolean checkCapacity) {
     this.checkCapacity = checkCapacity;
   }
   
   public AreaControlList checkAccessCredit(Boolean checkAccessCredit) {
     this.checkAccessCredit = checkAccessCredit;
     return this;
   }
 
 
 
 
 
 
   
   @Schema(description = "Informa se o local valida se o papel terá controle de acesso por meio de créditos")
   public Boolean isCheckAccessCredit() {
     return this.checkAccessCredit;
   }
   
   public void setCheckAccessCredit(Boolean checkAccessCredit) {
     this.checkAccessCredit = checkAccessCredit;
   }
   
   public AreaControlList checkAccessLevel(Boolean checkAccessLevel) {
     this.checkAccessLevel = checkAccessLevel;
     return this;
   }
 
 
 
 
 
 
   
   @Schema(description = "Informa se os dispositivos que pertencem a esse local físico realizam a validação de nível da pessoa")
   public Boolean isCheckAccessLevel() {
     return this.checkAccessLevel;
   }
   
   public void setCheckAccessLevel(Boolean checkAccessLevel) {
     this.checkAccessLevel = checkAccessLevel;
   }
   
   public AreaControlList checkTimezoneLocation(Boolean checkTimezoneLocation) {
     this.checkTimezoneLocation = checkTimezoneLocation;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa se o local controla faixa horária do local")
   public Boolean isCheckTimezoneLocation() {
     return this.checkTimezoneLocation;
   }
   
   public void setCheckTimezoneLocation(Boolean checkTimezoneLocation) {
     this.checkTimezoneLocation = checkTimezoneLocation;
   }
   
   public AreaControlList checkAccessLevelAuthorizer(Boolean checkAccessLevelAuthorizer) {
     this.checkAccessLevelAuthorizer = checkAccessLevelAuthorizer;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa se o autorizador do local terá impacto nos níveis do local")
   public Boolean isCheckAccessLevelAuthorizer() {
     return this.checkAccessLevelAuthorizer;
   }
   
   public void setCheckAccessLevelAuthorizer(Boolean checkAccessLevelAuthorizer) {
     this.checkAccessLevelAuthorizer = checkAccessLevelAuthorizer;
   }
   
   public AreaControlList checkLocationAuthorizer(Boolean checkLocationAuthorizer) {
     this.checkLocationAuthorizer = checkLocationAuthorizer;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Informa se o local valida por autorizador")
   public Boolean isCheckLocationAuthorizer() {
     return this.checkLocationAuthorizer;
   }
   
   public void setCheckLocationAuthorizer(Boolean checkLocationAuthorizer) {
     this.checkLocationAuthorizer = checkLocationAuthorizer;
   }
   
   public AreaControlList antiPassbackTime(Long antiPassbackTime) {
     this.antiPassbackTime = antiPassbackTime;
     return this;
   }
 
 
 
 
 
 
   
   @Schema(description = "É o tempo mínimo de acesso para o mesmo destino, a fim de evitar duas pessoas utilizar o mesmo cartão para acessar o mesmo local")
   public Long getAntiPassbackTime() {
     return this.antiPassbackTime;
   }
   
   public void setAntiPassbackTime(Long antiPassbackTime) {
     this.antiPassbackTime = antiPassbackTime;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     AreaControlList areaControlList = (AreaControlList)o;
     return (Objects.equals(this.id, areaControlList.id) && Objects.equals(this.gmt, areaControlList.gmt) && 
       Objects.equals(this.useDaylightSaving, areaControlList.useDaylightSaving) && 
       Objects.equals(this.startDaylightSaving, areaControlList.startDaylightSaving) && 
       Objects.equals(this.endDaylightSaving, areaControlList.endDaylightSaving) && 
       Objects.equals(this.daylightSavingOffset, areaControlList.daylightSavingOffset) && 
       Objects.equals(this.checkLevel, areaControlList.checkLevel) && 
       Objects.equals(this.checkAntiPassback, areaControlList.checkAntiPassback) && 
       Objects.equals(this.checkCapacity, areaControlList.checkCapacity) && 
       Objects.equals(this.checkAccessCredit, areaControlList.checkAccessCredit) && 
       Objects.equals(this.checkAccessLevel, areaControlList.checkAccessLevel) && 
       Objects.equals(this.checkTimezoneLocation, areaControlList.checkTimezoneLocation) && 
       Objects.equals(this.checkAccessLevelAuthorizer, areaControlList.checkAccessLevelAuthorizer) && 
       Objects.equals(this.checkLocationAuthorizer, areaControlList.checkLocationAuthorizer) && 
       Objects.equals(this.antiPassbackTime, areaControlList.antiPassbackTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.gmt, this.useDaylightSaving, this.startDaylightSaving, this.endDaylightSaving, this.daylightSavingOffset, 
           this.checkLevel, this.checkAntiPassback, this.checkCapacity, this.checkAccessCredit, this.checkAccessLevel, 
           this.checkTimezoneLocation, this.checkAccessLevelAuthorizer, this.checkLocationAuthorizer, this.antiPassbackTime });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class AreaControlList {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    gmt: ").append(toIndentedString(this.gmt)).append("\n");
     sb.append("    useDaylightSaving: ").append(toIndentedString(this.useDaylightSaving)).append("\n");
     sb.append("    startDaylightSaving: ").append(toIndentedString(this.startDaylightSaving)).append("\n");
     sb.append("    endDaylightSaving: ").append(toIndentedString(this.endDaylightSaving)).append("\n");
     sb.append("    daylightSavingOffset: ").append(toIndentedString(this.daylightSavingOffset)).append("\n");
     sb.append("    checkLevel: ").append(toIndentedString(this.checkLevel)).append("\n");
     sb.append("    checkAntiPassback: ").append(toIndentedString(this.checkAntiPassback)).append("\n");
     sb.append("    checkCapacity: ").append(toIndentedString(this.checkCapacity)).append("\n");
     sb.append("    checkAccessCredit: ").append(toIndentedString(this.checkAccessCredit)).append("\n");
     sb.append("    checkAccessLevel: ").append(toIndentedString(this.checkAccessLevel)).append("\n");
     sb.append("    checkTimezoneLocation: ").append(toIndentedString(this.checkTimezoneLocation)).append("\n");
     sb.append("    checkAccessLevelAuthorizer: ").append(toIndentedString(this.checkAccessLevelAuthorizer)).append("\n");
     sb.append("    checkLocationAuthorizer: ").append(toIndentedString(this.checkLocationAuthorizer)).append("\n");
     sb.append("    antiPassbackTime: ").append(toIndentedString(this.antiPassbackTime)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AreaControlList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

public class AreaControlList {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("gmt")
	private Integer gmt = null;

	@SerializedName("useDaylightSaving")
	private Boolean useDaylightSaving = false;

	@SerializedName("startDaylightSaving")
	private String startDaylightSaving = null;

	@SerializedName("endDaylightSaving")
	private String endDaylightSaving = null;

	@SerializedName("daylightSavingOffset")
	private Integer daylightSavingOffset = null;

	@SerializedName("checkLevel")
	private Boolean checkLevel = false;

	@SerializedName("checkAntiPassback")
	private Boolean checkAntiPassback = false;

	@SerializedName("checkCapacity")
	private Boolean checkCapacity = false;

	@SerializedName("checkAccessCredit")
	private Boolean checkAccessCredit = false;

	@SerializedName("checkAccessLevel")
	private Boolean checkAccessLevel = false;

	@SerializedName("checkTimezoneLocation")
	private Boolean checkTimezoneLocation = false;

	@SerializedName("checkAccessLevelAuthorizer")
	private Boolean checkAccessLevelAuthorizer = false;

	@SerializedName("checkLocationAuthorizer")
	private Boolean checkLocationAuthorizer = false;

	@SerializedName("antiPassbackTime")
	private Long antiPassbackTime = null;

	public AreaControlList id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description  = "")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AreaControlList gmt(Integer gmt) {
		this.gmt = gmt;
		return this;
	}

	/**
	 * Informa a diferença em minutos do meridiano de Greenwich
	 * 
	 * @return gmt
	 **/
	@Schema(description  = "Informa a diferença em minutos do meridiano de Greenwich")
	public Integer getGmt() {
		return gmt;
	}

	public void setGmt(Integer gmt) {
		this.gmt = gmt;
	}

	public AreaControlList useDaylightSaving(Boolean useDaylightSaving) {
		this.useDaylightSaving = useDaylightSaving;
		return this;
	}

	/**
	 * Informa se utiliza horário de verão
	 * 
	 * @return useDaylightSaving
	 **/
	@Schema(description  = "Informa se utiliza horário de verão")
	public Boolean isUseDaylightSaving() {
		return useDaylightSaving;
	}

	public void setUseDaylightSaving(Boolean useDaylightSaving) {
		this.useDaylightSaving = useDaylightSaving;
	}

	public AreaControlList startDaylightSaving(String startDaylightSaving) {
		this.startDaylightSaving = startDaylightSaving;
		return this;
	}

	/**
	 * Informa a data início do horário de verão. (ISO 8601)
	 * 
	 * @return startDaylightSaving
	 **/
	@Schema(description  = "Informa a data início do horário de verão. (ISO 8601)")
	public String getStartDaylightSaving() {
		return startDaylightSaving;
	}

	public void setStartDaylightSaving(String startDaylightSaving) {
		this.startDaylightSaving = startDaylightSaving;
	}

	public AreaControlList endDaylightSaving(String endDaylightSaving) {
		this.endDaylightSaving = endDaylightSaving;
		return this;
	}

	/**
	 * Informa data de término do horário de verão. (ISO 8601)
	 * 
	 * @return endDaylightSaving
	 **/
	@Schema(description  = "Informa data de término do horário de verão. (ISO 8601)")
	public String getEndDaylightSaving() {
		return endDaylightSaving;
	}

	public void setEndDaylightSaving(String endDaylightSaving) {
		this.endDaylightSaving = endDaylightSaving;
	}

	public AreaControlList daylightSavingOffset(Integer daylightSavingOffset) {
		this.daylightSavingOffset = daylightSavingOffset;
		return this;
	}

	/**
	 * Quantidade em minutos que será somado ao gmt em horário de verão
	 * 
	 * @return daylightSavingOffset
	 **/
	@Schema(description  = "Quantidade em minutos que será somado ao gmt em horário de verão")
	public Integer getDaylightSavingOffset() {
		return daylightSavingOffset;
	}

	public void setDaylightSavingOffset(Integer daylightSavingOffset) {
		this.daylightSavingOffset = daylightSavingOffset;
	}

	public AreaControlList checkLevel(Boolean checkLevel) {
		this.checkLevel = checkLevel;
		return this;
	}

	/**
	 * Informa se o local controla nível da pessoa
	 * 
	 * @return checkLevel
	 **/
	@Schema(description  = "Informa se o local controla nível da pessoa")
	public Boolean isCheckLevel() {
		return checkLevel;
	}

	public void setCheckLevel(Boolean checkLevel) {
		this.checkLevel = checkLevel;
	}

	public AreaControlList checkAntiPassback(Boolean checkAntiPassback) {
		this.checkAntiPassback = checkAntiPassback;
		return this;
	}

	/**
	 * Informa se o local utiliza controle de anti-dupla, impedindo que o mesmo
	 * cartão realize acesso duas vezes seguidas na mesma direção
	 * 
	 * @return checkAntiPassback
	 **/
	@Schema(description  = "Informa se o local utiliza controle de anti-dupla, impedindo que o mesmo cartão realize acesso duas vezes seguidas na mesma direção")
	public Boolean isCheckAntiPassback() {
		return checkAntiPassback;
	}

	public void setCheckAntiPassback(Boolean checkAntiPassback) {
		this.checkAntiPassback = checkAntiPassback;
	}

	public AreaControlList checkCapacity(Boolean checkCapacity) {
		this.checkCapacity = checkCapacity;
		return this;
	}

	/**
	 * Informa se o local controla lotação
	 * 
	 * @return checkCapacity
	 **/
	@Schema(description  = "Informa se o local controla lotação")
	public Boolean isCheckCapacity() {
		return checkCapacity;
	}

	public void setCheckCapacity(Boolean checkCapacity) {
		this.checkCapacity = checkCapacity;
	}

	public AreaControlList checkAccessCredit(Boolean checkAccessCredit) {
		this.checkAccessCredit = checkAccessCredit;
		return this;
	}

	/**
	 * Informa se o local valida se o papel terá controle de acesso por meio de
	 * créditos
	 * 
	 * @return checkAccessCredit
	 **/
	@Schema(description  = "Informa se o local valida se o papel terá controle de acesso por meio de créditos")
	public Boolean isCheckAccessCredit() {
		return checkAccessCredit;
	}

	public void setCheckAccessCredit(Boolean checkAccessCredit) {
		this.checkAccessCredit = checkAccessCredit;
	}

	public AreaControlList checkAccessLevel(Boolean checkAccessLevel) {
		this.checkAccessLevel = checkAccessLevel;
		return this;
	}

	/**
	 * Informa se os dispositivos que pertencem a esse local físico realizam a
	 * validação de nível da pessoa
	 * 
	 * @return checkAccessLevel
	 **/
	@Schema(description  = "Informa se os dispositivos que pertencem a esse local físico realizam a validação de nível da pessoa")
	public Boolean isCheckAccessLevel() {
		return checkAccessLevel;
	}

	public void setCheckAccessLevel(Boolean checkAccessLevel) {
		this.checkAccessLevel = checkAccessLevel;
	}

	public AreaControlList checkTimezoneLocation(Boolean checkTimezoneLocation) {
		this.checkTimezoneLocation = checkTimezoneLocation;
		return this;
	}

	/**
	 * Informa se o local controla faixa horária do local
	 * 
	 * @return checkTimezoneLocation
	 **/
	@Schema(description  = "Informa se o local controla faixa horária do local")
	public Boolean isCheckTimezoneLocation() {
		return checkTimezoneLocation;
	}

	public void setCheckTimezoneLocation(Boolean checkTimezoneLocation) {
		this.checkTimezoneLocation = checkTimezoneLocation;
	}

	public AreaControlList checkAccessLevelAuthorizer(Boolean checkAccessLevelAuthorizer) {
		this.checkAccessLevelAuthorizer = checkAccessLevelAuthorizer;
		return this;
	}

	/**
	 * Informa se o autorizador do local terá impacto nos níveis do local
	 * 
	 * @return checkAccessLevelAuthorizer
	 **/
	@Schema(description  = "Informa se o autorizador do local terá impacto nos níveis do local")
	public Boolean isCheckAccessLevelAuthorizer() {
		return checkAccessLevelAuthorizer;
	}

	public void setCheckAccessLevelAuthorizer(Boolean checkAccessLevelAuthorizer) {
		this.checkAccessLevelAuthorizer = checkAccessLevelAuthorizer;
	}

	public AreaControlList checkLocationAuthorizer(Boolean checkLocationAuthorizer) {
		this.checkLocationAuthorizer = checkLocationAuthorizer;
		return this;
	}

	/**
	 * Informa se o local valida por autorizador
	 * 
	 * @return checkLocationAuthorizer
	 **/
	@Schema(description  = "Informa se o local valida por autorizador")
	public Boolean isCheckLocationAuthorizer() {
		return checkLocationAuthorizer;
	}

	public void setCheckLocationAuthorizer(Boolean checkLocationAuthorizer) {
		this.checkLocationAuthorizer = checkLocationAuthorizer;
	}

	public AreaControlList antiPassbackTime(Long antiPassbackTime) {
		this.antiPassbackTime = antiPassbackTime;
		return this;
	}

	/**
	 * É o tempo mínimo de acesso para o mesmo destino, a fim de evitar duas pessoas
	 * utilizar o mesmo cartão para acessar o mesmo local
	 * 
	 * @return antiPassbackTime
	 **/
	@Schema(description  = "É o tempo mínimo de acesso para o mesmo destino, a fim de evitar duas pessoas utilizar o mesmo cartão para acessar o mesmo local")
	public Long getAntiPassbackTime() {
		return antiPassbackTime;
	}

	public void setAntiPassbackTime(Long antiPassbackTime) {
		this.antiPassbackTime = antiPassbackTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AreaControlList areaControlList = (AreaControlList) o;
		return Objects.equals(this.id, areaControlList.id) && Objects.equals(this.gmt, areaControlList.gmt)
				&& Objects.equals(this.useDaylightSaving, areaControlList.useDaylightSaving)
				&& Objects.equals(this.startDaylightSaving, areaControlList.startDaylightSaving)
				&& Objects.equals(this.endDaylightSaving, areaControlList.endDaylightSaving)
				&& Objects.equals(this.daylightSavingOffset, areaControlList.daylightSavingOffset)
				&& Objects.equals(this.checkLevel, areaControlList.checkLevel)
				&& Objects.equals(this.checkAntiPassback, areaControlList.checkAntiPassback)
				&& Objects.equals(this.checkCapacity, areaControlList.checkCapacity)
				&& Objects.equals(this.checkAccessCredit, areaControlList.checkAccessCredit)
				&& Objects.equals(this.checkAccessLevel, areaControlList.checkAccessLevel)
				&& Objects.equals(this.checkTimezoneLocation, areaControlList.checkTimezoneLocation)
				&& Objects.equals(this.checkAccessLevelAuthorizer, areaControlList.checkAccessLevelAuthorizer)
				&& Objects.equals(this.checkLocationAuthorizer, areaControlList.checkLocationAuthorizer)
				&& Objects.equals(this.antiPassbackTime, areaControlList.antiPassbackTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, gmt, useDaylightSaving, startDaylightSaving, endDaylightSaving, daylightSavingOffset,
				checkLevel, checkAntiPassback, checkCapacity, checkAccessCredit, checkAccessLevel,
				checkTimezoneLocation, checkAccessLevelAuthorizer, checkLocationAuthorizer, antiPassbackTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AreaControlList {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    gmt: ").append(toIndentedString(gmt)).append("\n");
		sb.append("    useDaylightSaving: ").append(toIndentedString(useDaylightSaving)).append("\n");
		sb.append("    startDaylightSaving: ").append(toIndentedString(startDaylightSaving)).append("\n");
		sb.append("    endDaylightSaving: ").append(toIndentedString(endDaylightSaving)).append("\n");
		sb.append("    daylightSavingOffset: ").append(toIndentedString(daylightSavingOffset)).append("\n");
		sb.append("    checkLevel: ").append(toIndentedString(checkLevel)).append("\n");
		sb.append("    checkAntiPassback: ").append(toIndentedString(checkAntiPassback)).append("\n");
		sb.append("    checkCapacity: ").append(toIndentedString(checkCapacity)).append("\n");
		sb.append("    checkAccessCredit: ").append(toIndentedString(checkAccessCredit)).append("\n");
		sb.append("    checkAccessLevel: ").append(toIndentedString(checkAccessLevel)).append("\n");
		sb.append("    checkTimezoneLocation: ").append(toIndentedString(checkTimezoneLocation)).append("\n");
		sb.append("    checkAccessLevelAuthorizer: ").append(toIndentedString(checkAccessLevelAuthorizer)).append("\n");
		sb.append("    checkLocationAuthorizer: ").append(toIndentedString(checkLocationAuthorizer)).append("\n");
		sb.append("    antiPassbackTime: ").append(toIndentedString(antiPassbackTime)).append("\n");
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
