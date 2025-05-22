package day0.Assignment;

import java.util.Arrays;
import java.util.Iterator;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver( );
		
		//Enter URL
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjw4v6-BhDuARIsALprm30UNi35TlQMbj9kOIth4JWZz-X-o-JFQ6QYNLiI958wWcu1K3BPCMsaAs4VEALw_wcB");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String [] arr=actualTitle.split(" ");
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr[i].length();j++) {
				count++;
			}
			sum+=count;	
		}
		System.out.println("Count of Title charcter is : "+sum);
		
		System.out.println("validate application title is : "+actualTitle.equals(expectedTitle));
		
		System.out.println("Page Url Charcter count is : "+driver.getCurrentUrl().length());
	
		System.out.println("Source code charcter count is : "+driver.getPageSource().length());
			
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