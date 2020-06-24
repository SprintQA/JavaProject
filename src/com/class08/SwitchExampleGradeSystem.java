package com.class08;

// Get marks from user and display appropriate grade

public class SwitchExampleGradeSystem {
	public static void main(String args[]) {
		int marks = 100;
		// Using Switch statement
		// 90 - 99 --> A
		// 80 - 89 --> B
		// 70 - 79 --> C
		// 60 - 69 --> D
		// 50 - 59 --> E
		// Below 50 --> Fail

		int choice = marks / 10;


		switch (choice) {
		
		case 10:
			System.out.println("Invalid input");

		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("d");
			break;
		case 5:
			System.out.println("E");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Fail");
			break;

		default:
			System.out.println("Invalid input");
		}

	}
}
