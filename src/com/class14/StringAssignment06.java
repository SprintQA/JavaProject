/**
 * 
 */
package com.class14;

/**
 * @author Tafseer Haider
 * 28 Jun 2020
 */
public class StringAssignment06
{
	public static void main (String[] args)
	{
		int number = 108;
		
		String string = String.valueOf (number);
		
		string = string.replace ('0', ' ');
		
		System.out.println (string);

	}

}
