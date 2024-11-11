 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PersonAreaUpdatedPendency
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("personId")
   private Long personId = null;
   
   @SerializedName("cardNumber")
   private Long cardNumber = null;
   
   @SerializedName("areaControl")
   private Long areaControl = null;
   
   public PersonAreaUpdatedPendency pendencyId(Long pendencyId) {
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
   
   public PersonAreaUpdatedPendency managerDeviceId(Long managerDeviceId) {
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
   
   public PersonAreaUpdatedPendency personId(Long personId) {
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
   
   public PersonAreaUpdatedPendency cardNumber(Long cardNumber) {
     this.cardNumber = cardNumber;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Número do cartão")
   public Long getCardNumber() {
     return this.cardNumber;
   }
   
   public void setCardNumber(Long cardNumber) {
     this.cardNumber = cardNumber;
   }
   
   public PersonAreaUpdatedPendency areaControl(Long areaControl) {
     this.areaControl = areaControl;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador da área controlada")
   public Long getAreaControl() {
     return this.areaControl;
   }
   
   public void setAreaControl(Long areaControl) {
     this.areaControl = areaControl;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PersonAreaUpdatedPendency personAreaUpdatedPendency = (PersonAreaUpdatedPendency)o;
     return (Objects.equals(this.pendencyId, personAreaUpdatedPendency.pendencyId) && 
       Objects.equals(this.managerDeviceId, personAreaUpdatedPendency.managerDeviceId) && 
       Objects.equals(this.personId, personAreaUpdatedPendency.personId) && 
       Objects.equals(this.cardNumber, personAreaUpdatedPendency.cardNumber) && 
       Objects.equals(this.areaControl, personAreaUpdatedPendency.areaControl));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.personId, this.cardNumber, this.areaControl });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonAreaUpdatedPendency {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    areaControl: ").append(toIndentedString(this.areaControl)).append("\n");
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
 * PersonAreaUpdatedPendency
 */

public class PersonAreaUpdatedPendency {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("cardNumber")
  private Long cardNumber = null;

  @SerializedName("areaControl")
  private Long areaControl = null;

  public PersonAreaUpdatedPendency pendencyId(Long pendencyId) {
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

  public PersonAreaUpdatedPendency managerDeviceId(Long managerDeviceId) {
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

  public PersonAreaUpdatedPendency personId(Long personId) {
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

  public PersonAreaUpdatedPendency cardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Número do cartão
   * @return cardNumber
  **/
  @Schema(description  = "Número do cartão")
  public Long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
  }

  public PersonAreaUpdatedPendency areaControl(Long areaControl) {
    this.areaControl = areaControl;
    return this;
  }

   /**
   * Identificador da área controlada
   * @return areaControl
  **/
  @Schema(description  = "Identificador da área controlada")
  public Long getAreaControl() {
    return areaControl;
  }

  public void setAreaControl(Long areaControl) {
    this.areaControl = areaControl;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\PersonAreaUpdatedPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */