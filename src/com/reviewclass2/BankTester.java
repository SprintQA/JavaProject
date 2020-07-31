package com.reviewclass2;

public class BankTester {
	public static void main(String[] args) {
		
		Bank.printNumberOfAccount();
		
		Bank davysAcc = new Bank("Davy", "Checking");
		Bank fidanAcc = new Bank("Fidan", "Savings");

		davysAcc.displayBalance();
		fidanAcc.displayBalance();

		davysAcc.withdraw(1000);

		fidanAcc.displayBalance();
		davysAcc.displayBalance();
		

	}
}
