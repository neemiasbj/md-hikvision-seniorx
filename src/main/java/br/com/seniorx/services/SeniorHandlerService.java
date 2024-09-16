package br.com.seniorx.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
import br.com.seniorx.models.ExcludeBiometryPendency;
import br.com.seniorx.models.ExcludeCardPendency;
import br.com.seniorx.models.ExcludePhotoPendency;
import br.com.seniorx.models.IncludeBiometryPendency;
import br.com.seniorx.models.IncludeCardPendency;
import br.com.seniorx.models.IncludePhotoPendency;
import br.com.seniorx.models.LoadHolidayListPendency;
import br.com.seniorx.models.ManagerDevice;
import br.com.seniorx.models.ManufacturerUpdatedPendency;
import br.com.seniorx.models.PendencyExecuted;
import br.com.seniorx.models.PendencyUpdated;
import br.com.seniorx.models.PersonAreaUpdatedPendency;
import br.com.seniorx.models.SetDeviceEmergencyPendency;
import br.com.seniorx.models.UnblockDevicePendency;
import br.com.seniorx.models.UnsetDeviceEmergencyPendency;
import br.com.seniorx.models.UpdatePersonREPPendency;
import br.com.seniorx.models.Event.EventTypeEnum;
import br.com.seniorx.models.Event.StatusEnum;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.utils.PropertiesUtilImpl;

public class SeniorHandlerService {

	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
	private int interval = PropertiesUtilImpl.getValor("time.keep.alive.senior.seconds").isEmpty() ? 30 : Integer.valueOf(PropertiesUtilImpl.getValor("time.keep.alive.senior.seconds"));

	public void start() {
		executorService.scheduleAtFixedRate(() -> {
			handleKeepAlive();
		}, 0, interval, TimeUnit.SECONDS);

		executorService.scheduleAtFixedRate(() -> {
			HandleDevicesPendencies();
		}, 0, interval, TimeUnit.SECONDS);

	}

	private final DateFormat seniorDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

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
					Thread keepAlvive = new Thread(() -> {
						HikvisionMinMoeService minmonService = new HikvisionMinMoeService(device);
						seniorService.setDevice(device);

						AllPendency allPendencies = seniorService.getDevicePendencies(device.getId());

						HandleDevicePendencies(allPendencies, minmonService, seniorService);
					});
					keepAlvive.start();
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorInfo("KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public void HandleWebSocketMessage(Long deviceId) {

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

	private void HandleDevicePendencies(AllPendency pendencies, HikvisionMinMoeService minmoeService, SeniorApiService seniorService) {
		handleDeviceStatusPendencies(pendencies.getDeviceStatus(), minmoeService, seniorService);
	}

	private void handleDeviceStatusPendencies(List<DevicePendency> pendencies, HikvisionMinMoeService minmoeService, SeniorApiService seniorService) {

		if (pendencies != null)
			for (DevicePendency pendency : pendencies)
				checkDeviceStatus(pendency, seniorService, minmoeService, null);
		else
			CLogger.logSeniorDebug("CHECK STATUS PENDENCY", "No check status pendency for device " + seniorService.getDevice().getId());

	}

	private void checkDeviceStatus(DevicePendency pendency, SeniorApiService seniorService, HikvisionMinMoeService minmoeService, Long deviceId) {

		Boolean deviceStatus = minmoeService.getDeviceInfo();

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
				pendencyUpdated.setOperation(br.com.seniorx.models.PendencyUpdated.OperationEnum.KEEP_PENDENCY);
				seniorService.updatePendenciesStatus(pendenciesUpdate);
				CLogger.logSeniorDebug("DEVICE STATUS", "ERROR");
			}
		else {

			List<Event> events = new ArrayList<Event>();
			Event event = new Event();
			event.setDate(seniorDateTime.format(new Date()));
			event.setDeviceId(deviceId);
			event.setEventType(deviceStatus ? EventTypeEnum.DEVICE_ONLINE : EventTypeEnum.DEVICE_OFFLINE);
			event.setStatus(StatusEnum.ONLINE);
			event.setTimezoneOffset(areaControl.getGmt());
			events.add(event);

			seniorService.sendEventList(events);
		}
	}

	private void handleDeviceDateTimePendencies(List<DevicePendency> pendencies) {

	}

	private void handleResetDevicePendencies(List<DevicePendency> pendencies) {
	}

	private void handleBlockDevicePendencies(List<BlockDevicePendency> pendencies) {
	}

	private void handleUnblockDevicePendencies(List<UnblockDevicePendency> pendencies) {
	}

	private void handleSetDeviceEmergencyPendencies(List<SetDeviceEmergencyPendency> pendencies) {
	}

	private void handleUnsetDeviceEmergencyPendencies(List<UnsetDeviceEmergencyPendency> pendencies) {
	}

	private void handleApolloIncludeCardPendencies(List<ApolloIncludeCardPendency> pendencies) {
	}

	private void handleApolloExcludeCardPendencies(List<ApolloExcludeCardPendency> pendencies) {
	}

	private void handleIncludeBiometryPendencies(List<IncludeBiometryPendency> pendencies) {
	}

	private void handleExcludeBiometryPendencies(List<ExcludeBiometryPendency> pendencies) {
	}

	private void handleDevicePendencies(List<DeviceUpdatedPendency> pendencies) {
	}

	private void handleLoadHolidayListPendencies(List<LoadHolidayListPendency> pendencies) {
	}

	private void handleRemoveHolidayListPendencies(List<DevicePendency> pendencies) {
	}

	private void handleActivateDeviceOutputPendencies(List<ActiveDeviceOutputPendency> pendencies) {
	}

	private void handleDeactivateDeviceOutputPendencies(List<DeactiveDeviceOutputPendency> pendencies) {
	}

	private void handleDatamartUpdatedPendencies(List<DatamartUpdatedPendency> pendencies) {
	}

	private void handlePersonLocationUpdatedPendencies(List<PersonAreaUpdatedPendency> pendencies) {
	}

	private void handleCollectEventPendencies(List<CollectEventPendency> pendencies) {
	}

	private void handleInputStatusPendencies(List<DevicePendency> pendencies) {
	}

	private void handleManufacturerUpdatedPendencies(List<ManufacturerUpdatedPendency> pendencies) {
	}

	private void handleUpdatePersonREPPendencies(List<UpdatePersonREPPendency> pendencies) {
	}

	private void handleLoadAllowCardListPendencies(List<DevicePendency> pendencies) {
	}

	private void handleRemoveAllowCardListPendencies(List<DevicePendency> pendencies) {
	}

	private void handleLoadBiometryListPendencies(List<DevicePendency> pendencies) {
	}

	private void handleRemoveBiometryListPendencies(List<DevicePendency> pendencies) {
	}

	private void handleIncludeCardPendencies(List<IncludeCardPendency> pendencies) {
	}

	private void handleExcludeCardPendencies(List<ExcludeCardPendency> pendencies) {
	}

	private void handleDeviceDisplayMessagePendencies(List<DeviceDisplayMessagePendency> pendencies) {
	}

	private void handleUpdateFirmwarePendencies(List<DevicePendency> pendencies) {
	}

	private void handleIncludePhotoPendencies(List<IncludePhotoPendency> pendencies) {
	}

	private void handleExcludePhotoPendencies(List<ExcludePhotoPendency> pendencies) {
	}

}
