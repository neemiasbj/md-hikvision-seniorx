/*     */ package br.com.hikvision.minmoe.models;
/*     */ 
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SearchPhotoResponse
/*     */ {
/*     */   @JsonProperty("statusCode")
/*     */   private int statusCode;
/*     */   @JsonProperty("statusString")
/*     */   private String statusString;
/*     */   @JsonProperty("subStatusCode")
/*     */   private String subStatusCode;
/*     */   @JsonProperty("responseStatusStrg")
/*     */   private String responseStatusStrg;
/*     */   @JsonProperty("numOfMatches")
/*     */   private int numOfMatches;
/*     */   @JsonProperty("totalMatches")
/*     */   private int totalMatches;
/*     */   @JsonProperty("MatchList")
/*     */   private List<Match> matchList;
/*     */   
/*     */   public int getStatusCode() {
/*  31 */     return this.statusCode;
/*     */   }
/*     */   
/*     */   public void setStatusCode(int statusCode) {
/*  35 */     this.statusCode = statusCode;
/*     */   }
/*     */   
/*     */   public String getStatusString() {
/*  39 */     return this.statusString;
/*     */   }
/*     */   
/*     */   public void setStatusString(String statusString) {
/*  43 */     this.statusString = statusString;
/*     */   }
/*     */   
/*     */   public String getSubStatusCode() {
/*  47 */     return this.subStatusCode;
/*     */   }
/*     */   
/*     */   public void setSubStatusCode(String subStatusCode) {
/*  51 */     this.subStatusCode = subStatusCode;
/*     */   }
/*     */   
/*     */   public String getResponseStatusStrg() {
/*  55 */     return this.responseStatusStrg;
/*     */   }
/*     */   
/*     */   public void setResponseStatusStrg(String responseStatusStrg) {
/*  59 */     this.responseStatusStrg = responseStatusStrg;
/*     */   }
/*     */   
/*     */   public int getNumOfMatches() {
/*  63 */     return this.numOfMatches;
/*     */   }
/*     */   
/*     */   public void setNumOfMatches(int numOfMatches) {
/*  67 */     this.numOfMatches = numOfMatches;
/*     */   }
/*     */   
/*     */   public int getTotalMatches() {
/*  71 */     return this.totalMatches;
/*     */   }
/*     */   
/*     */   public void setTotalMatches(int totalMatches) {
/*  75 */     this.totalMatches = totalMatches;
/*     */   }
/*     */   
/*     */   public List<Match> getMatchList() {
/*  79 */     return this.matchList;
/*     */   }
/*     */   
/*     */   public void setMatchList(List<Match> matchList) {
/*  83 */     this.matchList = matchList;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class Match
/*     */   {
/*     */     @JsonProperty("FPID")
/*     */     private String FPID;
/*     */     
/*     */     @JsonProperty("faceURL")
/*     */     private String faceURL;
/*     */     
/*     */     @JsonProperty("modelData")
/*     */     private String modelData;
/*     */     
/*     */     public String getFPID() {
/*  99 */       return this.FPID;
/*     */     }
/*     */     
/*     */     public void setFPID(String FPID) {
/* 103 */       this.FPID = FPID;
/*     */     }
/*     */     
/*     */     public String getFaceURL() {
/* 107 */       return this.faceURL;
/*     */     }
/*     */     
/*     */     public void setFaceURL(String faceURL) {
/* 111 */       this.faceURL = faceURL;
/*     */     }
/*     */     
/*     */     public String getModelData() {
/* 115 */       return this.modelData;
/*     */     }
/*     */     
/*     */     public void setModelData(String modelData) {
/* 119 */       this.modelData = modelData;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\SearchPhotoResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */