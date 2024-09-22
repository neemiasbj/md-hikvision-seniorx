package br.com.hikvision.minmoe.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchPhotoResponse {
	@JsonProperty("statusCode")
	private int statusCode;

	@JsonProperty("statusString")
	private String statusString;

	@JsonProperty("subStatusCode")
	private String subStatusCode;

	@JsonProperty("responseStatusStrg")
	private String responseStatusStrg;

	@JsonProperty("numOfMatches")
	private int numOfMatches;

	@JsonProperty("totalMatches")
	private int totalMatches;

	@JsonProperty("MatchList")
	private List<Match> matchList;

	// Getters and Setters
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
		return matchList;
	}

	public void setMatchList(List<Match> matchList) {
		this.matchList = matchList;
	}

	public static class Match {

		@JsonProperty("FPID")
		private String FPID;

		@JsonProperty("faceURL")
		private String faceURL;

		@JsonProperty("modelData")
		private String modelData;

		// Getters and Setters
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
}