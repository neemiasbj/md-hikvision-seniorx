 package br.com.seniorx.models;
 import java.io.IOException;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;
 
 @JsonAdapter(OperationEnum.Adapter.class)
 public enum OperationEnum
 {
   REMOVE_PENDENCY("REMOVE_PENDENCY"),
   
   KEEP_PENDENCY("KEEP_PENDENCY");
   
   private String value;
   
   OperationEnum(String value) {
     this.value = value;
   }
   
   public String getValue() {
     return this.value;
   }
 
   
   public String toString() {
     return String.valueOf(this.value); } public static OperationEnum fromValue(String text) {
     byte b;
     int i;
     OperationEnum[] arrayOfOperationEnum;
     for (i = (arrayOfOperationEnum = values()).length, b = 0; b < i; ) { OperationEnum operationEnum = arrayOfOperationEnum[b];
       if (String.valueOf(operationEnum.value).equals(text))
         return operationEnum; 
       b++; }
     
     return null;
   }
   
   public static class Adapter
     extends TypeAdapter<OperationEnum> {
     public void write(JsonWriter jsonWriter, OperationEnum enumeration) throws IOException {
       jsonWriter.value(enumeration.getValue());
     }
 
     
     public OperationEnum read(JsonReader jsonReader) throws IOException {
       String value = jsonReader.nextString();
       return OperationEnum.fromValue(String.valueOf(value));
     }
   }
 }


