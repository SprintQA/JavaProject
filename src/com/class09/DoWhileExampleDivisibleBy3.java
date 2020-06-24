package com.class09;

// Print number from 1 to 20 that are divisible by 3

// 3 6 9 12 15 18

public class DoWhileExampleDivisibleBy3 {
	public static void main(String args[]) {
		int i = 3;

		do {
			System.out.print(i + " ");
			i = i + 3;
		} while (i <= 20);
	}
}
