package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchFingerPrintRequest {

	@JsonProperty("FingerPrintCond")
	private FingerPrintCond fingerPrintCond;

	public FingerPrintCond getFingerPrintCond() {
		return fingerPrintCond;
	}

	public void setFingerPrintCond(FingerPrintCond fingerPrintCond) {
		this.fingerPrintCond = fingerPrintCond;
	}

	public static class FingerPrintCond {
		@JsonProperty("searchID")
		private String searchID;

		@JsonProperty("employeeNo")
		private String employeeNo;

		public String getSearchID() {
			return searchID;
		}

		public void setSearchID(String searchID) {
			this.searchID = searchID;
		}

		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

	}
}
