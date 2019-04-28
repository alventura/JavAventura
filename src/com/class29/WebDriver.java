package com.class29;

public interface WebDriver extends TakesScreenshot, Executes {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
	
	void execute();
}

