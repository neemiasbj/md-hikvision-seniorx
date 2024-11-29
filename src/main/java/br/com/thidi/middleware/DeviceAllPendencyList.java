package br.com.thidi.middleware;

import java.util.ArrayList;
import java.util.List;

import br.com.seniorx.models.ActiveDeviceOutputPendency;
import br.com.seniorx.models.AllPendency;
import br.com.seniorx.models.ApolloExcludeCardPendency;
import br.com.seniorx.models.ApolloIncludeCardPendency;
import br.com.seniorx.models.BlockDevicePendency;
import br.com.seniorx.models.CollectEventPendency;
import br.com.seniorx.models.DatamartUpdatedPendency;
import br.com.seniorx.models.DeactiveDeviceOutputPendency;
import br.com.seniorx.models.DeviceDisplayMessagePendency;
import br.com.seniorx.models.DevicePendency;
import br.com.seniorx.models.DeviceUpdatedPendency;
import br.com.seniorx.models.ExcludeBiometryPendency;
import br.com.seniorx.models.ExcludeCardPendency;
import br.com.seniorx.models.ExcludePhotoPendency;
import br.com.seniorx.models.IncludeBiometryPendency;
import br.com.seniorx.models.IncludeCardPendency;
import br.com.seniorx.models.IncludePhotoPendency;
import br.com.seniorx.models.LoadHolidayListPendency;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.ManufacturerUpdatedPendency;
import br.com.seniorx.models.PersonAreaUpdatedPendency;
import br.com.seniorx.models.SetDeviceEmergencyPendency;
import br.com.seniorx.models.UnblockDevicePendency;
import br.com.seniorx.models.UnsetDeviceEmergencyPendency;
import br.com.seniorx.models.UpdatePersonREPPendency;
import br.com.seniorx.services.SeniorService;

public class DeviceAllPendencyList {

	private List<DeviceAndPendencies> deviceAndPendency = new ArrayList<DeviceAndPendencies>();
	private List<DatamartUpdatedPendency> datamartPendencies = new ArrayList<DatamartUpdatedPendency>();

	public void addPendencyToDevice(Long deviceId, Object pendency, DevicePendencyType devicePendencyType) {
		Integer index = getDeviceIndexById(deviceId);
		if (devicePendencyType == DevicePendencyType.DATAMARTUPDATED) {
			datamartPendencies.add((DatamartUpdatedPendency) pendency);
		} else if (index == null) {
			ManagerDevice device = SeniorService.getDevice(deviceId);
			AllPendency devicePendency = new AllPendency();
			deviceAndPendency.add(new DeviceAndPendencies(device, devicePendency));
			addPendency(0, devicePendencyType, pendency);
		} else
			addPendency(index, devicePendencyType, pendency);
	}

	public enum DevicePendencyType {
		DATAMARTUPDATED, DEVICESTATUS, DEVICEDATETIME, RESETDEVICE, BLOCKDEVICE, UNBLOCKDEVICE, SETDEVICEEMERGENCY,
		UNSETDEVICEEMERGENCY, APOLLOINCLUDECARD, APOLLOEXCLUDECARD, INCLUDEBIOMETRY, EXCLUDEBIOMETRY, DEVICE,
		LOADHOLIDAYLIST, REMOVEHOLIDAYLIST, ACTIVATEDEVICEOUTPUT, DEACTIVATEDEVICEOUTPUT, PERSONLOCATIONUPDATED,
		COLLECTEVENT, INPUTSTATUS, MANUFACTURERUPDATED, UPDATEPERSONREP, LOADALLOWCARDLIST, REMOVEALLOWCARDLIST,
		LOADBIOMETRYLIST, REMOVEBIOMETRYLIST, INCLUDECARD, EXCLUDECARD, DEVICEDISPLAYMESSAGE, UPDATEFIRMWARE,
		INCLUDEPHOTO, EXCLUDEPHOTO, LOADCREDENTIALFACIALLIST, DEVICEUPDATE
	}

	private Integer getDeviceIndexById(Long deviceId) {
		Integer index = null;
		for (int i = 0; i < deviceAndPendency.size(); i++)
			if (deviceAndPendency.get(i).getDevice().getId() == deviceId)
				return index;
		return index;
	}

	private void addPendency(Integer index, DevicePendencyType devicePendencyType, Object pendency) {
		if (devicePendencyType == DevicePendencyType.DATAMARTUPDATED)
			datamartPendencies.add((DatamartUpdatedPendency) pendency);
		if (devicePendencyType == DevicePendencyType.DEVICESTATUS)
			deviceAndPendency.get(index).getPendencies().addDeviceStatusItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.DEVICEDATETIME)
			deviceAndPendency.get(index).getPendencies().addDeviceDateTimeItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.RESETDEVICE)
			deviceAndPendency.get(index).getPendencies().addResetDeviceItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.BLOCKDEVICE)
			deviceAndPendency.get(index).getPendencies().addBlockDeviceItem((BlockDevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.UNBLOCKDEVICE)
			deviceAndPendency.get(index).getPendencies().addUnblockDeviceItem((UnblockDevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.SETDEVICEEMERGENCY)
			deviceAndPendency.get(index).getPendencies()
					.addSetDeviceEmergencyItem((SetDeviceEmergencyPendency) pendency);
		if (devicePendencyType == DevicePendencyType.UNSETDEVICEEMERGENCY)
			deviceAndPendency.get(index).getPendencies()
					.addUnsetDeviceEmergencyItem((UnsetDeviceEmergencyPendency) pendency);
		if (devicePendencyType == DevicePendencyType.APOLLOINCLUDECARD)
			deviceAndPendency.get(index).getPendencies().addApolloIncludeCardItem((ApolloIncludeCardPendency) pendency);
		if (devicePendencyType == DevicePendencyType.APOLLOINCLUDECARD)
			deviceAndPendency.get(index).getPendencies().addApolloExcludeCardItem((ApolloExcludeCardPendency) pendency);
		if (devicePendencyType == DevicePendencyType.INCLUDEBIOMETRY)
			deviceAndPendency.get(index).getPendencies().addIncludeBiometryItem((IncludeBiometryPendency) pendency);
		if (devicePendencyType == DevicePendencyType.EXCLUDEBIOMETRY)
			deviceAndPendency.get(index).getPendencies().addExcludeBiometryItem((ExcludeBiometryPendency) pendency);
		if (devicePendencyType == DevicePendencyType.DEVICEUPDATE)
			deviceAndPendency.get(index).getPendencies().addDeviceItem((DeviceUpdatedPendency) pendency);
		if (devicePendencyType == DevicePendencyType.LOADHOLIDAYLIST)
			deviceAndPendency.get(index).getPendencies().addLoadHolidayListItem((LoadHolidayListPendency) pendency);
		if (devicePendencyType == DevicePendencyType.REMOVEHOLIDAYLIST)
			deviceAndPendency.get(index).getPendencies().addRemoveHolidayListItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.ACTIVATEDEVICEOUTPUT)
			deviceAndPendency.get(index).getPendencies()
					.addActivateDeviceOutputItem((ActiveDeviceOutputPendency) pendency);
		if (devicePendencyType == DevicePendencyType.DEACTIVATEDEVICEOUTPUT)
			deviceAndPendency.get(index).getPendencies()
					.addDeactivateDeviceOutputItem((DeactiveDeviceOutputPendency) pendency);
		if (devicePendencyType == DevicePendencyType.PERSONLOCATIONUPDATED)
			deviceAndPendency.get(index).getPendencies()
					.addPersonLocationUpdatedItem((PersonAreaUpdatedPendency) pendency);
		if (devicePendencyType == DevicePendencyType.COLLECTEVENT)
			deviceAndPendency.get(index).getPendencies().addCollectEventItem((CollectEventPendency) pendency);
		if (devicePendencyType == DevicePendencyType.INPUTSTATUS)
			deviceAndPendency.get(index).getPendencies().addInputStatusItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.MANUFACTURERUPDATED)
			deviceAndPendency.get(index).getPendencies()
					.addManufacturerUpdatedItem((ManufacturerUpdatedPendency) pendency);
		if (devicePendencyType == DevicePendencyType.UPDATEPERSONREP)
			deviceAndPendency.get(index).getPendencies().addUpdatePersonREPItem((UpdatePersonREPPendency) pendency);
		if (devicePendencyType == DevicePendencyType.LOADALLOWCARDLIST)
			deviceAndPendency.get(index).getPendencies().addLoadAllowCardListItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.REMOVEALLOWCARDLIST)
			deviceAndPendency.get(index).getPendencies().addRemoveAllowCardListItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.LOADBIOMETRYLIST)
			deviceAndPendency.get(index).getPendencies().addLoadBiometryListItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.REMOVEBIOMETRYLIST)
			deviceAndPendency.get(index).getPendencies().addRemoveBiometryListItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.INCLUDECARD)
			deviceAndPendency.get(index).getPendencies().addIncludeCardItem((IncludeCardPendency) pendency);
		if (devicePendencyType == DevicePendencyType.EXCLUDECARD)
			deviceAndPendency.get(index).getPendencies().addExcludeCardItem((ExcludeCardPendency) pendency);
		if (devicePendencyType == DevicePendencyType.DEVICEDISPLAYMESSAGE)
			deviceAndPendency.get(index).getPendencies()
					.addDeviceDisplayMessageItem((DeviceDisplayMessagePendency) pendency);
		if (devicePendencyType == DevicePendencyType.UPDATEFIRMWARE)
			deviceAndPendency.get(index).getPendencies().addUpdateFirmwareItem((DevicePendency) pendency);
		if (devicePendencyType == DevicePendencyType.INCLUDEPHOTO)
			deviceAndPendency.get(index).getPendencies().addIncludePhotoItem((IncludePhotoPendency) pendency);
		if (devicePendencyType == DevicePendencyType.EXCLUDEPHOTO)
			deviceAndPendency.get(index).getPendencies().addExcludePhotoItem((ExcludePhotoPendency) pendency);
		if (devicePendencyType == DevicePendencyType.LOADCREDENTIALFACIALLIST)
			deviceAndPendency.get(index).getPendencies().addLoadCredentialFacialListItem((DevicePendency) pendency);
	}

	public List<DeviceAndPendencies> getDeviceAndPendency() {
		return deviceAndPendency;
	}

	public void setDatamartPendencies(List<DatamartUpdatedPendency> datamartPendencies) {
		this.datamartPendencies = datamartPendencies;
	}

	public List<DatamartUpdatedPendency> getDatamartPendencies() {
		return datamartPendencies;
	}

	public class DeviceAndPendencies {
		ManagerDevice device;
		AllPendency pendencies;

		public DeviceAndPendencies(ManagerDevice device, AllPendency pendencies) {
			this.device = device;
			this.pendencies = pendencies;
		}

		public ManagerDevice getDevice() {
			return device;
		}

		public AllPendency getPendencies() {
			return pendencies;
		}

	}

}
