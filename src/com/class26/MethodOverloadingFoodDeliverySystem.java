package com.class26;

class FoodDeliverySystem {

	public void login(String username, String password) {

	}

	public void orderFood(String items) {
		System.out.println("Ordering...." + items);
	}

	public void orderFood(String items, String instruction) {
		System.out.println("Ordering...." + items + " with instruction " + instruction);
	}

	public void orderFood(String items, String instruction, String location) {
		System.out.println("Ordering...." + items + " with instruction " + instruction + "from location " + location);
	}

}
