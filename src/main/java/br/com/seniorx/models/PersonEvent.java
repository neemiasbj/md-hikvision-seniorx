 package br.com.seniorx.models;
 import java.time.OffsetDateTime;
 import java.util.Objects;

 
 import com.google.gson.annotations.SerializedName;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 
 
 
 
 
 public class PersonEvent
 {
   @SerializedName("personId")
   private Long personId = null;
   
   @SerializedName("deviceId")
   private Long deviceId = null;
   
   @SerializedName("date")
   private OffsetDateTime date = null;
   
   @SerializedName("timezoneOffset")
   private Integer timezoneOffset = null;
   
   @SerializedName("normalTemperature")
   private Boolean normalTemperature = Boolean.valueOf(false);
   
   @SerializedName("temperature")
   private Float temperature = null;
   
   @SerializedName("withMask")
   private Boolean withMask = Boolean.valueOf(false);
   
   @SerializedName("accessAllowed")
   private Boolean accessAllowed = Boolean.valueOf(false);
   
   public PersonEvent personId(Long personId) {
     this.personId = personId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador de pessoa")
   public Long getPersonId() {
     return this.personId;
   }
   
   public void setPersonId(Long personId) {
     this.personId = personId;
   }
   
   public PersonEvent deviceId(Long deviceId) {
     this.deviceId = deviceId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador de dispositivos")
   public Long getDeviceId() {
     return this.deviceId;
   }
   
   public void setDeviceId(Long deviceId) {
     this.deviceId = deviceId;
   }
   
   public PersonEvent date(OffsetDateTime date) {
     this.date = date;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Data da notificação em UTC")
   public OffsetDateTime getDate() {
     return this.date;
   }
   
   public void setDate(OffsetDateTime date) {
     this.date = date;
   }
   
   public PersonEvent timezoneOffset(Integer timezoneOffset) {
     this.timezoneOffset = timezoneOffset;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Offset em minutos")
   public Integer getTimezoneOffset() {
     return this.timezoneOffset;
   }
   
   public void setTimezoneOffset(Integer timezoneOffset) {
     this.timezoneOffset = timezoneOffset;
   }
   
   public PersonEvent normalTemperature(Boolean normalTemperature) {
     this.normalTemperature = normalTemperature;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa se a temperatura da pessoa está normal")
   public Boolean isNormalTemperature() {
     return this.normalTemperature;
   }
   
   public void setNormalTemperature(Boolean normalTemperature) {
     this.normalTemperature = normalTemperature;
   }
   
   public PersonEvent temperature(Float temperature) {
     this.temperature = temperature;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa o valor da temperatura")
   public Float getTemperature() {
     return this.temperature;
   }
   
   public void setTemperature(Float temperature) {
     this.temperature = temperature;
   }
   
   public PersonEvent withMask(Boolean withMask) {
     this.withMask = withMask;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa se a pessoa está com máscara")
   public Boolean isWithMask() {
     return this.withMask;
   }
   
   public void setWithMask(Boolean withMask) {
     this.withMask = withMask;
   }
   
   public PersonEvent accessAllowed(Boolean accessAllowed) {
     this.accessAllowed = accessAllowed;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Informa se o acesso foi permitido")
   public Boolean isAccessAllowed() {
     return this.accessAllowed;
   }
   
   public void setAccessAllowed(Boolean accessAllowed) {
     this.accessAllowed = accessAllowed;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     PersonEvent personEvent = (PersonEvent)o;
     return (Objects.equals(this.personId, personEvent.personId) && 
       Objects.equals(this.deviceId, personEvent.deviceId) && 
       Objects.equals(this.date, personEvent.date) && 
       Objects.equals(this.timezoneOffset, personEvent.timezoneOffset) && 
       Objects.equals(this.normalTemperature, personEvent.normalTemperature) && 
       Objects.equals(this.temperature, personEvent.temperature) && 
       Objects.equals(this.withMask, personEvent.withMask) && 
       Objects.equals(this.accessAllowed, personEvent.accessAllowed));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.personId, this.deviceId, this.date, this.timezoneOffset, this.normalTemperature, this.temperature, this.withMask, this.accessAllowed });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class PersonEvent {\n");
     
     sb.append("    personId: ").append(toIndentedString(this.personId)).append("\n");
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
     sb.append("    normalTemperature: ").append(toIndentedString(this.normalTemperature)).append("\n");
     sb.append("    temperature: ").append(toIndentedString(this.temperature)).append("\n");
     sb.append("    withMask: ").append(toIndentedString(this.withMask)).append("\n");
     sb.append("    accessAllowed: ").append(toIndentedString(this.accessAllowed)).append("\n");
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


