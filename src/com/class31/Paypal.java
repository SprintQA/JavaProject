package com.class31;

class Paypal {
	public void makeTransaction(Bank bankOjb, int amount) {
		bankOjb.withdraw(amount);
	}
	
	public void showBalance(Bank b) {
		System.out.print("showing balance in paypal");
		b.displayBalance();
	}
	
}
