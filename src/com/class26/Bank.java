package com.class26;

class Bank {
	int balance;

	public void openAccount() {
		System.out.println("Opening account in bank");
	}

	public void displayInterestRate() {
		System.out.println("4.0");
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

}

class HSBC extends Bank {
	public void openAccount() {
		System.out.println("Opening account in HSBC bank");
	}

	public void displayInterestRate() {
		System.out.println("3.5");
	}
}

class BankOfAmerica extends Bank {
	public void openAccount() {
		System.out.println("Opening account in Bank of America");
	}

	public void displayInterestRate() {
		System.out.println("6.0");
	}
}
