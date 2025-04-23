package day36.Array_Method;

public class M_Array2 {

	public static void main(String[] args) {
		
		//Declaring and initializing 2D array
		int a[][]= {{10,20,30},{7,5},{7,8,9,4}};
		//Printing 2D array 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//row=0, col=3 || row=1, col=2 ||row=2, col=4
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
			System.out.println("*************************");
			
		char[] charArr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
