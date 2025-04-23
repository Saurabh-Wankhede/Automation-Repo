package day21.ConstructorDetails;

public class ConstructorExample3 {
	//user defined constructor
	ConstructorExample3() {
		System.out.println("Zero Param cons");
	}

	ConstructorExample3(int num) {
		System.out.println("int Param cons");
	}

	ConstructorExample3(int num, float num2) {
		System.out.println("int-float Param cons");
	}

	ConstructorExample3(boolean num, int num2) {
		System.out.println("float-int Param cons");
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1 = 10;
		float num2 = 25.6f;
		ConstructorExample3 ref1 = new ConstructorExample3(10);
		ConstructorExample3 ref2 = new ConstructorExample3();
		ConstructorExample3 ref3 = new ConstructorExample3(true, num1);
		ConstructorExample3 ref4 = new ConstructorExample3(10, 15.6f);
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
