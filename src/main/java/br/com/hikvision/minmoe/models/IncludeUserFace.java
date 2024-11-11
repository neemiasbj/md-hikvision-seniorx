<<<<<<< HEAD
/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ public class IncludeUserFace
/*    */ {
/*    */   @JsonProperty("faceLibType")
/*  8 */   private String faceLibType = "blackFD";
/*    */   
/*    */   @JsonProperty("FDID")
/* 11 */   private String FDID = "1";
/*    */   
/*    */   @JsonProperty("FPID")
/*    */   private String FPID;
/*    */ 
/*    */   
/*    */   public IncludeUserFace() {}
/*    */   
/*    */   public IncludeUserFace(String fpid) {
/* 20 */     this.FPID = fpid;
/*    */   }
/*    */   
/*    */   public String getFaceLibType() {
/* 24 */     return this.faceLibType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFdid(String fdid) {
/* 36 */     this.FDID = fdid;
/*    */   }
/*    */   
/*    */   public String getFpid() {
/* 40 */     return this.FPID;
/*    */   }
/*    */   
/*    */   public void setFpid(String fpid) {
/* 44 */     this.FPID = fpid;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\IncludeUserFace.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
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
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
