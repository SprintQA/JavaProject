/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class SecondAssignment
{
	public static void main (String[] args)
	{
		int [][] matrix = {{ 1, 2, 3}, 
				           { 3, 4, 8}, 
				           { 5, 6, 7 }, 
				           { 8, 9, 3}};
		
		for (int [] innerArray : matrix)
		{
			System.out.println ();
			for (int element : innerArray)
			{
				System.out.print (element + " ");
			}
		}
		
	}
}
