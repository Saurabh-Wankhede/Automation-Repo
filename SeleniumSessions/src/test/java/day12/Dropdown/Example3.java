package day12.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example3 {

	public static void main(String[] args) {

		WebDriver driver=setUp("chrome", "https://www.demoblaze.com/");
		
		//Identify number of Links present in the page usinf findElement(By) method 
		//Mobile list
		List< WebElement> diviceList=driver.findElements(By.cssSelector("#tbodyid div:last-child>h4 >a"));
		System.out.println("Number Of Devicce is Present :- "+diviceList.size());

		for (int i = 0; i < diviceList.size(); i++) {
			WebElement element = diviceList.get(i);
			String list = element.getAttribute("href");
			System.out.println("Device Name :- " + diviceList.get(i).getText());
		}
		
		//Laptop list
		WebElement laptop=driver.findElement(By.cssSelector(".list-group>#itemc:nth-child(3)"));
		laptop.click();
		List <WebElement> laptopList=driver.findElements(By.cssSelector("#tbodyid div>div>div>h4>a"));
		
		System.out.println("Number of Laptop "+laptopList.size());
		
			
		
	}
	public static WebDriver	setUp(String browserName,String appUrl){
		
		WebDriver driver=null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver;
	}
		
}
