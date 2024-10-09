package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.hikvision.minmoe.enums.RemoteCheckCfgPassmode;
import br.com.hikvision.minmoe.enums.RemoteCheckCfgUserType;

public class RemoteCheckConfig {

	@JsonProperty("remoteCheckCfg")
	private RemoteCheckCfg remoteCheckCfg;

	public RemoteCheckCfg getRemoteCheckCfg() {
		return remoteCheckCfg;
	}

	public void setRemoteCheckCfg(RemoteCheckCfg remoteCheckCfg) {
		this.remoteCheckCfg = remoteCheckCfg;
	}

	public static class RemoteCheckCfg {

		@JsonProperty("userType")
		private String userType;

		@JsonProperty("passmode")
		private String passMode;

		@JsonProperty("time")
		private int time;

		public RemoteCheckCfg(RemoteCheckCfgUserType userType, RemoteCheckCfgPassmode passMode, int time) {
			this.userType = userType.getValue();
			this.passMode = passMode.getValue();
			this.time = time;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getPassMode() {
			return passMode;
		}

		public void setPassMode(String passMode) {
			this.passMode = passMode;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}
	}
}
