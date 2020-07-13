package com.class25;

// Parent / Super / Base class
class IPhone8 {
	public void call(String num) {
		System.out.println("Calling...." + num);
	}

	public void text(String text, String num) {
		System.out.println("Sending sms...." + text + " to " + num);
	}
}

// Child / Sub / Derived class
class IPhone10 extends IPhone8 {
	public void webBrowsing() {
		System.out.println("Browsing internet");
	}

	public void captureScreenshot() {
		System.out.println("Taking screenshot");
	}

}
