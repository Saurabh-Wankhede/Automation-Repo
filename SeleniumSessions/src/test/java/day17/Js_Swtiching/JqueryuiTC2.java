package day17.Js_Swtiching;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.SeleniumUtility;

public class JqueryuiTC2  extends SeleniumUtility{

	public static void main(String[] args) {
		
		JqueryuiTC2 jq=new JqueryuiTC2();
		jq.sorting();
	}
	
	public void sorting() {
			
		WebDriver driver=setUp("chrome", "https://jqueryui.com");
		
		clickOnElement(driver.findElement(By.xpath("//a[text()='Sortable']")));
		
		driver.switchTo().frame(0);
			
		List<WebElement> itemList=driver.findElements(By.cssSelector("ul#sortable>li"));
		
		for(int i=0; i<itemList.size()-1;i++) {
			
			itemList=driver.findElements(By.cssSelector("ul#sortable>li"));
			WebElement src=itemList.get(itemList.size()-1);
			WebElement target=itemList.get(i);
			action.dragAndDrop(src, target).build().perform();
			setSleepTime(1000);
			
		}
		
		
		
	}
	
}

/*
 
TC2: Open browser and enter URL as https://jqueryui.com
click on sortable 
sort the element from 7 to 1

*/