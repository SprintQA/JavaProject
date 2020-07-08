package com.class21;

public class PersonTester {
	public static void main(String args[]) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();

		p1.name = "Chirag";
		p1.age = 26;
		p1.height = 5.5;

		p2.name = "Urve";
		p2.age = 44;
		p2.height = 6.2;
		
		p4.name = "Vildan";
		p4.age = 43;

//		p1.sleep();
//		p2.eat();
		p3.run();
		
		p4.sleep();

	}
}
