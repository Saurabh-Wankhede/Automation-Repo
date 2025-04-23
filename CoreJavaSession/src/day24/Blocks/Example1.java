package day24.Blocks;

public class Example1 {

	static {
		System.out.println("*********** I am Static Inintializing Block -1 ******************");
	}
	
	{
		System.out.println("########## I am Non-Static Inintializing Block-1 ###################");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 ref=new Example1();
		System.out.println("Program Ends");
	}
	
	Example1(){ //constructor
		System.out.println("I am zero-param cons");
	}
}
/*
Blocks:
	{
		//non-static block / Nonstatic initialization block(NSIB)/Instance initialization block(IIB)
	}
	
	static{
		//static block / static initialization block(SIB)
	}

these block doesn't have
	* name
	* return type
	* return value

Static Initialtion Block:
	* this will be called automatically before main()
	* we can have more than one static block in a class in this case all static block will be executed in sequential order before main()
	* from static block we can initialize any variable or we can call static method directly for execution
	
Non-Static Initialization Block:
	* this will be called automatically before constructor
	* we can have more than one nonstatic block in a class in this case all nonstatic block will be executed in sequential order before constructor
	* from nonstatic block we can initialize any variable or we can call static/nonstatic method directly for execution


*/
