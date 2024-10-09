package br.com.hikvision.minmoe.models;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncludeUserFingerPrint {

	@JsonProperty("FingerPrintCfg")
	private FingerPrintCfg fingerPrintCfg;

	public FingerPrintCfg getFingerPrintCfg() {
		return fingerPrintCfg;
	}

	public void setFingerPrintCfg(FingerPrintCfg fingerPrintCfg) {
		this.fingerPrintCfg = fingerPrintCfg;
	}

	public static class FingerPrintCfg {

		@JsonProperty("employeeNo")
		private String employeeNo;

		@JsonProperty("enableCardReader")
		private List<Integer> enableCardReader = Arrays.asList(1);

		@JsonProperty("fingerPrintID")
		private int fingerPrintID = 1;

		@JsonProperty("fingerType")
		private String fingerType = "normalFP";

		@JsonProperty("fingerData")
		private String fingerData;

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

		public int getFingerPrintID() {
			return fingerPrintID;
		}

		public void setFingerPrintID(int fingerPrintID) {
			this.fingerPrintID = fingerPrintID;
		}

		public String getFingerType() {
			return fingerType;
		}

		public void setFingerType(String fingerType) {
			this.fingerType = fingerType;
		}

		public String getFingerData() {
			return fingerData;
		}

		public void setFingerData(String fingerData) {
			this.fingerData = fingerData;
		}
	}
}
