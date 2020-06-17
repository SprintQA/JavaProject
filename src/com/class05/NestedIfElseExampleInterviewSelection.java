package com.class05;

// We will select all candidate with diploma course with percentage more than 75
// 1. If person has not completed graduation then print "please study and apply after that"
// 2. if person did diploma but haven't got % more than 75 then write "We're sorry! you are not sortlisted"
// 3. If person did diploma and got more than 75 then write "Congo! you're sortlisted"

public class NestedIfElseExampleInterviewSelection {
	public static void main(String args[]) {
		boolean isDiplomaDone = false;
		int score = 75;

		if (isDiplomaDone == true) {

			if (score >= 75) {
				System.out.println("Cong! you're selected");
			} else {
				System.out.println("Sorry! you're not selected! you have to work hard");
			}

		} else {
			System.out.println("Please complete your diploma and then apply");
		}

	}
}
