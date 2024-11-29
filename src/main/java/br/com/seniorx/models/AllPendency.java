package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

public class AllPendency {

	public AllPendency() {
	}

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
			this.deviceStatus = new ArrayList<>();
		}
		this.deviceStatus.add(deviceStatusItem);
		return this;
	}

	@Schema(description = "Requisição de status do dispositivo")
	public List<DevicePendency> getDeviceStatus() {
		return this.deviceStatus;
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
			this.deviceDateTime = new ArrayList<>();
		}
		this.deviceDateTime.add(deviceDateTimeItem);
		return this;
	}

	@Schema(description = "Indica que deve ser atualizada a data/hora do dispositivo")
	public List<DevicePendency> getDeviceDateTime() {
		return this.deviceDateTime;
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
			this.resetDevice = new ArrayList<>();
		}
		this.resetDevice.add(resetDeviceItem);
		return this;
	}

	@Schema(description = "Dados armazenados no dispositivo devem ser resetados")
	public List<DevicePendency> getResetDevice() {
		return this.resetDevice;
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
			this.blockDevice = new ArrayList<>();
		}
		this.blockDevice.add(blockDeviceItem);
		return this;
	}

	@Schema(description = "Dispositivo deve ser bloqueado")
	public List<BlockDevicePendency> getBlockDevice() {
		return this.blockDevice;
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
			this.unblockDevice = new ArrayList<>();
		}
		this.unblockDevice.add(unblockDeviceItem);
		return this;
	}

	@Schema(description = "Dispositivo deve ser desbloqueado")
	public List<UnblockDevicePendency> getUnblockDevice() {
		return this.unblockDevice;
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
			this.setDeviceEmergency = new ArrayList<>();
		}
		this.setDeviceEmergency.add(setDeviceEmergencyItem);
		return this;
	}

	@Schema(description = "Dispositivo deve entrar no modo de emergência")
	public List<SetDeviceEmergencyPendency> getSetDeviceEmergency() {
		return this.setDeviceEmergency;
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
			this.unsetDeviceEmergency = new ArrayList<>();
		}
		this.unsetDeviceEmergency.add(unsetDeviceEmergencyItem);
		return this;
	}

	@Schema(description = "Dispositivo deve sair do modo de emergência")
	public List<UnsetDeviceEmergencyPendency> getUnsetDeviceEmergency() {
		return this.unsetDeviceEmergency;
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
			this.apolloIncludeCard = new ArrayList<>();
		}
		this.apolloIncludeCard.add(apolloIncludeCardItem);
		return this;
	}

	@Schema(description = "Incluir um cartão no dispositivo Apollo")
	public List<ApolloIncludeCardPendency> getApolloIncludeCard() {
		return this.apolloIncludeCard;
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
			this.apolloExcludeCard = new ArrayList<>();
		}
		this.apolloExcludeCard.add(apolloExcludeCardItem);
		return this;
	}

	@Schema(description = "Excluir um cartão no dispositivo Apollo")
	public List<ApolloExcludeCardPendency> getApolloExcludeCard() {
		return this.apolloExcludeCard;
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
			this.includeBiometry = new ArrayList<>();
		}
		this.includeBiometry.add(includeBiometryItem);
		return this;
	}

	@Schema(description = "Incluir biometria")
	public List<IncludeBiometryPendency> getIncludeBiometry() {
		return this.includeBiometry;
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
			this.excludeBiometry = new ArrayList<>();
		}
		this.excludeBiometry.add(excludeBiometryItem);
		return this;
	}

	@Schema(description = "Excluir biometria ")
	public List<ExcludeBiometryPendency> getExcludeBiometry() {
		return this.excludeBiometry;
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
			this.device = new ArrayList<>();
		}
		this.device.add(deviceItem);
		return this;
	}

	@Schema(description = "A configuração do dispositivo sofreu alguma alteração ou o dispositivo precisa ser configurado")
	public List<DeviceUpdatedPendency> getDevice() {
		return this.device;
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
			this.loadHolidayList = new ArrayList<>();
		}
		this.loadHolidayList.add(loadHolidayListItem);
		return this;
	}

	@Schema(description = "Carregar a lista de feriados no dispositivo")
	public List<LoadHolidayListPendency> getLoadHolidayList() {
		return this.loadHolidayList;
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
			this.removeHolidayList = new ArrayList<>();
		}
		this.removeHolidayList.add(removeHolidayListItem);
		return this;
	}

	@Schema(description = "Remover a lista de feriados do dispositivo")
	public List<DevicePendency> getRemoveHolidayList() {
		return this.removeHolidayList;
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
			this.activateDeviceOutput = new ArrayList<>();
		}
		this.activateDeviceOutput.add(activateDeviceOutputItem);
		return this;
	}

	@Schema(description = "Ativar uma saída digital do dispositivo")
	public List<ActiveDeviceOutputPendency> getActivateDeviceOutput() {
		return this.activateDeviceOutput;
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
			this.deactivateDeviceOutput = new ArrayList<>();
		}
		this.deactivateDeviceOutput.add(deactivateDeviceOutputItem);
		return this;
	}

	@Schema(description = "Desativar uma saída digital do dispositivo")
	public List<DeactiveDeviceOutputPendency> getDeactivateDeviceOutput() {
		return this.deactivateDeviceOutput;
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
			this.datamartUpdated = new ArrayList<>();
		}
		this.datamartUpdated.add(datamartUpdatedItem);
		return this;
	}

	@Schema(description = "Datamart atualizado")
	public List<DatamartUpdatedPendency> getDatamartUpdated() {
		return this.datamartUpdated;
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
			this.personLocationUpdated = new ArrayList<>();
		}
		this.personLocationUpdated.add(personLocationUpdatedItem);
		return this;
	}

	@Schema(description = "Atualiza o local físico da pessoa")
	public List<PersonAreaUpdatedPendency> getPersonLocationUpdated() {
		return this.personLocationUpdated;
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
			this.collectEvent = new ArrayList<>();
		}
		this.collectEvent.add(collectEventItem);
		return this;
	}

	@Schema(description = "Realizar a coleta de eventos de um dispositivo. ")
	public List<CollectEventPendency> getCollectEvent() {
		return this.collectEvent;
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
			this.inputStatus = new ArrayList<>();
		}
		this.inputStatus.add(inputStatusItem);
		return this;
	}

	@Schema(description = "Verificar o status da uma entrada")
	public List<DevicePendency> getInputStatus() {
		return this.inputStatus;
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
			this.manufacturerUpdated = new ArrayList<>();
		}
		this.manufacturerUpdated.add(manufacturerUpdatedItem);
		return this;
	}

	@Schema(description = "Os dados da empresa do REP foram atualizados")
	public List<ManufacturerUpdatedPendency> getManufacturerUpdated() {
		return this.manufacturerUpdated;
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
			this.updatePersonREP = new ArrayList<>();
		}
		this.updatePersonREP.add(updatePersonREPItem);
		return this;
	}

	@Schema(description = "Incluir uma pessoa no REP")
	public List<UpdatePersonREPPendency> getUpdatePersonREP() {
		return this.updatePersonREP;
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
			this.loadAllowCardList = new ArrayList<>();
		}
		this.loadAllowCardList.add(loadAllowCardListItem);
		return this;
	}

	@Schema(description = "Inclusão da lista de liberação")
	public List<DevicePendency> getLoadAllowCardList() {
		return this.loadAllowCardList;
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
			this.removeAllowCardList = new ArrayList<>();
		}
		this.removeAllowCardList.add(removeAllowCardListItem);
		return this;
	}

	@Schema(description = "Remover a lista de liberação do dispositivo")
	public List<DevicePendency> getRemoveAllowCardList() {
		return this.removeAllowCardList;
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
			this.loadBiometryList = new ArrayList<>();
		}
		this.loadBiometryList.add(loadBiometryListItem);
		return this;
	}

	@Schema(description = "Incluir uma lista de biometria no dispositivo ")
	public List<DevicePendency> getLoadBiometryList() {
		return this.loadBiometryList;
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
			this.removeBiometryList = new ArrayList<>();
		}
		this.removeBiometryList.add(removeBiometryListItem);
		return this;
	}

	@Schema(description = "Remover da lista de biometria do dispositivo ")
	public List<DevicePendency> getRemoveBiometryList() {
		return this.removeBiometryList;
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
			this.includeCard = new ArrayList<>();
		}
		this.includeCard.add(includeCardItem);
		return this;
	}

	@Schema(description = "Incluir um cartão no dispositivo")
	public List<IncludeCardPendency> getIncludeCard() {
		return this.includeCard;
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
			this.excludeCard = new ArrayList<>();
		}
		this.excludeCard.add(excludeCardItem);
		return this;
	}

	@Schema(description = "Remover um cartão no dispositivo")
	public List<ExcludeCardPendency> getExcludeCard() {
		return this.excludeCard;
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
			this.deviceDisplayMessage = new ArrayList<>();
		}
		this.deviceDisplayMessage.add(deviceDisplayMessageItem);
		return this;
	}

	@Schema(description = "Exibir mensagem no display do dispositivo")
	public List<DeviceDisplayMessagePendency> getDeviceDisplayMessage() {
		return this.deviceDisplayMessage;
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
			this.updateFirmware = new ArrayList<>();
		}
		this.updateFirmware.add(updateFirmwareItem);
		return this;
	}

	@Schema(description = "Atualização do firmware do dispositivo")
	public List<DevicePendency> getUpdateFirmware() {
		return this.updateFirmware;
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
			this.includePhoto = new ArrayList<>();
		}
		this.includePhoto.add(includePhotoItem);
		return this;
	}

	@Schema(description = "Incluir foto no dispositivo para reconhecimento facial")
	public List<IncludePhotoPendency> getIncludePhoto() {
		return this.includePhoto;
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
			this.excludePhoto = new ArrayList<>();
		}
		this.excludePhoto.add(excludePhotoItem);
		return this;
	}

	@Schema(description = "Excluir foto do dispositivo")
	public List<ExcludePhotoPendency> getExcludePhoto() {
		return this.excludePhoto;
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
			this.loadCredentialFacialList = new ArrayList<>();
		}
		this.loadCredentialFacialList.add(loadCredentialFacialListItem);
		return this;
	}

	@Schema(description = "Incluir uma lista de credencial facial no dispositivo ")
	public List<DevicePendency> getLoadCredentialFacialList() {
		return this.loadCredentialFacialList;
	}

	public void setLoadCredentialFacialList(List<DevicePendency> loadCredentialFacialList) {
		this.loadCredentialFacialList = loadCredentialFacialList;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AllPendency allPendency = (AllPendency) o;
		return (Objects.equals(this.deviceStatus, allPendency.deviceStatus)
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
				&& Objects.equals(this.loadCredentialFacialList, allPendency.loadCredentialFacialList));
	}

	public int hashCode() {
		return Objects.hash(new Object[] { this.deviceStatus, this.deviceDateTime, this.resetDevice, this.blockDevice,
				this.unblockDevice, this.setDeviceEmergency, this.unsetDeviceEmergency, this.apolloIncludeCard,
				this.apolloExcludeCard, this.includeBiometry, this.excludeBiometry, this.device, this.loadHolidayList,
				this.removeHolidayList, this.activateDeviceOutput, this.deactivateDeviceOutput, this.datamartUpdated,
				this.personLocationUpdated, this.collectEvent, this.inputStatus, this.manufacturerUpdated,
				this.updatePersonREP, this.loadAllowCardList, this.removeAllowCardList, this.loadBiometryList,
				this.removeBiometryList, this.includeCard, this.excludeCard, this.deviceDisplayMessage,
				this.updateFirmware, this.includePhoto, this.excludePhoto, this.loadCredentialFacialList });
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AllPendency {\n");

		sb.append("    deviceStatus: ").append(toIndentedString(this.deviceStatus)).append("\n");
		sb.append("    deviceDateTime: ").append(toIndentedString(this.deviceDateTime)).append("\n");
		sb.append("    resetDevice: ").append(toIndentedString(this.resetDevice)).append("\n");
		sb.append("    blockDevice: ").append(toIndentedString(this.blockDevice)).append("\n");
		sb.append("    unblockDevice: ").append(toIndentedString(this.unblockDevice)).append("\n");
		sb.append("    setDeviceEmergency: ").append(toIndentedString(this.setDeviceEmergency)).append("\n");
		sb.append("    unsetDeviceEmergency: ").append(toIndentedString(this.unsetDeviceEmergency)).append("\n");
		sb.append("    apolloIncludeCard: ").append(toIndentedString(this.apolloIncludeCard)).append("\n");
		sb.append("    apolloExcludeCard: ").append(toIndentedString(this.apolloExcludeCard)).append("\n");
		sb.append("    includeBiometry: ").append(toIndentedString(this.includeBiometry)).append("\n");
		sb.append("    excludeBiometry: ").append(toIndentedString(this.excludeBiometry)).append("\n");
		sb.append("    device: ").append(toIndentedString(this.device)).append("\n");
		sb.append("    loadHolidayList: ").append(toIndentedString(this.loadHolidayList)).append("\n");
		sb.append("    removeHolidayList: ").append(toIndentedString(this.removeHolidayList)).append("\n");
		sb.append("    activateDeviceOutput: ").append(toIndentedString(this.activateDeviceOutput)).append("\n");
		sb.append("    deactivateDeviceOutput: ").append(toIndentedString(this.deactivateDeviceOutput)).append("\n");
		sb.append("    datamartUpdated: ").append(toIndentedString(this.datamartUpdated)).append("\n");
		sb.append("    personLocationUpdated: ").append(toIndentedString(this.personLocationUpdated)).append("\n");
		sb.append("    collectEvent: ").append(toIndentedString(this.collectEvent)).append("\n");
		sb.append("    inputStatus: ").append(toIndentedString(this.inputStatus)).append("\n");
		sb.append("    manufacturerUpdated: ").append(toIndentedString(this.manufacturerUpdated)).append("\n");
		sb.append("    updatePersonREP: ").append(toIndentedString(this.updatePersonREP)).append("\n");
		sb.append("    loadAllowCardList: ").append(toIndentedString(this.loadAllowCardList)).append("\n");
		sb.append("    removeAllowCardList: ").append(toIndentedString(this.removeAllowCardList)).append("\n");
		sb.append("    loadBiometryList: ").append(toIndentedString(this.loadBiometryList)).append("\n");
		sb.append("    removeBiometryList: ").append(toIndentedString(this.removeBiometryList)).append("\n");
		sb.append("    includeCard: ").append(toIndentedString(this.includeCard)).append("\n");
		sb.append("    excludeCard: ").append(toIndentedString(this.excludeCard)).append("\n");
		sb.append("    deviceDisplayMessage: ").append(toIndentedString(this.deviceDisplayMessage)).append("\n");
		sb.append("    updateFirmware: ").append(toIndentedString(this.updateFirmware)).append("\n");
		sb.append("    includePhoto: ").append(toIndentedString(this.includePhoto)).append("\n");
		sb.append("    excludePhoto: ").append(toIndentedString(this.excludePhoto)).append("\n");
		sb.append("    loadCredentialFacialList: ").append(toIndentedString(this.loadCredentialFacialList))
				.append("\n");
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
