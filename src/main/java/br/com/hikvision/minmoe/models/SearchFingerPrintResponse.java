package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SearchFingerPrintResponse {

	@JsonProperty("FingerPrintInfo")
	private FingerPrintInfo fingerPrintInfo;

	public FingerPrintInfo getFingerPrintInfo() {
		return fingerPrintInfo;
	}

	public void setFingerPrintInfo(FingerPrintInfo fingerPrintInfo) {
		this.fingerPrintInfo = fingerPrintInfo;
	}

	public static class FingerPrintInfo {

		@JsonProperty("searchID")
		private String searchID;

		@JsonProperty("status")
		private String status;

		@JsonProperty("FingerPrintList")
		private List<FingerPrint> fingerPrintList;

		// Getters e Setters
		public String getSearchID() {
			return searchID;
		}

		public void setSearchID(String searchID) {
			this.searchID = searchID;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<FingerPrint> getFingerPrintList() {
			return fingerPrintList;
		}

		public void setFingerPrintList(List<FingerPrint> fingerPrintList) {
			this.fingerPrintList = fingerPrintList;
		}
	}

	public static class FingerPrint {

		@JsonProperty("cardReaderNo")
		private int cardReaderNo;

		@JsonProperty("fingerPrintID")
		private int fingerPrintID;

		@JsonProperty("fingerType")
		private String fingerType;

		@JsonProperty("fingerData")
		private String fingerData;

		@JsonProperty("leaderFP")
		private List<String> leaderFP;

		// Getters e Setters
		public int getCardReaderNo() {
			return cardReaderNo;
		}

		public void setCardReaderNo(int cardReaderNo) {
			this.cardReaderNo = cardReaderNo;
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

		public List<String> getLeaderFP() {
			return leaderFP;
		}

		public void setLeaderFP(List<String> leaderFP) {
			this.leaderFP = leaderFP;
		}
	}
}
