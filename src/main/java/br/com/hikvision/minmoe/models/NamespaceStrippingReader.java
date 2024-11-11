/*    */ package br.com.hikvision.minmoe.models;
/*    */ 
/*    */ import javax.xml.stream.XMLStreamReader;
/*    */ import javax.xml.stream.util.StreamReaderDelegate;
/*    */ 
/*    */ public class NamespaceStrippingReader
/*    */   extends StreamReaderDelegate {
/*    */   public NamespaceStrippingReader(XMLStreamReader reader) {
/*  9 */     super(reader);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getAttributeNamespace(int index) {
/* 14 */     return "";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getNamespaceURI() {
/* 19 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmoe\models\NamespaceStrippingReader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */