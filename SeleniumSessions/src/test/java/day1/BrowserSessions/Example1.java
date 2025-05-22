package day1.BrowserSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) {

		// Open chrome browser - ChromeDriver

		ChromeDriver chromeDriver = new ChromeDriver();

		// Open firefox - FirefoxDriver

		FirefoxDriver firefoxDriver = new FirefoxDriver();

		// Open Edge browser - EdgeDriver

		EdgeDriver edgeDriver = new EdgeDriver();

	}

}
/*
For each run- selenium will open new browser instance it won't work on already opened browser
New browser instance will not be having
	- No History
	- No Plugins
	- No Download history
*/
