package day22.ConstrutorUsingThis;


public class Example7 {
	int num;
	Example7(){
		this(45,85.56f);
		System.out.println("I am zero-param cons...");
	}
	Example7(int num){
		this();
		System.out.println("I am int-param cons...");
	}
	Example7(int num,float x){
		System.out.println("I am int-float-param cons...");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example7 ref1=new Example7(25);
		System.out.println("Program ends");
	}	
	

}
/*
output:
	Program starts
	int-float-param
	zero-param
	int-param
	Program ends
	
	
this() statement:
	current class instance
	its used to call another constructor of current class based on the parameter
	it should be the 1st statement inside the constructor body
	any constructor can have only one this() max
*/
