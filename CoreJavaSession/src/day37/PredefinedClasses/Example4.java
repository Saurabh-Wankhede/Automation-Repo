package day37.PredefinedClasses;

class Testing {
	void maualTesting() {
		System.out.println("I am a maual Tester");
	}
}

public class Example4 {
		
		static int age =25;
		static Testing t1=new Testing();
		public static void main(String[] args) {
			
			System.out.println("Program strat ");
	
			Example4 ref = new Example4();
			ref.calling();
			System.out.println("SGV of Example4 class age is "+Example4.age);
			
			Testing t2= new Testing();
			t2.maualTesting();
			
			Example4.t1.maualTesting();
//			classname.StaticRed=fOf TestingClass.nonstaticMethodOfTestingClass
			
			System.out.println("Program End ");
			
			//classname.staticRefOfPrintStreamClass.nonstaticMethodOfPrintStreamClass
			System.err.println("I am error msg");
		
			
		}
		void calling() {
			System.out.println("I am calling from Example4 ");
		}
}
/*
 * System Class :- 
 * 			-> Its a predefined class in java belongs to java.lang.package 
 * 			-> This has mulitple useful method and static refrences Like- out, in, err 
 * 			
 * 			out - static refreance of printStrem class
 * 			in 	- static refreance of Input inputStraam class
 * 			err - static refrence of printStream class
 */
