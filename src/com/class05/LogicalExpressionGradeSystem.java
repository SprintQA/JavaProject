package com.class05;

// Get marks from student and display grade

// 90 - 100 --> A+
// 80 - 89 ---> A
// 70 - 79 ---> B
// 60 - 69 ---> C
// 50 - 59 -->  D
/// Below 50 --> Fail

public class LogicalExpressionGradeSystem {
	public static void main(String args[]) {
		int marks = 47;

		if (marks < 0 || marks > 100) {
			System.out.println("Invalid input");
		} else if (marks >= 90) {
			System.out.println("A+");
		} else if (marks >= 80) {
			System.out.println("A");
		} else if (marks >= 70) {
			System.out.println("B");
		} else if (marks >= 60) {
			System.out.println("C");
		} else if (marks >= 50) {
			System.out.println("D");
		} else {
			System.out.println("Fail");
		}
	}
}
