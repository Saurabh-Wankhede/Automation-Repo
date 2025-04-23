package day36.Array_Method;

public class M_Array1 {

	public static void main(String[] args) {

		// Declaring and initalizing 2D array
		int[][] arr = new int[3][3];// 3 row and 3 column
		System.out.println("Total row in array : " + arr.length);// row count
		System.out.println("Col in Row: " + arr[0].length);// row =0 ,cell count

		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr.length; j++) {// cell count on current row
				System.out.println(arr[i][j] + " ");// 0,0 | 0,1 |0,2 | 1,0 | 1,1 | 1,2
			}
			System.out.println();

		}
		System.out.println("***************************");

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[2][0] = 90;
		arr[2][1] = 80;
		arr[2][2] = 40;
		//Printing 2D Array
		for (int i= 0;i<arr.length;i++) {//to get row num
			for(int j=0; j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

	}
}
