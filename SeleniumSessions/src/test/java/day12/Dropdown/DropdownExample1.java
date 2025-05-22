package day12.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample1 {

	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		//identify dropdown
		WebElement dropdown=driver.findElement(By.id("Skills"));
		
		//Create instance of select class 
		Select select=new Select(dropdown);
		
		System.out.println("is dropdown allow multiple selection ? "+select.isMultiple());
		
		System.out.println("Default value :- "+select.getFirstSelectedOption().getText());
		
		List<WebElement> optionList=select.getOptions();
		
		System.out.println("List Option Count :- "+optionList.size());
		
		for(int i=0;i<optionList.size();i++) {
			
			System.out.println(optionList.get(i).getText());
		}
		
		/*to select option we can use 
		- selectByVisibleText("");
		- selectByValue("");
		- selectByIndex("")
		*/
		
//		select.selectByIndex(2);// OR
//		select.selectByValue("Adobe Photoshop")//OR
		select.selectByVisibleText("Adobe Photoshop");
		
		System.out.println("is Default selection changed to 'Adobe Photoshop'? : "+select.getFirstSelectedOption().getText());
		
		
		
	}

	public static WebDriver setUp(String browserName,String appUrl) {
		
		WebDriver driver=null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver;
	}

}
