package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//CREATE TABLE MYUSER(
//USERNAME VARCHAR(20) NOT NULL PRIMARY KEY,
//PASSWORD VARCHAR(20),
//FIRST_NAME VARCHAR(20),
//LAST_NAME VARCHAR(20),
//EMAIL VARCHAR(20),
//ADDRESS VARCHAR(20) ,
//PHONE VARCHAR(20))

@Entity
public class MyUser {
	@Id
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String email;
	private String address;
	private String phone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public MyUser() {
		super();
	}
	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", first_name=" + first_name + ", last_name="
				+ last_name + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
	}
	
}
