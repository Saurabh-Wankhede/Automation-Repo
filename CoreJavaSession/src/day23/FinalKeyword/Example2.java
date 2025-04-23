package day23.FinalKeyword;


public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		final int num=10;
		System.out.println("Initial value of num: "+num);
//		num=20; // you will be getting compile time error as variable is declared as final in line number 7
//		System.out.println("After 1st update, value of num: "+num);
//		num=50;// you will be getting compile time error as variable is declared as final in line number 7
//		System.out.println("After 2nd update, value of num: "+num);
		System.out.println("Program Ends");
	}
}
/*
final keyword:
	its used to declare variable/method/class as constant
	
final keyword with variables:
	local variable: 
		* we can declare a variable as final and initialize only once before we use them
		* once final variable is initialized its value can;t be change

*/
