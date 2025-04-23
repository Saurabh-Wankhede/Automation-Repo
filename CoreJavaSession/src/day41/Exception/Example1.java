package day41.Exception;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int num1=10,num2=0,res;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		res=num1/num2;//abnormal statement
		System.out.println("Result: "+res);
		System.out.println("Program End");
		
	}
}
/*
 *Exception in threadd "main" java.lang.ArithticException : /by Zero
 *at day41.Exception.Example1.main(Example1.java:11)
 *
 *Exception Type : java.lang.ArithmeticException 
 *Error msg : by Zero
 *Details : day41.Exception.Example1.main(Example1.java:11)
 *
 */
