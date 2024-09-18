package br.com.hikvision.minmoe.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchPhotoResponse {
	private int statusCode;
	private String statusString;
	private String subStatusCode;
	private String responseStatusStrg;
	private int numOfMatches;
	private int totalMatches;

	@JsonProperty("MatchList")
	private List<Match> MatchList;

	public static class Match {
		@JsonProperty("FPID")
		private String FPID;

		@JsonProperty("faceURL")
		private String faceURL;

		@JsonProperty("modelData")
		private String modelData;

		public String getFPID() {
			return FPID;
		}

		public void setFPID(String FPID) {
			this.FPID = FPID;
		}

		public String getFaceURL() {
			return faceURL;
		}

		public void setFaceURL(String faceURL) {
			this.faceURL = faceURL;
		}

		public String getModelData() {
			return modelData;
		}

		public void setModelData(String modelData) {
			this.modelData = modelData;
		}
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusString() {
		return statusString;
	}

	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	public String getSubStatusCode() {
		return subStatusCode;
	}

	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
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

	public List<Match> getMatchList() {
		return MatchList;
	}

	public void setMatchList(List<Match> matchList) {
		this.MatchList = matchList;
	}
}
