package com.class09;

public class SumOfDigit {

	// Display each digit in console of given number
	// 89765
// 		5
// 		6
//	 	7 
//	 	9 
//	 	8

	// Exp - 3 2 5 7
	public static void main(String[] args) {
		int num = 8977, sum = 0;
		while (num != 0) {
			int lastDigit = num % 10; // get last digit from number
			sum = sum + lastDigit; // Sum of all digits one by one
			num = num / 10; // Remove last digit
		}

		System.out.println(sum);
//		System.out.println(num / 10);   -->0
//		System.out.println(num % 10); --> 7

	}

}
