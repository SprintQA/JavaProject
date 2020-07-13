package com.class24;

class Car {

	static int num1 = 10; // instance variable

	public static void printNumber() { // static method
		System.out.println(num1);
	}

}

class CarTester {

	public static void main(String args[]) {
		Car.printNumber();
	}
}