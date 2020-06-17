package com.class05;

// Get username and password from the user and check if user is valid or invalid
// 1. If username is correct then print Welcome, Username!!
// 2. If username is not correct then say "user not found"
// 3. If password is correct then print "Login successful"
// 4. if password is not correct print "Login unsuccessful"

public class NestedIfElseLoginScenario {
	public static void main(String args[]) {
		String expectedUsername = "Chirag";
		String expectedPassword = "Test@123!";

		String inputUsername = "Chirag";
		String inputPassword = "Test@123";

		if (expectedUsername == inputUsername) {
			System.out.println("Welcome " + inputUsername);
			if (expectedPassword == inputPassword) {
				System.out.println("Login successful");
			} else {
				System.out.println("Login unsuccessful");
			}
		} else {
			System.out.println("user not found");
		}

	}
}
