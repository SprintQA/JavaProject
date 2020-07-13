package com.class25;

class A {
	public void methodA() {
		System.out.println("From class A");
	}
}

class B extends A{
	public void methodB() {
		System.out.println("From class B");
	}
}

class C extends B{
	public void methodC() {
		System.out.println("From class C");
	}
}
