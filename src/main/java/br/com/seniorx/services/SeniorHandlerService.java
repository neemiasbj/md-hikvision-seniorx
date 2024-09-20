package br.com.seniorx.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import br.com.hikvision.minmoe.models.DateTime;
import br.com.hikvision.minmoe.models.DeviceInfo;
import br.com.hikvision.minmoe.models.ExcludePhotoRequest;
import br.com.hikvision.minmoe.models.IncludeFaceRequest;
import br.com.hikvision.minmoe.models.SearchPhotoRequest;
import br.com.hikvision.minmoe.models.User;
import br.com.hikvision.services.HikvisionMinMoeService;
import br.com.seniorx.models.ActiveDeviceOutputPendency;
import br.com.seniorx.models.AllPendency;
import br.com.seniorx.models.ApolloExcludeCardPendency;
import br.com.seniorx.models.ApolloIncludeCardPendency;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.BlockDevicePendency;
import br.com.seniorx.models.CollectEventPendency;
import br.com.seniorx.models.DatamartUpdatedPendency;
import br.com.seniorx.models.DeactiveDeviceOutputPendency;
import br.com.seniorx.models.DeviceDisplayMessagePendency;
import br.com.seniorx.models.DevicePendency;
import br.com.seniorx.models.DeviceUpdatedPendency;
import br.com.seniorx.models.Event;
import br.com.seniorx.models.Event.EventTypeEnum;
import br.com.seniorx.models.ExcludeBiometryPendency;
import br.com.seniorx.models.ExcludeCardPendency;
import br.com.seniorx.models.ExcludePhotoPendency;
import br.com.seniorx.models.IncludeBiometryPendency;
import br.com.seniorx.models.IncludeCardPendency;
import br.com.seniorx.models.IncludePhotoPendency;
import br.com.seniorx.models.LoadHolidayListPendency;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.ManufacturerUpdatedPendency;
import br.com.seniorx.models.OnOffStatusEnum;
import br.com.seniorx.models.OperationEnum;
import br.com.seniorx.models.OperationUpdateDeviceEnum;
import br.com.seniorx.models.PendencyExecuted;
import br.com.seniorx.models.PendencyUpdated;
import br.com.seniorx.models.PersonAreaUpdatedPendency;
import br.com.seniorx.models.PersonPhotoTemplates;
import br.com.seniorx.models.SetDeviceEmergencyPendency;
import br.com.seniorx.models.UnblockDevicePendency;
import br.com.seniorx.models.UnsetDeviceEmergencyPendency;
import br.com.seniorx.models.UpdatePersonREPPendency;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.utils.PropertiesUtilImpl;

@Service
public class SeniorHandlerService {

	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
	private int interval = PropertiesUtilImpl.getValor("time.keep.alive.senior.seconds").isEmpty() ? 30 : Integer.valueOf(PropertiesUtilImpl.getValor("time.keep.alive.senior.seconds"));
	private static SimpleDateFormat sdfyyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	Calendar calendar = Calendar.getInstance();

	public void start() {
//		executorService.scheduleAtFixedRate(() -> {
//		}, 0, interval, TimeUnit.SECONDS);

		executorService.scheduleAtFixedRate(() -> {
			handleKeepAlive();
			HandleDevicesPendencies();
		}, 0, interval, TimeUnit.SECONDS);
	}

	private final static DateFormat seniorDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public void handleKeepAlive() {
		CLogger.logSeniorInfo("KEEP ALIVE", "Checking devices...");

		try {
			List<ManagerDevice> devices = SeniorApiService.getDevices();

			if (devices == null || devices.size() == 0) {
				CLogger.logSeniorInfo("KEEP ALIVE", "No devices found.");
			} else {
				for (ManagerDevice device : devices) {
					Thread keepAlvive = new Thread(() -> {
						HikvisionMinMoeService minmoeService = new HikvisionMinMoeService(device);
						SeniorApiService seniorService = new SeniorApiService();
						seniorService.setDevice(device);

						checkDeviceStatus(null, seniorService, minmoeService, device.getId());
					});
					keepAlvive.start();
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorInfo("KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public void HandleDevicesPendencies() {
		CLogger.logSeniorInfo("PENDENCIES KEEP ALIVE", "Checking pendencies...");
		try {
			SeniorApiService seniorService = new SeniorApiService();
			List<ManagerDevice> devices = SeniorApiService.getDevices();

			if (devices == null) {
				CLogger.logSeniorInfo("KEEP ALIVE", "No devices found.");
			} else {
				for (ManagerDevice device : devices) {
					Thread pendnciesHandler = new Thread(() -> {
						HikvisionMinMoeService minmoeService = new HikvisionMinMoeService(device);
						seniorService.setDevice(device);

						AllPendency allPendencies = seniorService.getDevicePendencies(device.getId());

						HandleDevicePendencies(allPendencies, minmoeService, seniorService);
					});
					pendnciesHandler.start();
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorInfo("KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public static void HandleWebSocketMessage(Long deviceId) {

		ManagerDevice device = SeniorApiService.getDevice(deviceId);

		if (device == null)
			CLogger.logSeniorInfo("HANDLE WEBSOCKET MESSAGE", "Device not found for id: " + deviceId);
		else {
			SeniorApiService seniorService = new SeniorApiService();
			seniorService.setDevice(device);
			AllPendency pendencies = seniorService.getDevicePendencies(deviceId);
			HikvisionMinMoeService hikvisionService = new HikvisionMinMoeService(device);

			HandleDevicePendencies(pendencies, hikvisionService, seniorService);
		}

	}

	private static void HandleDevicePendencies(AllPendency pendencies, HikvisionMinMoeService minmoeService, SeniorApiService seniorService) {
		handleDeviceStatusPendencies(pendencies.getDeviceStatus(), seniorService, minmoeService);
		handleDeviceDateTimePendencies(pendencies.getDeviceDateTime(), seniorService, minmoeService);
		handleResetDevicePendencies(pendencies.getResetDevice(), seniorService);
		handleBlockDevicePendencies(pendencies.getBlockDevice(), seniorService, minmoeService);
		handleUnblockDevicePendencies(pendencies.getUnblockDevice(), seniorService, minmoeService);
		handleSetDeviceEmergencyPendencies(pendencies.getSetDeviceEmergency(), seniorService, minmoeService);
		handleUnsetDeviceEmergencyPendencies(pendencies.getUnsetDeviceEmergency(), seniorService, minmoeService);
		handleApolloIncludeCardPendencies(pendencies.getApolloIncludeCard(), seniorService);
		handleApolloExcludeCardPendencies(pendencies.getApolloExcludeCard(), seniorService);
		handleIncludeBiometryPendencies(pendencies.getIncludeBiometry(), seniorService);
		handleExcludeBiometryPendencies(pendencies.getExcludeBiometry(), seniorService);
		handleDevicePendencies(pendencies.getDevice(), seniorService, minmoeService);
		handleLoadHolidayListPendencies(pendencies.getLoadHolidayList(), seniorService);
		handleRemoveHolidayListPendencies(pendencies.getRemoveHolidayList(), seniorService);
		handleActivateDeviceOutputPendencies(pendencies.getActivateDeviceOutput(), seniorService);
		handleDeactivateDeviceOutputPendencies(pendencies.getDeactivateDeviceOutput(), seniorService);
		handleDatamartUpdatedPendencies(pendencies.getDatamartUpdated(), seniorService);
		handlePersonLocationUpdatedPendencies(pendencies.getPersonLocationUpdated(), seniorService);
		handleCollectEventPendencies(pendencies.getCollectEvent(), seniorService);
		handleInputStatusPendencies(pendencies.getInputStatus(), seniorService);
		handleManufacturerUpdatedPendencies(pendencies.getManufacturerUpdated(), seniorService);
		handleUpdatePersonREPPendencies(pendencies.getUpdatePersonREP(), seniorService);
		handleLoadAllowCardListPendencies(pendencies.getLoadAllowCardList(), seniorService);
		handleRemoveAllowCardListPendencies(pendencies.getRemoveBiometryList(), seniorService);
		handleLoadBiometryListPendencies(pendencies.getLoadBiometryList(), seniorService);
		handleRemoveBiometryListPendencies(pendencies.getRemoveBiometryList(), seniorService);
		handleIncludeCardPendencies(pendencies.getIncludeCard(), seniorService);
		handleExcludeCardPendencies(pendencies.getExcludeCard(), seniorService);
		handleDeviceDisplayMessagePendencies(pendencies.getDeviceDisplayMessage(), seniorService);
		handleUpdateFirmwarePendencies(pendencies.getUpdateFirmware(), seniorService);
		handleIncludePhotoPendencies(pendencies.getIncludePhoto(), seniorService, minmoeService);
		handleExcludePhotoPendencies(pendencies.getExcludePhoto(), seniorService, minmoeService);
		handleLoadCredentialFacialList(pendencies.getLoadCredentialFacialList(), seniorService, minmoeService);
	}

	private static void sendSuccessPendency(SeniorApiService seniorService, Long pendencyId) {
		List<PendencyExecuted> pendenciesSuccess = new ArrayList<PendencyExecuted>();
		PendencyExecuted pendencyExecuted = new PendencyExecuted();
		pendencyExecuted.setPendencyId(pendencyId);
		pendenciesSuccess.add(pendencyExecuted);
		seniorService.updatePendenciesExecuted(pendenciesSuccess);
		CLogger.logSeniorDebug("DeviceDateTimePendencies", "OK");
	}

	private static void updatePendencyStatus(SeniorApiService seniorService, Long pendencyId, OperationEnum status) {
		List<PendencyUpdated> pendenciesUpdate = new ArrayList<PendencyUpdated>();
		PendencyUpdated pendencyUpdated = new PendencyUpdated();
		pendencyUpdated.setPendencyId(pendencyId);
		pendencyUpdated.setOperation(status);
		pendencyUpdated.setErrorCode(345);
		pendenciesUpdate.add(pendencyUpdated);
		seniorService.updatePendenciesStatus(pendenciesUpdate);
	}

	private static void handleDeviceStatusPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {

		if (pendencies != null)
			for (DevicePendency pendency : pendencies)
				checkDeviceStatus(pendency, seniorService, minmoeService, null);
		else
			CLogger.logSeniorDebug("CHECK STATUS PENDENCY", "No check status pendency for device " + seniorService.getDevice().getId());

	}

	private static void checkDeviceStatus(DevicePendency pendency, SeniorApiService seniorService, HikvisionMinMoeService minmoeService, Long deviceId) {

		DeviceInfo deviceInfo = minmoeService.getDeviceInfo();

		Boolean deviceStatus = deviceInfo == null ? false : true;

		AreaControlList areaControl = seniorService.getAreaById(seniorService.getDevice().getAreaId());
		if (areaControl == null) {
			return;
		}

		if (pendency != null)
			if (deviceStatus) {
				List<PendencyExecuted> pendenciesExecuted = new ArrayList<PendencyExecuted>();
				PendencyExecuted pendencyExecuted = new PendencyExecuted();
				pendencyExecuted.setPendencyId(pendency.getPendencyId());
				pendenciesExecuted.add(pendencyExecuted);
				seniorService.updatePendenciesExecuted(pendenciesExecuted);
				CLogger.logSeniorDebug("DEVICE STATUS", "OK");
			} else {
				List<PendencyUpdated> pendenciesUpdate = new ArrayList<PendencyUpdated>();
				PendencyUpdated pendencyUpdated = new PendencyUpdated();
				pendencyUpdated.setPendencyId(pendency.getPendencyId());
				pendencyUpdated.setOperation(OperationEnum.KEEP_PENDENCY);
				seniorService.updatePendenciesStatus(pendenciesUpdate);
				CLogger.logSeniorDebug("DEVICE STATUS", "ERROR");
			}
		else {

			List<Event> events = new ArrayList<Event>();
			Event event = new Event();
			event.setDate(seniorDateTime.format(new Date()));
			event.setDeviceId(deviceId.intValue());
			event.setEventType(deviceStatus ? EventTypeEnum.DEVICE_ONLINE : EventTypeEnum.DEVICE_OFFLINE);
			event.setStatus(OnOffStatusEnum.ONLINE);
			event.setTimezoneOffset(areaControl.getGmt());
			events.add(event);

			seniorService.sendEventList(events);
		}
	}

	private static void handleDeviceDateTimePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {

				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
					DateTime dateTime = new DateTime("manual", sdf.format(new Date()), HikvisionMinMoeService.minutesToUtcString(seniorService.getAreaById(seniorService.getDevice().getAreaId()).getGmt()));

					Boolean success = minmoeService.setDateTime(dateTime);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug("IncludePhotoPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
						CLogger.logSeniorError("IncludePhotoPendencies", "ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("IncludePhotoPendencies", e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError("IncludePhotoPendencies", e.getMessage());
		}
	}

	private static void handleResetDevicePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {

		try {
			for (DevicePendency pendency : pendencies) {
				List<PendencyUpdated> pendenciesUpdate = new ArrayList<PendencyUpdated>();
				PendencyUpdated pendencyUpdated = new PendencyUpdated();
				pendencyUpdated.setPendencyId(pendency.getPendencyId());
				pendencyUpdated.setOperation(OperationEnum.KEEP_PENDENCY);
				seniorService.updatePendenciesStatus(pendenciesUpdate);
				CLogger.logSeniorDebug("ResetDevicePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ResetDevicePendencies", e.getMessage());
		}
	}

	private static void handleBlockDevicePendencies(List<BlockDevicePendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (BlockDevicePendency pendency : pendencies) {

				try {
					Boolean success = minmoeService.keepDoorClosed();

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug("IncludePhotoPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
						CLogger.logSeniorError("IncludePhotoPendencies", "ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("BlockDevicePendencies", e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError("BlockDevicePendencies", e.getMessage());
		}
	}

	private static void handleUnblockDevicePendencies(List<UnblockDevicePendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (UnblockDevicePendency pendency : pendencies) {

				try {
					Boolean success = minmoeService.closeDoor();

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug("IncludePhotoPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
						CLogger.logSeniorError("IncludePhotoPendencies", "ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("UnblockDevicePendencies", e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError("UnblockDevicePendencies", e.getMessage());
		}
	}

	private static void handleSetDeviceEmergencyPendencies(List<SetDeviceEmergencyPendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {

		for (SetDeviceEmergencyPendency pendency : pendencies) {

			try {
				Boolean success = minmoeService.openDoor();

				if (success) {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug("SetDeviceEmergencyPendencies", "OK");
				} else {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("SetDeviceEmergencyPendencies", "ERROR");

				}
			} catch (Exception e) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorError("SetDeviceEmergencyPendencies", e.getMessage());
			}

		}
	}

	private static void handleUnsetDeviceEmergencyPendencies(List<UnsetDeviceEmergencyPendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		for (UnsetDeviceEmergencyPendency pendency : pendencies) {

			try {
				Boolean success = minmoeService.closeDoor();

				if (success) {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug("UnsetDeviceEmergencyPendencies", "OK");
				} else {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("UnsetDeviceEmergencyPendencies", "ERROR");

				}
			} catch (Exception e) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorError("UnsetDeviceEmergencyPendencies", e.getMessage());
			}

		}
	}

	private static void handleApolloIncludeCardPendencies(List<ApolloIncludeCardPendency> pendencies, SeniorApiService seniorService) {
		try {
			for (ApolloIncludeCardPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("ApolloIncludeCardPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ApolloIncludeCardPendencies", e.getMessage());
		}
	}

	private static void handleApolloExcludeCardPendencies(List<ApolloExcludeCardPendency> pendencies, SeniorApiService seniorService) {
		try {
			for (ApolloExcludeCardPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("ApolloExcludeCardPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ApolloExcludeCardPendencies", e.getMessage());
		}
	}

	private static void handleIncludeBiometryPendencies(List<IncludeBiometryPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (IncludeBiometryPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("IncludeBiometryPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("IncludeBiometryPendencies", e.getMessage());
		}
	}

	private static void handleExcludeBiometryPendencies(List<ExcludeBiometryPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (ExcludeBiometryPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("ExcludeBiometryPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ExcludeBiometryPendencies", e.getMessage());
		}
	}

	private static void handleDevicePendencies(List<DeviceUpdatedPendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DeviceUpdatedPendency pendency : pendencies) {
				if (pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_CONFIG)) {
					ManagerDevice device = SeniorApiService.getDevice(pendency.getManagerDeviceId());
					Boolean success = minmoeService.configureDevice(device);
					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug("DevicePendencies", "OK");
					} else
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY);

				} else {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug("DevicePendencies", "OK");
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError("DevicePendencies", e.getMessage());
		}
	}

	private static void handleLoadHolidayListPendencies(List<LoadHolidayListPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (LoadHolidayListPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("LoadHolidayListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("LoadHolidayListPendencies", e.getMessage());
		}
	}

	private static void handleRemoveHolidayListPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("RemoveHolidayListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("RemoveHolidayListPendencies", e.getMessage());
		}
	}

	private static void handleActivateDeviceOutputPendencies(List<ActiveDeviceOutputPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (ActiveDeviceOutputPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("ActivateDeviceOutputPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ActivateDeviceOutputPendencies", e.getMessage());
		}
	}

	private static void handleDeactivateDeviceOutputPendencies(List<DeactiveDeviceOutputPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DeactiveDeviceOutputPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("DeactivateDeviceOutputPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("DeactivateDeviceOutputPendencies", e.getMessage());
		}
	}

	private static void handleDatamartUpdatedPendencies(List<DatamartUpdatedPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DatamartUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("DatamartUpdatedPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("DatamartUpdatedPendencies", e.getMessage());
		}
	}

	private static void handlePersonLocationUpdatedPendencies(List<PersonAreaUpdatedPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (PersonAreaUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("PersonLocationUpdatedPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("PersonLocationUpdatedPendencies", e.getMessage());
		}
	}

	private static void handleCollectEventPendencies(List<CollectEventPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (CollectEventPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("CollectEventPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("CollectEventPendencies", e.getMessage());
		}
	}

	private static void handleInputStatusPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("InputStatusPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("InputStatusPendencies", e.getMessage());
		}
	}

	private static void handleManufacturerUpdatedPendencies(List<ManufacturerUpdatedPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (ManufacturerUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("ManufacturerUpdatedPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ManufacturerUpdatedPendencies", e.getMessage());
		}
	}

	private static void handleUpdatePersonREPPendencies(List<UpdatePersonREPPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (UpdatePersonREPPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("UpdatePersonREPPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("UpdatePersonREPPendencies", e.getMessage());
		}
	}

	private static void handleLoadAllowCardListPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("LoadAllowCardListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("LoadAllowCardListPendencies", e.getMessage());
		}
	}

	private static void handleRemoveAllowCardListPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("RemoveAllowCardListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("RemoveAllowCardListPendencies", e.getMessage());
		}
	}

	private static void handleLoadBiometryListPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("LoadBiometryListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("LoadBiometryListPendencies", e.getMessage());
		}
	}

	private static void handleRemoveBiometryListPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("RemoveBiometryListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("RemoveBiometryListPendencies", e.getMessage());
		}
	}

	private static void handleIncludeCardPendencies(List<IncludeCardPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (IncludeCardPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("IncludeCardPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("IncludeCardPendencies", e.getMessage());
		}
	}

	private static void handleExcludeCardPendencies(List<ExcludeCardPendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (ExcludeCardPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("ExcludeCardPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ExcludeCardPendencies", e.getMessage());
		}
	}

	private static void handleDeviceDisplayMessagePendencies(List<DeviceDisplayMessagePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DeviceDisplayMessagePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("DeviceDisplayMessagePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("DeviceDisplayMessagePendencies", e.getMessage());
		}
	}

	private static void handleUpdateFirmwarePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {

				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
				CLogger.logSeniorDebug("UpdateFirmwarePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError("UpdateFirmwarePendencies", e.getMessage());
		}
	}

	private static void handleIncludePhotoPendencies(List<IncludePhotoPendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (IncludePhotoPendency pendency : pendencies) {

				try {
					User user = new User();

					User.UserInfo userInfo = new User.UserInfo();
					userInfo.setEmployeeNo(pendency.getPersonId().toString());
					userInfo.setName(pendency.getPersonName());
					userInfo.setUserType("normal");

					Date currentDate = new Date();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(currentDate);
					calendar.add(Calendar.YEAR, 10);
					Date datePlusTenYears = calendar.getTime();

					User.Valid valid = new User.Valid();
					valid.setEnable(true);
					valid.setBeginTime(sdfyyyyMMddHHmmss.format(currentDate));
					valid.setEndTime(sdfyyyyMMddHHmmss.format(datePlusTenYears));
					userInfo.setValid(valid);
					userInfo.setDoorRight("1");

					User.RightPlan rightPlan = new User.RightPlan();
					rightPlan.setDoorNo(1);
					rightPlan.setPlanTemplateNo("1");

					userInfo.setRightPlan(List.of(rightPlan));

					user.setUserInfo(userInfo);

					Boolean success = includePerson(user, pendency.getPhotoUrl(), minmoeService);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug("IncludePhotoPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
						CLogger.logSeniorError("IncludePhotoPendencies", "ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("IncludePhotoPendencies", e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError("IncludePhotoPendencies", e.getMessage());
		}
	}

	private static boolean includePerson(User user, String photoUrl, HikvisionMinMoeService minmoeService) {
		try {

			if (!minmoeService.includeUser(user))
				return false;

			SearchPhotoRequest photo = new SearchPhotoRequest();
			photo.setFPID(user.getUserInfo().getEmployeeNo());
			photo.setMaxResults(5);
			photo.setSearchResultPosition(0);

			Boolean hasPhoto = minmoeService.searchPhoto(photo);

			ExcludePhotoRequest exclude = new ExcludePhotoRequest();
			ExcludePhotoRequest.Fpid fpid = new ExcludePhotoRequest.Fpid();
			fpid.setValue(user.getUserInfo().getEmployeeNo());
			exclude.setFPID(Collections.singletonList(fpid));

			if (hasPhoto)
				minmoeService.excludePhoto(exclude);

			IncludeFaceRequest faceDataRequest = new IncludeFaceRequest(user.getUserInfo().getEmployeeNo());

			return minmoeService.includePhoto(faceDataRequest, photoUrl);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private static void handleExcludePhotoPendencies(List<ExcludePhotoPendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		// TODO
		try {
			for (ExcludePhotoPendency pendency : pendencies) {
				try {
					ExcludePhotoRequest fpidRequest = new ExcludePhotoRequest();
					ExcludePhotoRequest.Fpid fpid = new ExcludePhotoRequest.Fpid();
					fpid.setValue(pendency.getPersonId().toString());
					fpidRequest.setFPID(Collections.singletonList(fpid));

					Boolean success = minmoeService.excludePhoto(fpidRequest);
					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug("ExcludePhotoPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY);
						CLogger.logSeniorError("ExcludePhotoPendencies", "ERROR");
					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("ExcludePhotoPendencies", e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError("ExcludePhotoPendencies", e.getMessage());
		}
	}

	private static void handleLoadCredentialFacialList(List<DevicePendency> pendencies, SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {

		try {

			for (DevicePendency pendency : pendencies) {
				try {
					minmoeService.excludeAllUsers();

					List<PersonPhotoTemplates> personsInfo = seniorService.getCredentialFacialList();
//					Boolean success = false;

					for (PersonPhotoTemplates personInfo : personsInfo) {
						User user = new User();

						User.UserInfo userInfo = new User.UserInfo();
						userInfo.setEmployeeNo(personInfo.getPersonId().toString());
						userInfo.setName(personInfo.getName());
						userInfo.setUserType("normal");

						Date currentDate = new Date();
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(currentDate);
						calendar.add(Calendar.YEAR, 10);
						Date datePlusTenYears = calendar.getTime();

						User.Valid valid = new User.Valid();
						valid.setEnable(true);
						valid.setBeginTime(sdfyyyyMMddHHmmss.format(currentDate));
						valid.setEndTime(sdfyyyyMMddHHmmss.format(datePlusTenYears));
						userInfo.setValid(valid);
						userInfo.setDoorRight("1");

						User.RightPlan rightPlan = new User.RightPlan();
						rightPlan.setDoorNo(1);
						rightPlan.setPlanTemplateNo("1");

						userInfo.setRightPlan(List.of(rightPlan));

						user.setUserInfo(userInfo);

						Boolean success = includePerson(user, personInfo.getPhotoURL(), minmoeService);
						if (!success) {
							updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
							CLogger.logSeniorError("ExcludePhotoPendencies", "ERROR");
							return;
						}
					}

					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug("ExcludePhotoPendencies", "OK");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY);
					CLogger.logSeniorError("ExcludePhotoPendencies", e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError("LoadCredentialFacialList", e.getMessage());
		}

	}
}
