package com.class07;

public class PostFixPreFix {
	public static void main(String args[]) {
		int i = 5, j, k = 5, l;

		j = i++; // Postfix -> j=5, i=6

		l = ++k; // Prefix --> l=6, k=6

		
		System.out.println(l); 
		System.out.println(k);
	}
}
