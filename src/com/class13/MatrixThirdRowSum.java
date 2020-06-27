/**
 * 
 */
package com.class13;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class MatrixThirdRowSum
{
	public static void main (String[] args)
	{
		// Step 1 & 2 - Declare & Initialize the array
		int [][] matrix = {{2, 5, 7},
				          {1, 4, 3},
		                  {8, 6, 9}  
		                 }; 

		int sum = 0;
		
		// Step 3, 4 – Implement your code logic & output the program
		for (int j = 0; j < matrix[2].length; j++)
		{
			sum = sum + matrix [2][j];
		}

		System.out.println("Sum is: " + sum);
	}
}
