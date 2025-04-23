package day36.Array_Method;

import java.util.Arrays;

public class M_Array4 {

	public static void main(String[] args) {

		int array[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : array) {
			System.out.println(i + " ");// 33,3,4,5
		}
		System.out.println("\nPrinting Clone of the array:");
		int cloneArray[] = array.clone();
		for (int i : cloneArray) {

			System.out.println(i + " ");
		}
		System.out.println("\nAre both equal arr & carr ?");

		System.out.println("array & cloneArray content validation : " + Arrays.equals(array, cloneArray));

		System.out.println("******************************");

		int newCopiedArray[] = Arrays.copyOf(array, array.length);
		for (int i : newCopiedArray) {
			System.out.print(i + " ");
		}
		System.out.println("\n******************************");

		int newCopiedRangeArray[] = Arrays.copyOfRange(array, 1, 5);
		for (int i : newCopiedArray) {
			System.out.print(i + " ");
		}
		System.out.println("\nComparing newCopiedRangeArray & newCopeiedArray :"
				+ Arrays.equals(newCopiedArray, newCopiedRangeArray));
		System.out.println("**********************************");
		 Arrays.sort(array);
		 System.out.println("After sorting Origanal array");
		 for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
