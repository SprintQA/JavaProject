package com.class06;

public class SwitchSyntax {
	public static void main(String args[]) {

		int choice = 10;

		switch (choice) {

		case 1:
			System.out.println("1.one");
			break;

		case 2:
			System.out.println("2.two");
			break;

		case 3:
			System.out.println("3.three");
			break;

		case 4:
			System.out.println("4.four");
			System.out.println("5.end of case 4");
			break;
			
		default:
			System.out.println("6.Please provide valid input from 1 to 4");

		}

	}
}
