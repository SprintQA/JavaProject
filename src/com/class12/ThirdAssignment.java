/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class ThirdAssignment
{

	public static void main (String[] args)
	{
		int [][] matrix = {{1, 2, 3},
				           {4, 5, 6},
				           {7, 8, 9},
				           {4, 6, 2}
		};
		
		System.out.println ("No. of rows: " + matrix.length);
		System.out.println ("No. of columns: " + matrix[0].length);
		System.out.println ("Size: " + matrix.length * matrix[0].length);

	}

}
