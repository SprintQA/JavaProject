/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class ForEachAssignment
{

	public static void main (String[] args)
	{
		int [] numbers = {2, 5, 8, 7, 9, 6};
		int sum = 0;
		
		for (int number : numbers)
		{
			sum = sum + number;
		}
		
		System.out.println (sum);

	}

}
