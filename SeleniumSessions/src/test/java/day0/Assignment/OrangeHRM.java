package day0.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		
			
		WebDriver driver=new ChromeDriver();
		//Enter URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	WebElement usernameInputField=driver.findElement(By.tagName("data-v-1f99f73c"));
	usernameInputField.clear();
	usernameInputField.sendKeys("Admin");
	
	WebElement passwordInputField=driver.findElement(By.name("password"));
	passwordInputField.clear();
	passwordInputField.sendKeys("admin123");
	
	WebElement loginButton=driver.findElement(By.className("oxd-button"));
	loginButton.click();
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	System.out.println("Home page URL validation status is :- "+actualUrl.equals(expectedUrl));
	
	
	
		
	}

}
/*
WASS to perform below operation 
	- open any browser
	- enter application url(below url)
	- clear existing text and enter username as "Admin"
	- clear existing text and enter password as "Admin"
	- click on login button
	- validation home page
1. https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
2. https://demowebshop.tricentis.com/login
	email: tester01@vomoto.com
	password: Abc@12345
*/