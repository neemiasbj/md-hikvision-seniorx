 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 @Schema(description = "Propriedade extensíveis")
 public class ExtensibleConfiguration
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("name")
   private String name = null;
   
   @SerializedName("extensiblePropertyList")
   private List<ExtensibleProperty> extensiblePropertyList = null;
   
   public ExtensibleConfiguration id(Long id) {
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
   
   public ExtensibleConfiguration name(String name) {
     this.name = name;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = name;
   }
   
   public ExtensibleConfiguration extensiblePropertyList(List<ExtensibleProperty> extensiblePropertyList) {
     this.extensiblePropertyList = extensiblePropertyList;
     return this;
   }
   
   public ExtensibleConfiguration addExtensiblePropertyListItem(ExtensibleProperty extensiblePropertyListItem) {
     if (this.extensiblePropertyList == null) {
       this.extensiblePropertyList = new ArrayList<>();
     }
     this.extensiblePropertyList.add(extensiblePropertyListItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public List<ExtensibleProperty> getExtensiblePropertyList() {
     return this.extensiblePropertyList;
   }
   
   public void setExtensiblePropertyList(List<ExtensibleProperty> extensiblePropertyList) {
     this.extensiblePropertyList = extensiblePropertyList;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ExtensibleConfiguration extensibleConfiguration = (ExtensibleConfiguration)o;
     return (Objects.equals(this.id, extensibleConfiguration.id) && 
       Objects.equals(this.name, extensibleConfiguration.name) && 
       Objects.equals(this.extensiblePropertyList, extensibleConfiguration.extensiblePropertyList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.name, this.extensiblePropertyList });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ExtensibleConfiguration {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
     sb.append("    extensiblePropertyList: ").append(toIndentedString(this.extensiblePropertyList)).append("\n");
     sb.append("}");
     return sb.toString();
   }
   
   public String findExtensiblePropertyByKey(String key) {
     for (ExtensibleProperty item : this.extensiblePropertyList) {
       if (item.getKey().equals(key)) {
         return item.getValue();
       }
     } 
     return null;
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 }


