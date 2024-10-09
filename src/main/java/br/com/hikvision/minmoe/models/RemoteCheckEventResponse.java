package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RemoteCheckEventResponse {

	@JsonProperty("RemoteCheck")
	private RemoteCheck remoteCheck;

	public RemoteCheckEventResponse(int serialNo, String checkResult, String info) {
		this.remoteCheck = new RemoteCheck(serialNo, checkResult, info);
	}

	public RemoteCheckEventResponse() {
	}

	public RemoteCheck getRemoteCheck() {
		return remoteCheck;
	}

	public void setRemoteCheck(RemoteCheck remoteCheck) {
		this.remoteCheck = remoteCheck;
	}

	public static class RemoteCheck {
		@JsonProperty("serialNo")
		private int serialNo;

		@JsonProperty("checkResult")
		private String checkResult;

		@JsonProperty("info")
		private String info;

		public RemoteCheck(int serialNo, String checkResult, String info) {
			this.serialNo = serialNo;
			this.checkResult = checkResult;
			this.info = info;
		}

		// Getters e Setters
		public int getSerialNo() {
			return serialNo;
		}

		public void setSerialNo(int serialNo) {
			this.serialNo = serialNo;
		}

		public String getCheckResult() {
			return checkResult;
		}

		public void setCheckResult(String checkResult) {
			this.checkResult = checkResult;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
	}
}
