package day11.VariableTypes1;

public class Example7 
{
	double result;
	int num1,num2;//non-static global variable
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Example7 ref=new Example7();//copy of non-static member will be loaded here
		System.out.println("ref, NSGV result initial value: "+ref.result);
		System.out.println("ref, Number1 is: "+ref.num1);
		System.out.println("ref, Number2 is: "+ref.num2);
		ref.num1=10;
		ref.num2=20;
		System.out.println("ref, Updated Number1 is: "+ref.num1);
		System.out.println("ref, Updated Number2 is: "+ref.num2);
		ref.result=ref.num1+ref.num2;
		System.out.println("ref, NSGV result, after additiona value: "+ref.result);
		
		Example7 ref2=new Example7();
		System.out.println("ref2, NSGV result initial value: "+ref2.result);
		System.out.println("ref2, Number1 is: "+ref2.num1);
		System.out.println("ref2, Number2 is: "+ref2.num2);
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
	b. non-static global variable: any variable declared without static keyword known as non-static
							   global variable
	   * before accessing there variables we need to load them into the memory by creating an
	   	 instance or object of a class
	   * Instance/Object: is a real world entity that has its own behavior and state
	   * Syntax to create an object
	   			classname referenaceVariable;//Instance/object declaration
	   			referenaceVariable=new classname();//initialization
	   					//or
	   			classname referenaceVariable=new classname();
	   * to access these variables we can use any one way
		 1. directly from another non-static method
		 	System.out.println(result);
		 2. using classname(Standard)
		 	System.out.println(referenaceVariable.result);
	   * for non-static we can have multiple copies based on object creation
			
*/