package day39.String;


import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		int age[]=new int[5];
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<age.length;i++) {
			System.out.println("Enter index "+i+" element");
			age[i]=scn.nextInt();
		}
		
		for(int num:age) {
			System.out.println(num);
		}
	}

}
