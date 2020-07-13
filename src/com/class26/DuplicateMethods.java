package com.class26;

public class DuplicateMethods {

	public static void main(String args[]) {
		sum(10, 20);         
	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

}
