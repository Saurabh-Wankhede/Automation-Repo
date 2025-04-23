package day41.Exception;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1 = 25, num2 = 0, res;
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		try {
			System.out.println("Welcome to try block");
			res = num1 / num2;// abnormal statement
			System.out.println("Result: " + res);
			System.out.println("Good Bye try block");
		} catch (ArrayIndexOutOfBoundsException e) {// catch block will not able to handle exception coming from try
													// block hence program execution will be terminated
			System.out.println("Welcome to catch block");
			
//			 System.out.println("Exception type and error msg: "+e);
//			 System.out.println("Error msg: "+e.getMessage());
			
			e.printStackTrace();// print actual exception with details
			System.out.println("Exception handled....");
		}
		System.out.println("Program Ends");
	}
}
/*
 * 1. if exception comes in try block dn catch block will be executed 
 * 2. if no exception in try block dn catch block won;t be executed 
 * 3. if exception comes in try block dn catch block doesn;t handle it, 
 * it will terminate program execution
 */
