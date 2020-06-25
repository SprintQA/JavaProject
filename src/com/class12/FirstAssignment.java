/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class FirstAssignment
{

	public static void main (String[] args)
	{
		int [][] matrix = {{ 1, 2, 3}, 
				           { 3, 4, 8}, 
				           { 5, 6, 7 }, 
				           { 8, 9, 3}};
		
		for (int i = 0; i < matrix.length; i++)
		{
			System.out.println ();
			for (int j = 0; j< matrix[i].length; j++)
			{
				System.out.print (matrix[i][j] + " ");
			}
		}
		
	}

}
