/**
 * 
 */
package com.class14;

/**
 * @author Tafseer Haider
 * 27 Jun 2020
 */
public class StringAssignment03
{
	public static void main (String[] args)
	{
		String quote = "Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do.";
		int count = 0;
		
		// Step 1 - iterate over the string
		for (int i = 0; i < quote.length (); i++)
		{
			// Step 2 - use if statement to remove punctuation marks from the string
			if (quote.charAt (i) != ' ' && quote.charAt (i) != ';' && quote.charAt (i) != '.') // for i=0 it will return true
			{
				count++;
			}
			
		}
		
		System.out.println ("Total number of alphabetical characters are: " + count);

	}

}
