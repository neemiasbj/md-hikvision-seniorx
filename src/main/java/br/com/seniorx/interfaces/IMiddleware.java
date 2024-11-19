package br.com.seniorx.interfaces;

public interface IMiddleware {
  boolean handleDeviceStatusPendencies();
  
  boolean handleDeviceDateTimePendencies();
  
  boolean handleResetDevicePendencies();
  
  boolean handleBlockDevicePendencies();
  
  boolean handleUnblockDevicePendencies();
  
  boolean handleSetDeviceEmergencyPendencies();
  
  boolean handleUnsetDeviceEmergencyPendencies();
  
  boolean handleApolloIncludeCardPendencies();
  
  boolean handleApolloExcludeCardPendencies();
  
  boolean handleIncludeBiometryPendencies();
  
  boolean handleExcludeBiometryPendencies();
  
  boolean handleDevicePendencies();
  
  boolean handleLoadHolidayListPendencies();
  
  boolean handleRemoveHolidayListPendencies();
  
  boolean handleActivateDeviceOutputPendencies();
  
  boolean handleDeactivateDeviceOutputPendencies();
  
  boolean handleDatamartUpdatedPendencies();
  
  boolean handlePersonLocationUpdatedPendencies();
  
  boolean handleCollectEventPendencies();
  
  boolean handleInputStatusPendencies();
  
  boolean handleManufacturerUpdatedPendencies();
  
  boolean handleUpdatePersonREPPendencies();
  
  boolean handleLoadAllowCardListPendencies();
  
  boolean handleRemoveAllowCardListPendencies();
  
  boolean handleLoadBiometryListPendencies();
  
  boolean handleRemoveBiometryListPendencies();
  
  boolean handleIncludeCardPendencies();
  
  boolean handleExcludeCardPendencies();
  
  boolean handleDeviceDisplayMessagePendencies();
  
  boolean handleUpdateFirmwarePendencies();
  
  boolean handleIncludePhotoPendencies();
  
  boolean handleExcludePhotoPendencies();
  
  boolean handleLoadCredentialFacialList();
}


