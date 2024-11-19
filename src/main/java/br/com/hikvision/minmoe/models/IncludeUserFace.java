 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 
 public class IncludeUserFace
 {
   @JsonProperty("faceLibType")
   private String faceLibType = "blackFD";
   
   @JsonProperty("FDID")
   private String FDID = "1";
   
   @JsonProperty("FPID")
   private String FPID;
 
   
   public IncludeUserFace() {}
   
   public IncludeUserFace(String fpid) {
     this.FPID = fpid;
   }
   
   public String getFaceLibType() {
     return this.faceLibType;
   }
 
 
 
 
 
 
 
 
   
   public void setFdid(String fdid) {
     this.FDID = fdid;
   }
   
   public String getFpid() {
     return this.FPID;
   }
   
   public void setFpid(String fpid) {
     this.FPID = fpid;
   }
 }


