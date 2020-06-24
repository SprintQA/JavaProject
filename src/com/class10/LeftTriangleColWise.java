package com.class10;

public class LeftTriangleColWise {
	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) { // Outer For loop

			for (int j = 1; j <= i; j++) { // Inner For Loop

				System.out.print(j + " ");

			}

			System.out.println();

		}

	}
}
