package com.class05;

public class LogicalExpression {
	public static void main(String args[]) {
		boolean b1 = true, b2 = false, b3 = true, b4= false;
		
		boolean result = b1 || b2 && b3 && b2 && b4 || b4 && b2 || b3 && b1 && b4 || b4;
		
		System.out.println(result);
	}
}
