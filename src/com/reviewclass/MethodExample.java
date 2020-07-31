package com.reviewclass;

public class MethodExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
//
//		int result = c.getSum(10, 20);
//
//		result = result * 10;
//
//		c.printMultiplication(10, 20);
//		
//		c.printLine();

		int num = 10;
		c.printValue(num);
		
		System.out.println(num);

//		num = c.changeValue(num);

//		System.out.println(num);
	}
}

class Calculator {

	void printValue(int num) {
		num = 20;
//		System.out.println(num);
	}

	public int changeValue(int num) {
		num = 20;
		return num;
	}

	int getSum(int a, int b) {
		return a + b;
	}

	void printMultiplication(int a, int b) {
		System.out.println(a * b);
	}

	void printLine() {
		System.out.println("=================");
	}
}
