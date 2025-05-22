package day14.XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoBlazeTC1 {

	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome", "https://www.demoblaze.com/");
		
	 WebElement	price=driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]//following-sibling::h5"));
	 
	 System.out.println("Prize of Samsung galaxy s6 is :- "+price.getText());
		
	 WebElement	priceSony=driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]//following-sibling::h5"));
	 
	 System.out.println("Prize of Sony xperia z5 is :- "+priceSony.getText());
	 
		
		
		
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

1. https://www.demoblaze.com/ ---> get a price for Sony xperia z5

*/