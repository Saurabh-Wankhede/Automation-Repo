package day11.VariableTypes1;


public class Example4 
{
	static double result;
	static int num1,num2;//static global variable
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		System.out.println("SGV result initial value: "+Example4.result);
		System.out.println("Number1 is: "+Example4.num1);
		System.out.println("Number2 is: "+Example4.num2);
		Example4.num1=10;
		Example4.num2=20;
		System.out.println("Updated Number1 is: "+Example4.num1);
		System.out.println("Updated Number2 is: "+Example4.num2);
		Example4.result=Example4.num1+Example4.num2;
		System.out.println("SGV result, after additiona value: "+Example4.result);
		System.out.println("Program Ends");
	}
}
/*
Global Variable: a variable declared outside method body but present in class body
				 known as global variable.
- these variable can be access from anywhere
- these variables will get separate memory allocation
- these variables will get default value based on there datatype if we have not initialized
  but used.
  	byte,short,int,long default value is '0'
  	float, double default value is '0.0'
  	boolean default value is false
  	char default value is blank space
- these variable are also two types:
	a. static global variable: any variable declared with static keyword known as static
							   global variable
	   * thats why we can call them as class variable because they are getting loaded into the 
	   	 memory at compile time when .class file is getting generated
	   * to access these variables we can use any one way
		 1. directly from another static method
		 	System.out.println(result);
		 2. using classname(Standard)
		 	System.out.println(Example2.result);
			
*/