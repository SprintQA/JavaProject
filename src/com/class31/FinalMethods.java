package com.class31;

abstract class Parent {
	abstract void method1();
}

class Child extends Parent {

	public void method1() {

	}

	public void method2() {
		System.out.println("From method2");
	}
}

public class FinalMethods {

}
