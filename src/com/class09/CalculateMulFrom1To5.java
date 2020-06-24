package com.class09;

public class CalculateMulFrom1To5 {

	// Find result of 1 * 2 * 3 * 4 * 5

	// Find factorial of 5
	// 5 * 4 * 3 * 2 * 1

	public static void main(String[] args) {
		int result = 1;

		for (int i = 1; i <= 10; i++) {
			result = result * i;
		}

		System.out.println(result);
	}

}
