/*    */ package br.com.hikvision.minmoe.enums;
/*    */ 
/*    */ public enum RemoteCheckCfgUserType {
/*  4 */   NORMAL("normal"), NORMAL_VISITO_UNKNOW("normalOrvisitorOrunknow");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   RemoteCheckCfgUserType(String value) {
/*  9 */     this.value = value;
/*    */   }
/*    */   
/*    */   public String getValue() {
/* 13 */     return this.value; } public static RemoteCheckCfgUserType fromValue(String value) {
/*    */     byte b;
/*    */     int i;
/*    */     RemoteCheckCfgUserType[] arrayOfRemoteCheckCfgUserType;
/* 17 */     for (i = (arrayOfRemoteCheckCfgUserType = values()).length, b = 0; b < i; ) { RemoteCheckCfgUserType mode = arrayOfRemoteCheckCfgUserType[b];
/* 18 */       if (mode.value.equals(value))
/* 19 */         return mode; 
/*    */       b++; }
/*    */     
/* 22 */     throw new IllegalArgumentException("Unexpected value: " + value);
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\enums\RemoteCheckCfgUserType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */