/**
 * 
 */
package com.class23;

/**
 * @author Tafseer Haider
 * 9 Jul 2020
 */
class Smartphone
{
	// instance variables aka non-static variables
	float display;
	int memory;
	int storage;
	String processor;
	int camera;
	String OS;
	
	void createSmartphone ()
	{
		System.out.println ("Display: " + display + " inches");
		System.out.println ("RAM: " + memory + " GB");
		System.out.println ("ROM: " + storage + " GB");
		System.out.println ("Processor: " + processor);
		System.out.println ("Camera: " + camera + " MP");
		System.out.println ("Operating System: " + OS);
	}
}


public class SmartphoneTester
{

	public static void main (String[] args)
	{
		Smartphone samsung = new Smartphone (); // object = instance
		System.out.println ("Samsung smartphone with below specs created:");
		samsung.display = 6.6f;
		samsung.memory = 8;
		samsung.storage = 256;
		samsung.processor = "Snapdragon 865";
		samsung.camera = 108;
		samsung.OS = "Android";
		samsung.createSmartphone ();
		System.out.println ();
		
		Smartphone nokia = new Smartphone ();
		System.out.println ("Nokia smartphone with below specs created:");
		nokia.display = 6.5f;
		nokia.memory = 8;
		nokia.storage = 512;
		nokia.processor = "Snapdragon 865";
		nokia.camera = 108;
		nokia.OS = "Android";
		nokia.createSmartphone ();

	}

}
