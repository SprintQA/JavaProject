package com.class05;

// Get age and weight from user 

// 1. Person should be at least 18 years old 
// 2. Person weight should be more than 50

public class NestedIfElseExampleBloodDonation {
	public static void main(String args[]) {
		int age = 18, weight = 50;

		if (age >= 18) {

			if (weight >= 50) {
				System.out.println("1. You're eligible and you can donate blood");
			} else {
				System.out.println("2. You're eligible but you cannot donate blood due to your weight");
			}

		} else {
			System.out.println("3. Sorry! You're too young to donate blood");
		}

	}
}
