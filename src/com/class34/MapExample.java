/**
 * 
 */
package com.class34;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class MapExample
{
	public static void main (String[] args)
	{
		Map fruitCalories = new HashMap();
		fruitCalories.put ("apple", 52);
		fruitCalories.put ("banana", 105);
		fruitCalories.put ("mango", 60);
		fruitCalories.put ("tomato", 40);
		
		System.out.println (fruitCalories);
		System.out.println (fruitCalories.size ());
		System.out.println (fruitCalories.get ("banana"));
		System.out.println (fruitCalories.entrySet ());
		
		
		

	}

}
