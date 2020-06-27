/**
 * 
 */
package com.class14;

/**
 * @author Tafseer Haider
 * 28 Jun 2020
 */
public class StringAssignment07
{

	public static void main (String[] args)
	{
		String string = "programming";
		System.out.println (string.length ());
		String reverse = "";
		
		for (int i = string.length () - 1; i >=0; i--)
		{
			reverse = reverse + string.charAt (i);
		}
		
		System.out.println (reverse);

	}

}
