 package br.com.hikvision.minmoe.models;
 
 public class SearchPhoto
 {
   private int searchResultPosition;
   private int maxResults;
   private String faceLibType = "blackFD";
   private String FDID = "1";
   private String FPID;
   
   public int getSearchResultPosition() {
     return this.searchResultPosition;
   }
   
   public void setSearchResultPosition(int searchResultPosition) {
     this.searchResultPosition = searchResultPosition;
   }
   
   public int getMaxResults() {
     return this.maxResults;
   }
   
   public void setMaxResults(int maxResults) {
     this.maxResults = maxResults;
   }
   
   public String getFaceLibType() {
     return this.faceLibType;
   }
 
 
 
 
   
   public String getFDID() {
     return this.FDID;
   }
 
 
 
 
   
   public String getFPID() {
     return this.FPID;
   }
   
   public void setFPID(String FPID) {
     this.FPID = FPID;
   }
 }


