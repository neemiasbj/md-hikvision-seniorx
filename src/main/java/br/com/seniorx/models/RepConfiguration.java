 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 @Schema(description = "Propriedades do REP")
 public class RepConfiguration
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("companyName")
   private String companyName = null;
   
   @SerializedName("cnpj")
   private String cnpj = null;
   
   @SerializedName("cpf")
   private String cpf = null;
   
   @SerializedName("cei")
   private String cei = null;
   
   @SerializedName("address")
   private String address = null;
   
   @SerializedName("taxNumber")
   private String taxNumber = null;
   
   public RepConfiguration id(Long id) {
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
   
   public RepConfiguration companyName(String companyName) {
     this.companyName = companyName;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nome da empresa")
   public String getCompanyName() {
     return this.companyName;
   }
   
   public void setCompanyName(String companyName) {
     this.companyName = companyName;
   }
   
   public RepConfiguration cnpj(String cnpj) {
     this.cnpj = cnpj;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getCnpj() {
     return this.cnpj;
   }
   
   public void setCnpj(String cnpj) {
     this.cnpj = cnpj;
   }
   
   public RepConfiguration cpf(String cpf) {
     this.cpf = cpf;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getCpf() {
     return this.cpf;
   }
   
   public void setCpf(String cpf) {
     this.cpf = cpf;
   }
   
   public RepConfiguration cei(String cei) {
     this.cei = cei;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getCei() {
     return this.cei;
   }
   
   public void setCei(String cei) {
     this.cei = cei;
   }
   
   public RepConfiguration address(String address) {
     this.address = address;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Endereço")
   public String getAddress() {
     return this.address;
   }
   
   public void setAddress(String address) {
     this.address = address;
   }
   
   public RepConfiguration taxNumber(String taxNumber) {
     this.taxNumber = taxNumber;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public String getTaxNumber() {
     return this.taxNumber;
   }
   
   public void setTaxNumber(String taxNumber) {
     this.taxNumber = taxNumber;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     RepConfiguration repConfiguration = (RepConfiguration)o;
     return (Objects.equals(this.id, repConfiguration.id) && 
       Objects.equals(this.companyName, repConfiguration.companyName) && 
       Objects.equals(this.cnpj, repConfiguration.cnpj) && 
       Objects.equals(this.cpf, repConfiguration.cpf) && 
       Objects.equals(this.cei, repConfiguration.cei) && 
       Objects.equals(this.address, repConfiguration.address) && 
       Objects.equals(this.taxNumber, repConfiguration.taxNumber));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.companyName, this.cnpj, this.cpf, this.cei, this.address, this.taxNumber });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class RepConfiguration {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    companyName: ").append(toIndentedString(this.companyName)).append("\n");
     sb.append("    cnpj: ").append(toIndentedString(this.cnpj)).append("\n");
     sb.append("    cpf: ").append(toIndentedString(this.cpf)).append("\n");
     sb.append("    cei: ").append(toIndentedString(this.cei)).append("\n");
     sb.append("    address: ").append(toIndentedString(this.address)).append("\n");
     sb.append("    taxNumber: ").append(toIndentedString(this.taxNumber)).append("\n");
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


