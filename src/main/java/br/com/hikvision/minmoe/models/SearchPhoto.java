<<<<<<< HEAD
/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ public class SearchPhoto
/*    */ {
/*    */   private int searchResultPosition;
/*    */   private int maxResults;
/*  7 */   private String faceLibType = "blackFD";
/*  8 */   private String FDID = "1";
/*    */   private String FPID;
/*    */   
/*    */   public int getSearchResultPosition() {
/* 12 */     return this.searchResultPosition;
/*    */   }
/*    */   
/*    */   public void setSearchResultPosition(int searchResultPosition) {
/* 16 */     this.searchResultPosition = searchResultPosition;
/*    */   }
/*    */   
/*    */   public int getMaxResults() {
/* 20 */     return this.maxResults;
/*    */   }
/*    */   
/*    */   public void setMaxResults(int maxResults) {
/* 24 */     this.maxResults = maxResults;
/*    */   }
/*    */   
/*    */   public String getFaceLibType() {
/* 28 */     return this.faceLibType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getFDID() {
/* 36 */     return this.FDID;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getFPID() {
/* 44 */     return this.FPID;
/*    */   }
/*    */   
/*    */   public void setFPID(String FPID) {
/* 48 */     this.FPID = FPID;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\SearchPhoto.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.hikvision.minmoe.models;

public class SearchPhoto {

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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
