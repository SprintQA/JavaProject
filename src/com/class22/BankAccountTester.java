package com.class22;

import com.class21.BankAccount;

public class BankAccountTester {
	public static void main(String args[]) {
		BankAccount acc1 = new BankAccount("Chirag", "Saving");
		acc1.displayBalance();
		acc1.deposit(1000);
		acc1.displayBalance();
	}
}
