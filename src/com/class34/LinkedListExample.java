/**
 * 
 */
package com.class34;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Tafseer Haider
 * 26/07/2020
 */
public class LinkedListExample
{
	public static void main (String[] args)
	{
		List games = new LinkedList ();
		games.add ("soccer");
		games.add ("hockey");
		games.add ("cricket");
		games.add ("tennis");
		games.add ("rugby");
		
		System.out.println (games.size ());
		System.out.println (games);
		

	}

}
