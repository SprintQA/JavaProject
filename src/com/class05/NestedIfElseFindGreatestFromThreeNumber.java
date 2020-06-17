package com.class05;

public class NestedIfElseFindGreatestFromThreeNumber {
	public static void main(String args[]) {
		int num1 = 10, num2 = 17, num3 = 23;

		if (num1 > num2) { // if this condition is true what's your though?

			if (num1 > num3) {
				System.out.println(num1 + "is greatest");
			} else {
				System.out.println(num3 + " is greatest");
			}

		} else {
			if (num2 > num3) {
				System.out.println(num2 + "is greater");
			} else {
				System.out.println(num3 + "is greater");
			}
		}

	}
}
