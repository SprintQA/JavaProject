package com.class09;

public class DisplayDigit {

	// Display each digit in console of given number
	// 89765
// 		5
// 		6
//	 	7 
//	 	9 
//	 	8

	// Exp - 3 2 5 7
	public static void main(String[] args) {
		int num = 7;
		while (num != 0) {
			int lastDigit = num % 10; // get last digit from number
			System.out.println(lastDigit); // Print last digit into console
			num = num / 10; // Remove last digit
		}

//		System.out.println(num / 10);   -->0
//		System.out.println(num % 10); --> 7

	}

}
