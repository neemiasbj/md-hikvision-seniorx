 package br.com.seniorx.models;
 import java.io.IOException;
import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

<<<<<<< HEAD
 import io.swagger.v3.oas.annotations.media.Schema;
 public class CardList { @SerializedName("cardNumber") private Long cardNumber; @SerializedName("cardTechnology") private CardTechnologyEnum cardTechnology; @SerializedName("reader") private List<Integer> reader; @SerializedName("ownerType") private OwnerTypeEnum ownerType; @SerializedName("ownerId") private Long ownerId; @JsonAdapter(CardTechnologyEnum.Adapter.class) public enum CardTechnologyEnum { BARCODE_CARD("BARCODE_CARD"),
     RFID_CARD("RFID_CARD"),
     SMART_CARD("SMART_CARD"),
     QRCODE("QRCODE"); private String value; CardTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static CardTechnologyEnum fromValue(String text) { byte b;
       int i;
       CardTechnologyEnum[] arrayOfCardTechnologyEnum;
       for (i = (arrayOfCardTechnologyEnum = values()).length, b = 0; b < i; ) {
         CardTechnologyEnum cardTechnologyEnum = arrayOfCardTechnologyEnum[b];
         if (String.valueOf(cardTechnologyEnum.value).equals(text))
           return cardTechnologyEnum; 
         b++;
       } 
       return null; } public static class Adapter extends TypeAdapter<CardTechnologyEnum> { public void write(JsonWriter jsonWriter, CardList.CardTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public CardList.CardTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString();
         return CardList.CardTechnologyEnum.fromValue(String.valueOf(value)); } } } public CardList() { this.cardNumber = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.cardTechnology = null;
 
     
     this.reader = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.ownerType = null;
 
     
     this.ownerId = null; }
   
   public CardList cardNumber(Long cardNumber) {
     this.cardNumber = cardNumber;
     return this; } @JsonAdapter(OwnerTypeEnum.Adapter.class) public enum OwnerTypeEnum {
     PERSON("PERSON"), VEHICLE("VEHICLE"); private String value; OwnerTypeEnum(String value) { this.value = value; }
     public String getValue() { return this.value; }
     public String toString() { return String.valueOf(this.value); }
     public static OwnerTypeEnum fromValue(String text) { byte b; int i; OwnerTypeEnum[] arrayOfOwnerTypeEnum; for (i = (arrayOfOwnerTypeEnum = values()).length, b = 0; b < i; ) { OwnerTypeEnum ownerTypeEnum = arrayOfOwnerTypeEnum[b]; if (String.valueOf(ownerTypeEnum.value).equals(text))
           return ownerTypeEnum;  b++; }  return null; }
     public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
       public void write(JsonWriter jsonWriter, CardList.OwnerTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public CardList.OwnerTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return CardList.OwnerTypeEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Número do cartão") public Long getCardNumber() { return this.cardNumber; }
 
   
   public void setCardNumber(Long cardNumber) {
     this.cardNumber = cardNumber;
   }
   
   public CardList cardTechnology(CardTechnologyEnum cardTechnology) {
     this.cardTechnology = cardTechnology;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public CardTechnologyEnum getCardTechnology() {
     return this.cardTechnology;
   }
   
   public void setCardTechnology(CardTechnologyEnum cardTechnology) {
     this.cardTechnology = cardTechnology;
   }
   
   public CardList reader(List<Integer> reader) {
     this.reader = reader;
     return this;
   }
   
   public CardList addReaderItem(Integer readerItem) {
     if (this.reader == null) {
       this.reader = new ArrayList<>();
     }
     this.reader.add(readerItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Leitoras que o cartão possui acesso")
   public List<Integer> getReader() {
     return this.reader;
   }
   
   public void setReader(List<Integer> reader) {
     this.reader = reader;
   }
   
   public CardList ownerType(OwnerTypeEnum ownerType) {
     this.ownerType = ownerType;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public OwnerTypeEnum getOwnerType() {
     return this.ownerType;
   }
   
   public void setOwnerType(OwnerTypeEnum ownerType) {
     this.ownerType = ownerType;
   }
   
   public CardList ownerId(Long ownerId) {
     this.ownerId = ownerId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do proprietário da credencial (pessoa ou veículo)")
   public Long getOwnerId() {
     return this.ownerId;
   }
   
   public void setOwnerId(Long ownerId) {
     this.ownerId = ownerId;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     CardList cardList = (CardList)o;
     return (Objects.equals(this.cardNumber, cardList.cardNumber) && 
       Objects.equals(this.cardTechnology, cardList.cardTechnology) && 
       Objects.equals(this.reader, cardList.reader) && 
       Objects.equals(this.ownerType, cardList.ownerType) && 
       Objects.equals(this.ownerId, cardList.ownerId));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.cardNumber, this.cardTechnology, this.reader, this.ownerType, this.ownerId });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class CardList {\n");
     
     sb.append("    cardNumber: ").append(toIndentedString(this.cardNumber)).append("\n");
     sb.append("    cardTechnology: ").append(toIndentedString(this.cardTechnology)).append("\n");
     sb.append("    reader: ").append(toIndentedString(this.reader)).append("\n");
     sb.append("    ownerType: ").append(toIndentedString(this.ownerType)).append("\n");
     sb.append("    ownerId: ").append(toIndentedString(this.ownerId)).append("\n");
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
 * CardList
 */

public class CardList {
  @SerializedName("cardNumber")
  private Long cardNumber = null;

  /**
   * Gets or Sets cardTechnology
   */
  @JsonAdapter(CardTechnologyEnum.Adapter.class)
  public enum CardTechnologyEnum {
    BARCODE_CARD("BARCODE_CARD"),
    
    RFID_CARD("RFID_CARD"),
    
    SMART_CARD("SMART_CARD"),
    
    QRCODE("QRCODE");

    private String value;

    CardTechnologyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardTechnologyEnum fromValue(String text) {
      for (CardTechnologyEnum b : CardTechnologyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardTechnologyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardTechnologyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardTechnologyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardTechnologyEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("cardTechnology")
  private CardTechnologyEnum cardTechnology = null;

  @SerializedName("reader")
  private List<Integer> reader = null;

  /**
   * Gets or Sets ownerType
   */
  @JsonAdapter(OwnerTypeEnum.Adapter.class)
  public enum OwnerTypeEnum {
    PERSON("PERSON"),
    
    VEHICLE("VEHICLE");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerTypeEnum fromValue(String text) {
      for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OwnerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("ownerType")
  private OwnerTypeEnum ownerType = null;

  @SerializedName("ownerId")
  private Long ownerId = null;

  public CardList cardNumber(Long cardNumber) {
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

  public CardList cardTechnology(CardTechnologyEnum cardTechnology) {
    this.cardTechnology = cardTechnology;
    return this;
  }

   /**
   * Get cardTechnology
   * @return cardTechnology
  **/
  @Schema(description  = "")
  public CardTechnologyEnum getCardTechnology() {
    return cardTechnology;
  }

  public void setCardTechnology(CardTechnologyEnum cardTechnology) {
    this.cardTechnology = cardTechnology;
  }

  public CardList reader(List<Integer> reader) {
    this.reader = reader;
    return this;
  }

  public CardList addReaderItem(Integer readerItem) {
    if (this.reader == null) {
      this.reader = new ArrayList<Integer>();
    }
    this.reader.add(readerItem);
    return this;
  }

   /**
   * Leitoras que o cartão possui acesso
   * @return reader
  **/
  @Schema(description  = "Leitoras que o cartão possui acesso")
  public List<Integer> getReader() {
    return reader;
  }

  public void setReader(List<Integer> reader) {
    this.reader = reader;
  }

  public CardList ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * Get ownerType
   * @return ownerType
  **/
  @Schema(description  = "")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  public CardList ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Identificador do proprietário da credencial (pessoa ou veículo)
   * @return ownerId
  **/
  @Schema(description  = "Identificador do proprietário da credencial (pessoa ou veículo)")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\CardList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */