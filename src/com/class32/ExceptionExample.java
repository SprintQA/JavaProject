package com.class32;

public class ExceptionExample {
	public static void main(String[] args) {
		int i = 10;
		int a[] = new int[2];

		try {
			System.out.println("Inside Try");
			a[2] = 0;
		} catch (Exception saut) {
			System.out.println("Inside Catch");
		} finally {
			System.out.println("Inside Finally");
		}

	}
}
