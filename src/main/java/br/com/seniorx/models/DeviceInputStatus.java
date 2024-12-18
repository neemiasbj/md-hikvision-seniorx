 package br.com.seniorx.models;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class DeviceInputStatus
 {
   @SerializedName("pendencyId")
   private Long pendencyId = null;
   
   @SerializedName("managerDeviceId")
   private Long managerDeviceId = null;
   
   @SerializedName("status")
   private List<InputStatusField> status = null;
   
   public DeviceInputStatus pendencyId(Long pendencyId) {
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
   
   public DeviceInputStatus managerDeviceId(Long managerDeviceId) {
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
   
   public DeviceInputStatus status(List<InputStatusField> status) {
     this.status = status;
     return this;
   }
   
   public DeviceInputStatus addStatusItem(InputStatusField statusItem) {
     if (this.status == null) {
       this.status = new ArrayList<>();
     }
     this.status.add(statusItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Status da entrada")
   public List<InputStatusField> getStatus() {
     return this.status;
   }
   
   public void setStatus(List<InputStatusField> status) {
     this.status = status;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     DeviceInputStatus deviceInputStatus = (DeviceInputStatus)o;
     return (Objects.equals(this.pendencyId, deviceInputStatus.pendencyId) && 
       Objects.equals(this.managerDeviceId, deviceInputStatus.managerDeviceId) && 
       Objects.equals(this.status, deviceInputStatus.status));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.status });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class DeviceInputStatus {\n");
     
     sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
     sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
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
 * DeviceInputStatus
 */

public class DeviceInputStatus {
  @SerializedName("pendencyId")
  private Long pendencyId = null;

  @SerializedName("managerDeviceId")
  private Long managerDeviceId = null;

  @SerializedName("status")
  private List<InputStatusField> status = null;

  public DeviceInputStatus pendencyId(Long pendencyId) {
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

  public DeviceInputStatus managerDeviceId(Long managerDeviceId) {
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

  public DeviceInputStatus status(List<InputStatusField> status) {
    this.status = status;
    return this;
  }

  public DeviceInputStatus addStatusItem(InputStatusField statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<InputStatusField>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Status da entrada
   * @return status
  **/
  @Schema(description  = "Status da entrada")
  public List<InputStatusField> getStatus() {
    return status;
  }

  public void setStatus(List<InputStatusField> status) {
    this.status = status;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\DeviceInputStatus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */