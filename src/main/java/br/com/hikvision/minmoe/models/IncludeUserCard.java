/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ public class IncludeUserCard
/*    */ {
/*    */   @JsonProperty("CardInfo")
/*    */   private CardInfo cardInfo;
/*    */   
/*    */   public CardInfo getCardInfo() {
/* 11 */     return this.cardInfo;
/*    */   }
/*    */   
/*    */   public void setCardInfo(CardInfo cardInfo) {
/* 15 */     this.cardInfo = cardInfo;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class CardInfo
/*    */   {
/*    */     @JsonProperty("employeeNo")
/*    */     private String employeeNo;
/*    */     
/*    */     @JsonProperty("cardNo")
/*    */     private String cardNo;
/*    */     @JsonProperty("cardType")
/* 27 */     private String cardType = "normalCard";
/*    */     
/*    */     public String getEmployeeNo() {
/* 30 */       return this.employeeNo;
/*    */     }
/*    */     
/*    */     public void setEmployeeNo(String employeeNo) {
/* 34 */       this.employeeNo = employeeNo;
/*    */     }
/*    */     
/*    */     public String getCardNo() {
/* 38 */       return this.cardNo;
/*    */     }
/*    */     
/*    */     public void setCardNo(String cardNo) {
/* 42 */       this.cardNo = cardNo;
/*    */     }
/*    */     
/*    */     public String getCardType() {
/* 46 */       return this.cardType;
/*    */     }
/*    */     
/*    */     public void setCardType(String cardType) {
/* 50 */       this.cardType = cardType;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\IncludeUserCard.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */