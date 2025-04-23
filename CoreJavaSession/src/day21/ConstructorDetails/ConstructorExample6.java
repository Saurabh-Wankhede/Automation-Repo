package day21.ConstructorDetails;


public class ConstructorExample6 {
	//user defined constructor
	int num1;
	double num2;
	boolean status;
	ConstructorExample6()
	{
		System.out.println("Zero Param cons");
	}
	ConstructorExample6(int n)
	{
		System.out.println("int Param cons");
		num1=n;
	}
	ConstructorExample6(int x, double y)
	{
		System.out.println("int-double Param cons");
		num1=x;
		num2=y;
	}
	ConstructorExample6(int a, double b, boolean c)
	{
		System.out.println("int-double-boolean Param cons");
		num1=a;
		num2=b;
		status=c;
	}	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		ConstructorExample6 ref5=new ConstructorExample6(25, 67,true);
		System.out.println("num1 using ref5: "+ref5.num1);//25
		System.out.println("num2 using ref5: "+ref5.num2);//67.0
		System.out.println("status using ref5: "+ref5.status);//true
		
		ConstructorExample6 ref4=new ConstructorExample6(56,23.4,true);
		System.out.println("num1 using ref4: "+ref4.num1);//56
		System.out.println("num2 using ref4: "+ref4.num2);//23.4
		System.out.println("status using ref4: "+ref4.status);//true
		
		ConstructorExample6 ref3=new ConstructorExample6(10,30.5);
		System.out.println("num1 using ref3: "+ref3.num1);//10
		System.out.println("num2 using ref3: "+ref3.num2);//30.5
		System.out.println("status using ref3: "+ref3.status);//false
		
		ConstructorExample6 ref2=new ConstructorExample6(10);
		System.out.println("num1 using ref2: "+ref2.num1);//10
		System.out.println("num2 using ref2: "+ref2.num2);//0.0
		System.out.println("status using ref2: "+ref2.status);//false
		
		ConstructorExample6 ref1=new ConstructorExample6();
		System.out.println("num1 using ref1: "+ref1.num1);//0
		System.out.println("num2 using ref1: "+ref1.num2);//0.0
		System.out.println("status using ref1: "+ref1.status);//false
		
		System.out.println("Program Ends");
	}
}
/*
Constructor:
	* its similar to method but its name should be same as class name and it won't have any return type
	* its used to initialize object/instance member
	* it will be called only when instance/object of a class is created
	* types:
		1. default constructor: when a class doesn't have any type of constructor in that case java compiler will write a constructor that will be known as default constructor.
		its won;t have parameter as well as its body will be empty
		2. user defined constructor: when programmer creates a constructor dn that will be known as user defined constructor.


*/