package com.class30;

public class Phone {
	String color;
	String model;
	String make;

	Phone() {
		System.out.println("1. From no arg const - Phone");
	}

	Phone(String phoneName) {
		this();
		System.out.println("2. From one arg const - Phone");
	}

	public void displayPhoneInfo() {
		System.out.println(color);
		System.out.println(model);
		System.out.println(make);
	}

}

class Iphone extends Phone {

	boolean iCloud;

	public void displayPhoneInfo() {
		super.displayPhoneInfo();
		System.out.println(iCloud);
	}

	public Iphone() {
		System.out.println("3. From no arg const - Iphone");
	}

	public Iphone(String name) {
		System.out.println("4. From one arg const - Iphone");
	}

	public void call() {
		super.displayPhoneInfo();
	}

}
