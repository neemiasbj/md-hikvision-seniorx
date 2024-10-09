package br.com.hikvision.minmoe.models;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExcludeUserFingerPrint {

	@JsonProperty("FingerPrintDelete")
	private FingerPrintDelete fingerPrintDelete;

	public FingerPrintDelete getFingerPrintDelete() {
		return fingerPrintDelete;
	}

	public void setFingerPrintDelete(FingerPrintDelete fingerPrintDelete) {
		this.fingerPrintDelete = fingerPrintDelete;
	}

	public static class FingerPrintDelete {

		@JsonProperty("mode")
		private String mode;

		@JsonProperty("EmployeeNoDetail")
		private EmployeeNoDetail employeeNoDetail;

		// Getters e Setters
		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public EmployeeNoDetail getEmployeeNoDetail() {
			return employeeNoDetail;
		}

		public void setEmployeeNoDetail(EmployeeNoDetail employeeNoDetail) {
			this.employeeNoDetail = employeeNoDetail;
		}
	}

	public static class EmployeeNoDetail {

		@JsonProperty("employeeNo")
		private String employeeNo;

		@JsonProperty("enableCardReader")
		private List<Integer> enableCardReader;

		@JsonProperty("fingerPrintID")
		private List<Integer> fingerPrintID;

		// Getters e Setters
		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

		public List<Integer> getEnableCardReader() {
			return enableCardReader;
		}

		public void setEnableCardReader(List<Integer> enableCardReader) {
			this.enableCardReader = enableCardReader;
		}

		public List<Integer> getFingerPrintID() {
			return fingerPrintID;
		}

		public void setFingerPrintID(List<Integer> fingerPrintID) {
			this.fingerPrintID = fingerPrintID;
		}
	}
}
