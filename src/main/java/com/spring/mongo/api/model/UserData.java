package com.spring.mongo.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "UserData")
public class UserData {

	@Id
	@NotNull
	private int id;
	@NotNull(message="Enter firstName")
	private String firstName;
	@NotNull(message="Enter lastName")
	private String lastName;
	@NotNull(message="Enter phoneNumber")
	private double phoneNumber;
	@NotNull(message="enter emailId")
	@javax.validation.constraints.Email(message="enter valid emailId")
	private String emailId;
	@NotNull(message="enter the address")
	private String address;
	@NotNull(message="enter city")
	private String city;
	@NotNull(message="enter the state")
	private String state;
	@NotNull(message = "enter the zipcode")
	@Positive
	private int zipCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "UserData [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", emailId=" + emailId + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}


}
