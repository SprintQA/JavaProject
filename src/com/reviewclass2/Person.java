package com.reviewclass2;

class Person {
	String name;
	int age;
	String dateOfBirth;
	String gender;

	 Person(String name, int age, String dateOBrith) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOBrith;
	}

	public void talk() {
		System.out.println(name + " is talking");
	}
}

class Employee extends Person {
	
	public Employee(String name, int age, String dateOBrith) {
		super(name, age, dateOBrith);
	}
	
	int salary;
	int employeeId;

	public void work() {
		System.out.println(name + " is working");
	}
}

class Student extends Person {
	int rollNumber;

	public void write() {
		System.out.println(name + " is writing");
	}
}
