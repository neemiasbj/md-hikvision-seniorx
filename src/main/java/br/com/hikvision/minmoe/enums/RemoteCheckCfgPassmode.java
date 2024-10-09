package br.com.hikvision.minmoe.enums;

public enum RemoteCheckCfgPassmode {
	PASS("pass"), NOT_PASS("notpass");

	private final String value;

	RemoteCheckCfgPassmode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static RemoteCheckCfgPassmode fromValue(String value) {
		for (RemoteCheckCfgPassmode mode : RemoteCheckCfgPassmode.values()) {
			if (mode.value.equals(value)) {
				return mode;
			}
		}
		throw new IllegalArgumentException("Unexpected value: " + value);
	}
}
