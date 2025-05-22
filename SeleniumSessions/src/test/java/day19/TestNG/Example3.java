package day19.TestNG;

import org.testng.annotations.Test;

public class Example3 {

	@Test(priority = 1, enabled = true, description = "Used alreday have vaild test data for login", timeOut = 2000)
	public void testLoginOrangeHrm() throws InterruptedException {

		System.out.println("Hello Login");
		Thread.sleep(1000);

	}

	@Test(priority = 2, enabled = false, invocationCount = 2)
	public void testPIMCreationOrangeHrm() {

		System.out.println("Hellow PIMCreationCount");
		int num = 10 / 0;
	}

	@Test(priority=5,enabled=true)
	public void testLogoutOrangeHrm() {
		System.out.println("Hello Logout");
	}	
	
	@Test(priority = 3, enabled = true, expectedExceptions = ArithmeticException.class)
	public void testPIMUpdateOrangeHrm() {
		System.out.println("Hellow PIMCreationCount");
		int num = 10 / 0;
	}

	@Test(priority = 4, enabled = true)
	public void testPIMDeleteOrangeHrm() {
		
		System.out.println("Hello PIMDelete");
	}

	
}
