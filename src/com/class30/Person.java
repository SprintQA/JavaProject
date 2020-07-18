package com.class30;

public class Person {
	String name; // Instance variable
	int age;
	String gender;

	Person() {
		this("Chirag");
		System.out.println("1. from zero arg constructor");
	}

	Person(String name, int age, String gender) {
		this();
		System.out.println("2. from three arg constructor");
	}

	Person(String name) {
		System.out.println("3. from one arg constructor");
	}

	public void walk() {
		System.out.println("2.Person is walking");
	}

	public void displayPersonInfo() {
//		String name = "Chirag"; // Local
		System.out.println(this.name);
	}
}
