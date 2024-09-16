package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Propriedades do REP
 */
@ApiModel(description = "Propriedades do REP")

public class RepConfiguration {
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

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RepConfiguration companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Nome da empresa
   * @return companyName
  **/
  @ApiModelProperty(value = "Nome da empresa")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public RepConfiguration cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

   /**
   * Get cnpj
   * @return cnpj
  **/
  @ApiModelProperty(value = "")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public RepConfiguration cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(value = "")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public RepConfiguration cei(String cei) {
    this.cei = cei;
    return this;
  }

   /**
   * Get cei
   * @return cei
  **/
  @ApiModelProperty(value = "")
  public String getCei() {
    return cei;
  }

  public void setCei(String cei) {
    this.cei = cei;
  }

  public RepConfiguration address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @ApiModelProperty(value = "Endereço")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public RepConfiguration taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * Get taxNumber
   * @return taxNumber
  **/
  @ApiModelProperty(value = "")
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepConfiguration repConfiguration = (RepConfiguration) o;
    return Objects.equals(this.id, repConfiguration.id) &&
        Objects.equals(this.companyName, repConfiguration.companyName) &&
        Objects.equals(this.cnpj, repConfiguration.cnpj) &&
        Objects.equals(this.cpf, repConfiguration.cpf) &&
        Objects.equals(this.cei, repConfiguration.cei) &&
        Objects.equals(this.address, repConfiguration.address) &&
        Objects.equals(this.taxNumber, repConfiguration.taxNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyName, cnpj, cpf, cei, address, taxNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cei: ").append(toIndentedString(cei)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

