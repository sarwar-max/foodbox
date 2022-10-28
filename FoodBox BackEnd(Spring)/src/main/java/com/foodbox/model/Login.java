package com.foodbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Login {
@Id
private String emailid;
private String password;
@Column(name="typeofuser")
private String typeOfUser;
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeOfUser() {
	return typeOfUser;
}
public void setTypeOfUser(String typeOfUser) {
	this.typeOfUser = typeOfUser;
}
@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + ", typeOfUser=" + typeOfUser + "]";
}
public Login(String emailid, String password, String typeOfUser) {
	super();
	this.emailid = emailid;
	this.password = password;
	this.typeOfUser = typeOfUser;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}


}