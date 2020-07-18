package com.class30;

abstract class Vehical {
	int maxSpeed;
	int numberOfWheels;
	String make;
	String year;

	public void drive() {
		
	}

	public void pressBreak() {

	}
}

class Car extends Vehical {
	public void drive() {
		System.out.println("Driving car");
	}

	public void pressBreak() {
		System.out.println("Pressing car break");
	}

}