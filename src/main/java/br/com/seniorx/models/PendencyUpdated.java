
package br.com.seniorx.models;

 import java.io.IOException;
 import java.util.Objects;


 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;


 public class PendencyUpdated {
	 @SerializedName("pendencyId")
	 private Long pendencyId;
	 @SerializedName("errorCode")
	 private Integer errorCode;
	 @SerializedName("operation")
	 private OperationEnum operation;

	
	 public PendencyUpdated() {
		this.pendencyId = null;
		
		
		 this.errorCode = null;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 this.operation = null;
	}

	
	
	 public PendencyUpdated pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		 return this;
	}

	
	
	
	
	
	
	 @Schema(description = "Identificador da pendência")
	 public Long getPendencyId() {
		 return this.pendencyId;
		 }

	 @JsonAdapter(OperationEnum.Adapter.class)
	public enum OperationEnum {
		 REMOVE_PENDENCY("REMOVE_PENDENCY"), KEEP_PENDENCY("KEEP_PENDENCY");

		private String value;

		OperationEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}

		public String toString() {
			return String.valueOf(this.value);
		}

		public static OperationEnum fromValue(String text) {
			byte b;
			int i;
			OperationEnum[] arrayOfOperationEnum;
			for (i = (arrayOfOperationEnum = values()).length, b = 0; b < i;) {
				OperationEnum operationEnum = arrayOfOperationEnum[b];
				if (String.valueOf(operationEnum.value).equals(text))
					return operationEnum;
				b++;
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<OperationEnum> {
			 public void write(JsonWriter jsonWriter, PendencyUpdated.OperationEnum enumeration)
					throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			public PendencyUpdated.OperationEnum read(JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return PendencyUpdated.OperationEnum.fromValue(String.valueOf(value));
			}
		}
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	
	
	 public PendencyUpdated errorCode(Integer errorCode) {
		 this.errorCode = errorCode;
		 return this;
		 }

	
	
	
	
	
	 @Schema(description = "Código de erro")
	 public Integer getErrorCode() {
		 return this.errorCode;
		 }

	
	 public void setErrorCode(Integer errorCode) {
		 this.errorCode = errorCode;
		 }

	
	 public PendencyUpdated operation(OperationEnum operation) {
		 this.operation = operation;
		 return this;
		 }

	
	
	
	
	
	 @Schema(description = "")
	 public OperationEnum getOperation() {
		 return this.operation;
		 }

	
	 public void setOperation(OperationEnum keepPendency) {
		 this.operation = keepPendency;
		 }

	
	
	
	 public boolean equals(Object o) {
		 if (this == o) {
			 return true;
			 }
		 if (o == null || getClass() != o.getClass()) {
			 return false;
			 }
		 PendencyUpdated pendencyUpdated = (PendencyUpdated) o;
		 return (Objects.equals(this.pendencyId, pendencyUpdated.pendencyId) &&
		 Objects.equals(this.errorCode, pendencyUpdated.errorCode) &&
		 Objects.equals(this.operation, pendencyUpdated.operation));
		 }

	
	
	 public int hashCode() {
		 return Objects.hash(new Object[] { this.pendencyId, this.errorCode, this.operation });
		 }

	
	
	
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("class PendencyUpdated {\n");
		
		 sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
		 sb.append("    errorCode: ").append(toIndentedString(this.errorCode)).append("\n");
		 sb.append("    operation: ").append(toIndentedString(this.operation)).append("\n");
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

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\
 * models\PendencyUpdated.class Java compiler version: 17 (61.0) JD-Core
 * Version: 1.1.3
 */