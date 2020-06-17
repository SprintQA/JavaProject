/**
 * 
 */
package com.class04;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class DigitReverser
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int number, first, second, third, reverse;

		// Step 2 - Initialize known values
		number = 687;

		// Step 3 - Get values for the unknown
		first = number / 100;  // division by 100 on any 3-digt number gives its first digit
		// 6
		number = number % 100; // modulus by 100 on any 3-digt number gives its last two digits
		// 87
		second = number / 10;  // division by 10 on any 2-digt number gives its first digit
		// 8
		third = number % 10;   // modulus by 10 on any 2-digt number gives its last digit
		// 7

		// Step 4 – Implement your code logic
		reverse = third * 100 + second * 10 + first; // compute reversal
		// = 700 + 80 + 6 = 786

		// Step 5 – Output the program
		System.out.println ("Reverse: " + reverse);
	}

}
