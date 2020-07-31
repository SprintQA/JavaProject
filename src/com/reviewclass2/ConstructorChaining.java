package com.reviewclass2;

class Vehical {
	public Vehical() {
		System.out.println("1. From vehical class");
	}
}

class Car extends Vehical{
	Car() {
		System.out.println("2. From Car class");
	}
}

class SportsCar extends Car{
	public SportsCar() {
		System.out.println("3. From Sports car");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
	}
}
