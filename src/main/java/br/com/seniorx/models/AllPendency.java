package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

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
	@ApiModelProperty(value = "Requisição de status do dispositivo")
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
	@ApiModelProperty(value = "Indica que deve ser atualizada a data/hora do dispositivo")
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
	@ApiModelProperty(value = "Dados armazenados no dispositivo devem ser resetados")
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
	@ApiModelProperty(value = "Dispositivo deve ser bloqueado")
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
	@ApiModelProperty(value = "Dispositivo deve ser desbloqueado")
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
	@ApiModelProperty(value = "Dispositivo deve entrar no modo de emergência")
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
	@ApiModelProperty(value = "Dispositivo deve sair do modo de emergência")
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
	@ApiModelProperty(value = "Incluir um cartão no dispositivo Apollo")
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
	@ApiModelProperty(value = "Excluir um cartão no dispositivo Apollo")
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
	@ApiModelProperty(value = "Incluir biometria")
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
	@ApiModelProperty(value = "Excluir biometria ")
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
	@ApiModelProperty(value = "A configuração do dispositivo sofreu alguma alteração ou o dispositivo precisa ser configurado")
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
	@ApiModelProperty(value = "Carregar a lista de feriados no dispositivo")
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
	@ApiModelProperty(value = "Remover a lista de feriados do dispositivo")
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
	@ApiModelProperty(value = "Ativar uma saída digital do dispositivo")
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
	@ApiModelProperty(value = "Desativar uma saída digital do dispositivo")
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
	@ApiModelProperty(value = "Datamart atualizado")
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
	@ApiModelProperty(value = "Atualiza o local físico da pessoa")
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
	@ApiModelProperty(value = "Realizar a coleta de eventos de um dispositivo. ")
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
	@ApiModelProperty(value = "Verificar o status da uma entrada")
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
	@ApiModelProperty(value = "Os dados da empresa do REP foram atualizados")
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
	@ApiModelProperty(value = "Incluir uma pessoa no REP")
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
	@ApiModelProperty(value = "Inclusão da lista de liberação")
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
	@ApiModelProperty(value = "Remover a lista de liberação do dispositivo")
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
	@ApiModelProperty(value = "Incluir uma lista de biometria no dispositivo ")
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
	@ApiModelProperty(value = "Remover da lista de biometria do dispositivo ")
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
	@ApiModelProperty(value = "Incluir um cartão no dispositivo")
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
	@ApiModelProperty(value = "Remover um cartão no dispositivo")
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
	@ApiModelProperty(value = "Exibir mensagem no display do dispositivo")
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
	@ApiModelProperty(value = "Atualização do firmware do dispositivo")
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
	@ApiModelProperty(value = "Incluir foto no dispositivo para reconhecimento facial")
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
	@ApiModelProperty(value = "Excluir foto do dispositivo")
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
	@ApiModelProperty(value = "Incluir uma lista de credencial facial no dispositivo ")
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
		return Objects.equals(this.deviceStatus, allPendency.deviceStatus)
				&& Objects.equals(this.deviceDateTime, allPendency.deviceDateTime)
				&& Objects.equals(this.resetDevice, allPendency.resetDevice)
				&& Objects.equals(this.blockDevice, allPendency.blockDevice)
				&& Objects.equals(this.unblockDevice, allPendency.unblockDevice)
				&& Objects.equals(this.setDeviceEmergency, allPendency.setDeviceEmergency)
				&& Objects.equals(this.unsetDeviceEmergency, allPendency.unsetDeviceEmergency)
				&& Objects.equals(this.apolloIncludeCard, allPendency.apolloIncludeCard)
				&& Objects.equals(this.apolloExcludeCard, allPendency.apolloExcludeCard)
				&& Objects.equals(this.includeBiometry, allPendency.includeBiometry)
				&& Objects.equals(this.excludeBiometry, allPendency.excludeBiometry)
				&& Objects.equals(this.device, allPendency.device)
				&& Objects.equals(this.loadHolidayList, allPendency.loadHolidayList)
				&& Objects.equals(this.removeHolidayList, allPendency.removeHolidayList)
				&& Objects.equals(this.activateDeviceOutput, allPendency.activateDeviceOutput)
				&& Objects.equals(this.deactivateDeviceOutput, allPendency.deactivateDeviceOutput)
				&& Objects.equals(this.datamartUpdated, allPendency.datamartUpdated)
				&& Objects.equals(this.personLocationUpdated, allPendency.personLocationUpdated)
				&& Objects.equals(this.collectEvent, allPendency.collectEvent)
				&& Objects.equals(this.inputStatus, allPendency.inputStatus)
				&& Objects.equals(this.manufacturerUpdated, allPendency.manufacturerUpdated)
				&& Objects.equals(this.updatePersonREP, allPendency.updatePersonREP)
				&& Objects.equals(this.loadAllowCardList, allPendency.loadAllowCardList)
				&& Objects.equals(this.removeAllowCardList, allPendency.removeAllowCardList)
				&& Objects.equals(this.loadBiometryList, allPendency.loadBiometryList)
				&& Objects.equals(this.removeBiometryList, allPendency.removeBiometryList)
				&& Objects.equals(this.includeCard, allPendency.includeCard)
				&& Objects.equals(this.excludeCard, allPendency.excludeCard)
				&& Objects.equals(this.deviceDisplayMessage, allPendency.deviceDisplayMessage)
				&& Objects.equals(this.updateFirmware, allPendency.updateFirmware)
				&& Objects.equals(this.includePhoto, allPendency.includePhoto)
				&& Objects.equals(this.excludePhoto, allPendency.excludePhoto)
				&& Objects.equals(this.loadCredentialFacialList, allPendency.loadCredentialFacialList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceStatus, deviceDateTime, resetDevice, blockDevice, unblockDevice, setDeviceEmergency,
				unsetDeviceEmergency, apolloIncludeCard, apolloExcludeCard, includeBiometry, excludeBiometry, device,
				loadHolidayList, removeHolidayList, activateDeviceOutput, deactivateDeviceOutput, datamartUpdated,
				personLocationUpdated, collectEvent, inputStatus, manufacturerUpdated, updatePersonREP,
				loadAllowCardList, removeAllowCardList, loadBiometryList, removeBiometryList, includeCard, excludeCard,
				deviceDisplayMessage, updateFirmware, includePhoto, excludePhoto, loadCredentialFacialList);
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
