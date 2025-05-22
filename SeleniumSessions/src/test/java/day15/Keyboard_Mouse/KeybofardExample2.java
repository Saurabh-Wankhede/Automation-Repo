package day15.Keyboard_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class KeybofardExample2 {

	
	public static void main(String[] args) {
		
		GenericFunctions functions=new GenericFunctions();
		
		WebDriver driver=functions.setUp("chrome", "https://online.actitime.com/dec23/login.do");
		
		//type username
		driver.findElement(By.id("username")).sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"),
																Keys.chord(Keys.CONTROL,"c"));
		
		
		//type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
				
		
	}
}
