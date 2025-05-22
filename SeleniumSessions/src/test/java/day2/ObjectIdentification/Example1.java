package day2.ObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		//Open Browser
		WebDriver driver=new ChromeDriver();
		
		//Enter URL
		driver.get("https://www.saucedemo.com/");
		
		//identify usename input field
		WebElement usernameInputField=driver.findElement(By.id("user-name"));
		/*enter username*/
		usernameInputField.sendKeys("standard_user");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.id("password"));
		//Enter Password
		passwordInputField.sendKeys("secret_sauce" );
		
		//Identify login input field
		WebElement loginButton=driver.findElement(By.id("login-button"));
		//Click on login
		loginButton.click();
		
		//Validate home page with URL
		String excpectedUrl="https://www.saucedemo.com/inventory.html";
		String actualUrl=driver.getCurrentUrl();
		System.out.println("is Login Successful ? "+actualUrl.equals(excpectedUrl));
		
		
		
	}
}
/*
  findElement(By) :-
  		- This will help you to identify required element and retrun in the form of WebElement 
  		- This method cotains argument of type By class, this call has various static method to locate the element
  			thats why these method are also know as locators in selenium
  			
  			WebElement element =driver.findElement(By.____);
  			
  			.id(String)
  			.name(String)
  			.linkText(String)
  			.partialLinkText(String)
  			.className(String)
  			.cssSelector(String)
  			.xpath(String)
  			
  				
			WebElement element=driver.findElement(By.id(""));
 
 			Once element is identify you can perform any required opration on WebElement like-
 					element.sendKeys(String); need to type some text
 					element.click(); want to click onlink/button/image/checkbox/radiobutton
 					element.clear(); want to delete existing text from the text field
 */
/*
WASS to perform below operation 
	- open any browser
	- enter application url as https://www.saucedemo.com/
	- enter username as "standard_user"
	- enter password as "secret_sauce"
	- click on login button
	- validation home page
*/
