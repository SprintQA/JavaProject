package com.class31;

public interface Animal {
	void makeNoise();

	void walk();

	void eat();
}

class Dog implements Animal{

	@Override
	public void makeNoise() {
		System.out.println("Dog is barking.....");
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking.....");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating.....");
	}

}

class Cat implements Animal{

	@Override
	public void makeNoise() {
		System.out.println("Cat is making noise meawwww...meawww");
	}

	@Override
	public void walk() {
		System.out.println("Cat is walking.....");
	}

	@Override
	public void eat() {
		System.out.println("Cat only eat with drinks....");
	}
}

