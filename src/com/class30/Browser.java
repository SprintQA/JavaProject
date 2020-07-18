package com.class30;

public abstract class Browser {
	String browserName;

	public void open() {
		System.out.println("Opening..." + browserName);
	}

	public void openTab(String url) {
		System.out.println("Opening...." + url + " In " + browserName);
	}

	public abstract void displayColor();
}

class Chrome extends Browser {
	
	public Chrome(String name) {
		browserName = name;
	}

	@Override
	public void displayColor() {
		System.out.println("MultiColor");
	}

}

class Safari extends Browser {

	@Override
	public void displayColor() {
		System.out.println("Blue-White");
	}

}