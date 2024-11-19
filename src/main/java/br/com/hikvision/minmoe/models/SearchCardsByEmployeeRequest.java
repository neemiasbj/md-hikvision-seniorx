package br.com.hikvision.minmoe.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchCardsByEmployeeRequest {

	@JsonProperty("CardInfoSearchCond")
	private CardInfoSearchCond cardInfoSearchCond;

	public CardInfoSearchCond getCardInfoSearchCond() {
		return cardInfoSearchCond;
	}

	public void setCardInfoSearchCond(CardInfoSearchCond cardInfoSearchCond) {
		this.cardInfoSearchCond = cardInfoSearchCond;
	}

	public static class CardInfoSearchCond {
		private String searchID;
		private int searchResultPosition;
		private int maxResults;
		private List<EmployeeNo> employeeNoList;

		public String getSearchID() {
			return searchID;
		}

		public void setSearchID(String searchID) {
			this.searchID = searchID;
		}

		public int getSearchResultPosition() {
			return searchResultPosition;
		}

		public void setSearchResultPosition(int searchResultPosition) {
			this.searchResultPosition = searchResultPosition;
		}

		public int getMaxResults() {
			return maxResults;
		}

		public void setMaxResults(int maxResults) {
			this.maxResults = maxResults;
		}

		public List<EmployeeNo> getEmployeeNoList() {
			return employeeNoList;
		}

		public void setEmployeeNoList(List<EmployeeNo> employeeNoList) {
			this.employeeNoList = employeeNoList;
		}

	}

	public static class EmployeeNo {
		private String employeeNo;

		public EmployeeNo() {
		}

		public EmployeeNo(String cardNo) {
			this.employeeNo = cardNo;
		}

		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String cardNo) {
			this.employeeNo = cardNo;
		}
	}
}
