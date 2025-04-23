                                                                                                                                                                  package day24.Blocks;


public class Example8 {
	
	final int num1;//as this variable is declared as final, hence its value 
				  //should be initialize at the same time but if you want to initialize later dn use constructor
	
	Example8(){
		System.out.println("*********** I am zero-param ******************");
		num1=78;
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example8 ref=new Example8();
		System.out.println("Num1: "+ref.num1);
		System.out.println("Program Ends");
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

SIB:
	* this will be called automatically before main()
	* we can have more than one static block in a class in this case all static block will be executed in sequential order before main()
	* from static block we can initialize any variable or we can call static method directly for execution
	
NSIB:
	* this will be called automatically before constructor
	* we can have more than one nonstatic block in a class in this case all nonstatic block will be executed in sequential order before constructor
	* from nonstatic block we can initialize any variable or we can call static/nonstatic method directly for execution


*/
