package com.class31;

public class BrowserTester {
	public static void main(String[] args) {
		Browser c = new Chrome();

		c.openPrivateBrowsing();

		c.clearCookie();

	}
}
