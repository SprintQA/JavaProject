/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class TwoDArraysExample
{
	public static void main (String[] args)
	{
		// multidimensional arrays are arrays of arrays
		// 2-d array
		
		int [] array1 = {1, 2, 3, 4, 5}; // 1-d array
		
		// indices = 0, 1, 2, 3, 4
		
		int [][] array = {{1, 2, 3}, 
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
		
		for (int i = 0; i < array.length; i++) // i represents row here
		{
			for (int j = 0; j < array[i].length; j++) // j represents column here
			{
				System.out.println (array[i][j]);
			}
		}	
		
		
	}

}
