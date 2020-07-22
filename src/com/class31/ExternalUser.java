package com.class31;

public class ExternalUser {
	public static void main(String[] args) {
		HSBC hsbc = new HSBC("Chirag");
		CitiBank citi = new CitiBank("Chirag");
		
		JPMorgan jp = new JPMorgan();
		
		hsbc.login();
		hsbc.displayBalance(); // 1000
		hsbc.deposit(1000);
		hsbc.displayBalance(); // 2000
		
		citi.displayBalance(); // 0
		citi.deposit(5000);
		citi.displayBalance();
		
		Paypal paypalAcc = new Paypal();
		paypalAcc.makeTransaction(hsbc, 1000);
		paypalAcc.showBalance(hsbc); // 1000
		
		paypalAcc.makeTransaction(hsbc, 2000);
		paypalAcc.showBalance(hsbc);
		
		paypalAcc.makeTransaction(jp, 1000);
	}
}
