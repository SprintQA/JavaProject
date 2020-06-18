package com.class07;

public class PostFixPrefixExample {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x; // preincrement = first increment --> then assign
		
		System.out.println("Value of y is " + y); //
		System.out.println("Value of x is " + x); //
		
		int z = 10;
		int q = z++; // postincrement= first assign --> then increment
		
		System.out.println("Value of d is " + q); // 
		System.out.println("Value of c is " + z); // 

	}

}
