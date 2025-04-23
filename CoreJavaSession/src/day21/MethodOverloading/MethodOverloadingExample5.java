package day21.MethodOverloading;


public class MethodOverloadingExample5 {

	public static void main(String[] args) {
		addition();	
		System.out.println("Return value of this method is = "+addition());	
		addition(25,36);
	}
	
	static double addition(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		return res;
	}
	static int addition() {
		int num1=25,num2=30;
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		return res;
	}
	
//	static int addition(int num1, float num2) {
//		double res=num1+num2;
//		System.out.println("Number1: "+num1);
//		System.out.println("Number2: "+num2);
//		return res;//compile time error as we can't store higher data type value into lower datatype
//	}
}
/*
Method Overloading:
	when a method declared more than once in a call dn that method will be known as overloaded method
	for overloading, method should have-
		1. number of parameter diff //or
		2. type of parameter diff //or
		3. position of parameter diff //or
Adv:
	we can perform same operation with diff type values or with diff logic

can we overload a method by just changing its return type? NO
*/
