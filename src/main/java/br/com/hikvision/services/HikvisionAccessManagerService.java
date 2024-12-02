package br.com.hikvision.services;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.hikvision.minmoe.models.HikvisionAccessValidateDevice;
import br.com.hikvision.minmoe.models.HikvisionAccessValidatePerson;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.utils.MiddlewarePropertiesUtilImpl;

public class HikvisionAccessManagerService {
	private static ArrayList<HikvisionAccessValidateDevice> devices = new ArrayList<>();
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
	private int cleanInterval = MiddlewarePropertiesUtilImpl.getValor("hikvision.last.access.validation").isEmpty() ? 10
			: Integer.valueOf(MiddlewarePropertiesUtilImpl.getValor("hikvision.last.access.validation")).intValue();

	@Autowired
	public HikvisionAccessManagerService() {
		this.executorService.scheduleAtFixedRate(() -> {
			try {
				cleanDevicesPersonList();
			} catch (Exception e) {
				CLogger.logHikvisionError("HikvisionAccessManagerService", "executorService.scheduleAtFixedRate", e);
			}
		}, this.cleanInterval, this.cleanInterval, TimeUnit.SECONDS);
	}

	private void cleanDevicesPersonList() {
		for (HikvisionAccessValidateDevice device : devices)
			try {
				device.cleanDevicesPersonList();
			} catch (Exception e) {
				e.printStackTrace();
				CLogger.logHikvisionError("HikvisionAccessManagerService - cleanDevicesPersonList", e.getMessage());
			}
	}

	private static HikvisionAccessValidateDevice getDeviceByName(String deviceName) {
		for (HikvisionAccessValidateDevice device : devices)
			if (device.getDeviceName().equals(deviceName))
				return device;
		return null;
	}

	public static boolean checkIsValidAccess(String deviceName, HikvisionAccessValidatePerson person) {
		HikvisionAccessValidateDevice device = getDeviceByName(deviceName);
		if (device == null) {
			device = new HikvisionAccessValidateDevice(deviceName);
			devices.add(device);
		}

		return device.checkIsPersonValidAccess(person);
	}

	public static void updatePersonLastOnlineAccess(String deviceName, HikvisionAccessValidatePerson person) {
		HikvisionAccessValidateDevice device = getDeviceByName(deviceName);
		if (device == null) {
			device = new HikvisionAccessValidateDevice(deviceName);
			devices.add(device);
		}
		device.updateLastPersonOnlineAccess(person);
	}
}
