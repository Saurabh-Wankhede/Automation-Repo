package day0.Assignment;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		String actualTitle=driver.getTitle();
		
		//Count Title charcter
		String [] arr=actualTitle.split(" ");
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr[i].length();j++) {
				count++;
			}
			sum+=count;	
		}
		
		System.out.println("Page Title is : "+actualTitle);
		System.out.println("Character count of title is :- "+sum);
		
		System.out.println("Vaildate application title is :- "+actualTitle.equals(expectedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page URL is :- "+pageUrl);
		System.out.println("count of URL is :- "+pageUrl.length());
		
		System.out.println("Page Source code charcter count is :- "+driver.getPageSource().length());
		
		driver.close();	
	}
}
/*
WASS to perform below operation 
1. amazon
2. flipkart
3. Myntra
	- open any browser
	- enter application url
	- get title, print it and count character count as well
	- validate application title
	- get url, print it and count character count as well
	- get source code and print char count
	- close browser
*/