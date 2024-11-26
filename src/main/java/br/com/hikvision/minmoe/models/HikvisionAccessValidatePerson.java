package br.com.hikvision.minmoe.models;

public class HikvisionAccessValidatePerson {

	private String personId, lastAccess = "";
	private int subEventType, cardReaderNo;

	public HikvisionAccessValidatePerson(String personId, String lastAccess, int subEventType, int cardReaderNo) {
		this.personId = personId;
		this.lastAccess = lastAccess;
		this.subEventType = subEventType;
		this.cardReaderNo = cardReaderNo;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(String lastAccess) {
		this.lastAccess = lastAccess;
	}

	public int getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(int subEventType) {
		this.subEventType = subEventType;
	}

	public int getCardReaderNo() {
		return cardReaderNo;
	}

	public void setCardReaderNo(int cardReaderNo) {
		this.cardReaderNo = cardReaderNo;
	}

}
