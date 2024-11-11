 package br.com.seniorx.models;
 import java.io.IOException;
 import java.time.OffsetDateTime;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 public class Resource { @SerializedName("deviceId") private Long deviceId; @SerializedName("date") private OffsetDateTime date; @SerializedName("timezoneOffset") private Integer timezoneOffset; @SerializedName("status") private StatusEnum status; @SerializedName("resourceType") private ResourceTypeEnum resourceType; @SerializedName("resourcePercent") private Integer resourcePercent; @JsonAdapter(StatusEnum.Adapter.class)
   public enum StatusEnum { ONLINE("ONLINE"),
     OFFLINE("OFFLINE"); private String value; StatusEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static StatusEnum fromValue(String text) { byte b;
       int i;
       StatusEnum[] arrayOfStatusEnum;
       for (i = (arrayOfStatusEnum = values()).length, b = 0; b < i; ) {
         StatusEnum statusEnum = arrayOfStatusEnum[b];
         if (String.valueOf(statusEnum.value).equals(text))
           return statusEnum; 
         b++;
       } 
       return null; } public static class Adapter extends TypeAdapter<StatusEnum> { public void write(JsonWriter jsonWriter, Resource.StatusEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public Resource.StatusEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
         return Resource.StatusEnum.fromValue(String.valueOf(value)); } } } public Resource() { this.deviceId = null;
 
     
     this.date = null;
 
     
     this.timezoneOffset = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.status = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.resourceType = null;
 
     
     this.resourcePercent = null; }
   
   public Resource deviceId(Long deviceId) {
     this.deviceId = deviceId;
     return this; } @JsonAdapter(ResourceTypeEnum.Adapter.class) public enum ResourceTypeEnum {
     MEMORY("MEMORY"), BATTERY("BATTERY"), PAPER("PAPER"); private String value; ResourceTypeEnum(String value) { this.value = value; }
     public String getValue() { return this.value; }
     public String toString() { return String.valueOf(this.value); }
     public static ResourceTypeEnum fromValue(String text) { byte b; int i; ResourceTypeEnum[] arrayOfResourceTypeEnum; for (i = (arrayOfResourceTypeEnum = values()).length, b = 0; b < i; ) { ResourceTypeEnum resourceTypeEnum = arrayOfResourceTypeEnum[b]; if (String.valueOf(resourceTypeEnum.value).equals(text))
           return resourceTypeEnum;  b++; }  return null; }
     public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
       public void write(JsonWriter jsonWriter, Resource.ResourceTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public Resource.ResourceTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return Resource.ResourceTypeEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Identificador do dispositivo") public Long getDeviceId() { return this.deviceId; }
 
   
   public void setDeviceId(Long deviceId) {
     this.deviceId = deviceId;
   }
   
   public Resource date(OffsetDateTime date) {
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
   
   public Resource timezoneOffset(Integer timezoneOffset) {
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
   
   public Resource status(StatusEnum status) {
     this.status = status;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public StatusEnum getStatus() {
     return this.status;
   }
   
   public void setStatus(StatusEnum status) {
     this.status = status;
   }
   
   public Resource resourceType(ResourceTypeEnum resourceType) {
     this.resourceType = resourceType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tipo de recurso")
   public ResourceTypeEnum getResourceType() {
     return this.resourceType;
   }
   
   public void setResourceType(ResourceTypeEnum resourceType) {
     this.resourceType = resourceType;
   }
   
   public Resource resourcePercent(Integer resourcePercent) {
     this.resourcePercent = resourcePercent;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Percentual de uso do recurso")
   public Integer getResourcePercent() {
     return this.resourcePercent;
   }
   
   public void setResourcePercent(Integer resourcePercent) {
     this.resourcePercent = resourcePercent;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Resource resource = (Resource)o;
     return (Objects.equals(this.deviceId, resource.deviceId) && 
       Objects.equals(this.date, resource.date) && 
       Objects.equals(this.timezoneOffset, resource.timezoneOffset) && 
       Objects.equals(this.status, resource.status) && 
       Objects.equals(this.resourceType, resource.resourceType) && 
       Objects.equals(this.resourcePercent, resource.resourcePercent));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.deviceId, this.date, this.timezoneOffset, this.status, this.resourceType, this.resourcePercent });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class Resource {\n");
     
     sb.append("    deviceId: ").append(toIndentedString(this.deviceId)).append("\n");
     sb.append("    date: ").append(toIndentedString(this.date)).append("\n");
     sb.append("    timezoneOffset: ").append(toIndentedString(this.timezoneOffset)).append("\n");
     sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
     sb.append("    resourceType: ").append(toIndentedString(this.resourceType)).append("\n");
     sb.append("    resourcePercent: ").append(toIndentedString(this.resourcePercent)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }
=======
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Resource
 */

public class Resource {
  @SerializedName("deviceId")
  private Long deviceId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("timezoneOffset")
  private Integer timezoneOffset = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ONLINE("ONLINE"),
    
    OFFLINE("OFFLINE");

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

  /**
   * Tipo de recurso
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    MEMORY("MEMORY"),
    
    BATTERY("BATTERY"),
    
    PAPER("PAPER");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceTypeEnum fromValue(String text) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("resourceType")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("resourcePercent")
  private Integer resourcePercent = null;

  public Resource deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Identificador do dispositivo
   * @return deviceId
  **/
  @Schema(description  = "Identificador do dispositivo")
  public Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  public Resource date(OffsetDateTime date) {
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

  public Resource timezoneOffset(Integer timezoneOffset) {
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

  public Resource status(StatusEnum status) {
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

  public Resource resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Tipo de recurso
   * @return resourceType
  **/
  @Schema(description  = "Tipo de recurso")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public Resource resourcePercent(Integer resourcePercent) {
    this.resourcePercent = resourcePercent;
    return this;
  }

   /**
   * Percentual de uso do recurso
   * @return resourcePercent
  **/
  @Schema(description  = "Percentual de uso do recurso")
  public Integer getResourcePercent() {
    return resourcePercent;
  }

  public void setResourcePercent(Integer resourcePercent) {
    this.resourcePercent = resourcePercent;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\Resource.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */