package com.class35;

class Basket<G> {
	G item;

	public void setItem(G itemFromUser) {
		item = itemFromUser;
	}

	public G getItem() {
		return item;
	}
}

public class BasketTester {
	public static void main(String[] args) {
		Basket b1 = new Basket();

		Basket<String> b2 = new Basket<String>();

		b2.setItem("Banana");

		b1.setItem(10);

		System.out.println(b1.getItem());
	}
}
