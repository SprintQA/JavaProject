package com.class20;

// Generate number till user defined limit
// input - 10
// output - 1 2 3 4 5 6 7 8 9 10

public class PrintNumbers {

	public static void main(String args[]) {
		int limit = 10;
		generateNumbers(limit);
	}

	static void generateNumbers(int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.print(i + " ");
		}
	}

}
