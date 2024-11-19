 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 import java.util.ArrayList;
 import java.util.List;
 
 
 
 
 
 public class DeleteUsers
 {
   @JsonProperty("UserInfoDelCond")
   private UserInfoDelCondDetails userInfoDelCond;
   
   public DeleteUsers() {}
   
   public DeleteUsers(UserInfoDelCondDetails userInfoDelCond) {
     this.userInfoDelCond = userInfoDelCond;
   }
   
   public UserInfoDelCondDetails getUserInfoDelCond() {
     return this.userInfoDelCond;
   }
   
   public void setUserInfoDelCond(UserInfoDelCondDetails userInfoDelCond) {
     this.userInfoDelCond = userInfoDelCond;
   }
   
   public static class UserInfoDelCondDetails
   {
     @JsonProperty("EmployeeNoList")
     private List<DeleteUsers.EmployeeNo> employeeNoList;
     
     public UserInfoDelCondDetails(List<DeleteUsers.EmployeeNo> employeeNoList) {
       this.employeeNoList = employeeNoList;
     }
     
     public UserInfoDelCondDetails() {
       this.employeeNoList = new ArrayList<>();
     }
 
     
     public List<DeleteUsers.EmployeeNo> getEmployeeNoList() {
       return this.employeeNoList;
     }
     
     public void setEmployeeNoList(List<DeleteUsers.EmployeeNo> employeeNoList) {
       this.employeeNoList = employeeNoList;
     }
   }
 
   
   public static class EmployeeNo
   {
     @JsonProperty("employeeNo")
     private String employeeNo;
     
     public EmployeeNo(String employeeNo) {
       this.employeeNo = employeeNo;
     }
     
     public String getEmployeeNo() {
       return this.employeeNo;
     }
     
     public void setEmployeeNo(String employeeNo) {
       this.employeeNo = employeeNo;
     }
   }
 }


