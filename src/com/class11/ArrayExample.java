package com.class11;

public class ArrayExample {
	public static void main(String args[]) {

		int studentMarks[]; // Declaration of Array

		int listOfData[] = { 40, 50, 70, 35, 67, 12, 34 }; // Declaring and initializing array

		studentMarks = new int[5]; // Initialization Of Array

		studentMarks[0] = 40; // Storing the value inside first block of array

		System.out.println(studentMarks[0]); // Accessing array value

		System.out.println(studentMarks[4]); // Default value for all elements in array is 0

//		System.out.println(studentMarks[10]); // it'll give you error if you access block that doesn't exist
 
		System.out.println(studentMarks.length);
		
		System.out.println(listOfData.length); 

		for (int i = 0; i < listOfData.length; i++) { // Reading data from Array
			System.out.print(listOfData[i] + " ");
		}

	}
}
