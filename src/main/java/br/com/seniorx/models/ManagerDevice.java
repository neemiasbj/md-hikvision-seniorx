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

import io.swagger.v3.oas.annotations.media.Schema;

<<<<<<< HEAD
public class ManagerDevice { @SerializedName("id")
   private Long id; @SerializedName("areaId")
   private Long areaId; @SerializedName("networkIdentification")
   private String networkIdentification; @SerializedName("networkPort")
   private Integer networkPort; @SerializedName("deviceType")
   private DeviceTypeEnum deviceType; @SerializedName("displayMessage")
   private String displayMessage; @SerializedName("numberOfCardRecords")
   private Integer numberOfCardRecords; @SerializedName("turnstileBypassTime")
   private Integer turnstileBypassTime; @SerializedName("module")
   private List<ModuleDevice> module; @SerializedName("reader")
   private List<ReaderDevice> reader; @SerializedName("output")
   private List<OutputDevice> output; @SerializedName("intput")
   private List<InputDevice> intput; @SerializedName("accessMessage")
   private List<AccessMessage> accessMessage; @SerializedName("portConfiguration")
   private List<PortConfiguration> portConfiguration; @SerializedName("repConfiguration")
   private RepConfiguration repConfiguration; @SerializedName("extensibleConfiguration")
   private ExtensibleConfiguration extensibleConfiguration;
   @SerializedName("username")
   private String username;
   @SerializedName("password")
   private String password;
   
   public ManagerDevice() { this.id = null;
 
     
     this.areaId = null;
 
     
     this.networkIdentification = null;
 
     
     this.networkPort = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.deviceType = null;
 
     
     this.displayMessage = null;
 
     
     this.numberOfCardRecords = null;
 
     
     this.turnstileBypassTime = null;
 
     
     this.module = null;
 
     
     this.reader = null;
 
     
     this.output = null;
 
     
     this.intput = null;
 
     
     this.accessMessage = null;
 
     
     this.portConfiguration = null;
 
     
     this.repConfiguration = null;
 
     
     this.extensibleConfiguration = null;
 
     
     this.username = null;
 
     
     this.password = null; }
 
   
   public ManagerDevice id(Long id) { this.id = id;
     return this; }
 
 
 
 
 
 
   
   @Schema(description = "Identificador do dispositivo")
   public Long getId() {
     return this.id;
   }
   @JsonAdapter(DeviceTypeEnum.Adapter.class) public enum DeviceTypeEnum {
     AAN_32("AAN_32"), AAN_100("AAN_100"), AIO_168("AIO_168"), AIM_2SL("AIM_2SL"), AIM_4SL("AIM_4SL"), AP_610("AP_610"), AP_620("AP_620"), AP_625("AP_625"), AP_500("AP_500"), AP_510("AP_510"), AP_520("AP_520"), AIM_1SL("AIM_1SL"), AIM_4("AIM_4"), AMS_130("AMS_130"), AMS_102("AMS_102"); private String value; DeviceTypeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static DeviceTypeEnum fromValue(String text) { byte b; int i; DeviceTypeEnum[] arrayOfDeviceTypeEnum; for (i = (arrayOfDeviceTypeEnum = values()).length, b = 0; b < i; ) { DeviceTypeEnum deviceTypeEnum = arrayOfDeviceTypeEnum[b]; if (String.valueOf(deviceTypeEnum.value).equals(text)) return deviceTypeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
       public void write(JsonWriter jsonWriter, ManagerDevice.DeviceTypeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ManagerDevice.DeviceTypeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ManagerDevice.DeviceTypeEnum.fromValue(String.valueOf(value)); } } } public void setId(Long id) { this.id = id; }
 
   
   public ManagerDevice areaId(Long areaId) {
     this.areaId = areaId;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Identificador da área")
   public Long getAreaId() {
     return this.areaId;
   }
   
   public void setAreaId(Long areaId) {
     this.areaId = areaId;
   }
   
   public ManagerDevice networkIdentification(String networkIdentification) {
     this.networkIdentification = networkIdentification;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Endereço de rede")
   public String getNetworkIdentification() {
     return this.networkIdentification;
   }
   
   public void setNetworkIdentification(String networkIdentification) {
     this.networkIdentification = networkIdentification;
   }
   
   public ManagerDevice networkPort(Integer networkPort) {
     this.networkPort = networkPort;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Porta")
   public Integer getNetworkPort() {
     return this.networkPort;
   }
   
   public void setNetworkPort(Integer networkPort) {
     this.networkPort = networkPort;
   }
   
   public ManagerDevice deviceType(DeviceTypeEnum deviceType) {
     this.deviceType = deviceType;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public DeviceTypeEnum getDeviceType() {
     return this.deviceType;
   }
   
   public void setDeviceType(DeviceTypeEnum deviceType) {
     this.deviceType = deviceType;
   }
   
   public ManagerDevice displayMessage(String displayMessage) {
     this.displayMessage = displayMessage;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Mensagem do display")
   public String getDisplayMessage() {
     return this.displayMessage;
   }
   
   public void setDisplayMessage(String displayMessage) {
     this.displayMessage = displayMessage;
   }
   
   public ManagerDevice numberOfCardRecords(Integer numberOfCardRecords) {
     this.numberOfCardRecords = numberOfCardRecords;
     return this;
   }
 
 
 
 
 
 
 
   
   @Schema(description = "Quantidade de crachás controlados: informa a quantidade máxima de crachás que serão controlados simultaneamente. Campo disponível somente para dispositivos Apollo")
   public Integer getNumberOfCardRecords() {
     return this.numberOfCardRecords;
   }
   
   public void setNumberOfCardRecords(Integer numberOfCardRecords) {
     this.numberOfCardRecords = numberOfCardRecords;
   }
   
   public ManagerDevice turnstileBypassTime(Integer turnstileBypassTime) {
     this.turnstileBypassTime = turnstileBypassTime;
     return this;
   }
 
 
 
 
 
 
 
   
   @Schema(description = "Tempo burla catraca em segundos: indica o tempo que deve passar para gerar um evento de burla catraca. Campo disponível somente para dispositivos de controle de acesso (Apollo ou SDK)")
   public Integer getTurnstileBypassTime() {
     return this.turnstileBypassTime;
   }
   
   public void setTurnstileBypassTime(Integer turnstileBypassTime) {
     this.turnstileBypassTime = turnstileBypassTime;
   }
   
   public ManagerDevice module(List<ModuleDevice> module) {
     this.module = module;
     return this;
   }
   
   public ManagerDevice addModuleItem(ModuleDevice moduleItem) {
     if (this.module == null) {
       this.module = new ArrayList<>();
     }
     this.module.add(moduleItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Módulo")
   public List<ModuleDevice> getModule() {
     return this.module;
   }
   
   public void setModule(List<ModuleDevice> module) {
     this.module = module;
   }
   
   public ManagerDevice reader(List<ReaderDevice> reader) {
     this.reader = reader;
     return this;
   }
   
   public ManagerDevice addReaderItem(ReaderDevice readerItem) {
     if (this.reader == null) {
       this.reader = new ArrayList<>();
     }
     this.reader.add(readerItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Leitora")
   public List<ReaderDevice> getReader() {
     return this.reader;
   }
   
   public void setReader(List<ReaderDevice> reader) {
     this.reader = reader;
   }
   
   public ManagerDevice output(List<OutputDevice> output) {
     this.output = output;
     return this;
   }
   
   public ManagerDevice addOutputItem(OutputDevice outputItem) {
     if (this.output == null) {
       this.output = new ArrayList<>();
     }
     this.output.add(outputItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Dispositivo de saída")
   public List<OutputDevice> getOutput() {
     return this.output;
   }
   
   public void setOutput(List<OutputDevice> output) {
     this.output = output;
   }
   
   public ManagerDevice intput(List<InputDevice> intput) {
     this.intput = intput;
     return this;
   }
   
   public ManagerDevice addIntputItem(InputDevice intputItem) {
     if (this.intput == null) {
       this.intput = new ArrayList<>();
     }
     this.intput.add(intputItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Dispositivo de entrada")
   public List<InputDevice> getIntput() {
     return this.intput;
   }
   
   public void setIntput(List<InputDevice> intput) {
     this.intput = intput;
   }
   
   public ManagerDevice accessMessage(List<AccessMessage> accessMessage) {
     this.accessMessage = accessMessage;
     return this;
   }
   
   public ManagerDevice addAccessMessageItem(AccessMessage accessMessageItem) {
     if (this.accessMessage == null) {
       this.accessMessage = new ArrayList<>();
     }
     this.accessMessage.add(accessMessageItem);
     return this;
   }
 
 
 
 
 
 
 
   
   @Schema(description = "Mensagem de acesso: informa o texto que aparecerá no visor do dispositivo quando cada evento de acesso ocorrer. As mensagens estão disponíveis somente para dispositivos de controle de acesso (Apollo ou SDK)")
   public List<AccessMessage> getAccessMessage() {
     return this.accessMessage;
   }
   
   public void setAccessMessage(List<AccessMessage> accessMessage) {
     this.accessMessage = accessMessage;
   }
   
   public ManagerDevice portConfiguration(List<PortConfiguration> portConfiguration) {
     this.portConfiguration = portConfiguration;
     return this;
   }
   
   public ManagerDevice addPortConfigurationItem(PortConfiguration portConfigurationItem) {
     if (this.portConfiguration == null) {
       this.portConfiguration = new ArrayList<>();
     }
     this.portConfiguration.add(portConfigurationItem);
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Configuração da porta")
   public List<PortConfiguration> getPortConfiguration() {
     return this.portConfiguration;
   }
   
   public void setPortConfiguration(List<PortConfiguration> portConfiguration) {
     this.portConfiguration = portConfiguration;
   }
   
   public ManagerDevice repConfiguration(RepConfiguration repConfiguration) {
     this.repConfiguration = repConfiguration;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public RepConfiguration getRepConfiguration() {
     return this.repConfiguration;
   }
   
   public void setRepConfiguration(RepConfiguration repConfiguration) {
     this.repConfiguration = repConfiguration;
   }
   
   public ManagerDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
     this.extensibleConfiguration = extensibleConfiguration;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "")
   public ExtensibleConfiguration getExtensibleConfiguration() {
     return this.extensibleConfiguration;
   }
   
   public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
     this.extensibleConfiguration = extensibleConfiguration;
   }
   
   public ManagerDevice username(String username) {
     this.username = username;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Usuário")
   public String getUsername() {
     return this.username;
   }
   
   public void setUsername(String username) {
     this.username = username;
   }
   
   public ManagerDevice password(String password) {
     this.password = password;
     return this;
   }
 
 
 
 
 
   
   @Schema(description = "Senha")
   public String getPassword() {
     return this.password;
   }
   
   public void setPassword(String password) {
     this.password = password;
   }
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ManagerDevice managerDevice = (ManagerDevice)o;
     return (Objects.equals(this.id, managerDevice.id) && Objects.equals(this.areaId, managerDevice.areaId) && Objects.equals(this.networkIdentification, managerDevice.networkIdentification) && 
       Objects.equals(this.networkPort, managerDevice.networkPort) && Objects.equals(this.deviceType, managerDevice.deviceType) && Objects.equals(this.displayMessage, managerDevice.displayMessage) && 
       Objects.equals(this.numberOfCardRecords, managerDevice.numberOfCardRecords) && Objects.equals(this.turnstileBypassTime, managerDevice.turnstileBypassTime) && Objects.equals(this.module, managerDevice.module) && 
       Objects.equals(this.reader, managerDevice.reader) && Objects.equals(this.output, managerDevice.output) && Objects.equals(this.intput, managerDevice.intput) && Objects.equals(this.accessMessage, managerDevice.accessMessage) && 
       Objects.equals(this.portConfiguration, managerDevice.portConfiguration) && Objects.equals(this.repConfiguration, managerDevice.repConfiguration) && Objects.equals(this.extensibleConfiguration, managerDevice.extensibleConfiguration) && 
       Objects.equals(this.username, managerDevice.username) && Objects.equals(this.password, managerDevice.password));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.areaId, this.networkIdentification, this.networkPort, this.deviceType, this.displayMessage, this.numberOfCardRecords, this.turnstileBypassTime, this.module, this.reader, this.output, this.intput, this.accessMessage, this.portConfiguration, this.repConfiguration, 
           this.extensibleConfiguration, this.username, this.password });
   }
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ManagerDevice {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
     sb.append("    networkIdentification: ").append(toIndentedString(this.networkIdentification)).append("\n");
     sb.append("    networkPort: ").append(toIndentedString(this.networkPort)).append("\n");
     sb.append("    deviceType: ").append(toIndentedString(this.deviceType)).append("\n");
     sb.append("    displayMessage: ").append(toIndentedString(this.displayMessage)).append("\n");
     sb.append("    numberOfCardRecords: ").append(toIndentedString(this.numberOfCardRecords)).append("\n");
     sb.append("    turnstileBypassTime: ").append(toIndentedString(this.turnstileBypassTime)).append("\n");
     sb.append("    module: ").append(toIndentedString(this.module)).append("\n");
     sb.append("    reader: ").append(toIndentedString(this.reader)).append("\n");
     sb.append("    output: ").append(toIndentedString(this.output)).append("\n");
     sb.append("    intput: ").append(toIndentedString(this.intput)).append("\n");
     sb.append("    accessMessage: ").append(toIndentedString(this.accessMessage)).append("\n");
     sb.append("    portConfiguration: ").append(toIndentedString(this.portConfiguration)).append("\n");
     sb.append("    repConfiguration: ").append(toIndentedString(this.repConfiguration)).append("\n");
     sb.append("    extensibleConfiguration: ").append(toIndentedString(this.extensibleConfiguration)).append("\n");
     sb.append("    username: ").append(toIndentedString(this.username)).append("\n");
     sb.append("    password: ").append(toIndentedString(this.password)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ManagerDevice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
/**
 * ManagerDevice
 */

public class ManagerDevice {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("areaId")
	private Long areaId = null;

	@SerializedName("networkIdentification")
	private String networkIdentification = null;

	@SerializedName("networkPort")
	private Integer networkPort = null;

	/**
	 * Gets or Sets deviceType
	 */
	@JsonAdapter(DeviceTypeEnum.Adapter.class)
	public enum DeviceTypeEnum {
		AAN_32("AAN_32"),

		AAN_100("AAN_100"),

		AIO_168("AIO_168"),

		AIM_2SL("AIM_2SL"),

		AIM_4SL("AIM_4SL"),

		AP_610("AP_610"),

		AP_620("AP_620"),

		AP_625("AP_625"),

		AP_500("AP_500"),

		AP_510("AP_510"),

		AP_520("AP_520"),

		AIM_1SL("AIM_1SL"),

		AIM_4("AIM_4"),

		AMS_130("AMS_130"),

		AMS_102("AMS_102");

		private String value;

		DeviceTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static DeviceTypeEnum fromValue(String text) {
			for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return DeviceTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("deviceType")
	private DeviceTypeEnum deviceType = null;

	@SerializedName("displayMessage")
	private String displayMessage = null;

	@SerializedName("numberOfCardRecords")
	private Integer numberOfCardRecords = null;

	@SerializedName("turnstileBypassTime")
	private Integer turnstileBypassTime = null;

	@SerializedName("module")
	private List<ModuleDevice> module = null;

	@SerializedName("reader")
	private List<ReaderDevice> reader = null;

	@SerializedName("output")
	private List<OutputDevice> output = null;

	@SerializedName("intput")
	private List<InputDevice> intput = null;

	@SerializedName("accessMessage")
	private List<AccessMessage> accessMessage = null;

	@SerializedName("portConfiguration")
	private List<PortConfiguration> portConfiguration = null;

	@SerializedName("repConfiguration")
	private RepConfiguration repConfiguration = null;

	@SerializedName("extensibleConfiguration")
	private ExtensibleConfiguration extensibleConfiguration = null;

	@SerializedName("username")
	private String username = null;

	@SerializedName("password")
	private String password = null;

	public ManagerDevice id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador do dispositivo
	 * 
	 * @return id
	 **/
	@Schema(description  = "Identificador do dispositivo")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ManagerDevice areaId(Long areaId) {
		this.areaId = areaId;
		return this;
	}

	/**
	 * Identificador da área
	 * 
	 * @return areaId
	 **/
	@Schema(description  = "Identificador da área")
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public ManagerDevice networkIdentification(String networkIdentification) {
		this.networkIdentification = networkIdentification;
		return this;
	}

	/**
	 * Endereço de rede
	 * 
	 * @return networkIdentification
	 **/
	@Schema(description  = "Endereço de rede")
	public String getNetworkIdentification() {
		return networkIdentification;
	}

	public void setNetworkIdentification(String networkIdentification) {
		this.networkIdentification = networkIdentification;
	}

	public ManagerDevice networkPort(Integer networkPort) {
		this.networkPort = networkPort;
		return this;
	}

	/**
	 * Porta
	 * 
	 * @return networkPort
	 **/
	@Schema(description  = "Porta")
	public Integer getNetworkPort() {
		return networkPort;
	}

	public void setNetworkPort(Integer networkPort) {
		this.networkPort = networkPort;
	}

	public ManagerDevice deviceType(DeviceTypeEnum deviceType) {
		this.deviceType = deviceType;
		return this;
	}

	/**
	 * Get deviceType
	 * 
	 * @return deviceType
	 **/
	@Schema(description  = "")
	public DeviceTypeEnum getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceTypeEnum deviceType) {
		this.deviceType = deviceType;
	}

	public ManagerDevice displayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
		return this;
	}

	/**
	 * Mensagem do display
	 * 
	 * @return displayMessage
	 **/
	@Schema(description  = "Mensagem do display")
	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public ManagerDevice numberOfCardRecords(Integer numberOfCardRecords) {
		this.numberOfCardRecords = numberOfCardRecords;
		return this;
	}

	/**
	 * Quantidade de crachás controlados: informa a quantidade máxima de crachás que
	 * serão controlados simultaneamente. Campo disponível somente para dispositivos
	 * Apollo
	 * 
	 * @return numberOfCardRecords
	 **/
	@Schema(description  = "Quantidade de crachás controlados: informa a quantidade máxima de crachás que serão controlados simultaneamente. Campo disponível somente para dispositivos Apollo")
	public Integer getNumberOfCardRecords() {
		return numberOfCardRecords;
	}

	public void setNumberOfCardRecords(Integer numberOfCardRecords) {
		this.numberOfCardRecords = numberOfCardRecords;
	}

	public ManagerDevice turnstileBypassTime(Integer turnstileBypassTime) {
		this.turnstileBypassTime = turnstileBypassTime;
		return this;
	}

	/**
	 * Tempo burla catraca em segundos: indica o tempo que deve passar para gerar um
	 * evento de burla catraca. Campo disponível somente para dispositivos de
	 * controle de acesso (Apollo ou SDK)
	 * 
	 * @return turnstileBypassTime
	 **/
	@Schema(description  = "Tempo burla catraca em segundos: indica o tempo que deve passar para gerar um evento de burla catraca. Campo disponível somente para dispositivos de controle de acesso (Apollo ou SDK)")
	public Integer getTurnstileBypassTime() {
		return turnstileBypassTime;
	}

	public void setTurnstileBypassTime(Integer turnstileBypassTime) {
		this.turnstileBypassTime = turnstileBypassTime;
	}

	public ManagerDevice module(List<ModuleDevice> module) {
		this.module = module;
		return this;
	}

	public ManagerDevice addModuleItem(ModuleDevice moduleItem) {
		if (this.module == null) {
			this.module = new ArrayList<ModuleDevice>();
		}
		this.module.add(moduleItem);
		return this;
	}

	/**
	 * Módulo
	 * 
	 * @return module
	 **/
	@Schema(description  = "Módulo")
	public List<ModuleDevice> getModule() {
		return module;
	}

	public void setModule(List<ModuleDevice> module) {
		this.module = module;
	}

	public ManagerDevice reader(List<ReaderDevice> reader) {
		this.reader = reader;
		return this;
	}

	public ManagerDevice addReaderItem(ReaderDevice readerItem) {
		if (this.reader == null) {
			this.reader = new ArrayList<ReaderDevice>();
		}
		this.reader.add(readerItem);
		return this;
	}

	/**
	 * Leitora
	 * 
	 * @return reader
	 **/
	@Schema(description  = "Leitora")
	public List<ReaderDevice> getReader() {
		return reader;
	}

	public void setReader(List<ReaderDevice> reader) {
		this.reader = reader;
	}

	public ManagerDevice output(List<OutputDevice> output) {
		this.output = output;
		return this;
	}

	public ManagerDevice addOutputItem(OutputDevice outputItem) {
		if (this.output == null) {
			this.output = new ArrayList<OutputDevice>();
		}
		this.output.add(outputItem);
		return this;
	}

	/**
	 * Dispositivo de saída
	 * 
	 * @return output
	 **/
	@Schema(description  = "Dispositivo de saída")
	public List<OutputDevice> getOutput() {
		return output;
	}

	public void setOutput(List<OutputDevice> output) {
		this.output = output;
	}

	public ManagerDevice intput(List<InputDevice> intput) {
		this.intput = intput;
		return this;
	}

	public ManagerDevice addIntputItem(InputDevice intputItem) {
		if (this.intput == null) {
			this.intput = new ArrayList<InputDevice>();
		}
		this.intput.add(intputItem);
		return this;
	}

	/**
	 * Dispositivo de entrada
	 * 
	 * @return intput
	 **/
	@Schema(description  = "Dispositivo de entrada")
	public List<InputDevice> getIntput() {
		return intput;
	}

	public void setIntput(List<InputDevice> intput) {
		this.intput = intput;
	}

	public ManagerDevice accessMessage(List<AccessMessage> accessMessage) {
		this.accessMessage = accessMessage;
		return this;
	}

	public ManagerDevice addAccessMessageItem(AccessMessage accessMessageItem) {
		if (this.accessMessage == null) {
			this.accessMessage = new ArrayList<AccessMessage>();
		}
		this.accessMessage.add(accessMessageItem);
		return this;
	}

	/**
	 * Mensagem de acesso: informa o texto que aparecerá no visor do dispositivo
	 * quando cada evento de acesso ocorrer. As mensagens estão disponíveis somente
	 * para dispositivos de controle de acesso (Apollo ou SDK)
	 * 
	 * @return accessMessage
	 **/
	@Schema(description  = "Mensagem de acesso: informa o texto que aparecerá no visor do dispositivo quando cada evento de acesso ocorrer. As mensagens estão disponíveis somente para dispositivos de controle de acesso (Apollo ou SDK)")
	public List<AccessMessage> getAccessMessage() {
		return accessMessage;
	}

	public void setAccessMessage(List<AccessMessage> accessMessage) {
		this.accessMessage = accessMessage;
	}

	public ManagerDevice portConfiguration(List<PortConfiguration> portConfiguration) {
		this.portConfiguration = portConfiguration;
		return this;
	}

	public ManagerDevice addPortConfigurationItem(PortConfiguration portConfigurationItem) {
		if (this.portConfiguration == null) {
			this.portConfiguration = new ArrayList<PortConfiguration>();
		}
		this.portConfiguration.add(portConfigurationItem);
		return this;
	}

	/**
	 * Configuração da porta
	 * 
	 * @return portConfiguration
	 **/
	@Schema(description  = "Configuração da porta")
	public List<PortConfiguration> getPortConfiguration() {
		return portConfiguration;
	}

	public void setPortConfiguration(List<PortConfiguration> portConfiguration) {
		this.portConfiguration = portConfiguration;
	}

	public ManagerDevice repConfiguration(RepConfiguration repConfiguration) {
		this.repConfiguration = repConfiguration;
		return this;
	}

	/**
	 * Get repConfiguration
	 * 
	 * @return repConfiguration
	 **/
	@Schema(description  = "")
	public RepConfiguration getRepConfiguration() {
		return repConfiguration;
	}

	public void setRepConfiguration(RepConfiguration repConfiguration) {
		this.repConfiguration = repConfiguration;
	}

	public ManagerDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
		this.extensibleConfiguration = extensibleConfiguration;
		return this;
	}

	/**
	 * Get extensibleConfiguration
	 * 
	 * @return extensibleConfiguration
	 **/
	@Schema(description  = "")
	public ExtensibleConfiguration getExtensibleConfiguration() {
		return extensibleConfiguration;
	}

	public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
		this.extensibleConfiguration = extensibleConfiguration;
	}

	public ManagerDevice username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Usuário
	 * 
	 * @return username
	 **/
	@Schema(description  = "Usuário")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ManagerDevice password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Senha
	 * 
	 * @return password
	 **/
	@Schema(description  = "Senha")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ManagerDevice ManagerDevice = (ManagerDevice) o;
		return Objects.equals(this.id, ManagerDevice.id) && Objects.equals(this.areaId, ManagerDevice.areaId) && Objects.equals(this.networkIdentification, ManagerDevice.networkIdentification)
				&& Objects.equals(this.networkPort, ManagerDevice.networkPort) && Objects.equals(this.deviceType, ManagerDevice.deviceType) && Objects.equals(this.displayMessage, ManagerDevice.displayMessage)
				&& Objects.equals(this.numberOfCardRecords, ManagerDevice.numberOfCardRecords) && Objects.equals(this.turnstileBypassTime, ManagerDevice.turnstileBypassTime) && Objects.equals(this.module, ManagerDevice.module)
				&& Objects.equals(this.reader, ManagerDevice.reader) && Objects.equals(this.output, ManagerDevice.output) && Objects.equals(this.intput, ManagerDevice.intput) && Objects.equals(this.accessMessage, ManagerDevice.accessMessage)
				&& Objects.equals(this.portConfiguration, ManagerDevice.portConfiguration) && Objects.equals(this.repConfiguration, ManagerDevice.repConfiguration) && Objects.equals(this.extensibleConfiguration, ManagerDevice.extensibleConfiguration)
				&& Objects.equals(this.username, ManagerDevice.username) && Objects.equals(this.password, ManagerDevice.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, areaId, networkIdentification, networkPort, deviceType, displayMessage, numberOfCardRecords, turnstileBypassTime, module, reader, output, intput, accessMessage, portConfiguration, repConfiguration,
				extensibleConfiguration, username, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ManagerDevice {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
		sb.append("    networkIdentification: ").append(toIndentedString(networkIdentification)).append("\n");
		sb.append("    networkPort: ").append(toIndentedString(networkPort)).append("\n");
		sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
		sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
		sb.append("    numberOfCardRecords: ").append(toIndentedString(numberOfCardRecords)).append("\n");
		sb.append("    turnstileBypassTime: ").append(toIndentedString(turnstileBypassTime)).append("\n");
		sb.append("    module: ").append(toIndentedString(module)).append("\n");
		sb.append("    reader: ").append(toIndentedString(reader)).append("\n");
		sb.append("    output: ").append(toIndentedString(output)).append("\n");
		sb.append("    intput: ").append(toIndentedString(intput)).append("\n");
		sb.append("    accessMessage: ").append(toIndentedString(accessMessage)).append("\n");
		sb.append("    portConfiguration: ").append(toIndentedString(portConfiguration)).append("\n");
		sb.append("    repConfiguration: ").append(toIndentedString(repConfiguration)).append("\n");
		sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
