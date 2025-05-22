package day8.Validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30 ));
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailIdInputField=driver.findElement(By.id("Email"));
		System.out.println("Is Email ID input field visible or not? "+emailIdInputField.isDisplayed());
		System.out.println("Is Email ID input field Enable or not? "+emailIdInputField.isEnabled());
		
		WebElement passwordInputField = driver.findElement(By.id("Password"));
		System.out.println("Is Password  input field visible or not? "+passwordInputField.isDisplayed());
		System.out.println("Is Password  input field Enable or not? "+passwordInputField.isEnabled());
		
		WebElement rememberMeCheckBox=driver.findElement(By.id("RememberMe"));
		System.out.println("Is Remember Check Box visible or Not "+rememberMeCheckBox.isDisplayed());
		System.out.println("Is Remember Check Box Clickable or Not "+rememberMeCheckBox.isEnabled());
		System.out.println("Is Remember Check Box Default selected or Not "+rememberMeCheckBox.isSelected());
		rememberMeCheckBox.click();
		System.out.println("Is Remember Check Box After selected checked or Not "+rememberMeCheckBox.isSelected());
		
		WebElement forgotPasswordLink=driver.findElement(By.linkText("Forgot password?"));
		System.out.println("Is forgot Password Link  visiable or Not "+forgotPasswordLink.isDisplayed());
		System.out.println("Is forgot Password Link Clickable or Not "+forgotPasswordLink.isEnabled());
		System.out.println("Is forgot Password Link is Same As "+forgotPasswordLink.getText() );
		
		WebElement loginButton=driver.findElement(By.className("login-button"));
		System.out.println("Is Login Button Visiable  or Not "+loginButton.isDisplayed());
		System.out.println("Is Login Button  Clickable or Not "+loginButton.isEnabled());
		System.out.println("Is Login Button Name vaildation "+loginButton.getText());
		
		
	}

}
/**

https://demowebshop.tricentis.com/login
Open browser and enter application url
validate:
	emailid field  
		visible or not
		enabled or not
	password field  
		visible or not
		enabled or not
	Remember me check box 
		visible or not
		clickable or not
		default not selected
		click on Remember me check box and validate its selected or not
	validate "Forgot your password?" 
		visible or not
		clickable or not
		link text is same or not
	login button
		visible or not
		clickable or not
		name is Log in or not
*/