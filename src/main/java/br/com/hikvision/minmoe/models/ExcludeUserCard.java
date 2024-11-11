/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ import java.util.List;
/*    */ 
/*    */ public class ExcludeUserCard
/*    */ {
/*    */   @JsonProperty("CardInfoDelCond")
/*    */   private CardInfoDelCondData cardInfoDelCondData;
/*    */   
/*    */   public CardInfoDelCondData getCardInfoDelCondData() {
/* 12 */     return this.cardInfoDelCondData;
/*    */   }
/*    */   
/*    */   public void setCardInfoDelCondData(CardInfoDelCondData cardInfoDelCondData) {
/* 16 */     this.cardInfoDelCondData = cardInfoDelCondData;
/*    */   }
/*    */   
/*    */   public static class CardInfoDelCondData
/*    */   {
/*    */     @JsonProperty("CardNoList")
/*    */     private List<ExcludeUserCard.CardNo> cardNoList;
/*    */     
/*    */     public List<ExcludeUserCard.CardNo> getCardNoList() {
/* 25 */       return this.cardNoList;
/*    */     }
/*    */     
/*    */     public void setCardNoList(List<ExcludeUserCard.CardNo> cardNoList) {
/* 29 */       this.cardNoList = cardNoList;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class CardNo
/*    */   {
/*    */     @JsonProperty("cardNo")
/*    */     private String cardNo;
/*    */     
/*    */     public String getCardNo() {
/* 39 */       return this.cardNo;
/*    */     }
/*    */     
/*    */     public void setCardNo(String cardNo) {
/* 43 */       this.cardNo = cardNo;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\ExcludeUserCard.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
