package com.class31;

abstract class A {

	A() {
		System.out.println("From parent class");
	}
	
	public void method1() {
		
	}

}

class B extends A {
	B() {
		System.out.println("From child const");
	}

	B(String name) {

	}
}

public class SuperRevise {

}
