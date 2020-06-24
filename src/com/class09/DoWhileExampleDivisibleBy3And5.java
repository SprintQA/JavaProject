package com.class09;

// Print number from 20 to 100 that are divisible by 3 and 5

// 

public class DoWhileExampleDivisibleBy3And5 {
	public static void main(String args[]) {
		int i = 20;

		do {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}
}
