package com.class31;

public interface Browser {
	void clearCookie();

	void openNewTab();

	void openPrivateBrowsing();
}

class Chrome implements Browser {
	@Override
	public void clearCookie() {
		System.out.println("Clearing all cookies from chrome browser");
	}

	@Override
	public void openNewTab() {
		System.out.println("Opening new tab in chorme");
	}

	@Override
	public void openPrivateBrowsing() {
		System.out.println("Prese cntr+shft+n");
	}
}

class Firefox implements Browser {

	@Override
	public void clearCookie() {
		System.out.println("Clearing all cookies from ff browser");
	}

	@Override
	public void openNewTab() {
		System.out.println("Opening new tab in ff");
	}

	@Override
	public void openPrivateBrowsing() {
		System.out.println("Press cntr + shft + p");
	}

}