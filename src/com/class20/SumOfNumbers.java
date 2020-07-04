package com.class20;

// Find sum of numbers till the limit given by user
// input 10 
// output 55
public class SumOfNumbers {
	
	public static void main(String args[]) {
		int limit = 10;
		int result = getSum(limit);
		System.out.println(result);
	}

	static int getSum(int limit) {
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
