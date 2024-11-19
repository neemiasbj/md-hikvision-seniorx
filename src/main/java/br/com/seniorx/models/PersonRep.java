 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PersonRep
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("name")
   private String name = null;
   
   @SerializedName("pis")
   private Long pis = null;
   
   @SerializedName("cpf")
   private Long cpf = null;
   
   @SerializedName("verifyBiometrics")
   private Integer verifyBiometrics = null;
   
   @SerializedName("cards")
   private List<CardRep> cards = null;
   
   @SerializedName("biometries")
   private List<Biometry> biometries = null;
   
   public PersonRep id(Long id) {
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
   
   public PersonRep name(String name) {
     this.name = name;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nome da pessoa")
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = name;
   }
   
   public PersonRep pis(Long pis) {
     this.pis = pis;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Documento")
   public Long getPis() {
     return this.pis;
   }
   
   public void setPis(Long pis) {
     this.pis = pis;
   }
   
   public PersonRep cpf(Long cpf) {
     this.cpf = cpf;
     return this;
   }
 
 
 
 
   
   @Schema(description = "CPF contendo apenas números, incluindo dígito verificador")
   public Long getCpf() {
     return this.cpf;
   }
   
   public void setCpf(Long cpf) {
     this.cpf = cpf;
   }
   
   public PersonRep verifyBiometrics(Integer verifyBiometrics) {
     this.verifyBiometrics = verifyBiometrics;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tipo da validação para biometria = ['NOT_VALID_BIOMETRY', 'VALID_CARD_AND_BIOMETRY', 'ONLY_VALID_BIOMETRY']")
   public Integer getVerifyBiometrics() {
     return this.verifyBiometrics;
   }
   
   public void setVerifyBiometrics(Integer verifyBiometrics) {
     this.verifyBiometrics = verifyBiometrics;
   }
   
   public PersonRep cards(List<CardRep> cards) {
     this.cards = cards;
     return this;
   }
   
   public PersonRep addCardsItem(CardRep cardsItem) {
     if (this.cards == null) {
       this.cards = new ArrayList<>();
     }
     this.cards.add(cardsItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de cartão")
   public List<CardRep> getCards() {
     return this.cards;
   }
   
   public void setCards(List<CardRep> cards) {
     this.cards = cards;
   }
   
   public PersonRep biometries(List<Biometry> biometries) {
     this.biometries = biometries;
     return this;
   }
   
   public PersonRep addBiometriesItem(Biometry biometriesItem) {
     if (this.biometries == null) {
       this.biometries = new ArrayList<>();
     }
     this.biometries.add(biometriesItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de biometrias")
   public List<Biometry> getBiometries() {
     return this.biometries;
   }
   
   public void setBiometries(List<Biometry> biometries) {
     this.biometries = biometries;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PersonRep personRep = (PersonRep)o;
     return (Objects.equals(this.id, personRep.id) && 
       Objects.equals(this.name, personRep.name) && 
       Objects.equals(this.pis, personRep.pis) && 
       Objects.equals(this.cpf, personRep.cpf) && 
       Objects.equals(this.verifyBiometrics, personRep.verifyBiometrics) && 
       Objects.equals(this.cards, personRep.cards) && 
       Objects.equals(this.biometries, personRep.biometries));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.name, this.pis, this.cpf, this.verifyBiometrics, this.cards, this.biometries });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonRep {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
     sb.append("    pis: ").append(toIndentedString(this.pis)).append("\n");
     sb.append("    cpf: ").append(toIndentedString(this.cpf)).append("\n");
     sb.append("    verifyBiometrics: ").append(toIndentedString(this.verifyBiometrics)).append("\n");
     sb.append("    cards: ").append(toIndentedString(this.cards)).append("\n");
     sb.append("    biometries: ").append(toIndentedString(this.biometries)).append("\n");
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


