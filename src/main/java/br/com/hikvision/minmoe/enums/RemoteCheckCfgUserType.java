package br.com.hikvision.minmoe.enums;

public enum RemoteCheckCfgUserType {
	NORMAL("normal"), NORMAL_VISITO_UNKNOW("normalOrvisitorOrunknow");

	private final String value;

	RemoteCheckCfgUserType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static RemoteCheckCfgUserType fromValue(String value) {
		for (RemoteCheckCfgUserType mode : RemoteCheckCfgUserType.values()) {
			if (mode.value.equals(value)) {
				return mode;
			}
		}
		throw new IllegalArgumentException("Unexpected value: " + value);
	}
}
