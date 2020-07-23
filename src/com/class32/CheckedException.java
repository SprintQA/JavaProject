package com.class32;

public class CheckedException {
	public static void main(String[] args) {
		try {
			sum(10, 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void doSomeethingElse() throws Exception {
		doSomething();
	}

	public static void doSomething() throws InterruptedException {
		System.out.println("Program start");
		Thread.sleep(5000);
		System.out.println("Program ends");
	}

	public static void sum(int a, int b) throws Exception {
		System.out.println(a + b);
	}

}
