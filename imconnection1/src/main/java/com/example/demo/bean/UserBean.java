package com.example.demo.bean;

public class UserBean {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String userName;
	private String password;
	private String phoneNumber;
	private String userInfo;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", userInfo=" + userInfo + "]";
	}



	
	
}
