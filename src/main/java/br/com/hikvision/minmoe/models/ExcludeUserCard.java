package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ExcludeUserCard {

	@JsonProperty("CardInfoDelCond")
	private CardInfoDelCondData cardInfoDelCondData;

	public CardInfoDelCondData getCardInfoDelCondData() {
		return cardInfoDelCondData;
	}

	public void setCardInfoDelCondData(CardInfoDelCondData cardInfoDelCondData) {
		this.cardInfoDelCondData = cardInfoDelCondData;
	}

	public static class CardInfoDelCondData {

		@JsonProperty("CardNoList")
		private List<CardNo> cardNoList;

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

		public String getCardNo() {
			return cardNo;
		}

		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}
	}
}
