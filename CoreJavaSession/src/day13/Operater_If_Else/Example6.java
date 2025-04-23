package day13.Operater_If_Else;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=-5,y;
		y=x-- + x-- + x + ++x + x--;


		//initial=-5  + -6  + -7 + -6 + -6 //y
		//final  =-6	-7	  -7   -6   -7 //x
		
		System.out.println("y: "+y);
		System.out.println("x: "+x);
		System.out.println("Program Ends");
	}

}