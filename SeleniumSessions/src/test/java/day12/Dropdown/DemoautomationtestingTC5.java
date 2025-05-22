package day12.Dropdown;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoautomationtestingTC5{

	public static void main(String[] args) {

		WebDriver driver = setUp("chrome", "https://demo.automationtesting.in/Register.html");
	
//		yearValidation(driver);
//		monthValidation(driver);
		dayValidation(driver);

	}

	public static WebDriver setUp(String browserName, String appUrl) {
		
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;

	}
	
//Create method For Year Validation
	public static void yearValidation(WebDriver driver) {


		WebElement year = driver.findElement(By.cssSelector("#yearbox"));

		// Createe instance of select class
		Select select = new Select(year);

		System.out.println("is dropdown allow multiple selection :- " + select.isMultiple());
		System.out.println("Default value :- " + select.getFirstSelectedOption().getText());

		List<WebElement> yearList = select.getOptions();
		System.out.println("Count of Years is  :- " + yearList.size());
			
		List<Integer> actualList =new ArrayList<Integer>();
		for (int i = 1; i < yearList.size(); i++) {
			actualList.add(Integer.parseInt(yearList.get(i).getText()));
		}
		List<Integer> excpectedList =new ArrayList<Integer>(actualList);
		Collections.sort(excpectedList);
		
		System.out.println("are years getting displayed as expected? :- "+excpectedList.equals(actualList));
		
		
		for (int i = 1; i < yearList.size(); i++) {

			System.out.println("Year : " + yearList.get(i).getText());
		}

		System.out.println("************************************************ ");
		select.selectByVisibleText("2000");
		System.out.println("value After selection is :- " + select.getFirstSelectedOption().getText());
		System.out.println("---------------------------------------------------------------");

	}
	
//------------------------------------------------------------------------------------------
	
	//Create method For Month Validation
	 	public static void monthValidation(WebDriver driver) {


		WebElement month = driver.findElement(By.cssSelector("select[placeholder='Month']"));

		// Create instance of select class
		Select select = new Select(month);

		System.out.println("is dropdown allow multiple selection :- " + select.isMultiple());
		System.out.println("Default value :- " + select.getFirstSelectedOption().getText());

		List<WebElement> monthList = select.getOptions();
		System.out.println("Count of Months is  :- " + monthList.size());

		String actualMonthList="";
		
		for(int i=1;i<monthList.size();i++) {
			
			if (i<monthList.size()-1) {
				
				actualMonthList=actualMonthList+monthList.get(i).getText()+",";
			}else {
				actualMonthList=actualMonthList+monthList.get(i).getText();
			}
		}
		
		String expectedMonthList="January,February,March,April,May,June,July,August,September,October,November,December";
	
		System.out.println("are years getting displayed as expected? :- "+actualMonthList.equals(expectedMonthList));
		
		
		
		for (int i = 1; i < monthList.size(); i++) {

			System.out.println("Month : " + monthList.get(i).getText());
		}

		System.out.println("************************************************ ");
		select.selectByIndex(2);
		System.out.println("value After selection is :- " + select.getFirstSelectedOption().getText());

		System.out.println("---------------------------------------------------------------");
	}

//------------------------------------------------------------------------------------------
		
		//Create method For Day Validation
	 	public static void dayValidation(WebDriver driver) {

		

		WebElement day = driver.findElement(By.id("daybox"));

		// Create instance of select class
		Select select = new Select(day);

		System.out.println("is dropdown allow multiple selection :- " + select.isMultiple());
		System.out.println("Default value :- " + select.getFirstSelectedOption().getText());

		List<WebElement> dayList = select.getOptions();
		System.out.println("Count of Months is  :- " + dayList.size());

		List<Integer> actualList =new ArrayList<Integer>();
		for (int i = 1; i < dayList.size(); i++) {
			actualList.add(Integer.parseInt(dayList.get(i).getText()));
		}
		List<Integer> excpectedList =new ArrayList<Integer>(actualList);
		Collections.sort(excpectedList);
		
		System.out.println("are years getting displayed as expected? :- "+excpectedList.equals(actualList));
		
		
		
		for (int i = 1; i < dayList.size(); i++) {

			System.out.println("Day : " + dayList.get(i).getText());
		}

		System.out.println("************************************************ ");
		select.selectByIndex(4);
//		select.selectByVisibleText("4");
		System.out.println("value After selection is :- " + select.getFirstSelectedOption().getText());
		System.out.println("---------------------------------------------------------------");

	}

}
/*
 * TC5
https://demo.automationtesting.in/Register.html

Year, month & day
	validate
		multipleselect
		default value
		value after selection
		count
		options
		year - options in ascending order
		month- option in sequence
		day- options in ascending order
*/