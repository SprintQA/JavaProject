package com.class30;

import java.util.Scanner;

public class ShoppingAppTester {
	public static void main(String[] args) {
//		AmazonApp ap = new AmazonApp("Amazon");
//		EbayApp ea = new EbayApp("Ebay");
//		ap.download();
//		ap.displaySize();
//		ea.download();
//		ea.displaySize();

		System.out.println("Please enter app to download...");
		String userInput = new Scanner(System.in).nextLine();

		ShoppingApps ap = null;

		if (userInput.equals("Amazon")) {
			ap = new AmazonApp(userInput);
		} else if (userInput.equals("Ebay")) {
			ap = new EbayApp(userInput);
		} else {
			System.out.println("Enter valid app name");
		}

		ap.download();
		ap.install();
		ap.open();
		ap.uninstall();
		ap.displaySize();

	}
}
