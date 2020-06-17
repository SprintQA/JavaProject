package com.class05;

public class LogicalOperatorGreatestNumber {
	public static void main(String args[]) {
		int num1 = 100, num2 = 150, num3 = 900;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is bigger");
		}

		else if (num2 > num3) {
			System.out.println(num2 + " is bigger");
		}

		else {
			System.out.println(num3 + " is bigger");
		}

	}
}
