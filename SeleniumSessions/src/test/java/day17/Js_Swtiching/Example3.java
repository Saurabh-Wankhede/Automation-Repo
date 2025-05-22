package day17.Js_Swtiching;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import reusableComponent.SeleniumUtility;

public class Example3 extends SeleniumUtility{

	
	public static void main(String[] args) throws InterruptedException {
		Example3 e1=new Example3();
		e1.testCase1();
	}

	public void testCase1() throws InterruptedException {
		WebDriver driver=setUp("chrome", "https://www.amazon.in/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		
		//scroll till bottom of the page
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy(500,0)");
		
	}
	/*
	 * Manage Update Sites in Eclipse:
Go to Help > Install New Software: Navigate to this menu option in Eclipse. 
Manage Sites: Click on the "Manage Sites" button. 
Add, Remove, or Import: You can add new sites, remove existing ones, or import a bookmarks.xml file (if you've exported your sites). 
Clear Cache: Consider clearing Eclipse's cache by deleting the files and folders in the C:\Users\YourName\eclipse\org.eclipse.equinox.p2 directory (or the corresponding directory in your operating system).
	 */
	 
}