<<<<<<< HEAD

=======
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
package br.com.thidi.middleware.services;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hikvision.minmoe.models.DateTime;
import br.com.hikvision.minmoe.models.DeviceInfo;
<<<<<<< HEAD
import br.com.hikvision.minmoe.models.ExcludePhotoRequest;
import br.com.hikvision.minmoe.models.ExcludeUserCard;
import br.com.hikvision.minmoe.models.ExcludeUserFingerPrint;
import br.com.hikvision.minmoe.models.IncludeUser;
import br.com.hikvision.minmoe.models.IncludeUserCard;
import br.com.hikvision.minmoe.models.IncludeUserFaceRequest;
import br.com.hikvision.minmoe.models.IncludeUserFingerPrint;
import br.com.hikvision.minmoe.models.SearchPhotoRequest;
=======
import br.com.hikvision.minmoe.models.ExcludeUserCard;
import br.com.hikvision.minmoe.models.ExcludeUserFingerPrint;
import br.com.hikvision.minmoe.models.ExcludeUserPhoto;
import br.com.hikvision.minmoe.models.IncludeUser;
import br.com.hikvision.minmoe.models.IncludeUserCard;
import br.com.hikvision.minmoe.models.IncludeUserFace;
import br.com.hikvision.minmoe.models.IncludeUserFingerPrint;
import br.com.hikvision.minmoe.models.SearchPhoto;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
import br.com.hikvision.services.HikvisionMinMoeService;
import br.com.seniorx.ManagerDeviceList;
import br.com.seniorx.enums.PendencyUpdateStatus;
import br.com.seniorx.models.AccessBiometry;
import br.com.seniorx.models.ActiveDeviceOutputPendency;
import br.com.seniorx.models.AllPendency;
import br.com.seniorx.models.ApolloExcludeCardPendency;
import br.com.seniorx.models.ApolloIncludeCardPendency;
import br.com.seniorx.models.AreaControlList;
import br.com.seniorx.models.BlockDevicePendency;
import br.com.seniorx.models.CardList;
import br.com.seniorx.models.CollectEventPendency;
import br.com.seniorx.models.DatamartUpdatedPendency;
import br.com.seniorx.models.DeactiveDeviceOutputPendency;
import br.com.seniorx.models.DeviceDisplayMessagePendency;
import br.com.seniorx.models.DevicePendency;
import br.com.seniorx.models.DeviceUpdatedPendency;
import br.com.seniorx.models.Event;
<<<<<<< HEAD
=======
import br.com.seniorx.models.Event.EventTypeEnum;
import br.com.seniorx.models.Event.StatusEnum;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
import br.com.seniorx.models.ExcludeBiometryPendency;
import br.com.seniorx.models.ExcludeCardPendency;
import br.com.seniorx.models.ExcludePhotoPendency;
import br.com.seniorx.models.IncludeBiometryPendency;
import br.com.seniorx.models.IncludeCardPendency;
import br.com.seniorx.models.IncludePhotoPendency;
import br.com.seniorx.models.LoadHolidayListPendency;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.ManufacturerUpdatedPendency;
import br.com.seniorx.models.OperationUpdateDeviceEnum;
import br.com.seniorx.models.PendencyExecuted;
import br.com.seniorx.models.PendencyUpdated;
<<<<<<< HEAD
=======
import br.com.seniorx.models.PendencyUpdated.OperationEnum;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
import br.com.seniorx.models.PersonAreaUpdatedPendency;
import br.com.seniorx.models.PersonInfo;
import br.com.seniorx.models.PersonPhotoTemplates;
import br.com.seniorx.models.SetDeviceEmergencyPendency;
import br.com.seniorx.models.UnblockDevicePendency;
import br.com.seniorx.models.UnsetDeviceEmergencyPendency;
import br.com.seniorx.models.UpdatePersonREPPendency;
import br.com.seniorx.services.SeniorApiService;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.utils.MiddlewarePropertiesUtilImpl;

@Service
public class MiddlewareSeniorHandler {
<<<<<<< HEAD
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
	private int interval = MiddlewarePropertiesUtilImpl.getValor("time.keep.alive.senior.seconds").isEmpty() ? 30
			: Integer.valueOf(MiddlewarePropertiesUtilImpl.getValor("time.keep.alive.senior.seconds")).intValue();
=======

	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
	private int interval = MiddlewarePropertiesUtilImpl.getValor("time.keep.alive.senior.seconds").isEmpty() ? 30
			: Integer.valueOf(MiddlewarePropertiesUtilImpl.getValor("time.keep.alive.senior.seconds"));
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	private static SimpleDateFormat sdfyyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	Calendar calendar = Calendar.getInstance();

	@Autowired
	public MiddlewareSeniorHandler() {
<<<<<<< HEAD
		this.executorService.scheduleAtFixedRate(() -> {
=======
		executorService.scheduleAtFixedRate(() -> {
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			try {
				CLogger.logSeniorInfo(" PENDENCIES AND KEEP ALIVE", "Started...");

				List<ManagerDevice> devices = SeniorApiService.getDevices();
<<<<<<< HEAD

				ManagerDeviceList.setManagerDeviceList(devices);
=======
				ManagerDeviceList.setManagerDeviceList(devices);

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
				handleKeepAlive(devices);
				HandleDevicesPendencies();
			} catch (Exception e) {
				CLogger.logSeniorInfo("KEEP ALIVE", "Error: " + e.getMessage());
			}
<<<<<<< HEAD
		}, 0, this.interval, TimeUnit.SECONDS);
	}

	private static final DateFormat seniorDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public void handleKeepAlive(List<ManagerDevice> devices) {
		try {
=======
		}, 0, interval, TimeUnit.SECONDS);
	}

	private final static DateFormat seniorDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public void handleKeepAlive(List<ManagerDevice> devices) {
		try {

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			if (devices == null || devices.size() == 0) {
				CLogger.logSeniorInfo(" KEEP ALIVE", "No devices found.");
			} else {
				for (ManagerDevice device : devices) {
					Thread keepAlvive = new Thread(() -> {
						HikvisionMinMoeService minmoeService = new HikvisionMinMoeService(device);
<<<<<<< HEAD

						SeniorApiService seniorService = new SeniorApiService();
						seniorService.setDevice(device);
=======
						SeniorApiService seniorService = new SeniorApiService();
						seniorService.setDevice(device);

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
						checkDeviceStatus(null, seniorService, minmoeService, device.getId());
					});
					keepAlvive.start();
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorInfo(" KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public void HandleDevicesPendencies() {
		try {
			SeniorApiService seniorService = new SeniorApiService();
			List<ManagerDevice> devices = SeniorApiService.getDevices();

			if (devices == null) {
<<<<<<< HEAD
				CLogger.logSeniorInfo(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " KEEP ALIVE",
						"No devices found.");
=======
				CLogger.logSeniorInfo(getDeviceInfo(seniorService.getDevice()) + " KEEP ALIVE", "No devices found.");
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			} else {
				for (ManagerDevice device : devices) {
					Thread pendnciesHandler = new Thread(() -> {
						HikvisionMinMoeService minmoeService = new HikvisionMinMoeService(device);
<<<<<<< HEAD

						seniorService.setDevice(device);

						AllPendency allPendencies = seniorService.getDevicePendencies(device.getId());
=======
						seniorService.setDevice(device);

						AllPendency allPendencies = seniorService.getDevicePendencies(device.getId());

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
						HandleDevicePendencies(allPendencies, minmoeService, seniorService);
					});
					pendnciesHandler.start();
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorInfo(" KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public static void HandleWebSocketMessage(Long deviceId) {
<<<<<<< HEAD
		ManagerDevice device = SeniorApiService.getDevice(deviceId);

		if (device == null) {
			CLogger.logSeniorInfo(" HANDLE WEBSOCKET MESSAGE", "Device not found for id: " + deviceId);
		} else {
=======

		ManagerDevice device = SeniorApiService.getDevice(deviceId);

		if (device == null)
			CLogger.logSeniorInfo(" HANDLE WEBSOCKET MESSAGE", "Device not found for id: " + deviceId);
		else {
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			SeniorApiService seniorService = new SeniorApiService();
			seniorService.setDevice(device);
			AllPendency pendencies = seniorService.getDevicePendencies(deviceId);
			HikvisionMinMoeService hikvisionService = new HikvisionMinMoeService(device);

			HandleDevicePendencies(pendencies, hikvisionService, seniorService);
		}
	}

	private static String getDeviceInfo(ManagerDevice device) {
<<<<<<< HEAD
		return String.format(">>> Device:%s : %s - %s <<<",
				new Object[] { device.getId(), device.getNetworkIdentification(), device.getNetworkPort() });
=======
		return String.format(">>> Device:%s : %s - %s <<<", device.getId(), device.getNetworkIdentification(),
				device.getNetworkPort());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	private static void HandleDevicePendencies(AllPendency pendencies, HikvisionMinMoeService minmoeService,
			SeniorApiService seniorService) {
		handleDeviceStatusPendencies(pendencies.getDeviceStatus(), seniorService, minmoeService);
		handleDeviceDateTimePendencies(pendencies.getDeviceDateTime(), seniorService, minmoeService);
		handleResetDevicePendencies(pendencies.getResetDevice(), seniorService);
		handleBlockDevicePendencies(pendencies.getBlockDevice(), seniorService, minmoeService);
		handleUnblockDevicePendencies(pendencies.getUnblockDevice(), seniorService, minmoeService);
		handleSetDeviceEmergencyPendencies(pendencies.getSetDeviceEmergency(), seniorService, minmoeService);
		handleUnsetDeviceEmergencyPendencies(pendencies.getUnsetDeviceEmergency(), seniorService, minmoeService);
		handleApolloIncludeCardPendencies(pendencies.getApolloIncludeCard(), seniorService);
		handleApolloExcludeCardPendencies(pendencies.getApolloExcludeCard(), seniorService);
		handleIncludeBiometryPendencies(pendencies.getIncludeBiometry(), seniorService, minmoeService);
		handleExcludeBiometryPendencies(pendencies.getExcludeBiometry(), seniorService, minmoeService);
		handleDevicePendencies(pendencies.getDevice(), seniorService, minmoeService);
		handleActivateDeviceOutputPendencies(pendencies.getActivateDeviceOutput(), seniorService);
		handleDeactivateDeviceOutputPendencies(pendencies.getDeactivateDeviceOutput(), seniorService);
		handleDatamartUpdatedPendencies(pendencies.getDatamartUpdated(), seniorService);
		handlePersonLocationUpdatedPendencies(pendencies.getPersonLocationUpdated(), seniorService);
		handleCollectEventPendencies(pendencies.getCollectEvent(), seniorService);
		handleInputStatusPendencies(pendencies.getInputStatus(), seniorService);
		handleManufacturerUpdatedPendencies(pendencies.getManufacturerUpdated(), seniorService);
		handleUpdatePersonREPPendencies(pendencies.getUpdatePersonREP(), seniorService);
		handleLoadHolidayListPendencies(pendencies.getLoadHolidayList(), seniorService);
		handleRemoveHolidayListPendencies(pendencies.getRemoveHolidayList(), seniorService);
		handleLoadAllowCardListPendencies(pendencies.getLoadAllowCardList(), seniorService, minmoeService);
		handleRemoveAllowCardListPendencies(pendencies.getRemoveBiometryList(), seniorService, minmoeService);
		handleLoadBiometryListPendencies(pendencies.getLoadBiometryList(), seniorService, minmoeService);
		handleRemoveBiometryListPendencies(pendencies.getRemoveBiometryList(), seniorService, minmoeService);
		handleIncludeCardPendencies(pendencies.getIncludeCard(), seniorService, minmoeService);
		handleExcludeCardPendencies(pendencies.getExcludeCard(), seniorService, minmoeService);
		handleDeviceDisplayMessagePendencies(pendencies.getDeviceDisplayMessage(), seniorService);
		handleUpdateFirmwarePendencies(pendencies.getUpdateFirmware(), seniorService);
		handleIncludePhotoPendencies(pendencies.getIncludePhoto(), seniorService, minmoeService);
		handleExcludePhotoPendencies(pendencies.getExcludePhoto(), seniorService, minmoeService);
		handleLoadCredentialFacialList(pendencies.getLoadCredentialFacialList(), seniorService, minmoeService);
	}

	private static void sendSuccessPendency(SeniorApiService seniorService, Long pendencyId) {
<<<<<<< HEAD
		List<PendencyExecuted> pendenciesSuccess = new ArrayList<>();
=======
		List<PendencyExecuted> pendenciesSuccess = new ArrayList<PendencyExecuted>();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		PendencyExecuted pendencyExecuted = new PendencyExecuted();
		pendencyExecuted.setPendencyId(pendencyId);
		pendenciesSuccess.add(pendencyExecuted);
		seniorService.updatePendenciesExecuted(pendenciesSuccess);
<<<<<<< HEAD
		CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeviceDateTimePendencies",
				"OK");
	}

	private static void updatePendencyStatus(SeniorApiService seniorService, Long pendencyId,
			PendencyUpdated.OperationEnum status, PendencyUpdateStatus updateStatus) {
		List<PendencyUpdated> pendenciesUpdate = new ArrayList<>();
		PendencyUpdated pendencyUpdated = new PendencyUpdated();
		pendencyUpdated.setPendencyId(pendencyId);
		pendencyUpdated.setOperation(status);
		pendencyUpdated.setErrorCode(Integer.valueOf(updateStatus.getCode()));
=======
		CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DeviceDateTimePendencies", "OK");
	}

	private static void updatePendencyStatus(SeniorApiService seniorService, Long pendencyId, OperationEnum status,
			PendencyUpdateStatus updateStatus) {
		List<PendencyUpdated> pendenciesUpdate = new ArrayList<PendencyUpdated>();
		PendencyUpdated pendencyUpdated = new PendencyUpdated();
		pendencyUpdated.setPendencyId(pendencyId);
		pendencyUpdated.setOperation(status);
		pendencyUpdated.setErrorCode(updateStatus.getCode());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		pendenciesUpdate.add(pendencyUpdated);
		seniorService.updatePendenciesStatus(pendenciesUpdate);
	}

	private static void handleDeviceStatusPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
<<<<<<< HEAD
		if (pendencies != null) {
			for (DevicePendency pendency : pendencies)
				checkDeviceStatus(pendency, seniorService, minmoeService, null);
		} else {
			CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " CHECK STATUS PENDENCY",
					"No check status pendency for device " + seniorService.getDevice().getId());
		}
=======

		if (pendencies != null)
			for (DevicePendency pendency : pendencies)
				checkDeviceStatus(pendency, seniorService, minmoeService, null);
		else
			CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " CHECK STATUS PENDENCY",
					"No check status pendency for device " + seniorService.getDevice().getId());

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	private static void checkDeviceStatus(DevicePendency pendency, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService, Long deviceId) {
<<<<<<< HEAD
		try {
			DeviceInfo deviceInfo = minmoeService.getDeviceInfo();

			Boolean deviceStatus = Boolean.valueOf(!(deviceInfo == null));
=======

		try {
			DeviceInfo deviceInfo;
			deviceInfo = minmoeService.getDeviceInfo();

			Boolean deviceStatus = deviceInfo == null ? false : true;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

			AreaControlList areaControl = seniorService.getAreaById(seniorService.getDevice().getAreaId());
			if (areaControl == null) {
				return;
			}

<<<<<<< HEAD
			if (pendency != null) {
				if (deviceStatus.booleanValue()) {
					List<PendencyExecuted> pendenciesExecuted = new ArrayList<>();
=======
			if (pendency != null)
				if (deviceStatus) {
					List<PendencyExecuted> pendenciesExecuted = new ArrayList<PendencyExecuted>();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					PendencyExecuted pendencyExecuted = new PendencyExecuted();
					pendencyExecuted.setPendencyId(pendency.getPendencyId());
					pendenciesExecuted.add(pendencyExecuted);
					seniorService.updatePendenciesExecuted(pendenciesExecuted);
<<<<<<< HEAD
					CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DEVICE STATUS",
							"OK");
				} else {
					List<PendencyUpdated> pendenciesUpdate = new ArrayList<>();
					PendencyUpdated pendencyUpdated = new PendencyUpdated();
					pendencyUpdated.setPendencyId(pendency.getPendencyId());
					pendencyUpdated.setOperation(PendencyUpdated.OperationEnum.KEEP_PENDENCY);
					seniorService.updatePendenciesStatus(pendenciesUpdate);
					CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DEVICE STATUS",
							"ERROR");
				}
			} else {

				List<Event> events = new ArrayList<>();
				Event event = new Event();
				event.setDate(seniorDateTime.format(new Date()));
				event.setDeviceId(deviceId);
				event.setEventType(deviceStatus.booleanValue() ? Event.EventTypeEnum.DEVICE_ONLINE
						: Event.EventTypeEnum.DEVICE_OFFLINE);
				event.setStatus(Event.StatusEnum.ONLINE);
=======
					CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DEVICE STATUS", "OK");
				} else {
					List<PendencyUpdated> pendenciesUpdate = new ArrayList<PendencyUpdated>();
					PendencyUpdated pendencyUpdated = new PendencyUpdated();
					pendencyUpdated.setPendencyId(pendency.getPendencyId());
					pendencyUpdated.setOperation(OperationEnum.KEEP_PENDENCY);
					seniorService.updatePendenciesStatus(pendenciesUpdate);
					CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DEVICE STATUS", "ERROR");
				}
			else {

				List<Event> events = new ArrayList<Event>();
				Event event = new Event();
				event.setDate(seniorDateTime.format(new Date()));
				event.setDeviceId(deviceId);
				event.setEventType(deviceStatus ? EventTypeEnum.DEVICE_ONLINE : EventTypeEnum.DEVICE_OFFLINE);
				event.setStatus(StatusEnum.ONLINE);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
				event.setTimezoneOffset(areaControl.getGmt());
				events.add(event);

				seniorService.sendEventList(events);
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DEVICE STATUS",
					e.getMessage());
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " DEVICE STATUS", e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleDeviceDateTimePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {

				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
					DateTime dateTime = new DateTime("manual", sdf.format(new Date()),
<<<<<<< HEAD
							HikvisionMinMoeService.minutesToUtcString(seniorService
									.getAreaById(seniorService.getDevice().getAreaId()).getGmt().intValue()));

					Boolean success = Boolean.valueOf(minmoeService.setDateTime(dateTime));

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeviceDateTimePendencies",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeviceDateTimePendencies",
							"ERROR");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
							HikvisionMinMoeService.minutesToUtcString(
									seniorService.getAreaById(seniorService.getDevice().getAreaId()).getGmt()));

					Boolean success = minmoeService.setDateTime(dateTime);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}

			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleResetDevicePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		try {
			for (DevicePendency pendency : pendencies) {
<<<<<<< HEAD
				List<PendencyUpdated> pendenciesUpdate = new ArrayList<>();
				PendencyUpdated pendencyUpdated = new PendencyUpdated();
				pendencyUpdated.setPendencyId(pendency.getPendencyId());
				pendencyUpdated.setOperation(PendencyUpdated.OperationEnum.KEEP_PENDENCY);
				seniorService.updatePendenciesStatus(pendenciesUpdate);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ResetDevicePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ResetDevicePendencies",
					e.getMessage());
=======
				List<PendencyUpdated> pendenciesUpdate = new ArrayList<PendencyUpdated>();
				PendencyUpdated pendencyUpdated = new PendencyUpdated();
				pendencyUpdated.setPendencyId(pendency.getPendencyId());
				pendencyUpdated.setOperation(OperationEnum.KEEP_PENDENCY);
				seniorService.updatePendenciesStatus(pendenciesUpdate);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ResetDevicePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ResetDevicePendencies", e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleBlockDevicePendencies(List<BlockDevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (BlockDevicePendency pendency : pendencies) {

				try {
<<<<<<< HEAD
					Boolean success = Boolean.valueOf(minmoeService.keepDoorClosed());

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
							"ERROR");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " BlockDevicePendencies",
=======
					Boolean success = minmoeService.keepDoorClosed();

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " BlockDevicePendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}

			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " BlockDevicePendencies",
					e.getMessage());
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " BlockDevicePendencies", e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleUnblockDevicePendencies(List<UnblockDevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (UnblockDevicePendency pendency : pendencies) {

				try {
<<<<<<< HEAD
					Boolean success = Boolean.valueOf(minmoeService.closeDoor());

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
							"ERROR");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UnblockDevicePendencies",
=======
					Boolean success = minmoeService.closeDoor();

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " UnblockDevicePendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}

			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UnblockDevicePendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " UnblockDevicePendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleSetDeviceEmergencyPendencies(List<SetDeviceEmergencyPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
<<<<<<< HEAD
		for (SetDeviceEmergencyPendency pendency : pendencies) {

			try {
				Boolean success = Boolean.valueOf(minmoeService.keepDoorOpen());

				if (success.booleanValue()) {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " SetDeviceEmergencyPendencies",
							"OK");
					continue;
				}
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				CLogger.logSeniorError(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " SetDeviceEmergencyPendencies",
						"ERROR");

			} catch (Exception e) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				CLogger.logSeniorError(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " SetDeviceEmergencyPendencies",
						e.getMessage());
			}
=======

		for (SetDeviceEmergencyPendency pendency : pendencies) {

			try {
				Boolean success = minmoeService.keepDoorOpen();

				if (success) {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " SetDeviceEmergencyPendencies",
							"OK");
				} else {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " SetDeviceEmergencyPendencies",
							"ERROR");

				}
			} catch (Exception e) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " SetDeviceEmergencyPendencies",
						e.getMessage());
			}

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleUnsetDeviceEmergencyPendencies(List<UnsetDeviceEmergencyPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		for (UnsetDeviceEmergencyPendency pendency : pendencies) {
			try {
<<<<<<< HEAD
				Boolean success = Boolean.valueOf(minmoeService.closeDoor());

				if (success.booleanValue()) {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice()))
							+ " UnsetDeviceEmergencyPendencies", "OK");
					continue;
				}
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				CLogger.logSeniorError(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UnsetDeviceEmergencyPendencies",
						"ERROR");

			} catch (Exception e) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				CLogger.logSeniorError(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UnsetDeviceEmergencyPendencies",
						e.getMessage());
			}
=======
				Boolean success = minmoeService.closeDoor();

				if (success) {
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " UnsetDeviceEmergencyPendencies",
							"OK");
				} else {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " UnsetDeviceEmergencyPendencies",
							"ERROR");

				}
			} catch (Exception e) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " UnsetDeviceEmergencyPendencies",
						e.getMessage());
			}

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleApolloIncludeCardPendencies(List<ApolloIncludeCardPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (ApolloIncludeCardPendency pendency : pendencies) {
<<<<<<< HEAD
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.REMOVE_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloIncludeCardPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloIncludeCardPendencies",
=======
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ApolloIncludeCardPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ApolloIncludeCardPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleApolloExcludeCardPendencies(List<ApolloExcludeCardPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (ApolloExcludeCardPendency pendency : pendencies) {
<<<<<<< HEAD
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.REMOVE_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloExcludeCardPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloExcludeCardPendencies",
=======
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ApolloExcludeCardPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ApolloExcludeCardPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleIncludeBiometryPendencies(List<IncludeBiometryPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
<<<<<<< HEAD
		try {
			for (IncludeBiometryPendency pendency : pendencies) {

				try {
=======

		try {
			for (IncludeBiometryPendency pendency : pendencies) {
				try {

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					PersonInfo person = SeniorApiService.getPersonCardAndPhotoInfo(pendency.getManagerDeviceId(),
							pendency.getPersonId(), null);
					if (person == null) {
						CLogger.logSeniorDebug(
<<<<<<< HEAD
								String.valueOf(getDeviceInfo(seniorService.getDevice()))
										+ " handleIncludeCardPendencies",
								"Person not found: " + pendency.getPersonId());

						continue;
					}
=======
								getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies",
								"Person not found: " + pendency.getPersonId());
						continue;
					}

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					IncludeUser user = new IncludeUser();
					IncludeUser.UserInfo userInfo = new IncludeUser.UserInfo();
					userInfo.setEmployeeNo(person.getPersonId().toString());
					userInfo.setName(person.getPersonName());
					userInfo.setUserType("normal");

					Date currentDate = new Date();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(currentDate);
<<<<<<< HEAD
					calendar.add(1, 10);
=======
					calendar.add(Calendar.YEAR, 10);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					Date datePlusTenYears = calendar.getTime();

					IncludeUser.Valid valid = new IncludeUser.Valid();
					valid.setEnable(true);
					valid.setBeginTime(sdfyyyyMMddHHmmss.format(currentDate));
					valid.setEndTime(sdfyyyyMMddHHmmss.format(datePlusTenYears));
					userInfo.setValid(valid);
					userInfo.setDoorRight("1");

					IncludeUser.RightPlan rightPlan = new IncludeUser.RightPlan();
					rightPlan.setDoorNo(1);
					rightPlan.setPlanTemplateNo("1");

					userInfo.setRightPlan(List.of(rightPlan));
					user.setUserInfo(userInfo);

					minmoeService.includeUser(user);

<<<<<<< HEAD
					List<IncludeUserFingerPrint> fpList = new ArrayList<>();
=======
					List<IncludeUserFingerPrint> fpList = new ArrayList<IncludeUserFingerPrint>();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

					for (int i = 0; i < pendency.getBiometry().getTemplateList().size(); i++) {
						IncludeUserFingerPrint userFp = new IncludeUserFingerPrint();
						IncludeUserFingerPrint.FingerPrintCfg fingerPrintCfg = new IncludeUserFingerPrint.FingerPrintCfg();
						fingerPrintCfg.setEmployeeNo(pendency.getPersonId().toString());
						fingerPrintCfg.setFingerData(pendency.getBiometry().getTemplateList().get(i));
						fingerPrintCfg.setFingerPrintID(i + 1);
						userFp.setFingerPrintCfg(fingerPrintCfg);

						fpList.add(userFp);
					}

<<<<<<< HEAD
					Boolean success = Boolean.valueOf(minmoeService.includeUserFingerPrint(fpList, minmoeService));

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludeBiometryPendency",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludeBiometryPendency",
							"ERROR");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludeBiometryPendency",
=======
					Boolean success = minmoeService.includeUserFingerPrint(fpList, minmoeService);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " IncludeBiometryPendency",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludeBiometryPendency",
								"ERROR");
					}

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludeBiometryPendency",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludeBiometryPendency",
					e.getMessage());
			e.printStackTrace();
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludeBiometryPendency",
					e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleExcludeBiometryPendencies(List<ExcludeBiometryPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (ExcludeBiometryPendency pendency : pendencies) {
<<<<<<< HEAD

				try {
=======
				try {

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					ExcludeUserFingerPrint request = new ExcludeUserFingerPrint();
					ExcludeUserFingerPrint.FingerPrintDelete fingerPrintDelete = new ExcludeUserFingerPrint.FingerPrintDelete();
					ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail = new ExcludeUserFingerPrint.EmployeeNoDetail();

					employeeNoDetail.setEmployeeNo(pendency.getPersonId().toString());
					fingerPrintDelete.setMode("byEmployeeNo");
					fingerPrintDelete.setEmployeeNoDetail(employeeNoDetail);

					request.setFingerPrintDelete(fingerPrintDelete);

<<<<<<< HEAD
					Boolean success = Boolean.valueOf(minmoeService.excludeUserFingerPrint(request, minmoeService));

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeBiometryPendency",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeBiometryPendency",
							"ERROR");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeBiometryPendency",
=======
					Boolean success = minmoeService.excludeUserFingerPrint(request, minmoeService);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ExcludeBiometryPendency",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludeBiometryPendency",
								"ERROR");
					}

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludeBiometryPendency",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeBiometryPendency",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludeBiometryPendency",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleDevicePendencies(List<DeviceUpdatedPendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
			for (DeviceUpdatedPendency pendency : pendencies) {
<<<<<<< HEAD

				try {
					if (pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_CONFIG)) {
						ManagerDevice device = SeniorApiService.getDevice(pendency.getManagerDeviceId());

						ManagerDevice updateDevice = SeniorApiService.getDevice(pendency.getManagerDeviceId());
						ManagerDeviceList.upsertManagerDevice(updateDevice);

						Boolean success = Boolean.valueOf(minmoeService.configureDevice(device));
						if (success.booleanValue()) {
							sendSuccessPendency(seniorService, pendency.getPendencyId());
							CLogger.logSeniorDebug(
									String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DevicePendencies",
									"OK");
							continue;
						}
						updatePendencyStatus(seniorService, pendency.getPendencyId(),
								PendencyUpdated.OperationEnum.REMOVE_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						continue;
					}
					if (pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_CREATED)
							|| pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_REMOVED)
							|| pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_UPDATED)) {
						ManagerDevice updateDevice = SeniorApiService.getDevice(pendency.getManagerDeviceId());
						ManagerDeviceList.upsertManagerDevice(updateDevice);
						continue;
					}
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DevicePendencies", "OK");
				} catch (Exception e) {
					CLogger.logSeniorDebug("handleDevicePendencies", e.getMessage());
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.REMOVE_PENDENCY,
=======
				try {

					if (pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_CONFIG)) {
						ManagerDevice device = SeniorApiService.getDevice(pendency.getManagerDeviceId());
						Boolean success = minmoeService.configureDevice(device);
						if (success) {
							sendSuccessPendency(seniorService, pendency.getPendencyId());
							CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DevicePendencies",
									"OK");
						} else
							updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY,
									PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);

					} else if (pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_CREATED)
							|| pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_REMOVED)
							|| pendency.getOperation().equals(OperationUpdateDeviceEnum.DEVICE_UPDATED)) {
						List<ManagerDevice> devices = SeniorApiService.getDevices();
						ManagerDeviceList.setManagerDeviceList(devices);
					} else {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DevicePendencies", "OK");
					}
				} catch (Exception e) {
					CLogger.logSeniorDebug("handleDevicePendencies", e.getMessage());
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY,
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DevicePendencies",
					e.getMessage());
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " DevicePendencies", e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleLoadHolidayListPendencies(List<LoadHolidayListPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (LoadHolidayListPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " LoadHolidayListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " LoadHolidayListPendencies",
=======
		// TODO
		try {
			for (LoadHolidayListPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " LoadHolidayListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " LoadHolidayListPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleRemoveHolidayListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (DevicePendency pendency : pendencies) {
<<<<<<< HEAD
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveHolidayListPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveHolidayListPendencies",
=======
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " RemoveHolidayListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " RemoveHolidayListPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleActivateDeviceOutputPendencies(List<ActiveDeviceOutputPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (ActiveDeviceOutputPendency pendency : pendencies) {
<<<<<<< HEAD
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ActivateDeviceOutputPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ActivateDeviceOutputPendencies",
=======
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ActivateDeviceOutputPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ActivateDeviceOutputPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleDeactivateDeviceOutputPendencies(List<DeactiveDeviceOutputPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (DeactiveDeviceOutputPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeactivateDeviceOutputPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeactivateDeviceOutputPendencies",
=======
		// TODO
		try {
			for (DeactiveDeviceOutputPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DeactivateDeviceOutputPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " DeactivateDeviceOutputPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleDatamartUpdatedPendencies(List<DatamartUpdatedPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (DatamartUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DatamartUpdatedPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DatamartUpdatedPendencies",
=======
		// TODO
		try {
			for (DatamartUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DatamartUpdatedPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " DatamartUpdatedPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handlePersonLocationUpdatedPendencies(List<PersonAreaUpdatedPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (PersonAreaUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " PersonLocationUpdatedPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " PersonLocationUpdatedPendencies",
=======
		// TODO
		try {
			for (PersonAreaUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " PersonLocationUpdatedPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " PersonLocationUpdatedPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleCollectEventPendencies(List<CollectEventPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (CollectEventPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " CollectEventPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " CollectEventPendencies",
=======
		// TODO
		try {
			for (CollectEventPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " CollectEventPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " CollectEventPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleInputStatusPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " InputStatusPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " InputStatusPendencies",
					e.getMessage());
=======
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " InputStatusPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " InputStatusPendencies", e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleManufacturerUpdatedPendencies(List<ManufacturerUpdatedPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (ManufacturerUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ManufacturerUpdatedPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ManufacturerUpdatedPendencies",
=======
		// TODO
		try {
			for (ManufacturerUpdatedPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ManufacturerUpdatedPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ManufacturerUpdatedPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleUpdatePersonREPPendencies(List<UpdatePersonREPPendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (UpdatePersonREPPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UpdatePersonREPPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UpdatePersonREPPendencies",
=======
		// TODO
		try {
			for (UpdatePersonREPPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " UpdatePersonREPPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " UpdatePersonREPPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleLoadAllowCardListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {
<<<<<<< HEAD

				try {
					List<CardList> cardList = seniorService.getDeviceAllowedCardList();
					List<IncludeUserCard> includeUsersCard = new ArrayList<>();
=======
				try {

					List<CardList> cardList = seniorService.getDeviceAllowedCardList();
					List<IncludeUserCard> includeUsersCard = new ArrayList<IncludeUserCard>();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

					for (CardList seniorCard : cardList) {
						try {
							PersonInfo person = SeniorApiService.getPersonCardAndPhotoInfo(
									pendency.getManagerDeviceId(), null, seniorCard.getCardNumber());
							if (person == null) {
								CLogger.logSeniorDebug(
<<<<<<< HEAD
										String.valueOf(getDeviceInfo(seniorService.getDevice()))
												+ " handleIncludeCardPendencies",
										"Person not found: " + seniorCard.toString());

								continue;
							}
=======
										getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies",
										"Person not found: " + seniorCard.toString());
								continue;
							}

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							IncludeUser user = new IncludeUser();
							IncludeUser.UserInfo userInfo = new IncludeUser.UserInfo();
							userInfo.setEmployeeNo(person.getPersonId().toString());
							userInfo.setName(person.getPersonName());
							userInfo.setUserType("normal");

							Date currentDate = new Date();
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(currentDate);
<<<<<<< HEAD
							calendar.add(1, 10);
=======
							calendar.add(Calendar.YEAR, 10);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							Date datePlusTenYears = calendar.getTime();

							IncludeUser.Valid valid = new IncludeUser.Valid();
							valid.setEnable(true);
							valid.setBeginTime(sdfyyyyMMddHHmmss.format(currentDate));
							valid.setEndTime(sdfyyyyMMddHHmmss.format(datePlusTenYears));
							userInfo.setValid(valid);
							userInfo.setDoorRight("1");

							IncludeUser.RightPlan rightPlan = new IncludeUser.RightPlan();
							rightPlan.setDoorNo(1);
							rightPlan.setPlanTemplateNo("1");

							userInfo.setRightPlan(List.of(rightPlan));
							user.setUserInfo(userInfo);

							minmoeService.includeUser(user);

							IncludeUserCard userCard = new IncludeUserCard();
							IncludeUserCard.CardInfo cardInfo = new IncludeUserCard.CardInfo();
							cardInfo.setEmployeeNo(seniorCard.getOwnerId().toString());
							cardInfo.setCardNo(seniorCard.getCardNumber().toString());
							userCard.setCardInfo(cardInfo);
							includeUsersCard.add(userCard);

							Boolean success = includeCards(includeUsersCard, seniorService, minmoeService);

<<<<<<< HEAD
							if (success.booleanValue()) {
								sendSuccessPendency(seniorService, pendency.getPendencyId());
								CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice()))
										+ " handleIncludeCardPendencies", "OK");
								continue;
							}
							updatePendencyStatus(seniorService, pendency.getPendencyId(),
									PendencyUpdated.OperationEnum.KEEP_PENDENCY,
									PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
							CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice()))
									+ " handleIncludeCardPendencies", "ERROR");
=======
							if (success) {
								sendSuccessPendency(seniorService, pendency.getPendencyId());
								CLogger.logSeniorDebug(
										getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies",
										"OK");
							} else {
								updatePendencyStatus(seniorService, pendency.getPendencyId(),
										OperationEnum.KEEP_PENDENCY,
										PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
								CLogger.logSeniorError(
										getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies",
										"ERROR");
							}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
						} catch (Exception e) {
							CLogger.logSeniorError("handleLoadAllowCardListPendencies", e.getMessage());
						}
					}
				} catch (Exception e) {
<<<<<<< HEAD
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleRemoveAllowCardListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {
				minmoeService.excludeAllUsers();
				sendSuccessPendency(seniorService, pendency.getPendencyId());
<<<<<<< HEAD
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveAllowCardListPendenc", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveAllowCardListPendenc",
=======
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " RemoveAllowCardListPendenc", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " RemoveAllowCardListPendenc",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleLoadBiometryListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {
				List<AccessBiometry> finterprints = seniorService.getDeviceAllowedFingerPrint();

				for (AccessBiometry accessBiometry : finterprints) {
					if (accessBiometry.getTemplateList().size() > 0) {
<<<<<<< HEAD
						List<IncludeUserFingerPrint> fpList = new ArrayList<>();
=======
						List<IncludeUserFingerPrint> fpList = new ArrayList<IncludeUserFingerPrint>();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

						for (int i = 0; i < accessBiometry.getTemplateList().size(); i++) {
							String fp = accessBiometry.getTemplateList().get(i);
							IncludeUserFingerPrint userFp = new IncludeUserFingerPrint();
							IncludeUserFingerPrint.FingerPrintCfg fingerPrintCfg = new IncludeUserFingerPrint.FingerPrintCfg();
							fingerPrintCfg.setEmployeeNo(accessBiometry.getPersonId().toString());
							fingerPrintCfg.setFingerData(fp);
							fingerPrintCfg.setFingerPrintID(i + 1);
							userFp.setFingerPrintCfg(fingerPrintCfg);
							fpList.add(userFp);
<<<<<<< HEAD
							Boolean success = Boolean
									.valueOf(minmoeService.includeUserFingerPrint(fpList, minmoeService));

							if (success.booleanValue()) {
								sendSuccessPendency(seniorService, pendency.getPendencyId());
								CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice()))
										+ " IncludeBiometryPendency", "OK");
							} else {
								updatePendencyStatus(seniorService, pendency.getPendencyId(),
										PendencyUpdated.OperationEnum.KEEP_PENDENCY,
										PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
								CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice()))
										+ " IncludeBiometryPendency", "ERROR");
							}
						}
					}
				}

				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " LoadBiometryListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " LoadBiometryListPendencies",
=======
							Boolean success = minmoeService.includeUserFingerPrint(fpList, minmoeService);

							if (success) {
								sendSuccessPendency(seniorService, pendency.getPendencyId());
								CLogger.logSeniorDebug(
										getDeviceInfo(seniorService.getDevice()) + " IncludeBiometryPendency", "OK");
							} else {
								updatePendencyStatus(seniorService, pendency.getPendencyId(),
										OperationEnum.KEEP_PENDENCY,
										PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
								CLogger.logSeniorError(
										getDeviceInfo(seniorService.getDevice()) + " IncludeBiometryPendency", "ERROR");
							}
						}

					}
				}

				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " LoadBiometryListPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " LoadBiometryListPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleRemoveBiometryListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {
				List<AccessBiometry> finterprints = seniorService.getDeviceAllowedFingerPrint();
				for (AccessBiometry accessBiometry : finterprints) {
					ExcludeUserFingerPrint request = new ExcludeUserFingerPrint();
					ExcludeUserFingerPrint.FingerPrintDelete fingerPrintDelete = new ExcludeUserFingerPrint.FingerPrintDelete();
					ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail = new ExcludeUserFingerPrint.EmployeeNoDetail();

					employeeNoDetail.setEmployeeNo(accessBiometry.getPersonId().toString());
					fingerPrintDelete.setMode("byEmployeeNo");
					fingerPrintDelete.setEmployeeNoDetail(employeeNoDetail);

					request.setFingerPrintDelete(fingerPrintDelete);

<<<<<<< HEAD
					Boolean success = Boolean.valueOf(minmoeService.excludeUserFingerPrint(request, minmoeService));

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice()))
								+ " RemoveBiometryListPendencies", "OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveBiometryListPendencies",
							"ERROR");
				}

				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveBiometryListPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveBiometryListPendencies",
=======
					Boolean success = minmoeService.excludeUserFingerPrint(request, minmoeService);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								getDeviceInfo(seniorService.getDevice()) + " RemoveBiometryListPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(
								getDeviceInfo(seniorService.getDevice()) + " RemoveBiometryListPendencies", "ERROR");
					}

				}

				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " RemoveBiometryListPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " RemoveBiometryListPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleIncludeCardPendencies(List<IncludeCardPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (IncludeCardPendency pendency : pendencies) {
				try {
<<<<<<< HEAD
					List<IncludeUserCard> includeUsersCard = new ArrayList<>();
=======
					List<IncludeUserCard> includeUsersCard = new ArrayList<IncludeUserCard>();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c

					IncludeUserCard userCard = new IncludeUserCard();
					IncludeUserCard.CardInfo cardInfo = new IncludeUserCard.CardInfo();
					cardInfo.setEmployeeNo(pendency.getOwnerId().toString());
					cardInfo.setCardNo(pendency.getCardNumber().toString());
					userCard.setCardInfo(cardInfo);

					includeUsersCard.add(userCard);

					Boolean success = includeCards(includeUsersCard, seniorService, minmoeService);

<<<<<<< HEAD
					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice()))
								+ " handleIncludeCardPendencies", "OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " handleIncludeCardPendencies",
							"ERROR");
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(
								getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies", "ERROR");
					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static Boolean includeCards(List<IncludeUserCard> cards, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) throws Exception {
		for (IncludeUserCard includeUserCard : cards) {
<<<<<<< HEAD
			Boolean success = Boolean.valueOf(minmoeService.includeUserCard(includeUserCard));
			if (!success.booleanValue()) {
				return Boolean.valueOf(false);
			}
		}
		return Boolean.valueOf(true);
=======
			Boolean success = minmoeService.includeUserCard(includeUserCard);
			if (!success)
				return false;
		}

		return true;
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	}

	private static void handleExcludeCardPendencies(List<ExcludeCardPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (ExcludeCardPendency pendency : pendencies) {
				try {
					ExcludeUserCard userCard = new ExcludeUserCard();
					ExcludeUserCard.CardInfoDelCondData cardInfoDelCondData = new ExcludeUserCard.CardInfoDelCondData();

					ExcludeUserCard.CardNo cardInfo = new ExcludeUserCard.CardNo();
					cardInfo.setCardNo(pendency.getCard().toString());

					cardInfoDelCondData.setCardNoList(List.of(cardInfo));
					userCard.setCardInfoDelCondData(cardInfoDelCondData);

<<<<<<< HEAD
					Boolean success = Boolean.valueOf(minmoeService.excludeCard(userCard));

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice()))
								+ " handleIncludeCardPendencies", "OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " handleIncludeCardPendencies",
							"ERROR");
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeCardPendency",
=======
					Boolean success = minmoeService.excludeCard(userCard);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies", "OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(
								getDeviceInfo(seniorService.getDevice()) + " handleIncludeCardPendencies", "ERROR");
					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludeCardPendency",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeCardPendency",
					e.getMessage());
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludeCardPendency", e.getMessage());
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		}
	}

	private static void handleDeviceDisplayMessagePendencies(List<DeviceDisplayMessagePendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (DeviceDisplayMessagePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeviceDisplayMessagePendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DeviceDisplayMessagePendencies",
=======
		// TODO
		try {
			for (DeviceDisplayMessagePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " DeviceDisplayMessagePendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " DeviceDisplayMessagePendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleUpdateFirmwarePendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService) {
<<<<<<< HEAD
		try {
			for (DevicePendency pendency : pendencies) {

				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UpdateFirmwarePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UpdateFirmwarePendencies",
=======
		// TODO
		try {
			for (DevicePendency pendency : pendencies) {

				updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
						PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " UpdateFirmwarePendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " UpdateFirmwarePendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

<<<<<<< HEAD
=======
	private static void handleIncludePerson() {

	}

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	private static void handleIncludePhotoPendencies(List<IncludePhotoPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (IncludePhotoPendency pendency : pendencies) {
				try {
					IncludeUser user = new IncludeUser();
					IncludeUser.UserInfo userInfo = new IncludeUser.UserInfo();
					userInfo.setEmployeeNo(pendency.getPersonId().toString());
					userInfo.setName(pendency.getPersonName());
					userInfo.setUserType("normal");

					Date currentDate = new Date();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(currentDate);
<<<<<<< HEAD
					calendar.add(1, 10);
=======
					calendar.add(Calendar.YEAR, 10);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					Date datePlusTenYears = calendar.getTime();

					IncludeUser.Valid valid = new IncludeUser.Valid();
					valid.setEnable(true);
					valid.setBeginTime(sdfyyyyMMddHHmmss.format(currentDate));
					valid.setEndTime(sdfyyyyMMddHHmmss.format(datePlusTenYears));
					userInfo.setValid(valid);
					userInfo.setDoorRight("1");

					IncludeUser.RightPlan rightPlan = new IncludeUser.RightPlan();
					rightPlan.setDoorNo(1);
					rightPlan.setPlanTemplateNo("1");

					userInfo.setRightPlan(List.of(rightPlan));

					user.setUserInfo(userInfo);

<<<<<<< HEAD
					Boolean success = Boolean.valueOf(includePersonPhoto(user, pendency.getPhotoUrl(), minmoeService));

					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
							"ERROR");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
					Boolean success = includePersonPhoto(user, pendency.getPhotoUrl(), minmoeService);

					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
								"ERROR");

					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}

			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static boolean includePerson(IncludeUser user, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
			return minmoeService.includeUser(user);
		} catch (Exception e) {
			e.printStackTrace();
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " IncludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
			return false;
		}
	}

	private static boolean includePersonPhoto(IncludeUser user, String photoUrl, HikvisionMinMoeService minmoeService) {
		try {
<<<<<<< HEAD
			if (!minmoeService.includeUser(user)) {
				return false;
			}
			SearchPhotoRequest photo = new SearchPhotoRequest();
=======

			if (!minmoeService.includeUser(user))
				return false;

			SearchPhoto photo = new SearchPhoto();
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			photo.setFPID(user.getUserInfo().getEmployeeNo());
			photo.setMaxResults(5);
			photo.setSearchResultPosition(0);

<<<<<<< HEAD
			Boolean hasPhoto = Boolean.valueOf(minmoeService.searchUserPhoto(photo));

			ExcludePhotoRequest exclude = new ExcludePhotoRequest();
			ExcludePhotoRequest.Fpid fpid = new ExcludePhotoRequest.Fpid();
			fpid.setValue(user.getUserInfo().getEmployeeNo());
			exclude.setFPID(Collections.singletonList(fpid));

			if (hasPhoto.booleanValue()) {
				minmoeService.excludeUserPhoto(exclude);
			}
			IncludeUserFaceRequest faceDataRequest = new IncludeUserFaceRequest(user.getUserInfo().getEmployeeNo());

			return minmoeService.includeUserPhoto(faceDataRequest, photoUrl);
=======
			Boolean hasPhoto = minmoeService.searchUserPhoto(photo);

			ExcludeUserPhoto exclude = new ExcludeUserPhoto();
			ExcludeUserPhoto.Fpid fpid = new ExcludeUserPhoto.Fpid();
			fpid.setValue(user.getUserInfo().getEmployeeNo());
			exclude.setFPID(Collections.singletonList(fpid));

			if (hasPhoto)
				minmoeService.excludeUserPhoto(exclude);

			IncludeUserFace faceDataRequest = new IncludeUserFace(user.getUserInfo().getEmployeeNo());

			return minmoeService.includeUserPhoto(faceDataRequest, photoUrl);

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private static void handleExcludePhotoPendencies(List<ExcludePhotoPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
<<<<<<< HEAD
		try {
			for (ExcludePhotoPendency pendency : pendencies) {
				try {
					ExcludePhotoRequest fpidRequest = new ExcludePhotoRequest();
					ExcludePhotoRequest.Fpid fpid = new ExcludePhotoRequest.Fpid();
					fpid.setValue(pendency.getPersonId().toString());
					fpidRequest.setFPID(Collections.singletonList(fpid));

					Boolean success = Boolean.valueOf(minmoeService.excludeUserPhoto(fpidRequest));
					if (success.booleanValue()) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies",
								"OK");
						continue;
					}
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.REMOVE_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies",
							"ERROR");
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies",
=======
		// TODO
		try {
			for (ExcludePhotoPendency pendency : pendencies) {
				try {
					ExcludeUserPhoto fpidRequest = new ExcludeUserPhoto();
					ExcludeUserPhoto.Fpid fpid = new ExcludeUserPhoto.Fpid();
					fpid.setValue(pendency.getPersonId().toString());
					fpidRequest.setFPID(Collections.singletonList(fpid));

					Boolean success = minmoeService.excludeUserPhoto(fpidRequest);
					if (success) {
						sendSuccessPendency(seniorService, pendency.getPendencyId());
						CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies",
								"OK");
					} else {
						updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.REMOVE_PENDENCY,
								PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
						CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies",
								"ERROR");
					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	private static void handleLoadCredentialFacialList(List<DevicePendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
<<<<<<< HEAD
		try {
=======

		try {

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
			for (DevicePendency pendency : pendencies) {
				try {
					List<PersonPhotoTemplates> personsInfo = seniorService.getDeviceAllowedFacialList();

					for (PersonPhotoTemplates personInfo : personsInfo) {
						IncludeUser user = new IncludeUser();

						IncludeUser.UserInfo userInfo = new IncludeUser.UserInfo();
						userInfo.setEmployeeNo(personInfo.getPersonId().toString());
						userInfo.setName(personInfo.getName());
						userInfo.setUserType("normal");

						Date currentDate = new Date();
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(currentDate);
<<<<<<< HEAD
						calendar.add(1, 10);
=======
						calendar.add(Calendar.YEAR, 10);
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
						Date datePlusTenYears = calendar.getTime();

						IncludeUser.Valid valid = new IncludeUser.Valid();
						valid.setEnable(true);
						valid.setBeginTime(sdfyyyyMMddHHmmss.format(currentDate));
						valid.setEndTime(sdfyyyyMMddHHmmss.format(datePlusTenYears));
						userInfo.setValid(valid);
						userInfo.setDoorRight("1");

						IncludeUser.RightPlan rightPlan = new IncludeUser.RightPlan();
						rightPlan.setDoorNo(1);
						rightPlan.setPlanTemplateNo("1");

						userInfo.setRightPlan(List.of(rightPlan));

						user.setUserInfo(userInfo);

<<<<<<< HEAD
						Boolean success = Boolean
								.valueOf(includePersonPhoto(user, personInfo.getPhotoURL(), minmoeService));
						if (!success.booleanValue()) {
							updatePendencyStatus(seniorService, pendency.getPendencyId(),
									PendencyUpdated.OperationEnum.KEEP_PENDENCY,
									PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
							CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice()))
									+ " ExcludePhotoPendencies", "ERROR");

							return;
						}
					}
					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies", "OK");
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies",
=======
						Boolean success = includePersonPhoto(user, personInfo.getPhotoURL(), minmoeService);
						if (!success) {
							updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
									PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
							CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies",
									"ERROR");
							return;
						}
					}

					sendSuccessPendency(seniorService, pendency.getPendencyId());
					CLogger.logSeniorDebug(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies", "OK");

				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(), OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " ExcludePhotoPendencies",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
							e.getMessage());
				}
			}
		} catch (Exception e) {
<<<<<<< HEAD
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " LoadCredentialFacialList",
=======
			CLogger.logSeniorError(getDeviceInfo(seniorService.getDevice()) + " LoadCredentialFacialList",
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
					e.getMessage());
		}
	}

	public static void validateOnlineAccess(SeniorApiService seniorService, HikvisionMinMoeService minmoeService,
			String card) {
<<<<<<< HEAD
	}
}

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\
 * middleware\services\MiddlewareSeniorHandler.class Java compiler version: 17
 * (61.0) JD-Core Version: 1.1.3
 */
=======

//		Boolean valid = SeniorApiService.validateOnlineAccess(null;)

	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
