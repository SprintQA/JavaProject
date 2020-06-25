/**
 * 
 */
package com.class13;

/**
 * @author Tafseer Haider
 * 25 Jun 2020
 */
public class MatricesSummation
{
	public static void main (String[] args)
	{
		// Step 1 & 2 - Declare & Initialize the array
		int [][] A = {{1, 2, 3},
				      {0, 6, 1},
		              {5, 3, 1}  
		             }; 

		
		int [][] B = {{0, 5, 3},
			          {4, 0, 6},
	                  {2, 1, 3}  
	                 }; 
		
		int [][] C = new int[3][3];
		
		// Step 3, 4 – Implement your code logic & output the program
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
				System.out.print (C[i][j] + " ");
			}
			
			System.out.println ();
		}

	}

}
