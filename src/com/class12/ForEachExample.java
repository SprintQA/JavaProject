/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class ForEachExample
{

	public static void main (String[] args)
	{
		String [] fruits = {"apple", "banana", "kiwi", "pear", "peach", "apricot"};
		
		for (String element : fruits)
		{
			System.out.println (element);
		}
		
		// compare it with normal for loop
		for (int i= 0; i < fruits.length; i++)
		{
			System.out.println (fruits[i]);
		}

	}

}
