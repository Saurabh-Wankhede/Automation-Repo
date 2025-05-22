package day10.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmTc3 {

	public static WebDriver setUp(String browserName, String appUrl) {

		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
	}

	public static void main(String[] args) {

		WebDriver driver = setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement loginButton=driver.findElement(By.cssSelector(".orangehrm-login-button"));
		
		System.out.println("Login Button get Text : "+loginButton.getText());
		System.out.println("Login Button get Font- BG Color : "+loginButton.getCssValue("background-color"));
		System.out.println("Login Button get Font-Color : "+loginButton.getCssValue("color"));
		System.out.println("Login Button get Font-Size : "+loginButton.getCssValue("font-size"));
		System.out.println("Login Button get Font-Family : "+loginButton.getCssValue("font-family"));
		
		System.out.println("****************************************************************");
		
		Point loginButtonLocation=loginButton.getLocation();
			
		System.out.println("Login Button X Cords is : "+loginButtonLocation.getX());
		System.out.println("Login Button Y Cords is : "+loginButtonLocation.getY());
		
	}

}
/*
Using the CssSelector :- 

WASS to perform below operation 
3. https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	validate 
			Remember me text is getting displayed next to checkbox
			Login button name
			login button font size
			login button font family
			login button color
	
*/