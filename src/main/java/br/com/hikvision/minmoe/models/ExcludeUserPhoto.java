 package br.com.hikvision.minmoe.models;
 
 import java.util.List;
 
 public class ExcludeUserPhoto
 {
   private List<Fpid> FPID;
   
   public List<Fpid> getFPID() {
     return this.FPID;
   }
   
   public void setFPID(List<Fpid> FPID) {
     this.FPID = FPID;
   }
   
   public static class Fpid {
     private String value;
     
     public String getValue() {
       return this.value;
     }
     
     public void setValue(String value) {
       this.value = value;
     }
   }
 }


