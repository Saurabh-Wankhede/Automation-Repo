package day9.cssAttributeAndPosition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {

	public static void main(String[] args) {

		WebDriver driver = setUp("chrome", "https://online.actitime.com/dec23/login.do");

		driver.findElement(By.id("loginButton")).click();
		String excpetedError = "Username or Password is invalid. Please try again.";
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), excpetedError));
		
		
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		
		String actualErrorMsg=errorMsg.getText();
		System.out.println("Error msg Validation  :"+actualErrorMsg.equals(excpetedError));
		System.out.println("Error Msg Color : "+errorMsg.getCssValue("color"));//Color might come Hexa from
		System.out.println("Error Msg Font Size : "+errorMsg.getCssValue("font-size"));
		System.out.println("Error Msg Font Family : "+errorMsg.getCssValue("font-family"));
		
		//Position Check
		Point errorMsgLocation=errorMsg.getLocation();//Get the locationn of element retun type point
		int error_x=errorMsgLocation.getX();
		int error_y=errorMsgLocation.getY();
		System.out.println("Error msg x-Cords : "+error_x);
		System.out.println("Error msg y-Cords : "+error_y);
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		Point usenameLocation=usernameInputField.getLocation();
		int username_x=usenameLocation.getX();
		int username_y=usenameLocation.getY();
		System.out.println("usernameInputField  x-Cords : "+username_x);
		System.out.println("usernameInputField  y-Cords : "+username_y);
		
		System.out.println("Is error msg display above usename input field ? "+(error_y < username_y));
		
	}

	public static WebDriver setUp(String browserName, String appUrl) {

		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver;
	}
}
/*
Open browser, enter app URL
click on login button
validate 
	error msg text
	error msg color
	error msg font size
	error msg font family
	error msg is getting displayed above username field


*/
