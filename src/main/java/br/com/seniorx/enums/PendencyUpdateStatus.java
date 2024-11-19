package br.com.seniorx.enums;

public enum PendencyUpdateStatus {
	DEVICE_NOT_FOUND(343, "Dispositivo não encontrado"), DEVICE_OFFLINE(344, "Dispositivo offline"),
	PENDING_NOT_IMPLEMENTED(345, "Pendência não implementada"),
	PENDING_EXECUTED_WITH_UNKNOWN_ERROR(346, "Pendência executada com erro desconhecido");

	private final int code;
	private final String description;

	PendencyUpdateStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return this.code;
	}

	public String getDescription() {
		return this.description;
	}

	public String toString() {
		return String.valueOf(this.code) + " - " + this.description;
	}
	
	public static PendencyUpdateStatus fromCode(int code) {
		byte b;
		int i;
		PendencyUpdateStatus[] arrayOfPendencyUpdateStatus;
		for (i = (arrayOfPendencyUpdateStatus = values()).length, b = 0; b < i;) {
			PendencyUpdateStatus errorCode = arrayOfPendencyUpdateStatus[b];
			if (errorCode.getCode() == code)
				return errorCode;
			b++;
		}

		throw new IllegalArgumentException("Código de erro desconhecido: " + code);
	}
}
