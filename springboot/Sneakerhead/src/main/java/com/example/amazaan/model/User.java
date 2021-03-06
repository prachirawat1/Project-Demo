package com.example.amazaan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
 private String firstName;
 private String lastName;
 private String email;
 private int mobileNumber;
 private String password;
 
 public User() {}
 
 
public User(String firstName, String lastName, String email, int mobileNumber, String password) {
	super();
	this.id=id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.mobileNumber = mobileNumber;
	this.password = password;
}
public int getId() {
	return id;
}
public void setID(int id) {
	this.id=id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
 
 
 
 
}
