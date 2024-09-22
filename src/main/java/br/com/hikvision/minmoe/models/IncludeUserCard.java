package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncludeUserCard {

	@JsonProperty("CardInfo")
	private CardInfo cardInfo;

	public CardInfo getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	public static class CardInfo {

		@JsonProperty("employeeNo")
		private String employeeNo;

		@JsonProperty("cardNo")
		private String cardNo;

		@JsonProperty("cardType")
		private String cardType = "normalCard";

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

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
	}
}
