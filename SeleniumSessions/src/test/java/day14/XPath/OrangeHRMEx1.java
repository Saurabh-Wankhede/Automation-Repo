package day14.XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMEx1 {

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
		
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
      driver.findElement(By.xpath("//div[div[div[text()='0425']]]")).click();
		
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
