package day38.Scanner_String;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter number :");
		int num=scanner.nextInt();
		
		System.out.println("is given number even: "+checkEvenNumber(num));
		
		System.out.println("Program End");
	}
	public static boolean checkEvenNumber(int num) {
		if (num %2==0) {
			return true;
		}
		return false;
	}
}
