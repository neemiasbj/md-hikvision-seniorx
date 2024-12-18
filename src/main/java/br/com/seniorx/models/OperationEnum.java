<<<<<<< HEAD
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


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\OperationEnum.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(OperationEnum.Adapter.class)
public enum OperationEnum {
	REMOVE_PENDENCY("REMOVE_PENDENCY"),

	KEEP_PENDENCY("KEEP_PENDENCY");

	private String value;

	OperationEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OperationEnum fromValue(String text) {
		for (OperationEnum b : OperationEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<OperationEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public OperationEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return OperationEnum.fromValue(String.valueOf(value));
		}
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
