package day9.VariableDetails;


public class Example11 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int b=10,h=20;
		double area;
		
	
		
		//area=0.5*b*h;//0*10*20=100.0
		
		//area=(1/2.0)*b*h;//0*10*20=100.0
	
		area=(1.0/2)*b*h;//0*10*20=100.0
		
		System.out.println("b: "+b);
		System.out.println("h: "+h);
		System.out.println("area: "+area);
		
		
		//area=(1/2)*b*h;//0*10*20=0.0
		
		
		System.out.println();
		System.out.println("area After doing this way area=(1/2)*b*h " );
		System.out.println();
		area=(1/2)*b*h;//0*10*20=100.0
		System.out.println("area: "+area);
		
		System.out.println("Program Ends");
	
	}
}
/*
area=(1/2)*b*h;


completenumber/completenumber=completenumber

10/5=2
21/5=4
51/7=7

incompletenumber/completenumber=incompletenumber
21.0/5=4.2
51.0/7=7.2...

completenumber/incompletenumber=incompletenumber

21/5.0=4.2
51/7.0=7.2.....
*/
