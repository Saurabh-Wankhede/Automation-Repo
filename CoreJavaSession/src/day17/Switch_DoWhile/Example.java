package day17.Switch_DoWhile;

public class Example {

	public static void main(String[] args) {

		System.out.println("Program Starts");
		int num = 5;
		do {
			System.out.println("Number is: " + num);
		} while (num >= 10);
		
		System.out.println("****************************");
		
		do {
			System.out.println("Number is: " + num);
			num--;
		} while (num >= 1);
		
		System.out.println("Program Ends");
	}
}
/*
 * do while: compare to while loop this will be executed at least once,
 * irrespective of condition is true/false
 */
