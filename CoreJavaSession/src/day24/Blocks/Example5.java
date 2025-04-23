package day24.Blocks;

public class Example5 {
	static int num1;
	double num2;
	static {
		System.out.println("*********** I am SIB-1 ******************");
		calling();
		num1 = 55;
	}

	{
		System.out.println("########## I am NSIB-1 ###################");
		display();
		num2 = 105;
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		calling();
		Example5 ref1 = new Example5();
		ref1.display();

		
		
		System.out.println("Program Ends");
	}

	static void calling() {
		System.out.println("I am calling num1: " + num1);
	}

	void display() {
		System.out.println("I am displaying num2: " + num2);
	}
}
/*
 * Blocks: { //non-static block / Nonstatic initialization block(NSIB)/Instance
 * initialization block(IIB) }
 * 
 * static{ //static block / static initialization block(SIB) }
 * 
 * these block doesn't have name return type return value
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
