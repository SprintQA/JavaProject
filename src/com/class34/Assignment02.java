/**
 * 
 */
package com.class34;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class Assignment02
{

	public static void main (String[] args)
	{
		List colors = Arrays.asList ("White", "Black", "Red", "Magenta", "Cyan", "Azure", "Blue", "Green");
		
		Iterator i = colors.iterator ();
		while(i.hasNext ())
		{
			System.out.println (i.next ());
		}
		

	}

}
