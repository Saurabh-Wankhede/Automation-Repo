package day21.MethodOverloading;

public class Pyramid3 {

	public static void main(String[] args) {

		System.out.println("Program start");
		for(int i=7;i>0;i--) {//number of lines
			for(int j=1;j<=i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("************************************");
		int n=7;
		for(int i=0;i<n;i++) {//number of lines
			for(int j=n-i;j>1;j--) {//define design
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("Program Ends");
	}
}
/*
 * 
 Wap To Print this Program
 
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
 */
 
