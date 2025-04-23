package day12.Operators;

public class Example5 {

	public static void main(String[] args) {
		int num1=10,num2,num3;

		num2=num1--;//Decrement-post--> 1st use the value dn perform operation
		System.out.println("number1: "+num1);//9
		System.out.println("number2: "+num2);//10
		
		num3=--num1;//Decrement-pre--> 1st perform operation dn use value
		System.out.println("number1: "+num1);//8
		System.out.println("number3: "+num3);//8
	}
}