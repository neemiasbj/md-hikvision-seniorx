 package br.com.seniorx.models;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class Driver
 {
   @SerializedName("id")
   private Long id = null;
   
   @SerializedName("name")
   private String name = null;
   
   @SerializedName("requestIntervalTime")
   private Integer requestIntervalTime = null;
   
   @SerializedName("waitInterval")
   private Integer waitInterval = null;
   
   @SerializedName("sendCardholders")
   private Boolean sendCardholders = Boolean.valueOf(false);
   
   @SerializedName("packetSize")
   private Integer packetSize = null;
   
   @SerializedName("extensibleConfiguration")
   private ExtensibleConfiguration extensibleConfiguration = null;
   
   public Driver id(Long id) {
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
   
   public Driver name(String name) {
     this.name = name;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Descrição")
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = name;
   }
   
   public Driver requestIntervalTime(Integer requestIntervalTime) {
     this.requestIntervalTime = requestIntervalTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Intervalo de tempo entre consultas (milissegundos)")
   public Integer getRequestIntervalTime() {
     return this.requestIntervalTime;
   }
   
   public void setRequestIntervalTime(Integer requestIntervalTime) {
     this.requestIntervalTime = requestIntervalTime;
   }
   
   public Driver waitInterval(Integer waitInterval) {
     this.waitInterval = waitInterval;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Intervalo de espera (milissegundos)")
   public Integer getWaitInterval() {
     return this.waitInterval;
   }
   
   public void setWaitInterval(Integer waitInterval) {
     this.waitInterval = waitInterval;
   }
   
   public Driver sendCardholders(Boolean sendCardholders) {
     this.sendCardholders = sendCardholders;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa se deverá enviar as credenciais para o driver. (Apenas driver Apollo)")
   public Boolean isSendCardholders() {
     return this.sendCardholders;
   }
   
   public void setSendCardholders(Boolean sendCardholders) {
     this.sendCardholders = sendCardholders;
   }
   
   public Driver packetSize(Integer packetSize) {
     this.packetSize = packetSize;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tamanho do pacote")
   public Integer getPacketSize() {
     return this.packetSize;
   }
   
   public void setPacketSize(Integer packetSize) {
     this.packetSize = packetSize;
   }
   
   public Driver extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
     this.extensibleConfiguration = extensibleConfiguration;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public ExtensibleConfiguration getExtensibleConfiguration() {
     return this.extensibleConfiguration;
   }
   
   public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
     this.extensibleConfiguration = extensibleConfiguration;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Driver driver = (Driver)o;
     return (Objects.equals(this.id, driver.id) && 
       Objects.equals(this.name, driver.name) && 
       Objects.equals(this.requestIntervalTime, driver.requestIntervalTime) && 
       Objects.equals(this.waitInterval, driver.waitInterval) && 
       Objects.equals(this.sendCardholders, driver.sendCardholders) && 
       Objects.equals(this.packetSize, driver.packetSize) && 
       Objects.equals(this.extensibleConfiguration, driver.extensibleConfiguration));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.name, this.requestIntervalTime, this.waitInterval, this.sendCardholders, this.packetSize, this.extensibleConfiguration });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Driver {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
     sb.append("    requestIntervalTime: ").append(toIndentedString(this.requestIntervalTime)).append("\n");
     sb.append("    waitInterval: ").append(toIndentedString(this.waitInterval)).append("\n");
     sb.append("    sendCardholders: ").append(toIndentedString(this.sendCardholders)).append("\n");
     sb.append("    packetSize: ").append(toIndentedString(this.packetSize)).append("\n");
     sb.append("    extensibleConfiguration: ").append(toIndentedString(this.extensibleConfiguration)).append("\n");
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\Driver.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */