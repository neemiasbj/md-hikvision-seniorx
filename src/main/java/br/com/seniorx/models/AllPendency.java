<<<<<<< HEAD
/*      */ package br.com.seniorx.models;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import java.util.Objects;

/*      */ 
/*      */ import com.google.gson.annotations.SerializedName;

/*      */ import io.swagger.v3.oas.annotations.media.Schema;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class AllPendency
/*      */ {
/*      */   @SerializedName("deviceStatus")
/*   17 */   private List<DevicePendency> deviceStatus = null;
/*      */   
/*      */   @SerializedName("deviceDateTime")
/*   20 */   private List<DevicePendency> deviceDateTime = null;
/*      */   
/*      */   @SerializedName("resetDevice")
/*   23 */   private List<DevicePendency> resetDevice = null;
/*      */   
/*      */   @SerializedName("blockDevice")
/*   26 */   private List<BlockDevicePendency> blockDevice = null;
/*      */   
/*      */   @SerializedName("unblockDevice")
/*   29 */   private List<UnblockDevicePendency> unblockDevice = null;
/*      */   
/*      */   @SerializedName("setDeviceEmergency")
/*   32 */   private List<SetDeviceEmergencyPendency> setDeviceEmergency = null;
/*      */   
/*      */   @SerializedName("unsetDeviceEmergency")
/*   35 */   private List<UnsetDeviceEmergencyPendency> unsetDeviceEmergency = null;
/*      */   
/*      */   @SerializedName("apolloIncludeCard")
/*   38 */   private List<ApolloIncludeCardPendency> apolloIncludeCard = null;
/*      */   
/*      */   @SerializedName("apolloExcludeCard")
/*   41 */   private List<ApolloExcludeCardPendency> apolloExcludeCard = null;
/*      */   
/*      */   @SerializedName("includeBiometry")
/*   44 */   private List<IncludeBiometryPendency> includeBiometry = null;
/*      */   
/*      */   @SerializedName("excludeBiometry")
/*   47 */   private List<ExcludeBiometryPendency> excludeBiometry = null;
/*      */   
/*      */   @SerializedName("device")
/*   50 */   private List<DeviceUpdatedPendency> device = null;
/*      */   
/*      */   @SerializedName("loadHolidayList")
/*   53 */   private List<LoadHolidayListPendency> loadHolidayList = null;
/*      */   
/*      */   @SerializedName("removeHolidayList")
/*   56 */   private List<DevicePendency> removeHolidayList = null;
/*      */   
/*      */   @SerializedName("activateDeviceOutput")
/*   59 */   private List<ActiveDeviceOutputPendency> activateDeviceOutput = null;
/*      */   
/*      */   @SerializedName("deactivateDeviceOutput")
/*   62 */   private List<DeactiveDeviceOutputPendency> deactivateDeviceOutput = null;
/*      */   
/*      */   @SerializedName("datamartUpdated")
/*   65 */   private List<DatamartUpdatedPendency> datamartUpdated = null;
/*      */   
/*      */   @SerializedName("personLocationUpdated")
/*   68 */   private List<PersonAreaUpdatedPendency> personLocationUpdated = null;
/*      */   
/*      */   @SerializedName("collectEvent")
/*   71 */   private List<CollectEventPendency> collectEvent = null;
/*      */   
/*      */   @SerializedName("inputStatus")
/*   74 */   private List<DevicePendency> inputStatus = null;
/*      */   
/*      */   @SerializedName("manufacturerUpdated")
/*   77 */   private List<ManufacturerUpdatedPendency> manufacturerUpdated = null;
/*      */   
/*      */   @SerializedName("updatePersonREP")
/*   80 */   private List<UpdatePersonREPPendency> updatePersonREP = null;
/*      */   
/*      */   @SerializedName("loadAllowCardList")
/*   83 */   private List<DevicePendency> loadAllowCardList = null;
/*      */   
/*      */   @SerializedName("removeAllowCardList")
/*   86 */   private List<DevicePendency> removeAllowCardList = null;
/*      */   
/*      */   @SerializedName("loadBiometryList")
/*   89 */   private List<DevicePendency> loadBiometryList = null;
/*      */   
/*      */   @SerializedName("removeBiometryList")
/*   92 */   private List<DevicePendency> removeBiometryList = null;
/*      */   
/*      */   @SerializedName("includeCard")
/*   95 */   private List<IncludeCardPendency> includeCard = null;
/*      */   
/*      */   @SerializedName("excludeCard")
/*   98 */   private List<ExcludeCardPendency> excludeCard = null;
/*      */   
/*      */   @SerializedName("deviceDisplayMessage")
/*  101 */   private List<DeviceDisplayMessagePendency> deviceDisplayMessage = null;
/*      */   
/*      */   @SerializedName("updateFirmware")
/*  104 */   private List<DevicePendency> updateFirmware = null;
/*      */   
/*      */   @SerializedName("includePhoto")
/*  107 */   private List<IncludePhotoPendency> includePhoto = null;
/*      */   
/*      */   @SerializedName("excludePhoto")
/*  110 */   private List<ExcludePhotoPendency> excludePhoto = null;
/*      */   
/*      */   @SerializedName("loadCredentialFacialList")
/*  113 */   private List<DevicePendency> loadCredentialFacialList = null;
/*      */   
/*      */   public AllPendency deviceStatus(List<DevicePendency> deviceStatus) {
/*  116 */     this.deviceStatus = deviceStatus;
/*  117 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addDeviceStatusItem(DevicePendency deviceStatusItem) {
/*  121 */     if (this.deviceStatus == null) {
/*  122 */       this.deviceStatus = new ArrayList<>();
/*      */     }
/*  124 */     this.deviceStatus.add(deviceStatusItem);
/*  125 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Requisição de status do dispositivo")
/*      */   public List<DevicePendency> getDeviceStatus() {
/*  135 */     return this.deviceStatus;
/*      */   }
/*      */   
/*      */   public void setDeviceStatus(List<DevicePendency> deviceStatus) {
/*  139 */     this.deviceStatus = deviceStatus;
/*      */   }
/*      */   
/*      */   public AllPendency deviceDateTime(List<DevicePendency> deviceDateTime) {
/*  143 */     this.deviceDateTime = deviceDateTime;
/*  144 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addDeviceDateTimeItem(DevicePendency deviceDateTimeItem) {
/*  148 */     if (this.deviceDateTime == null) {
/*  149 */       this.deviceDateTime = new ArrayList<>();
/*      */     }
/*  151 */     this.deviceDateTime.add(deviceDateTimeItem);
/*  152 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Indica que deve ser atualizada a data/hora do dispositivo")
/*      */   public List<DevicePendency> getDeviceDateTime() {
/*  162 */     return this.deviceDateTime;
/*      */   }
/*      */   
/*      */   public void setDeviceDateTime(List<DevicePendency> deviceDateTime) {
/*  166 */     this.deviceDateTime = deviceDateTime;
/*      */   }
/*      */   
/*      */   public AllPendency resetDevice(List<DevicePendency> resetDevice) {
/*  170 */     this.resetDevice = resetDevice;
/*  171 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addResetDeviceItem(DevicePendency resetDeviceItem) {
/*  175 */     if (this.resetDevice == null) {
/*  176 */       this.resetDevice = new ArrayList<>();
/*      */     }
/*  178 */     this.resetDevice.add(resetDeviceItem);
/*  179 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Dados armazenados no dispositivo devem ser resetados")
/*      */   public List<DevicePendency> getResetDevice() {
/*  189 */     return this.resetDevice;
/*      */   }
/*      */   
/*      */   public void setResetDevice(List<DevicePendency> resetDevice) {
/*  193 */     this.resetDevice = resetDevice;
/*      */   }
/*      */   
/*      */   public AllPendency blockDevice(List<BlockDevicePendency> blockDevice) {
/*  197 */     this.blockDevice = blockDevice;
/*  198 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addBlockDeviceItem(BlockDevicePendency blockDeviceItem) {
/*  202 */     if (this.blockDevice == null) {
/*  203 */       this.blockDevice = new ArrayList<>();
/*      */     }
/*  205 */     this.blockDevice.add(blockDeviceItem);
/*  206 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Dispositivo deve ser bloqueado")
/*      */   public List<BlockDevicePendency> getBlockDevice() {
/*  216 */     return this.blockDevice;
/*      */   }
/*      */   
/*      */   public void setBlockDevice(List<BlockDevicePendency> blockDevice) {
/*  220 */     this.blockDevice = blockDevice;
/*      */   }
/*      */   
/*      */   public AllPendency unblockDevice(List<UnblockDevicePendency> unblockDevice) {
/*  224 */     this.unblockDevice = unblockDevice;
/*  225 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addUnblockDeviceItem(UnblockDevicePendency unblockDeviceItem) {
/*  229 */     if (this.unblockDevice == null) {
/*  230 */       this.unblockDevice = new ArrayList<>();
/*      */     }
/*  232 */     this.unblockDevice.add(unblockDeviceItem);
/*  233 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Dispositivo deve ser desbloqueado")
/*      */   public List<UnblockDevicePendency> getUnblockDevice() {
/*  243 */     return this.unblockDevice;
/*      */   }
/*      */   
/*      */   public void setUnblockDevice(List<UnblockDevicePendency> unblockDevice) {
/*  247 */     this.unblockDevice = unblockDevice;
/*      */   }
/*      */   
/*      */   public AllPendency setDeviceEmergency(List<SetDeviceEmergencyPendency> setDeviceEmergency) {
/*  251 */     this.setDeviceEmergency = setDeviceEmergency;
/*  252 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addSetDeviceEmergencyItem(SetDeviceEmergencyPendency setDeviceEmergencyItem) {
/*  256 */     if (this.setDeviceEmergency == null) {
/*  257 */       this.setDeviceEmergency = new ArrayList<>();
/*      */     }
/*  259 */     this.setDeviceEmergency.add(setDeviceEmergencyItem);
/*  260 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Dispositivo deve entrar no modo de emergência")
/*      */   public List<SetDeviceEmergencyPendency> getSetDeviceEmergency() {
/*  270 */     return this.setDeviceEmergency;
/*      */   }
/*      */   
/*      */   public void setSetDeviceEmergency(List<SetDeviceEmergencyPendency> setDeviceEmergency) {
/*  274 */     this.setDeviceEmergency = setDeviceEmergency;
/*      */   }
/*      */   
/*      */   public AllPendency unsetDeviceEmergency(List<UnsetDeviceEmergencyPendency> unsetDeviceEmergency) {
/*  278 */     this.unsetDeviceEmergency = unsetDeviceEmergency;
/*  279 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addUnsetDeviceEmergencyItem(UnsetDeviceEmergencyPendency unsetDeviceEmergencyItem) {
/*  283 */     if (this.unsetDeviceEmergency == null) {
/*  284 */       this.unsetDeviceEmergency = new ArrayList<>();
/*      */     }
/*  286 */     this.unsetDeviceEmergency.add(unsetDeviceEmergencyItem);
/*  287 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Dispositivo deve sair do modo de emergência")
/*      */   public List<UnsetDeviceEmergencyPendency> getUnsetDeviceEmergency() {
/*  297 */     return this.unsetDeviceEmergency;
/*      */   }
/*      */   
/*      */   public void setUnsetDeviceEmergency(List<UnsetDeviceEmergencyPendency> unsetDeviceEmergency) {
/*  301 */     this.unsetDeviceEmergency = unsetDeviceEmergency;
/*      */   }
/*      */   
/*      */   public AllPendency apolloIncludeCard(List<ApolloIncludeCardPendency> apolloIncludeCard) {
/*  305 */     this.apolloIncludeCard = apolloIncludeCard;
/*  306 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addApolloIncludeCardItem(ApolloIncludeCardPendency apolloIncludeCardItem) {
/*  310 */     if (this.apolloIncludeCard == null) {
/*  311 */       this.apolloIncludeCard = new ArrayList<>();
/*      */     }
/*  313 */     this.apolloIncludeCard.add(apolloIncludeCardItem);
/*  314 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir um cartão no dispositivo Apollo")
/*      */   public List<ApolloIncludeCardPendency> getApolloIncludeCard() {
/*  324 */     return this.apolloIncludeCard;
/*      */   }
/*      */   
/*      */   public void setApolloIncludeCard(List<ApolloIncludeCardPendency> apolloIncludeCard) {
/*  328 */     this.apolloIncludeCard = apolloIncludeCard;
/*      */   }
/*      */   
/*      */   public AllPendency apolloExcludeCard(List<ApolloExcludeCardPendency> apolloExcludeCard) {
/*  332 */     this.apolloExcludeCard = apolloExcludeCard;
/*  333 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addApolloExcludeCardItem(ApolloExcludeCardPendency apolloExcludeCardItem) {
/*  337 */     if (this.apolloExcludeCard == null) {
/*  338 */       this.apolloExcludeCard = new ArrayList<>();
/*      */     }
/*  340 */     this.apolloExcludeCard.add(apolloExcludeCardItem);
/*  341 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Excluir um cartão no dispositivo Apollo")
/*      */   public List<ApolloExcludeCardPendency> getApolloExcludeCard() {
/*  351 */     return this.apolloExcludeCard;
/*      */   }
/*      */   
/*      */   public void setApolloExcludeCard(List<ApolloExcludeCardPendency> apolloExcludeCard) {
/*  355 */     this.apolloExcludeCard = apolloExcludeCard;
/*      */   }
/*      */   
/*      */   public AllPendency includeBiometry(List<IncludeBiometryPendency> includeBiometry) {
/*  359 */     this.includeBiometry = includeBiometry;
/*  360 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addIncludeBiometryItem(IncludeBiometryPendency includeBiometryItem) {
/*  364 */     if (this.includeBiometry == null) {
/*  365 */       this.includeBiometry = new ArrayList<>();
/*      */     }
/*  367 */     this.includeBiometry.add(includeBiometryItem);
/*  368 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir biometria")
/*      */   public List<IncludeBiometryPendency> getIncludeBiometry() {
/*  378 */     return this.includeBiometry;
/*      */   }
/*      */   
/*      */   public void setIncludeBiometry(List<IncludeBiometryPendency> includeBiometry) {
/*  382 */     this.includeBiometry = includeBiometry;
/*      */   }
/*      */   
/*      */   public AllPendency excludeBiometry(List<ExcludeBiometryPendency> excludeBiometry) {
/*  386 */     this.excludeBiometry = excludeBiometry;
/*  387 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addExcludeBiometryItem(ExcludeBiometryPendency excludeBiometryItem) {
/*  391 */     if (this.excludeBiometry == null) {
/*  392 */       this.excludeBiometry = new ArrayList<>();
/*      */     }
/*  394 */     this.excludeBiometry.add(excludeBiometryItem);
/*  395 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Excluir biometria ")
/*      */   public List<ExcludeBiometryPendency> getExcludeBiometry() {
/*  405 */     return this.excludeBiometry;
/*      */   }
/*      */   
/*      */   public void setExcludeBiometry(List<ExcludeBiometryPendency> excludeBiometry) {
/*  409 */     this.excludeBiometry = excludeBiometry;
/*      */   }
/*      */   
/*      */   public AllPendency device(List<DeviceUpdatedPendency> device) {
/*  413 */     this.device = device;
/*  414 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addDeviceItem(DeviceUpdatedPendency deviceItem) {
/*  418 */     if (this.device == null) {
/*  419 */       this.device = new ArrayList<>();
/*      */     }
/*  421 */     this.device.add(deviceItem);
/*  422 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "A configuração do dispositivo sofreu alguma alteração ou o dispositivo precisa ser configurado")
/*      */   public List<DeviceUpdatedPendency> getDevice() {
/*  433 */     return this.device;
/*      */   }
/*      */   
/*      */   public void setDevice(List<DeviceUpdatedPendency> device) {
/*  437 */     this.device = device;
/*      */   }
/*      */   
/*      */   public AllPendency loadHolidayList(List<LoadHolidayListPendency> loadHolidayList) {
/*  441 */     this.loadHolidayList = loadHolidayList;
/*  442 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addLoadHolidayListItem(LoadHolidayListPendency loadHolidayListItem) {
/*  446 */     if (this.loadHolidayList == null) {
/*  447 */       this.loadHolidayList = new ArrayList<>();
/*      */     }
/*  449 */     this.loadHolidayList.add(loadHolidayListItem);
/*  450 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Carregar a lista de feriados no dispositivo")
/*      */   public List<LoadHolidayListPendency> getLoadHolidayList() {
/*  460 */     return this.loadHolidayList;
/*      */   }
/*      */   
/*      */   public void setLoadHolidayList(List<LoadHolidayListPendency> loadHolidayList) {
/*  464 */     this.loadHolidayList = loadHolidayList;
/*      */   }
/*      */   
/*      */   public AllPendency removeHolidayList(List<DevicePendency> removeHolidayList) {
/*  468 */     this.removeHolidayList = removeHolidayList;
/*  469 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addRemoveHolidayListItem(DevicePendency removeHolidayListItem) {
/*  473 */     if (this.removeHolidayList == null) {
/*  474 */       this.removeHolidayList = new ArrayList<>();
/*      */     }
/*  476 */     this.removeHolidayList.add(removeHolidayListItem);
/*  477 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Remover a lista de feriados do dispositivo")
/*      */   public List<DevicePendency> getRemoveHolidayList() {
/*  487 */     return this.removeHolidayList;
/*      */   }
/*      */   
/*      */   public void setRemoveHolidayList(List<DevicePendency> removeHolidayList) {
/*  491 */     this.removeHolidayList = removeHolidayList;
/*      */   }
/*      */   
/*      */   public AllPendency activateDeviceOutput(List<ActiveDeviceOutputPendency> activateDeviceOutput) {
/*  495 */     this.activateDeviceOutput = activateDeviceOutput;
/*  496 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addActivateDeviceOutputItem(ActiveDeviceOutputPendency activateDeviceOutputItem) {
/*  500 */     if (this.activateDeviceOutput == null) {
/*  501 */       this.activateDeviceOutput = new ArrayList<>();
/*      */     }
/*  503 */     this.activateDeviceOutput.add(activateDeviceOutputItem);
/*  504 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Ativar uma saída digital do dispositivo")
/*      */   public List<ActiveDeviceOutputPendency> getActivateDeviceOutput() {
/*  514 */     return this.activateDeviceOutput;
/*      */   }
/*      */   
/*      */   public void setActivateDeviceOutput(List<ActiveDeviceOutputPendency> activateDeviceOutput) {
/*  518 */     this.activateDeviceOutput = activateDeviceOutput;
/*      */   }
/*      */   
/*      */   public AllPendency deactivateDeviceOutput(List<DeactiveDeviceOutputPendency> deactivateDeviceOutput) {
/*  522 */     this.deactivateDeviceOutput = deactivateDeviceOutput;
/*  523 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addDeactivateDeviceOutputItem(DeactiveDeviceOutputPendency deactivateDeviceOutputItem) {
/*  527 */     if (this.deactivateDeviceOutput == null) {
/*  528 */       this.deactivateDeviceOutput = new ArrayList<>();
/*      */     }
/*  530 */     this.deactivateDeviceOutput.add(deactivateDeviceOutputItem);
/*  531 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Desativar uma saída digital do dispositivo")
/*      */   public List<DeactiveDeviceOutputPendency> getDeactivateDeviceOutput() {
/*  541 */     return this.deactivateDeviceOutput;
/*      */   }
/*      */   
/*      */   public void setDeactivateDeviceOutput(List<DeactiveDeviceOutputPendency> deactivateDeviceOutput) {
/*  545 */     this.deactivateDeviceOutput = deactivateDeviceOutput;
/*      */   }
/*      */   
/*      */   public AllPendency datamartUpdated(List<DatamartUpdatedPendency> datamartUpdated) {
/*  549 */     this.datamartUpdated = datamartUpdated;
/*  550 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addDatamartUpdatedItem(DatamartUpdatedPendency datamartUpdatedItem) {
/*  554 */     if (this.datamartUpdated == null) {
/*  555 */       this.datamartUpdated = new ArrayList<>();
/*      */     }
/*  557 */     this.datamartUpdated.add(datamartUpdatedItem);
/*  558 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Datamart atualizado")
/*      */   public List<DatamartUpdatedPendency> getDatamartUpdated() {
/*  568 */     return this.datamartUpdated;
/*      */   }
/*      */   
/*      */   public void setDatamartUpdated(List<DatamartUpdatedPendency> datamartUpdated) {
/*  572 */     this.datamartUpdated = datamartUpdated;
/*      */   }
/*      */   
/*      */   public AllPendency personLocationUpdated(List<PersonAreaUpdatedPendency> personLocationUpdated) {
/*  576 */     this.personLocationUpdated = personLocationUpdated;
/*  577 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addPersonLocationUpdatedItem(PersonAreaUpdatedPendency personLocationUpdatedItem) {
/*  581 */     if (this.personLocationUpdated == null) {
/*  582 */       this.personLocationUpdated = new ArrayList<>();
/*      */     }
/*  584 */     this.personLocationUpdated.add(personLocationUpdatedItem);
/*  585 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Atualiza o local físico da pessoa")
/*      */   public List<PersonAreaUpdatedPendency> getPersonLocationUpdated() {
/*  595 */     return this.personLocationUpdated;
/*      */   }
/*      */   
/*      */   public void setPersonLocationUpdated(List<PersonAreaUpdatedPendency> personLocationUpdated) {
/*  599 */     this.personLocationUpdated = personLocationUpdated;
/*      */   }
/*      */   
/*      */   public AllPendency collectEvent(List<CollectEventPendency> collectEvent) {
/*  603 */     this.collectEvent = collectEvent;
/*  604 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addCollectEventItem(CollectEventPendency collectEventItem) {
/*  608 */     if (this.collectEvent == null) {
/*  609 */       this.collectEvent = new ArrayList<>();
/*      */     }
/*  611 */     this.collectEvent.add(collectEventItem);
/*  612 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Realizar a coleta de eventos de um dispositivo. ")
/*      */   public List<CollectEventPendency> getCollectEvent() {
/*  622 */     return this.collectEvent;
/*      */   }
/*      */   
/*      */   public void setCollectEvent(List<CollectEventPendency> collectEvent) {
/*  626 */     this.collectEvent = collectEvent;
/*      */   }
/*      */   
/*      */   public AllPendency inputStatus(List<DevicePendency> inputStatus) {
/*  630 */     this.inputStatus = inputStatus;
/*  631 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addInputStatusItem(DevicePendency inputStatusItem) {
/*  635 */     if (this.inputStatus == null) {
/*  636 */       this.inputStatus = new ArrayList<>();
/*      */     }
/*  638 */     this.inputStatus.add(inputStatusItem);
/*  639 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Verificar o status da uma entrada")
/*      */   public List<DevicePendency> getInputStatus() {
/*  649 */     return this.inputStatus;
/*      */   }
/*      */   
/*      */   public void setInputStatus(List<DevicePendency> inputStatus) {
/*  653 */     this.inputStatus = inputStatus;
/*      */   }
/*      */   
/*      */   public AllPendency manufacturerUpdated(List<ManufacturerUpdatedPendency> manufacturerUpdated) {
/*  657 */     this.manufacturerUpdated = manufacturerUpdated;
/*  658 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addManufacturerUpdatedItem(ManufacturerUpdatedPendency manufacturerUpdatedItem) {
/*  662 */     if (this.manufacturerUpdated == null) {
/*  663 */       this.manufacturerUpdated = new ArrayList<>();
/*      */     }
/*  665 */     this.manufacturerUpdated.add(manufacturerUpdatedItem);
/*  666 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Os dados da empresa do REP foram atualizados")
/*      */   public List<ManufacturerUpdatedPendency> getManufacturerUpdated() {
/*  676 */     return this.manufacturerUpdated;
/*      */   }
/*      */   
/*      */   public void setManufacturerUpdated(List<ManufacturerUpdatedPendency> manufacturerUpdated) {
/*  680 */     this.manufacturerUpdated = manufacturerUpdated;
/*      */   }
/*      */   
/*      */   public AllPendency updatePersonREP(List<UpdatePersonREPPendency> updatePersonREP) {
/*  684 */     this.updatePersonREP = updatePersonREP;
/*  685 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addUpdatePersonREPItem(UpdatePersonREPPendency updatePersonREPItem) {
/*  689 */     if (this.updatePersonREP == null) {
/*  690 */       this.updatePersonREP = new ArrayList<>();
/*      */     }
/*  692 */     this.updatePersonREP.add(updatePersonREPItem);
/*  693 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir uma pessoa no REP")
/*      */   public List<UpdatePersonREPPendency> getUpdatePersonREP() {
/*  703 */     return this.updatePersonREP;
/*      */   }
/*      */   
/*      */   public void setUpdatePersonREP(List<UpdatePersonREPPendency> updatePersonREP) {
/*  707 */     this.updatePersonREP = updatePersonREP;
/*      */   }
/*      */   
/*      */   public AllPendency loadAllowCardList(List<DevicePendency> loadAllowCardList) {
/*  711 */     this.loadAllowCardList = loadAllowCardList;
/*  712 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addLoadAllowCardListItem(DevicePendency loadAllowCardListItem) {
/*  716 */     if (this.loadAllowCardList == null) {
/*  717 */       this.loadAllowCardList = new ArrayList<>();
/*      */     }
/*  719 */     this.loadAllowCardList.add(loadAllowCardListItem);
/*  720 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Inclusão da lista de liberação")
/*      */   public List<DevicePendency> getLoadAllowCardList() {
/*  730 */     return this.loadAllowCardList;
/*      */   }
/*      */   
/*      */   public void setLoadAllowCardList(List<DevicePendency> loadAllowCardList) {
/*  734 */     this.loadAllowCardList = loadAllowCardList;
/*      */   }
/*      */   
/*      */   public AllPendency removeAllowCardList(List<DevicePendency> removeAllowCardList) {
/*  738 */     this.removeAllowCardList = removeAllowCardList;
/*  739 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addRemoveAllowCardListItem(DevicePendency removeAllowCardListItem) {
/*  743 */     if (this.removeAllowCardList == null) {
/*  744 */       this.removeAllowCardList = new ArrayList<>();
/*      */     }
/*  746 */     this.removeAllowCardList.add(removeAllowCardListItem);
/*  747 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Remover a lista de liberação do dispositivo")
/*      */   public List<DevicePendency> getRemoveAllowCardList() {
/*  757 */     return this.removeAllowCardList;
/*      */   }
/*      */   
/*      */   public void setRemoveAllowCardList(List<DevicePendency> removeAllowCardList) {
/*  761 */     this.removeAllowCardList = removeAllowCardList;
/*      */   }
/*      */   
/*      */   public AllPendency loadBiometryList(List<DevicePendency> loadBiometryList) {
/*  765 */     this.loadBiometryList = loadBiometryList;
/*  766 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addLoadBiometryListItem(DevicePendency loadBiometryListItem) {
/*  770 */     if (this.loadBiometryList == null) {
/*  771 */       this.loadBiometryList = new ArrayList<>();
/*      */     }
/*  773 */     this.loadBiometryList.add(loadBiometryListItem);
/*  774 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir uma lista de biometria no dispositivo ")
/*      */   public List<DevicePendency> getLoadBiometryList() {
/*  784 */     return this.loadBiometryList;
/*      */   }
/*      */   
/*      */   public void setLoadBiometryList(List<DevicePendency> loadBiometryList) {
/*  788 */     this.loadBiometryList = loadBiometryList;
/*      */   }
/*      */   
/*      */   public AllPendency removeBiometryList(List<DevicePendency> removeBiometryList) {
/*  792 */     this.removeBiometryList = removeBiometryList;
/*  793 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addRemoveBiometryListItem(DevicePendency removeBiometryListItem) {
/*  797 */     if (this.removeBiometryList == null) {
/*  798 */       this.removeBiometryList = new ArrayList<>();
/*      */     }
/*  800 */     this.removeBiometryList.add(removeBiometryListItem);
/*  801 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Remover da lista de biometria do dispositivo ")
/*      */   public List<DevicePendency> getRemoveBiometryList() {
/*  811 */     return this.removeBiometryList;
/*      */   }
/*      */   
/*      */   public void setRemoveBiometryList(List<DevicePendency> removeBiometryList) {
/*  815 */     this.removeBiometryList = removeBiometryList;
/*      */   }
/*      */   
/*      */   public AllPendency includeCard(List<IncludeCardPendency> includeCard) {
/*  819 */     this.includeCard = includeCard;
/*  820 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addIncludeCardItem(IncludeCardPendency includeCardItem) {
/*  824 */     if (this.includeCard == null) {
/*  825 */       this.includeCard = new ArrayList<>();
/*      */     }
/*  827 */     this.includeCard.add(includeCardItem);
/*  828 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir um cartão no dispositivo")
/*      */   public List<IncludeCardPendency> getIncludeCard() {
/*  838 */     return this.includeCard;
/*      */   }
/*      */   
/*      */   public void setIncludeCard(List<IncludeCardPendency> includeCard) {
/*  842 */     this.includeCard = includeCard;
/*      */   }
/*      */   
/*      */   public AllPendency excludeCard(List<ExcludeCardPendency> excludeCard) {
/*  846 */     this.excludeCard = excludeCard;
/*  847 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addExcludeCardItem(ExcludeCardPendency excludeCardItem) {
/*  851 */     if (this.excludeCard == null) {
/*  852 */       this.excludeCard = new ArrayList<>();
/*      */     }
/*  854 */     this.excludeCard.add(excludeCardItem);
/*  855 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Remover um cartão no dispositivo")
/*      */   public List<ExcludeCardPendency> getExcludeCard() {
/*  865 */     return this.excludeCard;
/*      */   }
/*      */   
/*      */   public void setExcludeCard(List<ExcludeCardPendency> excludeCard) {
/*  869 */     this.excludeCard = excludeCard;
/*      */   }
/*      */   
/*      */   public AllPendency deviceDisplayMessage(List<DeviceDisplayMessagePendency> deviceDisplayMessage) {
/*  873 */     this.deviceDisplayMessage = deviceDisplayMessage;
/*  874 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addDeviceDisplayMessageItem(DeviceDisplayMessagePendency deviceDisplayMessageItem) {
/*  878 */     if (this.deviceDisplayMessage == null) {
/*  879 */       this.deviceDisplayMessage = new ArrayList<>();
/*      */     }
/*  881 */     this.deviceDisplayMessage.add(deviceDisplayMessageItem);
/*  882 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Exibir mensagem no display do dispositivo")
/*      */   public List<DeviceDisplayMessagePendency> getDeviceDisplayMessage() {
/*  892 */     return this.deviceDisplayMessage;
/*      */   }
/*      */   
/*      */   public void setDeviceDisplayMessage(List<DeviceDisplayMessagePendency> deviceDisplayMessage) {
/*  896 */     this.deviceDisplayMessage = deviceDisplayMessage;
/*      */   }
/*      */   
/*      */   public AllPendency updateFirmware(List<DevicePendency> updateFirmware) {
/*  900 */     this.updateFirmware = updateFirmware;
/*  901 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addUpdateFirmwareItem(DevicePendency updateFirmwareItem) {
/*  905 */     if (this.updateFirmware == null) {
/*  906 */       this.updateFirmware = new ArrayList<>();
/*      */     }
/*  908 */     this.updateFirmware.add(updateFirmwareItem);
/*  909 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Atualização do firmware do dispositivo")
/*      */   public List<DevicePendency> getUpdateFirmware() {
/*  919 */     return this.updateFirmware;
/*      */   }
/*      */   
/*      */   public void setUpdateFirmware(List<DevicePendency> updateFirmware) {
/*  923 */     this.updateFirmware = updateFirmware;
/*      */   }
/*      */   
/*      */   public AllPendency includePhoto(List<IncludePhotoPendency> includePhoto) {
/*  927 */     this.includePhoto = includePhoto;
/*  928 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addIncludePhotoItem(IncludePhotoPendency includePhotoItem) {
/*  932 */     if (this.includePhoto == null) {
/*  933 */       this.includePhoto = new ArrayList<>();
/*      */     }
/*  935 */     this.includePhoto.add(includePhotoItem);
/*  936 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir foto no dispositivo para reconhecimento facial")
/*      */   public List<IncludePhotoPendency> getIncludePhoto() {
/*  946 */     return this.includePhoto;
/*      */   }
/*      */   
/*      */   public void setIncludePhoto(List<IncludePhotoPendency> includePhoto) {
/*  950 */     this.includePhoto = includePhoto;
/*      */   }
/*      */   
/*      */   public AllPendency excludePhoto(List<ExcludePhotoPendency> excludePhoto) {
/*  954 */     this.excludePhoto = excludePhoto;
/*  955 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addExcludePhotoItem(ExcludePhotoPendency excludePhotoItem) {
/*  959 */     if (this.excludePhoto == null) {
/*  960 */       this.excludePhoto = new ArrayList<>();
/*      */     }
/*  962 */     this.excludePhoto.add(excludePhotoItem);
/*  963 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Excluir foto do dispositivo")
/*      */   public List<ExcludePhotoPendency> getExcludePhoto() {
/*  973 */     return this.excludePhoto;
/*      */   }
/*      */   
/*      */   public void setExcludePhoto(List<ExcludePhotoPendency> excludePhoto) {
/*  977 */     this.excludePhoto = excludePhoto;
/*      */   }
/*      */   
/*      */   public AllPendency loadCredentialFacialList(List<DevicePendency> loadCredentialFacialList) {
/*  981 */     this.loadCredentialFacialList = loadCredentialFacialList;
/*  982 */     return this;
/*      */   }
/*      */   
/*      */   public AllPendency addLoadCredentialFacialListItem(DevicePendency loadCredentialFacialListItem) {
/*  986 */     if (this.loadCredentialFacialList == null) {
/*  987 */       this.loadCredentialFacialList = new ArrayList<>();
/*      */     }
/*  989 */     this.loadCredentialFacialList.add(loadCredentialFacialListItem);
/*  990 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Schema(description = "Incluir uma lista de credencial facial no dispositivo ")
/*      */   public List<DevicePendency> getLoadCredentialFacialList() {
/* 1000 */     return this.loadCredentialFacialList;
/*      */   }
/*      */   
/*      */   public void setLoadCredentialFacialList(List<DevicePendency> loadCredentialFacialList) {
/* 1004 */     this.loadCredentialFacialList = loadCredentialFacialList;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object o) {
/* 1009 */     if (this == o) {
/* 1010 */       return true;
/*      */     }
/* 1012 */     if (o == null || getClass() != o.getClass()) {
/* 1013 */       return false;
/*      */     }
/* 1015 */     AllPendency allPendency = (AllPendency)o;
/* 1016 */     return (Objects.equals(this.deviceStatus, allPendency.deviceStatus) && Objects.equals(this.deviceDateTime, allPendency.deviceDateTime) && Objects.equals(this.resetDevice, allPendency.resetDevice) && 
/* 1017 */       Objects.equals(this.blockDevice, allPendency.blockDevice) && Objects.equals(this.unblockDevice, allPendency.unblockDevice) && Objects.equals(this.setDeviceEmergency, allPendency.setDeviceEmergency) && 
/* 1018 */       Objects.equals(this.unsetDeviceEmergency, allPendency.unsetDeviceEmergency) && Objects.equals(this.apolloIncludeCard, allPendency.apolloIncludeCard) && Objects.equals(this.apolloExcludeCard, allPendency.apolloExcludeCard) && 
/* 1019 */       Objects.equals(this.includeBiometry, allPendency.includeBiometry) && Objects.equals(this.excludeBiometry, allPendency.excludeBiometry) && Objects.equals(this.device, allPendency.device) && 
/* 1020 */       Objects.equals(this.loadHolidayList, allPendency.loadHolidayList) && Objects.equals(this.removeHolidayList, allPendency.removeHolidayList) && Objects.equals(this.activateDeviceOutput, allPendency.activateDeviceOutput) && 
/* 1021 */       Objects.equals(this.deactivateDeviceOutput, allPendency.deactivateDeviceOutput) && Objects.equals(this.datamartUpdated, allPendency.datamartUpdated) && Objects.equals(this.personLocationUpdated, allPendency.personLocationUpdated) && 
/* 1022 */       Objects.equals(this.collectEvent, allPendency.collectEvent) && Objects.equals(this.inputStatus, allPendency.inputStatus) && Objects.equals(this.manufacturerUpdated, allPendency.manufacturerUpdated) && 
/* 1023 */       Objects.equals(this.updatePersonREP, allPendency.updatePersonREP) && Objects.equals(this.loadAllowCardList, allPendency.loadAllowCardList) && Objects.equals(this.removeAllowCardList, allPendency.removeAllowCardList) && 
/* 1024 */       Objects.equals(this.loadBiometryList, allPendency.loadBiometryList) && Objects.equals(this.removeBiometryList, allPendency.removeBiometryList) && Objects.equals(this.includeCard, allPendency.includeCard) && 
/* 1025 */       Objects.equals(this.excludeCard, allPendency.excludeCard) && Objects.equals(this.deviceDisplayMessage, allPendency.deviceDisplayMessage) && Objects.equals(this.updateFirmware, allPendency.updateFirmware) && 
/* 1026 */       Objects.equals(this.includePhoto, allPendency.includePhoto) && Objects.equals(this.excludePhoto, allPendency.excludePhoto) && Objects.equals(this.loadCredentialFacialList, allPendency.loadCredentialFacialList));
/*      */   }
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1031 */     return Objects.hash(new Object[] { this.deviceStatus, this.deviceDateTime, this.resetDevice, this.blockDevice, this.unblockDevice, this.setDeviceEmergency, this.unsetDeviceEmergency, this.apolloIncludeCard, this.apolloExcludeCard, this.includeBiometry, this.excludeBiometry, this.device, this.loadHolidayList, 
/* 1032 */           this.removeHolidayList, this.activateDeviceOutput, this.deactivateDeviceOutput, this.datamartUpdated, this.personLocationUpdated, this.collectEvent, this.inputStatus, this.manufacturerUpdated, this.updatePersonREP, this.loadAllowCardList, this.removeAllowCardList, this.loadBiometryList, 
/* 1033 */           this.removeBiometryList, this.includeCard, this.excludeCard, this.deviceDisplayMessage, this.updateFirmware, this.includePhoto, this.excludePhoto, this.loadCredentialFacialList });
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1038 */     StringBuilder sb = new StringBuilder();
/* 1039 */     sb.append("class AllPendency {\n");
/*      */     
/* 1041 */     sb.append("    deviceStatus: ").append(toIndentedString(this.deviceStatus)).append("\n");
/* 1042 */     sb.append("    deviceDateTime: ").append(toIndentedString(this.deviceDateTime)).append("\n");
/* 1043 */     sb.append("    resetDevice: ").append(toIndentedString(this.resetDevice)).append("\n");
/* 1044 */     sb.append("    blockDevice: ").append(toIndentedString(this.blockDevice)).append("\n");
/* 1045 */     sb.append("    unblockDevice: ").append(toIndentedString(this.unblockDevice)).append("\n");
/* 1046 */     sb.append("    setDeviceEmergency: ").append(toIndentedString(this.setDeviceEmergency)).append("\n");
/* 1047 */     sb.append("    unsetDeviceEmergency: ").append(toIndentedString(this.unsetDeviceEmergency)).append("\n");
/* 1048 */     sb.append("    apolloIncludeCard: ").append(toIndentedString(this.apolloIncludeCard)).append("\n");
/* 1049 */     sb.append("    apolloExcludeCard: ").append(toIndentedString(this.apolloExcludeCard)).append("\n");
/* 1050 */     sb.append("    includeBiometry: ").append(toIndentedString(this.includeBiometry)).append("\n");
/* 1051 */     sb.append("    excludeBiometry: ").append(toIndentedString(this.excludeBiometry)).append("\n");
/* 1052 */     sb.append("    device: ").append(toIndentedString(this.device)).append("\n");
/* 1053 */     sb.append("    loadHolidayList: ").append(toIndentedString(this.loadHolidayList)).append("\n");
/* 1054 */     sb.append("    removeHolidayList: ").append(toIndentedString(this.removeHolidayList)).append("\n");
/* 1055 */     sb.append("    activateDeviceOutput: ").append(toIndentedString(this.activateDeviceOutput)).append("\n");
/* 1056 */     sb.append("    deactivateDeviceOutput: ").append(toIndentedString(this.deactivateDeviceOutput)).append("\n");
/* 1057 */     sb.append("    datamartUpdated: ").append(toIndentedString(this.datamartUpdated)).append("\n");
/* 1058 */     sb.append("    personLocationUpdated: ").append(toIndentedString(this.personLocationUpdated)).append("\n");
/* 1059 */     sb.append("    collectEvent: ").append(toIndentedString(this.collectEvent)).append("\n");
/* 1060 */     sb.append("    inputStatus: ").append(toIndentedString(this.inputStatus)).append("\n");
/* 1061 */     sb.append("    manufacturerUpdated: ").append(toIndentedString(this.manufacturerUpdated)).append("\n");
/* 1062 */     sb.append("    updatePersonREP: ").append(toIndentedString(this.updatePersonREP)).append("\n");
/* 1063 */     sb.append("    loadAllowCardList: ").append(toIndentedString(this.loadAllowCardList)).append("\n");
/* 1064 */     sb.append("    removeAllowCardList: ").append(toIndentedString(this.removeAllowCardList)).append("\n");
/* 1065 */     sb.append("    loadBiometryList: ").append(toIndentedString(this.loadBiometryList)).append("\n");
/* 1066 */     sb.append("    removeBiometryList: ").append(toIndentedString(this.removeBiometryList)).append("\n");
/* 1067 */     sb.append("    includeCard: ").append(toIndentedString(this.includeCard)).append("\n");
/* 1068 */     sb.append("    excludeCard: ").append(toIndentedString(this.excludeCard)).append("\n");
/* 1069 */     sb.append("    deviceDisplayMessage: ").append(toIndentedString(this.deviceDisplayMessage)).append("\n");
/* 1070 */     sb.append("    updateFirmware: ").append(toIndentedString(this.updateFirmware)).append("\n");
/* 1071 */     sb.append("    includePhoto: ").append(toIndentedString(this.includePhoto)).append("\n");
/* 1072 */     sb.append("    excludePhoto: ").append(toIndentedString(this.excludePhoto)).append("\n");
/* 1073 */     sb.append("    loadCredentialFacialList: ").append(toIndentedString(this.loadCredentialFacialList)).append("\n");
/* 1074 */     sb.append("}");
/* 1075 */     return sb.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String toIndentedString(Object o) {
/* 1083 */     if (o == null) {
/* 1084 */       return "null";
/*      */     }
/* 1086 */     return o.toString().replace("\n", "\n    ");
/*      */   }
/*      */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\seniorx\models\AllPendency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AllPendency
 */

public class AllPendency {
	@SerializedName("deviceStatus")
	private List<DevicePendency> deviceStatus = null;

	@SerializedName("deviceDateTime")
	private List<DevicePendency> deviceDateTime = null;

	@SerializedName("resetDevice")
	private List<DevicePendency> resetDevice = null;

	@SerializedName("blockDevice")
	private List<BlockDevicePendency> blockDevice = null;

	@SerializedName("unblockDevice")
	private List<UnblockDevicePendency> unblockDevice = null;

	@SerializedName("setDeviceEmergency")
	private List<SetDeviceEmergencyPendency> setDeviceEmergency = null;

	@SerializedName("unsetDeviceEmergency")
	private List<UnsetDeviceEmergencyPendency> unsetDeviceEmergency = null;

	@SerializedName("apolloIncludeCard")
	private List<ApolloIncludeCardPendency> apolloIncludeCard = null;

	@SerializedName("apolloExcludeCard")
	private List<ApolloExcludeCardPendency> apolloExcludeCard = null;

	@SerializedName("includeBiometry")
	private List<IncludeBiometryPendency> includeBiometry = null;

	@SerializedName("excludeBiometry")
	private List<ExcludeBiometryPendency> excludeBiometry = null;

	@SerializedName("device")
	private List<DeviceUpdatedPendency> device = null;

	@SerializedName("loadHolidayList")
	private List<LoadHolidayListPendency> loadHolidayList = null;

	@SerializedName("removeHolidayList")
	private List<DevicePendency> removeHolidayList = null;

	@SerializedName("activateDeviceOutput")
	private List<ActiveDeviceOutputPendency> activateDeviceOutput = null;

	@SerializedName("deactivateDeviceOutput")
	private List<DeactiveDeviceOutputPendency> deactivateDeviceOutput = null;

	@SerializedName("datamartUpdated")
	private List<DatamartUpdatedPendency> datamartUpdated = null;

	@SerializedName("personLocationUpdated")
	private List<PersonAreaUpdatedPendency> personLocationUpdated = null;

	@SerializedName("collectEvent")
	private List<CollectEventPendency> collectEvent = null;

	@SerializedName("inputStatus")
	private List<DevicePendency> inputStatus = null;

	@SerializedName("manufacturerUpdated")
	private List<ManufacturerUpdatedPendency> manufacturerUpdated = null;

	@SerializedName("updatePersonREP")
	private List<UpdatePersonREPPendency> updatePersonREP = null;

	@SerializedName("loadAllowCardList")
	private List<DevicePendency> loadAllowCardList = null;

	@SerializedName("removeAllowCardList")
	private List<DevicePendency> removeAllowCardList = null;

	@SerializedName("loadBiometryList")
	private List<DevicePendency> loadBiometryList = null;

	@SerializedName("removeBiometryList")
	private List<DevicePendency> removeBiometryList = null;

	@SerializedName("includeCard")
	private List<IncludeCardPendency> includeCard = null;

	@SerializedName("excludeCard")
	private List<ExcludeCardPendency> excludeCard = null;

	@SerializedName("deviceDisplayMessage")
	private List<DeviceDisplayMessagePendency> deviceDisplayMessage = null;

	@SerializedName("updateFirmware")
	private List<DevicePendency> updateFirmware = null;

	@SerializedName("includePhoto")
	private List<IncludePhotoPendency> includePhoto = null;

	@SerializedName("excludePhoto")
	private List<ExcludePhotoPendency> excludePhoto = null;

	@SerializedName("loadCredentialFacialList")
	private List<DevicePendency> loadCredentialFacialList = null;

	public AllPendency deviceStatus(List<DevicePendency> deviceStatus) {
		this.deviceStatus = deviceStatus;
		return this;
	}

	public AllPendency addDeviceStatusItem(DevicePendency deviceStatusItem) {
		if (this.deviceStatus == null) {
			this.deviceStatus = new ArrayList<DevicePendency>();
		}
		this.deviceStatus.add(deviceStatusItem);
		return this;
	}

	/**
	 * Requisição de status do dispositivo
	 * 
	 * @return deviceStatus
	 **/
	@Schema(description  = "Requisição de status do dispositivo")
	public List<DevicePendency> getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(List<DevicePendency> deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public AllPendency deviceDateTime(List<DevicePendency> deviceDateTime) {
		this.deviceDateTime = deviceDateTime;
		return this;
	}

	public AllPendency addDeviceDateTimeItem(DevicePendency deviceDateTimeItem) {
		if (this.deviceDateTime == null) {
			this.deviceDateTime = new ArrayList<DevicePendency>();
		}
		this.deviceDateTime.add(deviceDateTimeItem);
		return this;
	}

	/**
	 * Indica que deve ser atualizada a data/hora do dispositivo
	 * 
	 * @return deviceDateTime
	 **/
	@Schema(description  = "Indica que deve ser atualizada a data/hora do dispositivo")
	public List<DevicePendency> getDeviceDateTime() {
		return deviceDateTime;
	}

	public void setDeviceDateTime(List<DevicePendency> deviceDateTime) {
		this.deviceDateTime = deviceDateTime;
	}

	public AllPendency resetDevice(List<DevicePendency> resetDevice) {
		this.resetDevice = resetDevice;
		return this;
	}

	public AllPendency addResetDeviceItem(DevicePendency resetDeviceItem) {
		if (this.resetDevice == null) {
			this.resetDevice = new ArrayList<DevicePendency>();
		}
		this.resetDevice.add(resetDeviceItem);
		return this;
	}

	/**
	 * Dados armazenados no dispositivo devem ser resetados
	 * 
	 * @return resetDevice
	 **/
	@Schema(description  = "Dados armazenados no dispositivo devem ser resetados")
	public List<DevicePendency> getResetDevice() {
		return resetDevice;
	}

	public void setResetDevice(List<DevicePendency> resetDevice) {
		this.resetDevice = resetDevice;
	}

	public AllPendency blockDevice(List<BlockDevicePendency> blockDevice) {
		this.blockDevice = blockDevice;
		return this;
	}

	public AllPendency addBlockDeviceItem(BlockDevicePendency blockDeviceItem) {
		if (this.blockDevice == null) {
			this.blockDevice = new ArrayList<BlockDevicePendency>();
		}
		this.blockDevice.add(blockDeviceItem);
		return this;
	}

	/**
	 * Dispositivo deve ser bloqueado
	 * 
	 * @return blockDevice
	 **/
	@Schema(description  = "Dispositivo deve ser bloqueado")
	public List<BlockDevicePendency> getBlockDevice() {
		return blockDevice;
	}

	public void setBlockDevice(List<BlockDevicePendency> blockDevice) {
		this.blockDevice = blockDevice;
	}

	public AllPendency unblockDevice(List<UnblockDevicePendency> unblockDevice) {
		this.unblockDevice = unblockDevice;
		return this;
	}

	public AllPendency addUnblockDeviceItem(UnblockDevicePendency unblockDeviceItem) {
		if (this.unblockDevice == null) {
			this.unblockDevice = new ArrayList<UnblockDevicePendency>();
		}
		this.unblockDevice.add(unblockDeviceItem);
		return this;
	}

	/**
	 * Dispositivo deve ser desbloqueado
	 * 
	 * @return unblockDevice
	 **/
	@Schema(description  = "Dispositivo deve ser desbloqueado")
	public List<UnblockDevicePendency> getUnblockDevice() {
		return unblockDevice;
	}

	public void setUnblockDevice(List<UnblockDevicePendency> unblockDevice) {
		this.unblockDevice = unblockDevice;
	}

	public AllPendency setDeviceEmergency(List<SetDeviceEmergencyPendency> setDeviceEmergency) {
		this.setDeviceEmergency = setDeviceEmergency;
		return this;
	}

	public AllPendency addSetDeviceEmergencyItem(SetDeviceEmergencyPendency setDeviceEmergencyItem) {
		if (this.setDeviceEmergency == null) {
			this.setDeviceEmergency = new ArrayList<SetDeviceEmergencyPendency>();
		}
		this.setDeviceEmergency.add(setDeviceEmergencyItem);
		return this;
	}

	/**
	 * Dispositivo deve entrar no modo de emergência
	 * 
	 * @return setDeviceEmergency
	 **/
	@Schema(description  = "Dispositivo deve entrar no modo de emergência")
	public List<SetDeviceEmergencyPendency> getSetDeviceEmergency() {
		return setDeviceEmergency;
	}

	public void setSetDeviceEmergency(List<SetDeviceEmergencyPendency> setDeviceEmergency) {
		this.setDeviceEmergency = setDeviceEmergency;
	}

	public AllPendency unsetDeviceEmergency(List<UnsetDeviceEmergencyPendency> unsetDeviceEmergency) {
		this.unsetDeviceEmergency = unsetDeviceEmergency;
		return this;
	}

	public AllPendency addUnsetDeviceEmergencyItem(UnsetDeviceEmergencyPendency unsetDeviceEmergencyItem) {
		if (this.unsetDeviceEmergency == null) {
			this.unsetDeviceEmergency = new ArrayList<UnsetDeviceEmergencyPendency>();
		}
		this.unsetDeviceEmergency.add(unsetDeviceEmergencyItem);
		return this;
	}

	/**
	 * Dispositivo deve sair do modo de emergência
	 * 
	 * @return unsetDeviceEmergency
	 **/
	@Schema(description  = "Dispositivo deve sair do modo de emergência")
	public List<UnsetDeviceEmergencyPendency> getUnsetDeviceEmergency() {
		return unsetDeviceEmergency;
	}

	public void setUnsetDeviceEmergency(List<UnsetDeviceEmergencyPendency> unsetDeviceEmergency) {
		this.unsetDeviceEmergency = unsetDeviceEmergency;
	}

	public AllPendency apolloIncludeCard(List<ApolloIncludeCardPendency> apolloIncludeCard) {
		this.apolloIncludeCard = apolloIncludeCard;
		return this;
	}

	public AllPendency addApolloIncludeCardItem(ApolloIncludeCardPendency apolloIncludeCardItem) {
		if (this.apolloIncludeCard == null) {
			this.apolloIncludeCard = new ArrayList<ApolloIncludeCardPendency>();
		}
		this.apolloIncludeCard.add(apolloIncludeCardItem);
		return this;
	}

	/**
	 * Incluir um cartão no dispositivo Apollo
	 * 
	 * @return apolloIncludeCard
	 **/
	@Schema(description  = "Incluir um cartão no dispositivo Apollo")
	public List<ApolloIncludeCardPendency> getApolloIncludeCard() {
		return apolloIncludeCard;
	}

	public void setApolloIncludeCard(List<ApolloIncludeCardPendency> apolloIncludeCard) {
		this.apolloIncludeCard = apolloIncludeCard;
	}

	public AllPendency apolloExcludeCard(List<ApolloExcludeCardPendency> apolloExcludeCard) {
		this.apolloExcludeCard = apolloExcludeCard;
		return this;
	}

	public AllPendency addApolloExcludeCardItem(ApolloExcludeCardPendency apolloExcludeCardItem) {
		if (this.apolloExcludeCard == null) {
			this.apolloExcludeCard = new ArrayList<ApolloExcludeCardPendency>();
		}
		this.apolloExcludeCard.add(apolloExcludeCardItem);
		return this;
	}

	/**
	 * Excluir um cartão no dispositivo Apollo
	 * 
	 * @return apolloExcludeCard
	 **/
	@Schema(description  = "Excluir um cartão no dispositivo Apollo")
	public List<ApolloExcludeCardPendency> getApolloExcludeCard() {
		return apolloExcludeCard;
	}

	public void setApolloExcludeCard(List<ApolloExcludeCardPendency> apolloExcludeCard) {
		this.apolloExcludeCard = apolloExcludeCard;
	}

	public AllPendency includeBiometry(List<IncludeBiometryPendency> includeBiometry) {
		this.includeBiometry = includeBiometry;
		return this;
	}

	public AllPendency addIncludeBiometryItem(IncludeBiometryPendency includeBiometryItem) {
		if (this.includeBiometry == null) {
			this.includeBiometry = new ArrayList<IncludeBiometryPendency>();
		}
		this.includeBiometry.add(includeBiometryItem);
		return this;
	}

	/**
	 * Incluir biometria
	 * 
	 * @return includeBiometry
	 **/
	@Schema(description  = "Incluir biometria")
	public List<IncludeBiometryPendency> getIncludeBiometry() {
		return includeBiometry;
	}

	public void setIncludeBiometry(List<IncludeBiometryPendency> includeBiometry) {
		this.includeBiometry = includeBiometry;
	}

	public AllPendency excludeBiometry(List<ExcludeBiometryPendency> excludeBiometry) {
		this.excludeBiometry = excludeBiometry;
		return this;
	}

	public AllPendency addExcludeBiometryItem(ExcludeBiometryPendency excludeBiometryItem) {
		if (this.excludeBiometry == null) {
			this.excludeBiometry = new ArrayList<ExcludeBiometryPendency>();
		}
		this.excludeBiometry.add(excludeBiometryItem);
		return this;
	}

	/**
	 * Excluir biometria
	 * 
	 * @return excludeBiometry
	 **/
	@Schema(description  = "Excluir biometria ")
	public List<ExcludeBiometryPendency> getExcludeBiometry() {
		return excludeBiometry;
	}

	public void setExcludeBiometry(List<ExcludeBiometryPendency> excludeBiometry) {
		this.excludeBiometry = excludeBiometry;
	}

	public AllPendency device(List<DeviceUpdatedPendency> device) {
		this.device = device;
		return this;
	}

	public AllPendency addDeviceItem(DeviceUpdatedPendency deviceItem) {
		if (this.device == null) {
			this.device = new ArrayList<DeviceUpdatedPendency>();
		}
		this.device.add(deviceItem);
		return this;
	}

	/**
	 * A configuração do dispositivo sofreu alguma alteração ou o dispositivo
	 * precisa ser configurado
	 * 
	 * @return device
	 **/
	@Schema(description  = "A configuração do dispositivo sofreu alguma alteração ou o dispositivo precisa ser configurado")
	public List<DeviceUpdatedPendency> getDevice() {
		return device;
	}

	public void setDevice(List<DeviceUpdatedPendency> device) {
		this.device = device;
	}

	public AllPendency loadHolidayList(List<LoadHolidayListPendency> loadHolidayList) {
		this.loadHolidayList = loadHolidayList;
		return this;
	}

	public AllPendency addLoadHolidayListItem(LoadHolidayListPendency loadHolidayListItem) {
		if (this.loadHolidayList == null) {
			this.loadHolidayList = new ArrayList<LoadHolidayListPendency>();
		}
		this.loadHolidayList.add(loadHolidayListItem);
		return this;
	}

	/**
	 * Carregar a lista de feriados no dispositivo
	 * 
	 * @return loadHolidayList
	 **/
	@Schema(description  = "Carregar a lista de feriados no dispositivo")
	public List<LoadHolidayListPendency> getLoadHolidayList() {
		return loadHolidayList;
	}

	public void setLoadHolidayList(List<LoadHolidayListPendency> loadHolidayList) {
		this.loadHolidayList = loadHolidayList;
	}

	public AllPendency removeHolidayList(List<DevicePendency> removeHolidayList) {
		this.removeHolidayList = removeHolidayList;
		return this;
	}

	public AllPendency addRemoveHolidayListItem(DevicePendency removeHolidayListItem) {
		if (this.removeHolidayList == null) {
			this.removeHolidayList = new ArrayList<DevicePendency>();
		}
		this.removeHolidayList.add(removeHolidayListItem);
		return this;
	}

	/**
	 * Remover a lista de feriados do dispositivo
	 * 
	 * @return removeHolidayList
	 **/
	@Schema(description  = "Remover a lista de feriados do dispositivo")
	public List<DevicePendency> getRemoveHolidayList() {
		return removeHolidayList;
	}

	public void setRemoveHolidayList(List<DevicePendency> removeHolidayList) {
		this.removeHolidayList = removeHolidayList;
	}

	public AllPendency activateDeviceOutput(List<ActiveDeviceOutputPendency> activateDeviceOutput) {
		this.activateDeviceOutput = activateDeviceOutput;
		return this;
	}

	public AllPendency addActivateDeviceOutputItem(ActiveDeviceOutputPendency activateDeviceOutputItem) {
		if (this.activateDeviceOutput == null) {
			this.activateDeviceOutput = new ArrayList<ActiveDeviceOutputPendency>();
		}
		this.activateDeviceOutput.add(activateDeviceOutputItem);
		return this;
	}

	/**
	 * Ativar uma saída digital do dispositivo
	 * 
	 * @return activateDeviceOutput
	 **/
	@Schema(description  = "Ativar uma saída digital do dispositivo")
	public List<ActiveDeviceOutputPendency> getActivateDeviceOutput() {
		return activateDeviceOutput;
	}

	public void setActivateDeviceOutput(List<ActiveDeviceOutputPendency> activateDeviceOutput) {
		this.activateDeviceOutput = activateDeviceOutput;
	}

	public AllPendency deactivateDeviceOutput(List<DeactiveDeviceOutputPendency> deactivateDeviceOutput) {
		this.deactivateDeviceOutput = deactivateDeviceOutput;
		return this;
	}

	public AllPendency addDeactivateDeviceOutputItem(DeactiveDeviceOutputPendency deactivateDeviceOutputItem) {
		if (this.deactivateDeviceOutput == null) {
			this.deactivateDeviceOutput = new ArrayList<DeactiveDeviceOutputPendency>();
		}
		this.deactivateDeviceOutput.add(deactivateDeviceOutputItem);
		return this;
	}

	/**
	 * Desativar uma saída digital do dispositivo
	 * 
	 * @return deactivateDeviceOutput
	 **/
	@Schema(description  = "Desativar uma saída digital do dispositivo")
	public List<DeactiveDeviceOutputPendency> getDeactivateDeviceOutput() {
		return deactivateDeviceOutput;
	}

	public void setDeactivateDeviceOutput(List<DeactiveDeviceOutputPendency> deactivateDeviceOutput) {
		this.deactivateDeviceOutput = deactivateDeviceOutput;
	}

	public AllPendency datamartUpdated(List<DatamartUpdatedPendency> datamartUpdated) {
		this.datamartUpdated = datamartUpdated;
		return this;
	}

	public AllPendency addDatamartUpdatedItem(DatamartUpdatedPendency datamartUpdatedItem) {
		if (this.datamartUpdated == null) {
			this.datamartUpdated = new ArrayList<DatamartUpdatedPendency>();
		}
		this.datamartUpdated.add(datamartUpdatedItem);
		return this;
	}

	/**
	 * Datamart atualizado
	 * 
	 * @return datamartUpdated
	 **/
	@Schema(description  = "Datamart atualizado")
	public List<DatamartUpdatedPendency> getDatamartUpdated() {
		return datamartUpdated;
	}

	public void setDatamartUpdated(List<DatamartUpdatedPendency> datamartUpdated) {
		this.datamartUpdated = datamartUpdated;
	}

	public AllPendency personLocationUpdated(List<PersonAreaUpdatedPendency> personLocationUpdated) {
		this.personLocationUpdated = personLocationUpdated;
		return this;
	}

	public AllPendency addPersonLocationUpdatedItem(PersonAreaUpdatedPendency personLocationUpdatedItem) {
		if (this.personLocationUpdated == null) {
			this.personLocationUpdated = new ArrayList<PersonAreaUpdatedPendency>();
		}
		this.personLocationUpdated.add(personLocationUpdatedItem);
		return this;
	}

	/**
	 * Atualiza o local físico da pessoa
	 * 
	 * @return personLocationUpdated
	 **/
	@Schema(description  = "Atualiza o local físico da pessoa")
	public List<PersonAreaUpdatedPendency> getPersonLocationUpdated() {
		return personLocationUpdated;
	}

	public void setPersonLocationUpdated(List<PersonAreaUpdatedPendency> personLocationUpdated) {
		this.personLocationUpdated = personLocationUpdated;
	}

	public AllPendency collectEvent(List<CollectEventPendency> collectEvent) {
		this.collectEvent = collectEvent;
		return this;
	}

	public AllPendency addCollectEventItem(CollectEventPendency collectEventItem) {
		if (this.collectEvent == null) {
			this.collectEvent = new ArrayList<CollectEventPendency>();
		}
		this.collectEvent.add(collectEventItem);
		return this;
	}

	/**
	 * Realizar a coleta de eventos de um dispositivo.
	 * 
	 * @return collectEvent
	 **/
	@Schema(description  = "Realizar a coleta de eventos de um dispositivo. ")
	public List<CollectEventPendency> getCollectEvent() {
		return collectEvent;
	}

	public void setCollectEvent(List<CollectEventPendency> collectEvent) {
		this.collectEvent = collectEvent;
	}

	public AllPendency inputStatus(List<DevicePendency> inputStatus) {
		this.inputStatus = inputStatus;
		return this;
	}

	public AllPendency addInputStatusItem(DevicePendency inputStatusItem) {
		if (this.inputStatus == null) {
			this.inputStatus = new ArrayList<DevicePendency>();
		}
		this.inputStatus.add(inputStatusItem);
		return this;
	}

	/**
	 * Verificar o status da uma entrada
	 * 
	 * @return inputStatus
	 **/
	@Schema(description  = "Verificar o status da uma entrada")
	public List<DevicePendency> getInputStatus() {
		return inputStatus;
	}

	public void setInputStatus(List<DevicePendency> inputStatus) {
		this.inputStatus = inputStatus;
	}

	public AllPendency manufacturerUpdated(List<ManufacturerUpdatedPendency> manufacturerUpdated) {
		this.manufacturerUpdated = manufacturerUpdated;
		return this;
	}

	public AllPendency addManufacturerUpdatedItem(ManufacturerUpdatedPendency manufacturerUpdatedItem) {
		if (this.manufacturerUpdated == null) {
			this.manufacturerUpdated = new ArrayList<ManufacturerUpdatedPendency>();
		}
		this.manufacturerUpdated.add(manufacturerUpdatedItem);
		return this;
	}

	/**
	 * Os dados da empresa do REP foram atualizados
	 * 
	 * @return manufacturerUpdated
	 **/
	@Schema(description  = "Os dados da empresa do REP foram atualizados")
	public List<ManufacturerUpdatedPendency> getManufacturerUpdated() {
		return manufacturerUpdated;
	}

	public void setManufacturerUpdated(List<ManufacturerUpdatedPendency> manufacturerUpdated) {
		this.manufacturerUpdated = manufacturerUpdated;
	}

	public AllPendency updatePersonREP(List<UpdatePersonREPPendency> updatePersonREP) {
		this.updatePersonREP = updatePersonREP;
		return this;
	}

	public AllPendency addUpdatePersonREPItem(UpdatePersonREPPendency updatePersonREPItem) {
		if (this.updatePersonREP == null) {
			this.updatePersonREP = new ArrayList<UpdatePersonREPPendency>();
		}
		this.updatePersonREP.add(updatePersonREPItem);
		return this;
	}

	/**
	 * Incluir uma pessoa no REP
	 * 
	 * @return updatePersonREP
	 **/
	@Schema(description  = "Incluir uma pessoa no REP")
	public List<UpdatePersonREPPendency> getUpdatePersonREP() {
		return updatePersonREP;
	}

	public void setUpdatePersonREP(List<UpdatePersonREPPendency> updatePersonREP) {
		this.updatePersonREP = updatePersonREP;
	}

	public AllPendency loadAllowCardList(List<DevicePendency> loadAllowCardList) {
		this.loadAllowCardList = loadAllowCardList;
		return this;
	}

	public AllPendency addLoadAllowCardListItem(DevicePendency loadAllowCardListItem) {
		if (this.loadAllowCardList == null) {
			this.loadAllowCardList = new ArrayList<DevicePendency>();
		}
		this.loadAllowCardList.add(loadAllowCardListItem);
		return this;
	}

	/**
	 * Inclusão da lista de liberação
	 * 
	 * @return loadAllowCardList
	 **/
	@Schema(description  = "Inclusão da lista de liberação")
	public List<DevicePendency> getLoadAllowCardList() {
		return loadAllowCardList;
	}

	public void setLoadAllowCardList(List<DevicePendency> loadAllowCardList) {
		this.loadAllowCardList = loadAllowCardList;
	}

	public AllPendency removeAllowCardList(List<DevicePendency> removeAllowCardList) {
		this.removeAllowCardList = removeAllowCardList;
		return this;
	}

	public AllPendency addRemoveAllowCardListItem(DevicePendency removeAllowCardListItem) {
		if (this.removeAllowCardList == null) {
			this.removeAllowCardList = new ArrayList<DevicePendency>();
		}
		this.removeAllowCardList.add(removeAllowCardListItem);
		return this;
	}

	/**
	 * Remover a lista de liberação do dispositivo
	 * 
	 * @return removeAllowCardList
	 **/
	@Schema(description  = "Remover a lista de liberação do dispositivo")
	public List<DevicePendency> getRemoveAllowCardList() {
		return removeAllowCardList;
	}

	public void setRemoveAllowCardList(List<DevicePendency> removeAllowCardList) {
		this.removeAllowCardList = removeAllowCardList;
	}

	public AllPendency loadBiometryList(List<DevicePendency> loadBiometryList) {
		this.loadBiometryList = loadBiometryList;
		return this;
	}

	public AllPendency addLoadBiometryListItem(DevicePendency loadBiometryListItem) {
		if (this.loadBiometryList == null) {
			this.loadBiometryList = new ArrayList<DevicePendency>();
		}
		this.loadBiometryList.add(loadBiometryListItem);
		return this;
	}

	/**
	 * Incluir uma lista de biometria no dispositivo
	 * 
	 * @return loadBiometryList
	 **/
	@Schema(description  = "Incluir uma lista de biometria no dispositivo ")
	public List<DevicePendency> getLoadBiometryList() {
		return loadBiometryList;
	}

	public void setLoadBiometryList(List<DevicePendency> loadBiometryList) {
		this.loadBiometryList = loadBiometryList;
	}

	public AllPendency removeBiometryList(List<DevicePendency> removeBiometryList) {
		this.removeBiometryList = removeBiometryList;
		return this;
	}

	public AllPendency addRemoveBiometryListItem(DevicePendency removeBiometryListItem) {
		if (this.removeBiometryList == null) {
			this.removeBiometryList = new ArrayList<DevicePendency>();
		}
		this.removeBiometryList.add(removeBiometryListItem);
		return this;
	}

	/**
	 * Remover da lista de biometria do dispositivo
	 * 
	 * @return removeBiometryList
	 **/
	@Schema(description  = "Remover da lista de biometria do dispositivo ")
	public List<DevicePendency> getRemoveBiometryList() {
		return removeBiometryList;
	}

	public void setRemoveBiometryList(List<DevicePendency> removeBiometryList) {
		this.removeBiometryList = removeBiometryList;
	}

	public AllPendency includeCard(List<IncludeCardPendency> includeCard) {
		this.includeCard = includeCard;
		return this;
	}

	public AllPendency addIncludeCardItem(IncludeCardPendency includeCardItem) {
		if (this.includeCard == null) {
			this.includeCard = new ArrayList<IncludeCardPendency>();
		}
		this.includeCard.add(includeCardItem);
		return this;
	}

	/**
	 * Incluir um cartão no dispositivo
	 * 
	 * @return includeCard
	 **/
	@Schema(description  = "Incluir um cartão no dispositivo")
	public List<IncludeCardPendency> getIncludeCard() {
		return includeCard;
	}

	public void setIncludeCard(List<IncludeCardPendency> includeCard) {
		this.includeCard = includeCard;
	}

	public AllPendency excludeCard(List<ExcludeCardPendency> excludeCard) {
		this.excludeCard = excludeCard;
		return this;
	}

	public AllPendency addExcludeCardItem(ExcludeCardPendency excludeCardItem) {
		if (this.excludeCard == null) {
			this.excludeCard = new ArrayList<ExcludeCardPendency>();
		}
		this.excludeCard.add(excludeCardItem);
		return this;
	}

	/**
	 * Remover um cartão no dispositivo
	 * 
	 * @return excludeCard
	 **/
	@Schema(description  = "Remover um cartão no dispositivo")
	public List<ExcludeCardPendency> getExcludeCard() {
		return excludeCard;
	}

	public void setExcludeCard(List<ExcludeCardPendency> excludeCard) {
		this.excludeCard = excludeCard;
	}

	public AllPendency deviceDisplayMessage(List<DeviceDisplayMessagePendency> deviceDisplayMessage) {
		this.deviceDisplayMessage = deviceDisplayMessage;
		return this;
	}

	public AllPendency addDeviceDisplayMessageItem(DeviceDisplayMessagePendency deviceDisplayMessageItem) {
		if (this.deviceDisplayMessage == null) {
			this.deviceDisplayMessage = new ArrayList<DeviceDisplayMessagePendency>();
		}
		this.deviceDisplayMessage.add(deviceDisplayMessageItem);
		return this;
	}

	/**
	 * Exibir mensagem no display do dispositivo
	 * 
	 * @return deviceDisplayMessage
	 **/
	@Schema(description  = "Exibir mensagem no display do dispositivo")
	public List<DeviceDisplayMessagePendency> getDeviceDisplayMessage() {
		return deviceDisplayMessage;
	}

	public void setDeviceDisplayMessage(List<DeviceDisplayMessagePendency> deviceDisplayMessage) {
		this.deviceDisplayMessage = deviceDisplayMessage;
	}

	public AllPendency updateFirmware(List<DevicePendency> updateFirmware) {
		this.updateFirmware = updateFirmware;
		return this;
	}

	public AllPendency addUpdateFirmwareItem(DevicePendency updateFirmwareItem) {
		if (this.updateFirmware == null) {
			this.updateFirmware = new ArrayList<DevicePendency>();
		}
		this.updateFirmware.add(updateFirmwareItem);
		return this;
	}

	/**
	 * Atualização do firmware do dispositivo
	 * 
	 * @return updateFirmware
	 **/
	@Schema(description  = "Atualização do firmware do dispositivo")
	public List<DevicePendency> getUpdateFirmware() {
		return updateFirmware;
	}

	public void setUpdateFirmware(List<DevicePendency> updateFirmware) {
		this.updateFirmware = updateFirmware;
	}

	public AllPendency includePhoto(List<IncludePhotoPendency> includePhoto) {
		this.includePhoto = includePhoto;
		return this;
	}

	public AllPendency addIncludePhotoItem(IncludePhotoPendency includePhotoItem) {
		if (this.includePhoto == null) {
			this.includePhoto = new ArrayList<IncludePhotoPendency>();
		}
		this.includePhoto.add(includePhotoItem);
		return this;
	}

	/**
	 * Incluir foto no dispositivo para reconhecimento facial
	 * 
	 * @return includePhoto
	 **/
	@Schema(description  = "Incluir foto no dispositivo para reconhecimento facial")
	public List<IncludePhotoPendency> getIncludePhoto() {
		return includePhoto;
	}

	public void setIncludePhoto(List<IncludePhotoPendency> includePhoto) {
		this.includePhoto = includePhoto;
	}

	public AllPendency excludePhoto(List<ExcludePhotoPendency> excludePhoto) {
		this.excludePhoto = excludePhoto;
		return this;
	}

	public AllPendency addExcludePhotoItem(ExcludePhotoPendency excludePhotoItem) {
		if (this.excludePhoto == null) {
			this.excludePhoto = new ArrayList<ExcludePhotoPendency>();
		}
		this.excludePhoto.add(excludePhotoItem);
		return this;
	}

	/**
	 * Excluir foto do dispositivo
	 * 
	 * @return excludePhoto
	 **/
	@Schema(description  = "Excluir foto do dispositivo")
	public List<ExcludePhotoPendency> getExcludePhoto() {
		return excludePhoto;
	}

	public void setExcludePhoto(List<ExcludePhotoPendency> excludePhoto) {
		this.excludePhoto = excludePhoto;
	}

	public AllPendency loadCredentialFacialList(List<DevicePendency> loadCredentialFacialList) {
		this.loadCredentialFacialList = loadCredentialFacialList;
		return this;
	}

	public AllPendency addLoadCredentialFacialListItem(DevicePendency loadCredentialFacialListItem) {
		if (this.loadCredentialFacialList == null) {
			this.loadCredentialFacialList = new ArrayList<DevicePendency>();
		}
		this.loadCredentialFacialList.add(loadCredentialFacialListItem);
		return this;
	}

	/**
	 * Incluir uma lista de credencial facial no dispositivo
	 * 
	 * @return loadCredentialFacialList
	 **/
	@Schema(description  = "Incluir uma lista de credencial facial no dispositivo ")
	public List<DevicePendency> getLoadCredentialFacialList() {
		return loadCredentialFacialList;
	}

	public void setLoadCredentialFacialList(List<DevicePendency> loadCredentialFacialList) {
		this.loadCredentialFacialList = loadCredentialFacialList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AllPendency allPendency = (AllPendency) o;
		return Objects.equals(this.deviceStatus, allPendency.deviceStatus) && Objects.equals(this.deviceDateTime, allPendency.deviceDateTime) && Objects.equals(this.resetDevice, allPendency.resetDevice)
				&& Objects.equals(this.blockDevice, allPendency.blockDevice) && Objects.equals(this.unblockDevice, allPendency.unblockDevice) && Objects.equals(this.setDeviceEmergency, allPendency.setDeviceEmergency)
				&& Objects.equals(this.unsetDeviceEmergency, allPendency.unsetDeviceEmergency) && Objects.equals(this.apolloIncludeCard, allPendency.apolloIncludeCard) && Objects.equals(this.apolloExcludeCard, allPendency.apolloExcludeCard)
				&& Objects.equals(this.includeBiometry, allPendency.includeBiometry) && Objects.equals(this.excludeBiometry, allPendency.excludeBiometry) && Objects.equals(this.device, allPendency.device)
				&& Objects.equals(this.loadHolidayList, allPendency.loadHolidayList) && Objects.equals(this.removeHolidayList, allPendency.removeHolidayList) && Objects.equals(this.activateDeviceOutput, allPendency.activateDeviceOutput)
				&& Objects.equals(this.deactivateDeviceOutput, allPendency.deactivateDeviceOutput) && Objects.equals(this.datamartUpdated, allPendency.datamartUpdated) && Objects.equals(this.personLocationUpdated, allPendency.personLocationUpdated)
				&& Objects.equals(this.collectEvent, allPendency.collectEvent) && Objects.equals(this.inputStatus, allPendency.inputStatus) && Objects.equals(this.manufacturerUpdated, allPendency.manufacturerUpdated)
				&& Objects.equals(this.updatePersonREP, allPendency.updatePersonREP) && Objects.equals(this.loadAllowCardList, allPendency.loadAllowCardList) && Objects.equals(this.removeAllowCardList, allPendency.removeAllowCardList)
				&& Objects.equals(this.loadBiometryList, allPendency.loadBiometryList) && Objects.equals(this.removeBiometryList, allPendency.removeBiometryList) && Objects.equals(this.includeCard, allPendency.includeCard)
				&& Objects.equals(this.excludeCard, allPendency.excludeCard) && Objects.equals(this.deviceDisplayMessage, allPendency.deviceDisplayMessage) && Objects.equals(this.updateFirmware, allPendency.updateFirmware)
				&& Objects.equals(this.includePhoto, allPendency.includePhoto) && Objects.equals(this.excludePhoto, allPendency.excludePhoto) && Objects.equals(this.loadCredentialFacialList, allPendency.loadCredentialFacialList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceStatus, deviceDateTime, resetDevice, blockDevice, unblockDevice, setDeviceEmergency, unsetDeviceEmergency, apolloIncludeCard, apolloExcludeCard, includeBiometry, excludeBiometry, device, loadHolidayList,
				removeHolidayList, activateDeviceOutput, deactivateDeviceOutput, datamartUpdated, personLocationUpdated, collectEvent, inputStatus, manufacturerUpdated, updatePersonREP, loadAllowCardList, removeAllowCardList, loadBiometryList,
				removeBiometryList, includeCard, excludeCard, deviceDisplayMessage, updateFirmware, includePhoto, excludePhoto, loadCredentialFacialList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AllPendency {\n");

		sb.append("    deviceStatus: ").append(toIndentedString(deviceStatus)).append("\n");
		sb.append("    deviceDateTime: ").append(toIndentedString(deviceDateTime)).append("\n");
		sb.append("    resetDevice: ").append(toIndentedString(resetDevice)).append("\n");
		sb.append("    blockDevice: ").append(toIndentedString(blockDevice)).append("\n");
		sb.append("    unblockDevice: ").append(toIndentedString(unblockDevice)).append("\n");
		sb.append("    setDeviceEmergency: ").append(toIndentedString(setDeviceEmergency)).append("\n");
		sb.append("    unsetDeviceEmergency: ").append(toIndentedString(unsetDeviceEmergency)).append("\n");
		sb.append("    apolloIncludeCard: ").append(toIndentedString(apolloIncludeCard)).append("\n");
		sb.append("    apolloExcludeCard: ").append(toIndentedString(apolloExcludeCard)).append("\n");
		sb.append("    includeBiometry: ").append(toIndentedString(includeBiometry)).append("\n");
		sb.append("    excludeBiometry: ").append(toIndentedString(excludeBiometry)).append("\n");
		sb.append("    device: ").append(toIndentedString(device)).append("\n");
		sb.append("    loadHolidayList: ").append(toIndentedString(loadHolidayList)).append("\n");
		sb.append("    removeHolidayList: ").append(toIndentedString(removeHolidayList)).append("\n");
		sb.append("    activateDeviceOutput: ").append(toIndentedString(activateDeviceOutput)).append("\n");
		sb.append("    deactivateDeviceOutput: ").append(toIndentedString(deactivateDeviceOutput)).append("\n");
		sb.append("    datamartUpdated: ").append(toIndentedString(datamartUpdated)).append("\n");
		sb.append("    personLocationUpdated: ").append(toIndentedString(personLocationUpdated)).append("\n");
		sb.append("    collectEvent: ").append(toIndentedString(collectEvent)).append("\n");
		sb.append("    inputStatus: ").append(toIndentedString(inputStatus)).append("\n");
		sb.append("    manufacturerUpdated: ").append(toIndentedString(manufacturerUpdated)).append("\n");
		sb.append("    updatePersonREP: ").append(toIndentedString(updatePersonREP)).append("\n");
		sb.append("    loadAllowCardList: ").append(toIndentedString(loadAllowCardList)).append("\n");
		sb.append("    removeAllowCardList: ").append(toIndentedString(removeAllowCardList)).append("\n");
		sb.append("    loadBiometryList: ").append(toIndentedString(loadBiometryList)).append("\n");
		sb.append("    removeBiometryList: ").append(toIndentedString(removeBiometryList)).append("\n");
		sb.append("    includeCard: ").append(toIndentedString(includeCard)).append("\n");
		sb.append("    excludeCard: ").append(toIndentedString(excludeCard)).append("\n");
		sb.append("    deviceDisplayMessage: ").append(toIndentedString(deviceDisplayMessage)).append("\n");
		sb.append("    updateFirmware: ").append(toIndentedString(updateFirmware)).append("\n");
		sb.append("    includePhoto: ").append(toIndentedString(includePhoto)).append("\n");
		sb.append("    excludePhoto: ").append(toIndentedString(excludePhoto)).append("\n");
		sb.append("    loadCredentialFacialList: ").append(toIndentedString(loadCredentialFacialList)).append("\n");
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
