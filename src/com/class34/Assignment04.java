/**
 * 
 */
package com.class34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tafseer Haider
 * 26/07/2020
 */
public class Assignment04
{
	public static void main (String[] args)
	{
		List<Integer> numbers = new ArrayList();
		for(int i=0; i<=10; i++)
		{
			numbers.add (i);
		}
		
		System.out.println ("List before sorting: " + numbers);
		Collections.sort (numbers, Collections.reverseOrder ());
		System.out.println ("List after sorting in descending order: " + numbers);
		
		if(numbers.get (5) == 8)
		{
			System.out.println ("Not Shifted");
		}
		else
			System.out.println ("Shifted");
		
	}

	
}
