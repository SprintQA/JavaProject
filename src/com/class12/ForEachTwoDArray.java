/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class ForEachTwoDArray
{
	public static void main (String[] args)
	{
		int [][] matrix = {{1, 2, 3}, 
				           {4, 5, 6},
				           {7, 8, 9}};
		
		// 00 means 1st row and 1st column
		// 1st row = {1, 2, 3} // an array
		// 1(0,0)
		// 2(0,1)
		// 3(0,2)
		
		// 2nd row = {4, 5, 6}
		// 4(1,0}
		// 5(1,1)
		// 6(1,2)
		
		// 3rd row = {7, 8, 9}
		// 7(2,0)
		// 8(2,1)
		// 9(2,2)
		
		for (int[] innerArray : matrix) // to access the indiviual arrays inside matrix
		{
			System.out.println ();
			for (int element : innerArray) // to access each element inside the rows (inner arrays)
			{
				System.out.print (element + " ");
			}
		}
		
		System.out.println();
		int rows = matrix.length;
		int columns = matrix[0].length;
		int size = rows * columns;
		System.out.println ("Size is :" + size);
			
		
	}
}
