package day12.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GsmarenaTC2 {

	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome", "https://www.gsmarena.com/");
		
	List<WebElement> brandNameList=	driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		
	System.out.println("Brand Name List Size "+brandNameList.size());
	
	System.out.println("Brands Name Is :- ");
	for(int i=0;i<brandNameList.size();i++) {
		
		System.out.println(brandNameList.get(i).getText());
	}
		
	System.out.println("**************************************");
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
TC2:
- Write a script to print brand names present inside phone finder 
- https://www.gsmarena.com/


*/