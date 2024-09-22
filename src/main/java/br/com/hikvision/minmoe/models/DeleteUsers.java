package br.com.hikvision.minmoe.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.hikvision.minmoe.models.DeleteUsers.EmployeeNo;

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

		public UserInfoDelCondDetails() {
			this.employeeNoList = new ArrayList<EmployeeNo>();
			;
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
