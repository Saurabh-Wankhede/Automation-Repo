package day36.Array_Method;

import java.util.Arrays;

public class M_Array5 {

	public static void main(String[] args) {
		// Declaring a source array
		char[] orgArray = { 'a', 'c', 'b', 'e', 'd' };
		// dupilcate Array
		char[] cloneArray = orgArray.clone();

		// Sorting copyFrom in ascending order
		Arrays.sort(orgArray);// a,b,c,d,e,
		System.out.println("After Sorting original arrya : ");
		
		for (char c : orgArray) {
			System.out.print(c+" ");
		}
		
		System.out.println("\nCloned array: ");
		for(char c: cloneArray) {
			System.out.print(c +" ");
		}
		System.out.println("\n+++++++++++++++++++++++++++++++");
		
		boolean result = Arrays.equals(cloneArray, orgArray);
		System.out.println(result);
		
		System.out.println("************************");
		//Print in reverse order
		for (int i = cloneArray.length-1; i >= 0; i--) {
			System.out.print(cloneArray[i]+" ");
			
		}
		System.out.println("\n###########################");
		for(int i=orgArray.length-1;i>=0;i--) {
			System.out.print(orgArray[i]+" ");
		}
	}

}
