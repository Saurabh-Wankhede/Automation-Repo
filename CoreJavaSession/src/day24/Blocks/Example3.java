package day24.Blocks;

public class Example3 {

	static {
		System.out.println("*********** I am Static Intitalization Block-1 ******************");
	}

	{
		System.out.println("$$$$$$$$$$ I am Non- Static Initallization Block-1 $$$$$$$$$$$$$$$$$$$");
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example3 ref1 = new Example3();// All non static block execute 1st time
		Example3 ref2 = new Example3();// All non static block execute 2nd time
		System.out.println("Program Ends");
	}

	Example3() {
		System.out.println("I am zero-param cons");
	}

	{
		System.out.println("$$$$$$$$$$ I am Non- Static Initallization Block-2  $$$$$$$$$$$$$$$$$$$$$");
	}

	static {
		System.out.println("*********** aI am Static Initallization Block-2 ******************");
	}
}
/*
 * Blocks: { //non-static block / Nonstatic initialization block(NSIB)/Instance
 * initialization block(IIB) }
 * 
 * static{ //static block / static initialization block(SIB) }
 * 
 * these block doesn't have name, return type, return value
 * 
 * SIB: this will be called automatically before main() we can have more than
 * one static block in a class in this case all static block will be executed in
 * sequential order before main() from static block we can initialize any
 * variable or we can call static method directly for execution
 * 
 * NSIB: this will be called automatically before constructor we can have more
 * than one nonstatic block in a class in this case all nonstatic block will be
 * executed in sequential order before constructor from nonstatic block we can
 * initialize any variable or we can call static/nonstatic method directly for
 * execution
 * 
 * 
 */
