package com.class30;

public class BrowserTester {
	public static void main(String[] args) {
		Browser br = new Chrome("Chrome");

		br.open();
		br.openTab("google.com");
		br.displayColor();
		
		br = new Safari();
		
		br.open();
		br.openTab("Facebook.com");
		br.displayColor();
	}
}
