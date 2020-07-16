package com.class28;

public class WrapperClassExample {
	public static void main(String[] args) {

		// Primitive data type
		int i = 10;

		int j = 897;

		Integer j1 = j;

		String js = j1.toString(); // Convert int data to String
		
		j= Integer.parseInt(js); // String data to int
		
		
		System.out.println(js);

		// Object of Integer class
		Integer i1 = new Integer(i); // Boxing / Wrapping

		Integer i2 = i; // AutoBoxing / AutoWrapping

//		int j = i2.intValue(); // Unboxing / unwrapping

//		j = i2; // AutoUnboxing / Auto unwrapping

	}
}
