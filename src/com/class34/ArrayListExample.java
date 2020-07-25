/**
 * 
 */
package com.class34;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class ArrayListExample
{

	public static void main (String[] args)
	{
		List fruit = new ArrayList();
		
		// 1st way
		fruit.add ("apple");
		fruit.add ("mango");
		fruit.add (0, "kiwi");
		fruit.add ("watermelon");
		
		System.out.println (fruit);
		System.out.println (fruit.size ());
		System.out.println (fruit.get (2));
		System.out.println (fruit.contains ("kiwi"));
		System.out.println (fruit.indexOf ("mango"));
		fruit.set (2, "banana");
		System.out.println (fruit);
		Collections.sort (fruit);
		System.out.println (fruit);
		Collections.sort (fruit, Collections.reverseOrder ());
		System.out.println (fruit);
		
	}

}
