package br.com.hikvision.minmoe.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchCardsResponse {
	@JsonProperty("CardInfoSearch")
	private CardInfoSearch cardInfoSearch;

	public CardInfoSearch getCardInfoSearch() {
		return cardInfoSearch;
	}

	public void setCardInfoSearch(CardInfoSearch cardInfoSearch) {
		this.cardInfoSearch = cardInfoSearch;
	}

	public static class CardInfoSearch {
		@JsonProperty("searchID")
		private String searchID;

		@JsonProperty("responseStatusStrg")
		private String responseStatusStrg;

		@JsonProperty("numOfMatches")
		private int numOfMatches;

		@JsonProperty("totalMatches")
		private int totalMatches;

		@JsonProperty("CardInfo")
		private List<CardInfo> cardInfo;

		public String getSearchID() {
			return searchID;
		}

		public void setSearchID(String searchID) {
			this.searchID = searchID;
		}

		public String getResponseStatusStrg() {
			return responseStatusStrg;
		}

		public void setResponseStatusStrg(String responseStatusStrg) {
			this.responseStatusStrg = responseStatusStrg;
		}

		public int getNumOfMatches() {
			return numOfMatches;
		}

		public void setNumOfMatches(int numOfMatches) {
			this.numOfMatches = numOfMatches;
		}

		public int getTotalMatches() {
			return totalMatches;
		}

		public void setTotalMatches(int totalMatches) {
			this.totalMatches = totalMatches;
		}

		public List<CardInfo> getCardInfo() {
			return cardInfo;
		}

		public void setCardInfo(List<CardInfo> cardInfo) {
			this.cardInfo = cardInfo;
		}
	}

	public static class CardInfo {
		@JsonProperty("employeeNo")
		private String employeeNo;

		@JsonProperty("cardNo")
		private String cardNo;

		@JsonProperty("leaderCard")
		private String leaderCard;

		@JsonProperty("cardType")
		private String cardType;

		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

		public String getCardNo() {
			return cardNo;
		}

		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}

		public String getLeaderCard() {
			return leaderCard;
		}

		public void setLeaderCard(String leaderCard) {
			this.leaderCard = leaderCard;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
	}
}
