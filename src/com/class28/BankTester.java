package com.class28;

public class BankTester {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();

		acc1.balance = 4000000;

		acc1.setBalance(4000000);
		
		acc1.getInterestRate();
		
	}
}
