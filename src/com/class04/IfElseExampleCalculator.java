package com.class04;

import java.util.Scanner;

// Get two numbers and operation from user and print result as per operation
public class IfElseExampleCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter num1...");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter num2...");
		int num2 = sc.nextInt();

		System.out.println("Please enter operation:.....");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Sub");
		System.out.println("Press 3 for Mul");
		System.out.println("Press 4 for Division");

		int operation = sc.nextInt();

		if (operation == 1) {
			System.out.println(num1 + num2);
		} else if (operation == 2) {
			System.out.println(num1 - num2);
		} else if (operation == 3) {
			System.out.println(num1 * num2);
		} else if (operation == 4) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Please enter valid opertion(1-4)");
		}
		
		sc.close();

	}
}
