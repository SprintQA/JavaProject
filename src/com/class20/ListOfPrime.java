package com.class20;

// Write a program to print list of prime numbers from 1 to 100
public class ListOfPrime {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			if(isPrime(i)==true) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int number) {
		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}
}
