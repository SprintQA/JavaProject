package com.class29;

class Ab {
	int i = 12;
}

class Cd extends Ab {
	int i = 10;
}

public class MethodOverloadingWrong {
	public static void main(String[] args) {
		Ab ab = new Cd();
		System.out.println(ab.i);
	}
}
