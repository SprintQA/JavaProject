package com.class06;

// Get country from user and print langauge of their country
public class SwitchStatmentsLanguage {
	public static void main(String args[]) {
		String country = "UK";

		switch (country) {
		case "USA":
		case "UK":
		case "Canada":
			System.out.println("English");
			break;

		case "India":
			System.out.println("Hinid");
			break;

		case "Germeny":
			System.out.println("German");
			break;

		default:
			System.out.println("please enter valid country");
		}

	}
}
