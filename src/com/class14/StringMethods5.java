/**
 * 
 */
package com.class14;

/**
 * @author Tafseer Haider
 * 27 Jun 2020
 */
public class StringMethods5
{
	public static void main (String[] args)
	{
		String string = "Hello World";
		// let's assume this string contains two substrings i.e. Hello and World
		//System.out.println (string.substring (6));
		//System.out.println (string.substring (0, 5));
		
		String email = "support@sprintqa.com";
		
		String [] parts = email.split ("@"); // delimiter should always regex (regular expression)
		for (String part : parts)
		{
			System.out.println (part);
		}

	}

}
