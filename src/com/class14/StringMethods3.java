/**
 * 
 */
package com.class14;

/**
 * @author Tafseer Haider
 * 27 Jun 2020
 */
public class StringMethods3
{
	public static void main (String[] args)
	{
		String s1 = "Java";
		String s2 = "Programming";
		String s3 = "java";
		
		//System.out.println (s1.equalsIgnoreCase (s3));
		
		String s4 = "Automation";
		
		char [] array = s4.toCharArray ();
		
		for (char ch : array)
		{
			System.out.print (ch + " ");
		}

	}

}
