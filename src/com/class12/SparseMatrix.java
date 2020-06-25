/**
 * 
 */
package com.class12;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class SparseMatrix
{

	public static void main (String[] args)
	{
		int [][] matrix = {    
				{2, 0, 0},    
                {0, 4, 0},    
                {0, 0, 6} 
	           };
		
		int rows, columns, size, countOfZeros;
		
		rows = matrix.length;
		columns = matrix[0].length;
		size = rows * columns;
		
		countOfZeros = 0;
		
		for (int [] innerArray : matrix)
		{
			for (int element : innerArray)
			{
				if (element == 0)
				{
					countOfZeros++;
				}
			}
		}
		
		if (countOfZeros > size /2)
		{
			System.out.println ("Matrix is Sparse.");
		}
		else
		{
			System.out.println ("Matrix is NOT Sparse.");
		}

	}

}
