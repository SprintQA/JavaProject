package com.class25;

class Person {
	static String name;
	int age;
	String gender;

	Person() {
		System.out.println("1.From person class constructor");
	}

	public void walk() {
		System.out.println("2.Person is walking");
	}
}

class Employee extends Person {
	int salary;
	String dept;

	public Employee() {
		System.out.println("3.From employee class constructor");
	}

	public void work() {
		System.out.println("4.Employee is working");
	}
}

class SSE extends Employee{

	SSE() {
		System.out.println("5. From SSE constructor");
	}

	String technology;

	public void code() {
		System.out.println("coding...");
	}
}
