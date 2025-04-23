 package day23.FinalKeyword;


public class Example4 {
	final static int num1=25;
	final double num2=30.56;
	
	public static void main(String[] args) {
	
		System.out.println("Program Starts");
		final int num;
		num=10;
		System.out.println("Initial value of num: "+num);
		System.out.println("Static value of int num1: "+num1);
		Example4 example4=new Example4();
		
		System.out.println("Static value of double num2: "+example4.num2);
		System.out.println("Program Endstatic");
	}
}
/*
final keyword:
	its used to declare variable/method/class as constant
	
final keyword with variables:
	local variable: 
		* we can declare a variable as final and initialize only once before we use them
		* once final variable is initialized its value can;t be change
	global variable:
		* any global variable declared with final keyword will be considered as constant variable
		* its mandatory to initialize final global variable at the time of declaration otherwise you will get compile time error
		*
		* final static global variable:
		* 	in case of final static global variable, you can initialize later also only by using "static block"
		* 
		* final nonstatic global varibale:
		* 	in case of final nonstatic global variable, you can initialize later also by using -
		* 		1. nonstatic block
		* 		2. constructor
*/
