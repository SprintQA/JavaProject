/**
 * 
 */
package com.class34;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class LoopThroughListWithForEachMethod
{
	public static void main (String[] args)
	{
		List<String>  fruit = Arrays.asList ("apple", "banana", "mango", "kiwi", "lemon", "watermelon", "pineapple", "apricot", "peach");
		
		fruit.forEach (item -> System.out.println (item ));
		
		// shortcut
		fruit.forEach (System.out::println);

	}

}
