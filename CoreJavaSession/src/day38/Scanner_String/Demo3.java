package day38.Scanner_String;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		char grade;
		double salary;
		String name;
		boolean status;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your name :  ");
		name=scanner.next();
		
		System.out.println("Please Enter your Grade : ");
		grade=scanner.next().charAt(0);
		
		System.out.println("Please Enter your Salary ");
		salary=scanner.nextDouble();
		
		System.out.println("Please Enter your Status ");
		status=scanner.nextBoolean();
		
		System.out.println("**************************************");
		
		System.out.println(name+"\n"+salary+"\n"+grade+"\n"+status);
		
		
		System.out.println("Program END");
	}
}
