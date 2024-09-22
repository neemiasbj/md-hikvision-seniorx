package br.com.seniorx.interfaces;

public interface IMiddleware {

	public boolean handleDeviceStatusPendencies();

	public boolean handleDeviceDateTimePendencies();

	public boolean handleResetDevicePendencies();

	public boolean handleBlockDevicePendencies();

	public boolean handleUnblockDevicePendencies();

	public boolean handleSetDeviceEmergencyPendencies();

	public boolean handleUnsetDeviceEmergencyPendencies();

	public boolean handleApolloIncludeCardPendencies();

	public boolean handleApolloExcludeCardPendencies();

	public boolean handleIncludeBiometryPendencies();

	public boolean handleExcludeBiometryPendencies();

	public boolean handleDevicePendencies();

	public boolean handleLoadHolidayListPendencies();

	public boolean handleRemoveHolidayListPendencies();

	public boolean handleActivateDeviceOutputPendencies();

	public boolean handleDeactivateDeviceOutputPendencies();

	public boolean handleDatamartUpdatedPendencies();

	public boolean handlePersonLocationUpdatedPendencies();

	public boolean handleCollectEventPendencies();

	public boolean handleInputStatusPendencies();

	public boolean handleManufacturerUpdatedPendencies();

	public boolean handleUpdatePersonREPPendencies();

	public boolean handleLoadAllowCardListPendencies();

	public boolean handleRemoveAllowCardListPendencies();

	public boolean handleLoadBiometryListPendencies();

	public boolean handleRemoveBiometryListPendencies();

	public boolean handleIncludeCardPendencies();

	public boolean handleExcludeCardPendencies();

	public boolean handleDeviceDisplayMessagePendencies();

	public boolean handleUpdateFirmwarePendencies();

	public boolean handleIncludePhotoPendencies();

	public boolean handleExcludePhotoPendencies();

	public boolean handleLoadCredentialFacialList();
}
