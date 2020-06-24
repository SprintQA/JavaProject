package com.class10;

public class FibonacciSeries {
	public static void main(String args[]) {
		int limit = 20, sum=0;
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		
		sum = num1 + num2;
		
		while(sum<limit) {
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		
		
	}
}
