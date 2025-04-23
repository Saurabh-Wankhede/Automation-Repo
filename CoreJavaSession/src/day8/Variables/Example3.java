package day8.Variables;

public class Example3 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		// variable declaration
		
		byte variable1;
		short variable2;
		int variable3;
		long variable4;
		float variable5;
		double variable6;
		char variable7;
		boolean variable8;
		
		// variable initialization
		
		variable1 = 10;// 20|-9|50|-34
		variable2 = 20;// 89|-9|50|-34
		variable3 = 30;// 20|-9|50|-34
		variable4 = 40;// 20|-9|50|-34 | 76l
		variable5 = 50.10f;// 20|-9|50|-34l
		variable6 = 60.13;// 20|-9|50|-34 | 10.23f | 23.45d
		variable7 = 'a';// 'A' | 'z' | 'd' | '+'
		variable8 = true;// false
		
		System.out.println("variable1=" + variable1);// variable1=10
		// print remaining variable in the same format
		
		System.out.println("GoodMoring "+10 );
		
		System.out.println("GoodMoring "+(10+70) );
		
		System.out.println("GoodMoring "+10+variable6 );
		
		System.out.println("total of variable1 and variable2 is = "+variable1 + variable2);

		System.out.println("total of variable1 and variable2 is = "+(variable1 + variable2));

		System.out.println("Program Ends");
	}
}
/*
 * Variable: datatype variablename; variablename = value; //or datatype
 * variablename=value;
 * 
 * +:Addition number1+number2=number3 10+20=30 +:Concatenation
 * 
 * "String"+number="Stringnumber" "Hello"+10=Hello10
 * 
 * "hi"+20+30="hi20"+30="hi2030"
 * 
 * "Good"+50+60+"Morning"+(50+90)=Good5060Morning140
 * 
 * 50+60+"Morning"+(50+90)=110+"Morning"+140=110Morning140
 * 
 * 
 * 
 * 
 */
