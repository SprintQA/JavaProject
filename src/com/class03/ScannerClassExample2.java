package com.class03;

// Write a program to take two numbers from user and print maximum number
// Ex. 14 16 

import java.util.Scanner;

public class ScannerClassExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " is Bigger");
		}else {
			System.out.println(num2 +  " is Bigger");
		}
		
	}
}
