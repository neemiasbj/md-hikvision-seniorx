package br.com.hikvision.minmoe.models;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RemoteControlDoor")
public class RemoteControlDoor {

	private String version;
	private String cmd;

	public RemoteControlDoor() {
	}

	public RemoteControlDoor(String version, String cmd) {
		this.version = version;
		this.cmd = cmd;
	}

	@XmlElement(name = "version")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlElement(name = "cmd")
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
}
