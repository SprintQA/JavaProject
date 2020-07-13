package com.class25;

class Vehical1 {
	Vehical1() {
		System.out.println("From Vehical");
	}
}

class Car1 extends Vehical1 {

	public Car1() {
		System.out.println("From Car");
	}

}

class SportCar extends Car1 {
	public SportCar() {
		System.out.println("From Sprt Car");
	}

}
