package com.class21;

public class PhoneTester {
	public static void main(String args[]) {
		// Class is user defined data type and object is variable of class type
//		Phone iPhone10; // Declare reference of Phone
//		iPhone10 = new Phone(); // Initializing object / Giving memory to the object


		
		Phone iPhone10 = new Phone();
		Phone iPhone8 = new Phone(); // Declaring as well as initializing object

		iPhone10.color = "Black";
		iPhone10.os = "iOS";
		iPhone10.sizeOfRAM = 4;

		iPhone8.color = "White";
//		iPhone8.displayConfig();
		
		System.out.println(iPhone10.color);
		System.out.println(iPhone8.color);
		
		
		

	}
}
