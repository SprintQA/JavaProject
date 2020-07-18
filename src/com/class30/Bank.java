package com.class30;

public abstract class Bank { // Abstract class
	int balance;
	String branch;

	Bank() {
		System.out.println("From Bank class const");
	}

	Bank(int balance) {
		this.balance = balance;
	}

	abstract void displayInterestRate(); // Abstract method

	abstract void updatePersonalDetails();

	public void deposit(int amount) { // Concreat / non abstract
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

class HSBC extends Bank {

	@Override
	void displayInterestRate() {
		System.out.println("4.0%");
	}

	@Override
	void updatePersonalDetails() {

	}

}

class Bofa extends Bank {
	public void displayInterestRate() {
		System.out.println("6.0%");
	}

	@Override
	void updatePersonalDetails() {

	}
}
