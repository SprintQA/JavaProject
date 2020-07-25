/**
 * 
 */
package com.class34;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class LoopThroughListWithEnhancedForLoop
{

	public static void main (String[] args)
	{
		List<String>  fruit = Arrays.asList ("apple", "banana", "mango", "kiwi", "lemon", "watermelon", "pineapple", "apricot", "peach");
		
		// using simple for loop
		for (int i=0; i<fruit.size (); i++)
		{
			System.out.println (fruit.get (i));
		}
		
		// using enhanced for loop
		for(String item : fruit)
		{
			System.out.println (item );
		}

	}

}
