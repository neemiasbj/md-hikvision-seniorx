 package br.com.seniorx.models;
 import java.io.IOException;
import java.util.ArrayList;
 import java.util.List;
 import java.util.Objects;

 import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
<<<<<<< HEAD
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;

 import io.swagger.v3.oas.annotations.media.Schema;
 
 public class ReaderDevice { @SerializedName("id") private Long id; @SerializedName("areaId") private Long areaId; @SerializedName("output") private List<OutputDevice> output; @SerializedName("intput") private List<InputDevice> intput; @SerializedName("readerTechnology") private ReaderTechnologyEnum readerTechnology; @SerializedName("readerDirection") private ReaderDirectionEnum readerDirection; @SerializedName("biometricManufacturer") private BiometricManufacturerEnum biometricManufacturer; @SerializedName("biometricValidation") private BiometricValidationEnum biometricValidation; @SerializedName("biometricSecurityLevel") private Integer biometricSecurityLevel; @SerializedName("biometricReaderId") private Long biometricReaderId; @SerializedName("physicalAddress") private Integer physicalAddress; @SerializedName("areaLeaving") private Long areaLeaving; @SerializedName("areaEntering") private Long areaEntering; @SerializedName("cardFormatList") private List<Long> cardFormatList; @SerializedName("strikeTime") private Integer strikeTime; @SerializedName("heldOpenTime") private Integer heldOpenTime; @SerializedName("offlineMode") private OfflineModeEnum offlineMode; @SerializedName("accessMode") private AccessModeEnum accessMode; @SerializedName("antiPassbackTime") private Integer antiPassbackTime; @SerializedName("enablePairing") private Boolean enablePairing; @SerializedName("validateVehicle") private Boolean validateVehicle; @SerializedName("activations") private List<ReaderActivation> activations; @SerializedName("extensibleConfiguration") private ExtensibleConfiguration extensibleConfiguration; @SerializedName("urnSensor") private Long urnSensor; @SerializedName("urnSensorTime") private Integer urnSensorTime; @JsonAdapter(ReaderTechnologyEnum.Adapter.class) public enum ReaderTechnologyEnum {
     UNKNOWN("UNKNOWN"), BARCODE_CARD("BARCODE_CARD"), RFID_CARD("RFID_CARD"), SMART_CARD("SMART_CARD"), BIOMETRY("BIOMETRY"), QRCODE("QRCODE"), KEYBOARD("KEYBOARD"), LPR("LPR"); private String value; ReaderTechnologyEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ReaderTechnologyEnum fromValue(String text) { byte b; int i; ReaderTechnologyEnum[] arrayOfReaderTechnologyEnum; for (i = (arrayOfReaderTechnologyEnum = values()).length, b = 0; b < i; ) { ReaderTechnologyEnum readerTechnologyEnum = arrayOfReaderTechnologyEnum[b]; if (String.valueOf(readerTechnologyEnum.value).equals(text))
           return readerTechnologyEnum;  b++; }
        return null; } public static class Adapter extends TypeAdapter<ReaderTechnologyEnum> {
       public void write(JsonWriter jsonWriter, ReaderDevice.ReaderTechnologyEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ReaderDevice.ReaderTechnologyEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ReaderDevice.ReaderTechnologyEnum.fromValue(String.valueOf(value)); }
     }
   } @JsonAdapter(ReaderDirectionEnum.Adapter.class) public enum ReaderDirectionEnum { ENTRANCE("ENTRANCE"), EXIT("EXIT"), BOTH("BOTH"); private String value; ReaderDirectionEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static ReaderDirectionEnum fromValue(String text) { byte b; int i; ReaderDirectionEnum[] arrayOfReaderDirectionEnum; for (i = (arrayOfReaderDirectionEnum = values()).length, b = 0; b < i; ) {
         ReaderDirectionEnum readerDirectionEnum = arrayOfReaderDirectionEnum[b]; if (String.valueOf(readerDirectionEnum.value).equals(text))
           return readerDirectionEnum;  b++;
       }  return null; } public static class Adapter extends TypeAdapter<ReaderDirectionEnum> {
       public void write(JsonWriter jsonWriter, ReaderDevice.ReaderDirectionEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ReaderDevice.ReaderDirectionEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ReaderDevice.ReaderDirectionEnum.fromValue(String.valueOf(value)); }
     } } public ReaderDevice() { this.id = null;
 
     
     this.areaId = null;
 
     
     this.output = null;
 
     
     this.intput = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.readerTechnology = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.readerDirection = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.biometricManufacturer = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.biometricValidation = null;
 
     
     this.biometricSecurityLevel = null;
 
     
     this.biometricReaderId = null;
 
     
     this.physicalAddress = null;
 
     
     this.areaLeaving = null;
 
     
     this.areaEntering = null;
 
     
     this.cardFormatList = null;
 
     
     this.strikeTime = null;
 
     
     this.heldOpenTime = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.offlineMode = null;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     
     this.accessMode = null;
 
     
     this.antiPassbackTime = null;
 
     
     this.enablePairing = Boolean.valueOf(false);
 
     
     this.validateVehicle = Boolean.valueOf(false);
 
     
     this.activations = null;
 
     
     this.extensibleConfiguration = null;
 
     
     this.urnSensor = null;
 
     
     this.urnSensorTime = null; }
   @JsonAdapter(BiometricManufacturerEnum.Adapter.class) public enum BiometricManufacturerEnum {
     NONE("NONE"), FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"), FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"), FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"), FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"), FINGERPRINT_CAMA("FINGERPRINT_CAMA"), FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"), HANDKEY_IR("HANDKEY_IR"), FACIAL("FACIAL"), FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"), FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"), FACIAL_VISICA("FACIAL_VISICA"), FINGERPRINT_DIXI("FINGERPRINT_DIXI"), FACIAL_DIXI("FACIAL_DIXI"), FACIAL_HENRY("FACIAL_HENRY"); private String value; BiometricManufacturerEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static BiometricManufacturerEnum fromValue(String text) { byte b; int i; BiometricManufacturerEnum[] arrayOfBiometricManufacturerEnum; for (i = (arrayOfBiometricManufacturerEnum = values()).length, b = 0; b < i; ) { BiometricManufacturerEnum biometricManufacturerEnum = arrayOfBiometricManufacturerEnum[b]; if (String.valueOf(biometricManufacturerEnum.value).equals(text)) return biometricManufacturerEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<BiometricManufacturerEnum> {
       public void write(JsonWriter jsonWriter, ReaderDevice.BiometricManufacturerEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ReaderDevice.BiometricManufacturerEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ReaderDevice.BiometricManufacturerEnum.fromValue(String.valueOf(value)); } } } public ReaderDevice id(Long id) { this.id = id;
     return this; } @JsonAdapter(BiometricValidationEnum.Adapter.class) public enum BiometricValidationEnum {
     NONE("NONE"), ONE_TO_ONE("ONE_TO_ONE"), BOTH("BOTH"); private String value; BiometricValidationEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static BiometricValidationEnum fromValue(String text) { byte b; int i; BiometricValidationEnum[] arrayOfBiometricValidationEnum; for (i = (arrayOfBiometricValidationEnum = values()).length, b = 0; b < i; ) { BiometricValidationEnum biometricValidationEnum = arrayOfBiometricValidationEnum[b]; if (String.valueOf(biometricValidationEnum.value).equals(text)) return biometricValidationEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<BiometricValidationEnum> {
       public void write(JsonWriter jsonWriter, ReaderDevice.BiometricValidationEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ReaderDevice.BiometricValidationEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ReaderDevice.BiometricValidationEnum.fromValue(String.valueOf(value)); } } } @JsonAdapter(OfflineModeEnum.Adapter.class) public enum OfflineModeEnum {
     LOCKED("LOCKED"), CARD_ONLY("CARD_ONLY"), PIN_OR_CARD("PIN_OR_CARD"), CARD_AND_PIN("CARD_AND_PIN"), UNLOCKED("UNLOCKED"), FACILITY_CODE_ONLY("FACILITY_CODE_ONLY"), CIPHER_LOCK_EMULATION("CIPHER_LOCK_EMULATION"); private String value; OfflineModeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static OfflineModeEnum fromValue(String text) { byte b; int i; OfflineModeEnum[] arrayOfOfflineModeEnum; for (i = (arrayOfOfflineModeEnum = values()).length, b = 0; b < i; ) { OfflineModeEnum offlineModeEnum = arrayOfOfflineModeEnum[b]; if (String.valueOf(offlineModeEnum.value).equals(text)) return offlineModeEnum;  b++; }  return null; } public static class Adapter extends TypeAdapter<OfflineModeEnum> {
       public void write(JsonWriter jsonWriter, ReaderDevice.OfflineModeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); } public ReaderDevice.OfflineModeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ReaderDevice.OfflineModeEnum.fromValue(String.valueOf(value)); } } } @JsonAdapter(AccessModeEnum.Adapter.class) public enum AccessModeEnum {
     LOCKED("LOCKED"), CARD_ONLY("CARD_ONLY"), PIN_OR_CARD("PIN_OR_CARD"), CARD_AND_PIN("CARD_AND_PIN"), UNLOCKED("UNLOCKED"), FACILITY_CODE_ONLY("FACILITY_CODE_ONLY"), CIPHER_LOCK_EMULATION("CIPHER_LOCK_EMULATION"); private String value; AccessModeEnum(String value) { this.value = value; } public String getValue() { return this.value; } public String toString() { return String.valueOf(this.value); } public static AccessModeEnum fromValue(String text) { byte b; int i; AccessModeEnum[] arrayOfAccessModeEnum; for (i = (arrayOfAccessModeEnum = values()).length, b = 0; b < i; ) { AccessModeEnum accessModeEnum = arrayOfAccessModeEnum[b]; if (String.valueOf(accessModeEnum.value).equals(text)) return accessModeEnum;  b++; }  return null; }
     public static class Adapter extends TypeAdapter<AccessModeEnum> {
       public void write(JsonWriter jsonWriter, ReaderDevice.AccessModeEnum enumeration) throws IOException { jsonWriter.value(enumeration.getValue()); }
       public ReaderDevice.AccessModeEnum read(JsonReader jsonReader) throws IOException { String value = jsonReader.nextString(); return ReaderDevice.AccessModeEnum.fromValue(String.valueOf(value)); } } }
   @Schema(description = "Identificador do dispositivo") public Long getId() { return this.id; }
 
   
   public void setId(Long id) {
     this.id = id;
   }
   
   public ReaderDevice areaId(Long areaId) {
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
   
   public ReaderDevice output(List<OutputDevice> output) {
     this.output = output;
     return this;
   }
   
   public ReaderDevice addOutputItem(OutputDevice outputItem) {
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
   
   public ReaderDevice intput(List<InputDevice> intput) {
     this.intput = intput;
     return this;
   }
   
   public ReaderDevice addIntputItem(InputDevice intputItem) {
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
   
   public ReaderDevice readerTechnology(ReaderTechnologyEnum readerTechnology) {
     this.readerTechnology = readerTechnology;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public ReaderTechnologyEnum getReaderTechnology() {
     return this.readerTechnology;
   }
   
   public void setReaderTechnology(ReaderTechnologyEnum readerTechnology) {
     this.readerTechnology = readerTechnology;
   }
   
   public ReaderDevice readerDirection(ReaderDirectionEnum readerDirection) {
     this.readerDirection = readerDirection;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public ReaderDirectionEnum getReaderDirection() {
     return this.readerDirection;
   }
   
   public void setReaderDirection(ReaderDirectionEnum readerDirection) {
     this.readerDirection = readerDirection;
   }
   
   public ReaderDevice biometricManufacturer(BiometricManufacturerEnum biometricManufacturer) {
     this.biometricManufacturer = biometricManufacturer;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public BiometricManufacturerEnum getBiometricManufacturer() {
     return this.biometricManufacturer;
   }
   
   public void setBiometricManufacturer(BiometricManufacturerEnum biometricManufacturer) {
     this.biometricManufacturer = biometricManufacturer;
   }
   
   public ReaderDevice biometricValidation(BiometricValidationEnum biometricValidation) {
     this.biometricValidation = biometricValidation;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public BiometricValidationEnum getBiometricValidation() {
     return this.biometricValidation;
   }
   
   public void setBiometricValidation(BiometricValidationEnum biometricValidation) {
     this.biometricValidation = biometricValidation;
   }
   
   public ReaderDevice biometricSecurityLevel(Integer biometricSecurityLevel) {
     this.biometricSecurityLevel = biometricSecurityLevel;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Nível de conferência")
   public Integer getBiometricSecurityLevel() {
     return this.biometricSecurityLevel;
   }
   
   public void setBiometricSecurityLevel(Integer biometricSecurityLevel) {
     this.biometricSecurityLevel = biometricSecurityLevel;
   }
   
   public ReaderDevice biometricReaderId(Long biometricReaderId) {
     this.biometricReaderId = biometricReaderId;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Leitora biométrica que será utilizado por este leitor para validar a biometria 1:1")
   public Long getBiometricReaderId() {
     return this.biometricReaderId;
   }
   
   public void setBiometricReaderId(Long biometricReaderId) {
     this.biometricReaderId = biometricReaderId;
   }
   
   public ReaderDevice physicalAddress(Integer physicalAddress) {
     this.physicalAddress = physicalAddress;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Endereço")
   public Integer getPhysicalAddress() {
     return this.physicalAddress;
   }
   
   public void setPhysicalAddress(Integer physicalAddress) {
     this.physicalAddress = physicalAddress;
   }
   
   public ReaderDevice areaLeaving(Long areaLeaving) {
     this.areaLeaving = areaLeaving;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Local físico de origem")
   public Long getAreaLeaving() {
     return this.areaLeaving;
   }
   
   public void setAreaLeaving(Long areaLeaving) {
     this.areaLeaving = areaLeaving;
   }
   
   public ReaderDevice areaEntering(Long areaEntering) {
     this.areaEntering = areaEntering;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Local físico de destino")
   public Long getAreaEntering() {
     return this.areaEntering;
   }
   
   public void setAreaEntering(Long areaEntering) {
     this.areaEntering = areaEntering;
   }
   
   public ReaderDevice cardFormatList(List<Long> cardFormatList) {
     this.cardFormatList = cardFormatList;
     return this;
   }
   
   public ReaderDevice addCardFormatListItem(Long cardFormatListItem) {
     if (this.cardFormatList == null) {
       this.cardFormatList = new ArrayList<>();
     }
     this.cardFormatList.add(cardFormatListItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Lista de formato de cartão")
   public List<Long> getCardFormatList() {
     return this.cardFormatList;
   }
   
   public void setCardFormatList(List<Long> cardFormatList) {
     this.cardFormatList = cardFormatList;
   }
   
   public ReaderDevice strikeTime(Integer strikeTime) {
     this.strikeTime = strikeTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tempo")
   public Integer getStrikeTime() {
     return this.strikeTime;
   }
   
   public void setStrikeTime(Integer strikeTime) {
     this.strikeTime = strikeTime;
   }
   
   public ReaderDevice heldOpenTime(Integer heldOpenTime) {
     this.heldOpenTime = heldOpenTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tempo aberto")
   public Integer getHeldOpenTime() {
     return this.heldOpenTime;
   }
   
   public void setHeldOpenTime(Integer heldOpenTime) {
     this.heldOpenTime = heldOpenTime;
   }
   
   public ReaderDevice offlineMode(OfflineModeEnum offlineMode) {
     this.offlineMode = offlineMode;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public OfflineModeEnum getOfflineMode() {
     return this.offlineMode;
   }
   
   public void setOfflineMode(OfflineModeEnum offlineMode) {
     this.offlineMode = offlineMode;
   }
   
   public ReaderDevice accessMode(AccessModeEnum accessMode) {
     this.accessMode = accessMode;
     return this;
   }
 
 
 
 
   
   @Schema(description = "")
   public AccessModeEnum getAccessMode() {
     return this.accessMode;
   }
   
   public void setAccessMode(AccessModeEnum accessMode) {
     this.accessMode = accessMode;
   }
   
   public ReaderDevice antiPassbackTime(Integer antiPassbackTime) {
     this.antiPassbackTime = antiPassbackTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "É o tempo mínimo de acesso para o mesmo destino, a fim de evitar que duas pessoas utilizem o mesmo cartão para acessar o mesmo local")
   public Integer getAntiPassbackTime() {
     return this.antiPassbackTime;
   }
   
   public void setAntiPassbackTime(Integer antiPassbackTime) {
     this.antiPassbackTime = antiPassbackTime;
   }
   
   public ReaderDevice enablePairing(Boolean enablePairing) {
     this.enablePairing = enablePairing;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Ativa o emparelhamento")
   public Boolean isEnablePairing() {
     return this.enablePairing;
   }
   
   public void setEnablePairing(Boolean enablePairing) {
     this.enablePairing = enablePairing;
   }
   
   public ReaderDevice validateVehicle(Boolean validateVehicle) {
     this.validateVehicle = validateVehicle;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Valida veículo")
   public Boolean isValidateVehicle() {
     return this.validateVehicle;
   }
   
   public void setValidateVehicle(Boolean validateVehicle) {
     this.validateVehicle = validateVehicle;
   }
   
   public ReaderDevice activations(List<ReaderActivation> activations) {
     this.activations = activations;
     return this;
   }
   
   public ReaderDevice addActivationsItem(ReaderActivation activationsItem) {
     if (this.activations == null) {
       this.activations = new ArrayList<>();
     }
     this.activations.add(activationsItem);
     return this;
   }
 
 
 
 
   
   @Schema(description = "Leitoras ativas")
   public List<ReaderActivation> getActivations() {
     return this.activations;
   }
   
   public void setActivations(List<ReaderActivation> activations) {
     this.activations = activations;
   }
   
   public ReaderDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
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
   
   public ReaderDevice urnSensor(Long urnSensor) {
     this.urnSensor = urnSensor;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Identificador do sensor de urna")
   public Long getUrnSensor() {
     return this.urnSensor;
   }
   
   public void setUrnSensor(Long urnSensor) {
     this.urnSensor = urnSensor;
   }
   
   public ReaderDevice urnSensorTime(Integer urnSensorTime) {
     this.urnSensorTime = urnSensorTime;
     return this;
   }
 
 
 
 
   
   @Schema(description = "Tempo sensor urna")
   public Integer getUrnSensorTime() {
     return this.urnSensorTime;
   }
   
   public void setUrnSensorTime(Integer urnSensorTime) {
     this.urnSensorTime = urnSensorTime;
   }
 
 
   
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     ReaderDevice readerDevice = (ReaderDevice)o;
     return (Objects.equals(this.id, readerDevice.id) && 
       Objects.equals(this.areaId, readerDevice.areaId) && 
       Objects.equals(this.output, readerDevice.output) && 
       Objects.equals(this.intput, readerDevice.intput) && 
       Objects.equals(this.readerTechnology, readerDevice.readerTechnology) && 
       Objects.equals(this.readerDirection, readerDevice.readerDirection) && 
       Objects.equals(this.biometricManufacturer, readerDevice.biometricManufacturer) && 
       Objects.equals(this.biometricValidation, readerDevice.biometricValidation) && 
       Objects.equals(this.biometricSecurityLevel, readerDevice.biometricSecurityLevel) && 
       Objects.equals(this.biometricReaderId, readerDevice.biometricReaderId) && 
       Objects.equals(this.physicalAddress, readerDevice.physicalAddress) && 
       Objects.equals(this.areaLeaving, readerDevice.areaLeaving) && 
       Objects.equals(this.areaEntering, readerDevice.areaEntering) && 
       Objects.equals(this.cardFormatList, readerDevice.cardFormatList) && 
       Objects.equals(this.strikeTime, readerDevice.strikeTime) && 
       Objects.equals(this.heldOpenTime, readerDevice.heldOpenTime) && 
       Objects.equals(this.offlineMode, readerDevice.offlineMode) && 
       Objects.equals(this.accessMode, readerDevice.accessMode) && 
       Objects.equals(this.antiPassbackTime, readerDevice.antiPassbackTime) && 
       Objects.equals(this.enablePairing, readerDevice.enablePairing) && 
       Objects.equals(this.validateVehicle, readerDevice.validateVehicle) && 
       Objects.equals(this.activations, readerDevice.activations) && 
       Objects.equals(this.extensibleConfiguration, readerDevice.extensibleConfiguration) && 
       Objects.equals(this.urnSensor, readerDevice.urnSensor) && 
       Objects.equals(this.urnSensorTime, readerDevice.urnSensorTime));
   }
 
   
   public int hashCode() {
     return Objects.hash(new Object[] { this.id, this.areaId, this.output, this.intput, this.readerTechnology, this.readerDirection, this.biometricManufacturer, this.biometricValidation, this.biometricSecurityLevel, this.biometricReaderId, this.physicalAddress, this.areaLeaving, this.areaEntering, this.cardFormatList, this.strikeTime, this.heldOpenTime, this.offlineMode, this.accessMode, this.antiPassbackTime, this.enablePairing, this.validateVehicle, this.activations, this.extensibleConfiguration, this.urnSensor, this.urnSensorTime });
   }
 
 
   
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class ReaderDevice {\n");
     
     sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
     sb.append("    areaId: ").append(toIndentedString(this.areaId)).append("\n");
     sb.append("    output: ").append(toIndentedString(this.output)).append("\n");
     sb.append("    intput: ").append(toIndentedString(this.intput)).append("\n");
     sb.append("    readerTechnology: ").append(toIndentedString(this.readerTechnology)).append("\n");
     sb.append("    readerDirection: ").append(toIndentedString(this.readerDirection)).append("\n");
     sb.append("    biometricManufacturer: ").append(toIndentedString(this.biometricManufacturer)).append("\n");
     sb.append("    biometricValidation: ").append(toIndentedString(this.biometricValidation)).append("\n");
     sb.append("    biometricSecurityLevel: ").append(toIndentedString(this.biometricSecurityLevel)).append("\n");
     sb.append("    biometricReaderId: ").append(toIndentedString(this.biometricReaderId)).append("\n");
     sb.append("    physicalAddress: ").append(toIndentedString(this.physicalAddress)).append("\n");
     sb.append("    areaLeaving: ").append(toIndentedString(this.areaLeaving)).append("\n");
     sb.append("    areaEntering: ").append(toIndentedString(this.areaEntering)).append("\n");
     sb.append("    cardFormatList: ").append(toIndentedString(this.cardFormatList)).append("\n");
     sb.append("    strikeTime: ").append(toIndentedString(this.strikeTime)).append("\n");
     sb.append("    heldOpenTime: ").append(toIndentedString(this.heldOpenTime)).append("\n");
     sb.append("    offlineMode: ").append(toIndentedString(this.offlineMode)).append("\n");
     sb.append("    accessMode: ").append(toIndentedString(this.accessMode)).append("\n");
     sb.append("    antiPassbackTime: ").append(toIndentedString(this.antiPassbackTime)).append("\n");
     sb.append("    enablePairing: ").append(toIndentedString(this.enablePairing)).append("\n");
     sb.append("    validateVehicle: ").append(toIndentedString(this.validateVehicle)).append("\n");
     sb.append("    activations: ").append(toIndentedString(this.activations)).append("\n");
     sb.append("    extensibleConfiguration: ").append(toIndentedString(this.extensibleConfiguration)).append("\n");
     sb.append("    urnSensor: ").append(toIndentedString(this.urnSensor)).append("\n");
     sb.append("    urnSensorTime: ").append(toIndentedString(this.urnSensorTime)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
 
 
 
   
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   } }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\ReaderDevice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ReaderDevice
 */

public class ReaderDevice {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("areaId")
  private Long areaId = null;

  @SerializedName("output")
  private List<OutputDevice> output = null;

  @SerializedName("intput")
  private List<InputDevice> intput = null;

  /**
   * Gets or Sets readerTechnology
   */
  @JsonAdapter(ReaderTechnologyEnum.Adapter.class)
  public enum ReaderTechnologyEnum {
    UNKNOWN("UNKNOWN"),
    
    BARCODE_CARD("BARCODE_CARD"),
    
    RFID_CARD("RFID_CARD"),
    
    SMART_CARD("SMART_CARD"),
    
    BIOMETRY("BIOMETRY"),
    
    QRCODE("QRCODE"),
    
    KEYBOARD("KEYBOARD"),
    
    LPR("LPR");

    private String value;

    ReaderTechnologyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReaderTechnologyEnum fromValue(String text) {
      for (ReaderTechnologyEnum b : ReaderTechnologyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReaderTechnologyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReaderTechnologyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReaderTechnologyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReaderTechnologyEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("readerTechnology")
  private ReaderTechnologyEnum readerTechnology = null;

  /**
   * Gets or Sets readerDirection
   */
  @JsonAdapter(ReaderDirectionEnum.Adapter.class)
  public enum ReaderDirectionEnum {
    ENTRANCE("ENTRANCE"),
    
    EXIT("EXIT"),
    
    BOTH("BOTH");

    private String value;

    ReaderDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReaderDirectionEnum fromValue(String text) {
      for (ReaderDirectionEnum b : ReaderDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReaderDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReaderDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReaderDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReaderDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("readerDirection")
  private ReaderDirectionEnum readerDirection = null;

  /**
   * Gets or Sets biometricManufacturer
   */
  @JsonAdapter(BiometricManufacturerEnum.Adapter.class)
  public enum BiometricManufacturerEnum {
    NONE("NONE"),
    
    FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"),
    
    FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"),
    
    FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"),
    
    FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"),
    
    FINGERPRINT_CAMA("FINGERPRINT_CAMA"),
    
    FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"),
    
    HANDKEY_IR("HANDKEY_IR"),
    
    FACIAL("FACIAL"),
    
    FINGERPRINT_ZKTECO("FINGERPRINT_ZKTECO"),
    
    FINGERPRINT_SECUKEY("FINGERPRINT_SECUKEY"),
    
    FACIAL_VISICA("FACIAL_VISICA"),
    
    FINGERPRINT_DIXI("FINGERPRINT_DIXI"),
    
    FACIAL_DIXI("FACIAL_DIXI"),
    
    FACIAL_HENRY("FACIAL_HENRY");

    private String value;

    BiometricManufacturerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BiometricManufacturerEnum fromValue(String text) {
      for (BiometricManufacturerEnum b : BiometricManufacturerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BiometricManufacturerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BiometricManufacturerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BiometricManufacturerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BiometricManufacturerEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("biometricManufacturer")
  private BiometricManufacturerEnum biometricManufacturer = null;

  /**
   * Gets or Sets biometricValidation
   */
  @JsonAdapter(BiometricValidationEnum.Adapter.class)
  public enum BiometricValidationEnum {
    NONE("NONE"),
    
    ONE_TO_ONE("ONE_TO_ONE"),
    
    BOTH("BOTH");

    private String value;

    BiometricValidationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BiometricValidationEnum fromValue(String text) {
      for (BiometricValidationEnum b : BiometricValidationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BiometricValidationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BiometricValidationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BiometricValidationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BiometricValidationEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("biometricValidation")
  private BiometricValidationEnum biometricValidation = null;

  @SerializedName("biometricSecurityLevel")
  private Integer biometricSecurityLevel = null;

  @SerializedName("biometricReaderId")
  private Long biometricReaderId = null;

  @SerializedName("physicalAddress")
  private Integer physicalAddress = null;

  @SerializedName("areaLeaving")
  private Long areaLeaving = null;

  @SerializedName("areaEntering")
  private Long areaEntering = null;

  @SerializedName("cardFormatList")
  private List<Long> cardFormatList = null;

  @SerializedName("strikeTime")
  private Integer strikeTime = null;

  @SerializedName("heldOpenTime")
  private Integer heldOpenTime = null;

  /**
   * Gets or Sets offlineMode
   */
  @JsonAdapter(OfflineModeEnum.Adapter.class)
  public enum OfflineModeEnum {
    LOCKED("LOCKED"),
    
    CARD_ONLY("CARD_ONLY"),
    
    PIN_OR_CARD("PIN_OR_CARD"),
    
    CARD_AND_PIN("CARD_AND_PIN"),
    
    UNLOCKED("UNLOCKED"),
    
    FACILITY_CODE_ONLY("FACILITY_CODE_ONLY"),
    
    CIPHER_LOCK_EMULATION("CIPHER_LOCK_EMULATION");

    private String value;

    OfflineModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OfflineModeEnum fromValue(String text) {
      for (OfflineModeEnum b : OfflineModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OfflineModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfflineModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfflineModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OfflineModeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("offlineMode")
  private OfflineModeEnum offlineMode = null;

  /**
   * Gets or Sets accessMode
   */
  @JsonAdapter(AccessModeEnum.Adapter.class)
  public enum AccessModeEnum {
    LOCKED("LOCKED"),
    
    CARD_ONLY("CARD_ONLY"),
    
    PIN_OR_CARD("PIN_OR_CARD"),
    
    CARD_AND_PIN("CARD_AND_PIN"),
    
    UNLOCKED("UNLOCKED"),
    
    FACILITY_CODE_ONLY("FACILITY_CODE_ONLY"),
    
    CIPHER_LOCK_EMULATION("CIPHER_LOCK_EMULATION");

    private String value;

    AccessModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessModeEnum fromValue(String text) {
      for (AccessModeEnum b : AccessModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessModeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("accessMode")
  private AccessModeEnum accessMode = null;

  @SerializedName("antiPassbackTime")
  private Integer antiPassbackTime = null;

  @SerializedName("enablePairing")
  private Boolean enablePairing = false;

  @SerializedName("validateVehicle")
  private Boolean validateVehicle = false;

  @SerializedName("activations")
  private List<ReaderActivation> activations = null;

  @SerializedName("extensibleConfiguration")
  private ExtensibleConfiguration extensibleConfiguration = null;

  @SerializedName("urnSensor")
  private Long urnSensor = null;

  @SerializedName("urnSensorTime")
  private Integer urnSensorTime = null;

  public ReaderDevice id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador do dispositivo
   * @return id
  **/
  @Schema(description  = "Identificador do dispositivo")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReaderDevice areaId(Long areaId) {
    this.areaId = areaId;
    return this;
  }

   /**
   * Identificador da área
   * @return areaId
  **/
  @Schema(description  = "Identificador da área")
  public Long getAreaId() {
    return areaId;
  }

  public void setAreaId(Long areaId) {
    this.areaId = areaId;
  }

  public ReaderDevice output(List<OutputDevice> output) {
    this.output = output;
    return this;
  }

  public ReaderDevice addOutputItem(OutputDevice outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<OutputDevice>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * Dispositivo de saída
   * @return output
  **/
  @Schema(description  = "Dispositivo de saída")
  public List<OutputDevice> getOutput() {
    return output;
  }

  public void setOutput(List<OutputDevice> output) {
    this.output = output;
  }

  public ReaderDevice intput(List<InputDevice> intput) {
    this.intput = intput;
    return this;
  }

  public ReaderDevice addIntputItem(InputDevice intputItem) {
    if (this.intput == null) {
      this.intput = new ArrayList<InputDevice>();
    }
    this.intput.add(intputItem);
    return this;
  }

   /**
   * Dispositivo de entrada
   * @return intput
  **/
  @Schema(description  = "Dispositivo de entrada")
  public List<InputDevice> getIntput() {
    return intput;
  }

  public void setIntput(List<InputDevice> intput) {
    this.intput = intput;
  }

  public ReaderDevice readerTechnology(ReaderTechnologyEnum readerTechnology) {
    this.readerTechnology = readerTechnology;
    return this;
  }

   /**
   * Get readerTechnology
   * @return readerTechnology
  **/
  @Schema(description  = "")
  public ReaderTechnologyEnum getReaderTechnology() {
    return readerTechnology;
  }

  public void setReaderTechnology(ReaderTechnologyEnum readerTechnology) {
    this.readerTechnology = readerTechnology;
  }

  public ReaderDevice readerDirection(ReaderDirectionEnum readerDirection) {
    this.readerDirection = readerDirection;
    return this;
  }

   /**
   * Get readerDirection
   * @return readerDirection
  **/
  @Schema(description  = "")
  public ReaderDirectionEnum getReaderDirection() {
    return readerDirection;
  }

  public void setReaderDirection(ReaderDirectionEnum readerDirection) {
    this.readerDirection = readerDirection;
  }

  public ReaderDevice biometricManufacturer(BiometricManufacturerEnum biometricManufacturer) {
    this.biometricManufacturer = biometricManufacturer;
    return this;
  }

   /**
   * Get biometricManufacturer
   * @return biometricManufacturer
  **/
  @Schema(description  = "")
  public BiometricManufacturerEnum getBiometricManufacturer() {
    return biometricManufacturer;
  }

  public void setBiometricManufacturer(BiometricManufacturerEnum biometricManufacturer) {
    this.biometricManufacturer = biometricManufacturer;
  }

  public ReaderDevice biometricValidation(BiometricValidationEnum biometricValidation) {
    this.biometricValidation = biometricValidation;
    return this;
  }

   /**
   * Get biometricValidation
   * @return biometricValidation
  **/
  @Schema(description  = "")
  public BiometricValidationEnum getBiometricValidation() {
    return biometricValidation;
  }

  public void setBiometricValidation(BiometricValidationEnum biometricValidation) {
    this.biometricValidation = biometricValidation;
  }

  public ReaderDevice biometricSecurityLevel(Integer biometricSecurityLevel) {
    this.biometricSecurityLevel = biometricSecurityLevel;
    return this;
  }

   /**
   * Nível de conferência
   * @return biometricSecurityLevel
  **/
  @Schema(description  = "Nível de conferência")
  public Integer getBiometricSecurityLevel() {
    return biometricSecurityLevel;
  }

  public void setBiometricSecurityLevel(Integer biometricSecurityLevel) {
    this.biometricSecurityLevel = biometricSecurityLevel;
  }

  public ReaderDevice biometricReaderId(Long biometricReaderId) {
    this.biometricReaderId = biometricReaderId;
    return this;
  }

   /**
   * Leitora biométrica que será utilizado por este leitor para validar a biometria 1:1
   * @return biometricReaderId
  **/
  @Schema(description  = "Leitora biométrica que será utilizado por este leitor para validar a biometria 1:1")
  public Long getBiometricReaderId() {
    return biometricReaderId;
  }

  public void setBiometricReaderId(Long biometricReaderId) {
    this.biometricReaderId = biometricReaderId;
  }

  public ReaderDevice physicalAddress(Integer physicalAddress) {
    this.physicalAddress = physicalAddress;
    return this;
  }

   /**
   * Endereço
   * @return physicalAddress
  **/
  @Schema(description  = "Endereço")
  public Integer getPhysicalAddress() {
    return physicalAddress;
  }

  public void setPhysicalAddress(Integer physicalAddress) {
    this.physicalAddress = physicalAddress;
  }

  public ReaderDevice areaLeaving(Long areaLeaving) {
    this.areaLeaving = areaLeaving;
    return this;
  }

   /**
   * Local físico de origem
   * @return areaLeaving
  **/
  @Schema(description  = "Local físico de origem")
  public Long getAreaLeaving() {
    return areaLeaving;
  }

  public void setAreaLeaving(Long areaLeaving) {
    this.areaLeaving = areaLeaving;
  }

  public ReaderDevice areaEntering(Long areaEntering) {
    this.areaEntering = areaEntering;
    return this;
  }

   /**
   * Local físico de destino
   * @return areaEntering
  **/
  @Schema(description  = "Local físico de destino")
  public Long getAreaEntering() {
    return areaEntering;
  }

  public void setAreaEntering(Long areaEntering) {
    this.areaEntering = areaEntering;
  }

  public ReaderDevice cardFormatList(List<Long> cardFormatList) {
    this.cardFormatList = cardFormatList;
    return this;
  }

  public ReaderDevice addCardFormatListItem(Long cardFormatListItem) {
    if (this.cardFormatList == null) {
      this.cardFormatList = new ArrayList<Long>();
    }
    this.cardFormatList.add(cardFormatListItem);
    return this;
  }

   /**
   * Lista de formato de cartão
   * @return cardFormatList
  **/
  @Schema(description  = "Lista de formato de cartão")
  public List<Long> getCardFormatList() {
    return cardFormatList;
  }

  public void setCardFormatList(List<Long> cardFormatList) {
    this.cardFormatList = cardFormatList;
  }

  public ReaderDevice strikeTime(Integer strikeTime) {
    this.strikeTime = strikeTime;
    return this;
  }

   /**
   * Tempo
   * @return strikeTime
  **/
  @Schema(description  = "Tempo")
  public Integer getStrikeTime() {
    return strikeTime;
  }

  public void setStrikeTime(Integer strikeTime) {
    this.strikeTime = strikeTime;
  }

  public ReaderDevice heldOpenTime(Integer heldOpenTime) {
    this.heldOpenTime = heldOpenTime;
    return this;
  }

   /**
   * Tempo aberto
   * @return heldOpenTime
  **/
  @Schema(description  = "Tempo aberto")
  public Integer getHeldOpenTime() {
    return heldOpenTime;
  }

  public void setHeldOpenTime(Integer heldOpenTime) {
    this.heldOpenTime = heldOpenTime;
  }

  public ReaderDevice offlineMode(OfflineModeEnum offlineMode) {
    this.offlineMode = offlineMode;
    return this;
  }

   /**
   * Get offlineMode
   * @return offlineMode
  **/
  @Schema(description  = "")
  public OfflineModeEnum getOfflineMode() {
    return offlineMode;
  }

  public void setOfflineMode(OfflineModeEnum offlineMode) {
    this.offlineMode = offlineMode;
  }

  public ReaderDevice accessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @Schema(description  = "")
  public AccessModeEnum getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }

  public ReaderDevice antiPassbackTime(Integer antiPassbackTime) {
    this.antiPassbackTime = antiPassbackTime;
    return this;
  }

   /**
   * É o tempo mínimo de acesso para o mesmo destino, a fim de evitar que duas pessoas utilizem o mesmo cartão para acessar o mesmo local
   * @return antiPassbackTime
  **/
  @Schema(description  = "É o tempo mínimo de acesso para o mesmo destino, a fim de evitar que duas pessoas utilizem o mesmo cartão para acessar o mesmo local")
  public Integer getAntiPassbackTime() {
    return antiPassbackTime;
  }

  public void setAntiPassbackTime(Integer antiPassbackTime) {
    this.antiPassbackTime = antiPassbackTime;
  }

  public ReaderDevice enablePairing(Boolean enablePairing) {
    this.enablePairing = enablePairing;
    return this;
  }

   /**
   * Ativa o emparelhamento
   * @return enablePairing
  **/
  @Schema(description  = "Ativa o emparelhamento")
  public Boolean isEnablePairing() {
    return enablePairing;
  }

  public void setEnablePairing(Boolean enablePairing) {
    this.enablePairing = enablePairing;
  }

  public ReaderDevice validateVehicle(Boolean validateVehicle) {
    this.validateVehicle = validateVehicle;
    return this;
  }

   /**
   * Valida veículo
   * @return validateVehicle
  **/
  @Schema(description  = "Valida veículo")
  public Boolean isValidateVehicle() {
    return validateVehicle;
  }

  public void setValidateVehicle(Boolean validateVehicle) {
    this.validateVehicle = validateVehicle;
  }

  public ReaderDevice activations(List<ReaderActivation> activations) {
    this.activations = activations;
    return this;
  }

  public ReaderDevice addActivationsItem(ReaderActivation activationsItem) {
    if (this.activations == null) {
      this.activations = new ArrayList<ReaderActivation>();
    }
    this.activations.add(activationsItem);
    return this;
  }

   /**
   * Leitoras ativas
   * @return activations
  **/
  @Schema(description  = "Leitoras ativas")
  public List<ReaderActivation> getActivations() {
    return activations;
  }

  public void setActivations(List<ReaderActivation> activations) {
    this.activations = activations;
  }

  public ReaderDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
    return this;
  }

   /**
   * Get extensibleConfiguration
   * @return extensibleConfiguration
  **/
  @Schema(description  = "")
  public ExtensibleConfiguration getExtensibleConfiguration() {
    return extensibleConfiguration;
  }

  public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
  }

  public ReaderDevice urnSensor(Long urnSensor) {
    this.urnSensor = urnSensor;
    return this;
  }

   /**
   * Identificador do sensor de urna
   * @return urnSensor
  **/
  @Schema(description  = "Identificador do sensor de urna")
  public Long getUrnSensor() {
    return urnSensor;
  }

  public void setUrnSensor(Long urnSensor) {
    this.urnSensor = urnSensor;
  }

  public ReaderDevice urnSensorTime(Integer urnSensorTime) {
    this.urnSensorTime = urnSensorTime;
    return this;
  }

   /**
   * Tempo sensor urna
   * @return urnSensorTime
  **/
  @Schema(description  = "Tempo sensor urna")
  public Integer getUrnSensorTime() {
    return urnSensorTime;
  }

  public void setUrnSensorTime(Integer urnSensorTime) {
    this.urnSensorTime = urnSensorTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderDevice readerDevice = (ReaderDevice) o;
    return Objects.equals(this.id, readerDevice.id) &&
        Objects.equals(this.areaId, readerDevice.areaId) &&
        Objects.equals(this.output, readerDevice.output) &&
        Objects.equals(this.intput, readerDevice.intput) &&
        Objects.equals(this.readerTechnology, readerDevice.readerTechnology) &&
        Objects.equals(this.readerDirection, readerDevice.readerDirection) &&
        Objects.equals(this.biometricManufacturer, readerDevice.biometricManufacturer) &&
        Objects.equals(this.biometricValidation, readerDevice.biometricValidation) &&
        Objects.equals(this.biometricSecurityLevel, readerDevice.biometricSecurityLevel) &&
        Objects.equals(this.biometricReaderId, readerDevice.biometricReaderId) &&
        Objects.equals(this.physicalAddress, readerDevice.physicalAddress) &&
        Objects.equals(this.areaLeaving, readerDevice.areaLeaving) &&
        Objects.equals(this.areaEntering, readerDevice.areaEntering) &&
        Objects.equals(this.cardFormatList, readerDevice.cardFormatList) &&
        Objects.equals(this.strikeTime, readerDevice.strikeTime) &&
        Objects.equals(this.heldOpenTime, readerDevice.heldOpenTime) &&
        Objects.equals(this.offlineMode, readerDevice.offlineMode) &&
        Objects.equals(this.accessMode, readerDevice.accessMode) &&
        Objects.equals(this.antiPassbackTime, readerDevice.antiPassbackTime) &&
        Objects.equals(this.enablePairing, readerDevice.enablePairing) &&
        Objects.equals(this.validateVehicle, readerDevice.validateVehicle) &&
        Objects.equals(this.activations, readerDevice.activations) &&
        Objects.equals(this.extensibleConfiguration, readerDevice.extensibleConfiguration) &&
        Objects.equals(this.urnSensor, readerDevice.urnSensor) &&
        Objects.equals(this.urnSensorTime, readerDevice.urnSensorTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, areaId, output, intput, readerTechnology, readerDirection, biometricManufacturer, biometricValidation, biometricSecurityLevel, biometricReaderId, physicalAddress, areaLeaving, areaEntering, cardFormatList, strikeTime, heldOpenTime, offlineMode, accessMode, antiPassbackTime, enablePairing, validateVehicle, activations, extensibleConfiguration, urnSensor, urnSensorTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderDevice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    intput: ").append(toIndentedString(intput)).append("\n");
    sb.append("    readerTechnology: ").append(toIndentedString(readerTechnology)).append("\n");
    sb.append("    readerDirection: ").append(toIndentedString(readerDirection)).append("\n");
    sb.append("    biometricManufacturer: ").append(toIndentedString(biometricManufacturer)).append("\n");
    sb.append("    biometricValidation: ").append(toIndentedString(biometricValidation)).append("\n");
    sb.append("    biometricSecurityLevel: ").append(toIndentedString(biometricSecurityLevel)).append("\n");
    sb.append("    biometricReaderId: ").append(toIndentedString(biometricReaderId)).append("\n");
    sb.append("    physicalAddress: ").append(toIndentedString(physicalAddress)).append("\n");
    sb.append("    areaLeaving: ").append(toIndentedString(areaLeaving)).append("\n");
    sb.append("    areaEntering: ").append(toIndentedString(areaEntering)).append("\n");
    sb.append("    cardFormatList: ").append(toIndentedString(cardFormatList)).append("\n");
    sb.append("    strikeTime: ").append(toIndentedString(strikeTime)).append("\n");
    sb.append("    heldOpenTime: ").append(toIndentedString(heldOpenTime)).append("\n");
    sb.append("    offlineMode: ").append(toIndentedString(offlineMode)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    antiPassbackTime: ").append(toIndentedString(antiPassbackTime)).append("\n");
    sb.append("    enablePairing: ").append(toIndentedString(enablePairing)).append("\n");
    sb.append("    validateVehicle: ").append(toIndentedString(validateVehicle)).append("\n");
    sb.append("    activations: ").append(toIndentedString(activations)).append("\n");
    sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
    sb.append("    urnSensor: ").append(toIndentedString(urnSensor)).append("\n");
    sb.append("    urnSensorTime: ").append(toIndentedString(urnSensorTime)).append("\n");
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
