/**
 * 
 */
package com.class34;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class SetExample
{
	public static void main (String[] args)
	{
		// create object of HashSet
		Set fingers = new HashSet(); // fingers is a collection of type Set that implements the HashSet class
		                             // fingers is an object of HashSet class
		fingers.add ("thumb");
		fingers.add ("index");
		fingers.add ("middle");
		fingers.add ("ring");
		fingers.add ("pinkie");
		
		System.out.println (fingers);
		

	}

}
