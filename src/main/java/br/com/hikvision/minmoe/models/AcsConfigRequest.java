package br.com.hikvision.minmoe.models;

public class AcsConfigRequest {

	private AcsCfg AcsCfg;

	public AcsCfg getAcsCfg() {
		return AcsCfg;
	}

	public void setAcsCfg(AcsCfg acsCfg) {
		AcsCfg = acsCfg;
	}

	public static class AcsCfg {
		private boolean remoteCheckDoorEnabled;
		private String checkChannelType;

		public boolean isRemoteCheckDoorEnabled() {
			return remoteCheckDoorEnabled;
		}

		public void setRemoteCheckDoorEnabled(boolean remoteCheckDoorEnabled) {
			this.remoteCheckDoorEnabled = remoteCheckDoorEnabled;
		}

		public String getCheckChannelType() {
			return checkChannelType;
		}

		public void setCheckChannelType(String checkChannelType) {
			this.checkChannelType = checkChannelType;
		}
	}
}
