package com.class35;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CountNumberOfDuplicate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> bag = new LinkedHashSet<Integer>();

		for (int i = 1; i <= 10; i++) {
			int value = sc.nextInt();
			bag.add(value);
		}

		System.out.println(bag);

	}
}
