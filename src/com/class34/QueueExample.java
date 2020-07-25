/**
 * 
 */
package com.class34;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class QueueExample
{
	public static void main (String[] args)
	{
		// create of object of LinkedList class from Queue interface
		Queue fruit = new LinkedList();
		fruit.add ("apple");
		fruit.add ("banana");
		fruit.add ("kiwi");
		fruit.add ("mango");
		fruit.add ("tomato");
		
		System.out.println (fruit);
		System.out.println (fruit.size ());
		fruit.remove (); // remove the head element
		System.out.println (fruit.peek ()); // returns the next the head
		

	}

}
