package day15.Keyboard_Mouse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusableComponent.GenericFunctions;
import reusableComponent.SeleniumUtility;

public class CrickInfoTC1 {

	public static void main(String[] args) {
		
		
		GenericFunctions g1=new GenericFunctions();
		WebDriver driver=g1.setUp("chrome","https://www.espncricinfo.com/\r\n");
		
		//create an instance of actions class and pass driver instance to its constructor
		Actions action=new Actions(driver);
		
		
		List<WebElement> mainMenuList=driver.findElements(By.xpath("//section[@id='main-container']/div[3]//div[2]/div/div/a"));
		
		for(int i=0;i<mainMenuList.size();i++) {
			
			System.out.println("list menu :- "+mainMenuList.get(i).getText());
		}
		
		SeleniumUtility sel=new SeleniumUtility();
		for(int i=0;i<mainMenuList.size();i++) {
			action.moveToElement(mainMenuList.get(i)).perform();
			g1.setSleep(1000);
		}
		
}
}
