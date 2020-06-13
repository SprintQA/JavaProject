package com.class03;

public class StringOperation {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = " Welcome";
		int num1 = 10;
		int num2 = 20;

//		Print  HelloWelcome
//		System.out.println(str1 + " " + str2);
		
//		Print Hello10
//		System.out.println(str1  + num1);
		
		
		//Print Hello1020
		System.out.println(str1  + num1 + num2);
		
		//Hello200
		System.out.println(str1  + num1 * num2);
		
		//30Hello
		System.out.println(num1 + num2 + str1);
		
		// Error
//		System.out.println(str1 + num1 - num2);
		
		// 1020Hello
		System.out.println(num1 + (num2 + str1));  
		
		System.out.println("Sum of num1 and num2 = "+ (num1 + num2));
		
		// Chirag is working in SprintQA Company
		String name = "Farrah";
		String company = "Facebook";
		
		
		System.out.println(name +" is working in " +company +  " Company");
		
		
		
		
	}

}
