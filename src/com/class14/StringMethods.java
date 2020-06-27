/**
 * 
 */
package com.class14;

/**
 * @author Tafseer Haider
 * 27 Jun 2020
 */
public class StringMethods
{
	public static void main (String[] args)
	{
		// length method
		String s1 = "SprintQA";
		
		//System.out.println ("Length of " + s1 + " is: " + s1.length ());
		
		// charAt method
		char firstCharacter = s1.charAt (0);
		System.out.println (firstCharacter);
		System.out.println (s1.charAt (5));
		System.out.println (s1.charAt (s1.length () - 1));
		
		// concat method
		String s2 = "Java";
		String s3 = s2.concat (" Programming");
		//System.out.println (s3);
		
		String s4 = "Test".concat (" Automation").concat (" in Selenium");
		System.out.println (s4);

	}

}
