package com.example.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="usercredentials")
public class UserCredentials {
	String UserType;
	@Id
	int UserID;
	String password;
	String LoginStatus;
	public UserCredentials() {
		
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginStatus() {
		return LoginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		LoginStatus = loginStatus;
	}
	public UserCredentials(String userType, int userID, String password, String loginStatus) {
		super();
		UserType = userType;
		UserID = userID;
		this.password = password;
		LoginStatus = loginStatus;
	}
	@Override
	public String toString() {
		return "UserCredentials [UserType=" + UserType + ", UserID=" + UserID + ", password=" + password
				+ ", LoginStatus=" + LoginStatus + "]";
	}
	
	
}