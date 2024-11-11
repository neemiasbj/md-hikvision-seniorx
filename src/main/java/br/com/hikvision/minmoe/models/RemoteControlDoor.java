/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import jakarta.xml.bind.annotation.XmlElement;
/*    */ import jakarta.xml.bind.annotation.XmlRootElement;
/*    */ 
/*    */ 
/*    */ @XmlRootElement(name = "RemoteControlDoor")
/*    */ public class RemoteControlDoor
/*    */ {
/*    */   private String version;
/*    */   private String cmd;
/*    */   
/*    */   public RemoteControlDoor() {}
/*    */   
/*    */   public RemoteControlDoor(String version, String cmd) {
/* 16 */     this.version = version;
/* 17 */     this.cmd = cmd;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "version")
/*    */   public String getVersion() {
/* 22 */     return this.version;
/*    */   }
/*    */   
/*    */   public void setVersion(String version) {
/* 26 */     this.version = version;
/*    */   }
/*    */   
/*    */   @XmlElement(name = "cmd")
/*    */   public String getCmd() {
/* 31 */     return this.cmd;
/*    */   }
/*    */   
/*    */   public void setCmd(String cmd) {
/* 35 */     this.cmd = cmd;
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\RemoteControlDoor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */