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
		return code;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return code + " - " + description;
	}

	// Método para buscar o enum pelo código
	public static PendencyUpdateStatus fromCode(int code) {
		for (PendencyUpdateStatus errorCode : PendencyUpdateStatus.values()) {
			if (errorCode.getCode() == code) {
				return errorCode;
			}
		}
		throw new IllegalArgumentException("Código de erro desconhecido: " + code);
	}
}
