/*    */ package br.com.hikvision.minmoe.enums;
/*    */ 
/*    */ public enum MinMoeVersion
/*    */ {
/*  5 */   DS_K1T341("DS-K1T341"), DS_K1T342("DS-K1T342"), DS_K1T671("DS-K1T671"), DS_K1T673("DS-K1T673");
/*    */   
/*    */   private final String version;
/*    */   
/*    */   MinMoeVersion(String version) {
/* 10 */     this.version = version;
/*    */   }
/*    */   
/*    */   public String getVersion() {
/* 14 */     return this.version;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\enums\MinMoeVersion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */