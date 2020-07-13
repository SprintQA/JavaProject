package com.class26;

public class MethodOverloadingTesterClass {

	public static void main(String[] args) {

		FoodDeliverySystem fs = new FoodDeliverySystem();
		fs.orderFood("pizza", "Please don't add onion", "NY");

		BookStore bs = new BookStore();
		bs.getBook("Programming in java", "Guljahan");

	}

}
