package day13.Operater_If_Else;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=10,y;
		y=x++ + ++x + x + ++x + x++;
		System.out.println("y: "+y);
		System.out.println("x: "+x);
		System.out.println("************************");
		x=15;
		y=x++ + --x + x-- + ++x + x;
		
//initial=15  + 15  + 15  + 15  + 15
//final  =16    15	  14	15    15
		
		System.out.println("y: "+y);
		System.out.println("x: "+x);
		System.out.println("Program Ends");
	}

}