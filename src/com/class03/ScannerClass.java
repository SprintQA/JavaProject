package com.class03;


import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[]) {
		Scanner inputSource = new Scanner(System.in);

		System.out.println("Enter a number ");

		int num = inputSource.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}
