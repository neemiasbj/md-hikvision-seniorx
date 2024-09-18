package br.com.hikvision.minmoe.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("UserInfo")
	private UserInfo userInfo;

	// Getters and Setters

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public static class UserInfo {

		@JsonProperty("employeeNo")
		private String employeeNo;

		@JsonProperty("name")
		private String name;

		@JsonProperty("userType")
		private String userType;

		@JsonProperty("Valid")
		private Valid valid;

		@JsonProperty("doorRight")
		private String doorRight;

		@JsonProperty("RightPlan")
		private List<RightPlan> rightPlan;

		// Getters and Setters
		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public Valid getValid() {
			return valid;
		}

		public void setValid(Valid valid) {
			this.valid = valid;
		}

		public String getDoorRight() {
			return doorRight;
		}

		public void setDoorRight(String doorRight) {
			this.doorRight = doorRight;
		}

		public List<RightPlan> getRightPlan() {
			return rightPlan;
		}

		public void setRightPlan(List<RightPlan> rightPlan) {
			this.rightPlan = rightPlan;
		}
	}

	public static class Valid {

		@JsonProperty("enable")
		private boolean enable;

		@JsonProperty("beginTime")
		private String beginTime;

		@JsonProperty("endTime")
		private String endTime;

		// Getters and Setters
		public boolean isEnable() {
			return enable;
		}

		public void setEnable(boolean enable) {
			this.enable = enable;
		}

		public String getBeginTime() {
			return beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
	}

	public static class RightPlan {

		@JsonProperty("doorNo")
		private int doorNo;

		@JsonProperty("planTemplateNo")
		private String planTemplateNo;

		// Getters and Setters
		public int getDoorNo() {
			return doorNo;
		}

		public void setDoorNo(int doorNo) {
			this.doorNo = doorNo;
		}

		public String getPlanTemplateNo() {
			return planTemplateNo;
		}

		public void setPlanTemplateNo(String planTemplateNo) {
			this.planTemplateNo = planTemplateNo;
		}
	}
}
