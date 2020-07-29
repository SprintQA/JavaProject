package com.class36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookExample {
	public static void main(String[] args) {

		List<String> booksByStephen = new ArrayList<String>();
		booksByStephen.add("7 habits of highly effective people");
		booksByStephen.add("First things first");
		booksByStephen.add("Smart Truest");

		List<String> booksByPeter = new ArrayList<String>();
		booksByPeter.add("Obama-The Call of History");
		booksByPeter.add("Economy Policy");

		List<String> booksByMObama = new ArrayList<String>();
		booksByMObama.add("Becoming Michelle Obama");
		booksByMObama.add("Americal Grown");

		List<String> booksByRowling = new ArrayList<String>();
		booksByRowling.add("harry Potter");

		Map<String, List<String>> books = new HashMap<String, List<String>>();

		books.put("Peter Bake", booksByPeter);
		books.put("Stephen Covey", booksByStephen);
		books.put("M.Obama", booksByMObama);
		books.put("J.K.Rowling", booksByRowling);

		String key = new Scanner(System.in).nextLine();

		System.out.println("List of books by " + key + " = " + books.get(key).get(0));

	}
}
