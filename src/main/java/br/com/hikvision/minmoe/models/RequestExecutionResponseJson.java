 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 import com.fasterxml.jackson.annotation.JsonProperty;
 
 
 
 
 
 
 
 @JsonIgnoreProperties(ignoreUnknown = true)
 public class RequestExecutionResponseJson
 {
   @JsonProperty("statusCode")
   private int statusCode;
   @JsonProperty("statusString")
   private String statusString;
   @JsonProperty("subStatusCode")
   private String subStatusCode;
   @JsonProperty("errorCode")
   private long errorCode;
   @JsonProperty("errorMsg")
   private String errorMsg;
   
   public int getStatusCode() {
     return this.statusCode;
   }
   
   public void setStatusCode(int statusCode) {
     this.statusCode = statusCode;
   }
   
   public String getStatusString() {
     return this.statusString;
   }
   
   public void setStatusString(String statusString) {
     this.statusString = statusString;
   }
   
   public String getSubStatusCode() {
     return this.subStatusCode;
   }
   
   public void setSubStatusCode(String subStatusCode) {
     this.subStatusCode = subStatusCode;
   }
   
   public long getErrorCode() {
     return this.errorCode;
   }
   
   public void setErrorCode(long errorCode) {
     this.errorCode = errorCode;
   }
   
   public String getErrorMsg() {
     return this.errorMsg;
   }
   
   public void setErrorMsg(String errorMsg) {
     this.errorMsg = errorMsg;
   }
 }


