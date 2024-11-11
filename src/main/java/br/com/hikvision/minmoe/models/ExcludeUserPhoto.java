/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class ExcludeUserPhoto
/*    */ {
/*    */   private List<Fpid> FPID;
/*    */   
/*    */   public List<Fpid> getFPID() {
/* 10 */     return this.FPID;
/*    */   }
/*    */   
/*    */   public void setFPID(List<Fpid> FPID) {
/* 14 */     this.FPID = FPID;
/*    */   }
/*    */   
/*    */   public static class Fpid {
/*    */     private String value;
/*    */     
/*    */     public String getValue() {
/* 21 */       return this.value;
/*    */     }
/*    */     
/*    */     public void setValue(String value) {
/* 25 */       this.value = value;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\ExcludeUserPhoto.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
