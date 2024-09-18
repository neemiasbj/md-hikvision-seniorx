package br.com.hikvision.minmoe.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class DeleteUsers {

	@JsonProperty("UserInfoDelCond")
	private UserInfoDelCondDetails userInfoDelCond;

	public DeleteUsers() {
	}

	public DeleteUsers(UserInfoDelCondDetails userInfoDelCond) {
		this.userInfoDelCond = userInfoDelCond;
	}

	public UserInfoDelCondDetails getUserInfoDelCond() {
		return userInfoDelCond;
	}

	public void setUserInfoDelCond(UserInfoDelCondDetails userInfoDelCond) {
		this.userInfoDelCond = userInfoDelCond;
	}

	public static class UserInfoDelCondDetails {

		@JsonProperty("EmployeeNoList")
		private List<EmployeeNo> employeeNoList;

		public UserInfoDelCondDetails(List<EmployeeNo> employeeNoList) {
			this.employeeNoList = employeeNoList;
		}

		public List<EmployeeNo> getEmployeeNoList() {
			return employeeNoList;
		}

		public void setEmployeeNoList(List<EmployeeNo> employeeNoList) {
			this.employeeNoList = employeeNoList;
		}

	}

	public static class EmployeeNo {

		@JsonProperty("employeeNo")
		private String employeeNo;

		public EmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

	}
}
