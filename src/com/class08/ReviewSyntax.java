package com.class08;

public class ReviewSyntax {
	public static void main(String args[]) {
		// LoginPage --> HomePage --> ProductListing --> ProductDetailPage --> CartPage
		// --> CheckoutPage ->Review->Confirmation

		String targetPage = "CartPage";

		switch (targetPage) {

		case "CartPage":
			System.out.print("Before Opening CartPage page");

		
		case "LoginPage":
			System.out.print("Opening login page");

		case "HomePage":
			System.out.print("Opening HomePage");

		case "ProductListing":
			System.out.print("Opening ProductListing page");

		case "ProductDetailPage":
			System.out.print("Opening ProductDetailPage page");

		
		}

	}
}
