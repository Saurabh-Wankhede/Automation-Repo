package day1.BrowserSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOps {

	public static void main(String[] args) {

		// Open Browaer -chrome
		WebDriver driver = new ChromeDriver();

		// enter requried apllication URL
		driver.get("https://www.google.com");

		// Get application titile using getTitile() that will return titile in String
		// from
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		System.out.println("Application Title : " + actualTitle);
		System.out.println("No of char in Application title : " + actualTitle.length());
		
		
		if (actualTitle.equals(expectedTitle)) {
			
			System.out.println("Application opened, Test Case");
		}else {
			System.out.println("Application not opened, Test Case failed");
		
		}
		
		//get application current title url using getCurrentUrl() that will return url in String form
		
		System.out.println("Current url: "+driver.getCurrentUrl());
		
		//get application page source code using getPageSource() that will return in String form
		
		String source=driver.getPageSource();
		
		System.out.println("Source code size: "+source.length());
		
		//close current browser instance
				driver.close();
		
		
	}
	}
