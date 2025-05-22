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

public class DropdownExample2 {

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

		WebDriver driver = setUp("chrome", "https://omayo.blogspot.com/");

		// identify dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));

		// Create instance of Select class
		Select select = new Select(dropdown);

		System.out.println("is dropdown allow multipule selection ? :-" + select.isMultiple());

		List<WebElement> optionList = select.getOptions();
		System.out.println("List option count :- " + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {

			System.out.println(optionList.get(i).getText());
		}

		/*
		 * to select option we can use - selectByVisibleText(""); - selectByValue(""); -
		 * selectByIndex("")
		 */
		System.out.println("*****************");
//		select.selectByIndex(2); // or
//		select.selectByValue("Adobe Photoshop");// or
//		select.selectByVisibleText("Volvo");
//		select.selectByVisibleText("Hyundai");

		System.out.println("Number of option selected :- "+select.getAllSelectedOptions().size());
		
		/*to deselect option we can use 
		- deselectByVisibleText("");
		- deselectByValue("");
		- deselectByIndex("");
		- deselectAll();
		*/
		select.deselectAll();
		
	}
}
