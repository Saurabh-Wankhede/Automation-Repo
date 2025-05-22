package day1.BrowserSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {

		Assignment assignment = new Assignment();

	assignment.vtiger();
//	assignment.orangeHRM();
//		assignment.demowebshop();

	}

	public void orangeHRM() {

		WebDriver driver = new ChromeDriver();

		// URl Which is requried
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String acutalTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";

		System.out.println("Application Title : " + acutalTitle);
		System.out.println("Number of char in Application title : " + acutalTitle.length());

		if (acutalTitle.equals(expectedTitle)) {
			System.out.println("Application opened, Test Case");
		} else {
			System.out.println("Application not opened, Test Case failed");
		}

		String url = driver.getCurrentUrl();
		System.out.println("Number of char in Application URL : " + url.length());
		String source = driver.getPageSource();
		System.out.println("Source code Char Count: " + source.length());

//		driver.close();
	}

	public void vtiger() {

		WebDriver driver = new ChromeDriver();

		// URl Which is requried
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		String acutalTitle = driver.getTitle();
		String expectedTitle = "vtiger";

		System.out.println("Application Title : " + acutalTitle);
		System.out.println("Number of char in Application title : " + acutalTitle.length());

		if (acutalTitle.equals(expectedTitle)) {
			System.out.println("Application opened, Test Case");
		} else {
			System.out.println("Application not opened, Test Case failed");
		}

		String url = driver.getCurrentUrl();
		System.out.println("Number of char in Application URL : " + url.length());
		String source = driver.getPageSource();
		System.out.println("Source code Char Count: " + source.length());

//		driver.close();
	}

	public void demowebshop() {

		WebDriver driver = new ChromeDriver();

		// URl Which is requried
		driver.get("https://demowebshop.tricentis.com/");

		String acutalTitle = driver.getTitle();
		String expectedTitle = "Demo Web Shop";

		System.out.println("Application Title : " + acutalTitle);
		System.out.println("Number of char in Application title : " + acutalTitle.length());

		if (acutalTitle.equals(expectedTitle)) {
			System.out.println("Application opened, Test Case");
		} else {
			System.out.println("Application not opened, Test Case failed");
		}

		String url = driver.getCurrentUrl();
		System.out.println("Number of char in Application URL : " + url.length());
		String source = driver.getPageSource();
		System.out.println("Source code Char Count: " + source.length());

//		driver.close();
	}

}
/*
WASS to perform below operation 
1. https://demo.vtiger.com/vtigercrm/index.php
2. https://demowebshop.tricentis.com/
3. https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	- open any browser
	- enter application url
	- get title, print it and count character count as well
	- validate application title
	- get url, print it and count character count as well
	- get source code and print char count
	- close browser

*/
