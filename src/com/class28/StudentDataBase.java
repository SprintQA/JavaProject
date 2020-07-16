package com.class28;

public class StudentDataBase {
	private String name;
	private String phoneNumber;
	private String dob;
	private int id;
	private String address;
	private String emailAddress;
	private static int counter;

	public StudentDataBase() {
		counter++;
		id = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void displayStudentInfo() {
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(dob);
		System.out.println(id);
	}

}
