package com.class23;

public class Car {
	int maxSpeed; // Object/ Instance variable
	String color;
	static int count; // Class / static variable

	Car() {
		count++;
	}

	void pressBreak() { // Instance method
		System.out.println("Pressing break");
	}

	void drive() {// Instance method
		System.out.println(color + " " + maxSpeed + " driving");
	}

	void displayCarInfo() {// Instance method
		drive();
		System.out.println(maxSpeed);
		System.out.println(color);
	}

	static void displayNumberOfCars() {// Class method
		System.out.println(count);
	}
}
