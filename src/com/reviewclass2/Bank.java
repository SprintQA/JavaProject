package com.reviewclass2;

public class Bank {
	int balance;
	String accNumber;
	String accName;
	String accType;
	final static String bankCode = "9777";
	static int numberOfAcc;

	private Bank() {
		balance = 1000;
		accNumber = "345678765";
		accName = "Davy";
		accType = "Checking";
	}
	
	Bank(String name, String accType){
		balance = 1000;
		accNumber = "345678765";
		accName = name;
		this.accType = accType;
		numberOfAcc = numberOfAcc + 1;
	}

	public static void printNumberOfAccount() {
		System.out.println("number of acc - "+numberOfAcc);
	}
	
	
	public void withdraw(int amount) {
		System.out.println("withdrawing " + amount + " from " + accName);
		balance = balance - amount;
	}

	public void displayBalance() {
		System.out.print("Welcome! " + accName);
		System.out.println("  Balance: "+balance);
	}

	public void deposit(int amount) {
		System.out.println("Depositing " + amount + " into " + accName);
		balance = balance + amount;
	}
	
	

}
