 package br.com.hikvision.minmoe.models;
 
 import java.time.LocalDateTime;
 
 public class EmployeeCard {
   private String employeeId;
   private String cardId;
   private LocalDateTime dateTime;
   
   public EmployeeCard(String employeeId, String cardId, LocalDateTime dateTime) {
     this.employeeId = employeeId;
     this.cardId = cardId;
     this.dateTime = dateTime;
   }
   
   public String getEmployeeId() {
     return this.employeeId;
   }
   
   public String getCardId() {
     return this.cardId;
   }
   
   public LocalDateTime getDateTime() {
     return this.dateTime;
   }
 
   
   public String toString() {
     return "EmployeeCard{employeeId='" + this.employeeId + '\'' + ", cardId='" + this.cardId + '\'' + ", dateTime=" + 
       this.dateTime + '}';
   }
 }


