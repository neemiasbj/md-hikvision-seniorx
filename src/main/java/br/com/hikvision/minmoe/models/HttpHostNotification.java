package br.com.hikvision.minmoe.models;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "HttpHostNotification")
@XmlType(propOrder = { "id", "url", "protocolType", "parameterFormatType", "addressingFormatType", "ipAddress", "portNo", "httpAuthenticationMethod" })
public class HttpHostNotification {

	private String id;
	private String url;
	private String protocolType;
	private String parameterFormatType;
	private String addressingFormatType;
	private String ipAddress;
	private int portNo;
	private String httpAuthenticationMethod;

	@XmlElement
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@XmlElement
	public String getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	@XmlElement
	public String getParameterFormatType() {
		return parameterFormatType;
	}

	public void setParameterFormatType(String parameterFormatType) {
		this.parameterFormatType = parameterFormatType;
	}

	@XmlElement
	public String getAddressingFormatType() {
		return addressingFormatType;
	}

	public void setAddressingFormatType(String addressingFormatType) {
		this.addressingFormatType = addressingFormatType;
	}

	@XmlElement
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@XmlElement
	public int getPortNo() {
		return portNo;
	}

	public void setPortNo(int portNo) {
		this.portNo = portNo;
	}

	@XmlElement
	public String getHttpAuthenticationMethod() {
		return httpAuthenticationMethod;
	}

	public void setHttpAuthenticationMethod(String httpAuthenticationMethod) {
		this.httpAuthenticationMethod = httpAuthenticationMethod;
	}
}
