package day21.MethodOverloading;

public class Pyramid2 {

	public static void main(String[] args) {
		System.out.println("Program Start");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("***********************************************");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j  + " ");
			}
			System.out.println();
		}
		System.out.println("***********************************************");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Program End");
	}
}
