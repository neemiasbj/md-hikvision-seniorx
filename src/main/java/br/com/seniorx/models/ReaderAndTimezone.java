package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ReaderAndTimezone
 */

public class ReaderAndTimezone {
  @SerializedName("readerId")
  private Long readerId = null;

  @SerializedName("timezoneId")
  private Long timezoneId = null;

  public ReaderAndTimezone readerId(Long readerId) {
    this.readerId = readerId;
    return this;
  }

   /**
   * Identificador da leitora
   * @return readerId
  **/
  @Schema(description  = "Identificador da leitora")
  public Long getReaderId() {
    return readerId;
  }

  public void setReaderId(Long readerId) {
    this.readerId = readerId;
  }

  public ReaderAndTimezone timezoneId(Long timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

   /**
   * Identificador do fuso horário
   * @return timezoneId
  **/
  @Schema(description  = "Identificador do fuso horário")
  public Long getTimezoneId() {
    return timezoneId;
  }

  public void setTimezoneId(Long timezoneId) {
    this.timezoneId = timezoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderAndTimezone readerAndTimezone = (ReaderAndTimezone) o;
    return Objects.equals(this.readerId, readerAndTimezone.readerId) &&
        Objects.equals(this.timezoneId, readerAndTimezone.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readerId, timezoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderAndTimezone {\n");
    
    sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
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

