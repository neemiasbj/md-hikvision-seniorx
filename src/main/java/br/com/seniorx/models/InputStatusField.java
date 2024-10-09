package br.com.seniorx.models;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InputStatusField
 */

public class InputStatusField {
  @SerializedName("inputDeviceId")
  private Long inputDeviceId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DEACTIVATE("DEACTIVATE"),
    
    ACTIVATE("ACTIVATE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("status")
  private StatusEnum status = null;

  public InputStatusField inputDeviceId(Long inputDeviceId) {
    this.inputDeviceId = inputDeviceId;
    return this;
  }

   /**
   * Identificador do dispositivo
   * @return inputDeviceId
  **/
  @Schema(description  = "Identificador do dispositivo")
  public Long getInputDeviceId() {
    return inputDeviceId;
  }

  public void setInputDeviceId(Long inputDeviceId) {
    this.inputDeviceId = inputDeviceId;
  }

  public InputStatusField status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description  = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStatusField inputStatusField = (InputStatusField) o;
    return Objects.equals(this.inputDeviceId, inputStatusField.inputDeviceId) &&
        Objects.equals(this.status, inputStatusField.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputDeviceId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStatusField {\n");
    
    sb.append("    inputDeviceId: ").append(toIndentedString(inputDeviceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

