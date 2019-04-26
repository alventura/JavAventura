package com.class28;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Click on Chrome icon to open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Click on the X to close the Chrome browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Click on the double squares to maximize the Chrome window");
		
	}

	@Override
	public void findElement() {
		System.out.println("finds element on Chrome");
		
	}
	
}
class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Click on the FireFox icon to open FireFox");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Click on the X to close Firefox browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Click on the double square to maximize FireFox window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Finds element on FireFox");
		
	}
	
}