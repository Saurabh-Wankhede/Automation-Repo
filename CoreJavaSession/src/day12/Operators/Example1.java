package day12.Operators;


public class Example1 {

	public static void main(String[] args) {
		int num1=15,num2=5;
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		
		boolean result=(num1==num2);
		
		System.out.println("result : "+result);
		
					//		OR
		System.out.println("result :- "+(num1==num2));
		
		System.out.println("Result :- "+(num1!=num2));
		System.out.println("Result :- "+(num1>num2));
		System.out.println("Result :- "+(num1<num2));
		System.out.println("Result :- "+(num1>=num2));
		System.out.println("Result :- "+(num1<=num2));
	}

}