 package br.com.hikvision.minmoe.models;
 
 public class RemoteCheck
 {
   private String statusCode;
   
   public String getStatusCode() {
     return this.statusCode;
   }
   private String statusString; private String subStatusCode;
   public void setStatusCode(String statusCode) {
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
 
   
   public String toString() {
     return "RemoteCheck [statusCode=" + this.statusCode + ", statusString=" + this.statusString + ", subStatusCode=" + this.subStatusCode + "]";
   }
 }


