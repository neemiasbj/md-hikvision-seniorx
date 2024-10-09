package br.com.seniorx.models;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PersonEvent
 */

public class PersonEvent {
  @SerializedName("personId")
  private Long personId = null;

  @SerializedName("deviceId")
  private Long deviceId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("timezoneOffset")
  private Integer timezoneOffset = null;

  @SerializedName("normalTemperature")
  private Boolean normalTemperature = false;

  @SerializedName("temperature")
  private Float temperature = null;

  @SerializedName("withMask")
  private Boolean withMask = false;

  @SerializedName("accessAllowed")
  private Boolean accessAllowed = false;

  public PersonEvent personId(Long personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Identificador de pessoa
   * @return personId
  **/
  @Schema(description  = "Identificador de pessoa")
  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public PersonEvent deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Identificador de dispositivos
   * @return deviceId
  **/
  @Schema(description  = "Identificador de dispositivos")
  public Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  public PersonEvent date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Data da notificação em UTC
   * @return date
  **/
  @Schema(description  = "Data da notificação em UTC")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public PersonEvent timezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * Offset em minutos
   * @return timezoneOffset
  **/
  @Schema(description  = "Offset em minutos")
  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public PersonEvent normalTemperature(Boolean normalTemperature) {
    this.normalTemperature = normalTemperature;
    return this;
  }

   /**
   * Informa se a temperatura da pessoa está normal
   * @return normalTemperature
  **/
  @Schema(description  = "Informa se a temperatura da pessoa está normal")
  public Boolean isNormalTemperature() {
    return normalTemperature;
  }

  public void setNormalTemperature(Boolean normalTemperature) {
    this.normalTemperature = normalTemperature;
  }

  public PersonEvent temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * Informa o valor da temperatura
   * @return temperature
  **/
  @Schema(description  = "Informa o valor da temperatura")
  public Float getTemperature() {
    return temperature;
  }

  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  public PersonEvent withMask(Boolean withMask) {
    this.withMask = withMask;
    return this;
  }

   /**
   * Informa se a pessoa está com máscara
   * @return withMask
  **/
  @Schema(description  = "Informa se a pessoa está com máscara")
  public Boolean isWithMask() {
    return withMask;
  }

  public void setWithMask(Boolean withMask) {
    this.withMask = withMask;
  }

  public PersonEvent accessAllowed(Boolean accessAllowed) {
    this.accessAllowed = accessAllowed;
    return this;
  }

   /**
   * Informa se o acesso foi permitido
   * @return accessAllowed
  **/
  @Schema(description  = "Informa se o acesso foi permitido")
  public Boolean isAccessAllowed() {
    return accessAllowed;
  }

  public void setAccessAllowed(Boolean accessAllowed) {
    this.accessAllowed = accessAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonEvent personEvent = (PersonEvent) o;
    return Objects.equals(this.personId, personEvent.personId) &&
        Objects.equals(this.deviceId, personEvent.deviceId) &&
        Objects.equals(this.date, personEvent.date) &&
        Objects.equals(this.timezoneOffset, personEvent.timezoneOffset) &&
        Objects.equals(this.normalTemperature, personEvent.normalTemperature) &&
        Objects.equals(this.temperature, personEvent.temperature) &&
        Objects.equals(this.withMask, personEvent.withMask) &&
        Objects.equals(this.accessAllowed, personEvent.accessAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, deviceId, date, timezoneOffset, normalTemperature, temperature, withMask, accessAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonEvent {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    normalTemperature: ").append(toIndentedString(normalTemperature)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    withMask: ").append(toIndentedString(withMask)).append("\n");
    sb.append("    accessAllowed: ").append(toIndentedString(accessAllowed)).append("\n");
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

