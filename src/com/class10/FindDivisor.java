package com.class10;

public class FindDivisor {

	// Find out divisor of current number
	// Example
	// Input - 6
	// output - 1,2,3,6
	public static void main(String[] args) {
		int num = 99;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
