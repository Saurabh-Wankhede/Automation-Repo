package day13.PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonBirthdayGiftTC2 {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fileInputStream = new FileInputStream(
				".\\src\\test\\resources\\TestData\\AmazonTitle.properties");

		Properties properties = new Properties();
		properties.load(fileInputStream);

		WebDriver driver = setUp(properties.getProperty("browserName"), properties.getProperty("appUrl"));

		driver.findElement(By.cssSelector("input[type=text]")).sendKeys(properties.getProperty("birthdayGift"));
		
		
			driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		
		String expectedTitle=properties.getProperty("excpectedTitleBirthday");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		String actualTitle=driver.getTitle();
		System.out.println("Titile is "+actualTitle);
		System.out.println("is actualTitle and expectedTitle are ? :- "+actualTitle.equals(expectedTitle));
		
		
		
		
		driver.findElement(By.id("#nav-search-submit-button")).click();
		
		String actualTitile=driver.getTitle();
		System.out.println("Title is : "+actualTitile);
		
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
TC2:
	Open any browser and enter url as https://www.amazon.in/
	search products(read it from property file)
		
		- iphone 16  and select iphone 16pro max and print title
		- Birthday gift and print title
		- 3 idiots book and print title
*/
