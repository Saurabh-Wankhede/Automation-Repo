package day35.Array;

public class Example1 {

	public static void main(String[] args) {
		
		//10,20,30,40,50
		int a=10,b=20,c=30,d=40,e=50;
		
//		int []num;
//		num=new int[5];
			//OR
		int[] num=new int[5];
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
//	System.out.println(num[5]);//Run time error array out of bound index 
		
		System.out.println("Toala array element count "+num.length);
		num[0]=10;
		num[1]=70;
		num[2]=240;
		num[3]=350;
		num[4]=100;
		System.out.println("****Printing array element one by one using simple for loop****");
		
		for (int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("****Printing array element one by one using simple for-each loop****");
		/*
		 * for (LHS :RHS)
		 * {
		 * 
		 * }
		 * where : 
		 * 			LHS type should be same as RHS Type (arrayname)
		 */
		for(int x:num) {
			System.out.println(x);
		}
		
	}

}
