/**
 * 
 */
package com.class23;

/**
 * @author Tafseer Haider
 * 9 Jul 2020
 */
class Person
{
	// static variable
	static String name = "Vildan";
	// instance variable aka non-static variable
	int age = 24;
}

public class PersonTester
{
	public static void main (String[] args)
	{
		System.out.println ("Name of the person is: " + Person.name); // call by fully-qualified name
		
		Person person = new Person ();
		System.out.println ("Age of the person is: " + person.age); // call by object/instance name

	}

}
