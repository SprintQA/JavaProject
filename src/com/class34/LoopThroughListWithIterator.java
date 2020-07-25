/**
 * 
 */
package com.class34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class LoopThroughListWithIterator
{
	public static void main (String[] args)
	{
       List fruit = Arrays.asList ("apple", "banana", "mango", "kiwi", "lemon", "watermelon", "pineapple", "apricot", "peach");
       
       // to iterator over the elements of list - we use Iterator interface
       
       Iterator i = fruit.iterator ();
       while(i.hasNext ())
       {
    	   System.out.println (i.next ());
       }
       

	}

}
