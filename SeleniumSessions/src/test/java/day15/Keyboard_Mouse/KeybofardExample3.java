package day15.Keyboard_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class KeybofardExample3 {

	public static void main(String[] args) {
		

		GenericFunctions functions=new GenericFunctions();
		
		WebDriver driver=functions.setUp("chrome", "https://www.amazon.in/");
		
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		functions.setSleep(1000);
		
				//or bottom of the page
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		functions.setSleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.HOME);
	
		
	}
}
