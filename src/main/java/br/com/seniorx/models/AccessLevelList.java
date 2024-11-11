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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AccessLevelList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */