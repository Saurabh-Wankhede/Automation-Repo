package day41.Exception;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int num1=10,num2=0,res;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		try {
			System.out.println("Welcome to try brlock ");
			res=num1/num2;//abnormal statement
			System.out.println("Result: "+res);
			System.out.println("Good Bye try block");
		} catch (ArithmeticException e) {

			System.out.println("Welcome to Catch brlock ");
			//System.out.println("Exception type and error msg :"+e );
			//System.out.println("Error msg :"+e.getMessage() );
			e.printStackTrace();//print actual exception
			System.out.println("Exception handled....");
		}
		System.out.println("Program End");
	}
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day20.exceptionhandling.Example1.main(Example1.java:10)

Exception Type: java.lang.ArithmeticException
Error msg: by zero
Details: day20.exceptionhandling.Example1.main(Example1.java:10)
*/
