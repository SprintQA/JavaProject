package com.class09;

public class ForLoopPrintZigZag {

	// Print 10 1 9 2 8 3 7 4 6 5
	public static void main(String[] args) {

		for (int i = 10, j = 1; i >= 6; i--, j++) {
			System.out.print(i + " " + j + " ");
		}

		int j = 1;
		int k = 0;

		for (int i = 10; i >= 6; i--) {

			System.out.print(i + " ");

			System.out.print(j + " ");

		}
	}

}
