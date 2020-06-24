package com.class09;

// Print 1 to 10 using do while loop
public class DoWhileExample {
	public static void main(String args[]) {
		int i = 1;

		do { // execute block first
		
			System.out.println(i); // Output - 1
			i++;
		
		} while (i > 10); // After executing block check the condition
		
		
		while (i > 10) {
			System.out.println(i);
			i++;
		}
		

	}
}
