package com.class25;

public class BasicCalculator {
	int a; // object
	
	static int b; // instance

	public void sum(int num1, int num2) { 
		System.out.println("Sum :" + (num1 + num2));
	}

	public void sub(int num1, int num2) {
		System.out.println("Sub : " + (num1 - num2));
	}

}

class AdvanceCalculator extends BasicCalculator {

	public void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}

}
