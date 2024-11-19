package br.com.hikvision.minmoe.models;

import java.util.List;

public class AccessCustomPrompts {

	private boolean enabled;
	private List<Prompt> promptList;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<Prompt> getPromptList() {
		return promptList;
	}

	public void setPromptList(List<Prompt> promptList) {
		this.promptList = promptList;
	}

	public static class Prompt {
		private String promptType;
		private String promptContent;

		public String getPromptType() {
			return promptType;
		}

		public void setPromptType(String promptType) {
			this.promptType = promptType;
		}

		public String getPromptContent() {
			return promptContent;
		}

		public void setPromptContent(String promptContent) {
			this.promptContent = promptContent;
		}
	}
}
