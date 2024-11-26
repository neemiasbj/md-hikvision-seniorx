package br.com.hikvision.minmoe.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.resource.Utils;
import br.com.thidi.middleware.utils.MiddlewarePropertiesUtilImpl;

public class HikvisionAccessValidateDevice {
	private int cleanInterval = MiddlewarePropertiesUtilImpl.getValor("hikvision.last.access.validation").isEmpty() ? 3
			: Integer.valueOf(MiddlewarePropertiesUtilImpl.getValor("hikvision.last.access.validation")).intValue();
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private String deviceName;

	public HikvisionAccessValidateDevice(String deviceName) {
		this.deviceName = deviceName;
	}

	private List<HikvisionAccessValidatePerson> personList = new ArrayList<HikvisionAccessValidatePerson>();

	public void cleanDevicesPersonList() throws Exception {
		for (int i = 0; i < personList.size(); i++) {
			if ((new Date().getTime() - dateFormat.parse(personList.get(i).getLastAccess()).getTime())
					/ 1000 > cleanInterval)
				personList.remove(i);
		}
		CLogger.logHikvisionDebug("HikvisionAccessManagerService - cleanDevicesPersonList result",
				Utils.classToJson(personList));
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void updateLastPersonOnlineAccess(HikvisionAccessValidatePerson person) {
		Integer foundPersonIndex = findPersonIndex(person.getPersonId(), person.getSubEventType(),
				person.getCardReaderNo());

		if (foundPersonIndex == null)
			personList.add(person);
		else
			personList.set(foundPersonIndex, person);

	}

	public boolean checkIsPersonValidAccess(HikvisionAccessValidatePerson person) {
		Integer foundPersonIndex = findPersonIndex(person.getPersonId(), person.getSubEventType(),
				person.getCardReaderNo());

		if (foundPersonIndex == null) {
			personList.add(person);
			return true;
		}

		int result = person.getLastAccess().compareTo(personList.get(foundPersonIndex).getLastAccess());
		Boolean isValid = personList.get(foundPersonIndex).getLastAccess() != null && result > 0 ? false : true;

		HikvisionAccessValidatePerson updatePerson = personList.get(foundPersonIndex);
		updatePerson.setLastAccess(person.getLastAccess());
		personList.set(foundPersonIndex, updatePerson);

		return isValid;

	}

	private Integer findPersonIndex(String personId, int subEventType, int cardReaderNo) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getPersonId().equals(personId) && personList.get(i).getSubEventType() == subEventType
					&& personList.get(i).getCardReaderNo() == cardReaderNo)
				return i;
		}
		return null;
	}
}
