package br.com.hikvision.minmoe.models;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Time")
public class DateTime {

	private String timeMode;
	private String localTime;
	private String timeZone;

	public DateTime() {
	}

	public DateTime(String timeMode, String localTime, String timeZone) {
		this.timeMode = timeMode;
		this.localTime = localTime;
		this.timeZone = timeZone;
	}

	@XmlElement(name = "timeMode")
	public String getTimeMode() {
		return timeMode;
	}

	public void setTimeMode(String timeMode) {
		this.timeMode = timeMode;
	}

	@XmlElement(name = "localTime")
	public String getLocalTime() {
		return localTime;
	}

	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}

	@XmlElement(name = "timeZone")
	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
}
