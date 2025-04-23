package day12.Operators;

public class Example4 {

	public static void main(String[] args) {
		int num1=10,num2,num3;
		num2=++num1;//Increment - pre (num1=num1+1)
	
		System.out.println("number1: "+num1);//11
		
		System.out.println("number2: "+num2);//11
		
		num3=num1++;//Increment - post (num1=num1+1)
		
		System.out.println("number1: "+num1);//12
		
		System.out.println("number3: "+num3);//11

	}

}