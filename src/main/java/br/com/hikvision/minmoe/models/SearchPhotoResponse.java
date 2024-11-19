package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

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

	public int getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusString() {
		return this.statusString;
	}

	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	public String getSubStatusCode() {
		return this.subStatusCode;
	}

	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
	}

	public String getResponseStatusStrg() {
		return this.responseStatusStrg;
	}

	public void setResponseStatusStrg(String responseStatusStrg) {
		this.responseStatusStrg = responseStatusStrg;
	}

	public int getNumOfMatches() {
		return this.numOfMatches;
	}

	public void setNumOfMatches(int numOfMatches) {
		this.numOfMatches = numOfMatches;
	}

	public int getTotalMatches() {
		return this.totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public List<Match> getMatchList() {
		return this.matchList;
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

		public String getFPID() {
			return this.FPID;
		}

		public void setFPID(String FPID) {
			this.FPID = FPID;
		}

		public String getFaceURL() {
			return this.faceURL;
		}

		public void setFaceURL(String faceURL) {
			this.faceURL = faceURL;
		}

		public String getModelData() {
			return this.modelData;
		}

		public void setModelData(String modelData) {
			this.modelData = modelData;
		}
	}
}
