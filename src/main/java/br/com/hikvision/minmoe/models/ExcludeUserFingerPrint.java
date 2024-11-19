 package br.com.hikvision.minmoe.models;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 import java.util.List;
 
 
 
 public class ExcludeUserFingerPrint
 {
   @JsonProperty("FingerPrintDelete")
   private FingerPrintDelete fingerPrintDelete;
   
   public FingerPrintDelete getFingerPrintDelete() {
     return this.fingerPrintDelete;
   }
   
   public void setFingerPrintDelete(FingerPrintDelete fingerPrintDelete) {
     this.fingerPrintDelete = fingerPrintDelete;
   }
 
   
   public static class FingerPrintDelete
   {
     @JsonProperty("mode")
     private String mode;
     
     @JsonProperty("EmployeeNoDetail")
     private ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail;
     
     public String getMode() {
       return this.mode;
     }
     
     public void setMode(String mode) {
       this.mode = mode;
     }
     
     public ExcludeUserFingerPrint.EmployeeNoDetail getEmployeeNoDetail() {
       return this.employeeNoDetail;
     }
     
     public void setEmployeeNoDetail(ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail) {
       this.employeeNoDetail = employeeNoDetail;
     }
   }
 
   
   public static class EmployeeNoDetail
   {
     @JsonProperty("employeeNo")
     private String employeeNo;
     
     @JsonProperty("enableCardReader")
     private List<Integer> enableCardReader;
     
     @JsonProperty("fingerPrintID")
     private List<Integer> fingerPrintID;
     
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
     
     public List<Integer> getFingerPrintID() {
       return this.fingerPrintID;
     }
     
     public void setFingerPrintID(List<Integer> fingerPrintID) {
       this.fingerPrintID = fingerPrintID;
     }
   }
 }


