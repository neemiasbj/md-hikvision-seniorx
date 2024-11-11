 package br.com.seniorx.models;
 import java.io.IOException;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;
 
 @JsonAdapter(OperationUpdateDeviceEnum.Adapter.class)
 public enum OperationUpdateDeviceEnum
 {
   DEVICE_CREATED("DEVICE_CREATED"),
   
   DEVICE_UPDATED("DEVICE_UPDATED"),
   
   DEVICE_REMOVED("DEVICE_REMOVED"),
   
   DEVICE_CONFIG("DEVICE_CONFIG");
   
   private String value;
   
   OperationUpdateDeviceEnum(String value) {
     this.value = value;
   }
   
   public String getValue() {
     return this.value;
   }
 
   
   public String toString() {
     return String.valueOf(this.value); } public static OperationUpdateDeviceEnum fromValue(String text) {
     byte b;
     int i;
     OperationUpdateDeviceEnum[] arrayOfOperationUpdateDeviceEnum;
     for (i = (arrayOfOperationUpdateDeviceEnum = values()).length, b = 0; b < i; ) { OperationUpdateDeviceEnum operationUpdateDeviceEnum = arrayOfOperationUpdateDeviceEnum[b];
       if (String.valueOf(operationUpdateDeviceEnum.value).equals(text))
         return operationUpdateDeviceEnum; 
       b++; }
     
     return null;
   }
   
   public static class Adapter
     extends TypeAdapter<OperationUpdateDeviceEnum> {
     public void write(JsonWriter jsonWriter, OperationUpdateDeviceEnum enumeration) throws IOException {
       jsonWriter.value(enumeration.getValue());
     }
 
     
     public OperationUpdateDeviceEnum read(JsonReader jsonReader) throws IOException {
       String value = jsonReader.nextString();
       return OperationUpdateDeviceEnum.fromValue(String.valueOf(value));
     }
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\OperationUpdateDeviceEnum.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */