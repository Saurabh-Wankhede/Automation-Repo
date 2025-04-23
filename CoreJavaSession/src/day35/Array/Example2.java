package day35.Array;

public class Example2 {

	public static void main(String[] args) {
		
		int[]num= {100,200,300,400,500};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		//System.out.println(num[5]);//runtime error - array index out of bond
		System.out.println("Total array element count: "+num.length);
		
		num[0]=10;
		num[1]=350;
		num[2]=101;
		num[3]=210;
		num[4]=108;
		System.out.println("**** Printing array element ine by one using simple for loop****");
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("**** Printing array element one by one using simple for-each loop****");
		/*
		 * for(LHS:RHS)
		 * {
		 * 
		 * }
		 * where :
		 * 			LHS type should be same as RHS type (array name)
		 */
		for(int x:num) {
			System.out.println(x);
		}
		
	}
}
