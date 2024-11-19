 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 import java.util.List;
 
 
 
 
 public class IncludeUser
 {
   @JsonProperty("UserInfo")
   private UserInfo userInfo;
   
   public UserInfo getUserInfo() {
     return this.userInfo;
   }
   
   public void setUserInfo(UserInfo userInfo) {
     this.userInfo = userInfo;
   }
 
   
   public static class UserInfo
   {
     @JsonProperty("employeeNo")
     private String employeeNo;
     
     @JsonProperty("name")
     private String name;
     
     @JsonProperty("userType")
     private String userType;
     
     @JsonProperty("Valid")
     private IncludeUser.Valid valid;
     
     @JsonProperty("doorRight")
     private String doorRight;
     
     @JsonProperty("RightPlan")
     private List<IncludeUser.RightPlan> rightPlan;
     
     public String getEmployeeNo() {
       return this.employeeNo;
     }
     
     public void setEmployeeNo(String employeeNo) {
       this.employeeNo = employeeNo;
     }
     
     public String getName() {
       return this.name;
     }
     
     public void setName(String name) {
       this.name = name;
     }
     
     public String getUserType() {
       return this.userType;
     }
     
     public void setUserType(String userType) {
       this.userType = userType;
     }
     
     public IncludeUser.Valid getValid() {
       return this.valid;
     }
     
     public void setValid(IncludeUser.Valid valid) {
       this.valid = valid;
     }
     
     public String getDoorRight() {
       return this.doorRight;
     }
     
     public void setDoorRight(String doorRight) {
       this.doorRight = doorRight;
     }
     
     public List<IncludeUser.RightPlan> getRightPlan() {
       return this.rightPlan;
     }
     
     public void setRightPlan(List<IncludeUser.RightPlan> rightPlan) {
       this.rightPlan = rightPlan;
     }
   }
 
   
   public static class Valid
   {
     @JsonProperty("enable")
     private boolean enable;
     
     @JsonProperty("beginTime")
     private String beginTime;
     
     @JsonProperty("endTime")
     private String endTime;
     
     public boolean isEnable() {
       return this.enable;
     }
     
     public void setEnable(boolean enable) {
       this.enable = enable;
     }
     
     public String getBeginTime() {
       return this.beginTime;
     }
     
     public void setBeginTime(String beginTime) {
       this.beginTime = beginTime;
     }
     
     public String getEndTime() {
       return this.endTime;
     }
     
     public void setEndTime(String endTime) {
       this.endTime = endTime;
     }
   }
 
   
   public static class RightPlan
   {
     @JsonProperty("doorNo")
     private int doorNo;
     
     @JsonProperty("planTemplateNo")
     private String planTemplateNo;
     
     public int getDoorNo() {
       return this.doorNo;
     }
     
     public void setDoorNo(int doorNo) {
       this.doorNo = doorNo;
     }
     
     public String getPlanTemplateNo() {
       return this.planTemplateNo;
     }
     
     public void setPlanTemplateNo(String planTemplateNo) {
       this.planTemplateNo = planTemplateNo;
     }
   }
 }


