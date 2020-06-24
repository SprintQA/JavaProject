package com.class09;

// Calculate 1/2 + 2/3 + 3/4 +..+ 10/11

public class CalculateResultOfSeries2 {
	public static void main(String[] args) {
		double sum = 0;

		for (double i = 1; i <= 10; i++) {
			sum = sum + i / (i + 1);
		}

		System.out.print(sum);
	}
}
