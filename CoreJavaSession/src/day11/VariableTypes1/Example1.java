package day11.VariableTypes1;



public class Example1 
{
	//global variable
	int age;//non-static global variable
	static double salary;//static global variable
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int num1,num2,res;//local variable
		//System.out.println("Number1 is: "+num1);//compile time error as variable is not initialized
		System.out.println("Program Ends");
	}
}
/*
Variable types:
	1. Local variable: a variable declared with in method body is known as local variable
		- these variables are accessible with in method body only(limited to method body)
		- it won;t get separate memory for storage
		- these variables should be initialize before we use them otherwise you will get compile time error
		- this means these variables won't get any default value
		- static keyword can't be used with local variable
		
	2. Global Variable: a variable declared outside method body but present in class body
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
			b. non-static global variable: any variable declared without static keyword known as non-static
									   global variable
*/