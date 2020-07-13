package com.class25;

class X {
	int x;

	// Initialize class variable
	X() {
		x = 20;
	}

	public void methodX() {
		System.out.println(x);
	}
}

class Y extends X {
	int y;

	Y() {
		y = 30;
	}

	public void methodY() {
		System.out.println(y);
	}
}
