package com.class26;

public class MethodOverloading {

	public static void main(String[] args) {
		printLine(50, '*');
	}

	public static void printLine() {
		System.out.println("========================");
	}

	public static void printLine(int length) {
		int i = 0;

		while (i <= length) {
			System.out.println("=");
			i++;
		}
	}

	public static void printLine(int length, char c) {
		int i = 0;

		while (i <= length) {
			System.out.print(c);
			i++;
		}
	}

}
