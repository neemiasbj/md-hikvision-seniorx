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
