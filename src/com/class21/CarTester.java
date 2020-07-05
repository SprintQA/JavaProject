package com.class21;

public class CarTester {
	public static void main(String args[]) {
		Car audiA4 = new Car();
		Car bmwC3 = new Car();
		Car toyotaY3 = new Car();

		audiA4.maxSpeed = 200;
		audiA4.color = "White";
		audiA4.make = "Audi";
		audiA4.price = 300000;
		audiA4.model = "A3";

		bmwC3.drive();
		audiA4.drive();

	}
}
