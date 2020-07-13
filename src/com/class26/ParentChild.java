package com.class26;

class Parent {

	public void displayYourName() {
		System.out.println("Parent");
	}

	public void doWork() {
		System.out.println("Coding...");
	}

}

class Child extends Parent {

	public void play() {
		System.out.println("Child is playing");
	}

	public void displayYourName() {
		System.out.println("Child");
	}


}
