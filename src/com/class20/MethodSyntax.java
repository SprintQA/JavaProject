package com.class20;

public class MethodSyntax {

	// Method Defination
	static int sum(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}

	public static void main(String args[]) {
		int result;

		result = sum(10, 20);

		System.out.println(result);
	}
}
