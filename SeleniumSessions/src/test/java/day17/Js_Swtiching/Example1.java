package day17.Js_Swtiching;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.SeleniumUtility;

public class Example1 extends SeleniumUtility{

	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.testCase1();
		e1.testCase2();
	}
	
	public void testCase1() {
		
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		 
		//identify Login Button using Selenium 
		WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
		
		//Convert WebDriver instance into javaScriptexecutor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//write a code to perform click operation
		js.executeScript("arguments[0].click();", element);
		
		
		
	}
	public void testCase2() {
	
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		//Convert WebDriver  intsnce to javaScriptexecutor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Write a code to identify and perform click oprtation
		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
		
	}
	
}
