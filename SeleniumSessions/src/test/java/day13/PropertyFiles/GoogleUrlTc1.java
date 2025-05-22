package day13.PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleUrlTc1 {

	public static void main(String[] args) throws Throwable {
			
		manual();
		selenium();
		api();
	}

	public static void manual() throws IOException {

		FileInputStream file = new FileInputStream(
				"E:\\Accerration\\AUTOMATION\\SeleniumSessions\\src\\test\\resources\\TestData\\GoogleUrl.properties");

		Properties properties = new Properties();
		properties.load(file);

		WebDriver driver = setUp(properties.getProperty("browserName"), properties.getProperty("appUrl"));

		driver.findElement(By.name("q")).sendKeys(properties.getProperty("manual"));

		List<WebElement> manualList = driver
				.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));

		System.out.println("Suggetions :- ");
		for (int i = 0; i < manualList.size(); i++) {

			System.out.println("  " + manualList.get(i).getText());
		}
	}

	public static void selenium() throws IOException {

		FileInputStream file = new FileInputStream(
				"E:\\Accerration\\AUTOMATION\\SeleniumSessions\\src\\test\\resources\\TestData\\GoogleUrl.properties");

		Properties properties = new Properties();
		properties.load(file);

		WebDriver driver = setUp(properties.getProperty("browserName"), properties.getProperty("appUrl"));

		driver.findElement(By.name("q")).sendKeys(properties.getProperty("selenium"));

		List<WebElement> manualList = driver
				.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));

		System.out.println("Suggetions :- ");
		for (int i = 0; i < manualList.size(); i++) {

			System.out.println("  " + manualList.get(i).getText());
		}
	}

	public static void api() throws IOException {

		FileInputStream file = new FileInputStream(
				"E:\\Accerration\\AUTOMATION\\SeleniumSessions\\src\\test\\resources\\TestData\\GoogleUrl.properties");

		Properties properties = new Properties();
		properties.load(file);

		WebDriver driver = setUp(properties.getProperty("browserName"), properties.getProperty("appUrl"));

		driver.findElement(By.name("q")).sendKeys(properties.getProperty("API"));

		List<WebElement> manualList = driver
				.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));

		System.out.println("Suggetions :- ");
		for (int i = 0; i < manualList.size(); i++) {

			System.out.println("  " + manualList.get(i).getText());
		}
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
 * TC1: 
 * open chrome browser and enter google url (data should come from Property file)
 *  read text that needs to be searched from property file and print all suggestions
 * 
 * - Selenium interview questions 
 * - Manual interview questions 
 * - API interview questions
 * 
 */