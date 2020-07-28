package com.class35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> numbersBag = new HashSet<Integer>();

		System.out.println(numbersBag.add(10));
		System.out.println(numbersBag.add(45));
		System.out.println(numbersBag.add(78));
		System.out.println(numbersBag.add(96));
		System.out.println(numbersBag.add(49));
		System.out.println(numbersBag.add(67));
		System.out.println(numbersBag.add(78));

		for (int num : numbersBag) {
//			System.out.println(num);
		}

		System.out.println(numbersBag.size());

//		System.out.println(numbersBag.isEmpty());

//		System.out.println(numbersBag.contains(999));

	}
}
