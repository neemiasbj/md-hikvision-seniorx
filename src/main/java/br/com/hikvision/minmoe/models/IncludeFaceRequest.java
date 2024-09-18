package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncludeFaceRequest {

	@JsonProperty("faceLibType")
	private String faceLibType = "blackFD";

	@JsonProperty("FDID")
	private String FDID = "1";

	@JsonProperty("FPID")
	private String FPID;

	public IncludeFaceRequest() {
	}

	public IncludeFaceRequest( String fpid) {
		this.FPID = fpid;
	}

	public String getFaceLibType() {
		return faceLibType;
	}

//	public void setFaceLibType(String faceLibType) {
//		this.faceLibType = faceLibType;
//	}

//	public String getFdid() {
//		return FDID;
//	}

	public void setFdid(String fdid) {
		this.FDID = fdid;
	}

	public String getFpid() {
		return FPID;
	}

	public void setFpid(String fpid) {
		this.FPID = fpid;
	}
}
