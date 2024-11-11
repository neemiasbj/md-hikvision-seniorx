 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class ExcludeBiometryPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("personId")
   private Long personId = null;
   
   @SerializedName("cardList")
   private List<CardAndTechnology> cardList = null;
   
   public ExcludeBiometryPendency pendencyId(Long pendencyId) {
     this.pendencyId = pendencyId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da pendência")
   public Long getPendencyId() {
     return this.pendencyId;
   }
   
   public void setPendencyId(Long pendencyId) {
     this.pendencyId = pendencyId;
   }
   
   public ExcludeBiometryPendency managerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo gerenciador")
   public Long getManagerDeviceId() {
     return this.managerDeviceId;
   }
   
   public void setManagerDeviceId(Long managerDeviceId) {
     this.managerDeviceId = managerDeviceId;
   }
   
   public ExcludeBiometryPendency personId(Long personId) {
     this.personId = personId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da pessoa")
   public Long getPersonId() {
     return this.personId;
   }
   
   public void setPersonId(Long personId) {
     this.personId = personId;
   }
   
   public ExcludeBiometryPendency cardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
     return this;
   }
   
   public ExcludeBiometryPendency addCardListItem(CardAndTechnology cardListItem) {
     if (this.cardList == null) {
       this.cardList = new ArrayList<>();
     }
     this.cardList.add(cardListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de cartões")
   public List<CardAndTechnology> getCardList() {
     return this.cardList;
   }
   
   public void setCardList(List<CardAndTechnology> cardList) {
     this.cardList = cardList;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ExcludeBiometryPendency excludeBiometryPendency = (ExcludeBiometryPendency)o;
     return (Objects.equals(this.pendencyId, excludeBiometryPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, excludeBiometryPendency.managerDeviceId) && 
       Objects.equals(this.personId, excludeBiometryPendency.personId) && 
       Objects.equals(this.cardList, excludeBiometryPendency.cardList));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.personId, this.cardList });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ExcludeBiometryPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    cardList: ").append(toIndentedString(this.cardList)).append("\n");
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
=======
import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExcludeBiometryPendency
 */

public class ExcludeBiometryPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("cardList")
  private List<CardAndTechnology> cardList = null;

  public ExcludeBiometryPendency pendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
    return this;
  }

   /**
   * Identificador da pendência
   * @return pendencyId
  **/
  @Schema(description  = "Identificador da pendência")
  public Long getPendencyId() {
    return pendencyId;
  }

  public void setPendencyId(Long pendencyId) {
    this.pendencyId = pendencyId;
  }

  public ExcludeBiometryPendency managerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
    return this;
  }

   /**
   * Identificador do dispositivo gerenciador
   * @return managerDeviceId
  **/
  @Schema(description  = "Identificador do dispositivo gerenciador")
  public Long getManagerDeviceId() {
    return managerDeviceId;
  }

  public void setManagerDeviceId(Long managerDeviceId) {
    this.managerDeviceId = managerDeviceId;
  }

  public ExcludeBiometryPendency personId(Long personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Identificador da pessoa
   * @return personId
  **/
  @Schema(description  = "Identificador da pessoa")
  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public ExcludeBiometryPendency cardList(List<CardAndTechnology> cardList) {
    this.cardList = cardList;
    return this;
  }

  public ExcludeBiometryPendency addCardListItem(CardAndTechnology cardListItem) {
    if (this.cardList == null) {
      this.cardList = new ArrayList<CardAndTechnology>();
    }
    this.cardList.add(cardListItem);
    return this;
  }

   /**
   * Lista de cartões
   * @return cardList
  **/
  @Schema(description  = "Lista de cartões")
  public List<CardAndTechnology> getCardList() {
    return cardList;
  }

  public void setCardList(List<CardAndTechnology> cardList) {
    this.cardList = cardList;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ExcludeBiometryPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */