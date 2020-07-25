/**
 * 
 */
package com.class34;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Tafseer Haider
 * 26/07/2020
 */
public class ReverseExample
{

	public static void main (String[] args)
	{
		List games = new LinkedList ();
		games.add ("soccer");
		games.add ("hockey");
		games.add ("cricket");
		games.add ("tennis");
		games.add ("rugby");
		
		System.out.println ("Original list: " + games);
		
		Collections.reverse (games);
		System.out.println ("Reversed list: " + games);
		
		Collections.sort (games, Collections.reverseOrder ());
		System.out.println ("List in descending order: " + games);
	}

}
