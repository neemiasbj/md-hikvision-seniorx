package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

<<<<<<<< HEAD:src/main/java/br/com/hikvision/minmoe/models/IncludeUserFaceRequest.java
public class IncludeUserFaceRequest {
========
public class IncludeUserFace {
>>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c:src/main/java/br/com/hikvision/minmoe/models/IncludeUserFace.java

	@JsonProperty("faceLibType")
	private String faceLibType = "blackFD";

	@JsonProperty("FDID")
	private String FDID = "1";

	@JsonProperty("FPID")
	private String FPID;

<<<<<<<< HEAD:src/main/java/br/com/hikvision/minmoe/models/IncludeUserFaceRequest.java
	public IncludeUserFaceRequest() {
	}

	public IncludeUserFaceRequest( String fpid) {
========
	public IncludeUserFace() {
	}

	public IncludeUserFace(String fpid) {
>>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c:src/main/java/br/com/hikvision/minmoe/models/IncludeUserFace.java
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
