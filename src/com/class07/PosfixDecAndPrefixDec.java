package com.class07;

public class PosfixDecAndPrefixDec {
	public static void main(String args[]) {
		int h = 100;
		int g = --h;// first decrement --> then assign
		
		System.out.println("Value of h is " + h);
		System.out.println("Value of g is " + g);

		int f = 100;
		int e = f--; // first assign -> then decrement
		
		System.out.println("Value of e is " + e);
		System.out.println("Value of f is " + f);
	}
}
