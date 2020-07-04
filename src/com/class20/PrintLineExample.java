package com.class20;

public class PrintLineExample {
	public static void main(String args[]) {
		System.out.println("Start of the program.......");
		printLine(100, '#');
		System.out.println("End of the program.......");
		printLine(100);
	}

	// No Input(parameter), No return type
	static void printLine() {
		System.out.print("================================");
	}

	// Input(parameter), No return type
	static void printLine(int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print("=");
		}

		System.out.println();
	}

	// Input(parameter), No return type
	static void printLine(int length, char c) {
		for (int i = 1; i <= length; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
