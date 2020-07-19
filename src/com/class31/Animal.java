package com.class31;

interface Animal {

	void eat();

	void makeNoise();

	void walk();

}

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

class HSBC implements Bank {

	public void faceDetectionLogin() {

	}

	@Override
	public void login() {

	}

	@Override
	public void deposit(int amount) {

	}

	@Override
	public void withdraw(int amount) {

	}

	@Override
	public void displayBalance() {

	}

	@Override
	public void updatePersonDetails() {

	}

	@Override
	public void changePassword() {

	}

}
