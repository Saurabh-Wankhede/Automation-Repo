package day12.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) {

		WebDriver driver=setUp("chrome", "https://www.demoblaze.com/");
		
		//Identify number of Links present in the page usinf findElement(By) method
		List< WebElement> links=driver.findElements(By.tagName("a"));
		
			for (int i = 0; i < links.size(); i++) {
				WebElement element=links.get(i);
				String href=element.getAttribute("href");
				
//				System.out.println(i+ " Href :- "+href);
							//OR
//				System.out.println("Href :- "+links.get(i).getAttribute("href"));
			}
			
		
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
