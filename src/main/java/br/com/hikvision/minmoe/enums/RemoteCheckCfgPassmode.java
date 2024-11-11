/*    */ package br.com.hikvision.minmoe.enums;
/*    */ 
/*    */ public enum RemoteCheckCfgPassmode {
/*  4 */   PASS("pass"), NOT_PASS("notpass");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   RemoteCheckCfgPassmode(String value) {
/*  9 */     this.value = value;
/*    */   }
/*    */   
/*    */   public String getValue() {
/* 13 */     return this.value; } public static RemoteCheckCfgPassmode fromValue(String value) {
/*    */     byte b;
/*    */     int i;
/*    */     RemoteCheckCfgPassmode[] arrayOfRemoteCheckCfgPassmode;
/* 17 */     for (i = (arrayOfRemoteCheckCfgPassmode = values()).length, b = 0; b < i; ) { RemoteCheckCfgPassmode mode = arrayOfRemoteCheckCfgPassmode[b];
/* 18 */       if (mode.value.equals(value))
/* 19 */         return mode; 
/*    */       b++; }
/*    */     
/* 22 */     throw new IllegalArgumentException("Unexpected value: " + value);
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\enums\RemoteCheckCfgPassmode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */