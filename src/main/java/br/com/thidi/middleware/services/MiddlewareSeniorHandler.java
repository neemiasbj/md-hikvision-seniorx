
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
import br.com.hikvision.minmoe.models.ExcludePhotoRequest;
import br.com.hikvision.minmoe.models.ExcludeUserCard;
import br.com.hikvision.minmoe.models.ExcludeUserFingerPrint;
import br.com.hikvision.minmoe.models.IncludeUser;
import br.com.hikvision.minmoe.models.IncludeUserCard;
import br.com.hikvision.minmoe.models.IncludeUserFaceRequest;
import br.com.hikvision.minmoe.models.IncludeUserFingerPrint;
import br.com.hikvision.minmoe.models.SearchPhotoRequest;
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
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
	private int interval = MiddlewarePropertiesUtilImpl.getValor("time.keep.alive.senior.seconds").isEmpty() ? 30
			: Integer.valueOf(MiddlewarePropertiesUtilImpl.getValor("time.keep.alive.senior.seconds")).intValue();
	private static SimpleDateFormat sdfyyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	Calendar calendar = Calendar.getInstance();

	@Autowired
	public MiddlewareSeniorHandler() {
		this.executorService.scheduleAtFixedRate(() -> {
			try {
				CLogger.logSeniorInfo(" PENDENCIES AND KEEP ALIVE", "Started...");

				List<ManagerDevice> devices = SeniorApiService.getDevices();

				ManagerDeviceList.setManagerDeviceList(devices);
				handleKeepAlive(devices);
				HandleDevicesPendencies();
			} catch (Exception e) {
				CLogger.logSeniorInfo("KEEP ALIVE", "Error: " + e.getMessage());
			}
		}, 0, this.interval, TimeUnit.SECONDS);
	}

	private static final DateFormat seniorDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public void handleKeepAlive(List<ManagerDevice> devices) {
		try {
			if (devices == null || devices.size() == 0) {
				CLogger.logSeniorInfo(" KEEP ALIVE", "No devices found.");
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
			CLogger.logSeniorInfo(" KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public void HandleDevicesPendencies() {
		try {
			SeniorApiService seniorService = new SeniorApiService();
			List<ManagerDevice> devices = SeniorApiService.getDevices();

			if (devices == null) {
				CLogger.logSeniorInfo(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " KEEP ALIVE",
						"No devices found.");
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
			CLogger.logSeniorInfo(" KEEP ALIVE", "Error: " + e.getMessage());
		}
	}

	public static void HandleWebSocketMessage(Long deviceId) {
		ManagerDevice device = SeniorApiService.getDevice(deviceId);

		if (device == null) {
			CLogger.logSeniorInfo(" HANDLE WEBSOCKET MESSAGE", "Device not found for id: " + deviceId);
		} else {
			SeniorApiService seniorService = new SeniorApiService();
			seniorService.setDevice(device);
			AllPendency pendencies = seniorService.getDevicePendencies(deviceId);
			HikvisionMinMoeService hikvisionService = new HikvisionMinMoeService(device);

			HandleDevicePendencies(pendencies, hikvisionService, seniorService);
		}
	}

	private static String getDeviceInfo(ManagerDevice device) {
		return String.format(">>> Device:%s : %s - %s <<<",
				new Object[] { device.getId(), device.getNetworkIdentification(), device.getNetworkPort() });
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
		List<PendencyExecuted> pendenciesSuccess = new ArrayList<>();
		PendencyExecuted pendencyExecuted = new PendencyExecuted();
		pendencyExecuted.setPendencyId(pendencyId);
		pendenciesSuccess.add(pendencyExecuted);
		seniorService.updatePendenciesExecuted(pendenciesSuccess);
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
		pendenciesUpdate.add(pendencyUpdated);
		seniorService.updatePendenciesStatus(pendenciesUpdate);
	}

	private static void handleDeviceStatusPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		if (pendencies != null) {
			for (DevicePendency pendency : pendencies)
				checkDeviceStatus(pendency, seniorService, minmoeService, null);
		} else {
			CLogger.logSeniorDebug(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " CHECK STATUS PENDENCY",
					"No check status pendency for device " + seniorService.getDevice().getId());
		}
	}

	private static void checkDeviceStatus(DevicePendency pendency, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService, Long deviceId) {
		try {
			DeviceInfo deviceInfo = minmoeService.getDeviceInfo();

			Boolean deviceStatus = Boolean.valueOf(!(deviceInfo == null));

			AreaControlList areaControl = seniorService.getAreaById(seniorService.getDevice().getAreaId());
			if (areaControl == null) {
				return;
			}

			if (pendency != null) {
				if (deviceStatus.booleanValue()) {
					List<PendencyExecuted> pendenciesExecuted = new ArrayList<>();
					PendencyExecuted pendencyExecuted = new PendencyExecuted();
					pendencyExecuted.setPendencyId(pendency.getPendencyId());
					pendenciesExecuted.add(pendencyExecuted);
					seniorService.updatePendenciesExecuted(pendenciesExecuted);
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
				event.setTimezoneOffset(areaControl.getGmt());
				events.add(event);

				seniorService.sendEventList(events);
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DEVICE STATUS",
					e.getMessage());
		}
	}

	private static void handleDeviceDateTimePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {

				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
					DateTime dateTime = new DateTime("manual", sdf.format(new Date()),
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
							e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
					e.getMessage());
		}
	}

	private static void handleResetDevicePendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
		try {
			for (DevicePendency pendency : pendencies) {
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
		}
	}

	private static void handleBlockDevicePendencies(List<BlockDevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (BlockDevicePendency pendency : pendencies) {

				try {
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
							e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " BlockDevicePendencies",
					e.getMessage());
		}
	}

	private static void handleUnblockDevicePendencies(List<UnblockDevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (UnblockDevicePendency pendency : pendencies) {

				try {
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
							e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " UnblockDevicePendencies",
					e.getMessage());
		}
	}

	private static void handleSetDeviceEmergencyPendencies(List<SetDeviceEmergencyPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
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
		}
	}

	private static void handleUnsetDeviceEmergencyPendencies(List<UnsetDeviceEmergencyPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		for (UnsetDeviceEmergencyPendency pendency : pendencies) {
			try {
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
		}
	}

	private static void handleApolloIncludeCardPendencies(List<ApolloIncludeCardPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (ApolloIncludeCardPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.REMOVE_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloIncludeCardPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloIncludeCardPendencies",
					e.getMessage());
		}
	}

	private static void handleApolloExcludeCardPendencies(List<ApolloExcludeCardPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (ApolloExcludeCardPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.REMOVE_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloExcludeCardPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ApolloExcludeCardPendencies",
					e.getMessage());
		}
	}

	private static void handleIncludeBiometryPendencies(List<IncludeBiometryPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (IncludeBiometryPendency pendency : pendencies) {

				try {
					PersonInfo person = SeniorApiService.getPersonCardAndPhotoInfo(pendency.getManagerDeviceId(),
							pendency.getPersonId(), null);
					if (person == null) {
						CLogger.logSeniorDebug(
								String.valueOf(getDeviceInfo(seniorService.getDevice()))
										+ " handleIncludeCardPendencies",
								"Person not found: " + pendency.getPersonId());

						continue;
					}
					IncludeUser user = new IncludeUser();
					IncludeUser.UserInfo userInfo = new IncludeUser.UserInfo();
					userInfo.setEmployeeNo(person.getPersonId().toString());
					userInfo.setName(person.getPersonName());
					userInfo.setUserType("normal");

					Date currentDate = new Date();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(currentDate);
					calendar.add(1, 10);
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

					List<IncludeUserFingerPrint> fpList = new ArrayList<>();

					for (int i = 0; i < pendency.getBiometry().getTemplateList().size(); i++) {
						IncludeUserFingerPrint userFp = new IncludeUserFingerPrint();
						IncludeUserFingerPrint.FingerPrintCfg fingerPrintCfg = new IncludeUserFingerPrint.FingerPrintCfg();
						fingerPrintCfg.setEmployeeNo(pendency.getPersonId().toString());
						fingerPrintCfg.setFingerData(pendency.getBiometry().getTemplateList().get(i));
						fingerPrintCfg.setFingerPrintID(i + 1);
						userFp.setFingerPrintCfg(fingerPrintCfg);

						fpList.add(userFp);
					}

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
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludeBiometryPendency",
					e.getMessage());
			e.printStackTrace();
		}
	}

	private static void handleExcludeBiometryPendencies(List<ExcludeBiometryPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (ExcludeBiometryPendency pendency : pendencies) {

				try {
					ExcludeUserFingerPrint request = new ExcludeUserFingerPrint();
					ExcludeUserFingerPrint.FingerPrintDelete fingerPrintDelete = new ExcludeUserFingerPrint.FingerPrintDelete();
					ExcludeUserFingerPrint.EmployeeNoDetail employeeNoDetail = new ExcludeUserFingerPrint.EmployeeNoDetail();

					employeeNoDetail.setEmployeeNo(pendency.getPersonId().toString());
					fingerPrintDelete.setMode("byEmployeeNo");
					fingerPrintDelete.setEmployeeNoDetail(employeeNoDetail);

					request.setFingerPrintDelete(fingerPrintDelete);

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
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeBiometryPendency",
					e.getMessage());
		}
	}

	private static void handleDevicePendencies(List<DeviceUpdatedPendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
			for (DeviceUpdatedPendency pendency : pendencies) {

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
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " DevicePendencies",
					e.getMessage());
		}
	}

	private static void handleLoadHolidayListPendencies(List<LoadHolidayListPendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handleRemoveHolidayListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (DevicePendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveHolidayListPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveHolidayListPendencies",
					e.getMessage());
		}
	}

	private static void handleActivateDeviceOutputPendencies(List<ActiveDeviceOutputPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (ActiveDeviceOutputPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ActivateDeviceOutputPendencies",
						"OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ActivateDeviceOutputPendencies",
					e.getMessage());
		}
	}

	private static void handleDeactivateDeviceOutputPendencies(List<DeactiveDeviceOutputPendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handleDatamartUpdatedPendencies(List<DatamartUpdatedPendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handlePersonLocationUpdatedPendencies(List<PersonAreaUpdatedPendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handleCollectEventPendencies(List<CollectEventPendency> pendencies,
			SeniorApiService seniorService) {
		try {
			for (CollectEventPendency pendency : pendencies) {
				updatePendencyStatus(seniorService, pendency.getPendencyId(),
						PendencyUpdated.OperationEnum.KEEP_PENDENCY, PendencyUpdateStatus.PENDING_NOT_IMPLEMENTED);
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " CollectEventPendencies", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " CollectEventPendencies",
					e.getMessage());
		}
	}

	private static void handleInputStatusPendencies(List<DevicePendency> pendencies, SeniorApiService seniorService) {
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
		}
	}

	private static void handleManufacturerUpdatedPendencies(List<ManufacturerUpdatedPendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handleUpdatePersonREPPendencies(List<UpdatePersonREPPendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handleLoadAllowCardListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {

				try {
					List<CardList> cardList = seniorService.getDeviceAllowedCardList();
					List<IncludeUserCard> includeUsersCard = new ArrayList<>();

					for (CardList seniorCard : cardList) {
						try {
							PersonInfo person = SeniorApiService.getPersonCardAndPhotoInfo(
									pendency.getManagerDeviceId(), null, seniorCard.getCardNumber());
							if (person == null) {
								CLogger.logSeniorDebug(
										String.valueOf(getDeviceInfo(seniorService.getDevice()))
												+ " handleIncludeCardPendencies",
										"Person not found: " + seniorCard.toString());

								continue;
							}
							IncludeUser user = new IncludeUser();
							IncludeUser.UserInfo userInfo = new IncludeUser.UserInfo();
							userInfo.setEmployeeNo(person.getPersonId().toString());
							userInfo.setName(person.getPersonName());
							userInfo.setUserType("normal");

							Date currentDate = new Date();
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(currentDate);
							calendar.add(1, 10);
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
						} catch (Exception e) {
							CLogger.logSeniorError("handleLoadAllowCardListPendencies", e.getMessage());
						}
					}
				} catch (Exception e) {
					updatePendencyStatus(seniorService, pendency.getPendencyId(),
							PendencyUpdated.OperationEnum.KEEP_PENDENCY,
							PendencyUpdateStatus.PENDING_EXECUTED_WITH_UNKNOWN_ERROR);
					CLogger.logSeniorError(
							String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
					e.getMessage());
		}
	}

	private static void handleRemoveAllowCardListPendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (DevicePendency pendency : pendencies) {
				minmoeService.excludeAllUsers();
				sendSuccessPendency(seniorService, pendency.getPendencyId());
				CLogger.logSeniorDebug(
						String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveAllowCardListPendenc", "OK");
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " RemoveAllowCardListPendenc",
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
						List<IncludeUserFingerPrint> fpList = new ArrayList<>();

						for (int i = 0; i < accessBiometry.getTemplateList().size(); i++) {
							String fp = accessBiometry.getTemplateList().get(i);
							IncludeUserFingerPrint userFp = new IncludeUserFingerPrint();
							IncludeUserFingerPrint.FingerPrintCfg fingerPrintCfg = new IncludeUserFingerPrint.FingerPrintCfg();
							fingerPrintCfg.setEmployeeNo(accessBiometry.getPersonId().toString());
							fingerPrintCfg.setFingerData(fp);
							fingerPrintCfg.setFingerPrintID(i + 1);
							userFp.setFingerPrintCfg(fingerPrintCfg);
							fpList.add(userFp);
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
					e.getMessage());
		}
	}

	private static void handleIncludeCardPendencies(List<IncludeCardPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
		try {
			for (IncludeCardPendency pendency : pendencies) {
				try {
					List<IncludeUserCard> includeUsersCard = new ArrayList<>();

					IncludeUserCard userCard = new IncludeUserCard();
					IncludeUserCard.CardInfo cardInfo = new IncludeUserCard.CardInfo();
					cardInfo.setEmployeeNo(pendency.getOwnerId().toString());
					cardInfo.setCardNo(pendency.getCardNumber().toString());
					userCard.setCardInfo(cardInfo);

					includeUsersCard.add(userCard);

					Boolean success = includeCards(includeUsersCard, seniorService, minmoeService);

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
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
					e.getMessage());
		}
	}

	private static Boolean includeCards(List<IncludeUserCard> cards, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) throws Exception {
		for (IncludeUserCard includeUserCard : cards) {
			Boolean success = Boolean.valueOf(minmoeService.includeUserCard(includeUserCard));
			if (!success.booleanValue()) {
				return Boolean.valueOf(false);
			}
		}
		return Boolean.valueOf(true);
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
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludeCardPendency",
					e.getMessage());
		}
	}

	private static void handleDeviceDisplayMessagePendencies(List<DeviceDisplayMessagePendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

	private static void handleUpdateFirmwarePendencies(List<DevicePendency> pendencies,
			SeniorApiService seniorService) {
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
					e.getMessage());
		}
	}

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
					calendar.add(1, 10);
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
							e.getMessage());
				}

			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
					e.getMessage());
		}
	}

	private static boolean includePerson(IncludeUser user, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
			return minmoeService.includeUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " IncludePhotoPendencies",
					e.getMessage());
			return false;
		}
	}

	private static boolean includePersonPhoto(IncludeUser user, String photoUrl, HikvisionMinMoeService minmoeService) {
		try {
			if (!minmoeService.includeUser(user)) {
				return false;
			}
			SearchPhotoRequest photo = new SearchPhotoRequest();
			photo.setFPID(user.getUserInfo().getEmployeeNo());
			photo.setMaxResults(5);
			photo.setSearchResultPosition(0);

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
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private static void handleExcludePhotoPendencies(List<ExcludePhotoPendency> pendencies,
			SeniorApiService seniorService, HikvisionMinMoeService minmoeService) {
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
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(String.valueOf(getDeviceInfo(seniorService.getDevice())) + " ExcludePhotoPendencies",
					e.getMessage());
		}
	}

	private static void handleLoadCredentialFacialList(List<DevicePendency> pendencies, SeniorApiService seniorService,
			HikvisionMinMoeService minmoeService) {
		try {
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
						calendar.add(1, 10);
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
							e.getMessage());
				}
			}
		} catch (Exception e) {
			CLogger.logSeniorError(
					String.valueOf(getDeviceInfo(seniorService.getDevice())) + " LoadCredentialFacialList",
					e.getMessage());
		}
	}

	public static void validateOnlineAccess(SeniorApiService seniorService, HikvisionMinMoeService minmoeService,
			String card) {
	}
}

/*
 * Location:
 * C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\
 * middleware\services\MiddlewareSeniorHandler.class Java compiler version: 17
 * (61.0) JD-Core Version: 1.1.3
 */