package day21.MethodOverloading;

public class MethodOverloadingExample2 {


		public static void main(String[] args) {
			MethodOverloadingExample2 ref=new MethodOverloadingExample2();
			ref.addition();		
			ref.addition(75.36f,25);
		}
		
		void addition() {
			int num1=10,num2=20,res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}
		void addition(int num1, int num2) {
			int res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}
		void addition(float num1, int num2) {
			double res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}
		void addition(int num1, float num2) {
			double res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}
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

	*/
