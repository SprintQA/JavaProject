package com.class21;

class Phone {
	String color;
	String brand;
	String os;
	int sizeOfRAM;
	String model;

	void call(String phoneNumber) {
		System.out.println("Calling to " + phoneNumber);
	}

	void text(String phoneNumber, String message) {

	}

	void displayConfig() {
		System.out.println(color);
		System.out.println(brand);
		System.out.println(os);
		System.out.println(sizeOfRAM);
		System.out.println(model);
	}
}
