package com.class21;

public class BankAccount {

	 public double balance;
	String accType;
	int accNumber;
	String accName;

	public void withdraw(double amount) {
		System.out.println("Withdrawing from account " + accName + " " + amount);
		balance = balance - amount;
	}

	public void deposit(double amount) {
		System.out.println("Depositing to account " + accName + " " + amount);
		balance = balance + amount;
	}

	public void displayBalance() {
		System.out.println("Current Balance - " + balance);
	}

}
