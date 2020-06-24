/**
 * 
 */
package com.class11;

/**
 * @author Tafseer Haider
 * 24 Jun 2020
 */
public class Whiteboard
{

	public static void main (String[] args)
	{
		int[] intArray; // declaration
		
		intArray = new int[5]; // initialization
		
		String colors [] = {"red", "white", "green", "blue"}; // array initializer
		
		char [] vowels = {'a', 'e', 'i','o','u'};
		
		// index is position of the element in an array
		// [i] indexing operator
		
		// add elements in intArray
		intArray[0] = 2;
		intArray[1] = 4;
		intArray[2] = 6;
		intArray[3] = 8;
		
		//System.out.println (intArray[2]);
		
		//System.out.println (colors[3]);
		
		int LENGTH = colors.length;
		int indexOflastElement = colors.length - 1; // position or index of last element of the array
		
		for (int i = indexOflastElement; i >= 0; i--)
		{
			System.out.print (colors[i] + " ");
		}

	}

}
