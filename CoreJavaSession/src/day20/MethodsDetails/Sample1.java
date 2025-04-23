package day20.MethodsDetails;

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.println("Program Start");
		
//		display Course content
		Sample1.displayAutomationCourseContent();
		System.out.println("**************************************");
		Sample1.getIntrest();
		System.out.println("**************************************");
		Sample1.getIntrest1(650000,7,9.5);
		System.out.println("**************************************");
		Sample1.getIntrest1(910000, 5, 5.5);
		System.out.println("**************************************");
		
//		System.out.println(Sample1.getIntrest2(50000, 5, 6.5));
//					OR
		double intrest=Sample1.getIntrest2(688888, 45, 5.5);
		System.out.println(intrest);
		System.out.println("Program End");
	}

	public static void displayAutomationCourseContent() {
		System.out.println("Welecom to Automationn Session Present By Acceleration team");
		System.out.println("You are learing CORE JAVA");
		System.out.println("Will Start Selenium after CORE JAVA");
	}
	public static double getIntrest2(int p,int t,double r) {
		
		double res=(p*r*t)/100;
		System.out.println("Principle Amount is :- "+p);
		System.out.println("Intrest On Principal Amount is :- "+res);
		System.out.println("Final Amount with intrest :- "+(p+res));
		return res;
	}
	public static void getIntrest1(int p,int t,double r) {
		
		double res;
		res=(p*r*t)/100;
		System.out.println("Principle Amount is :- "+p);
		System.out.println("Intrest On Principal Amount is :- "+res);
		System.out.println("Final Amount with intrest :- "+(p+res));
}

	public static void getIntrest() {
		int p=55000,t=5;
		double r=8.5,res;
		res=(p*r*t)/100;
		System.out.println("Principle Amount is :- "+p);
		System.out.println("Intrest On Principal Amount is :- "+res);
		System.out.println("Final Amount with intrest :- "+(p+res));
}
}
/*
WAP    
			to display the Automation Course Content 
			to Caalculate simple intresr and print final amount 
			to check fiven number in even or odd
			to check given number is prime or nnot 
			to check get reverse number of given number
  */
