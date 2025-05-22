package day9.cssAttributeAndPosition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMTc2 {
	
	public static void main(String[] args) {
			
			//Open Chrome Browser
			WebDriver driver=setUp("chrome", " https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
			
			//Get username 
			WebElement usernameText=driver.findElement(By.cssSelector(".orangehrm-demo-credentials>:first-child"));
			System.out.println("For Login Username is :- "+usernameText.getText());
			
			//Get Password 
			WebElement passwordText=driver.findElement(By.cssSelector(".orangehrm-demo-credentials>:last-child"));
			System.out.println("For Login Password is :- "+passwordText.getText());
			
			//fetch username & fill Username input Filed 
			WebElement usernameInputField = driver.findElement(By.cssSelector("input[name='username']"));
			String []user=usernameText.getText().split(" ");
			usernameInputField.sendKeys(user[2]); 
			
			//fetch Password & fill password input Filed 
			WebElement	passwordInputFiled=driver.findElement(By.cssSelector("input[name='password']"));
			String[]pass=passwordText.getText().split(" ");
			passwordInputFiled.sendKeys(pass[2]);
			
			//Click on login Button
			WebElement loginButton=driver.findElement(By.cssSelector(".orangehrm-login-button"));
			loginButton.click();
			
			
			//click on profile dropdown field
			WebElement	profile=driver.findElement(By.cssSelector(".oxd-userdropdown-icon"));
			profile.click();
			
			//find logout option and click it ()
			WebElement logoutButton=driver.findElement(By.cssSelector(".oxd-dropdown-menu li:last-child a"));
			logoutButton.click();

//				driver.close();
			
	
	
	}
	public static WebDriver setUp(String browserName,String appUrl) {
		
		WebDriver driver=null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			
			driver=new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver;
	}
}
/*

TC2:
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	Open browser, enter app URL
	read username and password from the login screen
	enter username 
	enter password
	click on login button
	logout and close browser

*/