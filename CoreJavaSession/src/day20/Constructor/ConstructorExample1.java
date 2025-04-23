package day20.Constructor;


public class ConstructorExample1 {
	//default constructor
	/*
		ConstructorExample1()
		{
			//default constructor will be written by java compiler
		}
	 */
	
	int age=10;
	void display() {
		System.out.println("I am display method");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		ConstructorExample1 ref=new ConstructorExample1();
		System.out.println("age: "+ref.age);
		ref.display();
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
