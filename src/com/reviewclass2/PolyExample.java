package com.reviewclass2;

class Parent {
	public void makeTea() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public void makeTea() {
		System.out.println("Child");
	}
}

public class PolyExample {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();

		Parent p1 = new Child();
//		Child c1 = new Parent();

		c.makeTea();
		p.makeTea();
		p1.makeTea();
//		c1.makeTea();
	}

}
