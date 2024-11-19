package br.com.hikvision.minmoe.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchCardsByCardsRequest {

	@JsonProperty("CardInfoSearchCond")
	private CardInfoSearchCond data;

	public CardInfoSearchCond getData() {
		return data;
	}

	public void setData(CardInfoSearchCond data) {
		this.data = data;
	}

	public static class CardInfoSearchCond {
		private String searchID;
		private int searchResultPosition;
		private int maxResults;
		private List<CardNo> cardNoList;

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

		public List<CardNo> getCardNoList() {
			return cardNoList;
		}

		public void setCardNoList(List<CardNo> cardNoList) {
			this.cardNoList = cardNoList;
		}

	}

	public static class CardNo {
		@JsonProperty("cardNo")
		private String cardNo;

		public CardNo() {
		}

		public CardNo(String cardNo) {
			this.cardNo = cardNo;
		}

		public String getCardNo() {
			return cardNo;
		}

		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}
	}
}
