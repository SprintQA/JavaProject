/**
 * 
 */
package com.class13;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class ArraysCustomIterator
{
	public static void main (String[] args)
	{
		// Step 1 & 2 - Declare known values & unknown values
		char[] array = { 's', 'a', 'p', 'b', 'r', 'c', 'i', 'd', 'n', 'e', 't', 'g', 'q', 'h', 'a' };

		// Step 3 - Get values for the unknown
				// in step 4
				
		// Step 4 – Implement your code logic and output the program
		for (int i = 0; i <= array.length; i += 2)
		{
			System.out.print (array[i]);
		}
	}

}
