package br.com.hikvision.minmoe.models;

public class SearchPhotoRequest {

	private int searchResultPosition;
	private int maxResults;
	private String faceLibType = "blackFD";
	private String FDID = "1";
	private String FPID;

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

	public String getFaceLibType() {
		return faceLibType;
	}

//	public void setFaceLibType(String faceLibType) {
//		this.faceLibType = faceLibType;
//	}

	public String getFDID() {
		return FDID;
	}

//	public void setFDID(String FDID) {
//		this.FDID = FDID;
//	}

	public String getFPID() {
		return FPID;
	}

	public void setFPID(String FPID) {
		this.FPID = FPID;
	}
}
