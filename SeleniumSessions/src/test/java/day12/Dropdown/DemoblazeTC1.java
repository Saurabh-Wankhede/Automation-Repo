package day12.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoblazeTC1 {

	
	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome", "https://www.demoblaze.com/");
		
		//identify all menu present in menu bar in the page using findElement(By) method
				List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));

				List<WebElement> deviceListPrice=driver.findElements(By.cssSelector("#tbodyid div div div h5"));
				
				System.out.println("Number of deviceList: "+deviceList.size());
				System.out.println("Number of device Price List : "+deviceListPrice.size());
				
				for(int i=0;i<deviceList.size();i++) {
//					System.out.println(i+ " deviceList: "+deviceName);
						//or
					System.out.println("Device Name:- "+deviceList.get(i).getText()+" Price :- "+deviceListPrice.get(i).getText());
				}		
		
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
/*
TC1:
- Write a script to print device name and price from the application 
https://www.demoblaze.com/
*/