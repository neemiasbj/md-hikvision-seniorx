 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 import java.util.Arrays;
 import java.util.List;
 
 
 public class IncludeUserFingerPrint
 {
   @JsonProperty("FingerPrintCfg")
   private FingerPrintCfg fingerPrintCfg;
   
   public FingerPrintCfg getFingerPrintCfg() {
     return this.fingerPrintCfg;
   }
   
   public void setFingerPrintCfg(FingerPrintCfg fingerPrintCfg) {
     this.fingerPrintCfg = fingerPrintCfg;
   }
 
   
   public static class FingerPrintCfg
   {
     @JsonProperty("employeeNo")
     private String employeeNo;
     @JsonProperty("enableCardReader")
     private List<Integer> enableCardReader = Arrays.asList(new Integer[] { Integer.valueOf(1) });
     
     @JsonProperty("fingerPrintID")
     private int fingerPrintID = 1;
     
     @JsonProperty("fingerType")
     private String fingerType = "normalFP";
 
     
     @JsonProperty("fingerData")
     private String fingerData;
 
     
     public String getEmployeeNo() {
       return this.employeeNo;
     }
     
     public void setEmployeeNo(String employeeNo) {
       this.employeeNo = employeeNo;
     }
     
     public List<Integer> getEnableCardReader() {
       return this.enableCardReader;
     }
     
     public void setEnableCardReader(List<Integer> enableCardReader) {
       this.enableCardReader = enableCardReader;
     }
     
     public int getFingerPrintID() {
       return this.fingerPrintID;
     }
     
     public void setFingerPrintID(int fingerPrintID) {
       this.fingerPrintID = fingerPrintID;
     }
     
     public String getFingerType() {
       return this.fingerType;
     }
     
     public void setFingerType(String fingerType) {
       this.fingerType = fingerType;
     }
     
     public String getFingerData() {
       return this.fingerData;
     }
     
     public void setFingerData(String fingerData) {
       this.fingerData = fingerData;
     }
   }
 }


