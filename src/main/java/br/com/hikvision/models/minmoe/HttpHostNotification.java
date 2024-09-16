package br.com.hikvision.models.minmoe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class HttpHostNotification {

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "url")
	private String url;

	@XmlElement(name = "protocolType")
	private String protocolType;

	@XmlElement(name = "parameterFormatType")
	private String parameterFormatType;

	@XmlElement(name = "addressingFormatType")
	private String addressingFormatType;

	@XmlElement(name = "ipAddress")
	private String ipAddress;

	@XmlElement(name = "portNo")
	private int portNo;

	@XmlElement(name = "httpAuthenticationMethod")
	private String httpAuthenticationMethod;

	// Getters e Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	public String getParameterFormatType() {
		return parameterFormatType;
	}

	public void setParameterFormatType(String parameterFormatType) {
		this.parameterFormatType = parameterFormatType;
	}

	public String getAddressingFormatType() {
		return addressingFormatType;
	}

	public void setAddressingFormatType(String addressingFormatType) {
		this.addressingFormatType = addressingFormatType;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getPortNo() {
		return portNo;
	}

	public void setPortNo(int portNo) {
		this.portNo = portNo;
	}

	public String getHttpAuthenticationMethod() {
		return httpAuthenticationMethod;
	}

	public void setHttpAuthenticationMethod(String httpAuthenticationMethod) {
		this.httpAuthenticationMethod = httpAuthenticationMethod;
	}
}
