package day0.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");

		//Click on login 
		WebElement loginLink =driver.findElement(By.className("ico-login"));
		loginLink.click();
		
	WebElement emailInputField = driver.findElement(By.id("Email"));
	emailInputField.sendKeys("tester01@vomoto.com");
	
	WebElement passwordInputField =	driver.findElement(By.id("Password"));
	passwordInputField.sendKeys("Abc@12345");
	
	WebElement loginButton=driver.findElement(By.className("login-button"));
	
	loginButton.click();
	

	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://demowebshop.tricentis.com/";
	System.out.println("Home page URL validation status is :- "+actualUrl.equals(expectedUrl));
	
		
		
		
	
	}
	
}
/*
WASS to perform below operation 
	- open any browser
	- enter application url(below url)
	- clear existing text and enter username as "Admin"
	- clear existing text and enter password as "admin123"
	- click on login button
	- validation home page
1. https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
2. https://demowebshop.tricentis.com/login
	email: tester01@vomoto.com
	password: Abc@12345
*/