package com.class04;
// Write a program to accept day from user and print if we have class or not

// input - day (integer) 
// output - print if we have a class on give day or not

public class LadderIfElseExample {
	public static void main(String args[]) {
		int day = 0; // Assignment operator

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
			System.out.println("Enter valid input from 1 to 7 only");
		}

	}
}
