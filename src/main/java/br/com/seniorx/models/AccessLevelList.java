 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 public class AccessLevelList
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("readerAndTimezoneList")
   private List<ReaderAndTimezone> readerAndTimezoneList = null;
   
   public AccessLevelList id(Long id) {
     this.id = id;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public Long getId() {
     return this.id;
   }
   
   public void setId(Long id) {
     this.id = id;
   }
   
   public AccessLevelList readerAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
     this.readerAndTimezoneList = readerAndTimezoneList;
     return this;
   }
   
   public AccessLevelList addReaderAndTimezoneListItem(ReaderAndTimezone readerAndTimezoneListItem) {
     if (this.readerAndTimezoneList == null) {
       this.readerAndTimezoneList = new ArrayList<>();
     }
     this.readerAndTimezoneList.add(readerAndTimezoneListItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public List<ReaderAndTimezone> getReaderAndTimezoneList() {
     return this.readerAndTimezoneList;
   }
   
   public void setReaderAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
     this.readerAndTimezoneList = readerAndTimezoneList;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     AccessLevelList accessLevelList = (AccessLevelList)o;
     return (Objects.equals(this.id, accessLevelList.id) && 
       Objects.equals(this.readerAndTimezoneList, accessLevelList.readerAndTimezoneList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.readerAndTimezoneList });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class AccessLevelList {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    readerAndTimezoneList: ").append(toIndentedString(this.readerAndTimezoneList)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 }


