package com.class05;

// Take day of week from user and print if it's weekend or weekday 
public class LogicalOperatorWeekendChecker {
	public static void main(String args[]) {
		int day = -1;

		if (day <= 5 && day >= 1) {
			System.out.print("Weekday");
		}

		else if (day == 6 || day == 7) {
			System.out.println("It's weekends");
		}

		else {
			System.out.println("Invalid input");
		}

	}
}
