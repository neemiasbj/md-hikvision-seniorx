/*     */ package br.com.hikvision.minmoe.models;
/*     */ 
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IncludeUser
/*     */ {
/*     */   @JsonProperty("UserInfo")
/*     */   private UserInfo userInfo;
/*     */   
/*     */   public UserInfo getUserInfo() {
/*  15 */     return this.userInfo;
/*     */   }
/*     */   
/*     */   public void setUserInfo(UserInfo userInfo) {
/*  19 */     this.userInfo = userInfo;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class UserInfo
/*     */   {
/*     */     @JsonProperty("employeeNo")
/*     */     private String employeeNo;
/*     */     
/*     */     @JsonProperty("name")
/*     */     private String name;
/*     */     
/*     */     @JsonProperty("userType")
/*     */     private String userType;
/*     */     
/*     */     @JsonProperty("Valid")
/*     */     private IncludeUser.Valid valid;
/*     */     
/*     */     @JsonProperty("doorRight")
/*     */     private String doorRight;
/*     */     
/*     */     @JsonProperty("RightPlan")
/*     */     private List<IncludeUser.RightPlan> rightPlan;
/*     */     
/*     */     public String getEmployeeNo() {
/*  44 */       return this.employeeNo;
/*     */     }
/*     */     
/*     */     public void setEmployeeNo(String employeeNo) {
/*  48 */       this.employeeNo = employeeNo;
/*     */     }
/*     */     
/*     */     public String getName() {
/*  52 */       return this.name;
/*     */     }
/*     */     
/*     */     public void setName(String name) {
/*  56 */       this.name = name;
/*     */     }
/*     */     
/*     */     public String getUserType() {
/*  60 */       return this.userType;
/*     */     }
/*     */     
/*     */     public void setUserType(String userType) {
/*  64 */       this.userType = userType;
/*     */     }
/*     */     
/*     */     public IncludeUser.Valid getValid() {
/*  68 */       return this.valid;
/*     */     }
/*     */     
/*     */     public void setValid(IncludeUser.Valid valid) {
/*  72 */       this.valid = valid;
/*     */     }
/*     */     
/*     */     public String getDoorRight() {
/*  76 */       return this.doorRight;
/*     */     }
/*     */     
/*     */     public void setDoorRight(String doorRight) {
/*  80 */       this.doorRight = doorRight;
/*     */     }
/*     */     
/*     */     public List<IncludeUser.RightPlan> getRightPlan() {
/*  84 */       return this.rightPlan;
/*     */     }
/*     */     
/*     */     public void setRightPlan(List<IncludeUser.RightPlan> rightPlan) {
/*  88 */       this.rightPlan = rightPlan;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class Valid
/*     */   {
/*     */     @JsonProperty("enable")
/*     */     private boolean enable;
/*     */     
/*     */     @JsonProperty("beginTime")
/*     */     private String beginTime;
/*     */     
/*     */     @JsonProperty("endTime")
/*     */     private String endTime;
/*     */     
/*     */     public boolean isEnable() {
/* 105 */       return this.enable;
/*     */     }
/*     */     
/*     */     public void setEnable(boolean enable) {
/* 109 */       this.enable = enable;
/*     */     }
/*     */     
/*     */     public String getBeginTime() {
/* 113 */       return this.beginTime;
/*     */     }
/*     */     
/*     */     public void setBeginTime(String beginTime) {
/* 117 */       this.beginTime = beginTime;
/*     */     }
/*     */     
/*     */     public String getEndTime() {
/* 121 */       return this.endTime;
/*     */     }
/*     */     
/*     */     public void setEndTime(String endTime) {
/* 125 */       this.endTime = endTime;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class RightPlan
/*     */   {
/*     */     @JsonProperty("doorNo")
/*     */     private int doorNo;
/*     */     
/*     */     @JsonProperty("planTemplateNo")
/*     */     private String planTemplateNo;
/*     */     
/*     */     public int getDoorNo() {
/* 139 */       return this.doorNo;
/*     */     }
/*     */     
/*     */     public void setDoorNo(int doorNo) {
/* 143 */       this.doorNo = doorNo;
/*     */     }
/*     */     
/*     */     public String getPlanTemplateNo() {
/* 147 */       return this.planTemplateNo;
/*     */     }
/*     */     
/*     */     public void setPlanTemplateNo(String planTemplateNo) {
/* 151 */       this.planTemplateNo = planTemplateNo;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\IncludeUser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
