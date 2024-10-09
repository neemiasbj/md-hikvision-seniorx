package br.com.hikvision.minmoe.models;

import java.time.LocalDateTime;

public class EmployeeCard {
	private String employeeId;
	private String cardId;
	private LocalDateTime dateTime;

	public EmployeeCard(String employeeId, String cardId, LocalDateTime dateTime) {
		this.employeeId = employeeId;
		this.cardId = cardId;
		this.dateTime = dateTime;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getCardId() {
		return cardId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public String toString() {
		return "EmployeeCard{" + "employeeId='" + employeeId + '\'' + ", cardId='" + cardId + '\'' + ", dateTime="
				+ dateTime + '}';
	}
}
