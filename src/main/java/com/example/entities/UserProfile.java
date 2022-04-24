package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userprofile")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int UserID;
	String firstName,LastName;
	String Gender;
	String GroupID;
	String ContactPhoneNumber;
	String Emailid;
public UserProfile() {
		
	}
	public UserProfile(int userID, String firstName, String lastName, String gender, String groupID,
			String contactPhoneNumber, String emailid) {
		super();
		UserID = userID;
		this.firstName = firstName;
		LastName = lastName;
		Gender = gender;
		GroupID = groupID;
		ContactPhoneNumber = contactPhoneNumber;
		Emailid = emailid;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getGroupID() {
		return GroupID;
	}
	public void setGroupID(String groupID) {
		GroupID = groupID;
	}
	public String getContactPhoneNumber() {
		return ContactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		ContactPhoneNumber = contactPhoneNumber;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	@Override
	public String toString() {
		return "UserProfile [UserID=" + UserID + ", firstName=" + firstName + ", LastName=" + LastName + ", Gender="
				+ Gender + ", GroupID=" + GroupID + ", ContactPhoneNumber=" + ContactPhoneNumber + ", Emailid="
				+ Emailid + "]";
	}
}