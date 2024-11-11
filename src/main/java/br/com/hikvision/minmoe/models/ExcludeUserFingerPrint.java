/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExcludeUserFingerPrint
/*    */ {
/*    */   @JsonProperty("FingerPrintDelete")
/*    */   private FingerPrintDelete fingerPrintDelete;
/*    */   
/*    */   public FingerPrintDelete getFingerPrintDelete() {
/* 14 */     return this.fingerPrintDelete;
/*    */   }
/*    */   
/*    */   public void setFingerPrintDelete(FingerPrintDelete fingerPrintDelete) {
/* 18 */     this.fingerPrintDelete = fingerPrintDelete;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class FingerPrintDelete
/*    */   {
/*    */     @JsonProperty("mode")
/*    */     private String mode;
/*    */     
/*    */     @JsonProperty("EmployeeNoDetail")
/*    */     private ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail;
/*    */     
/*    */     public String getMode() {
/* 31 */       return this.mode;
/*    */     }
/*    */     
/*    */     public void setMode(String mode) {
/* 35 */       this.mode = mode;
/*    */     }
/*    */     
/*    */     public ExcludeUserFingerPrint.EmployeeNoDetail getEmployeeNoDetail() {
/* 39 */       return this.employeeNoDetail;
/*    */     }
/*    */     
/*    */     public void setEmployeeNoDetail(ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail) {
/* 43 */       this.employeeNoDetail = employeeNoDetail;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static class EmployeeNoDetail
/*    */   {
/*    */     @JsonProperty("employeeNo")
/*    */     private String employeeNo;
/*    */     
/*    */     @JsonProperty("enableCardReader")
/*    */     private List<Integer> enableCardReader;
/*    */     
/*    */     @JsonProperty("fingerPrintID")
/*    */     private List<Integer> fingerPrintID;
/*    */     
/*    */     public String getEmployeeNo() {
/* 60 */       return this.employeeNo;
/*    */     }
/*    */     
/*    */     public void setEmployeeNo(String employeeNo) {
/* 64 */       this.employeeNo = employeeNo;
/*    */     }
/*    */     
/*    */     public List<Integer> getEnableCardReader() {
/* 68 */       return this.enableCardReader;
/*    */     }
/*    */     
/*    */     public void setEnableCardReader(List<Integer> enableCardReader) {
/* 72 */       this.enableCardReader = enableCardReader;
/*    */     }
/*    */     
/*    */     public List<Integer> getFingerPrintID() {
/* 76 */       return this.fingerPrintID;
/*    */     }
/*    */     
/*    */     public void setFingerPrintID(List<Integer> fingerPrintID) {
/* 80 */       this.fingerPrintID = fingerPrintID;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\ExcludeUserFingerPrint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
