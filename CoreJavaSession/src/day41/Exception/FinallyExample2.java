package day41.Exception;

public class FinallyExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1 = 10, num2 = 0, res;
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		try {
			System.out.println("Welcome to try block");
			res = num1 / num2;// abnormal statement
			System.out.println("Result: " + res);
			System.out.println("Good Bye try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Welcome to catch block");
			e.printStackTrace();// print actual exception with details
			System.out.println("Exception handled....");
		} finally {
			System.out.println("Hi, I am finally block. I will be always executed...");
		}
		System.out.println("Program Ends");
	}
}
/*
finally execution:
	1. try block throws exception and catch block handle it
	2. try block throws exception and catch block doesn;t handle it
	3. no exception in try block
*/