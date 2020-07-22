package com.class31;

public class AnimalTester {
	public static void main(String[] args) {
		Animal aninmal = new Dog();

		aninmal.eat();
		aninmal.makeNoise();
		aninmal.walk();

		aninmal = new Cat();

		aninmal.eat();
		aninmal.makeNoise();
		aninmal.walk();
	}
}
