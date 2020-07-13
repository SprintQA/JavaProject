package com.class21;

//
public class Car {
	int maxSpeed;
	String color;
	String make;
	String model;
	int price;
	
	void Car() {
		System.out.println("Test");
	}
	
	

	void pressBreak() {
		System.out.println("Pressing break");
	}

	void drive() {
		System.out.println(make + " " + model + " driving");
	}

	void displayCarInfo() {
		System.out.println(maxSpeed);
		System.out.println(color);
		System.out.println(make);
		System.out.println(model);
		System.out.println(price);
	}

}


