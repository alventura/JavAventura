package com.class28;

public class TestWebDriver {

	public static void main(String[] args) {
		WebDriver chrome=new ChromeDriver();
		WebDriver fireFox=new FireFoxDriver();
		
		chrome.openBrowser();
		chrome.maximizeWindow();
		chrome.closeBrowser();
		chrome.findElement();
		fireFox.closeBrowser();
		fireFox.openBrowser();
		fireFox.maximizeWindow();
		fireFox.closeBrowser();
		fireFox.findElement();
	}

}
