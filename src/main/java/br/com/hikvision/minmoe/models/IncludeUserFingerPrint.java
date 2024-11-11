/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class IncludeUserFingerPrint
/*    */ {
/*    */   @JsonProperty("FingerPrintCfg")
/*    */   private FingerPrintCfg fingerPrintCfg;
/*    */   
/*    */   public FingerPrintCfg getFingerPrintCfg() {
/* 14 */     return this.fingerPrintCfg;
/*    */   }
/*    */   
/*    */   public void setFingerPrintCfg(FingerPrintCfg fingerPrintCfg) {
/* 18 */     this.fingerPrintCfg = fingerPrintCfg;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class FingerPrintCfg
/*    */   {
/*    */     @JsonProperty("employeeNo")
/*    */     private String employeeNo;
/*    */     @JsonProperty("enableCardReader")
/* 27 */     private List<Integer> enableCardReader = Arrays.asList(new Integer[] { Integer.valueOf(1) });
/*    */     
/*    */     @JsonProperty("fingerPrintID")
/* 30 */     private int fingerPrintID = 1;
/*    */     
/*    */     @JsonProperty("fingerType")
/* 33 */     private String fingerType = "normalFP";
/*    */ 
/*    */     
/*    */     @JsonProperty("fingerData")
/*    */     private String fingerData;
/*    */ 
/*    */     
/*    */     public String getEmployeeNo() {
/* 41 */       return this.employeeNo;
/*    */     }
/*    */     
/*    */     public void setEmployeeNo(String employeeNo) {
/* 45 */       this.employeeNo = employeeNo;
/*    */     }
/*    */     
/*    */     public List<Integer> getEnableCardReader() {
/* 49 */       return this.enableCardReader;
/*    */     }
/*    */     
/*    */     public void setEnableCardReader(List<Integer> enableCardReader) {
/* 53 */       this.enableCardReader = enableCardReader;
/*    */     }
/*    */     
/*    */     public int getFingerPrintID() {
/* 57 */       return this.fingerPrintID;
/*    */     }
/*    */     
/*    */     public void setFingerPrintID(int fingerPrintID) {
/* 61 */       this.fingerPrintID = fingerPrintID;
/*    */     }
/*    */     
/*    */     public String getFingerType() {
/* 65 */       return this.fingerType;
/*    */     }
/*    */     
/*    */     public void setFingerType(String fingerType) {
/* 69 */       this.fingerType = fingerType;
/*    */     }
/*    */     
/*    */     public String getFingerData() {
/* 73 */       return this.fingerData;
/*    */     }
/*    */     
/*    */     public void setFingerData(String fingerData) {
/* 77 */       this.fingerData = fingerData;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\IncludeUserFingerPrint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */