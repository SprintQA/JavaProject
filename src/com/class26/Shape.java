package com.class26;

class Shape {
	public void displayShape() {
		System.out.println("1.Displaying shape");
	}
}

class Circle extends Shape {
	@Override
	public void displayShape() {
		System.out.println("2.Displaying circle");
	}
}

class Squre extends Shape {
	@Override
	public void displayShape() {
		System.out.println("3.Displaying Squre");
	}
}
