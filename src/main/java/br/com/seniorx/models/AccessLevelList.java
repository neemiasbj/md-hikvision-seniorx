/*     */ package br.com.seniorx.models;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;

/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;

/*     */ import io.swagger.v3.oas.annotations.media.Schema;
/*     */ 
/*     */ 
/*     */ public class AccessLevelList
/*     */ {
/*     */   @SerializedName("id")
/*  13 */   private Long id = null;
/*     */   
/*     */   @SerializedName("readerAndTimezoneList")
/*  16 */   private List<ReaderAndTimezone> readerAndTimezoneList = null;
/*     */   
/*     */   public AccessLevelList id(Long id) {
/*  19 */     this.id = id;
/*  20 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public Long getId() {
/*  30 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(Long id) {
/*  34 */     this.id = id;
/*     */   }
/*     */   
/*     */   public AccessLevelList readerAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
/*  38 */     this.readerAndTimezoneList = readerAndTimezoneList;
/*  39 */     return this;
/*     */   }
/*     */   
/*     */   public AccessLevelList addReaderAndTimezoneListItem(ReaderAndTimezone readerAndTimezoneListItem) {
/*  43 */     if (this.readerAndTimezoneList == null) {
/*  44 */       this.readerAndTimezoneList = new ArrayList<>();
/*     */     }
/*  46 */     this.readerAndTimezoneList.add(readerAndTimezoneListItem);
/*  47 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Schema(description = "")
/*     */   public List<ReaderAndTimezone> getReaderAndTimezoneList() {
/*  57 */     return this.readerAndTimezoneList;
/*     */   }
/*     */   
/*     */   public void setReaderAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
/*  61 */     this.readerAndTimezoneList = readerAndTimezoneList;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  66 */     if (this == o) {
/*  67 */       return true;
/*     */     }
/*  69 */     if (o == null || getClass() != o.getClass()) {
/*  70 */       return false;
/*     */     }
/*  72 */     AccessLevelList accessLevelList = (AccessLevelList)o;
/*  73 */     return (Objects.equals(this.id, accessLevelList.id) && 
/*  74 */       Objects.equals(this.readerAndTimezoneList, accessLevelList.readerAndTimezoneList));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  79 */     return Objects.hash(new Object[] { this.id, this.readerAndTimezoneList });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  84 */     StringBuilder sb = new StringBuilder();
/*  85 */     sb.append("class AccessLevelList {\n");
/*     */     
/*  87 */     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
/*  88 */     sb.append("    readerAndTimezoneList: ").append(toIndentedString(this.readerAndTimezoneList)).append("\n");
/*  89 */     sb.append("}");
/*  90 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/*  98 */     if (o == null) {
/*  99 */       return "null";
/*     */     }
/* 101 */     return o.toString().replace("\n", "\n    ");
/*     */   }
/*     */ }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AccessLevelList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import io.swagger.v3.oas.annotations.media.Schema;

public class AccessLevelList {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("readerAndTimezoneList")
	private List<ReaderAndTimezone> readerAndTimezoneList = null;

	public AccessLevelList id(Long id) {
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

	public AccessLevelList readerAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
		this.readerAndTimezoneList = readerAndTimezoneList;
		return this;
	}

	public AccessLevelList addReaderAndTimezoneListItem(ReaderAndTimezone readerAndTimezoneListItem) {
		if (this.readerAndTimezoneList == null) {
			this.readerAndTimezoneList = new ArrayList<ReaderAndTimezone>();
		}
		this.readerAndTimezoneList.add(readerAndTimezoneListItem);
		return this;
	}

	/**
	 * Get readerAndTimezoneList
	 * 
	 * @return readerAndTimezoneList
	 **/
	@Schema(description  = "")
	public List<ReaderAndTimezone> getReaderAndTimezoneList() {
		return readerAndTimezoneList;
	}

	public void setReaderAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
		this.readerAndTimezoneList = readerAndTimezoneList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessLevelList accessLevelList = (AccessLevelList) o;
		return Objects.equals(this.id, accessLevelList.id)
				&& Objects.equals(this.readerAndTimezoneList, accessLevelList.readerAndTimezoneList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, readerAndTimezoneList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessLevelList {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    readerAndTimezoneList: ").append(toIndentedString(readerAndTimezoneList)).append("\n");
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
