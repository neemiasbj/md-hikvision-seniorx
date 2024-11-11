/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import java.time.LocalDateTime;
/*    */ 
/*    */ public class EmployeeCard {
/*    */   private String employeeId;
/*    */   private String cardId;
/*    */   private LocalDateTime dateTime;
/*    */   
/*    */   public EmployeeCard(String employeeId, String cardId, LocalDateTime dateTime) {
/* 11 */     this.employeeId = employeeId;
/* 12 */     this.cardId = cardId;
/* 13 */     this.dateTime = dateTime;
/*    */   }
/*    */   
/*    */   public String getEmployeeId() {
/* 17 */     return this.employeeId;
/*    */   }
/*    */   
/*    */   public String getCardId() {
/* 21 */     return this.cardId;
/*    */   }
/*    */   
/*    */   public LocalDateTime getDateTime() {
/* 25 */     return this.dateTime;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return "EmployeeCard{employeeId='" + this.employeeId + '\'' + ", cardId='" + this.cardId + '\'' + ", dateTime=" + 
/* 31 */       this.dateTime + '}';
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\EmployeeCard.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */