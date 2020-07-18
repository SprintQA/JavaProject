package com.class30;

public abstract class ShoppingApps {
	String name;
	int price;

	public void download() {
		System.out.println("Downloaind..." + name);
	}

	public void install() {
		System.out.println("installing..." + name);
	}
	
	public void open() {
		System.out.println("opening..." + name);
	}
	
	public void uninstall() {
		System.out.println("uninstalling..." + name);
	}

	public abstract void displaySize();

}

class AmazonApp extends ShoppingApps {

	AmazonApp(String name) {
		this.name = name;
	}

	public void displaySize() {
		System.out.println("34MG");
	}
}

class EbayApp extends ShoppingApps {
	
	public EbayApp(String name) {
		this.name = name;
	}
	
	public void displaySize() {
		System.out.println("84MG");
	}
}
