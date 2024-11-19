 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 
 public class AcsCfgRequest
 {
   @JsonProperty("AcsCfg")
   private AcsCfg acsCfg;
   
   public AcsCfg getAcsCfg() {
     return this.acsCfg;
   }
   
   public void setAcsCfg(AcsCfg acsCfg) {
     this.acsCfg = acsCfg;
   }
 
   
   public static class AcsCfg
   {
     @JsonProperty("remoteCheckDoorEnabled")
     private boolean remoteCheckDoorEnabled;
     @JsonProperty("checkChannelType")
     private String checkChannelType;
     
     public boolean isRemoteCheckDoorEnabled() {
       return this.remoteCheckDoorEnabled;
     }
     
     public void setRemoteCheckDoorEnabled(boolean remoteCheckDoorEnabled) {
       this.remoteCheckDoorEnabled = remoteCheckDoorEnabled;
     }
     
     public String getCheckChannelType() {
       return this.checkChannelType;
     }
     
     public void setCheckChannelType(String checkChannelType) {
       this.checkChannelType = checkChannelType;
     }
   }
 }


