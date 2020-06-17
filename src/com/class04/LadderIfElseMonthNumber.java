package com.class04;

// Write a program to take number from user and print month name
// input - 4 
// output - April

public class LadderIfElseMonthNumber {
	public static void main(String s[]) {
		int num1 = 101, num2 = 101;

		if (num1 > num2) {
			System.out.println(num1 + " is greater");
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater");
		} else {
			System.out.println("Both are equal");
		}
	}
}
