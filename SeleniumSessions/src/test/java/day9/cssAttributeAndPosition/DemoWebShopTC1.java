package day9.cssAttributeAndPosition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebShopTC1 {

	public static void main(String[] args) {
			

		WebDriver driver=setUp("chrome", "https://demowebshop.tricentis.com/login");
	
		WebElement loginButton=driver.findElement(By.className("login-button"));
		
		
		System.out.println("Login Button Name :- "+loginButton.getText());
		System.out.println("Login Button Color :- "+loginButton.getCssValue("color"));
		System.out.println("Login Button Font Family :- "+loginButton.getCssValue("font"));
		System.out.println("Login Button Font Size BG :- "+loginButton.getCssValue("background"));
		
		Point loginButtonLocation=loginButton.getLocation();
		int login_x=loginButtonLocation.getX();
		int login_y=loginButtonLocation.getY();
		
		System.out.println("Login Button X -Cords :- "+login_x);
		System.out.println("Login Button y -Cords :- "+login_y);
		loginButton.click();
		
		System.out.println("**************************************************************************************************************************");
		
		WebElement errormsg=driver.findElement(By.cssSelector(".message-error div :first-child"));
		
		System.out.println("Get error message Text is :- "+errormsg.getText());
		System.out.println("Error message Font color :- "+errormsg.getCssValue("color"));
		System.out.println("Error message Font Size :- "+errormsg.getCssValue("font-size"));
		System.out.println("Error message Font Family :- "+errormsg.getCssValue("font-family"));
		

		
		
		
	}

	public static WebDriver setUp(String browserName,String appUrl) {
		
		WebDriver driver=null;
		if (browserName.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")){
			driver=new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		} 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver;
		
	}
	
}

/*
TC1:
	https://demowebshop.tricentis.com/login
	Open browser, enter app URL
	click on login button
	validate 
		error msg text
		error msg color
		error msg font size
		error msg font family
		error msg is getting displayed above username field
	validate 
		Remember me text is getting displayed next to checkbox
		Login button name
		login button font size
		login button font family
		login button color
*/