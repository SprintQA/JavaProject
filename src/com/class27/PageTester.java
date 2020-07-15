package com.class27;

class Page {
	public void openPage() {
		System.out.println("Opening page");
	}
}

class LoginPage extends Page {
	public void openPage() {
		System.out.println("Opening login page");
	}
}

class HomePage extends Page {
	public void openPage() {
		System.out.println("Opening home page");
	}
}

public class PageTester {
	public static void main(String[] args) {
		Page page = new LoginPage();
		page.openPage();
	}
}