package com.class31;

interface Bank {

	int balance = 1000;

	void login();

	void deposit(int amount);

	void withdraw(int amount);

	void displayBalance();

	void updatePersonDetails();

	void changePassword();

}

interface MyInterface {

}

interface PSUBank {

	void feature1();

	void feature2();

	void feature3();
}

class CitiBank implements PSUBank, Bank {
	
	String accName;
	int balance;
	
	public CitiBank(String name) {
		accName = name;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Override
	public void displayBalance() {
		System.out.println("==>"+balance);
	}

	@Override
	public void updatePersonDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void feature1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void feature2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void feature3() {
		// TODO Auto-generated method stub

	}

}

class JPMorgan implements Bank{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		
	}
	
}

class HSBC implements Bank {
	
	String accName;
	int balance;
	
	HSBC(String name){
		accName = name;
		balance = 1000;
	}

	public void faceDetectionLogin() {

	}

	@Override
	public void login() {
		System.out.println("Welcome to HSBC "+accName);
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Override
	public void displayBalance() {
		System.out.println("==>"+balance);
	}

	@Override
	public void updatePersonDetails() {

	}

	@Override
	public void changePassword() {

	}

}
