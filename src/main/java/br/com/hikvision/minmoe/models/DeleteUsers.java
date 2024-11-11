/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DeleteUsers
/*    */ {
/*    */   @JsonProperty("UserInfoDelCond")
/*    */   private UserInfoDelCondDetails userInfoDelCond;
/*    */   
/*    */   public DeleteUsers() {}
/*    */   
/*    */   public DeleteUsers(UserInfoDelCondDetails userInfoDelCond) {
/* 19 */     this.userInfoDelCond = userInfoDelCond;
/*    */   }
/*    */   
/*    */   public UserInfoDelCondDetails getUserInfoDelCond() {
/* 23 */     return this.userInfoDelCond;
/*    */   }
/*    */   
/*    */   public void setUserInfoDelCond(UserInfoDelCondDetails userInfoDelCond) {
/* 27 */     this.userInfoDelCond = userInfoDelCond;
/*    */   }
/*    */   
/*    */   public static class UserInfoDelCondDetails
/*    */   {
/*    */     @JsonProperty("EmployeeNoList")
/*    */     private List<DeleteUsers.EmployeeNo> employeeNoList;
/*    */     
/*    */     public UserInfoDelCondDetails(List<DeleteUsers.EmployeeNo> employeeNoList) {
/* 36 */       this.employeeNoList = employeeNoList;
/*    */     }
/*    */     
/*    */     public UserInfoDelCondDetails() {
/* 40 */       this.employeeNoList = new ArrayList<>();
/*    */     }
/*    */ 
/*    */     
/*    */     public List<DeleteUsers.EmployeeNo> getEmployeeNoList() {
/* 45 */       return this.employeeNoList;
/*    */     }
/*    */     
/*    */     public void setEmployeeNoList(List<DeleteUsers.EmployeeNo> employeeNoList) {
/* 49 */       this.employeeNoList = employeeNoList;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static class EmployeeNo
/*    */   {
/*    */     @JsonProperty("employeeNo")
/*    */     private String employeeNo;
/*    */     
/*    */     public EmployeeNo(String employeeNo) {
/* 60 */       this.employeeNo = employeeNo;
/*    */     }
/*    */     
/*    */     public String getEmployeeNo() {
/* 64 */       return this.employeeNo;
/*    */     }
/*    */     
/*    */     public void setEmployeeNo(String employeeNo) {
/* 68 */       this.employeeNo = employeeNo;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\DeleteUsers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
