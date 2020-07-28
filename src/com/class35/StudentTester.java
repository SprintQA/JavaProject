package com.class35;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int age;
	String phoneNumber;

	public Student(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
}

public class StudentTester {
	public static void main(String[] args) {

		Set<Student> studentsData = new HashSet<Student>();

		Student ahmet = new Student("Ahmet", 23, "1234567890");
		Student vildan = new Student("Vildan", 34, "0987654321");
		Student urve = new Student("Urve", 43, "987656788");

		studentsData.add(ahmet);
		studentsData.add(vildan);
		studentsData.add(urve);

		printStudentData(studentsData);
	}

	public static void printStudentData(Set<Student> listOfStudents) {
		for (Student s1 : listOfStudents) {
			System.out.println(s1.name);
			System.out.println(s1.age);
			System.out.println(s1.phoneNumber);
			System.out.println("==================");
		}
	}

}
