package br.com.hikvision.minmoe.models;

public class RemoteCheck {

	private String statusCode, statusString, subStatusCode;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
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

	@Override
	public String toString() {
		return "RemoteCheck [statusCode=" + statusCode + ", statusString=" + statusString + ", subStatusCode=" + subStatusCode + "]";
	}

}
