package com.class10;

public class PrimeNumber {
	// Given number is prime or not
	public static void main(String[] args) {
		int num = 1;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("Not prime");
		}

	}

}
