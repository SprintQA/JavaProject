package com.class32;

public class ThrowKeyword {
	public static void main(String[] args) {
		System.out.println("Program starts");
		try {
			printDayFromNumber(12);
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("Program ends");
	}

	public static void printDayFromNumber(int day) {

		if (day == 1) { // Comparison operator
			System.out.println("it's monday and we don't have a class");
		} else if (day == 2) {
			System.out.println("it's tuesday and we have a class");
		} else if (day == 3) {
			System.out.println("it's wednesday and we have a class");
		} else if (day == 4) {
			System.out.println("it's Thursday and we have a class");
		} else if (day == 5) {
			System.out.println("it's Friday and we don't have a class");
		} else if (day == 6) {
			System.out.println("it's Saturday and we have a class");
		} else if (day == 7) {
			System.out.println("it's Sunday and we have a class");
		} else {
			throw new RuntimeException("Enter valid input from 1 to 7 only");
		}
	}
}
