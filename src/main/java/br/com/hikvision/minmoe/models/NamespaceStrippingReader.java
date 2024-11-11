<<<<<<< HEAD
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
=======
package br.com.hikvision.minmoe.models;

import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class NamespaceStrippingReader extends StreamReaderDelegate {

	public NamespaceStrippingReader(XMLStreamReader reader) {
		super(reader);
	}

	@Override
	public String getAttributeNamespace(int index) {
		return "";
	}

	@Override
	public String getNamespaceURI() {
		return "";
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
