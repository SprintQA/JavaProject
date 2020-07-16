package com.class28;

class BankAccount {
	private int balance;
	private int accountNumber;
	private String custName;
	private String custPhoneNumber;
	private int interestRate;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	// Getter -> Read access
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}

	// Setter --> Write access
	public void setPhoneNumber(String phoneNumberFromUser) {
		if (phoneNumberFromUser.length() > 12) {

		} else {
			custPhoneNumber = phoneNumberFromUser;
		}
	}

	private void addInterest() {
		balance = balance + (balance * interestRate);
	}

	public void setBalance(int balanceFromUser) {

		System.out.println("Customer " + custName + " setting balance " + balanceFromUser);

		if (balanceFromUser < 50000) {
			balance = balanceFromUser;
		} else {
			System.out.println("Invalid session.");
		}
	}

	// Setter
	public void setCustName(String custNameFromUser) {
		custName = custNameFromUser;
	}

	// Features
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void displayBalance() {
		System.out.println(balance);
	}

}
