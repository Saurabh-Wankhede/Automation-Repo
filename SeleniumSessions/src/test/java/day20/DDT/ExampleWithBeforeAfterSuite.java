package day20.DDT;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExampleWithBeforeAfterSuite {

	@Test
	public void testCase1() {
		
		System.out.println("I am TC1 fromExampleWithBeforeAfterSuite ");
		
	}
	@BeforeSuite
	public void preconditionOfSuite() {
		
		System.out.println("********** I am beforeSuite *********");
	}
	
	@AfterSuite
	public void postconditionOfSuite() {
		System.out.println("********** I am afterSuite *********");
	}
	
	
}
