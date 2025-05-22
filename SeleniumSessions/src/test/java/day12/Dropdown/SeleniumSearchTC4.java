package day12.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSearchTC4 {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://www.google.co.in/");
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
																				//.G43f7e>li>div>*:nth-child(2)>*:nth-child(1)>div>span
		List< WebElement> SeleniumSuggestionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2) div div span"));
		System.out.println("Count of Search Suggestion "+SeleniumSuggestionList.size());
		
		//Print Suggestion List
		for(int i=0;i<SeleniumSuggestionList.size();i++) {
			
			System.out.println("Selenium Suggest is :- "+SeleniumSuggestionList.get(i).getText());
			
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

 * TC4: Open Browser and enter google url type Selenium 
 * get all suggestion count
 * and print it print suggestion name one by one
 
 */