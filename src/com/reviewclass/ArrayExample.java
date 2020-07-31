package com.reviewclass;

public class ArrayExample {
	public static void main(String[] args) {
		int num[] = { 13, 54, 67, 45, 68, 78, 100, 98 }; // Declaration of Array

		int table[][] = { { 30, 40, 70 }, { 50, 30 } };

//		System.out.println(num.length);

//		System.out.println(table.length);

//		System.out.println(table[0][0]);
//		System.out.println(table[0][1]);
//		System.out.println(table[0][2]);
//		System.out.println(table[1][0]);
//		System.out.println(table[1][1]);
//		System.out.println(table[1][2]);

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println(table[i][j]);
			}
		}

//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);

//		for (int i = 1; i <= num.length; i++) {
//
//		}

//		System.out.println(i);

	}
}
