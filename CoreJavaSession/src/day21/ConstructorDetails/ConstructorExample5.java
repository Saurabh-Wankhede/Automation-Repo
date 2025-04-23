package day21.ConstructorDetails;

public class ConstructorExample5 {
	//user defined constructor
	int num1, num2 = 20;

	ConstructorExample5() {
		System.out.println("Zero Param cons");
		num1 = 35;
		num2 = 55;
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		ConstructorExample5 ref = new ConstructorExample5();
		System.out.println("num1: " + ref.num1);
		System.out.println("num2: " + ref.num2);
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