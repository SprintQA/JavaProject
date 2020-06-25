package com.class13;

/**
 * @author Tafseer Haider 25 Jun 2020
 */
public class HourglassPattern
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int rows;

		// Step 2 - Initialize known values
		rows = 5;

		// Step 3 - Get values for the unknown
		// Step 4 – Implement your code logic and print the pattern
		
		// print the upper half of stars
		for (int i = 1; i <= rows; i++)
		{
			// print i spaces at the beginning of each row
			for (int j = 1; j < i; j++)
			{
				System.out.print (" ");
			}

			// print i stars to rows value at the end of each row
			for (int j = i; j <= rows; j++)
			{
				System.out.print ("*" + " ");
			}

			System.out.println ();
		}

		// print the lower half of stars
		for (int i = rows - 1; i >= 1; i--)
		{
			// print i spaces at the beginning of each row
			for (int j = 1; j < i; j++)
			{
				System.out.print (" ");
			}

			// print i stars to rows value at the end of each row
			for (int j = i; j <= rows; j++)
			{
				System.out.print ("*" + " ");
			}

			System.out.println ();
		}

	}

}
