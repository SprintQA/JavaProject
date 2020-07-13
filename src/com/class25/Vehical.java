package com.class25;

class Vehical {

	String color;
	int year;
	int numOfWheels;

	public void start() {
		System.out.println("Starting...");
	}

	public void pressBreak() {
		System.out.println("Stopping");
	}

}

class Car extends Vehical {
	boolean isAutomatic;

	public void playMusic() {

	}

	public void openWindows() {

	}
}

class MotorCycle extends Car {
	boolean hasKick;

	public void kick() {
		System.out.println("kicking");
	}

}