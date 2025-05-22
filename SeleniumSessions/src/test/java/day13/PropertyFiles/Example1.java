package day13.PropertyFiles;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fileInputStream=new FileInputStream("E:\\Accerration\\AUTOMATION\\SeleniumSessions\\src\\test\\resources\\TestData\\appData.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		WebDriver driver=setUp(properties.getProperty("browserName"), properties.getProperty("appUrl"));
		
		driver.findElement(By.id("username")).sendKeys(properties.getProperty("username"));
		
		driver.findElement(By.name("pwd")).sendKeys(properties.getProperty("password"));
		
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		String excpectedTitle=properties.getProperty("excpectedTitle");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.titleIs(excpectedTitle));
		
		String actualTitle=driver.getTitle();
		
		System.out.println("is Login done? "+actualTitle.equals(excpectedTitle));
		
	}
	
	public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
	}
	
}
