package com.class22;

public class Person {

	String name; // null --> Chirag
	int age; // 0 ---> 30
	double height; // 0.0 --->5.5

	// Explicit Construtor added by user to initialize class
	// variables
	 Person() {
		name = "Chirag";
		age = 30;
		height = 5.5;
	}
	
	// parameterized constructor
	Person(String nameFromUser, int ageFromUser, double heightFromUser) {
		name = nameFromUser;
		age = ageFromUser;
		height = heightFromUser;
	}

	void sleep() {
		System.out.println(name + " is Sleeping");
	}

	void eat() {
		System.out.println(name + " is Eating");
	}

	void run() {
		System.out.print(name + " is Running");
	}

	void displayAge() {
		System.out.print("Age of " + name + " is " + age);
	}

}
