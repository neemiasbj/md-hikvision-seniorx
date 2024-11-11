/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ public class IncludeUserFace
/*    */ {
/*    */   @JsonProperty("faceLibType")
/*  8 */   private String faceLibType = "blackFD";
/*    */   
/*    */   @JsonProperty("FDID")
/* 11 */   private String FDID = "1";
/*    */   
/*    */   @JsonProperty("FPID")
/*    */   private String FPID;
/*    */ 
/*    */   
/*    */   public IncludeUserFace() {}
/*    */   
/*    */   public IncludeUserFace(String fpid) {
/* 20 */     this.FPID = fpid;
/*    */   }
/*    */   
/*    */   public String getFaceLibType() {
/* 24 */     return this.faceLibType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFdid(String fdid) {
/* 36 */     this.FDID = fdid;
/*    */   }
/*    */   
/*    */   public String getFpid() {
/* 40 */     return this.FPID;
/*    */   }
/*    */   
/*    */   public void setFpid(String fpid) {
/* 44 */     this.FPID = fpid;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\IncludeUserFace.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */