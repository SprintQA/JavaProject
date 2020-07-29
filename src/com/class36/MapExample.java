package com.class36;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {

		Map<String, Integer> studentMarks = new TreeMap<String, Integer>();
		Map<String, Integer> batch2Marks = new TreeMap<String, Integer>();

		studentMarks.put("Chirag", 45);
		studentMarks.put("Mikail", 57);
		studentMarks.put("Mustafa", 90);
		studentMarks.put("Guljahan", 100);
		studentMarks.put("Vildan", 45);
		studentMarks.put("Chirag", 60);
		studentMarks.put("Guljahan", 80);

		// Retrive all keys
		Set<String> allKeys = studentMarks.keySet();

		for (String key : allKeys) {
			System.out.println(key + "  =  " + studentMarks.get(key));
		}

		// Check hashmap is empty or not
		System.out.println(studentMarks.isEmpty());

		// Compare hashmap with other hashmap
		System.out.println(studentMarks.equals(batch2Marks));
		
		//how many pairs we stored
		System.out.println(studentMarks.size());
		

	}
}
