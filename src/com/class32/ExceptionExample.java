package com.class32;

import java.io.File;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		int i = 10;
		int a[] = new int[3];
		
		
		System.out.println("Program Start");

		int k = new Scanner(System.in).nextInt(); // Value 10
		System.out.println(i / k);
		a[2] = 10;

		System.out.println("I am king! you cannot ignore me");

		System.out.println("Program End");

	}
}
