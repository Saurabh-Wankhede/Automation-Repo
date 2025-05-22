package day14.XPath;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FilpkartTC2 {
	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome", "https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		
		
		WebElement	latesPhonePrice=driver.findElement(By.xpath("//div[div[div[a[text()='SAMSUNG Galaxy A36 5G (Awesome White, 128 GB)']]]]//following-sibling::div[2]/div/div"));
//		//div[div[div[a[text()='SAMSUNG Galaxy A36 5G (Awesome White, 128 GB)']]]]//following-sibling::div[2]/div/div
		
		System.out.println("In FlipKart Latest Phone price is : "+latesPhonePrice.getText());
			
		
		
		
	 
		
		
		
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
 
 2. from flipkart get samsung mobile price for present in "Latest Samsung mobiles" https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung

 */
