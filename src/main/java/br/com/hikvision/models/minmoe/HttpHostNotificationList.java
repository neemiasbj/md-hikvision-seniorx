package br.com.hikvision.models.minmoe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HttpHostNotificationList")
@XmlAccessorType(XmlAccessType.FIELD)
public class HttpHostNotificationList {

	@XmlElement(name = "HttpHostNotification")
	private HttpHostNotification httpHostNotification;

	public HttpHostNotification getHttpHostNotification() {
		return httpHostNotification;
	}

	public void setHttpHostNotification(HttpHostNotification httpHostNotification) {
		this.httpHostNotification = httpHostNotification;
	}
}
