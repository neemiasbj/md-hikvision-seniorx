<<<<<<< HEAD
 package br.com.seniorx.models;
 import java.io.IOException;

 
 import com.google.gson.TypeAdapter;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;
 
 public enum OnOffStatusEnum
 {
   ONLINE("ONLINE"),
   
   OFFLINE("OFFLINE");
   
   private String value;
   
   OnOffStatusEnum(String value) {
     this.value = value;
   }
   
   public String getValue() {
     return this.value;
   }
 
   
   public String toString() {
     return String.valueOf(this.value); } public static OnOffStatusEnum fromValue(String text) {
     byte b;
     int i;
     OnOffStatusEnum[] arrayOfOnOffStatusEnum;
     for (i = (arrayOfOnOffStatusEnum = values()).length, b = 0; b < i; ) { OnOffStatusEnum onOffStatusEnum = arrayOfOnOffStatusEnum[b];
       if (String.valueOf(onOffStatusEnum.value).equals(text))
         return onOffStatusEnum; 
       b++; }
     
     return null;
   }
   
   public static class Adapter
     extends TypeAdapter<OnOffStatusEnum> {
     public void write(JsonWriter jsonWriter, OnOffStatusEnum enumeration) throws IOException {
       jsonWriter.value(enumeration.getValue());
     }
 
     
     public OnOffStatusEnum read(JsonReader jsonReader) throws IOException {
       String value = jsonReader.nextString();
       return OnOffStatusEnum.fromValue(String.valueOf(value));
     }
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\OnOffStatusEnum.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.models;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public enum OnOffStatusEnum {
	ONLINE("ONLINE"),

	OFFLINE("OFFLINE");

	private String value;

	OnOffStatusEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OnOffStatusEnum fromValue(String text) {
		for (OnOffStatusEnum b : OnOffStatusEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<OnOffStatusEnum> {
		@Override
		public void write(final JsonWriter jsonWriter, final OnOffStatusEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public OnOffStatusEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return OnOffStatusEnum.fromValue(String.valueOf(value));
		}
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
