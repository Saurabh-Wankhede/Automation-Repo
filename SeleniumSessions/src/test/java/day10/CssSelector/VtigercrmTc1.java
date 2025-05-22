package day10.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VtigercrmTc1 {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		//Check Sign in Button  & locations Cordinateds
		WebElement signInButton = driver.findElement(By.cssSelector(".buttonBlue"));
		System.out.println("Sing in button Font color " + signInButton.getCssValue("color"));
		System.out.println("Sing in button Font Size " + signInButton.getCssValue("font-size"));
		System.out.println("Sing in button Font Family " + signInButton.getCssValue("font-family"));

		Point signInButtonLocation = signInButton.getLocation();
		int sign_x = signInButtonLocation.getX();
		int sign_y = signInButtonLocation.getY();
		System.out.println("Sign In Button X - Cords " + sign_x);
		System.out.println("Sign In Button X - Cords " + sign_y);

		System.out.println("*******************************************************");
		//Check Web Page  & locations Cordinateds
		WebElement	webPage=driver.findElement(By.cssSelector("div#page"));
		System.out.println("Wepage bg Color : "+webPage.getCssValue("color"));
		System.out.println("Wepage  font-family : "+webPage.getCssValue("font-family"));
		System.out.println("Wepage  font-size : "+webPage.getCssValue("font-size"));
		
		Point webPageLocation=webPage.getLocation();
		 int webpage_x=webPageLocation.getX();
		 int webpage_y=webPageLocation.getY();
		System.out.println("Web Page X cords "+webpage_x);
		System.out.println("Web Page Y cords "+webpage_y);
			
		System.out.println("*******************************************************");
		//Check forgot password?  & locations Cordinateds
	WebElement forgatPass=driver.findElement(By.cssSelector(".forgotPasswordLink"));
	System.out.println("get text  : "+forgatPass.getText());
	System.out.println("forgot Password Link color  : "+forgatPass.getCssValue("color"));
	System.out.println("forgot Password Link Font-Size  : "+forgatPass.getCssValue("font-size"));
	System.out.println("forgot Password Link Font-Family  : "+forgatPass.getCssValue("font-family"));
	System.out.println("forgot Password Link BG Color  : "+forgatPass.getCssValue("background-color"));
		
		Point forgatPassLocation=forgatPass.getLocation();
		System.out.println("forgat Password Location X Cords "+forgatPassLocation.getX());
		System.out.println("forgat Password Location Y Cords "+forgatPassLocation.getY());
	
	
	
	}
	public static WebDriver setUp(String browserName,String appUrl) {
		
		WebDriver driver=null;
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver ;
	}
}
/*
Using the CssSelector :- 

WASS to perform below operation 
1. https://demo.vtiger.com/vtigercrm/index.php
	- open any browser
	- enter application url
	-validate 
			Remember me text is getting displayed next to checkbox
			Login button name
			login button font size
			login button font family
			login button color

*/
