package day20.DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reusableComponent.SeleniumUtility;

public class GoogleApplicationWithBeforeAfterMethod extends SeleniumUtility {

	WebDriver driver;

	@BeforeMethod
	public void stratUp() {

		driver = setUp("chrome", "https://www.google.com/");
	}

	@Test(priority = 1)
	public void testGoggleLandingPage() {

		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();

		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}

	@Test(priority = 2)
	public void testSearch() {

		driver.findElement(By.name("q")).sendKeys("SQL",Keys.ENTER);
		
		Assert.assertTrue(getCurrentTitleOfApplication("SQL").contains("SQL"),"SQL Search is failed");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
