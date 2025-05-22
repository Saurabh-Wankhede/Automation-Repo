package day17.Js_Swtiching;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.SeleniumUtility;

public class HerokuappTC1 extends SeleniumUtility {

	public static void main(String[] args) {
		
		HerokuappTC1 herokuappTC1=new HerokuappTC1();
		
//		herokuappTC1.alertPopup();
		herokuappTC1.ConfirmPopup();
//		herokuappTC1.PromptPopup();
	
		
	}
	public void alertPopup() {
	
		WebDriver driver=setUp("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		
		clickOnElement(driver.findElement(By.xpath("//button[text()='Click for JS Alert']")));
		
		System.out.println("Alert msg - "+driver.switchTo().alert().getText());
		
		
	}
	
	public void ConfirmPopup() {
		
		WebDriver driver=setUp("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		
		clickOnElement(driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")));
		
		System.out.println("Alert msg - "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
//		driver.switchTo().alert().dismiss();
		
		WebElement result=driver.findElement(By.id("#result"));
		
		System.out.println("You Click on  "+result.getText());
//		System.out.println("You Click on  "+getTextFromElement(driver.findElement(By.id("#result"))));		
		
	}
	
	public void PromptPopup() {
		
		WebDriver driver=setUp("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		
		clickOnElement(driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")));
		
		System.out.println("Alert msg is  :- "+driver.switchTo().alert().getText());

		driver.switchTo().alert().sendKeys("Saurabh");
		driver.switchTo().alert().accept();
		
		
		System.out.println("Alret select Click on  "+getTextFromElement(driver.findElement(By.id("#result"))));		
		
	}
	
}
/*
TC1: https://the-internet.herokuapp.com/javascript_alerts
Handle all JAVA Script popups


*/