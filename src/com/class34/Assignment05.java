/**
 * 
 */
package com.class34;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Tafseer Haider
 * 26/07/2020
 */
public class Assignment05
{

	public static void main (String[] args)
	{
		List codingLanguages = Arrays.asList ("C", "C++", "Java", "JavaScript", "C#", "Python", "Ruby", "Scala");
		
		Collections.swap (codingLanguages, 2, 4);
		System.out.println (codingLanguages);
	}

}
